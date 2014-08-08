package de.uni_stuttgart.iste.cowolf.ui.navigator.externalizedStrings;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "de/uni_stuttgart/iste/cowolf/ui/navigator/externalizedStrings/messages"; //$NON-NLS-1$
	public static final String CoEvolve_co_evolve_menu = "Co-Evolve";
	public static final String Analyze_analyze_menu = "Analyze";
	public static final String Evolve_evolve_menu = "Evolve";

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
