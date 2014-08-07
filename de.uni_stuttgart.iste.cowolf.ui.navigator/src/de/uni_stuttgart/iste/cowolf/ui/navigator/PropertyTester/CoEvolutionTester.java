package de.uni_stuttgart.iste.cowolf.ui.navigator.PropertyTester;

import java.util.List;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EPackage;
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

		List list = selection.toList();
		Object firstElement = list.get(0);
		Object secondElement = list.get(1);
		AbstractTransformationManager modelManager1 = extensionHandler
				.getTransformationManager((EPackage) firstElement,
						(EPackage) secondElement);
		AbstractTransformationManager modelManager2 = extensionHandler
				.getTransformationManager((EPackage) secondElement,
						(EPackage) firstElement);

		// must find model manager
		if (modelManager1 != null || modelManager2 != null) {
			return true;
		} else {
			return false;
		}
	}

}
