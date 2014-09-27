package de.uni_stuttgart.iste.cowolf.ui.navigator.handlers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.swing.JOptionPane;

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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.dialect.command.CreateRepresentationCommand;
import org.eclipse.sirius.business.api.helper.SiriusResourceHelper;
import org.eclipse.sirius.business.api.session.DefaultLocalSessionCreationOperation;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.impl.DSemanticDiagramImpl;
import org.eclipse.sirius.tools.api.command.semantic.AddSemanticResourceCommand;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelection;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallbackWithConfimation;
import org.eclipse.sirius.ui.business.internal.commands.ChangeViewpointSelectionCommand;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
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
				JOptionPane.showMessageDialog(null,
						"There is no viewpoint for " + modelFile.getFullPath());
			} else {
				// Now we have to create an aird file
				URI airdFileURI = URI.createPlatformResourceURI(modelFile
						.getFullPath().toString() + ".aird", true);

				// Create a Session from the session model URI
				org.eclipse.sirius.business.api.session.SessionCreationOperation sessionCreationOperation = new DefaultLocalSessionCreationOperation(
						airdFileURI, new NullProgressMonitor());
				sessionCreationOperation.execute();

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
							.toArray();
			Resource resource = (Resource) elements1[elements1.length - 1];
			
			AbstractModelManager modelManager = ModelRegistry.getInstance()
					.getModelManager(modelFile.getFileExtension());
							.toArray();
			
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
				IPath oldRepresentationPath = source.getFullPath()
						.removeLastSegments(1)
						.append(source.getName() + ".aird");

				String newPathString = newPath.toString();
				newPathString = (newPathString.substring(0,
						newPathString.length()) + ".aird");

				IPath newRepresentationPath = new Path(newPathString);

				IFile oldAirdFile = source.getProject().getWorkspace()
						.getRoot().getFile(oldRepresentationPath);
				if (oldAirdFile.exists()) {
					// oldAirdFile.move(newRepresentationPath, true,
					// new NullProgressMonitor());
					IFile newFile = source.getProject().getWorkspace()
							.getRoot().getFile(newPath);

					URI oldAirdUri = (URI.createURI(oldAirdFile
							.getLocationURI().toString()));
					//
					// IFile newAirdFile = source.getProject().getWorkspace()
					// .getRoot().getFile(newRepresentationPath);

					// URI newAirdUri = (URI.createURI(newAirdFile
					// .getLocationURI().toString()));

					URI newFileUri = (URI.createURI(newFile.getLocationURI()
							.toString()));

					ResourceSetImpl impl = new ResourceSetImpl();

					Resource resource = impl.getResource(
							URI.createURI(newFile.getLocationURI().toString()),
							true);

					EObject rootObject = null;
					if (newFile.getFileExtension().equals("sequence_diagram")) {
						Interaction interaction = null;

						EList<PackageableElement> pack = ((PackageImpl) resource
								.getContents().get(0)).getPackagedElements();
						for (PackageableElement element : pack) {
							if (element instanceof Interaction) {
								interaction = (Interaction) element;
							}
						}
						rootObject = interaction;
					} else {

						rootObject = resource.getContents().get(0);
					}

					Set<Viewpoint> availableViewpoints = ViewpointSelection
							.getViewpoints(newFile.getFileExtension());
					Collection<RepresentationDescription> descriptions = DialectManager.INSTANCE
							.getAvailableRepresentationDescriptions(
									availableViewpoints, rootObject);

					if (descriptions.isEmpty()) {
						// TODO
					}
					RepresentationDescription description = descriptions
							.iterator().next();

					// Create a new representation file
					// org.eclipse.sirius.business.api.session.SessionCreationOperation
					// sessionCreationOperation = new
					// DefaultLocalSessionCreationOperation(
					// newAirdUri, new NullProgressMonitor());
					// sessionCreationOperation.execute();

					Session oldSession = SessionManager.INSTANCE.getSession(
							oldAirdUri, new NullProgressMonitor());

					Collection<DRepresentation> representations = DialectManager.INSTANCE.getRepresentations(description, oldSession);
							

					DSemanticDiagramImpl currentRep = (DSemanticDiagramImpl) representations
							.iterator().next();

					// Session newSession = SessionManager.INSTANCE.getSession(
					// newAirdUri, new NullProgressMonitor());

					// newSession.save(new NullProgressMonitor());

					ResourceSet rs = new ResourceSetImpl();
					Resource rsc = rs.createResource(oldAirdUri);
					try {
						rsc.load(null);
					} catch (IOException e1) {
						// TODO Auto-generated catch block

					}
					List<DRepresentation> list = new ArrayList<DRepresentation>();
					list.add(currentRep);
					Collection<DRepresentation> coll = list;
					DAnalysis root = (DAnalysis) rsc.getContents().get(0);

					// MoveRepresentationCommand mrc = new
					// MoveRepresentationCommand(
					// oldSession, root, coll);
					//
					// oldSession.getTransactionalEditingDomain().getCommandStack().execute(mrc);

					EStructuralFeature targetFeature = currentRep.eClass()
							.getEStructuralFeature("target");

					TransactionalEditingDomain ted = (TransactionalEditingDomain) AdapterFactoryEditingDomain
							.getEditingDomainFor(currentRep);

					AddSemanticResourceCommand addCommandToSession = new AddSemanticResourceCommand(
							oldSession, newFileUri, new NullProgressMonitor());
					oldSession.getTransactionalEditingDomain()
							.getCommandStack().execute(addCommandToSession);

					oldSession.save(new NullProgressMonitor());
					
					Command com = SetCommand.create(ted, currentRep,
							targetFeature, rootObject);

					ted.getCommandStack().execute(com);
					oldSession.save(new NullProgressMonitor());
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
				IPath oldRepresentationPath = source.getFullPath()
						.removeLastSegments(1)
						.append(source.getName() + ".aird");

				IFile oldAirdFile = source.getProject().getWorkspace()
						.getRoot().getFile(oldRepresentationPath);
				if (oldAirdFile.exists()) {

					IFile newFile = source.getProject().getWorkspace()
							.getRoot().getFile(newPath);
					CreateRepresentationAndViewpointHandler.createAll(newFile,
							false);

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
