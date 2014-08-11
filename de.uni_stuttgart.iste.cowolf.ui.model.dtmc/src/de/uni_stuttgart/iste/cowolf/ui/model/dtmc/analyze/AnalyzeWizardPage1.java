package de.uni_stuttgart.iste.cowolf.ui.model.dtmc.analyze;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;

public class AnalyzeWizardPage1 extends WizardPage {

	private Composite container;

	protected AnalyzeWizardPage1(final String pageName) {
		super(pageName);
		this.setTitle("Define startstates");
		this.setDescription("Define the startstates for this model");
	}

	@Override
	public void createControl(final Composite parent) {
		// TODO Auto-generated method stub
		this.container = new Composite(parent, NONE);
		this.setControl(this.container);

		RowLayout layout = new RowLayout();
		this.container.setLayout(layout);
	}

}
