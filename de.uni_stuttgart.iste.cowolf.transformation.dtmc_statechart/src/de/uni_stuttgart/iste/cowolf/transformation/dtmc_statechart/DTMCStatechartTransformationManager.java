package de.uni_stuttgart.iste.cowolf.transformation.dtmc_statechart;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.evolution.ModelOperation;
import de.uni_stuttgart.iste.cowolf.transformation.AbstractTransformationManager;
import de.uni_stuttgart.iste.cowolf.transformation.TransformationTypeInfo;

public class DTMCStatechartTransformationManager extends
		AbstractTransformationManager {

	@Override
	public boolean isManaged(Resource source, Resource target) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean transform(EPackage source, EPackage target,
			List<ModelOperation> operations) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TransformationTypeInfo getTransformationTypeInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
