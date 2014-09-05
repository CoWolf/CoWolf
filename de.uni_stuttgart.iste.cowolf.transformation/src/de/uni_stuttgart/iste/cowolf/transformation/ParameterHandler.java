package de.uni_stuttgart.iste.cowolf.transformation;

import org.eclipse.emf.ecore.EObject;
import org.sidiff.difference.symmetric.AddObject;
import org.sidiff.difference.symmetric.AddReference;
import org.sidiff.difference.symmetric.AttributeValueChange;
import org.sidiff.difference.symmetric.Change;
import org.sidiff.difference.symmetric.RemoveObject;
import org.sidiff.difference.symmetric.RemoveReference;
import org.sidiff.difference.symmetric.SemanticChangeSet;

import de.uni_stuttgart.iste.cowolf.transformation.model.Param;
import de.uni_stuttgart.iste.cowolf.transformation.model.Reference;

/**
 * 
 * @author Michael Müller
 *
 */
public class ParameterHandler {

    /**
     * parameter to handle.
     */
    private Param parameter;

    /**
     * Returns a value for a parameter based on a single {@link Change}. Used
     * currently if an attribute of a node changes its value and needs to be
     * transformed in another model.
     * 
     * @param parameter
     *            Parameter to get value for.
     * @param change
     *            Change to get value from.
     * @return
     */
    public Object getParameterValue(Param parameter, Change change) {
        if (change instanceof AttributeValueChange) {
            Reference ref = parameter.getReference();
            EObject obj = null;
            if ("objA".equals(ref.getName())) {
                obj = ((AttributeValueChange) change).getObjA();
            } else {
                obj = ((AttributeValueChange) change).getObjB();
            }
            String feature = ref.getAttribute();
            return obj.eGet(obj.eClass().getEStructuralFeature(feature));
        }
        return null;
    }

    /**
     * Returns value for a specified parameter by going through a
     * {@link SemanticChangeSet} according to the mapping file.
     * 
     * @param parameter
     *            parameter to get value for.
     * @param changeSet
     * @return
     */
    public Object getParameterValue(Param parameter, SemanticChangeSet changeSet) {
        this.parameter = parameter;
        Object result = null;
        // check for corresponding change
        if (changeSet != null) {
            if (parameter.getChange() != null) {
                String paramChangeName = parameter.getChange().getName();
                for (Change change : changeSet.getChanges()) {
                    String changeName = change.eClass().getName();
                    if (changeName.equals(paramChangeName)) {
                        Object changeResult = this.handleChange(change);
                        if (changeResult != null) {
                            result = changeResult;
                        }
                    }
                }
                return result;
            }
        }
        return null;
    }

    /**
     * Handles a single change of a change set.
     * 
     * @param change
     * @return
     */
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
        } else if (change instanceof AttributeValueChange) {
        	return this.handleAttributeValueChange((AttributeValueChange) change);
        }
        return result;
    }
    private Object handleAttributeValueChange(AttributeValueChange change) {
    	Reference reference = this.parameter.getChange().getReference();
    	
    	EObject obj = null;
        if (reference.getName().equals("objA")) {
            obj = change.getObjA();
        } else if (reference.getName().equals("objB")) {
            obj = change.getObjB();
        }
        return this.getStructuralFeature(obj);
	}

	/**
     * Handles the case when the {@link Change} is an instance of
     * {@link RemoveObject} class.
     * 
     * @param change
     * @return
     */
    private Object handleRemoveObject(RemoveObject change) {
        return this.getStructuralFeature(change.getObj());
    }

    /**
     * Handles the case when the {@link Change} is an instance of
     * {@link AddObject} class.
     * 
     * @param change
     * @return
     */
    private Object handleAddObject(AddObject change) {
        return this.getStructuralFeature(change.getObj());
    }

    /**
     * Handles the case when the change is instance of {@link RemoveReference}
     * class.
     * 
     * @param change
     * @return
     */
    private Object handleRemoveReference(RemoveReference change) {
        Reference reference = this.parameter.getChange().getReference();
        String type = this.parameter.getChange().getType();
        if (change.getType().getName().equals(type)) {
            String referenceName = reference.getName();
            EObject obj = null;
            if (referenceName.equals("src")) {
                obj = change.getSrc();
            } else if (referenceName.equals("tgt")) {
                obj = change.getTgt();
            }
            if (obj != null) {
                String feature = reference.getAttribute();
                return obj.eGet(obj.eClass().getEStructuralFeature(feature));
            }
        }
        return null;
    }

    /**
     * Handles the case when the change is instance of {@link AddReference}
     * class.
     * 
     * @param change
     * @return
     */
    private Object handleAddReference(AddReference change) {
        String type = this.parameter.getChange().getType();
        if (change.getType().getName().equals(type)) {
            Reference reference = this.parameter.getChange().getReference();
            EObject obj = null;
            if (reference.getName().equals("src")) {
                obj = change.getSrc();
            } else if (reference.getName().equals("tgt")) {
                obj = change.getTgt();
            }
            if (obj != null) {
                return this.getStructuralFeature(obj);
            }
        }
        return null;
    }

    /**
     * Returns an attribute for a specified object.
     * 
     * @param object
     * @return
     */
    private Object getStructuralFeature(EObject object) {
        String feature = this.parameter.getChange().getReference()
                .getAttribute();
        return object.eGet(object.eClass().getEStructuralFeature(feature));
    }
}
