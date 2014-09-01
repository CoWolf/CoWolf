package de.uni_stuttgart.iste.cowolf.ui.model.ctmc.analyze;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import de.uni_stuttgart.iste.cowolf.model.ctmc.CTMC;
import de.uni_stuttgart.iste.cowolf.model.ctmc.State;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.PCTLStandaloneSetup;

public class EditPropertiesWizardPage1 extends WizardPage {

	private Composite container;

	private Resource resource;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;
	private Text text_5;

	private Combo combo;
	private Combo combo_1;
	private Combo combo_2;
	
	private Button btnTimeboundradio; 
	private Button btnWithin;
	private Button btnAfter;
	private Button btnBetween;

	String key;
	String value;

	protected EditPropertiesWizardPage1(final String pageName,
			final Resource res, String key, String value) {
		super(pageName);
		this.resource = res;
		this.setTitle("Analyze a ctmc model");
		this.setDescription("Create properties to analyze.");
		this.key = key;
		this.value = value;
	}

	@Override
	public void createControl(final Composite parent) {
		this.container = new Composite(parent, SWT.NONE);
		this.setControl(this.container);
		this.container.setLayout(new GridLayout(1, false));

		Group grpCslproperties = new Group(container, SWT.NONE);
		grpCslproperties.setLayout(new GridLayout(4, false));
		grpCslproperties.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				false, 1, 1));
		grpCslproperties.setText("Create properties");

		combo = new Combo(grpCslproperties, SWT.READ_ONLY);
		combo.setItems(new String[] { "Steady State Probability",
				"Probabilistic Existence", "Probabilistic Until",
				"Probabilistic Response" });
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1,
				1));
		combo.select(0);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);

		combo_1 = new Combo(grpCslproperties, SWT.READ_ONLY);
		combo_1.setToolTipText("");
		combo_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false,
				1, 1));
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);

		combo_2 = new Combo(grpCslproperties, SWT.READ_ONLY);
		combo_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false,
				1, 1));
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);

		btnTimeboundradio = new Button(grpCslproperties, SWT.RADIO);
		btnTimeboundradio.setText("No Time Bound");
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);

		btnWithin = new Button(grpCslproperties, SWT.RADIO);
		btnWithin.setText("within");

		text_1 = new Text(grpCslproperties, SWT.BORDER);
		text_1.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false,
				1, 1));
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);

		btnAfter = new Button(grpCslproperties, SWT.RADIO);
		btnAfter.setText("after");

		text_2 = new Text(grpCslproperties, SWT.BORDER);
		text_2.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false,
				1, 1));
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);

		btnBetween = new Button(grpCslproperties, SWT.RADIO);
		btnBetween.setText("between");

		text_3 = new Text(grpCslproperties, SWT.BORDER);
		text_3.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false,
				1, 1));

		CLabel lblAnd = new CLabel(grpCslproperties, SWT.NONE);
		lblAnd.setText("and");

		text_4 = new Text(grpCslproperties, SWT.BORDER);
		text_4.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false,
				1, 1));
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);

		Button btnCreateProperty = new Button(grpCslproperties, SWT.NONE);
		btnCreateProperty.setText("Create Property");
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		btnCreateProperty.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				createPRISMProperty();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
			}
		});

		Group grpTexteditor = new Group(container, SWT.NONE);
		grpTexteditor.setLayout(new GridLayout(1, false));
		grpTexteditor.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));
		grpTexteditor.setText("Edit properties");

		Label lblPropertyName = new Label(grpTexteditor, SWT.NONE);
		lblPropertyName.setText("Property Name");

		text_5 = new Text(grpTexteditor, SWT.BORDER);
		GridData gd_text_5 = new GridData(SWT.LEFT, SWT.CENTER, false, false,
				1, 1);
		gd_text_5.widthHint = 449;
		text_5.setLayoutData(gd_text_5);
		text_5.setText(key);

		Label lblProperty = new Label(grpTexteditor, SWT.NONE);
		lblProperty.setText("Property");

		text = new Text(grpTexteditor, SWT.BORDER | SWT.MULTI);
		GridData gd_text = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_text.heightHint = 200;
		text.setLayoutData(gd_text);
		text.setText(value);
		text.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				// TODO Auto-generated method stub
				getContainer().updateButtons();

			}

		});

		if (resource != null && resource.getContents() != null
				&& resource.getContents().get(0) != null
				&& ((CTMC) resource.getContents().get(0)).getStates() != null) {
			ArrayList<String> statesAndLabels = new ArrayList<String>();
			for (State state : ((CTMC) resource.getContents().get(0))
					.getStates()) {
				if (state.getName() != null && !state.getName().isEmpty()) {
					String stateName = "State:" + state.getName();
					if (!statesAndLabels.contains(stateName)) {
						statesAndLabels.add(stateName);
					}
					for (de.uni_stuttgart.iste.cowolf.model.ctmc.Label label : state
							.getLabels()) {
						String labelName = "Label:" + label.getName();
						if (!statesAndLabels.contains(labelName)) {
							statesAndLabels.add(labelName);
						}
					}
				}
			}
			combo_1.setItems(statesAndLabels.toArray(new String[statesAndLabels
					.size()]));
			combo_2.setItems(statesAndLabels.toArray(new String[statesAndLabels
					.size()]));
		}

	}

	@Override
	public boolean isPageComplete() {
		try {
			File smFile = File.createTempFile("temp", ".pctl");

			FileOutputStream out = new FileOutputStream(
					smFile.getAbsolutePath());
			out.write(text.getText().getBytes());
			out.close();

			PCTLStandaloneSetup.doSetup();

			ResourceSet resourceSet = new ResourceSetImpl();
			URI uri = URI.createFileURI(smFile.getCanonicalPath());
			Resource resource = resourceSet.getResource(uri, true);

			smFile.delete();
			if (resource.getErrors().size() > 0) {
				this.setErrorMessage(resource.getErrors().get(0).getMessage());
				return false;
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setErrorMessage(null);
		return true;
	}

	public String getKey() {
		return text_5.getText();
	}

	public String getValue() {
		return text.getText();
	}

	public void setKey(String key) {
		text_5.setText(key);
	}

	public void setValue(String value) {
		text.setText(value);
	}

	private void createPRISMProperty() {
		if (combo_1.getSelectionIndex() == -1) {
			return;
		}
		if (combo.getSelectionIndex() == 0) {
			setKey("Steady State Probability for "
					+ combo_1.getItem(combo_1.getSelectionIndex()));
			setValue("S=? [ " + combo_1.getItem(combo_1.getSelectionIndex())
					+ " ]");
		}
		if (combo.getSelectionIndex() == 1) {
			setKey("Probabilistic Existance for "
					+ combo_1.getItem(combo_1.getSelectionIndex()));
			if (btnTimeboundradio.getSelection()) {
				setValue("P=? [ F (" + combo_1.getItem(combo_1.getSelectionIndex())
						+ ") ]");	
			} else if (btnWithin.getSelection()) {
				setValue("P=? [ F<=" + text_1.getText() + " (" + combo_1.getItem(combo_1.getSelectionIndex())
						+ ") ]");
			} else if (btnAfter.getSelection()) {
				setValue("P=? [ F>=" + text_2.getText() + " ( " + combo_1.getItem(combo_1.getSelectionIndex())
						+ ") ]");
			} else if (btnBetween.getSelection()) {
				setValue("P=? [ F [" + text_3.getText() + "," + text_4.getText() + "] (" + combo_1.getItem(combo_1.getSelectionIndex())
						+ ") ]");
			} 
			
		}
		if (combo_2.getSelectionIndex() == -1) {
			return;
		}
		if (combo.getSelectionIndex() == 2) {
			setKey("Probabilistic Until for "
					+ combo_1.getItem(combo_1.getSelectionIndex())  + " and " + combo_2.getItem(combo_2.getSelectionIndex()));
			if (btnTimeboundradio.getSelection()) {
				setValue("P=? [ (" + combo_1.getItem(combo_1.getSelectionIndex()) + ") U ("+  combo_2.getItem(combo_2.getSelectionIndex()) + ") ]");	
			} else if (btnWithin.getSelection()) {
				setValue("P=? [ (" + combo_1.getItem(combo_1.getSelectionIndex()) + ") U<="+ text_1.getText() + " ("+  combo_2.getItem(combo_2.getSelectionIndex()) + ") ]");
			} else if (btnAfter.getSelection()) {
				setValue("P=? [ (" + combo_1.getItem(combo_1.getSelectionIndex()) + ") U>="+ text_2.getText() + " ("+  combo_2.getItem(combo_2.getSelectionIndex()) + ") ]");
			} else if (btnBetween.getSelection()) {
				setValue("P=? [ (" + combo_1.getItem(combo_1.getSelectionIndex()) + ") U ["+ text_3.getText() + "," + text_4.getText() + "] ("+  combo_2.getItem(combo_2.getSelectionIndex()) + ") ]");
			} 
		}
	}
}
