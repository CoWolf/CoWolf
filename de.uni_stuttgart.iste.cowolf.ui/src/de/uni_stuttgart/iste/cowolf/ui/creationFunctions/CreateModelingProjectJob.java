package de.uni_stuttgart.iste.cowolf.ui.creationFunctions;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.dialect.command.CreateRepresentationCommand;
import org.eclipse.sirius.business.api.helper.SiriusResourceHelper;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.command.semantic.AddSemanticResourceCommand;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelection;
import org.eclipse.sirius.ui.business.internal.commands.ChangeViewpointSelectionCommand;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

import de.uni_stuttgart.iste.cowolf.core.natures.ProjectNature;
import de.uni_stuttgart.iste.cowolf.model.ModelRegistry;
import de.uni_stuttgart.iste.cowolf.ui.externalizedStrings.Messages;
import de.uni_stuttgart.iste.cowolf.ui.model.preference.ModelPreferencePage;

/**
 * This class holds the functions to create a new sirius modeling project with
 * representation file and viewpoint
 * 
 * @author Johannes Wolf, Verena Käfer
 *
 */
public class CreateModelingProjectJob extends Job {

	private String projectName;
	private URI location;

	public CreateModelingProjectJob(String projectName, URI location) {
		super("Create Modeling Project");
		this.projectName = projectName;
		this.location = location;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {

		try {
			createModelingProject(projectName, location, monitor);
		} catch (CoreException e) {
			return new Status(IStatus.ERROR, "de.uni_stuttgart.iste.cowolf.ui",
					e.getLocalizedMessage());
		}

		return new Status(IStatus.OK, "de.uni_stuttgart.iste.cowolf.ui", "OK");
	}

	/**
	 * This function creates a sirius modeling project with the matching nature
	 * 
	 * @param projectName
	 *            the name
	 * @param location
	 *            the location
	 * @param monitor
	 *            the progress monitor
	 * @return
	 */
	/**
	 * @param projectName
	 * @param location
	 * @param monitor
	 * @return
	 * @throws CoreException
	 */
	public static boolean createModelingProject(String projectName,
			URI location, IProgressMonitor monitor) throws CoreException {
		IProject iProject = ModelingProjectManager.INSTANCE
				.createNewModelingProject(projectName, true, monitor);
		addNature(iProject);

		// our basic folder structure

		// models
		IFolder modelFolder = createFolder(
				Messages.CreationFunctions_folder_title_models, iProject);
		// properties
		createFolder(".properties", iProject);

		if (ModelPreferencePage.getFolderPreference()) {

			// one folder for every registered model
			for (String folderName : ModelRegistry.getInstance()
					.getAllModelNames()) {
				createFolder(folderName, modelFolder);
			}
		}

		return true;
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
				JOptionPane.showMessageDialog(null, "Could not create folder"
						+ e.getLocalizedMessage());
			}
		}
		return iFolder;
	}

	/**
	 * @param iProject
	 *            the project the nature will be added to
	 * @throws CoreException
	 */
	private static void addNature(IProject iProject) throws CoreException {
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

}