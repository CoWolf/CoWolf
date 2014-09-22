package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Rene Trefft
 */
public class TransformationRulesLabelProvider implements ILabelProvider {
	
	private final static Logger LOGGER = LoggerFactory
			.getLogger(TransformationRulesLabelProvider.class);
	
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

			return PlatformUI.getWorkbench().getSharedImages()
					.getImageDescriptor(ISharedImages.IMG_OBJ_PROJECT)
					.createImage(true);

		}
		if (element instanceof IFolder) {

			return PlatformUI.getWorkbench().getSharedImages()
					.getImageDescriptor(ISharedImages.IMG_OBJ_FOLDER)
					.createImage(true);

		} else if (element instanceof IFile) {

			try {
				URL url = new URL(
						"platform:/plugin/de.uni_stuttgart.iste.cowolf.transformation.generator/de/uni_stuttgart/iste/cowolf/transformation/generator/ui/icons/HenshinModelFile.gif");
				return ImageDescriptor.createFromURL(url).createImage();
			} catch (MalformedURLException e) {
				LOGGER.error("", e);
			}

		} else if (element instanceof Unit) {

			try {
				URL url = new URL(
						"platform:/plugin/de.uni_stuttgart.iste.cowolf.transformation.generator/de/uni_stuttgart/iste/cowolf/transformation/generator/ui/icons/Unit.png");
				return ImageDescriptor.createFromURL(url).createImage();
			} catch (MalformedURLException e) {
				LOGGER.error("", e);
			}

		}

		return null;

	}

	@Override
	public String getText(Object element) {
		if (element instanceof IResource) {
			IResource res = (IResource) element;
			return res.getName();
		} else if (element instanceof Unit) {
			Unit unit = (Unit) element;
			return unit.getName();
		}
		return null;
	}
}
