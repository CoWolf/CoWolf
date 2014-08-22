package de.uni_stuttgart.iste.cowolf.ui.model.ctmc.preference;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.uni_stuttgart.iste.cowolf.ui.model.ctmc.Activator;

public class CTMCPreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	public CTMCPreferencePage() {
		super(GRID);
		this.setPreferenceStore(Activator.getDefault().getPreferenceStore());
	    this.setDescription("Preferences for dtmc models");
	}

	@Override
	protected void createFieldEditors() {
		// TODO Auto-generated method stub
		this.addField(new DirectoryFieldEditor("PRISM_PATH", "&Path to Prism:",
		        this.getFieldEditorParent()));
	}

	@Override
	public void init(final IWorkbench workbench) {
		// TODO Auto-generated method stub

	}

	public static String getPrismPath() {
		return Activator.getDefault().getPreferenceStore().getString("PRISM_PATH");
	}
}
