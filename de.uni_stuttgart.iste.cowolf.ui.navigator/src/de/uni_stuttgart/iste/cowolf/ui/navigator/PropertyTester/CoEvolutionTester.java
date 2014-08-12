package de.uni_stuttgart.iste.cowolf.ui.navigator.PropertyTester;

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

public class CoEvolutionTester extends PropertyTester {

	public CoEvolutionTester() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		ExtensionHandler extensionHandler = new ExtensionHandler();
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IStructuredSelection selection = (IStructuredSelection) window
				.getSelectionService().getSelection();

		@SuppressWarnings("rawtypes")
		List list = selection.toList();

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

				AbstractTransformationManager modelManager1 = extensionHandler
						.getTransformationManager(firstResource, secondResource);
				AbstractTransformationManager modelManager2 = extensionHandler
						.getTransformationManager(secondResource, firstResource);

				// must find at least one model manager
				return (modelManager1 != null || modelManager2 != null);
			} else {
				// no file -> cannot open
				return false;
			}

		} catch (Exception e) {
			return false;
		}
	}

}
