package de.uni_stuttgart.iste.cowolf.ui.navigator.PropertyTester;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.uni_stuttgart.iste.cowolf.core.extensions.ExtensionHandler;
import de.uni_stuttgart.iste.cowolf.model.IModelManager;

public class AnalyzeTester extends PropertyTester {

	public AnalyzeTester() {
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

		Object selectedElement = selection.getFirstElement();
		IModelManager modelManager = extensionHandler
				.getModelManager((Resource) selectedElement);

		// must find model manager
		if (modelManager != null) {
			return true;
		} else {
			return false;
		}

	}

}
