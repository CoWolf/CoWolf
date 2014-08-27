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

	/**
	 * Return the root class for the supported model.
	 * @return root class of model, which can be managed with this model manager.
	 */
	public abstract Class<?> getManagedClass();
	
	/**
	 * Returns the name of the handled model.
	 * @return returns name of the handled model.
	 */
	public abstract String getModelName();
	
	/**
	 * Returns the Namespace of handled model.
	 * @return the Namespace of the handled model.
	 */
	public abstract String getModelNamespace();
}