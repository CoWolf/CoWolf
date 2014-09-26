package de.uni_stuttgart.iste.cowolf.ui.transformation.handler;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.sidiff.difference.symmetric.SymmetricDifference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociation;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationFactory;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion;
import de.uni_stuttgart.iste.cowolf.evolution.AbstractEvolutionManager;
import de.uni_stuttgart.iste.cowolf.evolution.EvolutionException;
import de.uni_stuttgart.iste.cowolf.evolution.EvolutionRegistry;
import de.uni_stuttgart.iste.cowolf.transformation.AbstractTransformationManager;
import de.uni_stuttgart.iste.cowolf.transformation.TransformationRegistry;
import de.uni_stuttgart.iste.cowolf.ui.transformation.resultview.ResultView;
import de.uni_stuttgart.iste.cowolf.ui.transformation.wizard.TransformationWizard;

/**
 * The transformation action is handled here.
 *
 * @author Michael Zimmermann
 */
public class Transform extends AbstractHandler {

	
	private final static Logger LOGGER = LoggerFactory
			.getLogger(Transform.class);
	
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        // initialize variables

    	if (!PlatformUI.getWorkbench().saveAllEditors(true)) {
    		return null;
    	}
    	
        final IWorkbenchWindow window = PlatformUI.getWorkbench()
                .getActiveWorkbenchWindow();

        IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();

 		final IFile selectedElement = (IFile) selection.getFirstElement();
		
		//Show error if model isn't valid
  		if (!isValid(selectedElement)) {
 			MessageDialog.openError(window.getShell(), "Errors in '" + selectedElement.getName() +"'",
					"Errors in '" + selectedElement.getName() + "' were found, please correct them first.\nRun Validation or enable Live Validation to display them.");	
			return null;
 		}
				
		ModelAssociation ma = ModelAssociationFactory.eINSTANCE.getModelAssociation(selectedElement.getProject());
		Model model = ma.getModelByPath(selectedElement.getProjectRelativePath().toString());
		if (model == null) {
			return Status.CANCEL_STATUS;
		}
		List<Association> assocs = model.getSourceAssociations();
		List<IFile> associatedModels = new ArrayList<IFile> ();
		
		for (Association assoc : assocs) {
			associatedModels.add(assoc.getTarget().get(0).getModel().getFile());
		}
		IStructuredSelection selections = new StructuredSelection(associatedModels);
		
        final TransformationWizard modelWizard = new TransformationWizard(selectedElement, selections);
        WizardDialog wizard = new WizardDialog(window.getShell(), modelWizard);
        if (wizard.open() == Window.CANCEL) {
            return null;
        }

        final Resource sourceRes = getResourceOfIFile(modelWizard.getSourceModel());
        
        // Coevolve all targets with specified source
        Job coevolveJob = new Job("Coevolution of models") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				List<IFile> targets = modelWizard.getTargets();
				monitor.beginTask(this.getName(), targets.size()*2);
				LinkedHashMap<Model, SymmetricDifference> results = new LinkedHashMap<Model, SymmetricDifference>(targets.size());

	        	ModelAssociation ma = ModelAssociationFactory.eINSTANCE.getModelAssociation(selectedElement.getProject());
	        	Model sourceModel = ma.getModel(sourceRes);
		        for (IFile target : targets) {
		        	if (monitor.isCanceled()) {
		        		return Status.CANCEL_STATUS;
		        	}
		        	try {
			        	Resource targetRes = getResourceOfIFile(target);
			        	AbstractTransformationManager transformationManager = TransformationRegistry.getInstance().getTransformationManager(sourceRes, targetRes);
			        	if (transformationManager == null) {
			        		monitor.worked(1);
			        		continue;
			        	}
			        	monitor.subTask("Coevolution to model: " + target.getProjectRelativePath().toOSString());
			        	Model targetModel = ma.getModel(targetRes);
			        	ModelVersion newModel = transformationManager.transform(sourceModel, targetModel);
			        	monitor.worked(1);
			        	if (newModel == null) {
			        		continue;
			        	}
			        	AbstractEvolutionManager evoManager = EvolutionRegistry.getInstance().getEvolutionManager(targetRes);
			        	if (evoManager != null) {
			        		monitor.subTask("Calculate Evolution of: " + target.getProjectRelativePath().toOSString());
				        	SymmetricDifference difference = evoManager.evolve(targetModel.getVersions().get(targetModel.getVersions().size()-2).getResource(), targetModel.getVersions().get(targetModel.getVersions().size()-1).getResource());
				        	results.put(ma.getModel(targetRes), difference);
			        	}

		        	} catch (InvalidParameterException e) {
		        		LOGGER.error("", e);
		        	} catch (EvolutionException e) {
		        		LOGGER.error("", e);
					}
		        	monitor.worked(1);
		        }
		        createResultView(results, sourceModel);
				return Status.OK_STATUS;
			}
		};
		coevolveJob.setPriority(Job.LONG);
        coevolveJob.schedule();
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
	
	private boolean isValid(IFile file) {
		
		Resource resource = getResourceOfIFile(file);
		
		if (resource != null && resource.getContents() != null && resource.getContents().get(0) != null) {
			Diagnostic diag = Diagnostician.INSTANCE.validate(resource.getContents().get(0));
			if (diag.getChildren().size() > 0) {
				return false;
			}
		}
		return true;
	}
	
	private void createResultView(final Map<Model, SymmetricDifference> results, final Model sourceModel) {
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				try {
					ResultView view = (ResultView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("de.uni_stuttgart.iste.cowolf.ui.transformation.resultview");
					view.setResult(results, sourceModel);
				} catch (PartInitException e) {
					e.printStackTrace();
				}
			}
		});
	}
}