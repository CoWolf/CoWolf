package de.uni_stuttgart.iste.cowolf.model;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

public interface IQoSModelManager extends IModelManager {
	public String certificate(EPackage model, Map<String, Object> parameters);
}
