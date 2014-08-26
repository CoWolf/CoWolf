package de.uni_stuttgart.iste.cowolf.model;

import org.eclipse.emf.ecore.resource.Resource;

public abstract class AbstractModelManager {

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
		
		if (this.getManagedClass().isAssignableFrom(model.getContents().get(0).getClass())) {
			return true;
		}
		return false;
	}

	public abstract Class<?> getManagedClass();
	
	public abstract String getModelName();
	
	public abstract String getModelNamespace();
}