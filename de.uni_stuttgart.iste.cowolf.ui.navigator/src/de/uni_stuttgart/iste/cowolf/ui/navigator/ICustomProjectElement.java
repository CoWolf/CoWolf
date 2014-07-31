package de.uni_stuttgart.iste.cowolf.ui.navigator;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.graphics.Image;

public interface ICustomProjectElement {
	public Image getImage();

	public Object[] getChildren();

	public String getText();

	public boolean hasChildren();

	public IProject getProject();

	public Object getParent();
}
