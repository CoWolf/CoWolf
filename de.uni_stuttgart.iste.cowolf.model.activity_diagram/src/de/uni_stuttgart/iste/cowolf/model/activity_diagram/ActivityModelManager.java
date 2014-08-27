package de.uni_stuttgart.iste.cowolf.model.activity_diagram;

import de.uni_stuttgart.iste.cowolf.model.AbstractArchitectureModelManager;

public class ActivityModelManager extends AbstractArchitectureModelManager {

	@Override
	public Class<?> getManagedClass() {
		// TODO Auto-generated method stub
		return ActivityDiagram.class;
	}

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "activity";
	}

	@Override
	public String getModelNamespace() {
		// TODO Auto-generated method stub
		return Activity_diagramPackage.eNS_URI;
	}

}
