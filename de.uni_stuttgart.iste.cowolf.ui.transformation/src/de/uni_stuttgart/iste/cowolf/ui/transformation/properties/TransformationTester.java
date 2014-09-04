package de.uni_stuttgart.iste.cowolf.ui.transformation.properties;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.uni_stuttgart.iste.cowolf.model.AbstractModelManager;
import de.uni_stuttgart.iste.cowolf.model.ModelRegistry;

public class TransformationTester extends PropertyTester {

	public TransformationTester() {
	}

	@Override
	public boolean test(final Object receiver, final String property,
			final Object[] args, final Object expectedValue) {
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
		
		Object selectedElement = ((IStructuredSelection)selection).getFirstElement();
		
		if (selectedElement == null) {
			return false;
		}

		// file then try to parse
		if (selectedElement instanceof IFile) {
			IFile iFile = (IFile) selectedElement;

			AbstractModelManager modelManager = ModelRegistry.getInstance().getModelManager(iFile.getFileExtension());

			// must find model manager
			if (modelManager == null || !(modelManager instanceof AbstractModelManager)) {
				return false;
			}
			return true;

		} else {
			// no file -> cannot open
			return false;
		}
	}
}
