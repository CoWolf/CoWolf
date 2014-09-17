package de.uni_stuttgart.iste.cowolf.ui.evolution.properties;

import java.util.List;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.uni_stuttgart.iste.cowolf.evolution.AbstractEvolutionManager;
import de.uni_stuttgart.iste.cowolf.evolution.EvolutionRegistry;
import de.uni_stuttgart.iste.cowolf.model.AbstractModelManager;
import de.uni_stuttgart.iste.cowolf.model.ModelRegistry;
import de.uni_stuttgart.iste.cowolf.ui.evolution.util.ResourceUtil;

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

	private EvolutionRegistry extensionHandler;

	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {

		// gets the currently selected files
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();

		if (window == null) {
			return false;
		}

		ISelectionService selectionService = window.getSelectionService();

		if (selectionService == null) {
			return false;
		}

		ISelection selection = selectionService.getSelection();

		if (selection == null || !(selection instanceof IStructuredSelection)) {
			return false;
		}

		List<?> list = ((IStructuredSelection) selection).toList();
		if (list.size() == 1) {
			Object firstElement = list.get(0);
			if (!(firstElement instanceof IFile)) {
				return false;
			}
			
			AbstractModelManager modelManager = ModelRegistry.getInstance().getModelManager(((IFile) firstElement).getFileExtension()); 
			
			if (modelManager != null && extensionHandler.getEvolutionManager(modelManager.getManagedClass()) != null) {
				return true;
			}
			
			return false;
		}
		if (list.size() == 2) {

			Object firstElement = list.get(0);
			Object secondElement = list.get(1);

			if (firstElement instanceof IFile && secondElement instanceof IFile) {

				IFile firstElementIFile = (IFile) firstElement;
				IFile secondElementIFile = (IFile) secondElement;

				// no evolution of models in different projects
				if (firstElementIFile.getProject().getName()
						.equals(secondElementIFile.getProject().getName())) {

					return isEvolutionPossible(firstElementIFile,
							secondElementIFile);

				}

			}

		}
		return false;
	}

	/**
	 * Constructor
	 */
	public EvolutionTester() {
		this.extensionHandler = EvolutionRegistry.getInstance();
	}

	public boolean isEvolutionPossible(IFile oldModel, IFile newModel) {

		if (oldModel == null || newModel == null) {
			return false;
		}

		Resource oldModelResource = ResourceUtil.getResourceOfIFile(oldModel);
		Resource newModelResource = ResourceUtil.getResourceOfIFile(newModel);

		// both selected models are of the same type if the returned
		// evolution managers are equal
		AbstractEvolutionManager firstElementEvolutionManager = extensionHandler
				.getEvolutionManager(oldModelResource);
		AbstractEvolutionManager secondElementEvolutionManager = extensionHandler
				.getEvolutionManager(newModelResource);
		if (firstElementEvolutionManager != null
				&& secondElementEvolutionManager != null) {
			return firstElementEvolutionManager
					.equals(secondElementEvolutionManager);
		}

		return false;
	}

}
