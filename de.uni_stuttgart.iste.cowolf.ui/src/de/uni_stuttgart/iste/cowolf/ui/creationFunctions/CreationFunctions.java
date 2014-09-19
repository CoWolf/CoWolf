package de.uni_stuttgart.iste.cowolf.ui.creationFunctions;

import java.net.URI;
import org.eclipse.core.runtime.CoreException;

/**
 * This class holds the functions to create a new project and a folder
 * 
 * @author Verena Käfer
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

		CreateModelingProjectJob createProjectJob = new CreateModelingProjectJob(projectName, location);
		createProjectJob.schedule();

		

	}
}
