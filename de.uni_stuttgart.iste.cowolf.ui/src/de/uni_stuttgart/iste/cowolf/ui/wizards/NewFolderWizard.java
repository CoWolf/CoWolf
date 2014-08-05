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

import de.uni_stuttgart.iste.cowolf.ui.externalizedStrings.Messages;

/**
 * this class holds the wizard for a new project
 *
 */
public class NewFolderWizard extends Wizard implements INewWizard,
		IExecutableExtension {

	private static final String PAGE_NAME = Messages.NewFolderWizard_page_1_name;
	private static final String WIZARD_NAME = Messages.NewFolderWizard_name;

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
		pageOne.setTitle(Messages.NewFolderWizard_title);
		pageOne.setDescription(Messages.NewFolderWizard_description);

		addPage(pageOne);
	}

	@Override
	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
	}

}