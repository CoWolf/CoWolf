package de.uni_stuttgart.iste.cowolf.evolution.lqn;

import de.uni_stuttgart.iste.cowolf.evolution.AbstractEvolutionManager;
import de.uni_stuttgart.iste.cowolf.evolution.EvolutionTypeInfo;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.DocumentRoot;

public class LQNEvolutionManager extends AbstractEvolutionManager {
	@Override
	public EvolutionTypeInfo getEvolutionTypeInfo() {
		EvolutionTypeInfo info = new EvolutionTypeInfo();
		info.setMatcher(EvolutionTypeInfo.MATCHER_EMFCOMPARE);
		return info;
	}

	@Override
	protected Class<?> getManagedClass() {
		return DocumentRoot.class;
	}
}