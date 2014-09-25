package de.uni_stuttgart.iste.cowolf.ui.navigator.commands;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
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
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.internal.impl.PackageImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.ModelAssociationFactoryImpl;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Interaction;

public class CreateRepresentationAndViewpointHandler extends AbstractHandler {

	private final static Logger LOGGER = LoggerFactory
			.getLogger(ModelAssociationFactoryImpl.class);

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
			createAll(file, file.getFileExtension());
		}


		return null;
	}

	public static void createAll(IFile modelFile, String fileExtension) {
		try {
			// Now we have to create an aird file
			URI airdFileURI = URI.createPlatformResourceURI(modelFile
					.getFullPath().toString() + ".aird", true);

			// Create a Session from the session model URI
			org.eclipse.sirius.business.api.session.SessionCreationOperation sessionCreationOperation = new DefaultLocalSessionCreationOperation(
					airdFileURI, new NullProgressMonitor());
			sessionCreationOperation.execute();

			// create viewpoint
			Session session = SessionManager.INSTANCE.getSession(airdFileURI,
					new NullProgressMonitor());

			URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath()
					.toString(), true);

			// adding the resource to the session
			AddSemanticResourceCommand addCommandToSession = new AddSemanticResourceCommand(
					session, fileURI, new NullProgressMonitor());
			session.getTransactionalEditingDomain().getCommandStack()
					.execute(addCommandToSession);
			session.save(new NullProgressMonitor());

			// find and add viewpoint
			Set<Viewpoint> availableViewpoints = ViewpointSelection
					.getViewpoints(fileExtension);
			if (availableViewpoints.isEmpty())
				throw new Exception(
						"Could not find viewport for file extension "
								+ fileExtension);

			Set<Viewpoint> viewpoints = new HashSet<Viewpoint>();
			for (Viewpoint p : availableViewpoints)
				viewpoints.add(SiriusResourceHelper.getCorrespondingViewpoint(
						session, p));

			ViewpointSelection.Callback callback = new ViewpointSelectionCallbackWithConfimation();

			RecordingCommand command = new ChangeViewpointSelectionCommand(
					session, callback, viewpoints, new HashSet<Viewpoint>(),
					true, new NullProgressMonitor());
			TransactionalEditingDomain domain = session
					.getTransactionalEditingDomain();
			domain.getCommandStack().execute(command);

			// create representation
			EObject rootObject = null;
			if (modelFile.getFileExtension().equals("sequence_diagram")) {
				Interaction interaction = null;
				Object[] elements1 = session.getSemanticResources().toArray();
				Resource resource = (Resource) elements1[elements1.length - 1];

				EList<PackageableElement> pack = ((PackageImpl) resource
						.getContents().get(0)).getPackagedElements();
				for (PackageableElement element : pack) {
					if (element instanceof Interaction) {
						interaction = (Interaction) element;
					}
				}
				rootObject = interaction;
			} else {
				Object[] elements1 = session.getSemanticResources().toArray();
				Resource resource = (Resource) elements1[elements1.length - 1];

				rootObject = resource.getContents().get(0);
			}

			Collection<RepresentationDescription> descriptions = DialectManager.INSTANCE
					.getAvailableRepresentationDescriptions(
							session.getSelectedViewpoints(false), rootObject);
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

			// open editor for last representation
			Collection<DRepresentation> representations = viewpointDialectManager
					.getRepresentations(description, session);
			Object[] arrayRep = representations.toArray();
			DRepresentation myDiagramRepresentation = (DRepresentation) arrayRep[arrayRep.length - 1];
			DialectUIManager dialectUIManager = DialectUIManager.INSTANCE;
			dialectUIManager.openEditor(session, myDiagramRepresentation,
					new NullProgressMonitor());

			// save session and refresh workspace
			session.save(new NullProgressMonitor());
			modelFile.getProject().refreshLocal(IResource.DEPTH_INFINITE,
					new NullProgressMonitor());
		} catch (Exception e) {
			LOGGER.error("Loading resource failed.", e);

		}
	}
}
