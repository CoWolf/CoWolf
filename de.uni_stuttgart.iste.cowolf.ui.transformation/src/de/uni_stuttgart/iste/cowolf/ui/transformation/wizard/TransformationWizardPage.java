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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import de.uni_stuttgart.iste.cowolf.ui.evolution.properties.EvolutionTester;
import de.uni_stuttgart.iste.cowolf.ui.transformation.filter.TransformationModelsFilter;
import de.uni_stuttgart.iste.cowolf.ui.transformation.properties.TransformationTester;

/**
 * Transformation Wizard Page to select models for evolution step as well as the
 * transformation model.
 *
 * @author Michael M�ller
 * @author Michael Zimmermann
 */
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

    private Button checkbox;

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

        GridLayout gridLayout = new GridLayout(1, true);
        gridLayout.verticalSpacing = 15;
        container.setLayout(gridLayout);
        GridData gridData = new GridData(SWT.FILL, SWT.BEGINNING, true, false);

        // Group for evolution model selection
        GridLayout layout = new GridLayout(2, false);
        layout.marginTop = 5;
        layout.marginRight = 5;
        layout.marginBottom = 5;
        Group evoGroup = new Group(container, SWT.SHADOW_ETCHED_IN);
        evoGroup.setText("Specify evolution models");
        evoGroup.setLayout(layout);
        evoGroup.setLayoutData(gridData);

        // row for first source model
        this.modelAButton = new Button(evoGroup, SWT.RADIO);
        this.modelAButton.setSelection(true);
        this.modelAButton.setText(this.modelToString(this.wizard
                .getSourceModelA()));
        Button modelAChooser = new Button(evoGroup, 0);
        modelAChooser.setText("Browse ...");
        modelAChooser.addSelectionListener(this.browseWorkspace(SOURCE_MODEL_A,
                this.modelAButton, parent.getShell()));

        // "arrow" row
        this.arrowLabel = new Label(evoGroup, SWT.NONE);
        this.arrowLabel.setLayoutData(gridData);
        this.arrowLabel.setAlignment(SWT.CENTER);
        this.arrowLabel.setImage(arrowDown);
        new Label(evoGroup, SWT.NONE);

        // row for second source model
        this.modelBButton = new Button(evoGroup, SWT.RADIO);
        this.modelAButton.addSelectionListener(this.radioButtonChanged());
        this.modelBButton.addSelectionListener(this.radioButtonChanged());
        this.modelBButton.setText(this.modelToString(this.wizard
                .getSourceModelB()));
        Button modelBChooser = new Button(evoGroup, 0);
        modelBChooser.setText("Browse ...");
        modelBChooser.addSelectionListener(this.browseWorkspace(SOURCE_MODEL_B,
                this.modelBButton, parent.getShell()));

        // Group for transformation model selection
        GridLayout layout2 = new GridLayout(2, false);
        layout2.marginLeft = 18;
        layout2.marginTop = 5;
        layout2.marginRight = 5;
        layout2.marginBottom = 5;
        Group transGroup = new Group(container, SWT.SHADOW_ETCHED_IN);
        transGroup.setText("Specify co-evolution model");
        transGroup.setLayout(layout2);
        transGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true,
                false));

        // row for transformation model
        Label labelC = new Label(transGroup, SWT.NONE);
        labelC.setText(this.modelToString(this.wizard.getTargetModel()));
        labelC.setLayoutData(new GridData(55, GridData.CENTER, true, false));
        Button modelCChooser = new Button(transGroup, 0);
        modelCChooser.setLayoutData(new GridData(GridData.END, GridData.CENTER,
                true, false));
        modelCChooser.setText("Browse ...");
        modelCChooser.addSelectionListener(this.browseWorkspace(TARGET_MODEL,
                modelCChooser, parent.getShell()));

        this.checkbox = new Button(container, SWT.CHECK);
        this.checkbox.setText("Save associations.");
        // complete wizard page
        this.setControl(container);
        isEvolutionPossible = new EvolutionTester().isEvolutionPossible(
                wizard.getSourceModelA(), wizard.getSourceModelB());
        isTransformationPossible = new TransformationTester()
                .isTransformationPossible(wizard.getSourceModelA(),
                        wizard.getSourceModelB(), wizard.getTargetModel());
        setErrorMessage(wizard.getSourceModelA(), wizard.getSourceModelB(),
                wizard.getTargetModel(), isEvolutionPossible,
                isTransformationPossible);

        this.setPageComplete(isEvolutionPossible && isTransformationPossible);
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
    protected SelectionListener browseWorkspace(final int modelCode,
            final Button button, final Shell shell) {
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
                    button.setText(modelToString(model));
                    button.pack();

                    isEvolutionPossible = new EvolutionTester()
                            .isEvolutionPossible(wizard.getSourceModelA(),
                                    wizard.getSourceModelB());
                    isTransformationPossible = new TransformationTester()
                            .isTransformationPossible(wizard.getSourceModelA(),
                                    wizard.getSourceModelB(),
                                    wizard.getTargetModel());

                    setErrorMessage(wizard.getSourceModelA(),
                            wizard.getSourceModelB(), wizard.getTargetModel(),
                            isEvolutionPossible, isTransformationPossible);

                    setPageComplete(isEvolutionPossible
                            && isTransformationPossible);
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
                            wizard.getSourceModelB(), wizard.getTargetModel(),
                            isEvolutionPossible, isTransformationPossible);
                    arrowLabel.setImage(arrowDown);
                } else if (modelBButton.getSelection()) {
                    arrowLabel.setImage(arrowUp);
                    setErrorMessage(wizard.getSourceModelB(),
                            wizard.getSourceModelA(), wizard.getTargetModel(),
                            isEvolutionPossible, isTransformationPossible);
                }

            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
            }
        };
        return listener;
    }

    private void setErrorMessage(IFile modelA, IFile modelB, IFile modelC,
            boolean isEvolutionPossible, boolean isTransformationPossible) {
        if (modelA == null && modelB != null) {
            setErrorMessage("Source model for comparison is not selected.");
        } else if (modelA != null && modelB == null) {
            setErrorMessage("Target model for comparison is not selected.");
        } else if (!isEvolutionPossible) {
            setErrorMessage("Selected evolution models are not of the same type.");
        } else if (modelC == null) {
            setErrorMessage("Target model for co-evolution is not selected.");
        } else if (isEvolutionPossible && isTransformationPossible) {
            setErrorMessage(null);
        } else {
            setErrorMessage("Selected co-evolution model is of the same type as the evolution models.");
        }
    }

    public boolean isAssociationSelected() {
        return this.checkbox.getSelection();
    }

}
