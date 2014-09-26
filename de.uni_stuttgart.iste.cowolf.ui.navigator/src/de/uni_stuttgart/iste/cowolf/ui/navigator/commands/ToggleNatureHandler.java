package de.uni_stuttgart.iste.cowolf.ui.navigator.commands;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociation;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationFactory;
import de.uni_stuttgart.iste.cowolf.core.natures.ProjectNature;
import de.uni_stuttgart.iste.cowolf.model.ModelRegistry;

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
			this.registerModels(project);
		} catch (CoreException e) {
			LOGGER.error("", e);
		}
	}
	
	private void registerModels(IResource res) {
		if (res instanceof IContainer) {
			try {
				for(IResource nextRes : ((IContainer) res).members()) {
					registerModels(nextRes);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		} else if (res instanceof IFile) {
			registerModels((IFile)res);
		}
	}
	
	private void registerModels(IFile res) {
		if (!ModelRegistry.getInstance().isModelManaged(res.getFileExtension())) {
			return;
		}
		
		// Register only managed models.
		ResourceSetImpl resSet = new ResourceSetImpl();
		Resource modelRes = resSet.createResource(URI.createURI(res.getLocationURI().toString()));
		
		try {
			modelRes.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			return;
		}
		
		// not a model resource.
		if (modelRes == null || !modelRes.isLoaded() || ModelRegistry.getInstance().getModelManager(modelRes) == null) {
			return;
		}
		ModelAssociation ma = ModelAssociationFactory.eINSTANCE.getModelAssociation(res.getProject());
		Model model = ma.registerModel(modelRes);
		if (model == null) {
			// Model is already registered. (Project import)
			return;
		}
		model.createVersion("Created model");
	}
}
