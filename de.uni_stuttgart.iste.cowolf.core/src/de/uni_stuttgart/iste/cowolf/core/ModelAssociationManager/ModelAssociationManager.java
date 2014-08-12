package de.uni_stuttgart.iste.cowolf.core.ModelAssociationManager;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

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

/**
 * @author Verena Käfer
 *
 */
public class ModelAssociationManager {

	private static final String TARGET = "target";

	private static final String SOURCE = "source";

	private static final String ASSOCIATION = "association";

	private static final String ROOT = "root";

	private static final String PROPERTIES_XML = ".properties/properties.xml";

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
			IProject iProject) {

		AssociationProject associationProject = getAssociationProject(iProject);

		if (associationProject == null) {
			return null;
		}

		return associationProject.getReachableAssociations(source);

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
	public boolean addAssociation(Resource source, Resource target,
			IProject iProject) {

		AssociationProject associationProject = getAssociationProject(iProject);

		if (associationProject == null) {

			associationProject = new AssociationProject(iProject);
			associationProjects.add(associationProject);

		}

		return associationProject.addAssociation(source, target);

	}

	/**
	 * Deletes an association of the two resources
	 * 
	 * @param source
	 * @param target
	 * @return True if a match of these two resources was found and deleted.
	 *         False else
	 */
	public boolean removeAssociation(Resource source, Resource target,
			IProject iProject) {

		AssociationProject associationProject = getAssociationProject(iProject);

		if (associationProject == null) {
			// no association found
			return false;
		}

		return associationProject.removeAssociation(source, target);
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

		Element rootElement = new Element(ROOT); //$NON-NLS-1$
		Document document = new Document(rootElement);

		for (Association association : project.getAssociations()) {

			Element associationElement = new Element(ASSOCIATION); //$NON-NLS-1$

			Attribute sourceAttribute = new Attribute(SOURCE, association //$NON-NLS-1$
					.getSource().getURI().toPlatformString(true));

			Attribute targetAttribute = new Attribute(TARGET, association //$NON-NLS-1$
					.getTarget().getURI().toPlatformString(true));

			associationElement.setAttribute(sourceAttribute);
			associationElement.setAttribute(targetAttribute);

			rootElement.addContent(associationElement);
		}

		File propertyFile = getPropertyFile(project.getIProject(), true);

		XMLOutputter outputter = new XMLOutputter(Format.getPrettyFormat());

		try {
			outputter.output(document, new FileOutputStream(propertyFile));
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Could not load associations. "
					+ e.getLocalizedMessage());
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
			JOptionPane.showMessageDialog(null, "Could not load associations. "
					+ e.getLocalizedMessage());
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

		AssociationProject associationProject = new AssociationProject(iProject);

		File propertyFile = getPropertyFile(iProject, false);

		if (propertyFile != null) {
			try {
				Document document;
				Element rootElement; //$NON-NLS-1$

				SAXBuilder saxBuilder = new SAXBuilder();

				// Create a new JDOM document from a XML file

				document = saxBuilder.build(propertyFile);

				rootElement = document.getRootElement();

				@SuppressWarnings("unchecked")
				List<Element> associationElements = rootElement
						.getChildren(ASSOCIATION); //$NON-NLS-1$

				ResourceSet resourceSet = new ResourceSetImpl();

				for (Element associationElement : associationElements) {
					String sourceUriString = associationElement
							.getAttributeValue(SOURCE); //$NON-NLS-1$
					URI sourceUri = URI.createPlatformResourceURI(
							sourceUriString, true);
					Resource sourceResource = resourceSet.getResource(
							sourceUri, true);

					String targetUriString = associationElement
							.getAttributeValue(TARGET); //$NON-NLS-1$
					URI targetUri = URI.createPlatformResourceURI(
							targetUriString, true);
					Resource targetResource = resourceSet.getResource(
							targetUri, true);

					associationProject.addAssociation(sourceResource,
							targetResource);
				}

			} catch (JDOMException e) {
				return null;
			} catch (IOException e) {
				return null;
			}

			return associationProject;
		}
		return null;
	}

	/**
	 * @param iProject
	 *            the project
	 * @return the file with the properties
	 */
	private File getPropertyFile(IProject iProject, boolean save) {

		IFile propertyIFile = iProject.getFile(PROPERTIES_XML); //$NON-NLS-1$
		File file = null;
		if (propertyIFile.exists()) {
			file = new File(propertyIFile.getLocation().toString());

			return file;
		} else {
			if (save) {
				try {
					file = new File(propertyIFile.getLocation().toString());
					file.createNewFile();
					return file;
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null,
							"Could not load property file");
				}
			}

		}

		return null;

	}

	/**
	 * @param iProject
	 * @return the association project for the IProject
	 */
	private AssociationProject getAssociationProject(IProject iProject) {

		for (AssociationProject associationProject : associationProjects) {
			if (associationProject.getIProject().equals(iProject)) {
				return associationProject;

			}
		}
		return null;
	}
}
