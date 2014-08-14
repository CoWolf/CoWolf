package de.uni_stuttgart.iste.cowolf.transformation;

import org.eclipse.emf.ecore.resource.Resource;
import org.sidiff.difference.symmetric.SymmetricDifference;

/**
 * @author Michael Zimmermann
 *
 *
 * @TODO: How to get the right transformation rules (simple look up table?) and
 *        needed parameter.
 * @TODO: Decide where traces should be stored (source or target model file or
 *        separate trace file)
 * @TODO: Should the transformation be done in place or not?
 *
 */
public abstract class AbstractTransformationManager {

	public abstract boolean isManaged(Resource source, Resource target);

	public abstract boolean transform(Resource source, Resource target,
			SymmetricDifference difference);

	public abstract TransformationTypeInfo getTransformationTypeInfo();
}
