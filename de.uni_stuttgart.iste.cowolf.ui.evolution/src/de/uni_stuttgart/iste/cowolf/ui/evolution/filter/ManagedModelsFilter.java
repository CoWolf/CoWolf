package de.uni_stuttgart.iste.cowolf.ui.evolution.filter;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import de.uni_stuttgart.iste.cowolf.core.extensions.ExtensionHandler;

/**
 * This class filters a view to only show models managed by a evolution
 * component.
 * 
 * @author Michael Müller
 *
 */
public class ManagedModelsFilter extends ViewerFilter {

    /**
     * 
     */
    ResourceSet set = new ResourceSetImpl();
    /**
     * Extension handler to get managers from.
     */
    ExtensionHandler handler = ExtensionHandler.getInstance();

    @Override
    public boolean select(Viewer viewer, Object parentElement, Object element) {
        if (element instanceof IFolder) {
            return !((IFolder) element).isHidden();
        }
        if (element instanceof IFile) {
            IFile file = (IFile) element;
            if (file.isHidden()) {
                return false;
            }
            try {
                URI uri = URI.createPlatformResourceURI(file.getFullPath()
                        .toString(), true);
                Resource res = set.getResource(uri, true);
                return handler.getEvolutionManager(res) != null;
            } catch (RuntimeException e) {
                return false;
            }
        }
        return true;
    }
}
