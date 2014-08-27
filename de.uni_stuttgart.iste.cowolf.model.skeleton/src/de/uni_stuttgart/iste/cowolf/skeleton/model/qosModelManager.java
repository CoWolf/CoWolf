package de.uni_stuttgart.iste.cowolf.skeleton.model;

import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.model.AbstractQoSModelManager;
import de.uni_stuttgart.iste.cowolf.model.IAnalysisListener;

public class qosModelManager extends AbstractQoSModelManager {

	@Override
	public String analyze(final Resource model,
			final Map<String, Object> parameters,
			final IAnalysisListener listener) {
		// TODO analyze model and return result
		return null;
	}

	@Override
	public Class<?> getManagedClass() {
		// TODO Return the main class of the generated ecore model
		// used this class because it is an impossible value
		return this.getClass();
	}

	@Override
	public String getModelName() {
		// TODO name of the model
		return "skeleton";
	}

	@Override
	public String getModelNamespace() {
		// TODO namespace of the ecore model
		return "http://QosSkeleton/1.0";
	}
}
