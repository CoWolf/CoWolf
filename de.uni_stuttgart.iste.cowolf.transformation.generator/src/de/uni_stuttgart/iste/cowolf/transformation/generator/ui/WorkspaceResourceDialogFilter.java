package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

/**
 * @author Rene Trefft
 */
public class WorkspaceResourceDialogFilter extends ViewerFilter {

	public WorkspaceResourceDialogFilter() {

	}

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {

		if ((element instanceof IProject) || (element instanceof IFolder)) {

			IResource projectOrDir = (IResource) element;

			if (!projectOrDir.isHidden()) {
				return true;
			}

		} else if (element instanceof IFile) {

			IFile file = (IFile) element;

			if (!file.isHidden() && "rulebase".equals(file.getFileExtension())) {
				return true;
			}

		}

		return false;

	}
}
