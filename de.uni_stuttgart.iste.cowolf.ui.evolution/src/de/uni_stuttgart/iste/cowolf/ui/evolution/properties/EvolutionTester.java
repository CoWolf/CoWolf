package de.uni_stuttgart.iste.cowolf.ui.evolution.properties;

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

/**
 * 
 * Checks if the evolution can be executed on the selected files.
 * 
 * @author Verena Käfer
 * @author Rene Trefft
 * @author Michael Müller
 *
 */
public class EvolutionTester extends PropertyTester {

	public static final String PROPERTY_NAMESPACE = "de.uni_stuttgart.iste.cowolf.ui.evolution.properties.evolution";
	public static final String PROPERTY_CAN_FOO = "canFoo";

	private ExtensionHandler extensionHandler;

	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {

		// gets the currently selected files
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		if (window.getSelectionService() == null) {
			return false;
		}
		IStructuredSelection selection = (IStructuredSelection) window
				.getSelectionService().getSelection();

		if (selection == null) {
			return false;
		}
		List list = selection.toList();
		if (list.size() == 1) {
			Object firstElement = list.get(0);
			if (firstElement instanceof IFile) {
				Resource firstElementResource = getResourceOfIFile((IFile)firstElement);
				return extensionHandler.getEvolutionManager(firstElementResource) != null;
			}
		}
		if (list.size() == 2) {

			Object firstElement = list.get(0);
			Object secondElement = list.get(1);

			if (firstElement instanceof IFile && secondElement instanceof IFile) {

				return isEvolutionPossible((IFile) firstElement,
						(IFile) secondElement);

			}

		}
		return false;
	}

	/**
	 * Constructor
	 */
	public EvolutionTester() {
		this.extensionHandler = new ExtensionHandler();
	}

	public boolean isEvolutionPossible(IFile oldModel, IFile newModel) {
		Resource oldModelResource = getResourceOfIFile(oldModel);
		Resource newModelResource = getResourceOfIFile(newModel);
		return isEvolutionPossible(oldModelResource, newModelResource);
	}

	public boolean isEvolutionPossible(Resource oldModel, Resource newModel) {

		// both selected models are of the same type if the returned
		// evolution managers are equal
		AbstractEvolutionManager firstElementEvolutionManager = extensionHandler
				.getEvolutionManager(oldModel);
		AbstractEvolutionManager secondElementEvolutionManager = extensionHandler
				.getEvolutionManager(newModel);
		if (firstElementEvolutionManager != null
				&& secondElementEvolutionManager != null) {
			return firstElementEvolutionManager
					.equals(secondElementEvolutionManager);
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
