package de.uni_stuttgart.iste.cowolf.model.dtmc;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import de.uni_stuttgart.iste.cowolf.model.IQoSModelManager;
import de.uni_stuttgart.iste.cowolf.model.ModelTypeInfo;

public class DTMCModelManager implements IQoSModelManager {

	public DTMCModelManager() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ModelTypeInfo getModelTypeInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isManaged(EPackage model) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String certificate(EPackage model, Map<String, Object> parameters) {
		// TODO Auto-generated method stub
		return null;
	}

}
