package de.uni_stuttgart.iste.cowolf.ui.navigator;

import java.util.ArrayList;

import org.eclipse.core.resources.IResource;
import org.eclipse.swt.graphics.Image;

/**
 * An interface for CoWolf elements
 *
 */
public interface ICustomProjectElement {

	/**
	 * @return the image which is displayed in the navigator tree
	 */
	public Image getImage();

	/**
	 * @return the children of the element in the tree
	 */
	public ArrayList<Object> getChildren();

	/**
	 * @return the name of the element
	 */
	public String getText();

	/**
	 * @return if the element has children
	 */
	public boolean hasChildren();

	/**
	 * @return the original resource
	 */
	public IResource getOriginalResource();

	/**
	 * @return the parent element
	 */
	public Object getParent();
}
