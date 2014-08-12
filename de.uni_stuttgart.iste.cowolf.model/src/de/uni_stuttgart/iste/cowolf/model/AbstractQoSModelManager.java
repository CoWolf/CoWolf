package de.uni_stuttgart.iste.cowolf.model;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

public abstract class AbstractQoSModelManager extends AbstractModelManager {
	public abstract String certificate(EPackage model, Map<String, Object> parameters);
}
