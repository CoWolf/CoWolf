package de.uni_stuttgart.iste.cowolf.model;

import org.eclipse.emf.ecore.resource.Resource;


public interface IModelManager {
	public ModelTypeInfo getModelTypeInfo();

	/**
	 * Checks if the given model is handled by this model manager
	 * @param model model to check
	 * @return true if this model is handled by this manager, false otherwise.
	 */
	public boolean isManaged(Resource model);
}