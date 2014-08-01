package de.uni_stuttgart.iste.cowolf.ui.navigator;

import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.swt.graphics.Image;

/**
 * this class holds the methods for a CoWolf file
 */
public class CustomProjectFile implements ICustomProjectElement {

	IFile originalFile;
	Image image;

	/**
	 * @param ifile
	 *            the original IFile
	 */
	public CustomProjectFile(IFile ifile) {
		originalFile = ifile;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.uni_stuttgart.iste.cowolf.ui.navigator.ICustomProjectElement#getText()
	 */
	public String getText() {
		return originalFile.getName();
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
	public IFile getOriginalResource() {
		return originalFile;
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
		// else we have already initialized them

		ArrayList<Object> list = new ArrayList<Object>();

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

		return false;
	}

}