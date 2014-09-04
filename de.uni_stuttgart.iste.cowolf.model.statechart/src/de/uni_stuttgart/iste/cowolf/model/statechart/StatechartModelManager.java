package de.uni_stuttgart.iste.cowolf.model.statechart;

import de.uni_stuttgart.iste.cowolf.model.AbstractArchitectureModelManager;

public class StatechartModelManager extends AbstractArchitectureModelManager {

	@Override
	public Class<?> getManagedClass() {
		return StateMachine.class;
	}

	@Override
	public String getModelName() {
		return "statechart";
	}

	@Override
	public String getModelNamespace() {
		return statechartemfPackage.eNS_URI;
	}
	
	@Override
	public String getFileExtension() {
		return "statechartemf";
	}
}
