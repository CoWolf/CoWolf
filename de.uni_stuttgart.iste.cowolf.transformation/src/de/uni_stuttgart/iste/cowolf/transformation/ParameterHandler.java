package de.uni_stuttgart.iste.cowolf.transformation;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.sidiff.difference.symmetric.AddObject;
import org.sidiff.difference.symmetric.AddReference;
import org.sidiff.difference.symmetric.Change;
import org.sidiff.difference.symmetric.RemoveObject;
import org.sidiff.difference.symmetric.RemoveReference;
import org.sidiff.difference.symmetric.SemanticChangeSet;

import de.uni_stuttgart.iste.cowolf.transformation.model.Param;

public class ParameterHandler {

    private Param parameter;

    public Object getParameterValue(Param parameter, SemanticChangeSet changeSet) {
        this.parameter = parameter;
        List<String> path = parameter.getPath();
        // check for corresponding change
        Object result = null;
        for (Change change : changeSet.getChanges()) {
            String changeName = change.eClass().getName();
            if (changeName.equals(path.get(0))) {
                Object changeResult = this.handleChange(change);
                if (changeResult != null) {
                    result = changeResult;
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
        return this.getStructuralFeature(1, change.getObj());
    }

    private Object handleAddObject(AddObject change) {
        return this.getStructuralFeature(1, change.getObj());
    }

    private Object handleRemoveReference(RemoveReference change) {
        String type = this.parameter.getPath().get(1);
        if (change.getType().getName().equals(type)) {
            String reference = this.parameter.getPath().get(2);
            EObject obj = null;
            if (reference.equals("src")) {
                obj = change.getSrc();
            } else if (reference.equals("tgt")) {
                obj = change.getTgt();
            }
            if (obj != null) {
                String feature = this.parameter.getPath().get(3);
                System.out.println(feature);
                return obj.eGet(obj.eClass().getEStructuralFeature(feature));
            }
        }
        return null;
    }
    private Object handleAddReference(AddReference change) {
        String type = this.parameter.getPath().get(1);
        if (change.getType().getName().equals(type)) {
            String reference = this.parameter.getPath().get(2);
            EObject obj = null;
            if (reference.equals("src")) {
                obj = change.getSrc();
            } else if (reference.equals("tgt")) {
                obj = change.getTgt();
            }
            if (obj != null) {
                return this.getStructuralFeature(3, obj);
            }
        }
        return null;
    }

    private Object getStructuralFeature(int pathIndex, EObject object) {
        String feature = this.parameter.getPath().get(pathIndex);
        return object.eGet(object.eClass().getEStructuralFeature(feature));
    }
}
