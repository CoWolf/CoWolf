package de.uni_stuttgart.iste.cowolf.skeleton.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.model.AbstractQoSModelManager;
import de.uni_stuttgart.iste.cowolf.model.IAnalysisListener;
import de.uni_stuttgart.iste.cowolf.model.ModelTypeInfo;

public class qosModelManager extends AbstractQoSModelManager {

	@Override
	public ModelTypeInfo getModelTypeInfo() {
		// TODO add all supperted .class files
		List<Class<?>> propercontents = new ArrayList<Class<?>>();

		// TODO the name will also be the name of the automatically created
		// folder
		ModelTypeInfo mti = new ModelTypeInfo("name", propercontents , "documentType");
		return null; // mti;
	}

	@Override
	public String analyze(final Resource model,
			final Map<String, Object> parameters,
			final IAnalysisListener listener) {
		// TODO analyze model and return result
		return null;
	}

	@Override
	public boolean isManaged(final Resource model) {
		// TODO check if resource is managed by manager
		return false;

	}

}
