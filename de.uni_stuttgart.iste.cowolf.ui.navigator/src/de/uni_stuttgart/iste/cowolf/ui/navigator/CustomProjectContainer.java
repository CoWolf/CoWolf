package de.uni_stuttgart.iste.cowolf.ui.navigator;

import java.util.ArrayList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.graphics.Image;

/**
 * this class holds the functions for a CoWolf project
 *
 */
public class CustomProjectContainer implements ICustomProjectElement {

	IContainer originalProject;
	Image shownImage;

	public CustomProjectContainer(IContainer originalElement) {
		originalProject = originalElement;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.uni_stuttgart.iste.cowolf.ui.navigator.ICustomProjectElement#getText()
	 */
	public String getText() {
		return originalProject.getName();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.uni_stuttgart.iste.cowolf.ui.navigator.ICustomProjectElement#getImage
	 * ()
	 */
	public Image getImage() {
		if (shownImage == null) {
			shownImage = Activator.getImage("icons/logo_wulf_15x15.png"); //$NON-NLS-1$
		}

		return shownImage;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.uni_stuttgart.iste.cowolf.ui.navigator.ICustomProjectElement#getProject
	 * ()
	 */
	@Override
	public IContainer getOriginalResource() {
		return originalProject;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.uni_stuttgart.iste.cowolf.ui.navigator.ICustomProjectElement#getParent
	 * ()
	 */
	@Override
	public Object getParent() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.uni_stuttgart.iste.cowolf.ui.navigator.ICustomProjectElement#getChildren
	 * ()
	 */
	@Override
	public ArrayList<Object> getChildren() {

		ArrayList<Object> list = new ArrayList<Object>();

		try {
			// get the children of the IProject
			IResource[] resources = originalProject.members();

			for (IResource r : resources) {
				if (r.getName().startsWith(".")) { //$NON-NLS-1$
					// do nothing, those files should not be shown
				}
				// folder
				else if (IContainer.class.isInstance(r)) {
					list.add(createCustomProjectContainer((IContainer) r));

				}// files
				else {
					list.add(createCustomProjectElement((IFile) r));
				}
			}

		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.uni_stuttgart.iste.cowolf.ui.navigator.ICustomProjectElement#hasChildren
	 * ()
	 */
	@Override
	public boolean hasChildren() {
		// else we have already initialized them
		try {
			return originalProject.members().length > 0;
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * @param originalElement
	 *            the IContainer to be wrapped
	 * @return the wrapped object
	 */
	private Object createCustomProjectContainer(IContainer originalElement) {

		Object result = null;
		result = new CustomProjectContainer(originalElement);

		return result;
	}

	/**
	 * @param originalElement
	 *            the IFile to be wrapped
	 * @return the wrapped object
	 */
	private Object createCustomProjectElement(IFile originalElement) {

		Object result = null;
		result = new CustomProjectFile(originalElement);

		return result;
	}

}