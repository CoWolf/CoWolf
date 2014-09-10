package de.uni_stuttgart.iste.cowolf.ui.evolution.handlers;

import java.io.File;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.sidiff.difference.symmetric.SymmetricDifference;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociation;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationFactory;
import de.uni_stuttgart.iste.cowolf.evolution.AbstractEvolutionManager;
import de.uni_stuttgart.iste.cowolf.evolution.EvolutionException;
import de.uni_stuttgart.iste.cowolf.evolution.EvolutionRegistry;
import de.uni_stuttgart.iste.cowolf.ui.evolution.DifferencesView;
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


    	if (!PlatformUI.getWorkbench().saveAllEditors(true)) {
    		return null;
    	}
    	
        // initialize variables

        final IWorkbenchWindow window = PlatformUI.getWorkbench()
                .getActiveWorkbenchWindow();

        IStructuredSelection selection = (IStructuredSelection) window
                .getSelectionService().getSelection();
        
        
        EvolutionRegistry extensionHandler = EvolutionRegistry
                .getInstance();
        final IFile iFile = (IFile) selection.getFirstElement();
        final Resource sourceResource = getResourceOfIFile(iFile); 
        final AbstractEvolutionManager evoManager = extensionHandler.getEvolutionManager(sourceResource);
        
        ModelAssociation ma = ModelAssociationFactory.eINSTANCE.getModelAssociation(iFile.getProject());
        Model sourceModel = ma.getModel(sourceResource);
        
        ComponentSelectionWizard wizard = new ComponentSelectionWizard(iFile, sourceModel);
        WizardDialog dialog = new WizardDialog(window.getShell(), wizard);
        if (dialog.open() == WizardDialog.CANCEL) {
        	return null;
        }
        final Resource baseVersion = wizard.getBaseVersion();
        final Resource targetVersion = wizard.getTargetVersion();
        
        Job job = new Job("Model Evolution") {
            @Override
            protected IStatus run(IProgressMonitor monitor) {
                try {
                    SymmetricDifference symmetricDifference = evoManager.evolve(baseVersion, targetVersion);
                    String projectRoot = iFile.getProject().getLocation()
                            .toFile().toString();
                    
                    final String evolveResultsFilePath = evoManager
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
    
    private Resource getResourceOfIFile(IFile model) {
        URI uri = URI.createURI(model.getLocationURI().toString());
        ResourceSet resourceSet = new ResourceSetImpl();
        try {
            Resource modelResource = resourceSet.getResource(uri, true);
            return modelResource;
        } catch (Exception exc) {
        }

        return null;
    }
}
