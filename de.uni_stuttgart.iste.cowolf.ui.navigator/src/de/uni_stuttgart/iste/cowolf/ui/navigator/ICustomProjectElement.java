package de.uni_stuttgart.iste.cowolf.ui.navigator;

import java.util.ArrayList;

import org.eclipse.core.resources.IResource;
import org.eclipse.swt.graphics.Image;

public interface ICustomProjectElement {
	public Image getImage();

	public ArrayList<Object> getChildren();

	public String getText();

	public boolean hasChildren();

	public IResource getProject();

	public Object getParent();
}
