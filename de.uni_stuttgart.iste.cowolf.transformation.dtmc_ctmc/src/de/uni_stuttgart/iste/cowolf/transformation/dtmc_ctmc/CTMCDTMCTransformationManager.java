package de.uni_stuttgart.iste.cowolf.transformation.dtmc_ctmc;

import de.uni_stuttgart.iste.cowolf.model.ctmc.CTMC;
import de.uni_stuttgart.iste.cowolf.model.dtmc.DTMC;
import de.uni_stuttgart.iste.cowolf.transformation.AbstractTransformationManager;

/**
 * @author Jonas Scheurich
 * @author Verena Käfer
 */
public class CTMCDTMCTransformationManager extends
		AbstractTransformationManager {

	/**
	 * Key for extension point identification.
	 */
	private final static String KEY = "ctmc_dtmc";
	private final static String REVERSE_KEY = "dtmc_ctmc";

	@Override
	protected String getKey() {
		return KEY;
	}

	@Override
	protected String getReverseKey() {
		return REVERSE_KEY;
	}

	@Override
	public Class<?> getManagedClass1() {
		return CTMC.class;
	}

	@Override
	public Class<?> getManagedClass2() {
		return DTMC.class;
	}

}
