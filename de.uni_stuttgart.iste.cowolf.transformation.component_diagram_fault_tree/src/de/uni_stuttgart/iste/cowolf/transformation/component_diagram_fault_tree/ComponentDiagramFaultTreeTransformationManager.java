package de.uni_stuttgart.iste.cowolf.transformation.component_diagram_fault_tree;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.sidiff.difference.symmetric.Change;
import org.sidiff.difference.symmetric.SymmetricDifference;

import de.uni_stuttgart.iste.cowolf.model.component_diagram.Architecture;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree;
import de.uni_stuttgart.iste.cowolf.transformation.AbstractTransformationManager;
import de.unistuttgart.ensure.transformations.util.ComponentDiagramFaultTreeTransformationHelper.ChangesFiller;

/**
 * @author David K
 *
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
		List<String> newComponentTypes, newPortTypes, newComponentInstances, newPortInstances,
			newSubComponentInstances, newConnectors;
		newComponentTypes = new ArrayList<String>();
		newPortTypes = new ArrayList<String>();
		newComponentInstances = new ArrayList<String>();
		newPortInstances = new ArrayList<String>();
		newSubComponentInstances = new ArrayList<String>();
		newConnectors = new ArrayList<String>();
		
		ChangesFiller filler = new ChangesFiller(newComponentTypes, newPortTypes, newComponentInstances, newPortInstances, newSubComponentInstances, newConnectors);
		
		System.out.println(">>> Building lists of differences for ChangeTree...");
//		for(SemanticChangeSet changeSet : difference.getChangeSets()) {
//			for (Change change : changeSet.getChanges()) {
//				filler.add(changeSet.getEditRName(),change);
//			}
//		}

		for(Change change : difference.getChanges()) {
			filler.add(change);
		}

		System.out.println(" >>> Parameter List sizes: " + newComponentTypes.size() + " " + newPortTypes.size() + " " + newComponentInstances.size() + " " + newPortInstances.size() + " " +
			newSubComponentInstances.size() + " " + newConnectors.size());
		EGraph result = ChangeTree.run(source, target, newComponentTypes, newPortTypes, newComponentInstances, newPortInstances,
				newSubComponentInstances, newConnectors);
		if (result == null) {
			return false;
    	}
    	
		this.extractResultFromGraph(result, resSet);
		return true;
	}
	
/*	
    *//**
     * Handles a single change of a change set.
     * 
     * @param change
     * @return
     *//*
    private Object handleChange(Change change) {
        Object result = null;
        if (change instanceof AddReference) {
            return result = this.handleAddReference((AddReference) change);
        } else if (change instanceof RemoveReference) {
            return this.handleRemoveReference((RemoveReference) change);
        } else if (change instanceof AddObject) {
            return this.handleAddObject((AddObject) change);
        } else if (change instanceof RemoveObject) {
            return this.handleRemoveObject((RemoveObject) change);
        }
        return result;
    }*/

	@Override
	protected String getReverseKey() {
		return REVERSE_KEY;
	}
}
