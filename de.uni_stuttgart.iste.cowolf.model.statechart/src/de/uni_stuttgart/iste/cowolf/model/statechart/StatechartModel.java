package de.uni_stuttgart.iste.cowolf.model.statechart;

import de.uni_stuttgart.iste.cowolf.model.IQoSModel;
import de.uni_stuttgart.iste.cowolf.model.ModelTypeInfo;

public class StatechartModel implements IQoSModel {

	private final ModelTypeInfo info;
	
	public StatechartModel() {
		// TODO Auto-generated constructor stub
		info = new ModelTypeInfo("Statechart");
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
