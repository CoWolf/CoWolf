package de.uni_stuttgart.iste.cowolf.ui.model.export;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE.SharedImages;

public class FileTreeLabelProvider implements ILabelProvider {
	
	public FileTreeLabelProvider() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void addListener(ILabelProviderListener listener) {

	}

	@Override
	public void dispose() {

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {

		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {

	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof IProject) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(SharedImages.IMG_OBJ_PROJECT); 
		}
		if (element instanceof IFolder) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FOLDER); 
		}
		if (element instanceof IFile) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FILE); 
		}
		return null;
	}

	@Override
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