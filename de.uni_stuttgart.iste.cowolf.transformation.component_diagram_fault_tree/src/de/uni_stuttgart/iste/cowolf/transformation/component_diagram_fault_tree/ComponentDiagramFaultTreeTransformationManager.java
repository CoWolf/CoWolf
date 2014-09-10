package de.uni_stuttgart.iste.cowolf.transformation.component_diagram_fault_tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.sidiff.difference.symmetric.Change;
import org.sidiff.difference.symmetric.SymmetricDifference;

import de.uni_stuttgart.iste.cowolf.model.component_diagram.Architecture;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree;
import de.uni_stuttgart.iste.cowolf.transformation.AbstractTransformationManager;
import de.uni_stuttgart.iste.cowolf.transformation.component_diagram_fault_tree.ComponentDiagramFaultTreeTransformationHelper.ChangesFiller;

/**
 * @author David K
 *
 * ComponentDiagramFaultTreeTransformationManager overrides runTransformation in order to
 * perform transformations in code. All transformations are run by ChangeTree, which 
 * uses small henshin rules to acquire graph information and perform changes.
 */
public class ComponentDiagramFaultTreeTransformationManager extends AbstractTransformationManager {

	/**
	 * Key for extension point identification.
	 */
	private final static String KEY = "componentdiagram_faulttree";
	private final static String REVERSE_KEY = "faulttree_componentdiagram";
	private final static Class<?> FIRST_MODEL = Architecture.class;
	private final static Class<?> SECOND_MODEL = FaultTree.class;
	
	@Override
	public boolean isManaged(Resource source, Resource target) {
		if ((source == null) || (target == null)) { 
			return false;
		}
		if ((source.getContents() == null) || source.getContents().isEmpty()
				|| (target.getContents() == null)
				|| target.getContents().isEmpty()) {
			return false;
		}

		return (((FIRST_MODEL.isAssignableFrom(source.getContents().get(0)
				.getClass())) && (SECOND_MODEL.isAssignableFrom(target
				.getContents().get(0).getClass()))) || ((SECOND_MODEL
				.isAssignableFrom(source.getContents().get(0).getClass())) && (FIRST_MODEL
				.isAssignableFrom(target.getContents().get(0).getClass()))));
	}

	@Override
	protected String getKey() {
		return KEY;
	}

	@Override
	public Class<?> getManagedClass1() {
		return FIRST_MODEL;
	}

	@Override
	public Class<?> getManagedClass2() {
		return SECOND_MODEL;
	}
	
	@Override
	public boolean runTransformation(ResourceSet resSet, SymmetricDifference difference) {
		Resource source = resSet.getResource(this.getSourceUri(resSet), false);
		Resource target = resSet.getResource(this.getTargetUri(resSet), false);
		ChangeTree.init(source, target);
		
		// building lists of differences for ChangeTree
		HashSet<String> _newComponentTypes, _newPortTypes, _newComponentInstances, _newPortInstances,
			_newSubComponentInstances, _newConnectors;
		_newComponentTypes = new HashSet<String>();
		_newPortTypes = new HashSet<String>();
		_newComponentInstances = new HashSet<String>();
		_newPortInstances = new HashSet<String>();
		_newSubComponentInstances = new HashSet<String>();
		_newConnectors = new HashSet<String>();
		
		ChangesFiller filler = new ChangesFiller(_newComponentTypes, _newPortTypes, _newComponentInstances, _newPortInstances, _newSubComponentInstances, _newConnectors);
		
		System.out.println(">>> Building lists of differences for ChangeTree...");

		for(Change change : difference.getChanges()) {
			filler.add(change);
		}

		List<String> newComponentTypes, newPortTypes, newComponentInstances, newPortInstances,
		newSubComponentInstances, newConnectors;
		
		newComponentTypes = new ArrayList<String>();
		newPortTypes = new ArrayList<String>();
		newComponentInstances = new ArrayList<String>();
		newPortInstances = new ArrayList<String>();
		newSubComponentInstances = new ArrayList<String>();
		newConnectors = new ArrayList<String>();
		
		newComponentTypes.addAll(_newComponentTypes);
		newPortTypes.addAll(_newPortTypes);
		newComponentInstances.addAll(_newComponentInstances);
		newPortInstances.addAll(_newPortInstances);
		newSubComponentInstances.addAll(_newSubComponentInstances);
		newConnectors.addAll(_newConnectors);

		System.out.println(" >>> Parameter List sizes: " + newComponentTypes.size() + " " + newPortTypes.size() + " " + newComponentInstances.size() + " " + newPortInstances.size() + " " +
			newSubComponentInstances.size() + " " + newConnectors.size());
		
		// execute all change operations on the merged graph
		EGraph result = ChangeTree.run(mergeResources(resSet), newComponentTypes, newPortTypes, newComponentInstances, newPortInstances,
				newSubComponentInstances, newConnectors);
		if (result == null) {
			return false;
    	}
    	
		this.extractResultFromGraph(result, resSet);
		return true;
	}

	@Override
	protected String getReverseKey() {
		return REVERSE_KEY;
	}
	
	/**
	 * 
	 * @param transResSet resourceSet of the resources to be loaded.
	 * @return the merged EGraph object
	 */
	private EGraph mergeResources(ResourceSet transResSet){
		ArrayList<EGraph> graphSources = new ArrayList<EGraph>(4);
        
		Resource traceRes = transResSet.getResource(RESOURCE_URL_TRACES, false);
        if (traceRes != null && traceRes.getContents().size() > 0) {
        	graphSources.add(new EGraphImpl(traceRes));
        } else {
        	graphSources.add(new EGraphImpl(transResSet.getResource(RESOURCE_URL_SOURCE, false)));
        	graphSources.add(new EGraphImpl(transResSet.getResource(RESOURCE_URL_TARGET, false)));
        }
        
        EGraph graph = mergeInstanceModels(graphSources);
        
        System.out.println("Finished merging graphs.");
		return graph;

	}
}
