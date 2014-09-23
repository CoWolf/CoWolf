package de.uni_stuttgart.iste.cowolf.ui.model.ctmc.analyze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;



import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.ui.editor.validation.IValidationIssueProcessor;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Injector;

import de.uni_stuttgart.iste.cowolf.model.ctmc.CTMC;
import de.uni_stuttgart.iste.cowolf.model.ctmc.State;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Comment;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Fragment;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PCTLFactory;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Rule;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Start;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.ui.internal.PCTLActivator;

@SuppressWarnings("restriction")
public class EditPropertiesWizardPage1 extends WizardPage {

	private boolean xtextValid;

	private Composite container;

	private Resource resource;
	EmbeddedEditorModelAccess partialEditorModelAccess;
	private XtextResource xtextResource;
	
	private Text text_3;
	private Text text_4;
	private Text text_5;

	private Combo combo;
	private Combo combo_1;
	private Combo combo_2;

	Comment key;
	Rule value;
	private Combo combo_3;
	private Label lblProperty_1;
	private Label lblFor;
	private Label lblAnd_1;
	private Label lblHoldsWithProbability;
	private Label lblWithin;
	private Combo combo_4;
	private Text text_1;
	private Composite composite;

	protected EditPropertiesWizardPage1(final String pageName,
			final Resource res, Comment key2, Rule value2) {
		super(pageName);
		this.resource = res;
		this.setTitle("Analyze a ctmc model");
		this.setDescription("Create properties to analyze.");
		this.key = key2;
		this.value = value2;
		
		this.xtextValid = false;
	}

