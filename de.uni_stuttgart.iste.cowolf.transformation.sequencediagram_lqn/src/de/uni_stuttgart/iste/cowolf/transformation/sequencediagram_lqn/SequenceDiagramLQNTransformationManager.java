package de.uni_stuttgart.iste.cowolf.transformation.sequencediagram_lqn;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnCoreType;
import de.uni_stuttgart.iste.cowolf.transformation.AbstractTransformationManager;

/**
 * 
 * @author Jonas Scheurich, David Steinhart
 *
 */
public class SequenceDiagramLQNTransformationManager extends AbstractTransformationManager{

	@Override
	public Class<?> getManagedClass1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getManagedClass2() {
		return LqnCoreType.class;
	}

	@Override
	protected String getKey() {
		return "sequencediagram_lqn";
	}

	@Override
	protected String getReverseKey() {
		return "lqn_sequencediagram";
	}

}
