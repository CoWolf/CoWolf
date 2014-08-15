package de.uni_stuttgart.iste.cowolf.ui.transformation.properties;

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
import de.uni_stuttgart.iste.cowolf.evolution.AbstractEvolutionManager;

public class TransformationTester extends PropertyTester {

	public static final String PROPERTY_NAMESPACE = "de.uni_stuttgart.iste.cowolf.ui.transformation.properties.transformation";
	public static final String PROPERTY_CAN_FOO = "canFoo";

	private ExtensionHandler extensionHandler;

	public TransformationTester() {
		this.extensionHandler = ExtensionHandler.getInstance();
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

		// One model selected
		if (list.size() == 1) {
			Object firstElement = list.get(0);
			if (firstElement instanceof IFile) {
				Resource firstElementResource = getResourceOfIFile((IFile) firstElement);
				return extensionHandler
						.getEvolutionManager(firstElementResource) != null;
			}
		}

		// Two models selected
		else if (list.size() == 2) {

			Object firstElement = list.get(0);
			Object secondElement = list.get(1);

			if (firstElement instanceof IFile && secondElement instanceof IFile) {

				Resource firstElementResource = getResourceOfIFile((IFile) firstElement);
				Resource secondElementResource = getResourceOfIFile((IFile) secondElement);

				// both selected models are of the same type if the returned
				// evolution managers are equal
				AbstractEvolutionManager firstElementEvolutionManager = extensionHandler
						.getEvolutionManager(firstElementResource);
				AbstractEvolutionManager secondElementEvolutionManager = extensionHandler
						.getEvolutionManager(secondElementResource);

				return (firstElementEvolutionManager != null && secondElementEvolutionManager != null);

			}
		}

		// Three models selected
		else if (list.size() == 3) {

			Object firstElement = list.get(0);
			Object secondElement = list.get(1);
			Object targetElement = list.get(2);

			if (firstElement instanceof IFile && secondElement instanceof IFile
					&& targetElement instanceof IFile) {

				return isTransformationPossible((IFile) firstElement,
						(IFile) secondElement, (IFile) targetElement);

			}
		}

		return false;

	}

	public boolean isTransformationPossible(IFile sourceModelA,
			IFile sourceModelB, IFile targetModel) {

		if (sourceModelA == null || sourceModelB == null || targetModel == null) {
			return false;
		}

		Resource sourceModelAResource = getResourceOfIFile(sourceModelA);
		Resource sourceModelBResource = getResourceOfIFile(sourceModelB);
		Resource targetModelResource = getResourceOfIFile(targetModel);

		// both selected source models are of the same type if the returned
		// evolution managers are equal
		AbstractEvolutionManager firstElementEvolutionManager = extensionHandler
				.getEvolutionManager(sourceModelAResource);
		AbstractEvolutionManager secondElementEvolutionManager = extensionHandler
				.getEvolutionManager(sourceModelBResource);

		AbstractEvolutionManager targetElementEvolutionManager = extensionHandler
				.getEvolutionManager(targetModelResource);

		if (firstElementEvolutionManager != null
				&& secondElementEvolutionManager != null
				&& targetElementEvolutionManager != null) {

			// first check if both source models of type
			if (firstElementEvolutionManager
					.equals(secondElementEvolutionManager)) {

				// second check if targetModel is different type
				return firstElementEvolutionManager.equals(targetModelResource);
			}
		}

		return false;

	}

	public Resource getResourceOfIFile(IFile model) {
		URI uri = URI.createPlatformResourceURI(model.getFullPath().toString(),
				true);
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource modelResource = resourceSet.getResource(uri, true);
		return modelResource;
	}

}
