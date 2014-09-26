package de.uni_stuttgart.iste.cowolf.ui.evolution.handlers;

import java.io.File;
import java.io.FileNotFoundException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
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
import org.sidiff.difference.asymmetric.facade.util.Difference;
import org.sidiff.difference.lifting.settings.LiftingSettings;
import org.sidiff.difference.symmetric.SymmetricDifference;
import org.silift.common.util.access.EMFModelAccessEx;
import org.silift.common.util.ui.UIUtil;
import org.silift.patching.patch.PatchCreator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
	
	private final static Logger LOGGER = LoggerFactory.getLogger(Evolve.class);
	
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
        final IFile iFile = (IFile) selection.getFirstElement();
        if (iFile == null) {
        	return null;
        }
     
        ModelAssociation ma = ModelAssociationFactory.eINSTANCE.getModelAssociation(iFile.getProject());
        if (ma == null) {
        	return null;
        }
        
        EvolutionRegistry extensionHandler = EvolutionRegistry
                .getInstance();
        final Resource sourceResource = getResourceOfIFile(iFile); 
        if (sourceResource == null) {
        	return null;
        }
        final AbstractEvolutionManager evoManager = extensionHandler.getEvolutionManager(sourceResource);

        final Model sourceModel = ma.getModel(sourceResource);
        
        ComponentSelectionWizard wizard = new ComponentSelectionWizard(iFile, sourceModel);
        WizardDialog dialog = new WizardDialog(window.getShell(), wizard);
        if (dialog.open() == WizardDialog.CANCEL) {
        	return null;
        }
        final Resource baseVersion = wizard.getBaseVersion();
        final Resource targetVersion = wizard.getTargetVersion();
        final File patchFile = wizard.getPatchFile();
        
        Job job = new Job("Model Evolution") {
            @Override
            protected IStatus run(IProgressMonitor monitor) {
                try {
                	Difference diff = evoManager.getDiff(baseVersion, targetVersion);
                	
                    SymmetricDifference symmetricDifference = diff.getSymmetric();
                    
                    String projectRoot = iFile.getProject().getLocation().toFile().toString();
                    
                    final String evolveResultsFilePath = evoManager
                            .saveEvolveResults(symmetricDifference, projectRoot
                                    + File.separator + "differences");
                    
                    if (patchFile != null) {
                    	LiftingSettings settings = evoManager.getDefaultSettings(EMFModelAccessEx.getCharacteristicDocumentType(baseVersion),
                    			baseVersion, targetVersion);
                    	
                    	PatchCreator patchCreator = new PatchCreator(diff.getAsymmetric(), settings);
                    	
                    	try {
							final String patchPath = patchCreator.serializePatch(patchFile.toString());
							
							Display.getDefault().asyncExec(new Runnable() {
	            				@Override
	            				public void run() {
	            					try {
	            						
	            						UIUtil.openEditor(patchPath);	
	            					} catch (OperationCanceledException e) {

	            					} catch (FileNotFoundException e) {
	            						LOGGER.warn("Can't find patch file.", e);
	            					}
	            				}
	            			});
						} catch (FileNotFoundException e) {
							LOGGER.error("Can't write patch file", e);
							MessageDialog.openError(window.getShell(), "Can't create patch", "Could not create patch file.");
						}
                    	
                    } else {
                    
	                    Display.getDefault().asyncExec(new Runnable() {
	
	                        @Override
	                        public void run() {
	                            new DifferencesView().open(evolveResultsFilePath);
	                        }
	                    });
	                    return Status.OK_STATUS;
                    }
                } catch (final EvolutionException e) {
                    Display.getDefault().syncExec(new Runnable() {
                        @Override
                        public void run() {
                            MessageDialog.openError(window.getShell(),
                                    "Evolution Exception occured",
                                    e.getLocalizedMessage());
                            LOGGER.error("", e);
                        }
                    });
                }
                return Status.CANCEL_STATUS;
            }

        };
        job.setUser(true);
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
