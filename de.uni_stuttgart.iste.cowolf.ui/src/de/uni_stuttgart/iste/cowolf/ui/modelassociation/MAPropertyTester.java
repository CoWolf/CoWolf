package de.uni_stuttgart.iste.cowolf.ui.modelassociation;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationFactory;

public class MAPropertyTester extends PropertyTester {

	
	
	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		
		
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

			if (iFile.getProject() == null) {
				return false;
			}
			
			if (ModelAssociationFactory.eINSTANCE.getModelAssociation(iFile.getProject())
					.getModelByPath(iFile.getProjectRelativePath().toString()) != null) {
				return true;
			}
			
		}
		
		return false;
	}

}
