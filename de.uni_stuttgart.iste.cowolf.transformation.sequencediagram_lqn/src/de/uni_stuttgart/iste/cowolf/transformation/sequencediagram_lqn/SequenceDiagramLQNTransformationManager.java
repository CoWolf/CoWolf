package de.uni_stuttgart.iste.cowolf.transformation.sequencediagram_lqn;

import org.sidiff.difference.symmetric.SymmetricDifference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQN;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Package;
import de.uni_stuttgart.iste.cowolf.transformation.AbstractTransformationManager;

/**
 * 
 * @author Jonas Scheurich
 * @author David Steinhart
 *
 */
public class SequenceDiagramLQNTransformationManager extends AbstractTransformationManager{

	@Override
	public Class<?> getManagedClass1() {
		return Package.class;
	}

	@Override
	public Class<?> getManagedClass2() {
		return LQN.class;
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
		
		if (getManagedClass1().isAssignableFrom(source)
                && getManagedClass2().isAssignableFrom(target)) {
            return true;
        }
		
		return false;
	}
	


}
