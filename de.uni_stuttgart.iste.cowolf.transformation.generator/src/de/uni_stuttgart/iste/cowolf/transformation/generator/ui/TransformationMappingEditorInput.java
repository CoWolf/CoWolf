package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Rene Trefft
 */
public class TransformationMappingEditorInput implements IFileEditorInput {
	
	private final static Logger LOGGER = LoggerFactory
			.getLogger(TransformationMappingEditorInput.class);
	
	IFile transformationMappingFile;

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
			LOGGER.error("", e1);
		}

		return null;

	}

	@Override
	public IFile getFile() {
		return this.transformationMappingFile;
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
		return this.getFile().getName();
	}

	public String getFormattedFilePath() {
		return this.getFile().getProject().getName() + "/"
				+ this.getFile().getProjectRelativePath().toString();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class adapter) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result)
				+ ((this.transformationMappingFile == null) ? 0
						: this.transformationMappingFile.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		TransformationMappingEditorInput other = (TransformationMappingEditorInput) obj;
		if (this.transformationMappingFile == null) {
			if (other.transformationMappingFile != null) {
				return false;
			}
		} else if (!this.transformationMappingFile
				.equals(other.transformationMappingFile)) {
			return false;
		}
		return true;
	}

	@Override
	public IStorage getStorage() throws CoreException {
		return null;
	}

}
