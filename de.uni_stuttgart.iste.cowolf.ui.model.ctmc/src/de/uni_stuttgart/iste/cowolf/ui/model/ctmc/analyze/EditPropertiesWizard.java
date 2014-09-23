package de.uni_stuttgart.iste.cowolf.ui.model.ctmc.analyze;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.wizard.Wizard;

import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Comment;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Rule;

public class EditPropertiesWizard extends Wizard {

	protected EditPropertiesWizardPage1 pageOne;
	Comment key;
	Rule value;

	public EditPropertiesWizard(final Resource resource, Comment key, Rule value) {
		super();
		super.setWindowTitle("Analyze CTMC with PRISM model checker");
		this.pageOne = new EditPropertiesWizardPage1("Page 1", resource, key, value);
		this.key = key;
		this.value = value;
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
		key = pageOne.getKey();
		value = pageOne.getValue();
		return true;
	}

	public Comment getKey ()  {
		return key;
	}
	
	public Rule getValue ()  {
		return value;
	}

}
