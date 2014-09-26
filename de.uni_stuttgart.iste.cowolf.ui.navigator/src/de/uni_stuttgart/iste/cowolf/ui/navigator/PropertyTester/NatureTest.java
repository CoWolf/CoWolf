package de.uni_stuttgart.iste.cowolf.ui.navigator.PropertyTester;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.uni_stuttgart.iste.cowolf.core.natures.ProjectNature;

public class NatureTest extends PropertyTester {

	public NatureTest() {
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
		
		Object selectedElement = ((IStructuredSelection)selection).getFirstElement();
		
		if (selectedElement == null) {
			return false;
		}
		if (selectedElement instanceof IFile) {
			IFile iFile = (IFile) selectedElement;
			
			if (!iFile.exists()) {
				return false;
			}
			
			if (iFile.getProject() != null && iFile.getProject().exists()) {
				IProject project = iFile.getProject();
				IProjectDescription description;
				try {
					description = project.getDescription();
					String[] natures = description.getNatureIds();
					for (int i = 0; i < natures.length; ++i) {
						if (ProjectNature.NATURE_ID.equals(natures[i])) {
							return true;
						}
					}
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}

}
