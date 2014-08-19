package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

/**
 * 
 * 
 * @author Rene Trefft
 *
 */
public class WorkspaceResourceDialogFilter extends ViewerFilter {

	public WorkspaceResourceDialogFilter() {

	}

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {

		if (element instanceof IProject) {

			IProject project = (IProject) element;

			if (!project.isHidden()) {
				return true;
			}

		}

		if (element instanceof IFolder) {

			IFolder folder = (IFolder) element;

			if (!folder.isHidden()) {
				return true;
			}

		}
		
		if (element instanceof IFile) {

			IFile file = (IFile) element;

			if (!file.isHidden() && file.getFileExtension().equals("henshin")) {
				return true;
			}

		}

		return false;

	}
}
