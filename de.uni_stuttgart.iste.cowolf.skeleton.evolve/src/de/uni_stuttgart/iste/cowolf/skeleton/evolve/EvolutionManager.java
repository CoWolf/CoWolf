package de.uni_stuttgart.iste.cowolf.skeleton.evolve;

import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.evolution.AbstractEvolutionManager;
import de.uni_stuttgart.iste.cowolf.evolution.EvolutionTypeInfo;

/**
 *
 */
public class EvolutionManager extends AbstractEvolutionManager {

	@Override
	public boolean isManaged(Resource model) {
		// TODO return if the model us managed by the model
		return false;
	}

	@Override
	public EvolutionTypeInfo getEvolutionTypeInfo() {
		// TODO: Return evolution info, eg.g the type of the matcher
		EvolutionTypeInfo info = new EvolutionTypeInfo();
		info.setMatcher(EvolutionTypeInfo.MATCHER_EMFCOMPARE);
		return info;
	}
}
