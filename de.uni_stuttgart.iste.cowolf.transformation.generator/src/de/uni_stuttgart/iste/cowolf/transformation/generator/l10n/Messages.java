package de.uni_stuttgart.iste.cowolf.transformation.generator.l10n;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "OSGI-INF/l10n/bundle";

	public static String Cowolf_Category;
	public static String Cowolf_Transformation_Mapping_Wizard_Name;
	public static String Cowolf_Transformation_Mapping_Editor_Name;
	public static String Cowolf_Transformation_Mapping_Extension;

	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}

}
