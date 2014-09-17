package de.uni_stuttgart.iste.cowolf.ui.transformation.handler;

import java.security.InvalidParameterException;
import java.util.ArrayList;
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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociation;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationFactory;
import de.uni_stuttgart.iste.cowolf.ui.transformation.wizard.TransformationWizard;
import de.uni_stuttgart.iste.cowolf.transformation.AbstractTransformationManager;
import de.uni_stuttgart.iste.cowolf.transformation.TransformationRegistry;

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

		IFile selectedElement = (IFile) selection.getFirstElement();
		
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
				monitor.beginTask(this.getName(), targets.size());
		        for (IFile target : targets) {
		        	if (monitor.isCanceled()) {
		        		return Status.CANCEL_STATUS;
		        	}
		        	try {
			        	Resource targetRes = getResourceOfIFile(target);
			        	AbstractTransformationManager transformationManager = TransformationRegistry.getInstance().getTransformationManager(sourceRes, targetRes);
			        	if (transformationManager == null) {
			        		continue;
			        	}
			        	monitor.subTask("Coevolution to model: " + target.getProjectRelativePath().toOSString());
			        	ModelAssociation ma = ModelAssociationFactory.eINSTANCE.getModelAssociation(target.getProject());
			        	transformationManager.transform(ma.getModel(sourceRes), ma.getModel(targetRes));
		        	} catch (InvalidParameterException e) {
		        		LOGGER.error("", e);
		        	} finally {
		        		monitor.worked(1);
		        	}
		        }
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
}