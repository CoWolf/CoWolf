package de.uni_stuttgart.iste.cowolf.ui.modelassociation;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociation;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationFactory;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion;

public class VersionCreate extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (!PlatformUI.getWorkbench().saveAllEditors(true)) {
    		return null;
    	}
    	
        final IWorkbenchWindow window = PlatformUI.getWorkbench()
                .getActiveWorkbenchWindow();
		
        IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();

		IFile selectedElement = (IFile) selection.getFirstElement();
		
		if (selectedElement.getParent() == null) {
			return null;
		}
		
		ModelAssociation ma = ModelAssociationFactory.eINSTANCE.getModelAssociation(selectedElement.getProject());

		Model model = ma.getModelByPath(selectedElement.getProjectRelativePath().toString());
		
		if (model == null) {
			return null;
		}
		
		
		InputDialog dialog = new InputDialog(window.getShell(), "Create Model Version", "Please insert optional version message.", "", null);

		
		if (dialog.open() != Window.OK) {
		    return null;
		}
		String message = dialog.getValue();
		
		ModelVersion version = model.createVersion(message);
		version.setManual(true);
		
		return version;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
