package de.uni_stuttgart.iste.cowolf.evolution.lqn;

import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.evolution.AbstractEvolutionManager;
import de.uni_stuttgart.iste.cowolf.evolution.EvolutionTypeInfo;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQN;

public class LQNEvolutionManager extends AbstractEvolutionManager {
	
	/**
	 * FIXME: evolution is not working, disabled.
	 */
	@Override
	public boolean isManaged(Class<?> modelClass) {
		return false;
	}
	
	/**
	 * FIXME: evolution is not working, disabled.
	 */
	@Override
	public boolean isManaged(Resource model) {
		return false;
	}
	
	@Override
	public EvolutionTypeInfo getEvolutionTypeInfo() {
		EvolutionTypeInfo info = new EvolutionTypeInfo();
		info.setMatcher(EvolutionTypeInfo.MATCHER_EMFCOMPARE);
		return info;
	}

	@Override
	protected Class<?> getManagedClass() {
		return LQN.class;
	}
}