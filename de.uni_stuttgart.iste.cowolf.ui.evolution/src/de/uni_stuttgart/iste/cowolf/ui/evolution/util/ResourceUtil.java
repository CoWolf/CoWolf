package de.uni_stuttgart.iste.cowolf.ui.evolution.util;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * @author Rene Trefft
 */
public class ResourceUtil {

	/**
	 * @param model
	 * @return
	 */
	public static Resource getResourceOfIFile(IFile model) {

		URI uri = URI.createPlatformResourceURI(model.getFullPath().toString(),
				true);

		ResourceSet resourceSet = new ResourceSetImpl();

		try {
			Resource modelResource = resourceSet.getResource(uri, true);
			return modelResource;
		} catch (Exception exc) {
			// exc.printStackTrace();
		}

		return null;

	}

}
