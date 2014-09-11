package de.uni_stuttgart.iste.cowolf.model.statechart;

import de.uni_stuttgart.iste.cowolf.model.AbstractArchitectureModelManager;

public class StatemachineModelManager extends AbstractArchitectureModelManager {

	@Override
	public Class<?> getManagedClass() {
		return StateMachineRoot.class;
	}

	@Override
	public String getModelName() {
		return "statemachine";
	}

	@Override
	public String getModelNamespace() {
		return StatemachinePackage.eNS_URI;
	}

	@Override
	public String getFileExtension() {
		return "statemachine";
	}

}
