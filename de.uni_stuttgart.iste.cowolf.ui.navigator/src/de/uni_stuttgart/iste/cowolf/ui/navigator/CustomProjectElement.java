/**
 * Coder beware: this code is not warranted to do anything.
 * Copyright Oct 17, 2009 Carlos Valcarcel
 */
package de.uni_stuttgart.iste.cowolf.ui.navigator;

import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.swt.graphics.Image;

/**
 * @author carlos
 */
public class CustomProjectElement implements ICustomProjectElement {

	IFile _container;
	Image _image;

	public CustomProjectElement(IFile icontainer) {
		_container = icontainer;
	}

	public String getText() {
		return _container.getName();
	}

	public Image getImage() {
		if (_image == null) {
			_image = Activator.getImage("icons/logo_wulf_15x15.png");
		}

		return _image;
	}

	@Override
	public IResource getProject() {
		return _container;
	}

	@Override
	public Object getParent() {
		return null;
	}

	@Override
	public ArrayList<Object> getChildren() {
		// else we have already initialized them

		ArrayList<Object> list = new ArrayList<Object>();

		return list;
	}

	@Override
	public boolean hasChildren() {

		return false;
	}



}