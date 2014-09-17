package de.uni_stuttgart.iste.cowolf.ui.navigator.editors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.MultiPageEditorPart;

public class GraphicalSequenceEditor extends MultiPageEditorPart {


	@Override
	protected void createPages() {
		// TODO Auto-generated method stub
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IStructuredSelection selection = (IStructuredSelection) window
				.getSelectionService().getSelection();

		// get the .aird file and the corresponding Sirius Session
		IFile selectedFile = (IFile) selection.getFirstElement();

		// create viewpoint
					IFile airdFile = selectedFile.getProject().getFile(
							"representations.aird");
					URI myRepresentationsFileURI = URI.createPlatformResourceURI(airdFile
							.getFullPath().toOSString(), true);

		Session siriusSession = SessionManager.INSTANCE.getSession(
				myRepresentationsFileURI, new NullProgressMonitor());

		// get the DRepresentation to open
		DAnalysis root = (DAnalysis) siriusSession.getSessionResource()
				.getContents().get(0);
		DView dView = root.getOwnedViews().get(0);
		DRepresentation myRepresentation = dView.getOwnedRepresentations().get(
				0);

		// open representation werden wohl die
		DialectUIManager.INSTANCE.openEditor(siriusSession, myRepresentation,
				new NullProgressMonitor());

	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

}
