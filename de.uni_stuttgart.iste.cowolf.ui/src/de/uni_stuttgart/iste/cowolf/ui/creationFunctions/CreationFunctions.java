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

import de.uni_stuttgart.iste.cowolf.core.natures.ProjectNature;
import de.uni_stuttgart.iste.cowolf.ui.externalizedStrings.Messages;

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

		IProject iProject = createBasicProject(projectName, location);
		addNature(iProject);

		// our basic folder structure
		// models
		IFolder modelFolder = createFolder(
				Messages.CreationFunctions_folder_title_models, iProject);
		// properties
		createFolder(".properties", iProject);

		// state charts
		createFolder(Messages.CreationFunctions_folder_title_State_charts,
				modelFolder);

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
		IProject newIProject = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(projectName);

		// if project exists not, then create one
		if (!newIProject.exists()) {
			URI projectLocation = location;
			// Set description
			IProjectDescription description = newIProject.getWorkspace()
					.newProjectDescription(newIProject.getName());
			if (location != null
					&& ResourcesPlugin.getWorkspace().getRoot()
							.getLocationURI().equals(location)) {
				projectLocation = null;
			}

			description.setLocationURI(projectLocation);
			try {
				newIProject.create(description, null);
				if (!newIProject.isOpen()) {
					newIProject.open(null);
				}
			} catch (CoreException e) {
				// TODO
				e.printStackTrace();
			}
		}

		return newIProject;
	}

	/**
	 * @param name
	 *            the name of the folder
	 * @param parentContainer
	 *            the parent container
	 * @return the created folder
	 */
	public static IFolder createFolder(String name, IContainer parentContainer) {
		Path path = new Path(name);

		IFolder iFolder = parentContainer.getFolder(path);
		if (!iFolder.exists()) {

			try {
				iFolder.create(false, true, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return iFolder;
	}

	/**
	 * @param iProject
	 *            the project the nature will be added to
	 */
	private static void addNature(IProject iProject) {
		try {
			if (!iProject.hasNature(ProjectNature.NATURE_ID)) {
				IProjectDescription description = iProject.getDescription();
				String[] previousNatures = description.getNatureIds();
				String[] newNatures = new String[previousNatures.length + 1];
				System.arraycopy(previousNatures, 0, newNatures, 0,
						previousNatures.length);
				newNatures[previousNatures.length] = ProjectNature.NATURE_ID;
				description.setNatureIds(newNatures);

				IProgressMonitor monitor = null;
				iProject.setDescription(description, monitor);
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
