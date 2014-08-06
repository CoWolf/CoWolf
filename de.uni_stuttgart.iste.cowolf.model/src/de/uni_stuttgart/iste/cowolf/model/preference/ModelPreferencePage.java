package de.uni_stuttgart.iste.cowolf.model.preference;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.uni_stuttgart.iste.cowolf.model.Activator;

public class ModelPreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	public ModelPreferencePage() {
		super(GRID);
		this.setPreferenceStore(Activator.getDefault().getPreferenceStore());
	    this.setDescription("General Settings for Models");
	}

	@Override
	protected void createFieldEditors() {
		// TODO Auto-generated method stub
	}

	@Override
	public void init(IWorkbench workbench) {
		// TODO Auto-generated method stub

	}
}
