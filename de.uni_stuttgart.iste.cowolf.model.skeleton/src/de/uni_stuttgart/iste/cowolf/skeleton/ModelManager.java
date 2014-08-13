package de.uni_stuttgart.iste.cowolf.skeleton;

import java.util.ArrayList;
import java.util.List;

import de.uni_stuttgart.iste.cowolf.model.AbstractArchitectureModelManager;
import de.uni_stuttgart.iste.cowolf.model.ModelTypeInfo;

public class ModelManager extends AbstractArchitectureModelManager {

	@Override
	public ModelTypeInfo getModelTypeInfo() {

		List<Class<?>> propercontents = new ArrayList<Class<?>>();

		//TODO: add the correct .class items to the list
		
		ModelTypeInfo mti = new ModelTypeInfo("name", propercontents);
		
		return mti;
	}

}
