package de.uni_stuttgart.iste.cowolf.transformation;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.ArrayList;
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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
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
import org.eclipse.emf.henshin.trace.TracePackage;
import org.sidiff.difference.symmetric.AttributeValueChange;
import org.sidiff.difference.symmetric.SemanticChangeSet;
import org.sidiff.difference.symmetric.SymmetricDifference;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociation;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationFactory;
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
 * 
 */
public abstract class AbstractTransformationManager {
    protected static final URI RESOURCE_URL_OLDTRACES 	= URI.createURI("transform:oldtraces");
	protected static final URI RESOURCE_URL_TARGET 		= URI.createURI("transform:target");
	protected static final URI RESOURCE_URL_RESULT 		= URI.createURI("transform:result");
	protected static final URI RESOURCE_URL_SOURCE 		= URI.createURI("transform:source");
	protected static final URI RESOURCE_URL_TRACES 		= URI.createURI("transform:traces");
	protected static final URI RESOURCE_URL_DIFF 		= URI.createURI("transform:diff");
	protected static final URI RESOURCE_URL_OLD 		= URI.createURI("transform:old");


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
     * Start the transformation between two models.
     * 
     * @param sourceModel The source model.
     * @param targetModel The target model.
     * 
     * @return The new target model version.
     * @throws InvalidParameterException if there is a problem with one of the models.
     */
    public final ModelVersion transform(Model sourceModel, Model targetModel) throws InvalidParameterException {
    	
    	if (sourceModel == null || targetModel == null) {
    		throw new InvalidParameterException("One or both models are null");
    	}
    	
    	if (sourceModel.getParent() == null || targetModel.getParent() == null) {
    		throw new InvalidParameterException("Could not get model project.");
    	}
    	
    	if (!sourceModel.getParent().equals(targetModel.getParent())) {
    		throw new InvalidParameterException("Models must be in the same project");
    	}
    	
        Association latestTo = sourceModel.getLatestAssociationTo(targetModel);
        Association latestFrom = sourceModel.getLatestAssociationFrom(targetModel);
        
        // per default, use initial version (directly after creation of file) as base.
        ModelVersion oldSourceVersion = sourceModel.getVersions().get(0);
        ModelVersion sourceVersion;
        
        Association latest = null;
        
        if (latestTo != null && (latestFrom == null || latestTo.getTimestamp() > latestFrom.getTimestamp())) {
    		latest = latestTo;
	        for (ModelVersion version : latestTo.getSource()) {
	        	if (version.getModel().equals(sourceModel)) {
	        		oldSourceVersion = version;
	        		break;
	        	}
	        }
        } else if (latestFrom != null) {
        	latest = latestTo;
	        for (ModelVersion version : latestTo.getTarget()) {
	        	if (version.getModel().equals(sourceModel)) {
	        		oldSourceVersion = version;
	        		break;
	        	}
	        }
        }
        
        
        // Create new version if there are changes in the model, else use latest.
        if (sourceModel.hasChanges()) {
        	sourceVersion = sourceModel.createVersion("Save changes for co-evolution.");
        } else {
        	sourceVersion = sourceModel.getVersions().get(sourceModel.getVersions().size()-1);
        }
        
        // Break if there are no changes since the last transformation (old == current)
        if (oldSourceVersion.equals(sourceVersion)) {
        	System.out.println("No changes in source model.");
        	for (ModelVersion version : latest.getTarget()) {
	        	if (version.getModel().equals(targetModel)) {
	        		return version;
	        	} else if (version.getModel().equals(sourceModel)) {
	        		break;
	        	}
	        }
        	for (ModelVersion version : latest.getSource()) {
	        	if (version.getModel().equals(targetModel)) {
	        		return version;
	        	} else if (version.getModel().equals(sourceModel)) {
	        		break;
	        	}
	        }
        	return null;
        }
        
        // Create backup version for target model if needed.
        if (targetModel.hasChanges()) {
        	targetModel.createVersion("Backup changes before co-evolution from " + targetModel.getModel());
        }
        
        // Got all needed versions.
        
        ResourceSet transResSet = generateTransformationResources(oldSourceVersion.getResource(),
        															sourceVersion.getResource(),
        															targetModel.getResource(),
        															latest);
        
        Resource sourceRes = transResSet.getResource(this.getSourceUri(transResSet), false);
        
        //Get evolution between old and new source.
        AbstractEvolutionManager evolutionManager = EvolutionRegistry.getInstance().getEvolutionManager(sourceRes);
        SymmetricDifference difference;
        try {
			difference = evolutionManager.evolve(
					transResSet.getResource(RESOURCE_URL_OLD, false),
					sourceRes);
		} catch (EvolutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
        
        if (difference == null || difference.getChanges().size() <= 0) {
            System.out.println("Difference is null.");
            return null;
        }
        
        transResSet.createResource(RESOURCE_URL_DIFF).getContents().add(difference);
        
        System.out.println("Run Transformation");
        
        if (!this.runTransformation(transResSet, difference)) {
        	System.out.println("Transformation failed.");
        	return null;
        }
        
        return saveTransformationResult(sourceModel, sourceVersion,
				targetModel, transResSet);
    }

	protected boolean runTransformation(ResourceSet resSet, SymmetricDifference difference) {
    	
		
    	EGraph graph = this.runMappingTransformation(resSet, difference);
    	
    	if (graph == null) {
    		return false;
    	}
    	
		this.extractResultFromGraph(graph, resSet);
		
		return true;
	}

	/**
	 * Transforms a provided graph with multiple rules from the provided
	 * henshinFile. Multiple parameters per rule possible.
	 *
	 * @param graph The ECore graph to work on
	 * @param difference the changes in the source model
	 * 
	 * @return
	 */
	protected final EGraph runMappingTransformation(ResourceSet resSet, SymmetricDifference difference) {
	    boolean result;
	    ParameterHandler paramHandler = new ParameterHandler();
	    
	    Mappings mappingObject;
	    
	    // Mapping between difference name and mapping object containing
	    Map<String, Mapping> changeMapping;
		
	    // Mapping between difference name and mapping object containing
	    Map<String, Mapping> mappings;
        
	    try {
            mappingObject = XMLMappingLoader.loadMapping(this.getMappingStream(resSet.getResource(this.getSourceUri(resSet), false)));
            mappings = mappingObject.getMapping();
            changeMapping = mappingObject.getChangeMapping();
            System.out.println("Found " + mappingObject.getMapping().size()
                    + " mappings.");
        } catch (JAXBException e1) {
            e1.printStackTrace();
            return null;
        }
        
        System.out.println("Mapping loaded.");
        // Load rules from files in folder
        System.out.println("Load henshin rules...");
        
        // Map containing all Henshin units. Key: Name of the unit.
        Map<String, Unit> units = this.getHenshinRules(mappings);
        
        System.out.println("Number of henshin rules:" + units.size());
        
        EGraph graph = generateGraph(resSet);
	
	    // load each rule which has to be executed, set parameters and transform
	    // the provided graph
	    UnitApplication application = new UnitApplicationImpl(new EngineImpl());
	    application.setEGraph(graph);
	    List<SemanticChangeSet> changeSets = difference.getChangeSets();
	    // execute rules one by one, order from change sets.
	    List<MappingSet> sortedMappings = new ArrayList<>();
	
	    for (SemanticChangeSet changeSet : changeSets) {
	        System.out.println(changeSet.getName());
	        Mapping mapping = mappings.get(changeSet.getName());
	        if (mapping != null) {
	            MappingSet mapSet = new MappingSet();
	            mapSet.setChangeSet(changeSet);
	            mapSet.setMapping(mapping);
	            sortedMappings.add(mapSet);
	        }
	    }
	    // sort mappings according to priority.
	    Collections.sort(sortedMappings);
	    
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
	            Mapping mapping = changeMapping.get(key);
	            if (mapping != null) {
	                MappingSet mapSet = new MappingSet();
	                mapSet.setChange(change);
	                mapSet.setMapping(mapping);
	                sortedMappings.add(mapSet);
	            }
	            System.out.println(key);
	        }
	
	    }
	    
