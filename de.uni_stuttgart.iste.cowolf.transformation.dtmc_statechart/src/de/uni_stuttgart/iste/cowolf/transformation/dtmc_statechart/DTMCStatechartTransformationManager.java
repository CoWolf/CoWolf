package de.uni_stuttgart.iste.cowolf.transformation.dtmc_statechart;

import de.uni_stuttgart.iste.cowolf.model.dtmc.DTMC;
import de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine;
import de.uni_stuttgart.iste.cowolf.transformation.AbstractTransformationManager;

/**
 * @author Michael Zimmermann
 * @author Michael Müller
 * @TODO: How to get the right transformation rules (simple look up table?) and
 *        needed parameter.
 * @TODO: Decide where traces should be stored (source or target model file or
 *        separate trace file)
 * @TODO: Should the transformation be done in place or not?
 */
public class DTMCStatechartTransformationManager
        extends
            AbstractTransformationManager {
    /**
     * Key for extension point identification.
     */
    private final static String KEY = "dtmc_statechart";

    @Override
    protected String getKey() {
        return KEY;
        }

	@Override
	public Class<?> getManagedClass1() {
		return DTMC.class;
    }

    @Override
	public Class<?> getManagedClass2() {
		// TODO Auto-generated method stub
		return StateMachine.class;
    }

}
