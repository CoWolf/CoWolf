package de.uni_stuttgart.iste.cowolf.ui.model.fault_tree.analyze;

import java.util.HashMap;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;

public class FaultTreeAnalyzeWizardPage1 extends WizardPage {

	private Composite container;
	private Button btnMinimalCutsets;
	private Button btnProbabilityTopEvent;

	protected FaultTreeAnalyzeWizardPage1(final String pageName) {
		super(pageName);
		this.setTitle("Analyze a fault tree model");
		this.setDescription("Analyze a fault tree model");
	}

	@Override
	public void createControl(final Composite parent) {
		this.container = new Composite(parent, SWT.NONE);
		this.setControl(this.container);
		this.container.setLayout(new GridLayout(1, false));

		Group grpVerificationMethod = new Group(this.container, SWT.NONE);
		grpVerificationMethod.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				true, false, 1, 1));
		grpVerificationMethod.setText("Analysis Method");
		grpVerificationMethod.setLayout(new GridLayout(1, false));

		this.btnProbabilityTopEvent = new Button(grpVerificationMethod, SWT.RADIO);
		this.btnProbabilityTopEvent.setSelection(true);
		this.btnProbabilityTopEvent.setText("Probability of top event");

		this.btnMinimalCutsets = new Button(grpVerificationMethod, SWT.RADIO);
		this.btnMinimalCutsets.setText("Minimal cutsets");

		this.setPageComplete();
	}

	public void recursiveSetEnabled(final Control ctrl, final boolean enabled) {
		if (ctrl instanceof Composite) {
			Composite comp = (Composite) ctrl;
			for (Control c : comp.getChildren())
				this.recursiveSetEnabled(c, enabled);
		} else {
			ctrl.setEnabled(enabled);
		}
	}

	private void setPageComplete() {

		this.setErrorMessage(null);
		this.setPageComplete(true);
	}

	public void setProperties(final HashMap<String, Object> properties) {
		if (this.btnProbabilityTopEvent.getSelection()) {
			properties.put("typeOfAnalysis", "probabilityTopEvent");
		}
		if (this.btnMinimalCutsets.getSelection()) {
			properties.put("typeOfAnalysis", "minimalCutSets");
		}
	}
}