	    // perform transformation.
	    for (MappingSet mappingSet : sortedMappings) {
	        graph = application.getEGraph();
	        application = new UnitApplicationImpl(new EngineImpl());
	        application.setEGraph(graph);
	        Mapping mapping = mappingSet.getMapping();
	        SemanticChangeSet changeSet = mappingSet.getChangeSet();
	        // fetch rule/unit from mapping
	        Rule rule = mapping.getRule();
	        Unit unit = units.get(rule.getName());
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

	protected final EGraph generateGraph(ResourceSet transResSet) {
		ArrayList<EGraph> graphSources = new ArrayList<EGraph>(4);
        
		Resource traceRes = transResSet.getResource(RESOURCE_URL_TRACES, false);
		Resource traceOldRes = transResSet.getResource(RESOURCE_URL_OLDTRACES, false);
        graphSources.add(new EGraphImpl(transResSet.getResource(RESOURCE_URL_DIFF, false)));
        
        if (traceRes == null || traceRes.getContents().size() == 0) {
        	graphSources.add(new EGraphImpl(transResSet.getResource(RESOURCE_URL_SOURCE, false)));
        } else {
        	graphSources.add(new EGraphImpl(traceRes));
        }
        
        if (traceOldRes != null) {
        	graphSources.add(new EGraphImpl(traceOldRes));
        }
	
		if ((traceRes == null && traceOldRes == null)
				|| (traceRes.getContents().size() == 0 && traceOldRes.getContents().size() == 0)) {
        	graphSources.add(new EGraphImpl(transResSet.getResource(RESOURCE_URL_TARGET, false)));
        }
        
        EGraph graph = mergeInstanceModels(graphSources);
        
        System.out.println("Finished merging graphs.");
		return graph;
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
    		sourceURI = RESOURCE_URL_SOURCE;
    		targetURI = RESOURCE_URL_TARGET;
    	} else {
    		sourceURI = RESOURCE_URL_TARGET;
    		targetURI = RESOURCE_URL_SOURCE;
    	}    	
	
		Resource source = set.createResource(sourceURI);
		source.getContents().addAll(EcoreUtil.copyAll(sourceRes.getContents()));
		Resource target = set.createResource(targetURI);
		target.getContents().addAll(EcoreUtil.copyAll(targetRes.getContents()));
		
		set.createResource(RESOURCE_URL_OLD).getContents().addAll(
				EcoreUtil.copyAll(oldSourceRes.getContents()
		));
    	
    	if (latest != null) {
    		Resource newTraces = set.createResource(RESOURCE_URL_TRACES);
    		this.resolveTraceSource(latest.getTraces(), newTraces, set, sourceURI);
    	
	    	Resource oldTraces = set.createResource(RESOURCE_URL_OLDTRACES);
	    	this.resolveTraceSource(latest.getTraces(), oldTraces, set, RESOURCE_URL_OLD);
    	}
    	
    	return set;
	}
	
