package de.uni_stuttgart.iste.cowolf.model.dtmc;

import de.uni_stuttgart.iste.cowolf.model.IQoSModelManager;
import de.uni_stuttgart.iste.cowolf.model.ModelTypeInfo;

public class DTMCModelManager implements IQoSModelManager {

	private final ModelTypeInfo info;
	
	public DTMCModelManager() {
		// TODO Auto-generated constructor stub
		info = new ModelTypeInfo("DTMC");
	}

	@Override
	public ModelTypeInfo getModelTypeInfo() {
		// TODO Auto-generated method stub
		return info;
	}

	@Override
	public void certificate() {
		// TODO Auto-generated method stub

	}

}
