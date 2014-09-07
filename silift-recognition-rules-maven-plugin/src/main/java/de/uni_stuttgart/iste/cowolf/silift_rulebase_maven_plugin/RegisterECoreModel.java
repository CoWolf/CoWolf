package de.uni_stuttgart.iste.cowolf.silift_rulebase_maven_plugin;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import javax.naming.event.EventDirContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.eclipse.emf.ecore.EPackage;
import org.sidiff.difference.rulebase.nature.RuleBaseProjectNature;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

@Mojo(name = "register-ecore-model", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class RegisterECoreModel extends AbstractMojo {

	private final String ECLIPSE_PLUGIN_FILE_NAME = "plugin.xml";

	private final String ECORE_GEN_PACKAGE_EXTENSION_POINT = "org.eclipse.emf.ecore.generated_package";

	/**
	 * The project itself. This parameter is set by Maven.
	 */
	@Parameter(property = "project", readonly = true, required = true)
	private MavenProject project;

	/**
	 * 
	 * @param fullClassName
	 * @return
	 * @throws MojoExecutionException
	 */
	private Object loadClass(String fullClassName)
			throws MojoExecutionException {

		String classPath = fullClassName.replace('.', File.separatorChar);

		try {

			URL classDir = new File(project.getBuild().getSourceDirectory()
					+ File.separator + classPath).getParentFile().toURI()
					.toURL();

			ClassLoader classLoader = RegisterECoreModel.class.getClassLoader();
			ClassLoader urlClassLoader = new URLClassLoader(
					new URL[] { classDir }, classLoader);

			Class<?> loadedClass = urlClassLoader.loadClass(fullClassName);
			return loadedClass.newInstance();

		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | MalformedURLException e) {
			throw new MojoExecutionException(e.getLocalizedMessage(), e);
		}

	}

	/**
	 * 
	 * @param modelNamespaceURI
	 * @param modelPackage
	 */
	private void registerECoreModel(String modelNamespaceURI,
			EPackage modelPackage) {

		EPackage.Registry.INSTANCE.put(modelNamespaceURI, modelPackage);

	}

	/**
	 * 
	 */
	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {

		Document pluginDocument = getPluginFileDocument(project.getBasedir());

		if (pluginDocument != null) {

			List<Element> ecoreGenPackageExtensionPackages = getEcoreGenPackageExtensionPackages(pluginDocument);

			for (Element ecoreGenPackageExtensionPackage : ecoreGenPackageExtensionPackages) {

				String packageURI = packageURI(ecoreGenPackageExtensionPackage);
				String packageClass = packageClass(ecoreGenPackageExtensionPackage);

				if (packageURI != null && packageClass != null) {

					getLog().info(
							"Registering Ecore model with namespace \""
									+ packageURI + "\" and package class \""
									+ packageClass + "\"...");

					EPackage modelPackage = (EPackage) loadClass(packageClass);

					registerECoreModel(packageURI, modelPackage);

					getLog().info(
							"Registering Ecore model with namespace \""
									+ packageURI + "\" and package class \""
									+ packageClass + "\" completed.");

				} else {

					getLog().debug(
							"Extension package URI and/or class are not defined in \""
									+ ECLIPSE_PLUGIN_FILE_NAME + "\" file.");

				}

			}

			if (ecoreGenPackageExtensionPackages.isEmpty()) {
				getLog().debug(
						"No extensions with extension point \""
								+ ECORE_GEN_PACKAGE_EXTENSION_POINT
								+ "\" found in \"" + ECLIPSE_PLUGIN_FILE_NAME
								+ "\" file.");
			}

		} else {

			getLog().debug(
					"Plugin file \"" + ECLIPSE_PLUGIN_FILE_NAME
							+ "\" is missing.");

		}
		
		getLog().info(
				"Artifact \"" + project.getArtifactId() + "\" is not a Ecore model.");

	}

	/**
	 * 
	 * @param packageElement
	 * @return
	 */
	private String packageURI(Element packageElement) {

		return packageElement.getAttribute("uri");

	}

	/**
	 * 
	 * @param packageElement
	 * @return
	 */
	private String packageClass(Element packageElement) {

		return packageElement.getAttribute("class");

	}

	/**
	 * 
	 * @param projectRoot
	 * @return
	 * @throws MojoExecutionException
	 */
	private Document getPluginFileDocument(File projectRoot)
			throws MojoExecutionException {

		File pluginFile = new File(projectRoot, ECLIPSE_PLUGIN_FILE_NAME);

		if (pluginFile.isFile()) {

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

			try {

				DocumentBuilder db = dbf.newDocumentBuilder();
				Document doc = db.parse(pluginFile);

				doc.getDocumentElement().normalize();

				return doc;

			} catch (ParserConfigurationException | SAXException | IOException exc) {
				throw new MojoExecutionException(exc.getLocalizedMessage(), exc);
			}

		}

		return null;

	}

	/**
	 * 
	 * @param pluginDocument
	 * @return
	 */
	private List<Element> getEcoreGenPackageExtensionPackages(
			Document pluginDocument) {

		List<Element> extensionPackages = new ArrayList<Element>();

		NodeList extensionList = pluginDocument
				.getElementsByTagName("extension");

		for (int s = 0; s < extensionList.getLength(); s++) {

			Node extensionNode = extensionList.item(s);

			if (extensionNode.getNodeType() == Node.ELEMENT_NODE) {

				Element extensionElement = (Element) extensionNode;
				String extensionPoint = extensionElement.getAttribute("point");
				if (extensionPoint != null
						&& extensionPoint
								.equals(ECORE_GEN_PACKAGE_EXTENSION_POINT)) {

					NodeList packageList = extensionElement
							.getElementsByTagName("package");

					for (int t = 0; s < packageList.getLength(); t++) {

						Node packageNode = extensionList.item(t);

						if (packageNode.getNodeType() == Node.ELEMENT_NODE) {

							Element packageElement = (Element) extensionNode;
							extensionPackages.add(packageElement);

						}

					}

				}

			}

		}

		return extensionPackages;
	}

}
