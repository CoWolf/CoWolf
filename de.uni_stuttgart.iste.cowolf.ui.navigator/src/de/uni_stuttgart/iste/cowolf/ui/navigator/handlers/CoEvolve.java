package de.uni_stuttgart.iste.cowolf.ui.navigator.handlers;

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
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.uni_stuttgart.iste.cowolf.core.extensions.ExtensionHandler;
import de.uni_stuttgart.iste.cowolf.transformation.AbstractTransformationManager;

public class CoEvolve extends AbstractHandler {

    private ExtensionHandler extensionHandler;

    public CoEvolve() {
        this.extensionHandler = ExtensionHandler.getInstance();
    }

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
        Resource firstModel = this.getResourceOfIFile(firstElement);
        Resource secondModel = this.getResourceOfIFile(secondElement);
        AbstractTransformationManager manager = this.extensionHandler
                .getTransformationManager(firstModel, secondModel);
        manager.transform(firstModel, secondModel, null);
        return null;
    }
    private Resource getResourceOfIFile(IFile model) {
        URI uri = URI.createPlatformResourceURI(model.getFullPath().toString(),
                true);
        ResourceSet resourceSet = new ResourceSetImpl();
        Resource modelResource = resourceSet.getResource(uri, true);
        return modelResource;
    }
}
