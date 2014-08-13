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
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.sidiff.difference.symmetric.SymmetricDifference;

import de.uni_stuttgart.iste.cowolf.core.extensions.ExtensionHandler;
import de.uni_stuttgart.iste.cowolf.evolution.AbstractEvolutionManager;
import de.uni_stuttgart.iste.cowolf.evolution.EvolutionException;
import de.uni_stuttgart.iste.cowolf.ui.evolution.DifferencesView;
import de.uni_stuttgart.iste.cowolf.ui.evolution.properties.EvolutionTester;
import de.uni_stuttgart.iste.cowolf.ui.evolution.wizard.ComponentSelectionWizard;

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
        List list = selection.toList();
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
        EvolutionTester tester = new EvolutionTester();
        if (modelWizard.isFirstModelSelected()) {
            firstModel = tester.getResourceOfIFile(modelWizard.getModelA());
            secondModel = tester.getResourceOfIFile(modelWizard.getModelB());
        } else {
            firstModel = tester.getResourceOfIFile(modelWizard.getModelB());
            secondModel = tester.getResourceOfIFile(modelWizard.getModelA());
        }
        final IFile element = firstElement;
        Job job = new Job("Model Evolution") {

            @Override
            protected IStatus run(IProgressMonitor monitor) {
                try {
                    ExtensionHandler extensionHandler = new ExtensionHandler();
                    AbstractEvolutionManager modelManager = extensionHandler
                            .getEvolutionManager(firstModel);
                    SymmetricDifference symmetricDifference = modelManager
                            .evolve(firstModel, secondModel);
                    String projectRoot = element.getProject().getLocation()
                            .toFile().toString();

                    String evolveResultsFilePath = modelManager
                            .saveEvolveResults(symmetricDifference, projectRoot
                                    + File.separator + "differences");

                    new DifferencesView().open(evolveResultsFilePath);
                    return Status.OK_STATUS;
                } catch (EvolutionException e) {
                    MessageDialog.openError(window.getShell(),
                            "Evolution Exception occured",
                            e.getLocalizedMessage());
                    e.printStackTrace();
                }
                return Status.CANCEL_STATUS;
            }

        };
        job.schedule();
        return null;
    }
}
