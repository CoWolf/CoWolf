package de.uni_stuttgart.iste.cowolf.ui.evolution.wizard;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import de.uni_stuttgart.iste.cowolf.ui.evolution.filter.WorkspaceResourceDialogFilter;
import de.uni_stuttgart.iste.cowolf.ui.evolution.properties.EvolutionTester;

/**
 * This class provides the main wizard content for selecting model and evolution
 * direction.
 *
 * @author Michael Müller
 * @author Rene Trefft
 */
public class ComponentSelectionWizardPage extends WizardPage {

	private final static String RESOURCE_PLUGIN = "/de.uni_stuttgart.iste.cowolf.ui/";;

	/**
	 * Wizard for Model Selection.
	 */
	private ComponentSelectionWizard wizard;
	/**
	 * Radio button for first model.
	 */
	private Button modelAButton;
	/**
	 * Radio button for second model.
	 */
	private Button modelBButton;

	/**
	 * Label for arrow icon.
	 */
	private Label arrowLabel;

	private Image arrowDown;

	private Image arrowUp;

	private boolean isEvolutionPossible;

    private Button checkbox;

    /**
     * Page providing main content for wizard.
     *
     * @param wizard
     */
    protected ComponentSelectionWizardPage(ComponentSelectionWizard wizard) {
        super("Model Evolution");
        this.wizard = wizard;
        this.setDescription("Compare two versions of a model with SiLift.");
        this.setTitle("Compare models with each other.");
        try {
            URI arrowDownURI = URI.createPlatformPluginURI(RESOURCE_PLUGIN
                    + "icons/arrow_down.png", true);
            arrowDown = new Image(Display.getCurrent(), new URL(
                    arrowDownURI.toString()).openStream());
            URI arrowUpURI = URI.createPlatformPluginURI(RESOURCE_PLUGIN
                    + "icons/arrow_up.png", true);
            arrowUp = new Image(Display.getCurrent(), new URL(
                    arrowUpURI.toString()).openStream());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createControl(final Composite parent) {
        Composite container = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout(2, false);
        container.setLayout(layout);

        // row for first model
        this.modelAButton = new Button(container, SWT.RADIO);
        this.modelAButton.setSelection(true);
        this.modelAButton.setText(this.modelToString(this.wizard.getModelA()));
        Button modelAChooser = new Button(container, 0);
        modelAChooser.setText("Browse ...");
        modelAChooser.addSelectionListener(this.browseWorkspace(
                this.wizard.getModelA(), this.modelAButton, parent.getShell()));

        // "arrow" row
        this.arrowLabel = new Label(container, SWT.NONE);
        this.arrowLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING,
                true, false));
        this.arrowLabel.setFont(new Font(null, "Arial", 35, SWT.BOLD));
        this.arrowLabel.setAlignment(SWT.CENTER);
        this.arrowLabel.setImage(arrowDown);
        new Label(container, SWT.NONE);

        // row for second model
        this.modelBButton = new Button(container, SWT.RADIO);
        this.modelAButton.addSelectionListener(this.radioButtonChanged());
        this.modelBButton.addSelectionListener(this.radioButtonChanged());
        this.modelBButton.setText(this.modelToString(this.wizard.getModelB()));
        Button modelBChooser = new Button(container, 0);
        modelBChooser.setText("Browse ...");
        modelBChooser.addSelectionListener(this.browseWorkspace(
                this.wizard.getModelB(), this.modelBButton, parent.getShell()));

        // row for checkbox
        this.checkbox = new Button(container, SWT.CHECK);
        this.checkbox.setText("Add models to Association manager.");
        Label labelCheckbox = new Label(container, SWT.NONE);
        // complete wizard page
        this.setControl(container);

        isEvolutionPossible = new EvolutionTester().isEvolutionPossible(
                wizard.getModelA(), wizard.getModelB());
        setErrorMessage(wizard.getModelA(), wizard.getModelB(),
                isEvolutionPossible);
        this.setPageComplete(isEvolutionPossible);
    }
    /**
     * Returns which of the two models is selected.
     * 
     * @return true if first model is selected.
     */
    public boolean isFirstModelSelected() {
        return this.modelAButton.getSelection();
    }

    /**
     * Returns the string representation of a model file.
     * 
     * @param model
     *            model to get string of.
     * @return
     */
    protected String modelToString(IFile model) {
        if (model != null) {
            String returnString = model.getProject().getName();
            returnString += "/" + model.getProjectRelativePath().toString();
            return returnString;
        }
        return "";
    }

    /**
     * Returns a Selection listener for browsing the workspace.
     * 
     * @param originalModel
     * @param button
     * @param shell
     * @return returns a Selection listener
     */
    protected SelectionListener browseWorkspace(final IFile originalModel,
            final Button button, final Shell shell) {
        SelectionListener listener = new SelectionListener() {

            @Override
            public void widgetSelected(SelectionEvent e) {

                List<ViewerFilter> filters = new ArrayList<ViewerFilter>();
                filters.add(new WorkspaceResourceDialogFilter(wizard
                        .getModelA().getProject().getName()));
                IFile[] files = WorkspaceResourceDialog.openFileSelection(
                        shell, "Choose model file", "Choose model file", true,
                        null, filters);
                if (files.length >= 1) {
                    IFile model = files[0];
                    if (originalModel != null
                            && originalModel.equals(wizard.getModelA())) {
                        wizard.setModelA(model);
                    } else {
                        wizard.setModelB(model);
                    }
                    button.setText(modelToString(model));
                    button.pack();

                    isEvolutionPossible = new EvolutionTester()
                            .isEvolutionPossible(wizard.getModelA(),
                                    wizard.getModelB());
                    setErrorMessage(wizard.getModelA(), wizard.getModelB(),
                            isEvolutionPossible);
                    setPageComplete(isEvolutionPossible);
                }

            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                // nothing to do
            }
        };
        return listener;
    }

    /**
     * Provides SelectionListener if the selection of a radio button (group)
     * changed.
     *
     * @return
     */
    protected SelectionListener radioButtonChanged() {
        SelectionListener listener = new SelectionListener() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                if (modelAButton.getSelection()) {
                    setErrorMessage(wizard.getModelA(), wizard.getModelB(),
                            isEvolutionPossible);
                    arrowLabel.setImage(arrowDown);
                } else if (modelBButton.getSelection()) {
                    arrowLabel.setImage(arrowUp);
                    setErrorMessage(wizard.getModelB(), wizard.getModelA(),
                            isEvolutionPossible);
                }

            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
            }
        };
        return listener;
    }

    private void setErrorMessage(IFile oldModel, IFile newModel,
            boolean isEvolutionPossible) {
        if (oldModel == null && newModel != null) {
            setErrorMessage("Source model for comparison is not selected.");
        } else if (oldModel != null && newModel == null) {
            setErrorMessage("Target model for comparison is not selected.");
        } else if (isEvolutionPossible) {
            setErrorMessage(null);
        } else {
            setErrorMessage("Selected models are not of the same type.");
        }
    }

    public boolean isAssociatonSelected() {
        return this.checkbox.getSelection();
    }

}
