package de.uni_stuttgart.iste.cowolf.ui.transformation;

import java.util.HashSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociation;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationFactory;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion;
import de.uni_stuttgart.iste.cowolf.core.natures.ProjectNature;
import de.uni_stuttgart.iste.cowolf.model.ModelRegistry;

public class InvalidationListener implements IResourceChangeListener {
		
	
	private final static Logger LOGGER = LoggerFactory
			.getLogger(InvalidationListener.class);
	
	private final static String COWOLF_PROBLEM = "de.uni_stuttgart.iste.cowolf.ui.transformation.coevolvewarning";

	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		if (event.getType() != IResourceChangeEvent.POST_CHANGE) {
			return;
		}

		IResourceDeltaVisitor visitor = new IResourceDeltaVisitor() {

			@Override
			public boolean visit(IResourceDelta delta) throws CoreException {
				IResource res = delta.getResource();

				// Don't go into non-CoWolf projects.
				if (res.getType() == IResource.PROJECT) {
					if (!res.getProject().isOpen()) {
						return false;
					}
					return res.getProject().hasNature(ProjectNature.NATURE_ID);
				}
				
				if (res.getType() != IResource.FILE) {
					return true;
				}
				
				if (res.getProject() == null) {
					return false;
				}

				// Now, there are only visible files within a project.

				// Filter for managed files.
				if (!ModelRegistry.getInstance().isModelManaged(res.getFileExtension())) {
					return false;
				}

				if (delta.getKind() == IResourceDelta.CHANGED && (delta.getFlags() & IResourceDelta.CONTENT) == IResourceDelta.CONTENT) {
					if (doesCowolfMarkerExist(res)) {
						deleteCoWolfMarkers(res);
					}
					
					LOGGER.debug("Invalidating {}", res.getLocation());

					invalidateModels(res);
				}

				return true;
			}

		};

		try {
			event.getDelta().accept(visitor);
		} catch (CoreException e) {
			LOGGER.error("", e);
		}
	
	}
	
	/**
	 * Gets the associated models for the changed one and sets the CoWolf-Marker
	 * for them.
	 * 
	 * @param changedRes
	 *            to get the associated models from
	 */
	private void invalidateModels(IResource changedRes) {

		ModelAssociation ma = ModelAssociationFactory.eINSTANCE
				.getModelAssociation(changedRes.getProject());

		Model model = ma.getModelByPath(changedRes.getProjectRelativePath().toString());
		
		if (model == null) {
			return;
		}
		
		HashSet<IFile> targets = new HashSet<>();
		for (Association assoc : model.getAllAssociations()) {

//			for (ModelVersion v : assoc.getSource()) {
//				
//				if (v.getModel().getModel() != changedRes.getProjectRelativePath().toString()) {
//					targets.add(v.getModel().getFile());
//				} else {
//					break;
//				}
//			}
			for (ModelVersion v : assoc.getTarget()) {
				
				if (!v.getModel().getModel().equals(changedRes.getProjectRelativePath().toString())) {
					targets.add(v.getModel().getFile());
				} else {
					break;
				}
			}
		}
		
		for (IFile target : targets) {

			if (!doesCowolfMarkerExist(target)) {
				setMarker(changedRes, target);
			}
		}
	}

	/**
	 * Sets a CoWolf-Marker to give IResource.
	 * 
	 * @param sourceRes
	 *            used in the marker message to show the user which resource was
	 *            changed.
	 * @param targetRes
	 *            on that the marker should be set.
	 */
	private void setMarker(final IResource sourceRes, final IResource targetRes) {

		WorkspaceJob job = new WorkspaceJob("Set marker to invalid models") {

			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor)
					throws CoreException {

				IMarker resMarker = targetRes.createMarker(COWOLF_PROBLEM);

				if (resMarker.exists()) {

					resMarker.setAttribute(IMarker.MESSAGE,
									"The associated source model ('"
											+ sourceRes.getName()
											+ "') was changed. It's recommended to perform a co-evolution.");
					resMarker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
					resMarker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
				}

				return Status.OK_STATUS;
			}
		};
		
		job.setRule(targetRes);
		job.schedule();
	}

	/**
	 * Deletes all CoWolf-Markers of given IResource.
	 * 
	 * @param changedRes
	 */
	private void deleteCoWolfMarkers(final IResource changedRes) {

		WorkspaceJob job = new WorkspaceJob("Delete CoWolf-Marker of the model") {
			
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor)
					throws CoreException {

				changedRes.deleteMarkers(COWOLF_PROBLEM, false,
						IResource.DEPTH_ZERO);

				return Status.OK_STATUS;
			}
		};

		job.setRule(changedRes);
		job.schedule();

	}

	/**
	 * Checks if CoWolf-Markers are specified for given IResource.
	 * 
	 * @param res to check
	 * @return if CoWolf-Markers are specified
	 */
	private boolean doesCowolfMarkerExist(IResource res) {

		IMarker[] markers = null;
		try {
			markers = res.findMarkers(COWOLF_PROBLEM, false, IResource.DEPTH_ZERO);
			
			return markers.length > 0;

		} catch (CoreException e) {
			LOGGER.error("", e);
		}
		return false;

	}
}