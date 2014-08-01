package de.uni_stuttgart.iste.cowolf.ui.navigator;

import java.util.ArrayList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.graphics.Image;

/**
 * this class holds methods for a CoWolf folder
 */
public class CustomProjectContainer implements ICustomProjectElement {

	IContainer originalContainer;
	Image image;

	/**
	 * @param icontainer
	 *            the original container
	 */
	public CustomProjectContainer(IContainer icontainer) {
		originalContainer = icontainer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.uni_stuttgart.iste.cowolf.ui.navigator.ICustomProjectElement#getText()
	 */
	public String getText() {
		return originalContainer.getName();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.uni_stuttgart.iste.cowolf.ui.navigator.ICustomProjectElement#getImage
	 * ()
	 */
	public Image getImage() {
		if (image == null) {
			image = Activator.getImage("icons/logo_wulf_15x15.png"); //$NON-NLS-1$
		}

		return image;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.uni_stuttgart.iste.cowolf.ui.navigator.ICustomProjectElement#getProject
	 * ()
	 */
	@Override
	public IResource getOriginalResource() {
		return originalContainer;
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
			IResource[] resources = originalContainer.members();

			for (IResource r : resources) {
				if (IContainer.class.isInstance(r)) {
					list.add(createCustomProjectContainer((IContainer) r));
				} else {
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
		try {
			return originalContainer.members().length > 0;
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * Creates a custom container from a IContainer
	 * 
	 * @param originalContainer
	 *            the Container to wrapp
	 * @return the wrapped object
	 */
	private Object createCustomProjectContainer(IContainer originalContainer) {

		Object result = null;
		result = new CustomProjectContainer(originalContainer);

		return result;
	}

	/**
	 * @param originalElement
	 *            the IFile to warpp
	 * @return the wrapped object
	 */
	private Object createCustomProjectElement(IFile originalElement) {

		Object result = null;
		result = new CustomProjectFile(originalElement);

		return result;
	}

}