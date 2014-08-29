package de.uni_stuttgart.iste.cowolf.ui.model.ctmc.analyze;

import java.util.HashMap;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.SimpleContentProposalProvider;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.widgets.Combo;

public class EditPropertiesWizard extends WizardPage {

	private Composite container;

	private Resource resource;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;

	protected EditPropertiesWizard(final String pageName, final Resource res) {
		super(pageName);
		this.resource = res;
		this.setTitle("Analyze a ctmc model");
		this.setDescription("Select properties to analyze.");
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
		combo.setItems(new String[] {"Steady State Probability", "Probabilistic Existence", "Probabilistic Until", "Probabilistic Response"});
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
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
		text_1.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);

		Button btnAfter = new Button(grpCslproperties, SWT.RADIO);
		btnAfter.setText("after");
		
		text_2 = new Text(grpCslproperties, SWT.BORDER);
		text_2.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);

		Button btnBetween = new Button(grpCslproperties, SWT.RADIO);
		btnBetween.setText("between");
		
		text_3 = new Text(grpCslproperties, SWT.BORDER);
		text_3.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		
		CLabel lblAnd = new CLabel(grpCslproperties, SWT.NONE);
		lblAnd.setText("and");
		
		text_4 = new Text(grpCslproperties, SWT.BORDER);
		text_4.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		
		Combo combo_1 = new Combo(grpCslproperties, SWT.READ_ONLY);
		combo_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		new Label(grpCslproperties, SWT.NONE);
		
		Combo combo_2 = new Combo(grpCslproperties, SWT.READ_ONLY);
		combo_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
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



	}

	public void setProperties(final HashMap<String, Object> properties) {

	}

	@Override
	public boolean isPageComplete() {
		this.setErrorMessage(null);
		this.setErrorMessage("Please make at least one selection.");
		return false;
	}

	/**
	 * This class is used to ptovide an example of showing completion feature in
	 * a text field.
	 * 
	 * @author Debadatta Mishra(PIKU)
	 *
	 */
	public class AutoCompletionTextField {
		/**
		 * A label for for display of message.
		 */
		private Label label = null;
		/**
		 * Object of type {@link Text} to display a text field
		 */
		private Text text = null;
		/**
		 * A String array of default proposals for autocompletion
		 */
		private String[] defaultProposals = new String[] { "Assistance 1",
				"Assistance 2", "Assistance 3", "Assistance 4", "Assistance 5" };
		/**
		 * A String for key press
		 */
		private String KEY_PRESS = "Ctrl+Space";

		/**
		 * Method used to create a label.
		 * 
		 * @author Debadatta Mishra (PIKU)
		 * @param shell
		 *            of type {@link Shell}
		 */
		private void createLabel(Shell shell) {
			label = new Label(shell, SWT.NONE);
			label.setText("Enter some text in the text field");
			// Alignment of label in the shell
			FormData label1LData = new FormData();
			label1LData.width = 162;
			label1LData.height = 15;
			label1LData.left = new FormAttachment(0, 1000, 12);
			label1LData.top = new FormAttachment(0, 1000, 12);
			label.setLayoutData(label1LData);
		}

		/**
		 * Method used to display an array of String data for autocompletion.
		 * You can have your own method like this to get the autocompletion
		 * data. This method can be customized to get the data from database and
		 * you can display as autocompletion array.
		 * 
		 * @param text
		 *            of type String
		 * @return an array of String data
		 * @author Debadatta Mishra (PIKU)
		 */
		private String[] getAllProposals(String text) {
			String[] proposals = new String[5];
			if (text == null || text.length() == 0)
				proposals = defaultProposals;
			else {
				for (int i = 0; i < 5; i++)
					proposals[i] = text + i;
			}
			return proposals;
		}

		/**
		 * This method is used to provide the implementaion of eclipse
		 * autocompletion feature. User has to press "CTRL+Space" to see the
		 * autocompletion effect.
		 * 
		 * @param text
		 *            of type {@link Text}
		 * @param value
		 *            of type String
		 * @author Debadatta Mishra (PIKU)
		 */
		private void setAutoCompletion(Text text, String value) {
			try {
				ContentProposalAdapter adapter = null;
				String[] defaultProposals = getAllProposals(value);
				SimpleContentProposalProvider scp = new SimpleContentProposalProvider(
						defaultProposals);
				scp.setProposals(defaultProposals);
				KeyStroke ks = KeyStroke.getInstance(KEY_PRESS);
				adapter = new ContentProposalAdapter(text,
						new TextContentAdapter(), scp, ks, null);
				adapter.setProposalAcceptanceStyle(ContentProposalAdapter.PROPOSAL_REPLACE);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		/**
		 * Method used to create a text field.
		 * 
		 * @author Debadatta Mishra (PIKU)
		 * @param shell
		 *            of type {@link Shell}
		 * @author Debadatta Mishra (PIKU)
		 */
		private void createText(Shell shell) {
			text = new Text(shell, SWT.BORDER);
			// Alignment of Text field in the shell
			FormData text1LData = new FormData();
			text1LData.width = 223;
			text1LData.height = 34;
			text1LData.left = new FormAttachment(0, 1000, 236);
			text1LData.top = new FormAttachment(0, 1000, 12);
			text.setLayoutData(text1LData);
			// Method for autocompletion
			setAutoCompletion(text, null);

			text.addKeyListener(new KeyAdapter() {
				public void keyReleased(KeyEvent ke) {
					// Method for autocompletion
					setAutoCompletion(text, text.getText());
				}
			});
		}

		/**
		 * Main method to execute the test
		 * 
		 * @author Debadatta Mishra (PIKU)
		 * @param args
		 *            of type {@link String}
		 */
		public void main(String[] args) {
			final Display display = new Display();
			final Shell shell = new Shell(display, SWT.CLOSE);
			shell.setText("A text field with autocompletion support, press CTRL+Space to see the effect");
			shell.setLayout(new FormLayout());
			shell.setSize(600, 200);

			createLabel(shell);
			createText(shell);

			shell.open();
			while (!shell.isDisposed()) {
				if (!display.readAndDispatch())
					display.sleep();
			}
			display.dispose();
		}

	}
}
