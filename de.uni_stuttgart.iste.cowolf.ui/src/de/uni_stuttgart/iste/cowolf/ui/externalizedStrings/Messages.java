package de.uni_stuttgart.iste.cowolf.ui.externalizedStrings;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "de/uni_stuttgart/iste/cowolf/ui/externalizedStrings/messages"; //$NON-NLS-1$
	public static String CreationFunctions_folder_title_models;
	public static String CreationFunctions_folder_title_State_charts;
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
