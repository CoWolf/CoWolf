package de.uni_stuttgart.iste.cowolf.ui.navigator.filter;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

/**
 * Filters the .aird files
 *
 */
public class AirdFileFilter extends ViewerFilter {

	/**
	 * The ID of this filter (used in plugin.xml).
	 */
	public static final String ID = "de.uni_stuttgart.iste.cowolf.ui.navigator.filters.AirdFileFilter";

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers
	 * .Viewer, java.lang.Object, java.lang.Object)
	 */
	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		if (element instanceof IFile) {
			String fileExtension = ((IFile) element).getFileExtension();
			if (fileExtension != null && fileExtension.equals("aird")) {
				return false;
			}
		}
		return true;
	}
}