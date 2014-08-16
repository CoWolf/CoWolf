package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;

import de.uni_stuttgart.iste.cowolf.transformation.model.util.XMLMappingLoader;

public class TransformationMappingEditor extends EditorPart {

	public static final String ID = "de.uni_stuttgart.iste.cowolf.transformation.generator.ui.TransformationMappingEditor";
	
	private TransformationMappingEditorInput input;
	
	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		
			    if (!(input instanceof TransformationMappingEditorInput)) {
			      throw new RuntimeException("Wrong input");
			    }

			    TransformationMappingEditorInput transformationMappingEditorInput = (TransformationMappingEditorInput) input;
			   
			    setSite(site);
			    setInput(input);
			    
			  //  XMLMappingLoader.loadMapping(file)
			    
			    
		
		

	}

	@Override
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return false;
	}
	

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}
	
	

}
