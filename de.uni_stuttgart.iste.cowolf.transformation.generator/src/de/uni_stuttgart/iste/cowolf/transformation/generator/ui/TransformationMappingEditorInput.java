package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

public class TransformationMappingEditorInput implements IEditorInput {

	IPath transformationMappingPath;

	public TransformationMappingEditorInput(IPath transformationMappingPath) {
		this.transformationMappingPath = transformationMappingPath;

		// try {
		// XMLMappingLoader.loadMapping(transformationMappingFile.getFullPath().toFile());
		// } catch (JAXBException e) {
		// e.printStackTrace();
		// }

	}

	@Override
	public Object getAdapter(Class adapter) {
		return null;
	}

	@Override
	public boolean exists() {
		return true;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {

		URL url;
		try {
			url = new URL(
					"platform:/plugin/de.uni_stuttgart.iste.cowolf.ui/icons/logo_wulf_15x15.png");	
			return ImageDescriptor.createFromURL(url);
		} catch (IOException e1) {
			e1.printStackTrace();
			return null;
		}
		

	}
	
	public void getFile() {
		// TODO Auto-generated method stub

	}

//	@Override
//	public String getName() {
//		return new File(transformationMappingFile).getName();
//	}

	@Override
	public IPersistableElement getPersistable() {
		return null;
	}

	@Override
	public String getToolTipText() {
		return "test";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
