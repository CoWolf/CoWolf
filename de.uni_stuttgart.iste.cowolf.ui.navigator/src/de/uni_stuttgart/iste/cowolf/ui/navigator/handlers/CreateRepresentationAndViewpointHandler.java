package de.uni_stuttgart.iste.cowolf.ui.navigator.handlers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.dialect.command.CreateRepresentationCommand;
import org.eclipse.sirius.business.api.helper.SiriusResourceHelper;
import org.eclipse.sirius.business.api.session.DefaultLocalSessionCreationOperation;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.command.semantic.AddSemanticResourceCommand;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelection;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallbackWithConfimation;
import org.eclipse.sirius.ui.business.internal.commands.ChangeViewpointSelectionCommand;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.ModelAssociationFactoryImpl;
import de.uni_stuttgart.iste.cowolf.model.AbstractModelManager;
import de.uni_stuttgart.iste.cowolf.model.ModelRegistry;

/**
 * @author Verena Käfer
 * 
 *         This class handles the creation of new aird files and their
 *         configuration
 *
 */
public class CreateRepresentationAndViewpointHandler extends AbstractHandler {

	private final static Logger LOGGER = LoggerFactory
			.getLogger(ModelAssociationFactoryImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands
	 * .ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IStructuredSelection selection = (IStructuredSelection) window
				.getSelectionService().getSelection();

		Iterator iterator = selection.iterator();

		while (iterator.hasNext()) {
			// only IFiles as the command is only clickable for IFiles
			IFile file = (IFile) iterator.next();
			createAll(file, false);
		}

		return null;
	}

	/**
	 * @param modelFile
	 *            the current file for which an aird file should be created
	 * @param firstCreation
	 *            true if called in a model creation wizard, false else
	 */
	public static void createAll(IFile modelFile, boolean firstCreation) {
		try {
			Set<Viewpoint> availableViewpoints = ViewpointSelection
					.getViewpoints(modelFile.getFileExtension());
			if (availableViewpoints.isEmpty()) {
				MessageDialog.openInformation(Display.getCurrent().getActiveShell(), "Viewpoint missing", "There is no viewpoint for " + modelFile.getFullPath());
			} else {
				// Now we have to create an aird file
				URI airdFileURI = URI.createPlatformResourceURI(modelFile
						.getFullPath().toString() + ".aird", true);

				// Create a Session from the session model URI
				org.eclipse.sirius.business.api.session.SessionCreationOperation sessionCreationOperation = new DefaultLocalSessionCreationOperation(
						airdFileURI, new NullProgressMonitor());
				sessionCreationOperation.execute();

				// create viewpoint
				Session session = SessionManager.INSTANCE.getSession(
						airdFileURI, new NullProgressMonitor());

				URI fileURI = URI.createPlatformResourceURI(modelFile
						.getFullPath().toString(), true);

				// adding the resource to the session
				AddSemanticResourceCommand addCommandToSession = new AddSemanticResourceCommand(
						session, fileURI, new NullProgressMonitor());
				session.getTransactionalEditingDomain().getCommandStack()
						.execute(addCommandToSession);
				session.save(new NullProgressMonitor());

				// find and add viewpoint

				Set<Viewpoint> viewpoints = new HashSet<Viewpoint>();
				for (Viewpoint p : availableViewpoints)
					viewpoints.add(SiriusResourceHelper
							.getCorrespondingViewpoint(session, p));

				ViewpointSelection.Callback callback = new ViewpointSelectionCallbackWithConfimation();

				RecordingCommand command = new ChangeViewpointSelectionCommand(
						session, callback, viewpoints,
						new HashSet<Viewpoint>(), true,
						new NullProgressMonitor());
				TransactionalEditingDomain domain = session
						.getTransactionalEditingDomain();
				domain.getCommandStack().execute(command);

				Object[] elements1 = session.getSemanticResources().toArray();

				Resource resource = (Resource) elements1[elements1.length - 1];

				AbstractModelManager modelManager = ModelRegistry.getInstance()
						.getModelManager(modelFile.getFileExtension());

				EObject rootObject = modelManager.getRootObject(resource);

				Collection<RepresentationDescription> descriptions = DialectManager.INSTANCE
						.getAvailableRepresentationDescriptions(
								session.getSelectedViewpoints(false),
								rootObject);
				if (descriptions.isEmpty())
					throw new Exception(
							"Could not find representation description for object: "
									+ rootObject);
				RepresentationDescription description = descriptions.iterator()
						.next();

				DialectManager viewpointDialectManager = DialectManager.INSTANCE;

				Command createViewCommand = new CreateRepresentationCommand(
						session, description, rootObject, modelFile.getName(),
						new NullProgressMonitor());

				session.getTransactionalEditingDomain().getCommandStack()
						.execute(createViewCommand);

				SessionManager.INSTANCE.notifyRepresentationCreated(session);

				if (firstCreation) {
					// open editor for last representation
					Collection<DRepresentation> representations = viewpointDialectManager
							.getRepresentations(description, session);
					Object[] arrayRep = representations.toArray();
					DRepresentation myDiagramRepresentation = (DRepresentation) arrayRep[arrayRep.length - 1];
					DialectUIManager dialectUIManager = DialectUIManager.INSTANCE;
					dialectUIManager.openEditor(session,
							myDiagramRepresentation, new NullProgressMonitor());
				}

				// save session and refresh workspace
				session.save(new NullProgressMonitor());
				modelFile.getProject().refreshLocal(IResource.DEPTH_INFINITE,
						new NullProgressMonitor());
			}
		} catch (Exception e) {
			LOGGER.error("Loading resource failed.", e);

		}
	}

