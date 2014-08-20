package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

public class TransformationMappingEditorInput implements IEditorInput {

	private IFile transformationMappingFile;

	public TransformationMappingEditorInput(IFile transformationMappingFile) {
		this.transformationMappingFile = transformationMappingFile;
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
		}

		return null;

	}

	public IFile getFile() {
		return transformationMappingFile;
	}

	@Override
	public IPersistableElement getPersistable() {
		return null;
	}

	@Override
	public String getToolTipText() {
		return this.getFormattedFilePath();
	}

	@Override
	public String getName() {
		return this.transformationMappingFile.getName();
	}

	public String getFormattedFilePath() {
		return transformationMappingFile.getProject().getName() + "/"
				+ transformationMappingFile.getProjectRelativePath().toString();
	}

	@Override
	public Object getAdapter(Class adapter) {
		// TODO Auto-generated method stub
		return null;
	}

}
