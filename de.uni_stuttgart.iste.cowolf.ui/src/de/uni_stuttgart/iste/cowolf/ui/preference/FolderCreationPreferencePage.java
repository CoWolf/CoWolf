package de.uni_stuttgart.iste.cowolf.ui.preference;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.uni_stuttgart.iste.cowolf.ui.Activator;

public class FolderCreationPreferencePage extends FieldEditorPreferencePage
		implements IWorkbenchPreferencePage {

	public FolderCreationPreferencePage() {
		super(GRID);
		this.setPreferenceStore(Activator.getDefault().getPreferenceStore());
		this.setDescription("Preferences for folder creation");
	}

	@Override
	protected void createFieldEditors() {
		// TODO Auto-generated method stub
		BooleanFieldEditor editor = new BooleanFieldEditor("FOLDER_CREATION",
				"&Create model folders", BooleanFieldEditor.SEPARATE_LABEL, this.getFieldEditorParent());
		Activator.getDefault().getPreferenceStore().setValue("FOLDER_CREATION", true);
		Activator.getDefault().getPreferenceStore().setDefault("FOLDER_CREATION", true);
		this.addField(editor);
	}

	@Override
	public void init(final IWorkbench workbench) {
		// TODO Auto-generated method stub

	}

	public static boolean getFolderPreference() {
		return Activator.getDefault().getPreferenceStore()
				.getBoolean("FOLDER_CREATION");
	}
}
