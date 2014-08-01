package de.uni_stuttgart.iste.cowolf.model.statechart;

import de.uni_stuttgart.iste.cowolf.model.IArchitectureModelManager;
import de.uni_stuttgart.iste.cowolf.model.ModelTypeInfo;

public class StatechartModelManager implements IArchitectureModelManager {
	
	private final ModelTypeInfo info;
	
	public StatechartModelManager() {
		// TODO Auto-generated constructor stub
		info = new ModelTypeInfo("Statechart");
	}

	@Override
	public ModelTypeInfo getModelTypeInfo() {
		// TODO Auto-generated method stub
		return info;
	}

	@Override
	public void dummy() {
		// TODO Auto-generated method stub
		
	}

}
