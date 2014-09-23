package de.uni_stuttgart.iste.cowolf.evolution.sequence_diagram;


import de.uni_stuttgart.iste.cowolf.evolution.AbstractEvolutionManager;
import de.uni_stuttgart.iste.cowolf.evolution.EvolutionTypeInfo;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Package;

public class Sequence_DiagramEvolutionManager extends AbstractEvolutionManager{

	@Override
	protected Class<?> getManagedClass() {
		return Package.class;
	}

	@Override
	public EvolutionTypeInfo getEvolutionTypeInfo() {
		EvolutionTypeInfo info = new EvolutionTypeInfo();
		info.setMatcher(EvolutionTypeInfo.MATCHER_EMFCOMPARE);
		return info;
	}

}
