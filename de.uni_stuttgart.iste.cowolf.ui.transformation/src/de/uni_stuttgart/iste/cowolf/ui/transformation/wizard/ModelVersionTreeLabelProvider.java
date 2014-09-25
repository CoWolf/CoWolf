package de.uni_stuttgart.iste.cowolf.ui.transformation.wizard;

import java.text.DateFormat;
import java.util.Date;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE.SharedImages;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociation;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationFactory;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion;

public class ModelVersionTreeLabelProvider implements ILabelProvider {
	
	private IFile sourceFile;

	public ModelVersionTreeLabelProvider(IFile sourceFile) {
		this.sourceFile = sourceFile;
	}
	
	@Override
	public void addListener(ILabelProviderListener listener) {

	}

	@Override
	public void dispose() {

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {

		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {

	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof IProject) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(SharedImages.IMG_OBJ_PROJECT); 
		}
		if (element instanceof IFolder) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FOLDER); 
		}
		if (element instanceof IFile) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FILE); 
		}
		return null;
	}

	@Override
	public String getText(Object element) {
		if (element instanceof IProject) {
			String text = ((IProject) element).getName();
			return text;
		}
		if (element instanceof IFolder) {
			String text = ((IFolder) element).getName();
			return text;
		}
		if (element instanceof IFile) {
			IFile iFile = (IFile) element;
			ModelAssociation ma = ModelAssociationFactory.eINSTANCE.getModelAssociation(iFile.getProject());
			Model model = ma.getModelByPath(iFile.getProjectRelativePath().toString());
			if (model == null) {
				return iFile.getName();
			}
			Association assoc = model.getLatestAssociationFrom(ma.getModelByPath(this.getSourceFile().getProjectRelativePath().toString()));
			if (assoc == null) {
				return iFile.getName();
			}
			
			EList<ModelVersion> versions = model.getVersions();
			
			Date date = new Date(versions.get(versions.size()-1).getTimestamp());
			DateFormat df = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
			return iFile.getName() + " (" + df.format(date) + ")";
		}

		return null;
	}
	
	public IFile getSourceFile() {
		return sourceFile;
	}

	public void setSourceFile(IFile sourceFile) {
		this.sourceFile = sourceFile;
	}
}