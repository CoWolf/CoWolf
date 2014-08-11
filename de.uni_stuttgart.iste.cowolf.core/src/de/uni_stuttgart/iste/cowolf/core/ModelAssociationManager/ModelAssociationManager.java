package de.uni_stuttgart.iste.cowolf.core.ModelAssociationManager;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import de.uni_stuttgart.iste.cowolf.ui.natures.ProjectNature;

public class ModelAssociationManager {

	private static ModelAssociationManager instance;

	ArrayList<AssociationProject> projects = new ArrayList<AssociationProject>();

	/**
	 * for singleton
	 */
	private ModelAssociationManager() {
	}

	public static ModelAssociationManager getInstance() {
		if (instance == null) {
			instance = new ModelAssociationManager();
		}
		return instance;
	}

	/**
	 * @param source
	 * @return all with several steps reachable associations, null if project
	 *         does not exist
	 */
	public List<Resource> getReachableAssociations(Resource source,
			IProject project) {

		AssociationProject p = getAssociationProject(project);

		if (p == null) {
			return null;
		}

		return p.getReachableAssociations(source);
	}

	/**
	 * @param source
	 * @return the existing targets for the given source, null if project does
	 *         not exist
	 */
	public List<Resource> getDirectModelAssociations(Resource source,
			IProject iProject) {

		AssociationProject associationProject = getAssociationProject(iProject);

		if (associationProject == null) {
			return null;
		}

		return associationProject.getDirectModelAssociations(source);
	}

	/**
	 * Creates an association between these two resources
	 * 
	 * @param source
	 * @param target
	 * @return false if association already exists
	 */
	public boolean add(Resource source, Resource target, IProject iProject) {

		AssociationProject associationProject = getAssociationProject(iProject);

		if (associationProject == null) {
			// project does not exist yet
			associationProject = new AssociationProject(iProject);
		}

		return associationProject.add(source, target);

	}

	/**
	 * Deletes an association of the two resources
	 * 
	 * @param source
	 * @param target
	 * @return True if a match of these two resources was found and deleted.
	 *         False else
	 */
	public boolean remove(Resource source, Resource target, IProject iProject) {

		AssociationProject associationProject = getAssociationProject(iProject);

		if (associationProject == null) {
			// no association found
			return false;
		}

		return associationProject.remove(source, target);
	}

	public boolean saveAll() {

		for (AssociationProject associationProject : projects) {
			IProject iProject = associationProject.getProject();
			save(iProject);
		}

		return true;
	}

	private boolean save(IProject iProject) {

		Element rootElement = new Element("root");
		Document doc = new Document(rootElement);

		File propertyFile = getPropertyFile(iProject);
		XMLOutputter out = new XMLOutputter(Format.getPrettyFormat());
		try {
			out.output(doc, new FileOutputStream(propertyFile));
		} catch (IOException e) {
			return false;
		}
		System.out.print("save");
		return true;
	}

	public void loadAll() {
		try {
			IProject[] projects = ResourcesPlugin.getWorkspace().getRoot()
					.getProjects();

			for (IProject iProject : projects) {

				// only our projects
				if (iProject.isOpen()
						&& iProject.getDescription().hasNature(
								ProjectNature.NATURE_ID)) {
					load(iProject);
				}

			}

		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void load(IProject iProject) {
		File propertyFile = getPropertyFile(iProject);

		
			System.out.print("load");
				// TODO
	}

	private File getPropertyFile(IProject p) {
		IFile propertyIFile = p.getFile(p.getFullPath().toString()
				+ "/.properties/properties.xml");

		return new File(propertyIFile.getFullPath().toString());

	}

	private AssociationProject getAssociationProject(IProject iProject) {
		for (AssociationProject ap : projects) {
			if (ap.getProject().equals(iProject)) {
				return ap;
			}
		}
		return null;
	}
}
