package de.uni_stuttgart.iste.cowolf.evolution.statechart;

import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.ieste.cowolf.model.Statechart.StateMachine;
import de.uni_stuttgart.iste.cowolf.evolution.AbstractEvolutionManager;
import de.uni_stuttgart.iste.cowolf.evolution.EvolutionTypeInfo;

public class StatechartEvolutionManager extends AbstractEvolutionManager {	
	@Override
	public boolean isManaged(Resource model) {
		if(model == null) {
			return false;
		}
		if(model.getContents() == null || model.getContents().isEmpty()) {
			return false;
		}
		return model.getContents().get(0) instanceof StateMachine;
	}

	@Override
	public EvolutionTypeInfo getEvolutionTypeInfo() {
		EvolutionTypeInfo info = new EvolutionTypeInfo();
		// TODO Auto-generated method stub
		return info;
	}
}
