package de.uni_stuttgart.iste.cowolf.ui.navigator;

import java.util.ArrayList;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import de.uni_stuttgart.iste.cowolf.ui.natures.ProjectNature;

/**
 * This class displays the content in our navigator
 */
public class ContentProvider implements ITreeContentProvider,
		IResourceChangeListener {

	private static final ArrayList<Object> NO_CHILDREN = new ArrayList<Object>();
	Viewer viewer;

	public ContentProvider() {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this,
				IResourceChangeEvent.POST_CHANGE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.
	 * Object)
	 */
	@Override
	public Object[] getChildren(Object parentElement) {
		ArrayList<Object> children = null;
		// root
		if (IWorkspaceRoot.class.isInstance(parentElement)) {
			IProject[] projects = ((IWorkspaceRoot) parentElement)
					.getProjects();
			children = createCustomProject(projects);
			// our projects
		} else if (ICustomProjectElement.class.isInstance(parentElement)) {
			children = ((ICustomProjectElement) parentElement).getChildren();
			// other projects
		} else {
			children = NO_CHILDREN;
		}

		return children.toArray();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object
	 * )
	 */
	@Override
	public Object getParent(Object element) {
		Object parent = null;

		if (IProject.class.isInstance(element)) {
			parent = ((IProject) element).getWorkspace().getRoot();
		} else if (ICustomProjectElement.class.isInstance(element)) {
			parent = ((ICustomProjectElement) element).getParent();
		}

		return parent;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.
	 * Object)
	 */
	@Override
	public boolean hasChildren(Object element) {
		boolean hasChildren = false;

		if (IWorkspaceRoot.class.isInstance(element)) {
			hasChildren = ((IWorkspaceRoot) element).getProjects().length > 0;
		} else if (ICustomProjectElement.class.isInstance(element)) {
			hasChildren = ((ICustomProjectElement) element).hasChildren();
		}

		return hasChildren;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java
	 * .lang.Object)
	 */
	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	@Override
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface
	 * .viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		this.viewer = viewer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.resources.IResourceChangeListener#resourceChanged(org
	 * .eclipse.core.resources.IResourceChangeEvent)
	 */
	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		viewer.refresh();
	}

	/**
	 * @param originalProjects
	 *            the projects to be wrapped
	 * @return the wrapped projects
	 */
	private ArrayList<Object> createCustomProject(IProject[] originalProjects) {

		ArrayList<Object> list = new ArrayList<Object>();
		for (int i = 0; i < originalProjects.length; i++) {
			Object customProjectParent = createCustomProject(originalProjects[i]);
			if (customProjectParent != null) {
				list.add(customProjectParent);
			} // else ignore the project
		}

		return list;
	}

	/**
	 * This method wrappes a custom project around an IProject
	 * 
	 * @param originalProject
	 *            the project to be wrapped
	 * @return the wrapped project
	 */
	private Object createCustomProject(IProject originalProject) {

		Object result = null;
		try {
			// only our projects are displayed
			if (originalProject.getNature(ProjectNature.NATURE_ID) != null) {
				result = new CustomProjectContainer(originalProject);
			}
		} catch (CoreException e) {
		}

		return result;
	}

}