	/**
	 * If a file is renamed/moved this method deletes the old aird file if it
	 * exists and creates a new one for the new location
	 * 
	 * @param source
	 *            the source before the rename/move
	 * @param newPath
	 *            the full path to the new resource
	 */
	public static void renameAirdFile(final IFile source, final IPath newPath) {
		// update aird file
		new WorkspaceJob("moced aird file") {

			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) {
				IPath oldAirdPath = source.getFullPath().removeLastSegments(1)
						.append(source.getName() + ".aird");

				IFile oldAirdFile = source.getProject().getWorkspace()
						.getRoot().getFile(oldAirdPath);

				String newAirdString = newPath.toString();

				newAirdString = (newAirdString.substring(0,
						newAirdString.length()) + ".aird");

				IPath newAirdPath = new Path(newAirdString);

				IFile newFile = source.getProject().getWorkspace().getRoot()
						.getFile(newPath);

				URI newFileUri = (URI.createURI(newFile.getLocationURI()
						.toString()));

				if (oldAirdFile.exists()) {

					try {
						oldAirdFile.copy(newAirdPath, false,
								new NullProgressMonitor());

						IFile newAirdFile = source.getProject().getWorkspace()
								.getRoot().getFile(newAirdPath);

						URI newAirdUri = (URI.createURI(newAirdFile
								.getLocationURI().toString()));

						BufferedReader reader = new BufferedReader(
								new FileReader(newAirdFile.getLocation()
										.toString()));
						String line = null;
						StringBuilder stringBuilder = new StringBuilder();

						while ((line = reader.readLine()) != null) {
							stringBuilder.append(line);

						}

						String result = stringBuilder.toString();
						result = result.replace(source.getProjectRelativePath()
								.toString(), newFile.getProjectRelativePath()
								.toString());

						FileOutputStream stream = new FileOutputStream(
								newAirdFile.getLocation().toString(), false);
						byte[] myBytes = result.getBytes();
						stream.write(myBytes);
						stream.close();

						oldAirdFile.delete(true, new NullProgressMonitor());

						Session newSession = SessionManager.INSTANCE
								.getSession(newAirdUri,
										new NullProgressMonitor());

						Collection<Resource> resources = newSession
								.getSemanticResources();

						// Sirius deleted the model entry
						if (resources.size() == 0) {
							MessageDialog.openInformation(
									Display.getCurrent().getActiveShell(), 
									"Can't copy the layout", 
									"The layout file was deleted by Sirius before");

							AddSemanticResourceCommand addResourceToSession = new AddSemanticResourceCommand(
									newSession, newFileUri,
									new NullProgressMonitor());

							newSession.getTransactionalEditingDomain()
									.getCommandStack()
									.execute(addResourceToSession);
							newSession.save(new NullProgressMonitor());

							newSession.save(new NullProgressMonitor());

							// This is tricky:
							// Sirius takes in the session the uri to the model,
							// but in the aird it only needs the name of the
							// file. This makes problems in subfolders.
							// Therefore we replace the project relative path
							// with the file name
							BufferedReader reader1 = new BufferedReader(
									new FileReader(newAirdFile.getLocation()
											.toString()));
							String line1 = null;
							StringBuilder stringBuilder1 = new StringBuilder();

							while ((line1 = reader1.readLine()) != null) {
								stringBuilder1.append(line1);

							}

							String result1 = stringBuilder1.toString();
							result1 = result1.replace(newFile
									.getProjectRelativePath().toString(),
									newFile.getName());

							FileOutputStream stream1 = new FileOutputStream(
									newAirdFile.getLocation().toString(), false);
							byte[] myBytes1 = result1.getBytes();
							stream1.write(myBytes1);
							stream1.close();

						}

					} catch (CoreException e) {
						LOGGER.error("Renamin resource failed.", e);
					} catch (FileNotFoundException e) {
						LOGGER.error("Renamin resource failed.", e);
					} catch (IOException e) {
						LOGGER.error("Renamin resource failed.", e);
					}
				}

				return Status.OK_STATUS;
			}
		}.schedule();

	}

	/**
	 * If a file is copied, this method creates a new aird file for the copy, if
	 * the origin al had one
	 * 
	 * @param source
	 *            the source before the copy
	 * @param newPath
	 *            the full path to the new resource
	 */
	public static void copyAirdFile(final IFile source, final IPath newPath) {
		// copy aird file
		new WorkspaceJob("New aird file for copy") {

			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) {
				IPath oldAirdPath = source.getFullPath().removeLastSegments(1)
						.append(source.getName() + ".aird");

				IFile oldAirdFile = source.getProject().getWorkspace()
						.getRoot().getFile(oldAirdPath);

				String newAirdString = newPath.toString();

				newAirdString = (newAirdString.substring(0,
						newAirdString.length()) + ".aird");

				IPath newAirdPath = new Path(newAirdString);

				IFile newFile = source.getProject().getWorkspace().getRoot()
						.getFile(newPath);

				URI newFileUri = (URI.createURI(newFile.getLocationURI()
						.toString()));

				if (oldAirdFile.exists()) {

					try {
						oldAirdFile.copy(newAirdPath, false,
								new NullProgressMonitor());

						IFile newAirdFile = source.getProject().getWorkspace()
								.getRoot().getFile(newAirdPath);

						URI newAirdUri = (URI.createURI(newAirdFile
								.getLocationURI().toString()));

						BufferedReader reader = new BufferedReader(
								new FileReader(newAirdFile.getLocation()
										.toString()));
						String line = null;
						StringBuilder stringBuilder = new StringBuilder();

						while ((line = reader.readLine()) != null) {
							stringBuilder.append(line);

						}

						String result = stringBuilder.toString();
						result = result.replace(source.getProjectRelativePath()
								.toString(), newFile.getProjectRelativePath()
								.toString());

						FileOutputStream stream = new FileOutputStream(
								newAirdFile.getLocation().toString(), false);
						byte[] myBytes = result.getBytes();
						stream.write(myBytes);
						stream.close();

						Session newSession = SessionManager.INSTANCE
								.getSession(newAirdUri,
										new NullProgressMonitor());

						Collection<Resource> resources = newSession
								.getSemanticResources();

						// Sirius deleted the model entry
						if (resources.size() == 0) {
							MessageDialog.openInformation(
									Display.getCurrent().getActiveShell(), 
									"Can't copy the layout", 
									"The layout file was deleted by Sirius before");

							AddSemanticResourceCommand addResourceToSession = new AddSemanticResourceCommand(
									newSession, newFileUri,
									new NullProgressMonitor());

							newSession.getTransactionalEditingDomain()
									.getCommandStack()
									.execute(addResourceToSession);
							newSession.save(new NullProgressMonitor());

							newSession.save(new NullProgressMonitor());

							// This is tricky:
							// Sirius takes in the session the uri to the model,
							// but in the aird it only needs the name of the
							// file. This makes problems in subfolders.
							// Therefore we replace the project relative path
							// with the file name
							BufferedReader reader1 = new BufferedReader(
									new FileReader(newAirdFile.getLocation()
											.toString()));
							String line1 = null;
							StringBuilder stringBuilder1 = new StringBuilder();

							while ((line1 = reader1.readLine()) != null) {
								stringBuilder1.append(line1);

							}

							String result1 = stringBuilder1.toString();
							result1 = result1.replace(newFile
									.getProjectRelativePath().toString(),
									newFile.getName());

							FileOutputStream stream1 = new FileOutputStream(
									newAirdFile.getLocation().toString(), false);
							byte[] myBytes1 = result1.getBytes();
							stream1.write(myBytes1);
							stream1.close();

						}

					} catch (CoreException e) {
						LOGGER.error("Copying resource failed.", e);
					} catch (FileNotFoundException e) {
						LOGGER.error("Copying resource failed.", e);
					} catch (IOException e) {
						LOGGER.error("Copying resource failed.", e);
					}
				}

				return Status.OK_STATUS;
			}
		}.schedule();
	}

	/**
	 * if a file is deleted, the according aird file is deleted
	 * 
	 * @param source
	 *            the deleted source
	 */
	public static void deleteAirdFile(final IFile source) {
		// delete aird file
		new WorkspaceJob("New aird file for copy") {

			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) {
				IPath oldRepresentationPath = source.getFullPath()
						.removeLastSegments(1)
						.append(source.getName() + ".aird");

				IFile oldAirdFile = source.getProject().getWorkspace()
						.getRoot().getFile(oldRepresentationPath);
				if (oldAirdFile.exists()) {
					try {
						oldAirdFile.delete(false, new NullProgressMonitor());

					} catch (CoreException e) {
						LOGGER.error("Deleting resource failed.", e);
					}
				}
				return Status.OK_STATUS;
			}
		}.schedule();
	}

}
