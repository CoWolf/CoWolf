package de.uni_stuttgart.iste.cowolf.ui.model.ctmc.analyze;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
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

public class EditPropertiesWizardPage1 extends WizardPage {

	private Composite container;

	private Resource resource;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;

	protected EditPropertiesWizardPage1(final String pageName,
			final Resource res) {
		super(pageName);
		this.resource = res;
		this.setTitle("Analyze a ctmc model");
		this.setDescription("Create properties to analyze.");
	}

	@Override
	public void createControl(final Composite parent) {
		this.container = new Composite(parent, SWT.NONE);
		this.setControl(this.container);
		this.container.setLayout(new GridLayout(1, false));

		Group grpCslproperties = new Group(container, SWT.NONE);
		grpCslproperties.setLayout(new GridLayout(4, false));
		grpCslproperties.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));
		grpCslproperties.setText("CSLProperties");
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);

		Combo combo = new Combo(grpCslproperties, SWT.READ_ONLY);
		combo.setItems(new String[] { "Steady State Probability",
				"Probabilistic Existence", "Probabilistic Until",
				"Probabilistic Response" });
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1,
				1));
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);

		Button btnTimeboundradio = new Button(grpCslproperties, SWT.RADIO);
		btnTimeboundradio.setText("No Time Bound");
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);

		Button btnWithin = new Button(grpCslproperties, SWT.RADIO);
		btnWithin.setText("within");

		text_1 = new Text(grpCslproperties, SWT.BORDER);
		text_1.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false,
				1, 1));
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);

		Button btnAfter = new Button(grpCslproperties, SWT.RADIO);
		btnAfter.setText("after");

		text_2 = new Text(grpCslproperties, SWT.BORDER);
		text_2.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false,
				1, 1));
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);

		Button btnBetween = new Button(grpCslproperties, SWT.RADIO);
		btnBetween.setText("between");

		text_3 = new Text(grpCslproperties, SWT.BORDER);
		text_3.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false,
				1, 1));

		CLabel lblAnd = new CLabel(grpCslproperties, SWT.NONE);
		lblAnd.setText("and");

		text_4 = new Text(grpCslproperties, SWT.BORDER);
		text_4.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false,
				1, 1));

		Combo combo_1 = new Combo(grpCslproperties, SWT.READ_ONLY);
		combo_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false,
				1, 1));
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);

		Combo combo_2 = new Combo(grpCslproperties, SWT.READ_ONLY);
		combo_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false,
				1, 1));
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);

		Button btnCreateProperty = new Button(grpCslproperties, SWT.NONE);
		btnCreateProperty.setText("Create Property");
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);

		Group grpTexteditor = new Group(container, SWT.NONE);
		grpTexteditor.setLayout(new GridLayout(1, false));
		grpTexteditor.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));
		grpTexteditor.setText("TextEditor");

		text = new Text(grpTexteditor, SWT.BORDER | SWT.MULTI);
		text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

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
						System.out.println(stateName);
					}
					for (de.uni_stuttgart.iste.cowolf.model.ctmc.Label label : state
							.getLabels()) {
						String labelName = "Label:" + label.getName();
						if (!statesAndLabels.contains(labelName)) {
							System.out.println(labelName);
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
		this.setErrorMessage(null);
		return true;
	}

}
