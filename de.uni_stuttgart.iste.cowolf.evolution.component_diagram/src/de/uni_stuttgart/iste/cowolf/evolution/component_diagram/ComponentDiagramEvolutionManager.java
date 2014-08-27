package de.uni_stuttgart.iste.cowolf.evolution.component_diagram;

import org.eclipse.emf.ecore.EObject;
import de.uni_stuttgart.iste.cowolf.evolution.AbstractEvolutionManager;
import de.uni_stuttgart.iste.cowolf.evolution.EvolutionTypeInfo;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentDiagram;

public class ComponentDiagramEvolutionManager extends AbstractEvolutionManager {

	@Override
	protected Class<? extends EObject> getManagedClass() {
		return ComponentDiagram.class;
	}

	@Override
	public EvolutionTypeInfo getEvolutionTypeInfo() {
		EvolutionTypeInfo info = new EvolutionTypeInfo();
		info.setMatcher(EvolutionTypeInfo.MATCHER_EMFCOMPARE);
		return info;
	}
}
