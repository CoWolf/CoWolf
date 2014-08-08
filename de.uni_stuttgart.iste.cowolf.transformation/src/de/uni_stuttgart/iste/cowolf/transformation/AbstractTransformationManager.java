package de.uni_stuttgart.iste.cowolf.transformation;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;

import de.uni_stuttgart.iste.cowolf.evolution.ModelOperation;


public abstract class AbstractTransformationManager {

	public abstract boolean isManaged(EPackage source, EPackage target);

	public abstract boolean transform(EPackage source, EPackage target, List<ModelOperation> operations);

	public abstract TransformationTypeInfo getTransformationTypeInfo();
}
