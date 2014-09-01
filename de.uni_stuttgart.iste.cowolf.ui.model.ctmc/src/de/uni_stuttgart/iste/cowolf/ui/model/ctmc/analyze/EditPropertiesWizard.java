package de.uni_stuttgart.iste.cowolf.ui.model.ctmc.analyze;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.wizard.Wizard;

public class EditPropertiesWizard extends Wizard {

	protected EditPropertiesWizardPage1 pageOne;

	public EditPropertiesWizard(final Resource resource, String content) {
		super();
		super.setWindowTitle("Analyze CTMC with PRISM model checker");
		this.pageOne = new EditPropertiesWizardPage1("Page 1", resource);
	}

	@Override
	public String getWindowTitle() {
		return super.getWindowTitle();
	}

	@Override
	public void addPages() {
		this.addPage(this.pageOne);
	}

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return true;
	}

}
