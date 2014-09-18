package de.uni_stuttgart.iste.cowolf.ui.navigator.editors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
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
import org.eclipse.emf.ecore.util.*;

public class GraphicalEditor implements IEditorLauncher {

	protected AdapterFactoryEditingDomain editingDomain;

	@Override
	public void open(IPath filePath) {

		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IStructuredSelection selection = (IStructuredSelection) window
				.getSelectionService().getSelection();
		if (selection.getFirstElement() instanceof IFile) {
			IFile file = (IFile) selection.getFirstElement();

			IProject project = file.getProject();

			try {
				ModelingProjectManager.INSTANCE.removeModelingNature(project,
						new NullProgressMonitor());
				ModelingProjectManager.INSTANCE.convertToModelingProject(
						project, new NullProgressMonitor());
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			IFile airdFile = project.getFile("representations.aird");

			URI representationsFileURI = URI.createPlatformResourceURI(airdFile
					.getFullPath().toOSString(), true);

			URI fFileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toOSString(), true);

			Session session = SessionManager.INSTANCE.getSession(
					representationsFileURI, new NullProgressMonitor());

			// get representation
			DAnalysis root = (DAnalysis) session.getSessionResource()
					.getContents().get(0);
			DView view = root.getOwnedViews().get(0);

			EList<DRepresentation> representations = view
					.getOwnedRepresentations();

			Resource resource = null;

			DRepresentation representation = null;
			for (DRepresentation currentRep : representations) {
				EObject rootObject = ((SequenceDDiagramSpec) currentRep)
						.getTarget();

				Resource eResource = rootObject.eResource();
				URI eUri = eResource.getURI();

				if (eUri.equals(fFileURI)) {
					representation = currentRep;
				}

			}

			DialectUIManager.INSTANCE.openEditor(session, representation,
					new NullProgressMonitor());
		}
	}
}