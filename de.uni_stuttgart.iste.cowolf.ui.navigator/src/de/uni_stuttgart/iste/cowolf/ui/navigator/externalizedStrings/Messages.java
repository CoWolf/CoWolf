package de.uni_stuttgart.iste.cowolf.ui.navigator.externalizedStrings;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "de/uni_stuttgart/iste/cowolf/ui/navigator/externalizedStrings/messages"; //$NON-NLS-1$
	public static String CoEvolve_co_evolve_menu;
	public static String Analyze_analyze_menu;
	public static String Evolve_evolve_menu;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
