package de.uni_stuttgart.iste.cowolf.ui.evolution.handlers;

import java.io.File;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
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
import de.uni_stuttgart.iste.cowolf.ui.evolution.wizard.ComponentSelectionWizard;

public class Evolve extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {

        // initialize variables
        Resource firstElementResource = null;
        Resource secondElementResource = null;
        IFile firstElement = null;
        IFile secondElement = null;
        ExtensionHandler extensionHandler = new ExtensionHandler();

        IWorkbenchWindow window = PlatformUI.getWorkbench()
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
        Resource firstModel;
        Resource secondModel;
        if (modelWizard.isFirstModelSelected()) {
            firstModel = firstElementResource;
            secondModel = secondElementResource;
        } else {
            firstModel = secondElementResource;
            secondModel = firstElementResource;
        }

        AbstractEvolutionManager modelManager = extensionHandler
                .getEvolutionManager(firstElementResource);

        SymmetricDifference symmetricDifference;

        try {

            symmetricDifference = modelManager.evolve(firstModel, secondModel);

            String projectRoot = firstElement.getProject().getLocation()
                    .toFile().toString();

            String evolveResultsFilePath = modelManager.saveEvolveResults(
                    symmetricDifference, projectRoot + File.separator
                            + "differences");

            new DifferencesView().open(evolveResultsFilePath);

        } catch (EvolutionException e) {
            MessageDialog.openError(window.getShell(),
                    "Evolution Exception occured", e.getLocalizedMessage());
            e.printStackTrace();
        }

        return null;
    }
}
