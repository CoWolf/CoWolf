package de.uni_stuttgart.iste.cowolf.core.utilities;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class EMFWolfUtil {

	/**
	* Returns file path for resource or empty string if not found
	* @param Resource
	* @return String file path
	*/
	public static String getFilePath(Resource resource) {
		if (resource == null) {
			return "";
		}
		IFile file = getWorkspaceFile(resource.getURI());
		String filePath = null;
		if (file == null) {
			URI uri = resource.getURI();
			filePath = uri != null ? uri.toFileString() : ""; // $NON-NLS-1$
		} else {
			filePath = file.getFullPath().toString();
		}
		if (filePath == null) {
			return "";
		}
		return filePath;
	}
	
	public static IFile getWorkspaceFile(URI uri) {
		if (uri == null)
			return null;
		String filePath = getWorkspaceFilePath(uri.trimFragment());
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		if (filePath == null) {
			String localPath = uri.toFileString();
			if (localPath == null) {
				// Try to extract a workspace path
				IPath path = new Path(uri.path());
				IResource res = workspaceRoot.findMember(path);
				if (res != null && res.getType() == IResource.FILE) {
					return (IFile) res;
				}
				return null;
			} else {
				IPath location = Path.fromOSString(localPath);
				IFile[] files = workspaceRoot.findFilesForLocation(location);
				if (files == null || files.length == 0)
					return null;
				return files[0];
			}
		} else {
			IResource workspaceResource = workspaceRoot.findMember(filePath);
			if ((workspaceResource == null)
					|| (workspaceResource.getType() != IResource.FILE)) {
				return null;
			}
			return (IFile) workspaceResource;
		}
	}
	
	
	/**
	* <p>Resolves the workspace file path from a platform
	* resource {@link URI}.</p>
	*
	* <p>This method returns <code>null</code> if the {@link URI} is
	* <code>null</code> or does not represent a platform resource.</p>
	*
	* @param uri A platform resource {@link URI}.
	* @return The decoded workspace file path, otherwise <code>null</code>.
	*/
	public static String getWorkspaceFilePath(URI uri) {
		if (uri != null) {
			String resourceURI = uri.toString();
			if (resourceURI.startsWith("platform:/resource")) { //$NON-NLS-1$
				return (resourceURI.substring(18));
			}
		}
		return null;
	}
	
}
