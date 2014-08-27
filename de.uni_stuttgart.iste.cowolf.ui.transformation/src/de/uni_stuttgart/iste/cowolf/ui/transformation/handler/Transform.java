package de.uni_stuttgart.iste.cowolf.ui.transformation.handler;

import java.io.File;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.henshin.trace.impl.TraceImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.sidiff.difference.symmetric.SymmetricDifference;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociationManager.ModelAssociationManager;
import de.uni_stuttgart.iste.cowolf.core.extensions.ExtensionHandler;
import de.uni_stuttgart.iste.cowolf.evolution.AbstractEvolutionManager;
import de.uni_stuttgart.iste.cowolf.evolution.EvolutionException;
import de.uni_stuttgart.iste.cowolf.transformation.AbstractTransformationManager;
import de.uni_stuttgart.iste.cowolf.ui.evolution.DifferencesView;
import de.uni_stuttgart.iste.cowolf.ui.transformation.wizard.TransformationWizard;

/**
 * The transformation action is handled here.
 *
 * @author Michael Zimmermann
 */
public class Transform extends AbstractHandler {

    private ExtensionHandler extensionHandler;

    public Transform() {
        this.extensionHandler = ExtensionHandler.getInstance();
    }

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        // initialize variables
        IFile firstSourceElement = null;
        IFile secondSourceElement = null;
        IFile targetElement = null;
        IFile tempElement = null;
        Resource firstSourceModel = null;
        Resource secondSourceModel = null;
        Resource targetModel = null;
        Resource tempModel = null;

        final IWorkbenchWindow window = PlatformUI.getWorkbench()
                .getActiveWorkbenchWindow();

        IStructuredSelection selection = (IStructuredSelection) window
                .getSelectionService().getSelection();

        List<?> list = selection.toList();

        if (list.size() >= 1) {
            firstSourceElement = (IFile) list.get(0);
            firstSourceModel = this.getResourceOfIFile(firstSourceElement);
        }
        if (list.size() >= 2) {
            tempElement = (IFile) list.get(1);
            tempModel = this.getResourceOfIFile(tempElement);

            // If first and second element of different type, make second
            // element to third element
            if (this.extensionHandler.getEvolutionManager(firstSourceModel)
                    .equals(this.extensionHandler
                            .getEvolutionManager(tempModel))) {
                secondSourceModel = tempModel;
                secondSourceElement = tempElement;
            } else {
                targetModel = tempModel;
                targetElement = tempElement;
            }
        }
        if (list.size() >= 3) {
            tempElement = (IFile) list.get(2);
            tempModel = this.getResourceOfIFile(tempElement);

            // Element one and two of same type.
            if (targetModel == null) {
                targetModel = this.getResourceOfIFile(tempElement);
                targetElement = tempElement;

                // Element one and three of same type
            } else if (this.extensionHandler.getEvolutionManager(
                    firstSourceModel).equals(
                    this.extensionHandler.getEvolutionManager(tempModel))) {
                secondSourceModel = this.getResourceOfIFile(tempElement);
                secondSourceElement = tempElement;

                // Element two and three of same type
            } else {
                secondSourceElement = tempElement;
                secondSourceModel = tempModel;
                tempElement = firstSourceElement;
                tempModel = firstSourceModel;
                firstSourceElement = targetElement;
                firstSourceModel = targetModel;
                targetElement = tempElement;
                targetModel = tempModel;
            }
        }
        String resultFile = null;
        if (targetModel != null) {
            resultFile = this.getResultFileName(targetModel);
        }

        final TransformationWizard modelWizard = new TransformationWizard(
                firstSourceElement, secondSourceElement, targetElement,
                resultFile);
        WizardDialog wizard = new WizardDialog(window.getShell(), modelWizard);
        if (wizard.open() == Window.CANCEL) {
            return null;
        }

        if (modelWizard.isFirstModelSelected()) {
            firstSourceModel = this.getResourceOfIFile(modelWizard
                    .getSourceModelA());
            secondSourceModel = this.getResourceOfIFile(modelWizard
                    .getSourceModelB());
        } else {
            firstSourceModel = this.getResourceOfIFile(modelWizard
                    .getSourceModelB());
            secondSourceModel = this.getResourceOfIFile(modelWizard
                    .getSourceModelA());
        }
        final URI result = modelWizard.getResultFile();
        System.out.println(result);
        if (modelWizard.isAssociationSelected()) {
            ModelAssociationManager manager = ModelAssociationManager
                    .getInstance();
            manager.addAssociation(firstSourceModel, secondSourceModel,
                    firstSourceElement.getProject());
            manager.addAssociation(secondSourceModel, targetModel,
                    firstSourceElement.getProject());
        }
        final Resource firstSource = firstSourceModel;
        final Resource secondSource = secondSourceModel;
        final Resource target = this.getResourceOfIFile(modelWizard
                .getTargetModel());
        final IFile firstElement = firstSourceElement;
        final AbstractEvolutionManager evoManager = this.extensionHandler
                .getEvolutionManager(firstSourceModel);

