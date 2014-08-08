package de.uni_stuttgart.iste.cowolf.ui.navigator.PropertyTester;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.uni_stuttgart.iste.cowolf.core.extensions.ExtensionHandler;
import de.uni_stuttgart.iste.cowolf.evolution.AbstractEvolutionManager;

public class EvolutionTester extends PropertyTester {
	
	public static final String PROPERTY_NAMESPACE = "de.uni_stuttgart.iste.cowolf.ui.navigator.propertyTester.evolution";
	public static final String PROPERTY_CAN_FOO = "canFoo";

	public EvolutionTester() {
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
		
		org.eclipse.tptp.platform.common.internal.util.EMFUtil.
		
		AbstractEvolutionManager modelManager = extensionHandler
				.getEvolutionManager((Resource) selectedElement);

		// must find model manager
		if (modelManager != null) {
			return true;
		} else {
			return true;
		}
	}
	


}
