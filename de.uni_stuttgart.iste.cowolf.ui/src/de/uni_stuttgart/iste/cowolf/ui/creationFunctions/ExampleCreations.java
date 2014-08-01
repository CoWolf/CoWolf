package de.uni_stuttgart.iste.cowolf.ui.creationFunctions;

import java.net.URI;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import de.uni_stuttgart.iste.cowolf.ui.natures.ProjectNature;

public class ExampleCreations {

	// TODO only test methods to see how projects are created

	/**
	 * @param projectName
	 * @param location
	 * @param natureId
	 * @return
	 * @throws CoreException
	 */
	public static IProject createProject(String projectName, URI location)
			throws CoreException {

		IProject project = createBaseProject(projectName, location);
		try {
			addNature(project);

		} catch (CoreException e) {
			e.printStackTrace();
			project = null;
		}

		IFolder folder = project.getFolder("test");

		createFolder(folder);
		IFolder secondFolder = folder.getFolder("test2");
		createFolder(secondFolder);

		return project;
	}

	/**
	 * Just do the basics: create a basic project.
	 *
	 * @param location
	 * @param projectName
	 */
	private static IProject createBaseProject(String projectName, URI location) {
		// returns a "path" = IProject to a project, project must not exist yet
		IProject newProject = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(projectName);

		// if project exists not, then create one
		if (!newProject.exists()) {
			URI projectLocation = location;
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
				e.printStackTrace();
			}
		}

		return newProject;
	}

	/**
	 * @param folder
	 * @throws CoreException
	 */
	private static void createFolder(IFolder folder) throws CoreException {
		// same as with project: IFolders may not exist
		IContainer parent = folder.getParent();
		if (parent instanceof IFolder) {
			createFolder((IFolder) parent);
		}
		if (!folder.exists()) {
			folder.create(false, true, null);
		}

	}

	private static void addNature(IProject project) throws CoreException {
		if (!project.hasNature(ProjectNature.NATURE_ID)) {
			IProjectDescription description = project.getDescription();
			String[] prevNatures = description.getNatureIds();
			String[] newNatures = new String[prevNatures.length + 1];
			System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
			newNatures[prevNatures.length] = ProjectNature.NATURE_ID;
			description.setNatureIds(newNatures);

			IProgressMonitor monitor = null;
			project.setDescription(description, monitor);
		}
	}
}