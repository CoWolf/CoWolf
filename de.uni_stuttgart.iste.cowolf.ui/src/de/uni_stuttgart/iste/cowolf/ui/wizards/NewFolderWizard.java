package de.uni_stuttgart.iste.cowolf.ui.wizards;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewFolderMainPage;

/**
 * this class holds the wizard for a new project
 *
 */
public class NewFolderWizard extends Wizard implements INewWizard,
		IExecutableExtension {

	private static final String PAGE_NAME = "Wizard";
	private static final String WIZARD_NAME = "Folder Wizard";

	private WizardNewFolderMainPage pageOne;

	public NewFolderWizard() {
		setWindowTitle(WIZARD_NAME);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {

	}

	@Override
	public boolean performFinish() {
		pageOne.createNewFolder();

		return true;
	}

	@Override
	public void addPages() {
		super.addPages();

		IWorkbenchWindow window =
			    PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
		
		pageOne = new WizardNewFolderMainPage(PAGE_NAME, selection);
		pageOne.setTitle("Folder");
		pageOne.setDescription("This wizard helps you to create a folder");

		addPage(pageOne);
	}

	@Override
	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
	}

}