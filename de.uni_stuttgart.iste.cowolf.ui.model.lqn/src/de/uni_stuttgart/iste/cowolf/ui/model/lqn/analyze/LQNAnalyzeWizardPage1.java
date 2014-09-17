package de.uni_stuttgart.iste.cowolf.ui.model.lqn.analyze;

import java.util.HashMap;

import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (mpe).
 */

public class LQNAnalyzeWizardPage1 extends WizardPage {

	private Composite container;
	private Button btnServiceTime;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public LQNAnalyzeWizardPage1(String pageName) {
		super(pageName);
		this.setTitle("Analyze a LQN model");
		this.setDescription("Analyze a LQN model");
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		this.container = new Composite(parent, SWT.NONE);
		this.setControl(this.container);
		this.container.setLayout(new GridLayout(1, false));

		Group grpVerificationMethod = new Group(this.container, SWT.NONE);
		grpVerificationMethod.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				true, false, 1, 1));
		grpVerificationMethod.setText("Analysis Method");
		grpVerificationMethod.setLayout(new GridLayout(1, false));

		this.btnServiceTime = new Button(grpVerificationMethod, SWT.RADIO);
		this.btnServiceTime.setSelection(true);
		this.btnServiceTime.setText("Service Time");
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
		if (this.btnServiceTime.getSelection()) {
			properties.put("typeOfAnalysis", "serviceTime");
		}
	}
}