package de.uni_stuttgart.iste.cowolf.ui.model.export;

import java.util.LinkedList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class FileTreeContentProvider implements ITreeContentProvider {

	private String fileExtension;

	/**
	 * Constructor.
	 * @param fileExtension Extension, which should be shown at this tree.
	 */
	public FileTreeContentProvider(String fileExtension) {
		this.fileExtension = fileExtension;
	}

	@Override
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

	/**
	 * Filters an array of resources in fact of the specified fileextension.
	 * @param members Members to filter.
	 * @return List of resources, contains Containers which have children 
	 *			with this extension and the files with the extension.
	 */
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

	/**
	 * Return if the resource should be shown, because it has the specified 
	 * file extension or have children with this attribute.
	 * @param element Resource to check.
	 * @return true if this resource should be shown, false otherwise.
	 */
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

	@Override
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

	@Override
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

	@Override
	public Object[] getElements(Object arg0) {
		return this.filterExtension(ResourcesPlugin.getWorkspace().getRoot().getProjects());
	}

	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer arg0, Object arg1, Object arg2) {
	}
}