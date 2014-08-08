package de.uni_stuttgart.iste.cowolf.evolution.statechart;

import org.eclipse.emf.ecore.EPackage;

import de.uni_stuttgart.ieste.cowolf.model.Statechart.statchartemfPackage;
import de.uni_stuttgart.iste.cowolf.evolution.AbstractEvolutionManager;
import de.uni_stuttgart.iste.cowolf.evolution.EvolutionTypeInfo;

public class StatechartEvolutionManager extends AbstractEvolutionManager {	
	@Override
	public boolean isManaged(EPackage model) {
		if(model == null || model.getNsURI() == null) {
			return false;
		}
		return model.getNsURI().equals(statchartemfPackage.eINSTANCE.getNsURI());
	}

	@Override
	public EvolutionTypeInfo getEvolutionTypeInfo() {
		EvolutionTypeInfo info = new EvolutionTypeInfo();
		// TODO Auto-generated method stub
		return info;
	}

}
