package de.uni_stuttgart.iste.cowolf.ui.model.lqn.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
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
		addField(new FileFieldEditor(PATH_TO_LQN_KEY, "&LQN Solver Executable:", getFieldEditorParent()));
	}

	public static String getPathToLQNSolver() {
		return Activator.getDefault().getPreferenceStore().getString(PATH_TO_LQN_KEY);
	}
}
