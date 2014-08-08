package de.uni_stuttgart.iste.cowolf.ui.model.dtmc.preference;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.uni_stuttgart.iste.cowolf.ui.model.dtmc.Activator;

public class DTMCPreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	public DTMCPreferencePage() {
		super(GRID);
		this.setPreferenceStore(Activator.getDefault().getPreferenceStore());
	    this.setDescription("Preferences for dtmc models");
	}

	@Override
	protected void createFieldEditors() {
		// TODO Auto-generated method stub
		this.addField(new DirectoryFieldEditor("PATH", "&Path to Prism:",
		        this.getFieldEditorParent()));
	}

	@Override
	public void init(IWorkbench workbench) {
		// TODO Auto-generated method stub

	}
}
