package de.uni_stuttgart.iste.cowolf.ui.transformation.properties;

import java.io.File;
import java.util.List;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.uni_stuttgart.iste.cowolf.core.extensions.ExtensionHandler;
import de.uni_stuttgart.iste.cowolf.transformation.AbstractTransformationManager;

public class TransformationTester extends PropertyTester {

	public static final String PROPERTY_NAMESPACE = "de.uni_stuttgart.iste.cowolf.ui.transformation.properties.transformation";
	public static final String PROPERTY_CAN_FOO = "canFoo";

	public TransformationTester() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {

		ExtensionHandler extensionHandler = ExtensionHandler.getInstance();

		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		if (window == null || window.getSelectionService() == null) {
			return false;
		}
		if (!(window.getSelectionService().getSelection() instanceof IStructuredSelection)) {
			return false;
		}
		IStructuredSelection selection = (IStructuredSelection) window
				.getSelectionService().getSelection();

		List<?> list = selection.toList();
		if (list.size() == 1) {
			Object firstElement = list.get(0);
			if (firstElement instanceof IFile) {
				Resource firstElementResource = getResourceOfIFile((IFile) firstElement);
				return extensionHandler
						.getEvolutionManager(firstElementResource) != null;
			}
		}

		// TODO: really 2?
		if (list.size() != 2) {
			return false;
		}
		Object firstElement = list.get(0);
		Object secondElement = list.get(1);

		// catch exceptions from wrong parsing as we can only recognize IFiles
		try {
			// file then try to parse
			if (firstElement instanceof IFile && secondElement instanceof IFile) {
				IFile firstIFile = (IFile) firstElement;
				IFile secondIFile = (IFile) secondElement;

				File firstFile = firstIFile.getLocation().toFile();
				File secondFile = secondIFile.getLocation().toFile();

				ResourceSet resourceSet = new ResourceSetImpl();
				Resource firstResource;
				Resource secondResource;

				URI firstUri = URI.createPlatformResourceURI(firstIFile
						.getFullPath().toString(), true);
				URI secondUri = URI.createPlatformResourceURI(secondIFile
						.getFullPath().toString(), true);

				if (!firstFile.exists() || !secondFile.exists()) {
					return false;
				}

				firstResource = resourceSet.getResource(firstUri, true);
				secondResource = resourceSet.getResource(secondUri, true);

				AbstractTransformationManager transformationManager = extensionHandler
						.getTransformationManager(firstResource, secondResource);
				return transformationManager != null;
			} else {
				// no file -> cannot open
				return false;
			}

		} catch (Exception e) {
			return false;
		}
	}

	public boolean isTransformationPossible(IFile oldModel, IFile newModel) {
		// TODO
		return true;

	}

	public Resource getResourceOfIFile(IFile model) {
		URI uri = URI.createPlatformResourceURI(model.getFullPath().toString(),
				true);
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource modelResource = resourceSet.getResource(uri, true);
		return modelResource;
	}

}
