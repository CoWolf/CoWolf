package de.uni_stuttgart.iste.cowolf.ui.wizards;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "de.uni_stuttgart.iste.cowolf.ui.wizards.messages"; //$NON-NLS-1$
	public static String NewFolderWizard_description;
	public static String NewFolderWizard_name;
	public static String NewFolderWizard_page_1_name;
	public static String NewFolderWizard_title;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
