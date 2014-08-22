package de.uni_stuttgart.iste.cowolf.ui.model.dtmc.export;

import java.util.LinkedList;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

class FileTreeContentProvider implements ITreeContentProvider {

	private String fileExtension;

	public FileTreeContentProvider(String fileExtension, IStructuredSelection selection) {
		this.fileExtension = fileExtension;
	}

	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IProject) {
			IProject projects = (IProject) parentElement;
			try {
				return this.filterExtension(projects.members());
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		if (parentElement instanceof IFolder) {
			IFolder ifolder = (IFolder) parentElement;
			try {
				return this.filterExtension(ifolder.members());
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}

		return null;
	}

	private Object[] filterExtension(IResource[] members) {
		LinkedList<IResource> filteredResources = new LinkedList<IResource>();
		for (IResource res : members) {
			if (!(res instanceof IFile)) {
				if (!hasUsedObjectsRecursive(res)) {
					continue;
				}

				filteredResources.add(res);
				continue;
			}

			if (res.getFileExtension().equals(this.fileExtension)) {
				filteredResources.add(res);
			}
		}
		return filteredResources.toArray();
	}

	private boolean hasUsedObjectsRecursive(IResource element) {
		if (element instanceof IContainer) {
			try {
				for (IResource res : ((IContainer) element).members()) {
					if (hasUsedObjectsRecursive(res)) {
						return true;
					}
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		} else if (element instanceof IFile) {
			if (filterExtension(new IResource[] {element}).length > 0) {
				return true;
			}
		}

		return false;
	}

	public Object getParent(Object element) {
		if (element instanceof IProject) {
			IProject projects = (IProject) element;
			return projects.getParent();
		}
		if (element instanceof IFolder) {
			IFolder folder = (IFolder) element;
			return folder.getParent();
		}
		if (element instanceof IFile) {
			IFile file = (IFile) element;
			return file.getParent();
		}
		return null;
	}

	public boolean hasChildren(Object element) {
		if (element instanceof IResource && !hasUsedObjectsRecursive((IResource)element)) {
			return false;
		}
		if (element instanceof IProject) {
			IProject projects = (IProject) element;
			try {
				return projects.members().length > 0;
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		if (element instanceof IFolder) {
			IFolder folder = (IFolder) element;
			try {
				return this.filterExtension(folder.members()).length > 0;
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public Object[] getElements(Object arg0) {
		return this.filterExtension(ResourcesPlugin.getWorkspace().getRoot().getProjects());
	}

	public void dispose() {
	}

	public void inputChanged(Viewer arg0, Object arg1, Object arg2) {
	}
}