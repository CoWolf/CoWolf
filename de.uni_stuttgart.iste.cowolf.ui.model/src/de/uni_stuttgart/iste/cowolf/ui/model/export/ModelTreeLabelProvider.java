/**
 * 
 */
package de.uni_stuttgart.iste.cowolf.ui.model.export;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

public class ModelTreeLabelProvider extends FileTreeLabelProvider {
	
	@Override
	public Image getImage(Object element) {
		
		if (element instanceof IFile) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(this.getImageName((IFile) element));
		}
		return super.getImage(element);
	}
	
	private String getImageName(IFile iFile) {
		try {
			URI uri = URI.createPlatformResourceURI(iFile.getFullPath().toString(), true);
			ResourceSet resSet = new ResourceSetImpl();
			Resource res = resSet.getResource(uri, true);
			if (res != null && res.getContents() != null && res.getContents().get(0) != null) {
				Diagnostic diag = Diagnostician.INSTANCE.validate(res.getContents().get(0));
				if (diag.getChildren().size() > 0) {
					return ISharedImages.IMG_OBJS_ERROR_TSK;
				}
			} else {
				return ISharedImages.IMG_OBJS_ERROR_TSK;
			}
		} catch(RuntimeException e) {
			return ISharedImages.IMG_OBJS_ERROR_TSK;
		}
		return ISharedImages.IMG_OBJ_FILE;
	}
}
