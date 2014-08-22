package de.uni_stuttgart.iste.cowolf.evolution.component_diagram;

import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.evolution.AbstractEvolutionManager;
import de.uni_stuttgart.iste.cowolf.evolution.EvolutionTypeInfo;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentDiagram;

public class ComponentDiagramEvolutionManager extends AbstractEvolutionManager {
	@Override
	public boolean isManaged(Resource model) {
		if (model == null || model.getContents() == null
				|| model.getContents().isEmpty()) {
			return false;
		}

		return model.getContents().get(0) instanceof ComponentDiagram;
	}

	@Override
	public EvolutionTypeInfo getEvolutionTypeInfo() {
		EvolutionTypeInfo info = new EvolutionTypeInfo();
		info.setMatcher(EvolutionTypeInfo.MATCHER_EMFCOMPARE);
		return info;
	}
}
