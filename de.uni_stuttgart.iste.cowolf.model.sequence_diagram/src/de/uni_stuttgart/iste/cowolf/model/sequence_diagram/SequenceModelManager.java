package de.uni_stuttgart.iste.cowolf.model.sequence_diagram;

import de.uni_stuttgart.iste.cowolf.model.AbstractArchitectureModelManager;

public class SequenceModelManager extends AbstractArchitectureModelManager {


	@Override
	public Class<?> getManagedClass() {
		return Sequence.class;
	}

	@Override
	public String getModelName() {
		return "sequence";
	}
	
	@Override
	public String getModelNamespace() {
		return Sequence_diagramPackage.eNS_URI;
	}
}
