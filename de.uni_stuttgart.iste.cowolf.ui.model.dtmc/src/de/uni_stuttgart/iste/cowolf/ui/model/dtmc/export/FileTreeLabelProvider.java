package de.uni_stuttgart.iste.cowolf.ui.model.dtmc.export;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

class FileTreeLabelProvider implements ILabelProvider {
		public void addListener(ILabelProviderListener listener) {

		}

		public void dispose() {

		}

		public boolean isLabelProperty(Object element, String property) {

			return false;
		}

		public void removeListener(ILabelProviderListener listener) {

		}

		public Image getImage(Object element) {
			return null;
		}

		public String getText(Object element) {
			if (element instanceof IProject) {
				String text = ((IProject) element).getName();
				return text;
			}
			if (element instanceof IFolder) {
				String text = ((IFolder) element).getName();
				return text;
			}
			if (element instanceof IFile) {
				String text = ((IFile) element).getName();
				return text;
			}

			return null;
		}
	}