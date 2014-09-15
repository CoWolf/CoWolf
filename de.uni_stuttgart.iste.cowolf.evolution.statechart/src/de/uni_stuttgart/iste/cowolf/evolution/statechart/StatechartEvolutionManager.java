package de.uni_stuttgart.iste.cowolf.evolution.statechart;

import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.evolution.AbstractEvolutionManager;
import de.uni_stuttgart.iste.cowolf.evolution.EvolutionTypeInfo;
import de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine;
import de.uni_stuttgart.iste.cowolf.model.statechart.StateMachineRoot;

/**
 * This class handles evolution of a statechart model.
 * 
 * @author Michael M�ller
 *
 */
public class StatechartEvolutionManager extends AbstractEvolutionManager {
    @Override
    public boolean isManaged(Resource model) {
        if (model == null || model.getContents() == null
                || model.getContents().isEmpty()) {
            return false;
        }

        return model.getContents().get(0) instanceof StateMachineRoot;
    }

    @Override
    public EvolutionTypeInfo getEvolutionTypeInfo() {
        EvolutionTypeInfo info = new EvolutionTypeInfo();
        info.setMatcher(EvolutionTypeInfo.MATCHER_EMFCOMPARE);
        return info;
    }

	@Override
	protected Class<?> getManagedClass() {
		return StateMachineRoot.class;
	}
}
