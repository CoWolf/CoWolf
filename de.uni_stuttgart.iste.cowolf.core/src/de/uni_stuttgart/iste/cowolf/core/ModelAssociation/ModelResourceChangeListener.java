package de.uni_stuttgart.iste.cowolf.core.ModelAssociation;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.uni_stuttgart.iste.cowolf.core.natures.ProjectNature;
import de.uni_stuttgart.iste.cowolf.model.ModelRegistry;

public class ModelResourceChangeListener implements IResourceChangeListener {

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

				// ignore hidden files/directories (starting with ".")
				if (res.getName().startsWith(".")) {
					return false;
				}

				// Go into all things other than files
				if (res.getType() != IResource.FILE) {
					return true;
				}

				if (res.getProject() == null) {
					return false;
				}

				// Now, there are only visible files within a project.

				// Filter for managed files.
				if (!ModelRegistry.getInstance().isModelManaged(
						res.getFileExtension())) {
					return false;
				}

				System.out.println(res.getFullPath().toString() + " - "
						+ delta.getKind());
				ModelAssociation ma = ModelAssociationFactory.eINSTANCE
						.getModelAssociation(res.getProject());

				switch (delta.getKind()) {
				case IResourceDelta.ADDED:

					// Register only managed models.
					ResourceSetImpl resSet = new ResourceSetImpl();
					Resource modelRes = resSet.createResource(URI.createURI(res
							.getLocationURI().toString()));

					try {
						modelRes.load(Collections.EMPTY_MAP);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						return false;
					}

					// not a model resource.
					if (modelRes == null
							|| !modelRes.isLoaded()
							|| ModelRegistry.getInstance().getModelManager(
									modelRes) == null) {
						return false;
					}

					// Moved files
					if ((delta.getFlags() & IResourceDelta.MOVED_FROM) == IResourceDelta.MOVED_FROM) {
						IPath from = delta.getMovedFromPath();
						if (res.getProject().getProjectRelativePath()
								.isPrefixOf(from)) {
							// moved from same project
							System.out.println(from.makeRelativeTo(res
									.getProject().getFullPath()));
							Model model = ma.getModelByPath(from
									.makeRelativeTo(
											res.getProject().getFullPath())
									.toString());

							if (model != null) {
								model.rename(res.getProjectRelativePath()
										.toString());
								System.out.println("Renamed model file.");
							}
						} else {
							// FIXME: For now, handle as new.
							Model model = ma.registerModel(modelRes);
							model.createVersion();
							System.out.println("Created model after move.");
						}
					} else { // created files
						Model model = ma.registerModel(modelRes);
						model.createVersion();
						System.out.println("Created model file.");
					}
					break;

				case IResourceDelta.CHANGED:

					if ((delta.getFlags() & IResourceDelta.CONTENT) == IResourceDelta.CONTENT) {
						Model model = ma.getModelByPath(res
								.getProjectRelativePath().toString());
						if (model != null) {

							invalidateModels(res);

							// model.createVersion();
							// System.out.println("Created version.");
						}
					}
					break;

				case IResourceDelta.REMOVED:
					// If not moved, but really removed.
					if ((delta.getFlags() & IResourceDelta.MOVED_TO) != IResourceDelta.MOVED_TO) {
						Model model = ma.getModelByPath(res
								.getProjectRelativePath().toString());
						if (model != null) {
							ma.removeModel(model);
							System.out.println("Removed model.");
						}
					}
					break;
				}

				return true;
			}

		};

		try {
			event.getDelta().accept(visitor);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void invalidateModels(IResource changedRes) {

		// Delete marker of this model if model was changed
		IMarker[] markers = null;
		try {
			markers = changedRes.findMarkers(IMarker.PROBLEM, false,
					IResource.DEPTH_ZERO);
			for (IMarker marker : markers) {
				if (marker.getAttribute("invalid") != null) {
					marker.delete();
				}
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ModelAssociation ma = ModelAssociationFactory.eINSTANCE
				.getModelAssociation(changedRes.getProject());

		for (Association ass : ma.getAssociations()) {

			if (ass.getTarget().size() > 0) {

				IFile targetModel = ass.getTarget().get(0).getModel().getFile();

				if (!doesCowolfMarkerExist(targetModel)) {

					setMarker(changedRes, targetModel);

				}

			}

		}

	}

	private void setMarker(final IResource sourceRes, final IResource targetRes) {

		WorkspaceJob job = new WorkspaceJob("Set marker to invalid models") {

			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor)
					throws CoreException {

				// TODO: CoWolf Problem
				IMarker resMarker = targetRes.createMarker(IMarker.PROBLEM);

				if (resMarker.exists()) {

					resMarker
							.setAttribute(
									IMarker.MESSAGE,
									"The associated source model ('"
											+ sourceRes.getName()
											+ "') was changed. It's recommended to perform a co-evolution.");
					resMarker.setAttribute(IMarker.PRIORITY,
							IMarker.PRIORITY_HIGH);
					resMarker.setAttribute(IMarker.SEVERITY,
							IMarker.SEVERITY_WARNING);
					resMarker.setAttribute(IMarker.SOURCE_ID, sourceRes
							.getProjectRelativePath().toString());
					// TODO: own marker attribute
					resMarker.setAttribute("invalid", true);

				}

				return Status.OK_STATUS;
			}
		};

		job.setRule(targetRes);
		job.schedule();

	}

	private boolean doesCowolfMarkerExist(IResource res) {

		IMarker[] markers = null;
		try {
			markers = res.findMarkers(IMarker.PROBLEM, false,
					IResource.DEPTH_ZERO);
			for (IMarker marker : markers) {
				return marker.getAttribute("invalid") != null;
			}

		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

}
