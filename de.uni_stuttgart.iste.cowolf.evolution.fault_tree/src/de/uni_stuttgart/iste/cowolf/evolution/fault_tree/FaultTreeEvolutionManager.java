package de.uni_stuttgart.iste.cowolf.evolution.fault_tree;


import de.uni_stuttgart.iste.cowolf.evolution.AbstractEvolutionManager;
import de.uni_stuttgart.iste.cowolf.evolution.EvolutionTypeInfo;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree;

public class FaultTreeEvolutionManager extends AbstractEvolutionManager {
	@Override
	public EvolutionTypeInfo getEvolutionTypeInfo() {
		EvolutionTypeInfo info = new EvolutionTypeInfo();
		info.setMatcher(EvolutionTypeInfo.MATCHER_EMFCOMPARE);
		return info;
	}

	@Override
	protected Class<?> getManagedClass() {
		return FaultTree.class;
	}
}
