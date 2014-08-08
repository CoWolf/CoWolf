package de.uni_stuttgart.iste.cowolf.transformation;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.evolution.ModelOperation;


public abstract class AbstractTransformationManager {

	public abstract boolean isManaged(Resource source, Resource target);

	public abstract boolean transform(EPackage source, EPackage target, List<ModelOperation> operations);

	public abstract TransformationTypeInfo getTransformationTypeInfo();
}
