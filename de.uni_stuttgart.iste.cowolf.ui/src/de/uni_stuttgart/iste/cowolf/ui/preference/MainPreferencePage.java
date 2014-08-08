package de.uni_stuttgart.iste.cowolf.ui.preference;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.uni_stuttgart.iste.cowolf.ui.Activator;

public class MainPreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	public MainPreferencePage() {
	    super(GRID);
		this.setPreferenceStore(Activator.getDefault().getPreferenceStore());
	    this.setDescription("Expand the tree to edit preferences for CoWolf - A Co-Evolution Tool");
	  }

	@Override
	public void init(IWorkbench workbench) {
	}

	@Override
	protected void createFieldEditors() {

	}

}
