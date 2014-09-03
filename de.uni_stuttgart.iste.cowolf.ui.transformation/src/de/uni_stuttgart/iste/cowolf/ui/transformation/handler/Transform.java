package de.uni_stuttgart.iste.cowolf.ui.transformation.handler;

import java.security.InvalidParameterException;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

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

    public Transform() {
    }

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        // initialize variables

        final IWorkbenchWindow window = PlatformUI.getWorkbench()
                .getActiveWorkbenchWindow();

        IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();

		IFile selectedElement = (IFile) selection.getFirstElement();
        
		System.out.println("Selected Element:" + selectedElement.getName());
        
		Resource sourceRes = getResourceOfIFile(selectedElement);
		if (sourceRes == null) {
			return null;
		}
		
        final TransformationWizard modelWizard = new TransformationWizard(sourceRes, selectedElement);
        WizardDialog wizard = new WizardDialog(window.getShell(), modelWizard);
        if (wizard.open() == Window.CANCEL) {
            return null;
        }
        
        //TODO get source from wizard
        // Coevolve all targets with specified source
        List<IFile> targets = modelWizard.getTargets();
        for (IFile target : targets) {
        	try {
	        	Resource targetRes = getResourceOfIFile(target);
	        	AbstractTransformationManager transformationManager = TransformationRegistry.getInstance().getTransformationManager(sourceRes, targetRes);

	        	ModelAssociation ma = ModelAssociationFactory.eINSTANCE.getModelAssociation(target.getProject());
	        	transformationManager.transform(ma.getModel(sourceRes), ma.getModel(targetRes));
        	} catch (InvalidParameterException e) {
        		// Resources have different projects
        		e.printStackTrace();
        	}
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
}