	/**
	 * Resolves a list of traces to the source resource.
	 * 
	 * traceResource and source resource (against) must be part of the resource set.
	 * 
	 * @param traces input list of traces
	 * @param traceResource output resource to save resolved traces in
	 * @param set The resource set to work on
	 * @param against The URI of the source resource to resolve against. 
	 */
	@SuppressWarnings("unchecked")
	protected void resolveTraceSource(EList<Trace> traces, Resource traceResource, ResourceSet set, URI against) {
		
		traceResource.getContents().clear();
		
		if (traces == null) {
			return;
		}
		
		for (Trace trace : traces) {
    		Trace newTrace = EcoreUtil.copy(trace);
    		
    		EReference field;
    		if (this.getManagedClass1().isAssignableFrom(set.getResource(against, false).getContents().get(0).getClass())) {
    			field = TracePackage.eINSTANCE.getTrace_Source();
    		} else {
    			field = TracePackage.eINSTANCE.getTrace_Target();
    		}
    		
    		((EList<EObject>) newTrace.eGet(field, false)).clear();
    		for (EObject o : ((EList<EObject>) trace.eGet(field, false))) {
				URI uri = URI.createURI(against.toString() + "#" + EcoreUtil.getURI(o).fragment());
				EObject corres = set.getEObject(uri, false);
				if (corres != null) {
					((EList<EObject>) newTrace.eGet(field, false)).add(corres);
				}
    		}
			
    		if (((EList<EObject>) newTrace.eGet(field, false)).size() > 0) {
    			traceResource.getContents().add(newTrace);
    		}
    	}
		
		if (System.getenv("COWOLF_DEBUG") != null) {
			System.out.println("Traces (Resolved for " + against.toString() + ")");
			for (EObject dobj : traceResource.getContents()) {
				Trace dtrace = (Trace) dobj;
				System.out.println("\t" + (dtrace.getSource().size()>0 ? EcoreUtil.getURI(dtrace.getSource().get(0)) : "(deleted)")
						+ " --> " + (dtrace.getTarget().size()>0 ? EcoreUtil.getURI(dtrace.getTarget().get(0)) : "(deleted)"));
			}
		}
	}

