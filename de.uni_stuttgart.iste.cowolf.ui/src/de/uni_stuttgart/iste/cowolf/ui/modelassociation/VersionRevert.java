package de.uni_stuttgart.iste.cowolf.ui.modelassociation;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Collections;
import java.util.Date;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociation;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationFactory;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion;


public class VersionRevert extends AbstractHandler {
	
	private final static Logger LOGGER = LoggerFactory
			.getLogger(VersionRevert.class);
	
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
		
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(window.getShell(), new LabelProvider() {

			@Override
			public String getText(Object element) {
				if (element instanceof ModelVersion) {
					ModelVersion version = (ModelVersion) element;
					Date date = new Date(version.getTimestamp());
					DateFormat df = DateFormat.getDateTimeInstance(
							DateFormat.SHORT, DateFormat.SHORT);
					String label = df.format(date);
					
					if (!version.getMessage().isEmpty()) {
						label += " (" + version.getMessage() + ")";
					}
					return label;
				}
				if (element instanceof Model) {
					return "current";
				}
				return super.getText(element);
			}
		});
		
		dialog.setTitle("Revert Model");
		dialog.setMessage("Please select the model version to revert to.");
		dialog.setElements(model.getVersions().toArray());
		
		if (dialog.open() != Window.OK) {
		    return null;
		}
		Object[] result = dialog.getResult();
		
		if (result.length <= 0) {
			return null;
		}
		
		ModelVersion version = (ModelVersion) result[0];
		
		Resource modelRes = model.getResource();
		if (modelRes == null || version.getResource() == null) {
			return null;
		}
		
		modelRes.getContents().clear();
		modelRes.getContents().addAll(version.getResource().getContents());
		
		try {
			modelRes.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			LOGGER.error("Saving resource failed.", e);
		}
		
		Date date = new Date(version.getTimestamp());
		DateFormat df = DateFormat.getDateTimeInstance(
				DateFormat.SHORT, DateFormat.SHORT);
		
		return model.createVersion("Reverted to version " + df.format(date) + ".");
	}
	
	@Override
	public boolean isEnabled() {
		return true;
	}

}
