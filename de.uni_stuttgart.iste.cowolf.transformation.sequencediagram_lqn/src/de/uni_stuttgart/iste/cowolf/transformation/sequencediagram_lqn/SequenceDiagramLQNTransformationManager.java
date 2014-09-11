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
		// FIXME change to sequence diagram
		return String.class;
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
	
	@Override
	public boolean isManaged(Class<?> source, Class<?> target) {
		
		if (source.isAssignableFrom(getManagedClass1())) {
			return super.isManaged(source, target);
		}
		
		return false;
	}

}
