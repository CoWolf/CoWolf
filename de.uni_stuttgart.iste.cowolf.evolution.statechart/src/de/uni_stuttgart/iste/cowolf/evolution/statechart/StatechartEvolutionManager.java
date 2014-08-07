package de.uni_stuttgart.iste.cowolf.evolution.statechart;

import org.eclipse.emf.ecore.EPackage;

import de.uni_stuttgart.iste.cowolf.evolution.AbstractEvolutionManager;
import de.uni_stuttgart.iste.cowolf.evolution.EvolutionTypeInfo;

public class StatechartEvolutionManager extends AbstractEvolutionManager {

	public final static String KEY = "http/Statechart/1.0";

	@Override
	public boolean isManaged(EPackage model) {
		if (model.getNsURI() == null) {
			return false;
		}
		return model.getNsURI().equals(KEY);
	}

	@Override
	public EvolutionTypeInfo getEvolutionTypeInfo() {
		EvolutionTypeInfo info = new EvolutionTypeInfo();
		// TODO Auto-generated method stub
		return info;
	}

}
