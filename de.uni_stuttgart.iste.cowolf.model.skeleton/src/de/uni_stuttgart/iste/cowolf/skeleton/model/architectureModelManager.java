package de.uni_stuttgart.iste.cowolf.skeleton.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.model.AbstractArchitectureModelManager;
import de.uni_stuttgart.iste.cowolf.model.ModelTypeInfo;

public class architectureModelManager extends AbstractArchitectureModelManager {

	@Override
	public boolean isManaged(Resource model) {
		// TODO check if model is managed by manager
		return true;
	}

	@Override
	public ModelTypeInfo getModelTypeInfo() {

		// TODO add all supperted .class files
		List<Class<?>> propercontents = new ArrayList<Class<?>>();

		// TODO the name will also be the name of the automatically created
		// folder
		ModelTypeInfo mti = new ModelTypeInfo("name", propercontents);
		return mti;
	}
}
