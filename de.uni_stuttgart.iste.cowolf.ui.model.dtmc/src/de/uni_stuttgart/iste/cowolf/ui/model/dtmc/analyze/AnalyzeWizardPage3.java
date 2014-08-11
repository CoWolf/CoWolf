package de.uni_stuttgart.iste.cowolf.ui.model.dtmc.analyze;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;

public class AnalyzeWizardPage3 extends WizardPage {

	private Composite container;

	protected AnalyzeWizardPage3(final String pageName) {
		super(pageName);
		this.setTitle("Titel 3");
		this.setDescription("Description3");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createControl(final Composite parent) {
		this.container = new Composite(parent, SWT.NULL);
		this.setControl(this.container);
		RowLayout layout = new RowLayout();
		this.container.setLayout(layout);



	}


}
