package de.uni_stuttgart.iste.cowolf.transformation;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
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
import org.eclipse.emf.common.util.BasicEList;
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
import org.eclipse.emf.henshin.trace.Trace;
import org.eclipse.emf.henshin.trace.impl.TraceImpl;
import org.sidiff.difference.symmetric.AttributeValueChange;
import org.sidiff.difference.symmetric.Change;
import org.sidiff.difference.symmetric.SemanticChangeSet;
import org.sidiff.difference.symmetric.SymmetricDifference;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion;
import de.uni_stuttgart.iste.cowolf.evolution.AbstractEvolutionManager;
import de.uni_stuttgart.iste.cowolf.evolution.EvolutionException;
import de.uni_stuttgart.iste.cowolf.evolution.EvolutionRegistry;
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
     * Mapping between difference name and mapping object containing
     * {@link SemanticChangeSet}.
     */
    protected Map<String, Mapping> mappings;
    /**
     * Mapping between difference name and mapping object containing
     * {@link Change}
     */
    protected Map<String, Mapping> changeMapping;
    /**
     * Map containing all Henshin units. Key: Name of the unit.
     */
    protected Map<String, Unit> units;

    /**
     * URI of the result file.
     */
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
        
        return isManaged(source.getContents().get(0).getClass(), target.getContents().get(0).getClass());

    }
    
    public boolean isManaged(Class<?> source, Class<?> target) {
    	
    	if (getManagedClass1().isAssignableFrom(source)
                && getManagedClass2().isAssignableFrom(target)) {
            return true;
        }

        if (getManagedClass1().isAssignableFrom(target)
                && getManagedClass2().isAssignableFrom(source)) {
            return true;
        }
    	
    	return false;
    }

    /**
     * Builds uri of the trace file based on source and target model.
     * 
     * @param source
     * @param target
     * @return
     */
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

    public ModelVersion transform(Model sourceModel, Model targetModel) {
    	
    	if (!sourceModel.getParent().equals(targetModel.getParent())) {
    		throw new InvalidParameterException("Models must be in the same project");
    	}
    	
        Association latest = sourceModel.getLatestAssociationTo(targetModel);
        
        // per default, use initial version (directly after creation of file) as base.
        ModelVersion oldSourceVersion = sourceModel.getVersions().get(0);
        ModelVersion sourceVersion;
        
        if (latest != null) {
	        
	        for (ModelVersion version : latest.getSource()) {
	        	if (version.getModel().equals(sourceModel)) {
	        		oldSourceVersion = version;
	        		break;
	        	}
	        }
        }
        
        
        // Create new version if there are changes in the model, else use latest.
        if (sourceModel.hasChanges()) {
        	sourceVersion = sourceModel.createVersion();
        } else {
        	sourceVersion = sourceModel.getVersions().get(sourceModel.getVersions().size()-1);
        }
        
        // Break if there are no changes since the last transformation (old == current)
        if (oldSourceVersion.equals(sourceVersion)) {
        	for (ModelVersion version : latest.getTarget()) {
	        	if (version.getModel().equals(targetModel)) {
	        		return version;
	        	}
	        }
        	return null;
        }
        
        // Create backup version for target model if needed.
        if (targetModel.hasChanges()) {
        	targetModel.createVersion();
        }
        
        // Got all needed versions.
        
        ResourceSet transResSet = generateTransformationResources(oldSourceVersion.getResource(),
        															sourceVersion.getResource(),
        															targetModel.getResource(),
        															latest);
        
        Resource sourceRes = transResSet.getResources().get(0);
        
        for (Resource res : transResSet.getResources()) {
        	System.out.println(res.getURI().toString()+ ": " + Arrays.toString(res.getContents().toArray()));
        }
        
        //Get evolution between old and new source.
        AbstractEvolutionManager evolutionManager = EvolutionRegistry.getInstance().getEvolutionManager(sourceRes);
        SymmetricDifference difference;
        try {
			difference = evolutionManager.evolve(
					transResSet.getResource(URI.createURI("transform:old"), false),
					sourceRes);
		} catch (EvolutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
        
        transResSet.createResource(URI.createURI("transform:diff")).getContents().add(difference);
        
        //load mapping
        Mappings mappingObject;
        try {
            mappingObject = XMLMappingLoader.loadMapping(this.getMapping(sourceRes));
            this.mappings = mappingObject.getMapping();
            this.changeMapping = mappingObject.getChangeMapping();
            System.out.println("Found " + mappingObject.getMapping().size()
                    + " mappings.");
        } catch (JAXBException e1) {
            e1.printStackTrace();
            return null;
        }
        System.out.println("Mapping loaded for " + this.getKey(sourceRes));
        // Load rules from files in folder
        System.out.println("Load henshin rules");
        this.units = this.getHenshinRules();
        System.out.println("Number of henshin rules:" + this.units.size());

        ArrayList<EGraph> graphSources = new ArrayList<EGraph>(4);
        
//        for (Resource res : transResSet.getResources()) {
//        	if (res.getURI().toString().equals("transform:old")) {
//        		continue;
//        	}
//        	graphSources.add(new EGraphImpl(res));
//        }
        Resource traceRes = transResSet.getResource(URI.createURI("traces"), false);
        graphSources.add(new EGraphImpl(transResSet.getResource(URI.createURI("transform:diff"), false)));
        if (traceRes != null && traceRes.getContents().size() > 0) {
        	graphSources.add(new EGraphImpl(traceRes));
        } else {
        	graphSources.add(new EGraphImpl(transResSet.getResource(URI.createURI("transform:source"), false)));
        	graphSources.add(new EGraphImpl(transResSet.getResource(URI.createURI("transform:target"), false)));
        }
        //graphSources.add(new EGraphImpl(transResSet.getResource(URI.createURI("transform:old"), false)));
//        //graphSources.add(new EGraphImpl(newTraces));
//        if (latest != null) {
//        	graphSources.add(new EGraphImpl(EcoreUtil.copyAll(latest.getTraces())));
//        }
        //graphSources.add(new EGraphImpl(difference));
        EGraph graph = mergeInstanceModels(graphSources);
        
        for (EObject o : graph.getRoots()) {
        	System.out.println(o);
        }
        
        System.out.println("Finished merging graphs.");

        if (difference != null) {
            System.out.println("Run Transformation");
            graph = this.runTransformation(graph, difference);
            System.out.println("Save result");
            
            ModelVersion newTargetVersion = null;
            try {
            	Resource traces = transResSet.createResource(URI.createURI("transform:newTraces"));
            	Resource targetRes = targetModel.getResource();
                this.setResult(graph, sourceRes, targetRes, traces);
                
                System.out.println("targetRes size: " + targetRes.getContents().size());
                System.out.println("targetRes class: " + targetRes.getContents().get(0).getClass().getName());
                
                targetRes.save(Collections.EMPTY_MAP);
                targetRes.unload();
                
                newTargetVersion = targetModel.createVersion();
                
                Association newAssoc = sourceModel.getParent().registerAssociation();
                BasicEList<Trace> tl = new BasicEList<Trace>();
                for (EObject o : traces.getContents()) {
                	if (o instanceof Trace) {
                		tl.add((Trace) o);
                	}
                }
                newAssoc.getTraces().addAll(tl);
                newAssoc.getSource().add(sourceVersion);
                newAssoc.getTarget().add(newTargetVersion);
                
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            return newTargetVersion;
        } else {
            System.out.println("Difference is null");
            return null;
        }
    }
    
    
    
    private ResourceSet generateTransformationResources(Resource oldSourceRes,
			Resource sourceRes, Resource targetRes, Association latest) {
    	ResourceSet set = new ResourceSetImpl();
    	if (oldSourceRes.getContents().size() <= 0) {
    		return set;
    	}
    	
    	URI sourceURI;
    	URI targetURI;
    	if (this.getManagedClass1().isAssignableFrom(oldSourceRes.getContents().get(0).getClass())) {
    		sourceURI = URI.createURI("transform:source");
    		targetURI = URI.createURI("transform:target");
    	} else {
    		sourceURI = URI.createURI("transform:target");
    		targetURI = URI.createURI("transform:source");
    	}
    	
    	System.out.println("Target content");
    	for (EObject o : targetRes.getContents()) {
    		System.out.println(o);
    	}
    				
    	
	
		Resource source = set.createResource(sourceURI);
		source.getContents().addAll(EcoreUtil.copyAll(sourceRes.getContents()));
		Resource target = set.createResource(targetURI);
		target.getContents().addAll(EcoreUtil.copyAll(targetRes.getContents()));
		
    	
    	if (latest != null) {
    		set.createResource(URI.createURI("traces")).getContents().addAll(new BasicEList<>(EcoreUtil.copyAll(latest.getTraces())));
    		
//    		EList<Trace> traces = new BasicEList<>(EcoreUtil.copyAll(latest.getTraces()));
//    		ResourceSet oldSet = new ResourceSetImpl();
//    		oldSet.createResource(URI.createURI("oldTraces")).getContents().addAll(traces);
//    		Resource oldRes = oldSet.createResource(sourceURI);
//    		oldRes.getContents().addAll(EcoreUtil.copyAll(oldSourceRes.getContents()));
//    		oldRes.setURI(URI.createURI("transform:old"));
//
//    		set.getResources().addAll(oldSet.getResources());
    	}// else {
    		set.createResource(URI.createURI("transform:old")).getContents().addAll(EcoreUtil.copyAll(oldSourceRes.getContents()));
    	//}
    	
    	return set;
	}

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

        // build resource set first time.
        ResourceSet resSet = new ResourceSetImpl();
        resSet.getResources().add(oldSource);
        resSet.getResources().add(source);
        resSet.getResources().add(target);
        Resource traces = null;
        URI traceURI = this.buildTraceFileUri(oldSource, target);
        try {
            traces = resSet.getResource(traceURI, true);
        } catch (Exception e) {
            System.out.println("traces file could not be found.");
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
        
        Resource oldTraces = resSet.createResource(URI.createURI("oldTraces"));
        oldTraces.getContents().addAll(traces.getContents());

        // initialize URI converter and update broken traces (trace references
        // point to current model afterwards)
        this.updateTraces(source, target, traces, resSet);
        // update traces. done by first unloading traces resource and reloaded
        // after that.
        // URIConverter of the resource set now does the work by pointing
        // references to current source and target model.
        traces.unload();
        try {
            traces = resSet.getResource(traceURI, true);
            EcoreUtil.resolveAll(traces);
        } catch (Exception e) {
            System.out.println("traces file could not be found.");
            traces = resSet.createResource(traceURI);
        }

        // init henshin graph
        graphs.add(new EGraphImpl(oldSource));
        graphs.add(new EGraphImpl(source));
        graphs.add(new EGraphImpl(target));
        graphs.add(new EGraphImpl(oldTraces));
        graphs.add(new EGraphImpl(traces));
        EGraph graph = this.mergeInstanceModels(graphs);
        graph.add(difference);
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
        URI sourceURI = source.getURI();
        URI targetURI = target.getURI();
        Map<URI, URI> map = resSet.getURIConverter().getURIMap();
        map.clear();
        boolean sourceEqualToFirstClass = this.getManagedClass1()
                .isAssignableFrom(source.getContents().get(0).getClass());

        // find unresolvable proxies
        Map<EObject, Collection<Setting>> unresolvedProxies = EcoreUtil.UnresolvedProxyCrossReferencer
                .find(resSet);
        for (EObject entry : unresolvedProxies.keySet()) {
            URI entryURI = EcoreUtil.getURI(entry);
            String extension = entryURI.fileExtension();
            if (extension.equals(sourceURI.fileExtension())) {
                if (!entryURI.equals(sourceURI)) {
                    map.put(entryURI.trimFragment(), sourceURI);
                }
            } else {
                if (!entryURI.equals(targetURI)) {
                    map.put(entryURI.trimFragment(), targetURI);
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
        // update trace source and target references
        for (EObject obj : traces.getContents()) {
            if (obj instanceof TraceImpl) {
                for (EObject src : ((TraceImpl) obj).getSource()) {
                    URI srcURI = EcoreUtil.getURI(src);
                    if (!map.containsKey(srcURI.trimFragment())
                            && !firstModel.getURI().equals(srcURI)) {
                        map.put(srcURI.trimFragment(), firstModel.getURI());
                        if (src.eResource() != null) {
                            src.eResource().unload();
                        }
                    }
                }
                for (EObject tgt : ((TraceImpl) obj).getTarget()) {
                    URI tgtURI = EcoreUtil.getURI(tgt);
                    if (!map.containsKey(tgtURI.trimFragment())
                            && !secondModel.getURI().equals(tgtURI)) {
                        map.put(tgtURI.trimFragment(), secondModel.getURI());
                        if (tgt.eResource() != null) {
                            tgt.eResource().unload();
                        }
                    }
                }
            }
        }
        for (Map.Entry<URI, URI> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " ---------> "
                    + entry.getValue());
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
            // root is element of target model
            if (root.getClass() == targetClass) {
                temp.getContents().add(root);
            }

            // root is a Trace and has source and target
            if (root.getClass() == TraceImpl.class) {
                int hasSource = ((TraceImpl) root).getSource().size();
                int hasTarget = ((TraceImpl) root).getTarget().size();

                if (hasSource >= 1 && hasTarget >= 1) {
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
     * Saves root of the resulting model to an output file.
     *
     * @param result
     *            graph to be saved
     * @param target
     *            resource to save
     * @param inPlace
     *            overwrite the transformed models or create a new file
     * @return 
     * @throws IOException
     */
    protected Resource setResult(EGraph result, Resource source, Resource target, Resource traces) throws IOException {
        // Save the models.
        System.out.println("Saving models...");
        System.out.println("Number of roots: " + result.getRoots().size());

        traces.getContents().clear();

        List<EObject> list = result.getRoots();

        Class<? extends EObject> targetClass = target.getContents().get(0).getClass();
        
        
        target.getContents().clear();
        for (EObject root : list) {
        	System.out.println(root);
            // root is element of target model
            if (root.getClass() == targetClass) {
                target.getContents().add(EcoreUtil.copy(root));
            }

            // root is a Trace and has source and target
            else if (root instanceof Trace) {
                int hasSource = ((Trace) root).getSource().size();
                int hasTarget = ((Trace) root).getTarget().size();

                if (hasSource >= 1 && hasTarget >= 1) {
                	System.out.println("Add trace " + Arrays.toString(((Trace) root).getSource().toArray())
                			+  Arrays.toString(((Trace) root).getTarget().toArray()));
                    traces.getContents().add(root);
                }

            }
        }
        
        Resource temp = new ResourceSetImpl().createResource(URI.createURI(target.getURI().toString() + ".graph"));
        temp.getContents().clear();
        temp.getContents().addAll(EcoreUtil.copyAll(result.getRoots()));
        temp.save(Collections.EMPTY_MAP);
        
        return target;
        
        

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
        // sort mappings according to priority.
        Collections.sort(mappings);
        // add changes, are not affected by priorities.
        for (org.sidiff.difference.symmetric.Change change : difference
                .getChanges()) {
            if (change instanceof AttributeValueChange) {
                AttributeValueChange avChange = (AttributeValueChange) change;
                // build key to identify change
                String key = avChange.getObjA().eClass().getEPackage()
                        .getNsPrefix();
                key += "/" + avChange.getObjA().eClass().getName();
                key += "/" + avChange.getType().getName();
                Mapping mapping = this.changeMapping.get(key);
                if (mapping != null) {
                    MappingSet set = new MappingSet();
                    set.setChange(change);
                    set.setMapping(mapping);
                    mappings.add(set);
                }
                System.out.println(key);
            }

        }
        // perform transformation.
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
            	System.out.println(unit.getName() + ":");
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
                    if (value == null) {
                        throw new IllegalArgumentException("Parameter " + name
                                + " is set to null");
                    }
                    application.setParameterValue(name, value);
                    System.out.println(name +" -> " + value);
                }
                result = application.execute(new LoggingApplicationMonitor());
                System.out.println(" "
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
            HenshinResourceSet rulesResourceSet = new HenshinResourceSet();
            Module module = rulesResourceSet.getModule(uri, true);
            for (Unit unit : module.getUnits()) {
                units.put(unit.getName(), unit);
            }
        }
        return units;
    }
}
