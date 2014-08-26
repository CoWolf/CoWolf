package de.uni_stuttgart.iste.cowolf.transformation;

import org.eclipse.emf.ecore.EObject;
import org.sidiff.difference.symmetric.AddObject;
import org.sidiff.difference.symmetric.AddReference;
import org.sidiff.difference.symmetric.Change;
import org.sidiff.difference.symmetric.RemoveObject;
import org.sidiff.difference.symmetric.RemoveReference;
import org.sidiff.difference.symmetric.SemanticChangeSet;

import de.uni_stuttgart.iste.cowolf.transformation.model.Param;
import de.uni_stuttgart.iste.cowolf.transformation.model.Reference;

public class ParameterHandler {

    private Param parameter;

    public Object getParameterValue(Param parameter, Change change) {
        return null;
    }
    public Object getParameterValue(Param parameter, SemanticChangeSet changeSet) {
        this.parameter = parameter;
        Object result = null;
        // check for corresponding change
        if (changeSet != null) {

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

        }
        return result;
    }
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
    }
    private Object handleRemoveObject(RemoveObject change) {
        return this.getStructuralFeature(change.getObj());
    }

    private Object handleAddObject(AddObject change) {
        return this.getStructuralFeature(change.getObj());
    }

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

    private Object getStructuralFeature(EObject object) {
        String feature = this.parameter.getChange().getReference()
                .getAttribute();
        return object.eGet(object.eClass().getEStructuralFeature(feature));
    }
}
