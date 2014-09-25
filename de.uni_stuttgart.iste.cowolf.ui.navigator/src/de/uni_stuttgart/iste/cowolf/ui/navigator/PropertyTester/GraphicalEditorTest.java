package de.uni_stuttgart.iste.cowolf.ui.navigator.PropertyTester;

import java.util.Iterator;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;

import de.uni_stuttgart.iste.cowolf.model.AbstractModelManager;
import de.uni_stuttgart.iste.cowolf.model.ModelRegistry;

public class GraphicalEditorTest extends PropertyTester {

	public GraphicalEditorTest() {
	}

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

		Iterator iterator = ((IStructuredSelection) selection).iterator();
		while (iterator.hasNext()) {
			Object object = iterator.next();
			IFile currentResource;

			if (!(object instanceof IFile)) {
				return false;
			} else {
				currentResource = (IFile) object;
			}

			if (currentResource.getFileExtension().endsWith("aird")) {
				return false;
			}

			try {
				AbstractModelManager modelManager = ModelRegistry.getInstance()
						.getModelManager(currentResource.getFileExtension());

				if (modelManager == null) {
					return false;
				}
			} catch (Exception e) {
				return false;
			}

			IPath representationPath = currentResource.getProjectRelativePath()
					.removeLastSegments(1)
					.append(currentResource.getName() + ".aird");
			IFile test = currentResource.getProject().getFile(
					representationPath);
			if (currentResource.getProject().getFile(representationPath)
					.exists()) {
				return false;
			}

		}

		return true;
	}
}
