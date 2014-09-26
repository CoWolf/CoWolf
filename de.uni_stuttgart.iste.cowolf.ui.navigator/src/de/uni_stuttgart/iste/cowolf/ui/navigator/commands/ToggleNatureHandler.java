package de.uni_stuttgart.iste.cowolf.ui.navigator.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.uni_stuttgart.iste.cowolf.core.natures.ProjectNature;

public class ToggleNatureHandler extends AbstractHandler {

	//FIXME: pull up Invalidation Listener
	private final static String COWOLF_MARKER = "de.uni_stuttgart.iste.cowolf.core.cowolfmarker";
	
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IWorkbenchWindow window = PlatformUI.getWorkbench()
                .getActiveWorkbenchWindow();
		
		IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();

		toggleNature(selection);
		
        return null;
    }
	
	private void toggleNature(IStructuredSelection selection) {
		if (selection instanceof IStructuredSelection) {
			for (Iterator<?> it = ((IStructuredSelection)selection).iterator(); it.hasNext();) {
				Object element = it.next();
				IProject project = null;
				if (element instanceof IProject) {
					project = (IProject)element;
				} else if (element instanceof IAdaptable) {
					project = (IProject)((IAdaptable)element).getAdapter(IProject.class);
				}
				if (project != null) {
					toggleNature(project);
				}
			}
		}
	}

	private final static Logger LOGGER = LoggerFactory
			.getLogger(ToggleNatureHandler.class);
	
	private void toggleNature(IProject project) {
		try {
			IProjectDescription description = project.getDescription();
			String[] natures = description.getNatureIds();
			for (int i = 0; i < natures.length; ++i) {
				if (ProjectNature.NATURE_ID.equals(natures[i])) {
					// Remove the nature
					String[] newNatures = new String[natures.length - 1];
					System.arraycopy(natures, 0, newNatures, 0, i);
					System.arraycopy(natures, i + 1, newNatures, i, natures.length - i - 1);
					description.setNatureIds(newNatures);
					project.setDescription(description, null);
					project.deleteMarkers(COWOLF_MARKER, true, IResource.DEPTH_INFINITE);
					return;
				}
			}
			// Add the nature
			String[] newNatures = new String[natures.length + 1];
			System.arraycopy(natures, 0, newNatures, 1, natures.length);
			newNatures[0] = ProjectNature.NATURE_ID;
			description.setNatureIds(newNatures);
			project.setDescription(description, null);
		} catch (CoreException e) {
			LOGGER.error("", e);
		}
	}
}
