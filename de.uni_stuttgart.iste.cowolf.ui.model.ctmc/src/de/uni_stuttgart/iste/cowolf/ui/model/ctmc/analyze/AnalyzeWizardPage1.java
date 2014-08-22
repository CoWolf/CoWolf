package de.uni_stuttgart.iste.cowolf.ui.model.ctmc.analyze;

import java.util.HashMap;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class AnalyzeWizardPage1 extends WizardPage {

	private Composite container;
	private Button btnSimulation;
	private Button btnVerification;
	private Label lblNumberOfSamples;
	private Text txtNumberofsamples;
	private Label lblConfidence;
	private Text txtConfidence;
	private Text txtPathlength;
	private Label lblPathlength;

	protected AnalyzeWizardPage1(final String pageName) {
		super(pageName);
		this.setTitle("Analyze a ctmc model");
		this.setDescription("Analyze a ctmc model");
	}

	@Override
	public void createControl(final Composite parent) {
		this.container = new Composite(parent, SWT.NONE);
		this.setControl(this.container);
		this.container.setLayout(new GridLayout(1, false));

		Group grpVerificationMethod = new Group(this.container, SWT.NONE);
		grpVerificationMethod.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				true, false, 1, 1));
		grpVerificationMethod.setText("Verification Method");
		grpVerificationMethod.setLayout(new GridLayout(1, false));

		this.btnVerification = new Button(grpVerificationMethod, SWT.RADIO);
		this.btnVerification.setSelection(true);
		this.btnVerification.setText("Verification");

		this.btnSimulation = new Button(grpVerificationMethod, SWT.RADIO);
		this.btnSimulation.setText("Simulation");

		ModifyListener changeListener = new ModifyListener() {
			@Override
			public void modifyText(final ModifyEvent e) {
				AnalyzeWizardPage1.this.setPageComplete();
			}
		};

		VerifyListener floatListener = new VerifyListener() {
			@Override
			public void verifyText(final VerifyEvent e) {
				e.doit = e.text.matches("^[\\d.]*$");
				AnalyzeWizardPage1.this.setPageComplete();
			}
		};
		VerifyListener integerListener = new VerifyListener() {
			@Override
			public void verifyText(final VerifyEvent e) {
				e.doit = e.text.matches("\\d*");
			}
		};

		final Group grpSimulationProperties = new Group(this.container, SWT.NONE);
		grpSimulationProperties.setLayoutData(new GridData(SWT.FILL,
				SWT.CENTER, false, false, 1, 1));
		grpSimulationProperties.setText("Simulation properties");
		this.recursiveSetEnabled(grpSimulationProperties, false);
		GridLayout gl_grpSimulationProperties = new GridLayout(2, false);
		gl_grpSimulationProperties.horizontalSpacing = 50;
		grpSimulationProperties.setLayout(gl_grpSimulationProperties);

		this.lblNumberOfSamples = new Label(grpSimulationProperties, SWT.NONE);
		this.lblNumberOfSamples.setText("Number of Samples:");

		this.txtNumberofsamples = new Text(grpSimulationProperties, SWT.BORDER);
		this.txtNumberofsamples.setLayoutData(new GridData(SWT.FILL,
				SWT.CENTER, false, false, 1, 1));
		this.txtNumberofsamples.setText("1000");

		this.lblConfidence = new Label(grpSimulationProperties, SWT.NONE);
		this.lblConfidence.setText("Confidence:");

		this.txtConfidence = new Text(grpSimulationProperties, SWT.BORDER);
		this.txtConfidence.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				false, false, 1, 1));
		this.txtConfidence.setText("0.01");

		this.lblPathlength = new Label(grpSimulationProperties, SWT.NONE);
		this.lblPathlength.setText("Maximum path length:");

		this.txtPathlength = new Text(grpSimulationProperties, SWT.BORDER);
		this.txtPathlength.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				false, false, 1, 1));
		this.txtPathlength.setText("10000");

		this.txtConfidence.addVerifyListener(floatListener);
		this.txtConfidence.addModifyListener(changeListener);
		this.txtNumberofsamples.addVerifyListener(integerListener);
		this.txtNumberofsamples.addModifyListener(changeListener);
		this.txtPathlength.addVerifyListener(integerListener);
		this.txtPathlength.addModifyListener(changeListener);
		AnalyzeWizardPage1.this.recursiveSetEnabled(grpSimulationProperties,
				false);


		this.btnSimulation.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				AnalyzeWizardPage1.this.recursiveSetEnabled(
						grpSimulationProperties, true);
				AnalyzeWizardPage1.this.setPageComplete();
			}

			@Override
			public void widgetDefaultSelected(final SelectionEvent e) {
			}
		});

		this.btnVerification.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				System.out.println("Toggle verification");
				AnalyzeWizardPage1.this.recursiveSetEnabled(
						grpSimulationProperties, false);
				AnalyzeWizardPage1.this.setPageComplete();
			}

			@Override
			public void widgetDefaultSelected(final SelectionEvent e) {
			}
		});
		this.setPageComplete();
	}

	/**
	 * @return the txtNumberofsamples
	 */
	public Text getTxtNumberofsamples() {
		return this.txtNumberofsamples;
	}

	/**
	 * @return the txtConfidence
	 */
	public Text getTxtConfidence() {
		return this.txtConfidence;
	}

	/**
	 * @return the txtPathlength
	 */
	public Text getTxtPathlength() {
		return this.txtPathlength;
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
		if (this.btnVerification.getSelection()) {
			this.setErrorMessage(null);
			this.setPageComplete(true);
		}

		if (this.btnSimulation.getSelection()) {
			int numberSamples = -1;
			double confidence = -1;
			int pathlength = -1;
			if (!this.txtConfidence.getText().isEmpty()) {
				try {
					confidence = Double.parseDouble(this.txtConfidence
							.getText());
				} catch (NumberFormatException e) {
					confidence = -1;
				}
			}

			if (!this.txtNumberofsamples.getText().isEmpty()) {
				try {
					numberSamples = Integer.parseInt(this.txtNumberofsamples
							.getText());
				} catch (NumberFormatException e) {
					numberSamples = -1;
				}
			}

			if (!this.txtPathlength.getText().isEmpty()) {
				try {
					pathlength = Integer.parseInt(this.txtPathlength.getText());
				} catch (NumberFormatException e) {
					pathlength = -1;
				}
			}

			if (numberSamples <= 0) {
				if (this.getErrorMessage() == null) {
					this.setErrorMessage("Number of samples has to be > 0");
				}
				this.setPageComplete(false);
				return;
			}

			if (confidence <= 0 || confidence >= 1) {
				if (this.getErrorMessage() == null) {
					this.setErrorMessage("Confidence has to be > 0 and < 1");
				}
				this.setPageComplete(false);
				return;
			}
			if (pathlength <= 0) {
				if (this.getErrorMessage() == null) {
					this.setErrorMessage("Maximum length of path has to be > 0");
				}
				this.setPageComplete(false);
				return;
			}
		}

		this.setErrorMessage(null);
		this.setPageComplete(true);
	}

	public void setProperties(final HashMap<String, Object> properties) {
		if (this.btnVerification.getSelection()) {
			properties.put("verify", "true");
		}
		if (this.btnSimulation.getSelection()) {
			properties.put("simulation", "true");
			properties.put("samples", this.txtNumberofsamples.getText());
			properties.put("confidence", this.txtConfidence.getText());
			properties.put("pathlength", this.txtPathlength.getText());
		}
	}
}
