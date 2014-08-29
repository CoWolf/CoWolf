package de.uni_stuttgart.iste.cowolf.transformation;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBException;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.RegistryFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.LoggingApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.emf.henshin.trace.impl.TraceImpl;
import org.sidiff.difference.symmetric.AttributeValueChange;
import org.sidiff.difference.symmetric.SemanticChangeSet;
import org.sidiff.difference.symmetric.SymmetricDifference;

import de.uni_stuttgart.iste.cowolf.transformation.model.Mapping;
import de.uni_stuttgart.iste.cowolf.transformation.model.Mappings;
import de.uni_stuttgart.iste.cowolf.transformation.model.Param;
import de.uni_stuttgart.iste.cowolf.transformation.model.Rule;
import de.uni_stuttgart.iste.cowolf.transformation.model.util.XMLMappingLoader;

/**
 * @author Michael Zimmermann
 * @TODO: How to get the right transformation rules (simple look up table?) and
 *        needed parameter.
 * @TODO: Decide where traces should be stored (source or target model file or
 *        separate trace file)
 * @TODO: Should the transformation be done in place or not?
 */
public abstract class AbstractTransformationManager {
    /**
     * 
     */
    protected Map<String, Mapping> mappings;
    protected Map<String, Mapping> changeMapping;
    protected Map<String, Unit> units;
    protected HenshinResourceSet rulesResourceSet = new HenshinResourceSet();

    protected URI fileURI;

    /**
     * 
     * @param source
     *            source model.
     * @param target
     *            target model.
     * @return Returns whether given source and target models are managed by
     *         this manager.
     */
    public boolean isManaged(Resource source, Resource target) {
        if ((source == null) || (target == null)) {
            return false;
        }
        if ((source.getContents() == null) || source.getContents().isEmpty()
                || (target.getContents() == null)
                || target.getContents().isEmpty()) {
            return false;
        }

        if (getManagedClass1().isAssignableFrom(
                source.getContents().get(0).getClass())
                && getManagedClass2().isAssignableFrom(
                        target.getContents().get(0).getClass())) {
            return true;
        }

        if (getManagedClass1().isAssignableFrom(
                target.getContents().get(0).getClass())
                && getManagedClass2().isAssignableFrom(
                        source.getContents().get(0).getClass())) {
            return true;
        }

        return false;

    }

    private URI buildTraceFileUri(Resource source, Resource target) {
        String[] segments = source.getURI().segments();
        String filename = segments[segments.length - 1];
        filename = filename.substring(0, filename.lastIndexOf("."));
        filename += "-"
                + target.getURI().segments()[target.getURI().segments().length - 1];
        filename = filename.substring(0, filename.lastIndexOf("."));
        filename += "." + this.getKey(source) + ".trace";
        URI traceURI = source.getURI().trimSegments(1).appendSegment("Traces")
                .appendSegment(filename);
        return traceURI;

    }

    /**
     * Return one of the root classes for the supported model.
     * 
     * @return root class of model, which can be managed with this
     *         transformation manager.
     */
    public abstract Class<?> getManagedClass1();

    /**
     * Return one of the root classes for the supported model.
     * 
     * @return root class of model, which can be managed with this
     *         transformation manager.
     */
    public abstract Class<?> getManagedClass2();

