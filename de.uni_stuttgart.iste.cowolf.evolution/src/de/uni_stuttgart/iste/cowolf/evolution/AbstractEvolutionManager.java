package de.uni_stuttgart.iste.cowolf.evolution;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;


public abstract class AbstractEvolutionManager {

	public abstract boolean isManaged(EPackage model);

	public List<ModelOperation> evolve(EPackage oldModel, EPackage newModel) {
		//TODO just an interface stub
		return null;
	}

	public abstract EvolutionTypeInfo getEvolutionTypeInfo();
}