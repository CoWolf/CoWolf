package de.uni_stuttgart.iste.cowolf.model;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public abstract class AbstractModelManager {
	/**
	 * Get some general informations about the model component.
	 * @return ModelTypeInfo
	 */
	public abstract ModelTypeInfo getModelTypeInfo();

	/**
	 * Checks if the given model is handled by this model manager
	 * @param model model to check
	 * @return true if this model is handled by this manager, false otherwise.
	 */
	public boolean isManaged(Resource model) {
		
		if (model == null) {
			return false;
		}
		if (model.getContents() == null || model.getContents().isEmpty()) {
			return false;
		}
		
		for(EObject theEObject: model.getContents()) {
			//check if the current eobject is part of the allowed classes list
			boolean match = false;
			for (Class theEClass: this.getModelTypeInfo().PROPER_CONTENTS) {
				if (theEObject.getClass() == theEClass) {
					match = true;
				}
			}
			//return false if the current theEObject dosn`t match to the items in the theEClass list
			if (!match) {
				return false;
			}
		}
		
		return true;
	}
}