	/**
	 * Resolves the transformation result from the graph.
	 * 
	 * Saves the resulting model to {@link RESOURCE_URL_RESULT} and the traces to {@link RESOURCE_URL_TRACES}
	 * 
	 * @param graph the result graph
	 * @param resSet the resource set to work on.
	 */
    protected void extractResultFromGraph(EGraph graph, ResourceSet resSet) {

        System.out.println("Number of roots: " + graph.getRoots().size());

        Resource traces = resSet.getResource(RESOURCE_URL_TRACES, false);
        if (traces == null) {
        	traces = resSet.createResource(RESOURCE_URL_TRACES);
        }
        Resource result = resSet.createResource(RESOURCE_URL_RESULT);
        
        traces.getContents().clear();

        List<EObject> roots = graph.getRoots();

        Class<? extends EObject> targetClass = resSet.getResource(this.getTargetUri(resSet), false).getContents().get(0).getClass();
        
        
        result.getContents().clear();
        for (EObject root : roots) {
        	
            // root is element of target model
            if (root.getClass() == targetClass) {
                result.getContents().add(EcoreUtil.copy(root));
                
            } else if (root instanceof Trace) {
            	// root is a new Trace and has source and target
            	
            	Trace trace = (Trace) root;
            	
                int hasSource = trace.getSource().size();
                int hasTarget = trace.getTarget().size();

                if (hasSource < 1 || hasTarget < 1) {
                	continue;
                }
                
                // check if trace is old.
                EReference field;
        		if (this.getSourceUri(resSet).equals(RESOURCE_URL_SOURCE)) {
        			field = TracePackage.eINSTANCE.getTrace_Source();
        		} else {
        			field = TracePackage.eINSTANCE.getTrace_Target();
        		}
        		
        		@SuppressWarnings("unchecked")
				URI srcUri = EcoreUtil.getURI(((EList<EObject>) trace.eGet(field, false)).get(0));
        		
        		if (srcUri.toString().startsWith(RESOURCE_URL_OLD.toString())) {
        			continue;
        		}
                
        		//new trace, add.
        		
                traces.getContents().add(EcoreUtil.copy(trace));
            }
        }
    }
    
    private ModelVersion saveTransformationResult(Model sourceModel,
			final ModelVersion sourceVersion, Model targetModel,
			ResourceSet resSet) {
		System.out.println("Save result");
	    
	    
	    Resource targetRes = targetModel.getResource();
	    
	    targetRes.getContents().clear();
	    targetRes.getContents().addAll(resSet.getResource(RESOURCE_URL_RESULT, false).getContents());
	    
	    try {
			targetRes.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ERROR: Could not save result to resource.");
			return null;
		}
	    
	    targetRes.unload();
	    
	    final ModelVersion newTargetVersion = targetModel.createVersion("Co-evolution from " + targetModel.getModel());
	    
	    final BasicEList<Trace> tl = new BasicEList<Trace>();
	    for (EObject o : resSet.getResource(RESOURCE_URL_TRACES, false).getContents()) {
	    	if (o instanceof Trace) {
	    		tl.add((Trace) o);
	    	}
	    }
	    
	    final ModelAssociation ma = sourceModel.getParent();
	    // Run the following steps as cluster.
	    ma.runCluster(new Runnable() {
			
			@Override
			public void run() {
				Association newAssoc = ModelAssociationFactory.eINSTANCE.createAssociation();
			    newAssoc.getTraces().addAll(tl);
			    newAssoc.getSource().add(sourceVersion);
			    newAssoc.getTarget().add(newTargetVersion);
			    newAssoc.setParent(ma);
			}
		});
	    
	    return newTargetVersion;
	}

	protected final URI getSourceUri(ResourceSet set) {
    	if (this.getManagedClass1().isAssignableFrom(set.getResource(RESOURCE_URL_OLD, false).getContents().get(0).getClass())) {
    		return RESOURCE_URL_SOURCE;
    	}
    	return RESOURCE_URL_TARGET;
    }
    
    protected final URI getTargetUri(ResourceSet set) {
    	if (this.getManagedClass1().isAssignableFrom(set.getResource(RESOURCE_URL_OLD, false).getContents().get(0).getClass())) {
    		return RESOURCE_URL_TARGET;
    	}
    	return RESOURCE_URL_SOURCE;
    }
    
    /**
     * Returns an input stream with the mapping.
     * 
     * @return stream containing mapping.
     */
    private InputStream getMappingStream(Resource source) {
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
    protected EGraph mergeInstanceModels(List<EGraph> models) {
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
    private Map<String, Unit> getHenshinRules(Map<String, Mapping> mappings) {
        Map<String, Unit> units = new HashMap<>();
        
        for (Mapping mapping : mappings.values()) {
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
