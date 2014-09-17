package de.uni_stuttgart.iste.cowolf.ui.navigator.editors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.sirius.diagram.ui.tools.api.editor.AbstractSpecificDDiagramEditor;
import org.eclipse.sirius.ui.business.api.editor.SpecificEditorInputTranformer;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.PartInitException;

public class GraphicalSequenceEditor extends AbstractSpecificDDiagramEditor {

	 private Transformer util = new Transformer();
	
	public String getDiagramDescriptionName() {
		return "Sequence Diagram";
	}

	public URI getViewpointURI() {
		return URI
				.createURI("viewpoint:/de.uni_stuttgart.iste.cowolf.model.sequence_diagram.sirius.editor/Sequence%20diagram");
	}

	public boolean isSessionStoredInWorkspace() {
		return true;
	}
	
	 @Override
	    public void init(final IEditorSite site, final IEditorInput input) throws PartInitException {
	        util.init(getViewpointURI(), getDiagramDescriptionName());
	        super.init(site, util.transformInput(input, getSelection(site), isSessionStoredInWorkspace()));
	    }
	 
	 private ISelection getSelection(IWorkbenchPartSite site) {
	        return site.getWorkbenchWindow().getSelectionService().getSelection();
	    }
}