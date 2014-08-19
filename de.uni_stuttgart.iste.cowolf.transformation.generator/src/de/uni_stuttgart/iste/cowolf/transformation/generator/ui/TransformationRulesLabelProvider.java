package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

/**
 * 
 * @author NB Rene
 *
 */
public class TransformationRulesLabelProvider implements ILabelProvider {

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

		if (element instanceof File) {

			File file = (File) element;

			if (file.isDirectory()) {

				return PlatformUI.getWorkbench().getSharedImages()
						.getImageDescriptor(ISharedImages.IMG_OBJ_FOLDER)
						.createImage(true);

			} else if (file.isFile()) {

				try {
					URL url = new URL(
							"platform:/plugin/org.eclipse.emf.henshin.editor/icons/full/obj16/HenshinModelFile.gif");
					return ImageDescriptor.createFromURL(url).createImage(true);
				} catch (IOException e1) {
					e1.printStackTrace();
				}

				return null;

			}

		}

		return null;

	}

	@Override
	public String getText(Object element) {
		if (element instanceof File) {
			File file = (File) element;
			return file.getName();
		}
		return null;
	}

}
