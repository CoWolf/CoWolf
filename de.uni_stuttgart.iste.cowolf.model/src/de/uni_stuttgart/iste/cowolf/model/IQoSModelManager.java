package de.uni_stuttgart.iste.cowolf.model;

import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;

public interface IQoSModelManager extends IModelManager {
	public String analyse(Resource model, Map<String, Object> parameters);
}
