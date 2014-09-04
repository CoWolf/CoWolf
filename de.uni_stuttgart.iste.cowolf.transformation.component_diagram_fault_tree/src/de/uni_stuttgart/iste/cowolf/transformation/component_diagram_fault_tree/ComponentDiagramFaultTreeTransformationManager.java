package de.uni_stuttgart.iste.cowolf.transformation.component_diagram_fault_tree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.sidiff.difference.symmetric.AddObject;
import org.sidiff.difference.symmetric.AddReference;
import org.sidiff.difference.symmetric.Change;
import org.sidiff.difference.symmetric.RemoveObject;
import org.sidiff.difference.symmetric.RemoveReference;
import org.sidiff.difference.symmetric.SemanticChangeSet;
import org.sidiff.difference.symmetric.SymmetricDifference;

import de.uni_stuttgart.iste.cowolf.model.component_diagram.Architecture;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree;
import de.uni_stuttgart.iste.cowolf.transformation.AbstractTransformationManager;

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
	public Resource transform(Resource oldSource, Resource source, Resource target, SymmetricDifference difference, URI fileURI) {
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
		
		System.out.println(">>> Building lists of differences for ChangeTree...");
		for(SemanticChangeSet changeSet : difference.getChangeSets()) {
			System.out.println(changeSet.getEditRName());
			Object name = null;
			for (Change change : changeSet.getChanges()) {
                String changeName = change.eClass().getName();
                System.out.println(changeName);
                if (change instanceof AddReference) {
                    //return result = this.handleAddReference((AddReference) change);
                } else if (change instanceof RemoveReference) {
                    //return this.handleRemoveReference((RemoveReference) change);
                } else if (change instanceof AddObject) {
                		name = ((AddObject) change).getObj().eGet(((AddObject) change).getObj().eClass().getEStructuralFeature("name"));
                } else if (change instanceof RemoveObject) {
                    //return this.handleRemoveObject((RemoveObject) change);
                }
                
                if(name == null){
                	name = "";
                }
                System.out.println(name);
                switch(changeSet.getEditRName()){
    			case "CREATE_SoftwareComponent_IN_Architecture_(component)" : newComponentInstances.add(name.toString()); break;
    			case "CREATE_HardwareComponent_IN_Architecture_(component)" : newComponentInstances.add(name.toString()); break;
    			case "CREATE_ElectronicDevice_IN_Architecture_(component)" : newComponentInstances.add(name.toString()); break;
    			case "CREATE_MechanicalDevice_IN_Architecture_(component)" : newComponentInstances.add(name.toString()); break;
    			case "CREATE_PortType_IN_Architecture_(port_type)" : newPortTypes.add(name.toString()); break;
    			default : break; 
    			}
                
            }
			
			
		}
		System.out.println(" >>> Parameter List sizes: " + newComponentTypes.size() + " " + newPortTypes.size() + " " + newComponentInstances.size() + " " + newPortInstances.size() + " " +
			newSubComponentInstances.size() + " " + newConnectors.size());
		EGraph result = ChangeTree.run(source, target, newComponentTypes, newPortTypes, newComponentInstances, newPortInstances,
				newSubComponentInstances, newConnectors);
		try {
			this.save(result, source, target, null, false);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return target;
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