    /**
     * Performs an incremental transformation between source and target model.
     * The source model got evolved before and differences are stored in the
     * difference object.
     * 
     * @param source
     *            source model which got evolved before.
     * @param target
     *            model which should be evolved by changes in the source model.
     * @param difference
     *            contains evolution steps of the source model.
     * @param fileURI
     *            uri of the file to save.
     * @return
     * 
     */
    public Resource transform(Resource oldSource, Resource source,
            Resource target, SymmetricDifference difference, URI fileURI) {
        this.fileURI = fileURI;
        System.out.println("Loading mappings...");

        ResourceSet resSet = new ResourceSetImpl();
        resSet.getResources().add(source);
        resSet.getResources().add(target);
        Resource traces = null;
        URI traceURI = this.buildTraceFileUri(oldSource, target);
        try {
            traces = resSet.getResource(traceURI, true);
        } catch (Exception e) {
            e.printStackTrace();
            traces = resSet.createResource(traceURI);
        }

        // Load mappings
        Mappings mappingObject;
        try {
            mappingObject = XMLMappingLoader.loadMapping(this
                    .getMapping(source));
            this.mappings = mappingObject.getMapping();
            this.changeMapping = mappingObject.getChangeMapping();
            System.out.println("Found " + mappingObject.getMapping().size()
                    + " mappings.");
        } catch (JAXBException e1) {
            e1.printStackTrace();
            return null;
        }
        System.out.println("Mapping loaded for " + this.getKey(source));
        // Load rules from files in folder
        System.out.println("Load henshin rules");
        this.units = this.getHenshinRules();
        System.out.println("Number of henshin rules:" + this.units.size());

        System.out.println("Merging graphs");
        List<EGraph> graphs = new ArrayList<>();
        // initialize URI converter and update broken traces
        this.updateTraces(source, target, traces, resSet);
        traces.unload();
        try {
            traces = resSet.getResource(traceURI, true);
            EcoreUtil.resolveAll(traces);
        } catch (Exception e) {
            e.printStackTrace();
            traces = resSet.createResource(traceURI);
        }
        graphs.add(new EGraphImpl(source));
        graphs.add(new EGraphImpl(target));
        graphs.add(new EGraphImpl(traces));
        EGraph graph = this.mergeInstanceModels(graphs);
        System.out.println("Finished merging graphs.");

        if (difference != null) {
            System.out.println("Run Transformation");
            graph = this.runTransformation(graph, difference);
            System.out.println("Save result");
            try {
                Resource res = this.save(graph, source, target, traces, false);
                resSet.getResources().remove(target);
                traces.unload();
                traces = resSet.getResource(traces.getURI(), true);
                // this.updateTraces(source, res, traces, resSet);
                // EcoreUtil.resolveAll(resSet);
                traceURI = this.buildTraceFileUri(source, res);
                traces.setURI(traceURI);
                traces.save(null);
                return res;
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            System.out.println("Difference is null");
            return null;
        }
        return null;
    }
    /**
     * Builds an URI converter used to update traces to current model resources.
     * 
     * @param source
     *            source model
     * @param target
     *            target model
     */
    private void updateTraces(Resource source, Resource target,
            Resource traces, ResourceSet resSet) {
        Map<URI, URI> map = resSet.getURIConverter().getURIMap();
        map.clear();
        // TODO: check src/tgt of trace and src/tgt of models
        boolean sourceEqualToFirstClass = this.getManagedClass1()
                .isAssignableFrom(source.getContents().get(0).getClass());
        // find unresolvable proxies
        Map<EObject, Collection<Setting>> unresolvedProxies = EcoreUtil.UnresolvedProxyCrossReferencer
                .find(resSet);
        for (EObject entry : unresolvedProxies.keySet()) {
            System.out.println(EcoreUtil.getURI(entry));
            String extension = EcoreUtil.getURI(entry).fileExtension();
            if (extension.equals(source.getURI().fileExtension())) {
                if (!EcoreUtil.getURI(entry).equals(source.getURI())) {
                    resSet.getURIConverter()
                            .getURIMap()
                            .put(EcoreUtil.getURI(entry).trimFragment(),
                                    source.getURI());
                }
            } else {
                if (!EcoreUtil.getURI(entry).equals(target.getURI())) {
                    resSet.getURIConverter()
                            .getURIMap()
                            .put(EcoreUtil.getURI(entry).trimFragment(),
                                    target.getURI());
                }

            }
        }

        // find resources which are older than current element, put them in
        // converter mapping and unload them.
        Resource firstModel = null;
        Resource secondModel = null;
        if (sourceEqualToFirstClass) {
            firstModel = source;
            secondModel = target;
        } else {
            firstModel = target;
            secondModel = source;
        }
        for (EObject obj : traces.getContents()) {
            if (obj instanceof TraceImpl) {
                for (EObject src : ((TraceImpl) obj).getSource()) {
                    System.out.println(src);
                    if (!map.containsKey(EcoreUtil.getURI(src).trimFragment())
                            && !firstModel.getURI().equals(
                                    EcoreUtil.getURI(src))) {
                        resSet.getURIConverter()
                                .getURIMap()
                                .put(EcoreUtil.getURI(src).trimFragment(),
                                        firstModel.getURI());
                        if (src.eResource() != null) {
                            src.eResource().unload();
                        }
                    }
                }
                for (EObject tgt : ((TraceImpl) obj).getTarget()) {
                    System.out.println(tgt);
                    if (!map.containsKey(EcoreUtil.getURI(tgt).trimFragment())
                            && !secondModel.getURI().equals(
                                    EcoreUtil.getURI(tgt))) {
                        resSet.getURIConverter()
                                .getURIMap()
                                .put(EcoreUtil.getURI(tgt).trimFragment(),
                                        secondModel.getURI());
                        if (tgt.eResource() != null) {
                            tgt.eResource().unload();
                        }
                    }
                }
            }
        }
        for (Map.Entry<URI, URI> entry : map.entrySet()) {
            System.out
                    .println(entry.getKey() + "--------->" + entry.getValue());
        }
    }
    /**
     * Saves root of the resulting model to an output file.
     *
     * @param result
     *            graph to be saved
     * @param target
     *            resource to save
     * @param inPlace
     *            overwrite the transformed models or create a new file
     * @throws IOException
     */
    protected Resource save(EGraph result, Resource source, Resource target,
            Resource traceModel, boolean inPlace) throws IOException {
        // Save the models.
        System.out.println("Saving models...");
        System.out.println("Number of roots: " + result.getRoots().size());

        ResourceSet henshinResourceSet = traceModel.getResourceSet();
        Resource temp = new ResourceImpl(target.getURI());

        List<EObject> list = result.getRoots();

        Class<? extends EObject> targetClass = target.getContents().get(0)
                .getClass();
        traceModel.getContents().clear();
        for (EObject root : list) {
            System.out.println("root" + root);
            // root is element of target model
            if (root.getClass() == targetClass) {
                temp.getContents().add(root);
            }

            // root is a Trace and has source and target
            if (root.getClass() == TraceImpl.class) {
                int hasSource = ((TraceImpl) root).getSource().size();
                int hasTarget = ((TraceImpl) root).getTarget().size();

                if (hasSource >= 1 && hasTarget >= 1) {
                    System.out.println("added root node to contents");
                    traceModel.getContents().add(root);
                }

            }
        }

        // save all roots
        if (inPlace) {

            target.save(null);
            return target;

        } else {
            if (!this.fileURI.isPlatformResource()) {
                this.fileURI = URI.createPlatformResourceURI(this.fileURI
                        .toString().substring(1), true);
            }
            Resource res = henshinResourceSet.createResource(this.fileURI);
            res.getContents().addAll(temp.getContents());
            res.save(null);
            URI traceURI = this.buildTraceFileUri(source, res);
            traceModel.setURI(traceURI);
            traceModel.save(null);
            return res;
        }

    }
    /**
     * Transforms a provided graph with multiple rules from the provided
     * henshinFile. Multiple parameters per rule possible.
     *
     * @param graph
     *            to be transformed
     * @param henshinFile
     *            .henshin File that contains the transformation rules. Located
     *            in the base-folder specified when calling init()
     * @param rules
     *            rule names to be executed plus Hashmap of parameter to be set
     *            for that rule.
     * @return
     */
    protected EGraph runTransformation(EGraph graph,
            SymmetricDifference difference) {
        // TODO: perform only rules needed
        boolean result;
        ParameterHandler paramHandler = new ParameterHandler();

        // load each rule which has to be executed, set parameters and transform
        // the provided graph
        UnitApplication application = new UnitApplicationImpl(new EngineImpl());
        application.setEGraph(graph);
        List<SemanticChangeSet> changeSets = difference.getChangeSets();
        // execute rules one by one, order from change sets.
        List<MappingSet> mappings = new ArrayList<>();

        for (SemanticChangeSet changeSet : changeSets) {
            System.out.println(changeSet.getName());
            Mapping mapping = this.mappings.get(changeSet.getName());
            if (mapping != null) {
                MappingSet set = new MappingSet();
                set.setChangeSet(changeSet);
                set.setMapping(mapping);
                mappings.add(set);
            }
        }
        Collections.sort(mappings);
        for (org.sidiff.difference.symmetric.Change change : difference
                .getChanges()) {
            if (change instanceof AttributeValueChange) {
                AttributeValueChange avChange = (AttributeValueChange) change;
                String key = avChange.getObjA().eClass().getEPackage()
                        .getNsPrefix();
                key += "/" + avChange.getObjA().eClass().getName();
                key += "/" + avChange.getType().getName();
                Mapping mapping = this.changeMapping.get(key);
                if (mapping != null) {
                    System.out.println(mapping);
                    MappingSet set = new MappingSet();
                    set.setChange(change);
                    set.setMapping(mapping);
                    mappings.add(set);
                }
                System.out.println(key);
            }

        }

        for (MappingSet mappingSet : mappings) {
            graph = application.getEGraph();
            application = new UnitApplicationImpl(new EngineImpl());
            application.setEGraph(graph);
            Mapping mapping = mappingSet.getMapping();
            SemanticChangeSet changeSet = mappingSet.getChangeSet();
            // fetch rule/unit from mapping
            Rule rule = mapping.getRule();
            Unit unit = this.units.get(rule.getName());
            if (unit != null) {
                application.setUnit(unit);
                // traverse parameters from config object.
                for (Param param : rule.getParams().getParam()) {
                    Object value = null;
                    if (mappingSet.getChangeSet() != null) {
                        value = paramHandler
                                .getParameterValue(param, changeSet);
                    } else {
                        value = paramHandler.getParameterValue(param,
                                mappingSet.getChange());
                    }

                    String name = param.getName();
                    application.setParameterValue(name, value);
                }
                result = application.execute(new LoggingApplicationMonitor());
                System.out.println(unit.getName() + " "
                        + (result ? "successful" : "error"));
            } else {
                System.out.println("No rule found for changeset with name "
                        + changeSet.getName());
            }

        }

        return application.getEGraph();
    }

    /**
     * Returns an input stream with the mapping.
     * 
     * @return stream containing mapping.
     */
    private InputStream getMapping(Resource source) {
        IExtensionRegistry er = RegistryFactory.getRegistry();
        IExtensionPoint exPoint = er
                .getExtensionPoint("de.uni_stuttgart.iste.cowolf.transformationMappingExtension");
        for (IExtension extension : exPoint.getExtensions()) {
            for (IConfigurationElement element : extension
                    .getConfigurationElements()) {
                // select config file via extension point
                if (element.getAttribute("key").equals(this.getKey(source))) {
                    String platformString = extension.getNamespaceIdentifier()
                            + File.separator + element.getAttribute("file");
                    try {
                        URL url = new URL(URI.createPlatformPluginURI(
                                platformString, true).toString());
                        return url.openStream();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return null;
    }

    protected abstract String getKey();

    protected abstract String getReverseKey();

    /**
     * Returns the key for which a mapping at the extension point can be stored.
     * 
     * @return string identifier
     */
    protected String getKey(Resource source) {

        if (source == null || source.getContents() == null) {
            throw new IllegalArgumentException("Source should not be null.");
        } else {
            if (this.getManagedClass1().isAssignableFrom(
                    source.getContents().get(0).getClass())) {
                return this.getKey();
            } else {
                return this.getReverseKey();
            }
        }
    }

    /**
     * Merges all provided EGraphs by adding all Root elements to the first
     * Graph.
     *
     * @param models
     *            to be merged
     * @return EGraph with all Roots of the provided models
     */
    private EGraph mergeInstanceModels(List<EGraph> models) {
        if (models.size() > 0) {
            EGraph mergedGraph = models.get(0);
            models.remove(0);
            for (EGraph current : models) {
                for (EObject tree : current.getRoots()) {
                    mergedGraph.addTree(tree);
                }
            }
            return mergedGraph;
        } else {
            return null;
        }
    }

    /**
     * Returns a Map containing the henshin rules with their name as identifier.
     * 
     * @return
     */
    private Map<String, Unit> getHenshinRules() {
        Map<String, Unit> units = new HashMap<>();
        for (Mapping mapping : this.mappings.values()) {
            URI uri = URI.createURI(mapping.getRule().getPath());
            Module module = this.rulesResourceSet.getModule(uri, true);
            for (Unit unit : module.getUnits()) {
                units.put(unit.getName(), unit);
            }
        }
        return units;
    }
}
