package de.uni_stuttgart.iste.cowolf.ui.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

import de.uni_stuttgart.iste.cowolf.ui.externalizedStrings.Messages;

public class ExportWizard extends Wizard implements IExportWizard {

	private static final String PAGE_NAME = "Export Wizard";
	private WizardNewProjectCreationPage pageOne;

	public ExportWizard() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void addPages() {
		super.addPages();

		pageOne = new WizardNewProjectCreationPage(PAGE_NAME);
		pageOne.setTitle(Messages.CustomNewProjectWizard_page_1_title);
		pageOne.setDescription(Messages.CustomNewProjectWizard_page_1_description);

		addPage(pageOne);
	}

}
