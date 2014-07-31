package de.uni.stuttgart.informatik.iste.cowolf.externalizedStrings;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "de.uni.stuttgart.informatik.iste.cowolf.externalizedStrings.messages"; //$NON-NLS-1$
	public static String CustomNewProjectWizard_new_project_wizard_name;
	public static String CustomNewProjectWizard_page_1_description;
	public static String CustomNewProjectWizard_page_1_name;
	public static String CustomNewProjectWizard_page_1_title;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
