package de.uni_stuttgart.iste.cowolf.ui.creationFunctions;

import java.net.URI;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;

import de.uni_stuttgart.iste.cowolf.ui.externalizedStrings.Messages;
import de.uni_stuttgart.iste.cowolf.ui.natures.ProjectNature;

/**
 * This class holds the functions to create a new project and a folder
 *
 */
public class CreationFunctions {

	/**
	 * @param projectName
	 *            the name of the new project
	 * @param location
	 *            the location of the project, can be gotten from the wizard
	 * @throws CoreException
	 */
	public static void createProject(String projectName, URI location) {

		IProject project = createBasicProject(projectName, location);
		addNature(project);

		// our basic folder structure
		IFolder newFolder = createFolder(Messages.CreationFunctions_folder_title_models, project);
		
		createFolder(Messages.CreationFunctions_folder_title_State_charts, newFolder);

	}

	/**
	 * This function creates a basic project with the matching nature
	 * 
	 * @param projectName
	 *            the name
	 * @param location
	 *            the location
	 * @return
	 */
	private static IProject createBasicProject(String projectName, URI location) {
		IProject newProject = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(projectName);

		// if project exists not, then create one
		if (!newProject.exists()) {
			URI projectLocation = location;
			// Set description
			IProjectDescription desc = newProject.getWorkspace()
					.newProjectDescription(newProject.getName());
			if (location != null
					&& ResourcesPlugin.getWorkspace().getRoot()
							.getLocationURI().equals(location)) {
				projectLocation = null;
			}

			desc.setLocationURI(projectLocation);
			try {
				newProject.create(desc, null);
				if (!newProject.isOpen()) {
					newProject.open(null);
				}
			} catch (CoreException e) {
				// TODO
				e.printStackTrace();
			}
		}

		return newProject;
	}

	/**
	 * @param name
	 *            the name of the folder
	 * @param parent
	 *            the parent container
	 * @return the created folder
	 */
	public static IFolder createFolder(String name, IContainer parent) {
		Path myPath = new Path(name);
		
		IFolder folder = parent.getFolder(myPath);
		if (!folder.exists()) {
			try {
				folder.create(false, true, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return folder;
	}

	/**
	 * @param project
	 *            the project the nature will be added to
	 */
	private static void addNature(IProject project) {
		try {
			if (!project.hasNature(ProjectNature.NATURE_ID)) {
				IProjectDescription description = project.getDescription();
				String[] prevNatures = description.getNatureIds();
				String[] newNatures = new String[prevNatures.length + 1];
				System.arraycopy(prevNatures, 0, newNatures, 0,
						prevNatures.length);
				newNatures[prevNatures.length] = ProjectNature.NATURE_ID;
				description.setNatureIds(newNatures);

				IProgressMonitor monitor = null;
				project.setDescription(description, monitor);
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}