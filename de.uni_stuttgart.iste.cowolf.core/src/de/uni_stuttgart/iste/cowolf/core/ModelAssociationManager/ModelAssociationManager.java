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

		for (AssociationProject associationProject : associationProjects) {
			save(associationProject);
		}

		return true;
	}

	private boolean save(AssociationProject project) {

		Element rootElement = new Element("root");
		Document doc = new Document(rootElement);

		for (Association association : project.getAssociations()) {
			Element associationElement = new Element("association");

			Attribute sourceAttribute = new Attribute("source", association
					.getSource().getURI().toString());
			Attribute targetAttribute = new Attribute("target", association
					.getTarget().getURI().toString());

			associationElement.setAttribute(sourceAttribute);
			associationElement.setAttribute(targetAttribute);

			rootElement.addContent(associationElement);
		}

		File propertyFile = getPropertyFile(project.getAssociationProject());
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
					AssociationProject associationProject = load(iProject);
					associationProjects.add(associationProject);
				}

			}

		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public AssociationProject load(IProject iProject) {

		AssociationProject project = new AssociationProject(iProject);

		try {
			Document document = new Document();
			Element root = new Element("root");

			SAXBuilder saxBuilder = new SAXBuilder();

			// Create a new JDOM document from a XML file
			File propertyFile = getPropertyFile(iProject);
			document = saxBuilder.build(propertyFile);

			root = document.getRootElement();

			List<Element> associationElements = root.getChildren("association");

			ResourceSet resourceSet = new ResourceSetImpl();

			for (Element associationElement : associationElements) {
				String sourceUriString = associationElement
						.getAttributeValue("source");
				URI sourceUri = URI.createFileURI(sourceUriString);
				Resource sourceResource = resourceSet.getResource(sourceUri,
						true);

				String targetUriString = associationElement
						.getAttributeValue("target");
				URI targetUri = URI.createFileURI(targetUriString);
				Resource targetResource = resourceSet.getResource(targetUri,
						true);

				project.add(sourceResource, targetResource);
			}
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return project;
	}

	private File getPropertyFile(IProject p) {
		IFile propertyIFile = p.getFile(p.getFullPath().toString()
				+ "/.properties/properties.xml");

		return new File(propertyIFile.getFullPath().toString());

	}

	private AssociationProject getAssociationProject(IProject iProject) {
		for (AssociationProject ap : associationProjects) {
			if (ap.getAssociationProject().equals(iProject)) {
				return ap;
			}
		}
		return null;
	}
}
