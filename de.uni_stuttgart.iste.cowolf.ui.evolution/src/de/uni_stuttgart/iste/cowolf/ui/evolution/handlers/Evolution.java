package de.uni_stuttgart.iste.cowolf.ui.evolution.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociation;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationFactory;
import de.uni_stuttgart.iste.cowolf.evolution.AbstractEvolutionManager;
import de.uni_stuttgart.iste.cowolf.evolution.EvolutionRegistry;
import de.uni_stuttgart.iste.cowolf.ui.evolution.evolution.EvolutionView;

public class Evolution extends AbstractHandler {

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
        final Model sourceModel = ma.getModel(sourceResource);
        
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				try {
					EvolutionView view = (EvolutionView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("de.uni_stuttgart.iste.cowolf.ui.evolution.evolutionview");
					view.setModel(sourceModel);
				} catch (PartInitException e) {
					e.printStackTrace();
				}
			}
		});
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
