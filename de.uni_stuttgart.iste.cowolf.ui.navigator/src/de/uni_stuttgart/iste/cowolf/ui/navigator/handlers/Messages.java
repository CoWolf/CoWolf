package de.uni_stuttgart.iste.cowolf.ui.navigator.handlers;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "externalizedStrings.messages"; //$NON-NLS-1$
	public static String CoEvolve_co_evolve_menu;
	public static String evolve_evolve_menu;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
