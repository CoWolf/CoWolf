package de.uni_stuttgart.iste.cowolf.ui.evolution.filter;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import de.uni_stuttgart.iste.cowolf.core.extensions.ExtensionHandler;
import de.uni_stuttgart.iste.cowolf.ui.evolution.util.ResourceUtil;

/**
 * This class filters a view to only show models managed by a evolution
 * component.
 * 
 * @author Michael Müller
 * @author Rene Trefft
 *
 */
public class WorkspaceResourceDialogFilter extends ViewerFilter {

	private final String PROJECT_NAME;

	/**
	 * 
	 * @param projectName
	 *            of the project that contains the models that should be
	 *            compared.
	 */
	public WorkspaceResourceDialogFilter(String projectName) {
		PROJECT_NAME = projectName;
	}

	/**
     * 
     */
	ResourceSet set = new ResourceSetImpl();
	/**
	 * Extension handler to get managers from.
	 */
	ExtensionHandler extensionHandler = ExtensionHandler.getInstance();

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {

		if (element instanceof IProject) {
			
			IProject project = (IProject) element;
			
			if (project.getName().equals(PROJECT_NAME)) {
				return true;
			}
			
		} else if (element instanceof IFolder) {
			
			IFolder folder = (IFolder) element;
			
			if (!folder.isHidden()) {	
				return true;
			}	
			
		} else if (element instanceof IFile) {
			
			IFile file = (IFile) element;
			
			if (!file.isHidden()) {
				
				Resource fileResource = ResourceUtil.getResourceOfIFile(file);
				return extensionHandler.getEvolutionManager(fileResource) != null;
				
			}
			
		}
		
		return false;

	}
}
