package de.uni_stuttgart.iste.cowolf.ui.navigator.PropertyTester;

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
 *
 */
public class EvolutionTester extends PropertyTester {

	public static final String PROPERTY_NAMESPACE = "de.uni_stuttgart.iste.cowolf.ui.navigator.propertyTester.evolution";
	public static final String PROPERTY_CAN_FOO = "canFoo";

	public EvolutionTester() {
	}


	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {

		// gets the currently selected files
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IStructuredSelection selection = (IStructuredSelection) window
				.getSelectionService().getSelection();

		List list = selection.toList();

		if (list.size() == 2) {

			Object firstElement = list.get(0);
			Object secondElement = list.get(1);

			// // catch exceptions from wrong parsing as we can only recognize
			// IFiles
			// try {

			if (firstElement instanceof IFile && secondElement instanceof IFile) {
				IFile firstElementeIFile = (IFile) firstElement;
				IFile secondElementeIFile = (IFile) secondElement;

				// transforms the two selected models to Resources
				URI firstElementURI = URI.createPlatformResourceURI(
						firstElementeIFile.getFullPath().toString(), true);
				URI secondElementURI = URI.createPlatformResourceURI(
						secondElementeIFile.getFullPath().toString(), true);
				ResourceSet resourceSet = new ResourceSetImpl();
				Resource firstElementResource = resourceSet.getResource(
						firstElementURI, true);
				Resource secondElementResource = resourceSet.getResource(
						secondElementURI, true);

				ExtensionHandler extensionHandler = new ExtensionHandler();
				
				// both selected models are of the same type if the returned evolution managers are equal
				AbstractEvolutionManager firstElementEvolutionManager = extensionHandler
						.getEvolutionManager(firstElementResource);

				if (firstElementEvolutionManager != null) {

					AbstractEvolutionManager secondElementEvolutionManager = extensionHandler
							.getEvolutionManager(secondElementResource);

					if (secondElementEvolutionManager != null) {

						if (firstElementEvolutionManager
								.equals(secondElementEvolutionManager)) {
							return true;
						}

					}

				}

			}

		}
		// } catch (Exception e) {
		// return false;
		// }
		return false;
	}
}
