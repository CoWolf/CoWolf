package de.uni_stuttgart.iste.cowolf.model.sequence_diagram;

import de.uni_stuttgart.iste.cowolf.model.AbstractArchitectureModelManager;

public class Sequence_DiagramModelManager extends AbstractArchitectureModelManager{

	@Override
	public java.lang.Class<?> getManagedClass() {
		return Package.class;
	}

	@Override
	public String getModelName() {
		return "Sequence Diagram";
	}

	@Override
	public String getModelNamespace() {
		return Sequence_diagramPackage.eNS_URI;
	}

	@Override
	public String getFileExtension() {
		return "sequence_diagram";
	}
	
	
}
