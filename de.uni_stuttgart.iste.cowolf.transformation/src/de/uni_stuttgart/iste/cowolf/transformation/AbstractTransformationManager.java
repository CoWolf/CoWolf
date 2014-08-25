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
		
		if (getManagedClass1().isAssignableFrom(source.getContents().get(0).getClass()) 
				&& getManagedClass2().isAssignableFrom(target.getContents().get(0).getClass())) {
			return true;
		}

		if (getManagedClass1().isAssignableFrom(target.getContents().get(0).getClass()) 
				&& getManagedClass2().isAssignableFrom(source.getContents().get(0).getClass())) {
			return true;
		}

		return false;
	}

	/**
	 * Return one of the root classes for the supported model.
	 * @return root class of model, which can be managed with this transformation manager.
	 */
	public abstract Class<?> getManagedClass1();

	/**
	 * Return one of the root classes for the supported model.
	 * @return root class of model, which can be managed with this transformation manager.
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
    public Resource transform(Resource source, Resource target,
            SymmetricDifference difference, URI fileURI) {
        this.fileURI = fileURI;
        System.out.println("Loading mappings...");

        // Load mappings
        Mappings mappingObject;
        try {
            mappingObject = XMLMappingLoader.loadMapping(this.getMapping());
            this.mappings = mappingObject.getMapping();
            System.out.println("Found " + mappingObject.getMapping().size()
                    + " mappings.");
        } catch (JAXBException e1) {
            e1.printStackTrace();
            return null;
        }
        // Load rules from files in folder
        System.out.println("Load henshin rules");
        this.units = this.getHenshinRules();
        System.out.println("Number of henshin rules:" + this.units.size());

        System.out.println("Merging graphs");
        List<EGraph> graphs = new ArrayList<>();

        // find broken proxy references and remove them from resource set
        List<Resource> toRemove = new ArrayList<>();
        for (int index = 0; index < target.getResourceSet().getResources()
                .size(); index++) {
            Resource res = target.getResourceSet().getResources().get(index);
            if (!res.isLoaded() || res.getErrors().size() > 0) {
                toRemove.add(res);
            }
        }
        target.getResourceSet().getResources().removeAll(toRemove);

        // initialize URI converter
        this.updateTraces(source, target);

        graphs.add(new EGraphImpl(source));
        graphs.add(new EGraphImpl(target));
        EGraph graph = this.mergeInstanceModels(graphs);
        System.out.println("Finished merging graphs.");

        if (difference != null) {
            System.out.println("Run Transformation");
            graph = this.runTransformation(graph, difference);
            System.out.println("Save result");
            try {
                return this.save(graph, target, false);
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
    private void updateTraces(Resource source, Resource target) {
        Map<URI, URI> map = target.getResourceSet().getURIConverter()
                .getURIMap();

        // find unresolvable proxies
        Map<EObject, Collection<Setting>> unresolvedProxies = EcoreUtil.UnresolvedProxyCrossReferencer
                .find(target.getResourceSet());
        for (EObject entry : unresolvedProxies.keySet()) {
            target.getResourceSet()
                    .getURIConverter()
                    .getURIMap()
                    .put(EcoreUtil.getURI(entry).trimFragment(),
                            source.getURI());
        }

        // find resources which are older than current element, put them in
        // converter mapping and unload them.
        for (EObject obj : target.getContents()) {
            if (obj instanceof TraceImpl) {
                for (EObject src : ((TraceImpl) obj).getSource()) {
                    if (!src.eIsProxy()
                            && !map.containsKey(src.eResource().getURI())) {
                        target.getResourceSet().getURIConverter().getURIMap()
                                .put(src.eResource().getURI(), source.getURI());
                        src.eResource().unload();
                    }

                }
            }
        }

        // resolve resources
        EcoreUtil.resolveAll(target.getResourceSet());

        // update uri of outdated resources
        for (Resource res : target.getResourceSet().getResources()) {
            if (map.containsKey(res.getURI())) {
                res.setURI(map.get(res.getURI()));
            }
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
    protected Resource save(EGraph result, Resource target, boolean inPlace)
            throws IOException {
        // Save the models.
        System.out.println("Saving models...");
        System.out.println("Number of roots: " + result.getRoots().size());

        ResourceSet henshinResourceSet = target.getResourceSet();
        // TODO: decide where traces should be stored (source or target model
        // file or separate trace file).
        // TODO: Transformation in place or not?
        Resource temp = new ResourceImpl(target.getURI());

        List<EObject> list = result.getRoots();

        Class<? extends EObject> targetClass = target.getContents().get(0)
                .getClass();

        for (EObject root : list) {
            // root is element of target model
            if (root.getClass() == targetClass) {

                temp.getContents().add(root);

            }

            // root is a Trace and has source and target
            if (root.getClass() == TraceImpl.class) {
                int hasSource = ((TraceImpl) root).getSource().size();
                int hasTarget = ((TraceImpl) root).getTarget().size();

                if (hasSource >= 1 && hasTarget >= 1) {

                    temp.getContents().add(root);
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
            Mapping mapping = this.mappings.get(changeSet.getName());
            if (mapping != null) {
                MappingSet set = new MappingSet();
                set.setChangeSet(changeSet);
                set.setMapping(mapping);
                mappings.add(set);
            }
        }
        Collections.sort(mappings);
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
                    Object value = paramHandler.getParameterValue(param,
                            changeSet);
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
    private InputStream getMapping() {
        IExtensionRegistry er = RegistryFactory.getRegistry();
        IExtensionPoint exPoint = er
                .getExtensionPoint("de.uni_stuttgart.iste.cowolf.transformationMappingExtension");
        for (IExtension extension : exPoint.getExtensions()) {
            for (IConfigurationElement element : extension
                    .getConfigurationElements()) {
                // select config file via extension point
                if (element.getAttribute("key").equals(this.getKey())) {
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
    /**
     * Returns the key for which a mapping at the extension point can be stored.
     * 
     * @return string identifier
     */
    protected abstract String getKey();

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
        File ruleDirectory = this.getRuleDirectory();
        List<File> henshinFiles = new ArrayList<>();
        if (!ruleDirectory.isDirectory()) {
            System.out.println("No directory selected.");
            return null;
        }
        for (File henshinFile : ruleDirectory.listFiles()) {
            //
            String extension = "";
            String fileName = henshinFile.toString();
            int i = fileName.lastIndexOf('.');
            if (i > 0) {
                extension = fileName.substring(i + 1);
            }
            if (!henshinFile.isDirectory() && extension.equals("henshin")) {
                henshinFiles.add(henshinFile);
            }
        }
        for (File henshinFile : henshinFiles) {
            System.out.println(henshinFile.getPath());
            Module module = this.rulesResourceSet.getModule(
                    henshinFile.getPath(), true);
            for (Unit unit : module.getUnits()) {
                units.put(unit.getName(), unit);
            }
        }
        return units;
    }
    /**
     * Returns the directory containing the rule files.
     * 
     * TODO: will be later replaced by path in transformation mapping file.
     * 
     * @return directory as file
     */
    protected abstract File getRuleDirectory();
}
