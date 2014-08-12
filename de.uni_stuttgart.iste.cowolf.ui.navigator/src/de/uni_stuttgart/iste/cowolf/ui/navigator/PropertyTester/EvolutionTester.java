package de.uni_stuttgart.iste.cowolf.ui.navigator.PropertyTester;

import java.util.List;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.uni_stuttgart.iste.cowolf.core.extensions.ExtensionHandler;
import de.uni_stuttgart.iste.cowolf.evolution.AbstractEvolutionManager;

/**
 * 
 * Checks if the evolution can be executed on the selected files.
 * 
 * @author Verena Käfer
 * @author Rene Trefft
 * @author Michael Müller
 *
 */
public class EvolutionTester extends PropertyTester {

    public static final String PROPERTY_NAMESPACE = "de.uni_stuttgart.iste.cowolf.ui.navigator.propertyTester.evolution";
    public static final String PROPERTY_CAN_FOO = "canFoo";

    private ExtensionHandler extensionHandler;
    /**
     * Constructor
     */
    public EvolutionTester() {
        this.extensionHandler = new ExtensionHandler();
    }

    @Override
    public boolean test(Object receiver, String property, Object[] args,
            Object expectedValue) {

        // gets the currently selected files
        IWorkbenchWindow window = PlatformUI.getWorkbench()
                .getActiveWorkbenchWindow();
        if (window == null || window.getSelectionService() == null) {
            return false;
        }
        IStructuredSelection selection = (IStructuredSelection) window
                .getSelectionService().getSelection();

        if (selection == null) {
            return false;
        }
        List list = selection.toList();
        if (list.size() == 1) {
            Object firstElement = list.get(0);
            if (firstElement instanceof IFile) {
                return this
                        .getEvolutionManagerForListItem((IFile) firstElement) != null;
            }
        }
        if (list.size() == 2) {

            Object firstElement = list.get(0);
            Object secondElement = list.get(1);

            if (firstElement instanceof IFile && secondElement instanceof IFile) {
                // both selected models are of the same type if the returned
                // evolution managers are equal
                AbstractEvolutionManager firstElementEvolutionManager = this
                        .getEvolutionManagerForListItem((IFile) firstElement);
                AbstractEvolutionManager secondElementEvolutionManager = this
                        .getEvolutionManagerForListItem((IFile) secondElement);
                if (firstElementEvolutionManager != null
                        && secondElementEvolutionManager != null) {
                    return firstElementEvolutionManager
                            .equals(secondElementEvolutionManager);
                }

            }

        }
        return false;
    }

    /**
     * Returns for a given file the matching EvolutionManager
     * 
     * @param item
     * @return
     */
    private AbstractEvolutionManager getEvolutionManagerForListItem(IFile item) {
        // transforms the two selected models to Resources
        URI uri = URI.createPlatformResourceURI(item.getFullPath().toString(),
                true);
        ResourceSet resourceSet = new ResourceSetImpl();
        Resource firstElementResource = resourceSet.getResource(uri, true);
        return this.extensionHandler.getEvolutionManager(firstElementResource);
    }
}
