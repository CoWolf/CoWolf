package de.uni_stuttgart.iste.cowolf.ui.model.dtmc.analyze;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;

public class AnalyzeWizardPage2 extends WizardPage {

	private Composite container;

	protected AnalyzeWizardPage2(final String pageName) {
		super(pageName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createControl(final Composite parent) {
		// TODO Auto-generated method stub
		this.container = new Composite(parent, NONE);
		this.setControl(this.container);
	}

}
