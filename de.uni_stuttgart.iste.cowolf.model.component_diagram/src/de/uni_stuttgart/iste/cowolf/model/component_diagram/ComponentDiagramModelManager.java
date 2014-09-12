package de.uni_stuttgart.iste.cowolf.model.component_diagram;

import de.uni_stuttgart.iste.cowolf.model.AbstractArchitectureModelManager;

/**
 * 
 * @author Rene Trefft
 *
 */
public class ComponentDiagramModelManager extends AbstractArchitectureModelManager {

	@Override
	public Class<?> getManagedClass() {
		return Architecture.class;
	}

	@Override
	public String getModelName() {
		return "Component Diagram";
	}

	@Override
	public String getModelNamespace() {
		return Component_diagramPackage.eNS_URI;
	}

	@Override
	public String getFileExtension() {
		return "component_diagram";
	}

}