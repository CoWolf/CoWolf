package de.uni_stuttgart.iste.cowolf.skeleton.ui.analyze.analyze;

import java.util.HashMap;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;

public class MyWizardPage extends WizardPage {

	protected MyWizardPage(String pageName) {
		super(pageName);
		this.setTitle("Title");
		this.setDescription("Description");
	}

	@Override
	public void createControl(Composite parent) {
		// TODO create GUI

	}

	public void setProperties(HashMap<String, Object> properties) {
		// TODO set properties from the wizard page if they are needed during
		// the analyze

	}

}