        final AbstractTransformationManager transManager = this.extensionHandler
                .getTransformationManager(firstSourceModel, target);
        if (evoManager != null && transManager != null) {

            Job job = new Job("Model Co-Evolution") {

                @Override
                protected IStatus run(IProgressMonitor monitor) {
                    SymmetricDifference difference = null;
                    try {
                        List<EObject> list = secondSource.getContents();
                        URI uri = secondSource.getURI();
                        Resource filteredSecondSource = secondSource
                                .getResourceSet().createResource(uri);
                        for (int index = 0; index < list.size(); index++) {
                            EObject root = list.get(index);
                            System.out.println(root);
                            // root is a Trace and has source and target
                            if (root.getClass() == TraceImpl.class) {
                                int hasSource = ((TraceImpl) root).getSource()
                                        .size();
                                int hasTarget = ((TraceImpl) root).getTarget()
                                        .size();

                                if (hasSource >= 1 && hasTarget >= 1) {
                                    filteredSecondSource.getContents()
                                            .add(root);
                                }

                            } else {
                                filteredSecondSource.getContents().add(root);
                            }
                        }
                        filteredSecondSource.save(null);
                        difference = evoManager.evolve(firstSource,
                                filteredSecondSource);
                        Resource transformedModel = transManager.transform(
                                firstSource, filteredSecondSource, target,
                                difference, result);
                        final AbstractEvolutionManager evoManager = extensionHandler
                                .getEvolutionManager(target);
                        if (evoManager != null) {
                            System.out.println(target);
                            System.out.println(transformedModel);
                            difference = evoManager.evolve(target,
                                    transformedModel);
                            String projectRoot = firstElement.getProject()
                                    .getLocation().toFile().toString();
                            final String evolveResultsFilePath = evoManager
                                    .saveEvolveResults(difference, projectRoot
                                            + File.separator + "differences");
                            Display.getDefault().asyncExec(new Runnable() {

                                @Override
                                public void run() {
                                    new DifferencesView()
                                            .open(evolveResultsFilePath);
                                }
                            });
                        }
                    } catch (final EvolutionException e) {
                        e.printStackTrace();
                        Display.getDefault().syncExec(new Runnable() {

                            @Override
                            public void run() {
                                MessageDialog.openError(window.getShell(),
                                        "Evolution Exception occured",
                                        e.getLocalizedMessage());
                                e.printStackTrace();

                            }
                        });
                        return Status.CANCEL_STATUS;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return Status.CANCEL_STATUS;
                    }
                    return Status.OK_STATUS;
                }
            };
            job.schedule();

        }

        return null;
    }
    private Resource getResourceOfIFile(IFile model) {
        URI uri = URI.createPlatformResourceURI(model.getFullPath().toString(),
                true);
        ResourceSet resourceSet = new ResourceSetImpl();
        try {
            Resource modelResource = resourceSet.getResource(uri, true);
            return modelResource;
        } catch (Exception exc) {
        }

        return null;
    }

    /**
     * Returns the filename, where the result of the transformation should be
     * stored.
     * 
     * @param res
     *            Resource to save.
     * @return FileName
     */
    private String getResultFileName(Resource res) throws NullPointerException {
        String fileUri = res.getURI().toString();
        String extension = fileUri.substring(fileUri.lastIndexOf('.'),
                fileUri.length());
        String fileNameNoExtension = fileUri.substring(0,
                fileUri.lastIndexOf('.'));

        // start with parsing of file number
        int fileNumber = 0;
        boolean isNumber = true;
        int counter = 0;
        int nameLength = 0;
        while (isNumber) {
            try {
                // parse number at end of file.
                nameLength = fileNameNoExtension.length() - (counter + 1);
                fileNumber = Integer.parseInt(fileNameNoExtension
                        .substring(nameLength));
                counter++;
            } catch (NumberFormatException e) {
                isNumber = false;
                // add 1 as last character is no number anymore.
                nameLength++;
            }
        }
        fileNumber++;

        return fileNameNoExtension.substring(0, nameLength) + fileNumber
                + extension;
    }
}