package de.uni_stuttgart.iste.cowolf.ui.evolution.handlers;

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
import org.eclipse.emf.ecore.resource.Resource;
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
import de.uni_stuttgart.iste.cowolf.ui.evolution.DifferencesView;
import de.uni_stuttgart.iste.cowolf.ui.evolution.util.ResourceUtil;
import de.uni_stuttgart.iste.cowolf.ui.evolution.wizard.ComponentSelectionWizard;

/**
 * This class handles the evolution call by eclipse
 * 
 * @author Michael Müller
 *
 */
public class Evolve extends AbstractHandler {
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {

        // initialize variables
        IFile firstElement = null;
        IFile secondElement = null;

        final IWorkbenchWindow window = PlatformUI.getWorkbench()
                .getActiveWorkbenchWindow();

        IStructuredSelection selection = (IStructuredSelection) window
                .getSelectionService().getSelection();
        List<?> list = selection.toList();
        if (list.size() >= 1) {
            firstElement = (IFile) list.get(0);
        }
        if (list.size() == 2) {
            secondElement = (IFile) list.get(1);
        }
        ComponentSelectionWizard modelWizard = new ComponentSelectionWizard(
                firstElement, secondElement);
        WizardDialog wizard = new WizardDialog(window.getShell(), modelWizard);
        if (wizard.open() == Window.CANCEL) {
            return null;
        }
        final Resource firstModel;
        final Resource secondModel;

        if (modelWizard.isFirstModelSelected()) {
            firstModel = ResourceUtil.getResourceOfIFile(modelWizard
                    .getModelA());
            secondModel = ResourceUtil.getResourceOfIFile(modelWizard
                    .getModelB());
        } else {
            firstModel = ResourceUtil.getResourceOfIFile(modelWizard
                    .getModelB());
            secondModel = ResourceUtil.getResourceOfIFile(modelWizard
                    .getModelA());
        }
        if (modelWizard.isAssociationSelected()) {
            ModelAssociationManager.getInstance().addAssociation(firstModel,
                    secondModel, firstElement.getProject());
        }
        final IFile element = firstElement;
        Job job = new Job("Model Evolution") {
            @Override
            protected IStatus run(IProgressMonitor monitor) {
                try {
                    ExtensionHandler extensionHandler = ExtensionHandler
                            .getInstance();
                    AbstractEvolutionManager modelManager = extensionHandler
                            .getEvolutionManager(firstModel);
                    SymmetricDifference symmetricDifference = modelManager
                            .evolve(firstModel, secondModel);
                    String projectRoot = element.getProject().getLocation()
                            .toFile().toString();

                    final String evolveResultsFilePath = modelManager
                            .saveEvolveResults(symmetricDifference, projectRoot
                                    + File.separator + "differences");
                    Display.getDefault().asyncExec(new Runnable() {

                        @Override
                        public void run() {
                            new DifferencesView().open(evolveResultsFilePath);
                        }
                    });
                    return Status.OK_STATUS;
                } catch (final EvolutionException e) {
                    Display.getDefault().syncExec(new Runnable() {

                        @Override
                        public void run() {
                            MessageDialog.openError(window.getShell(),
                                    "Evolution Exception occured",
                                    e.getLocalizedMessage());
                            e.printStackTrace();

                        }
                    });

                }
                return Status.CANCEL_STATUS;
            }

        };
        job.schedule();
        return null;
    }
}
