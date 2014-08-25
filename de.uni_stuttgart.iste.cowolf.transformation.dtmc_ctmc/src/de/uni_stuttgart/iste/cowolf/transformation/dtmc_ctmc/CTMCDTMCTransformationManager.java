package de.uni_stuttgart.iste.cowolf.transformation.dtmc_ctmc;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

import de.uni_stuttgart.iste.cowolf.model.ctmc.CTMC;
import de.uni_stuttgart.iste.cowolf.model.dtmc.DTMC;
import de.uni_stuttgart.iste.cowolf.transformation.AbstractTransformationManager;

/**
 * 
 * @author Jonas Scheurich
 * @author Vernea Käfer
 *
 */
public class CTMCDTMCTransformationManager extends
		AbstractTransformationManager {

	private static final String RULE_DIRECTORY = "de.uni_stuttgart.iste.cowolf.transformation.ctmc_dtmc.rules";
	/**
	 * Key for extension point identification.
	 */
	private final static String KEY = "ctmc_dtmc";

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
		return CTMC.class;
	}

}
