package de.uni_stuttgart.iste.cowolf.core.utilities;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "de.uni_stuttgart.iste.cowolf.core.utilities.messages"; //$NON-NLS-1$
	public static String commandLineExecutor_unknown_operating_system;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
