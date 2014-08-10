package de.uni_stuttgart.iste.cowolf.ui.navigator.PropertyTester;

import java.util.List;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.uni_stuttgart.iste.cowolf.core.extensions.ExtensionHandler;
import de.uni_stuttgart.iste.cowolf.evolution.AbstractEvolutionManager;

public class EvolutionTester extends PropertyTester {

	public EvolutionTester() {
	}

	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		ExtensionHandler extensionHandler = new ExtensionHandler();

		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IStructuredSelection selection = (IStructuredSelection) window
				.getSelectionService().getSelection();

		List list = selection.toList();
		Object firstElement = list.get(0);
		Object secondElement = list.get(1);

		// Models must be of same type

		AbstractEvolutionManager firstElementEvolutionManager = extensionHandler
				.getEvolutionManager((Resource) firstElement);

		if (firstElementEvolutionManager != null) {

			AbstractEvolutionManager secondElementEvolutionManager = extensionHandler
					.getEvolutionManager((Resource) secondElement);

			if (secondElementEvolutionManager != null) {

				if (firstElementEvolutionManager
						.equals(secondElementEvolutionManager)) {
					return true;
				}

			}

		}

		return false;

	}
}
