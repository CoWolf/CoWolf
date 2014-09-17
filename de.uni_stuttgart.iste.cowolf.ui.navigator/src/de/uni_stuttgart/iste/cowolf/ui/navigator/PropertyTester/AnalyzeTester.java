package de.uni_stuttgart.iste.cowolf.ui.navigator.PropertyTester;

import java.io.File;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationFactory;
import de.uni_stuttgart.iste.cowolf.model.AbstractModelManager;
import de.uni_stuttgart.iste.cowolf.model.AbstractQoSModelManager;
import de.uni_stuttgart.iste.cowolf.model.ModelRegistry;

public class AnalyzeTester extends PropertyTester {

	public AnalyzeTester() {
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
		
		
		// catch exceptions from wrong parsing as we can only recognize IFiles
		try {
			// file then try to parse
			if (selectedElement instanceof IFile) {
				IFile iFile = (IFile) selectedElement;
				
				
				if (!iFile.exists()) {
					return false;
				}
				
				AbstractModelManager modelManager = ModelRegistry.getInstance().getModelManager(iFile.getFileExtension());

				// must find model manager
				if (modelManager != null && modelManager instanceof AbstractQoSModelManager) {
					return true;
				} else {
					return false;
				}
			} else {
				// no file -> cannot open
				return false;
			}

		} catch (Exception e) {
			return false;
		}
	}
}
