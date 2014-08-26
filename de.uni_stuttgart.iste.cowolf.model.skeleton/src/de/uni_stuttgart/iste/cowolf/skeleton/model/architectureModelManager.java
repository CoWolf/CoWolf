package de.uni_stuttgart.iste.cowolf.skeleton.model;

import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.model.AbstractArchitectureModelManager;

public class architectureModelManager extends AbstractArchitectureModelManager {

	@Override
	public boolean isManaged(Resource model) {
		return false;
	}

	@Override
	public Class<?> getManagedClass() {
		// TODO Return the main class of the generated ecore model
		// used this class because it is an impossible value
		return this.getClass();
	}

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "skeleton";
	}

	@Override
	public String getModelNamespace() {
		// TODO namespace of the ecore model
		return "http://ArchitectureSkeleton/1.0";
	}
}
