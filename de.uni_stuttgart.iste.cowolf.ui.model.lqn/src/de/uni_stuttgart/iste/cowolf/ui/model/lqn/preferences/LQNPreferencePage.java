package de.uni_stuttgart.iste.cowolf.ui.model.lqn.preferences;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.uni_stuttgart.iste.cowolf.ui.model.lqn.Activator;

public class LQNPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	private static final String PATH_TO_LQN_KEY = "PATH_TO_LQN";
	
	public LQNPreferencePage(){
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Preferences for LQN models");
	}
	
	@Override
	public void init(IWorkbench workbench) {
	}

	@Override
	protected void createFieldEditors() {
		addField(new DirectoryFieldEditor(PATH_TO_LQN_KEY, "&Path to LQN Solver:", getFieldEditorParent()));
	}

	public static String getPathToLQNSolver() {
		return Activator.getDefault().getPreferenceStore().getString(PATH_TO_LQN_KEY);
	}
}
