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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import de.uni_stuttgart.iste.cowolf.core.natures.ProjectNature;

public class ModelAssociationManager {

	private static ModelAssociationManager instance;

	ArrayList<AssociationProject> associationProjects = new ArrayList<AssociationProject>();

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
		
		if(associationProject == null){
			associationProject = new AssociationProject(iProject);
			associationProjects.add(associationProject);
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

	/**
	 * Saves all associations
	 */
	public void saveAll() {

		for (AssociationProject associationProject : associationProjects) {
			save(associationProject);

		}

	}

	/**
	 * @param project
	 *            the project whose associations will be saved
	 * @return
	 */
	private void save(AssociationProject project) {

		Element rootElement = new Element("root"); //$NON-NLS-1$
		Document doc = new Document(rootElement);

		for (Association association : project.getAssociations()) {
			Element associationElement = new Element("association"); //$NON-NLS-1$

			Attribute sourceAttribute = new Attribute("source", association //$NON-NLS-1$
					.getSource().getURI().toPlatformString(true));

			Attribute targetAttribute = new Attribute("target", association //$NON-NLS-1$
					.getTarget().getURI().toPlatformString(true));

			associationElement.setAttribute(sourceAttribute);
			associationElement.setAttribute(targetAttribute);

			rootElement.addContent(associationElement);
		}

		File propertyFile = getPropertyFile(project.getAssociationProject());

		XMLOutputter out = new XMLOutputter(Format.getPrettyFormat());
		try {
			out.output(doc, new FileOutputStream(propertyFile));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Loads all associations
	 */
	public void loadAll() {
		try {
			IProject[] projects = ResourcesPlugin.getWorkspace().getRoot()
					.getProjects();

			for (IProject iProject : projects) {

				// only our projects
				if (iProject.isOpen()
						&& iProject.getDescription().hasNature(
								ProjectNature.NATURE_ID)) {
					AssociationProject associationProject = load(iProject);
					if (associationProject != null) {
						associationProjects.add(associationProject);
					}
				}

			}

		} catch (CoreException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Loads the associations for one project
	 * 
	 * @param iProject
	 *            the project to load
	 * @return an association project with the associations
	 */
	private AssociationProject load(IProject iProject) {

		AssociationProject project = new AssociationProject(iProject);

		try {
			Document document = new Document();
			Element root = new Element("root"); //$NON-NLS-1$

			SAXBuilder saxBuilder = new SAXBuilder();

			// Create a new JDOM document from a XML file
			File propertyFile = getPropertyFile(iProject);
			document = saxBuilder.build(propertyFile);

			root = document.getRootElement();

			@SuppressWarnings("unchecked")
			List<Element> associationElements = root.getChildren("association"); //$NON-NLS-1$

			ResourceSet resourceSet = new ResourceSetImpl();

			for (Element associationElement : associationElements) {
				String sourceUriString = associationElement
						.getAttributeValue("source"); //$NON-NLS-1$
				URI sourceUri = URI.createFileURI(iProject.getWorkspace()
						.getRoot().getLocation()
						+ sourceUriString);
				Resource sourceResource = resourceSet.getResource(sourceUri,
						true);

				String targetUriString = associationElement
						.getAttributeValue("target"); //$NON-NLS-1$
				URI targetUri = URI.createFileURI(iProject.getWorkspace()
						.getRoot().getLocation()
						+ targetUriString);
				Resource targetResource = resourceSet.getResource(targetUri,
						true);

				project.add(sourceResource, targetResource);
			}
		} catch (JDOMException e) {
			return null;
		} catch (IOException e) {
			return null;
		}

		return project;
	}

	/**
	 * @param iProject
	 *            the project
	 * @return the file with the properties
	 */
	private File getPropertyFile(IProject iProject) {

		IFile propertyIFile = iProject.getFile(".properties/properties.xml"); //$NON-NLS-1$

		File file = new File(propertyIFile.getLocation().toString());

		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return file;

	}

	/**
	 * @param iProject
	 * @return the association project for the IProject
	 */
	private AssociationProject getAssociationProject(IProject iProject) {
		for (AssociationProject ap : associationProjects) {
			if (ap.getAssociationProject().equals(iProject)) {
				return ap;
			}
		}
		return null;
	}
}
