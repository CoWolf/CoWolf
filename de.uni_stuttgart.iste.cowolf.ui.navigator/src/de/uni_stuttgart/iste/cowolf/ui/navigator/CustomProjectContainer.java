/**
 * Coder beware: this code is not warranted to do anything.
 * Copyright Oct 17, 2009 Carlos Valcarcel
 */
package de.uni_stuttgart.iste.cowolf.ui.navigator;

import java.util.ArrayList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.graphics.Image;

/**
 * @author carlos
 */
public class CustomProjectContainer implements ICustomProjectElement {

	IContainer _container;
	Image _image;

	public CustomProjectContainer(IContainer icontainer) {
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
		try {
			IResource[] resources = _container.members();

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

	@Override
	public boolean hasChildren() {
		// else we have already initialized them
		try {
			return _container.members().length > 0;
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	private Object createCustomProjectContainer(IContainer parentElement) {

		Object result = null;
		result = new CustomProjectContainer(parentElement);

		return result;
	}

	private Object createCustomProjectElement(IFile originalElement) {

		Object result = null;
		result = new CustomProjectElement(originalElement);

		return result;
	}

}