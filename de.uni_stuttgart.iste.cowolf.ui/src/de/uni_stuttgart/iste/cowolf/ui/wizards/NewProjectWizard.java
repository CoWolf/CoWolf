package de.uni_stuttgart.iste.cowolf.ui.wizards;

import java.net.URI;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import de.uni_stuttgart.iste.cowolf.ui.creationFunctions.CreationFunctions;
import de.uni_stuttgart.iste.cowolf.ui.externalizedStrings.Messages;

/**
 * this class holds the wizard for a new project
 *
 */
public class NewProjectWizard extends Wizard implements INewWizard,
		IExecutableExtension {

	private static final String PAGE_NAME = Messages.CustomNewProjectWizard_page_1_name;
	private static final String WIZARD_NAME = Messages.CustomNewProjectWizard_new_project_wizard_name;

	private WizardNewProjectCreationPage pageOne;
	private IConfigurationElement configurationElement;

	public NewProjectWizard() {
		setWindowTitle(WIZARD_NAME);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean performFinish() {
		String projectName = pageOne.getProjectName();
		URI location = null;
		if (!pageOne.useDefaults()) {
			location = pageOne.getLocationURI();
		}
		CreationFunctions.createProject(projectName, location);

		// now the wizard automatically opens the correct perspective
		BasicNewProjectResourceWizard.updatePerspective(configurationElement);

		return true;
	}

	@Override
	public void addPages() {
		super.addPages();

		pageOne = new WizardNewProjectCreationPage(PAGE_NAME);
		pageOne.setTitle(Messages.CustomNewProjectWizard_page_1_title);
		pageOne.setDescription(Messages.CustomNewProjectWizard_page_1_description);

		addPage(pageOne);
	}

	@Override
	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
		configurationElement = config;
	}

}