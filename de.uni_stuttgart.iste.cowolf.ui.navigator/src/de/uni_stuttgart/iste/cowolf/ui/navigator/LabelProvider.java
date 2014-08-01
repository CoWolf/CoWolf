/**
 * Coder beware: this code is not warranted to do anything.
 *
 * Copyright Oct 17, 2009 Carlos Valcarcel
 */
package de.uni_stuttgart.iste.cowolf.ui.navigator;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

/**
 * @author carlos
 *
 */
public class LabelProvider implements ILabelProvider {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ILabelProvider#getImage(java.lang.Object)
	 */
	@Override
	public Image getImage(Object element) {
		Image image = null;

		if (ICustomProjectElement.class.isInstance(element)) {
			image = ((ICustomProjectElement) element).getImage();
		}

		// else ignore the element

		return image;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object element) {
		String text = ""; //$NON-NLS-1$

		if (ICustomProjectElement.class.isInstance(element)) {
			text = ((ICustomProjectElement) element).getText();
		}
		// else ignore the element

		return text;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.
	 * jface.viewers.ILabelProviderListener)
	 */
	@Override
	public void addListener(ILabelProviderListener listener) {
		System.out
				.println("LabelProvider.addListener: " + listener.getClass().getName()); //$NON-NLS-1$
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#dispose()
	 */
	@Override
	public void dispose() {
		System.out.println("LabelProvider.dispose"); //$NON-NLS-1$
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(java.lang
	 * .Object, java.lang.String)
	 */
	@Override
	public boolean isLabelProperty(Object element, String property) {
		System.out
				.println("LabelProvider.isLabelProperty: " + element.getClass().getName()); //$NON-NLS-1$
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.IBaseLabelProvider#removeListener(org.eclipse
	 * .jface.viewers.ILabelProviderListener)
	 */
	@Override
	public void removeListener(ILabelProviderListener listener) {
		System.out
				.println("LabelProvider.removeListener: " + listener.getClass().getName()); //$NON-NLS-1$
		// TODO Auto-generated method stub

	}

}