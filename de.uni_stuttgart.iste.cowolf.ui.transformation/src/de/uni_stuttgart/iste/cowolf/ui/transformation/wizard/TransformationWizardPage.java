package de.uni_stuttgart.iste.cowolf.ui.transformation.wizard;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Vector;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import de.uni_stuttgart.iste.cowolf.ui.evolution.properties.EvolutionTester;
import de.uni_stuttgart.iste.cowolf.ui.transformation.filter.TransformationModelsFilter;

public class TransformationWizardPage extends WizardPage {

    private final static String RESOURCE_PLUGIN = "/de.uni_stuttgart.iste.cowolf.ui/";
    /**
     * Wizard for Model Selection.
     */
    private TransformationWizard wizard;
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
    private boolean isTransformationPossible;

    private final static int SOURCE_MODEL_A = 0;
    private final static int SOURCE_MODEL_B = 1;
    private final static int TARGET_MODEL = 2;

    /**
     * Page providing main content for wizard.
     *
     * @param wizard
     */
    protected TransformationWizardPage(TransformationWizard wizard) {
        // TODO Title + Description
        super("Co-Evolution");
        this.wizard = wizard;
        this.setDescription("Co-Evolve.");
        this.setTitle("Co-Evolve.");
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
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void createControl(final Composite parent) {
        Composite container = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout(3, false);
        container.setLayout(layout);

        // row for first source model
        this.modelAButton = new Button(container, SWT.RADIO);
        this.modelAButton.setSelection(true);
        Label labelA = new Label(container, SWT.NONE);
        labelA.setText(this.modelToString(this.wizard.getSourceModelA()));
        Button modelAChooser = new Button(container, 0);
        modelAChooser.setText("Browse ...");
        modelAChooser.addSelectionListener(this.browseWorkspace(SOURCE_MODEL_A,
                labelA, parent.getShell()));

        // "arrow" row
        new Label(container, SWT.NONE);
        this.arrowLabel = new Label(container, SWT.NONE);
        this.arrowLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING,
                true, false));
        this.arrowLabel.setAlignment(SWT.CENTER);
        this.arrowLabel.setImage(arrowDown);
        new Label(container, SWT.NONE);

        // row for second source model
        this.modelBButton = new Button(container, SWT.RADIO);
        this.modelAButton.addSelectionListener(this.radioButtonChanged());
        this.modelBButton.addSelectionListener(this.radioButtonChanged());
        final Label labelB = new Label(container, SWT.NONE);
        labelB.setText(this.modelToString(this.wizard.getSourceModelB()));
        Button modelBChooser = new Button(container, 0);
        modelBChooser.setText("Browse ...");
        modelBChooser.addSelectionListener(this.browseWorkspace(SOURCE_MODEL_B,
                labelB, parent.getShell()));

        // row for target model
        new Label(container, SWT.NONE);
        final Label labelC = new Label(container, SWT.NONE);
        labelC.setText(this.modelToString(this.wizard.getTargetModel()));
        Button modelCChooser = new Button(container, 0);
        modelCChooser.setText("Browse ...");
        modelCChooser.addSelectionListener(this.browseWorkspace(TARGET_MODEL,
                labelC, parent.getShell()));

        // complete wizard page
        this.setControl(container);
        isEvolutionPossible = new EvolutionTester().isEvolutionPossible(
                wizard.getSourceModelA(), wizard.getSourceModelB());
        setErrorMessage(wizard.getSourceModelA(), wizard.getSourceModelB(),
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
     * @param label
     * @param shell
     * @return returns a Selection listener
     */
    protected SelectionListener browseWorkspace(final int modelCode,
            final Label label, final Shell shell) {
        SelectionListener listener = new SelectionListener() {

            @Override
            public void widgetSelected(SelectionEvent e) {

                List<ViewerFilter> filters = new Vector<>();
                filters.add(new TransformationModelsFilter());
                IFile[] files = WorkspaceResourceDialog.openFileSelection(
                        shell, "Choose model file", "Choose model file", true,
                        null, filters);
                if (files.length >= 1) {
                    IFile model = files[0];
                    if (modelCode == SOURCE_MODEL_A) {
                        wizard.setSourceModelA(model);
                    } else if (modelCode == SOURCE_MODEL_B) {
                        wizard.setSourceModelB(model);
                    } else if (modelCode == TARGET_MODEL) {
                        wizard.setTargetModel(model);
                    }
                    label.setText(modelToString(model));
                    label.pack();

                    isEvolutionPossible = new EvolutionTester()
                            .isEvolutionPossible(wizard.getSourceModelA(),
                                    wizard.getSourceModelB());
                    setErrorMessage(wizard.getSourceModelA(),
                            wizard.getSourceModelB(), isEvolutionPossible);
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
                    setErrorMessage(wizard.getSourceModelA(),
                            wizard.getSourceModelB(), isEvolutionPossible);
                    arrowLabel.setImage(arrowDown);
                } else if (modelBButton.getSelection()) {
                    arrowLabel.setImage(arrowUp);
                    setErrorMessage(wizard.getSourceModelB(),
                            wizard.getSourceModelA(), isEvolutionPossible);
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
            setErrorMessage("Selected source models are not of the same type.");
        }
    }

}
