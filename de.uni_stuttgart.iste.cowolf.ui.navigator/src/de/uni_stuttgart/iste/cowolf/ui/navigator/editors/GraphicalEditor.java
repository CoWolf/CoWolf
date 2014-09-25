package de.uni_stuttgart.iste.cowolf.ui.navigator.editors;

import javax.swing.JOptionPane;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DSemanticDiagramSpec;
import org.eclipse.sirius.diagram.sequence.business.internal.metamodel.SequenceDDiagramSpec;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.ui.IEditorLauncher;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelResourceChangeListener;

public class GraphicalEditor implements IEditorLauncher {

	protected AdapterFactoryEditingDomain editingDomain;

	private final static Logger LOGGER = LoggerFactory
			.getLogger(GraphicalEditor.class);

	@Override
	public void open(IPath filePath) {

		// get selection
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IStructuredSelection selection = (IStructuredSelection) window
				.getSelectionService().getSelection();
		if (selection.getFirstElement() instanceof IFile) {
			IFile file = (IFile) selection.getFirstElement();

			IProject project = file.getProject();

			// there is a bug in Sirius which does not redo the connection
			// between file and representation after a restart of Eclipse.
			// Therefore we redo the modeling nature as a workaround
			try {
				ModelingProjectManager.INSTANCE.removeModelingNature(project,
						new NullProgressMonitor());
				ModelingProjectManager.INSTANCE.convertToModelingProject(
						project, new NullProgressMonitor());
			} catch (CoreException e) {
				LOGGER.error("Failed to redo modeling nature ({}).",
						e.getMessage(), e);
			}

		
			IFile airdFile = project.getFile(file.getName());

			URI representationsFileURI = URI.createPlatformResourceURI(airdFile
					.getFullPath().toOSString(), true);

			String fileName = file.getName().replace(".aird", "");
			
			IFile currentFile = project.getFile(fileName);
			
			URI currentFileURI = URI.createPlatformResourceURI(currentFile
					.getFullPath().toOSString(), true);


			Session session = SessionManager.INSTANCE.getSession(
					representationsFileURI, new NullProgressMonitor());

			// get representation
			DAnalysis root = (DAnalysis) session.getSessionResource()
					.getContents().get(0);
			EList<DView> views = root.getOwnedViews();

			EList<DRepresentation> representations = new BasicEList<DRepresentation>();

			for (DView view : views) {
				representations.addAll(view.getOwnedRepresentations());
			}

			DRepresentation representation = null;
			EObject rootObject = null;
			for (DRepresentation currentRep : representations) {
				if (currentRep instanceof SequenceDDiagramSpec) {
					rootObject = ((SequenceDDiagramSpec) currentRep)
							.getTarget();
				} else if (currentRep instanceof DSemanticDiagramSpec) {
					rootObject = ((DSemanticDiagramSpec) currentRep)
							.getTarget();
				} else {
					break;
				}

				Resource rootResource = rootObject.eResource();
				if(rootResource == null){
					break;
				}
				URI rootUriInCurrentRepresentation = rootResource.getURI();

				if (rootUriInCurrentRepresentation.equals(currentFileURI)) {
					representation = currentRep;
					break;
				}

			}

			if (session != null && representation != null) {

				DialectUIManager.INSTANCE.openEditor(session, representation,
						new NullProgressMonitor());
			}else{
				JOptionPane.showMessageDialog(null, "No representation found for selected model");
			}
		}
	}
}