	@Override
	public void createControl(final Composite parent) {
		this.container = new Composite(parent, SWT.NONE);
		this.setControl(this.container);
		this.container.setLayout(new GridLayout(1, false));

		final Group grpCslproperties = new Group(container, SWT.NONE);
		grpCslproperties.setLayout(new GridLayout(5, false));
		grpCslproperties.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				false, 1, 1));
		grpCslproperties.setText("Create properties");

		lblProperty_1 = new Label(grpCslproperties, SWT.NONE);
		lblProperty_1.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false,
				false, 1, 1));
		lblProperty_1.setText("Property");

		combo = new Combo(grpCslproperties, SWT.READ_ONLY);
		combo.setItems(new String[] { "Steady State Probability",
				"Probabilistic Existence", "Probabilistic Until",
				"Probabilistic Response" });
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1,
				1));
		combo.select(0);
		combo.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				if (combo.getSelectionIndex() == 0) {
					lblFor.setText("Probability that");
					lblAnd_1.setText("-");
					lblWithin.setText("-");
					lblHoldsWithProbability.setText("eventually is true is");
					combo_2.setEnabled(false);
					combo_4.setEnabled(false);
				}
				if (combo.getSelectionIndex() == 1) {
					lblFor.setText("Probability that");
					lblAnd_1.setText("-");
					lblWithin.setText("is true within");
					lblHoldsWithProbability.setText("is");
					combo_2.setEnabled(false);
					combo_4.setEnabled(true);
				}
				if (combo.getSelectionIndex() == 2) {
					lblFor.setText("Probability that");
					lblAnd_1.setText("always was true before");
					lblWithin.setText("becomes true within");
					lblHoldsWithProbability.setText("is");
					combo_2.setEnabled(true);
					combo_4.setEnabled(true);
				}
				if (combo.getSelectionIndex() == 3) {
					lblFor.setText("If");
					lblAnd_1.setText("was true, ");
					lblWithin.setText("will be true within");
					lblHoldsWithProbability.setText("with probability");
					combo_2.setEnabled(true);
					combo_4.setEnabled(true);
				}
				grpCslproperties.layout();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);

		lblFor = new Label(grpCslproperties, SWT.NONE);
		lblFor.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false,
				1, 1));
		lblFor.setText("Probability that");

		combo_1 = new Combo(grpCslproperties, SWT.READ_ONLY);
		combo_1.setToolTipText("");
		combo_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false,
				1, 1));
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);

		lblAnd_1 = new Label(grpCslproperties, SWT.NONE);
		lblAnd_1.setText("-");
		lblAnd_1.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false,
				false, 1, 1));

		combo_2 = new Combo(grpCslproperties, SWT.READ_ONLY);
		combo_2.setEnabled(false);
		combo_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false,
				1, 1));
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);

		lblWithin = new Label(grpCslproperties, SWT.NONE);
		lblWithin.setText("-");
		lblWithin.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false,
				false, 1, 1));

		combo_4 = new Combo(grpCslproperties, SWT.READ_ONLY);
		combo_4.setEnabled(false);
		combo_4.setItems(new String[] { "no time bound", "within ...",
				"after ...", "between ... and ..." });
		combo_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		combo_4.select(0);

		text_3 = new Text(grpCslproperties, SWT.BORDER);
		text_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false,
				1, 1));

		CLabel lblAnd = new CLabel(grpCslproperties, SWT.NONE);
		lblAnd.setText("and");

		text_4 = new Text(grpCslproperties, SWT.BORDER);
		text_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false,
				1, 1));

		lblHoldsWithProbability = new Label(grpCslproperties, SWT.NONE);
		lblHoldsWithProbability.setLayoutData(new GridData(SWT.CENTER,
				SWT.CENTER, false, false, 1, 1));
		lblHoldsWithProbability.setText("eventually is true is");

		combo_3 = new Combo(grpCslproperties, SWT.READ_ONLY);
		combo_3.setItems(new String[] { ">", ">=", "<=", "<", "=?" });
		combo_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		combo_3.select(4);

		text_1 = new Text(grpCslproperties, SWT.BORDER);
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false,
				1, 1));
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);

		Button btnCreateProperty = new Button(grpCslproperties, SWT.NONE);
		btnCreateProperty.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				false, false, 1, 1));
		btnCreateProperty.setText("Create Property");
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
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);

		Group grpTexteditor = new Group(container, SWT.NONE);
		grpTexteditor.setLayout(new GridLayout(1, false));
		grpTexteditor.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));
		grpTexteditor.setText("Edit properties");

		Label lblPropertyName = new Label(grpTexteditor, SWT.NONE);
		lblPropertyName.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		lblPropertyName.setText("Property Name");
		
		
		text_5 = new Text(grpTexteditor, SWT.BORDER);
		text_5.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		if (key != null) {
			text_5.setText(key.getComment().replaceFirst("^/+\\s*", "").trim());
		}

		Label lblProperty = new Label(grpTexteditor, SWT.NONE);
		lblProperty.setText("Property");

		
		composite = new Composite(grpTexteditor, SWT.BORDER);
		composite.setLayout(new GridLayout(1, true));
		GridData gd_composite = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_composite.heightHint = 121;
		composite.setLayoutData(gd_composite);
		
		IEditedResourceProvider resourceProvider = new IEditedResourceProvider() {
		    public XtextResource createResource() {
		    	PCTLActivator activator = PCTLActivator.getInstance();
		        Injector injector = activator.getInjector(PCTLActivator.DE_UNI_STUTTGART_ISTE_COWOLF_MODEL_CTMC_XTEXT_PCTL);

		        XtextResourceSet rs = injector.getInstance(XtextResourceSet.class);
		        rs.setClasspathURIContext(getClass());

		        IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
		        URI uri = URI.createURI("temp.pctl");
		        xtextResource = (XtextResource) resourceFactory.createResource(uri);
		        rs.getResources().add(xtextResource);

		        EcoreUtil.resolveAll(xtextResource);

		        if (!xtextResource.getErrors().isEmpty()) {
		            // handle error?
		        }
		        return xtextResource;
		    }};

		PCTLActivator activator = PCTLActivator.getInstance();
		Injector injector = activator.getInjector(PCTLActivator.DE_UNI_STUTTGART_ISTE_COWOLF_MODEL_CTMC_XTEXT_PCTL);
		EmbeddedEditorFactory factory = injector.getInstance(EmbeddedEditorFactory.class);
		
		EmbeddedEditor embeddedEditor = factory.newEditor(resourceProvider)
			.showErrorAndWarningAnnotations()
			.processIssuesBy(new IValidationIssueProcessor() {
				
				@Override
				public void processIssues(List<Issue> issues, IProgressMonitor monitor) {
					if (issues == null || issues.size() <= 0) {
						EditPropertiesWizardPage1.this.xtextValid = true;
					} else {
						EditPropertiesWizardPage1.this.xtextValid = false;
					}
					
					Display.getDefault().asyncExec(new Runnable() {
						
						@Override
						public void run() {
							EditPropertiesWizardPage1.this.getContainer().updateButtons();
						}
					});
				}
			})
			.withParent(composite);
		
		this.partialEditorModelAccess = embeddedEditor.createPartialEditor(false);
		
		this.setValue(this.value);
	
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
			Collections.sort(statesAndLabels,
					new OrderAlphabeticallyComparator());
			combo_1.setItems(statesAndLabels.toArray(new String[statesAndLabels
					.size()]));
			combo_2.setItems(statesAndLabels.toArray(new String[statesAndLabels
					.size()]));
		}

	}

	public class OrderAlphabeticallyComparator implements Comparator<String> {
		@Override
		public int compare(String sortKey1, String sortKey2) {
			return sortKey1.compareTo(sortKey2);
		}
	}

	@Override
	public boolean isPageComplete() {
		if (!this.xtextValid) {
			this.setErrorMessage("Please enter a correct PCTL expression");
			return false;
		}
//		try {
//			//File smFile = File.createTempFile("temp", ".pctl");
//
//			/**FileOutputStream out = new FileOutputStream(
//					smFile.getAbsolutePath());
//			out.write(text.getText().getBytes());
//			out.close();
//
//			PCTLStandaloneSetup.doSetup();
//
//			ResourceSet resourceSet = new ResourceSetImpl();
//			URI uri = URI.createFileURI(smFile.getCanonicalPath());
//			Resource resource = resourceSet.getResource(uri, true);
//
//			smFile.delete();
//			if (resource.getErrors().size() > 0) {
//				this.setErrorMessage(resource.getErrors().get(0).getMessage());
//				return false;
//			}
//			*/
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		this.setErrorMessage(null);
		return true;
	}

	public Comment getKey() {
		if (key != null) {
			key.setComment(key.getComment().replaceFirst("^(/+\\s*).*$", "$1"+text_5.getText().trim().replace("\n", "")));
		} else {
			this.key = PCTLFactory.eINSTANCE.createComment();
			key.setComment("// " + text_5.getText().trim().replace("\n", "") + "\n");
		}
		return key;
	}
	
	public Rule getValue() {
		for (Fragment f : ((Start) xtextResource.getContents().get(0)).getRule()) {
			if (f instanceof Rule) {
				return (Rule) f;
			}
		}
		return null;
	}

	public void setKey(String key) {
		text_5.setText(key);
	}
	
	public void setValue(String value) {
		partialEditorModelAccess.updateModel("", value.trim(), "");
	}

	public void setValue(Rule value) {
		if (value == null) {
			return;
		}		
		String text = NodeModelUtils.findActualNodeFor(value).getText().trim();
		partialEditorModelAccess.updateModel("", text, "\n");
	}

	private void createPRISMProperty() {
		if (combo_1.getSelectionIndex() == -1) {
			return;
		}

		String probString = "=?";
		if (combo_3.getSelectionIndex() == 0) {
			probString = "> " + text_1.getText();
		} else if (combo_3.getSelectionIndex() == 1) {
			probString = ">= " + text_1.getText();
		} else if (combo_3.getSelectionIndex() == 2) {
			probString = "<= " + text_1.getText();
		} else if (combo_3.getSelectionIndex() == 3) {
			probString = "< " + text_1.getText();
		}

		String timeString = "";
		String timeResultString = "";
		if (combo_4.getSelectionIndex() == 1) {
			timeString = "within " + text_3.getText() + " ";
			timeResultString = "<= " + text_3.getText() + " ";
		} else if (combo_4.getSelectionIndex() == 2) {
			timeString = "after " + text_3.getText() + " ";
			timeResultString = ">= " + text_3.getText() + " ";
		} else if (combo_4.getSelectionIndex() == 3) {
			timeString = "between " + text_3.getText() + " and "
					+ text_4.getText() + " ";
			timeResultString = "[" + text_3.getText() + ", " + text_4.getText()
					+ "] ";
		}
		if (combo.getSelectionIndex() == 0) {
			if (probString.equals("=?"))
				setKey("Steady State Probability: Probability that "
						+ combo_1.getItem(combo_1.getSelectionIndex())
						+ " eventually is true is ?");
			else
				setKey("Steady State Probability: "
						+ combo_1.getItem(combo_1.getSelectionIndex())
						+ " eventually is true with probability " + probString);
			setValue("S " + probString + " [ "
					+ combo_1.getItem(combo_1.getSelectionIndex()) + " ]");
		}

		if (combo.getSelectionIndex() == 1) {
			if (probString.equals("=?"))
				setKey("Probabilistic Existance: Probability that "
						+ combo_1.getItem(combo_1.getSelectionIndex())
						+ " is true " + timeString + "is ?");
			else
				setKey("Probabilistic Existance: "
						+ combo_1.getItem(combo_1.getSelectionIndex())
						+ " is true " + timeString + "with probability "
						+ probString);
			setValue("P " + probString + " [ F " + timeResultString + "("
					+ combo_1.getItem(combo_1.getSelectionIndex()) + ") ]");

		}
		if (combo_2.getSelectionIndex() == -1) {
			return;
		}
		if (combo.getSelectionIndex() == 2) {
			if (probString.equals("=?"))
				setKey("Probabilistic Until: Probability that "
						+ combo_1.getItem(combo_1.getSelectionIndex())
						+ " always was true before "
						+ combo_2.getItem(combo_2.getSelectionIndex())
						+ " becomes true " + timeString + "is ?");
			else
				setKey("Probabilistic Until: "
						+ combo_1.getItem(combo_1.getSelectionIndex())
						+ " always was true before "
						+ combo_2.getItem(combo_2.getSelectionIndex())
						+ " becomes true " + timeString + "with probability "
						+ probString);
			setValue("P " + probString + " [ ("
					+ combo_1.getItem(combo_1.getSelectionIndex()) + ") U "
					+ timeResultString + "("
					+ combo_2.getItem(combo_2.getSelectionIndex()) + ") ]");
		}
		if (combo.getSelectionIndex() == 3) {
			if (probString.equals("=?")) {
				probString = ">= 0 ";
			}
			setKey("Probabilistic Response: If "
					+ combo_1.getItem(combo_1.getSelectionIndex())
					+ " was true, "
					+ combo_2.getItem(combo_2.getSelectionIndex())
					+ " will be true " + timeString + "with probability "
					+ probString);

			setValue("P >= 1 [ G ( ("
					+ combo_1.getItem(combo_1.getSelectionIndex()) + ") => P "
					+ probString + " [ F " + timeResultString + "("
					+ combo_2.getItem(combo_2.getSelectionIndex()) + ") ] ) ]");
		}
	}
}
