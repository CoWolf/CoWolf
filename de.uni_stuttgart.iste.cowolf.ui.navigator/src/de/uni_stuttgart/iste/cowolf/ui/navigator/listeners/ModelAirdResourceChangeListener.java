package de.uni_stuttgart.iste.cowolf.ui.navigator.listeners;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociation;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationFactory;
import de.uni_stuttgart.iste.cowolf.core.natures.ProjectNature;
import de.uni_stuttgart.iste.cowolf.model.ModelRegistry;
import de.uni_stuttgart.iste.cowolf.ui.navigator.handlers.CreateRepresentationAndViewpointHandler;

/**
 * @author Verena Käfer
 * 
 *         This class reacts on changes in the navigator and calls methods to
 *         change the according aird files
 *
 */
public class ModelAirdResourceChangeListener implements IResourceChangeListener {

	private final static Logger LOGGER = LoggerFactory
			.getLogger(ModelAirdResourceChangeListener.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.resources.IResourceChangeListener#resourceChanged(org
	 * .eclipse.core.resources.IResourceChangeEvent)
	 */
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
					if (delta.getKind() == IResourceDelta.REMOVED) {
						ModelAssociationFactory.eINSTANCE
								.removeModelAssociation(res.getProject());
						return false;
					}
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

				LOGGER.debug("{} - {} - {}", res.getFullPath().toString(),
						delta.getKind(), delta.getFlags());
				ModelAssociation ma = ModelAssociationFactory.eINSTANCE
						.getModelAssociation(res.getProject());

				switch (delta.getKind()) {
				case IResourceDelta.ADDED:
					// Moved files
					if ((delta.getFlags() & IResourceDelta.MOVED_FROM) == IResourceDelta.MOVED_FROM) {
						IPath from = delta.getMovedFromPath();
						IFile source = ResourcesPlugin.getWorkspace().getRoot()
								.getFile(from);

						if (source.getProject() != null
								&& source.getProject().equals(res.getProject())) {
							// moved from same project
							LOGGER.debug("{}", from.makeRelativeTo(res
									.getProject().getFullPath()));
							Model model = ma.getModelByPath(from
									.makeRelativeTo(
											res.getProject().getFullPath())
									.toString());

							if (model != null) {
								CreateRepresentationAndViewpointHandler
										.renameAirdFile(source,
												res.getFullPath());
								LOGGER.debug("Renamed model file.");
							}
						} else if (source.getProject() != null
								&& ModelAssociationFactory.eINSTANCE
										.getModelAssociation(source
												.getProject()) != null) {
							LOGGER.debug("Moved to other project...");
							final Model sourceModel = ModelAssociationFactory.eINSTANCE
									.getModelAssociation(source.getProject())
									.getModelByPath(
											source.getProjectRelativePath()
													.toString());

							if (sourceModel != null) {
								CreateRepresentationAndViewpointHandler
										.renameAirdFile(source,
												res.getFullPath());
							}
						}
					} else if ((delta.getFlags() & IResourceDelta.COPIED_FROM) == IResourceDelta.COPIED_FROM) {
						// copied files
						// XXX: COPIED_FROM is not yet supported, see
						// https://bugs.eclipse.org/bugs/show_bug.cgi?id=217489

						IPath from = delta.getMovedFromPath();
						IFile source = ResourcesPlugin.getWorkspace().getRoot()
								.getFile(from);

						Model sourceModel = ModelAssociationFactory.eINSTANCE
								.getModelAssociation(source.getProject())
								.getModelByPath(
										source.getProjectRelativePath()
												.toString());
						if (sourceModel != null) {
							CreateRepresentationAndViewpointHandler
									.copyAirdFile(source, res.getFullPath());
						}

					}
					break;

				case IResourceDelta.REMOVED:
					// If not moved, but really removed.
					if ((delta.getFlags() & IResourceDelta.MOVED_TO) != IResourceDelta.MOVED_TO) {

						IPath from = delta.getFullPath();
						IFile source = ResourcesPlugin.getWorkspace().getRoot()
								.getFile(from);

						CreateRepresentationAndViewpointHandler
								.deleteAirdFile(source);

					}
					break;
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
}
