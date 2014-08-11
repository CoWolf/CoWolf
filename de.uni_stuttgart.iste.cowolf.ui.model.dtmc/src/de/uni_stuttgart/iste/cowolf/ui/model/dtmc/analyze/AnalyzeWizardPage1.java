package de.uni_stuttgart.iste.cowolf.ui.model.dtmc.analyze;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
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
		this.setTitle("Analyze a dtmc model");
		this.setDescription("Analyze a dtmc model");
	}

	@Override
	public void createControl(final Composite parent) {
		this.container = new Composite(parent, SWT.NONE);
		this.setControl(this.container);

		Group grpVerificationMethod = new Group(this.container, SWT.NONE);
		grpVerificationMethod.setText("Verification Method");
		grpVerificationMethod.setBounds(10, 10, 554, 314);

		this.btnSimulation = new Button(grpVerificationMethod, SWT.RADIO);
		this.btnSimulation.setBounds(10, 41, 90, 16);
		this.btnSimulation.setText("Simulation");

		this.btnVerification = new Button(grpVerificationMethod, SWT.RADIO);
		this.btnVerification.setSelection(true);
		this.btnVerification.setBounds(10, 19, 90, 16);
		this.btnVerification.setText("Verification");

		final Group grpSimulationProperties = new Group(grpVerificationMethod, SWT.NONE);
		grpSimulationProperties.setText("Simulation properties");
		grpSimulationProperties.setBounds(10, 63, 534, 115);
		this.btnVerification.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				System.out.println("Toggle verification");
				AnalyzeWizardPage1.this.recursiveSetEnabled(grpSimulationProperties, false);
				AnalyzeWizardPage1.this.setPageComplete();
			}

			@Override
			public void widgetDefaultSelected(final SelectionEvent e) {
			}
		});

		this.btnSimulation.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				System.out.println("Toggle simulation");
				AnalyzeWizardPage1.this.recursiveSetEnabled(grpSimulationProperties, true);
				AnalyzeWizardPage1.this.setPageComplete();
			}

			@Override
			public void widgetDefaultSelected(final SelectionEvent e) {
			}
		});
		this.recursiveSetEnabled(grpSimulationProperties, false);

		this.lblNumberOfSamples = new Label(grpSimulationProperties, SWT.NONE);
		this.lblNumberOfSamples.setBounds(10, 23, 123, 15);
		this.lblNumberOfSamples.setText("Number of Samples:");

		this.txtNumberofsamples = new Text(grpSimulationProperties, SWT.BORDER);
		this.txtNumberofsamples.setText("1000");
		this.txtNumberofsamples.setBounds(139, 20, 76, 21);

		this.lblConfidence = new Label(grpSimulationProperties, SWT.NONE);
		this.lblConfidence.setBounds(10, 50, 88, 15);
		this.lblConfidence.setText("Confidence:");

		this.txtConfidence = new Text(grpSimulationProperties, SWT.BORDER);
		this.txtConfidence.setText("0.01");
		this.txtConfidence.setBounds(139, 47, 76, 21);

		this.txtPathlength = new Text(grpSimulationProperties, SWT.BORDER);
		this.txtPathlength.setText("10000");
		this.txtPathlength.setBounds(139, 79, 76, 21);

		this.lblPathlength = new Label(grpSimulationProperties, SWT.NONE);
		this.lblPathlength.setBounds(10, 82, 123, 15);
		this.lblPathlength.setText("Maximum path length:");
		this.setPageComplete();

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

		this.txtConfidence.addVerifyListener(floatListener);
		this.txtConfidence.addModifyListener(changeListener);
		this.txtNumberofsamples.addVerifyListener(integerListener);
		this.txtNumberofsamples.addModifyListener(changeListener);
		this.txtPathlength.addVerifyListener(integerListener);
		this.txtPathlength.addModifyListener(changeListener);
		AnalyzeWizardPage1.this.recursiveSetEnabled(grpSimulationProperties, false);
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
			this.setPageComplete(true);
			return;
		}

		if (this.btnSimulation.getSelection()) {
			int numberSamples = -1;
			double confidence = -1;
			int pathlength = -1;
			if (!this.txtConfidence.getText().isEmpty()) {
				try {
					confidence = Double.parseDouble(this.txtConfidence.getText());
				} catch (NumberFormatException e) {
					confidence = -1;
				}
			}

			if (!this.txtNumberofsamples.getText().isEmpty()) {
				try {
					numberSamples = Integer.parseInt(this.txtNumberofsamples.getText());
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
			if (numberSamples > 0
					&& confidence > 0 && confidence < 1
					&& pathlength > 0) {
				this.setPageComplete(true);
				return;
			}
		}

		this.setPageComplete(false);
	}
}
