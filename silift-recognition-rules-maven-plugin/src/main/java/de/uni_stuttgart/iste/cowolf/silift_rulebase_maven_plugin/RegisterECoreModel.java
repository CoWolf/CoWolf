package de.uni_stuttgart.iste.cowolf.silift_rulebase_maven_plugin;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
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
	 * @param dir
	 * @param henshinFiles
	 */
	private void listEcoreFilesRecursively(File dir, List<File> ecoreFiles) {

		File[] files = dir.listFiles();

		for (File file : files) {

			if (file.isDirectory())
				listEcoreFilesRecursively(file, ecoreFiles);
			else if (file.getName().toLowerCase().endsWith(".ecore")) {
				ecoreFiles.add(file);
			}
		}

	}

	/**
	 * 
	 */
	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		System.out.println("++++" + project.getBasedir() + File.separator
				+ "model");

		File ecoreModelDir = new File(project.getBasedir() + File.separator
				+ "model");

		if (!ecoreModelDir.isDirectory()) {

			getLog().info(
					"Artifact \"" + project.getArtifactId()
							+ "\" is not a Ecore model.");
			return;

		}

		List<File> ecoreFiles = new ArrayList<File>();

		listEcoreFilesRecursively(ecoreModelDir, ecoreFiles);

		if (ecoreFiles.isEmpty()) {

			getLog().info(
					"Artifact \"" + project.getArtifactId()
							+ "\" is not a Ecore model.");
			return;
		}

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"ecore", new EcoreResourceFactoryImpl());

		ResourceSet rs = new ResourceSetImpl();
		// enable extended metadata
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(
				rs.getPackageRegistry());
		rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA,
				extendedMetaData);

		for (File ecoreFile : ecoreFiles) {

			Resource r = rs.getResource(
					URI.createFileURI(ecoreFile.toString()), true);
			EObject eObject = r.getContents().get(0);
			if (eObject instanceof EPackage) {

				EPackage p = (EPackage) eObject;
				getLog().info(
						"Registering Ecore model with namespace \""
								+ p.getNsURI() + "\" and package class \""
								+ p.getClass().getCanonicalName() + "\"...");
				EPackage.Registry.INSTANCE.put(p.getNsURI(), p);

				getLog().info(
						"Registering Ecore model with namespace \""
								+ p.getNsURI() + "\" and package class \""
								+ p.getClass().getCanonicalName()
								+ "\" completed.");
			}

		}

		// Document pluginDocument =
		// getPluginFileDocument(project.getBasedir());
		//
		// if (pluginDocument != null) {
		//
		// List<Element> ecoreGenPackageExtensionPackages =
		// getEcoreGenPackageExtensionPackages(pluginDocument);
		//
		// for (Element ecoreGenPackageExtensionPackage :
		// ecoreGenPackageExtensionPackages) {
		//
		// String packageURI = packageURI(ecoreGenPackageExtensionPackage);
		// String packageClass = packageClass(ecoreGenPackageExtensionPackage);
		//
		// if (packageURI != null && packageClass != null) {
		//
		// getLog().info(
		// "Registering Ecore model with namespace \""
		// + packageURI + "\" and package class \""
		// + packageClass + "\"...");
		//
		// EPackage modelPackage = (EPackage) loadClass(packageClass);
		//
		// registerECoreModel(packageURI, modelPackage);
		//
		// getLog().info(
		// "Registering Ecore model with namespace \""
		// + packageURI + "\" and package class \""
		// + packageClass + "\" completed.");
		//
		// } else {
		//
		// getLog().debug(
		// "Extension package URI and/or class are not defined in \""
		// + ECLIPSE_PLUGIN_FILE_NAME + "\" file.");
		//
		// }
		//
		// }
		//
		// if (ecoreGenPackageExtensionPackages.isEmpty()) {
		// getLog().debug(
		// "No extensions with extension point \""
		// + ECORE_GEN_PACKAGE_EXTENSION_POINT
		// + "\" found in \"" + ECLIPSE_PLUGIN_FILE_NAME
		// + "\" file.");
		// }
		//
		// } else {
		//
		// getLog().debug(
		// "Plugin file \"" + ECLIPSE_PLUGIN_FILE_NAME
		// + "\" is missing.");
		//
		// }
		//
		// getLog().info(
		// "Artifact \"" + project.getArtifactId()
		// + "\" is not a Ecore model.");

	}

	// /**
	// * @param packageElement
	// * @return
	// */
	// private String packageURI(Element packageElement) {
	//
	// return packageElement.getAttribute("uri");
	//
	// }

	// /**
	// * @param packageElement
	// * @return
	// */
	// private String packageClass(Element packageElement) {
	//
	// return packageElement.getAttribute("class");
	//
	// }

	// /**
	// * @param projectRoot
	// * @return
	// * @throws MojoExecutionException
	// */
	// private Document getPluginFileDocument(File projectRoot)
	// throws MojoExecutionException {
	//
	// File pluginFile = new File(projectRoot, ECLIPSE_PLUGIN_FILE_NAME);
	//
	// if (pluginFile.isFile()) {
	//
	// DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	//
	// try {
	//
	// DocumentBuilder db = dbf.newDocumentBuilder();
	// Document doc = db.parse(pluginFile);
	//
	// doc.getDocumentElement().normalize();
	//
	// return doc;
	//
	// } catch (ParserConfigurationException | SAXException | IOException exc) {
	// throw new MojoExecutionException(exc.getLocalizedMessage(), exc);
	// }
	//
	// }
	//
	// return null;
	//
	// }

	// /**
	// * @param pluginDocument
	// * @return
	// */
	// private List<Element> getEcoreGenPackageExtensionPackages(
	// Document pluginDocument) {
	//
	// List<Element> extensionPackages = new ArrayList<Element>();
	//
	// NodeList extensionList = pluginDocument
	// .getElementsByTagName("extension");
	//
	// for (int s = 0; s < extensionList.getLength(); s++) {
	//
	// Node extensionNode = extensionList.item(s);
	//
	// if (extensionNode.getNodeType() == Node.ELEMENT_NODE) {
	//
	// Element extensionElement = (Element) extensionNode;
	// String extensionPoint = extensionElement.getAttribute("point");
	// if (extensionPoint != null
	// && extensionPoint
	// .equals(ECORE_GEN_PACKAGE_EXTENSION_POINT)) {
	//
	// NodeList packageList = extensionElement
	// .getElementsByTagName("package");
	//
	// for (int t = 0; t < packageList.getLength(); t++) {
	//
	// Node packageNode = packageList.item(t);
	//
	// if (packageNode.getNodeType() == Node.ELEMENT_NODE) {
	//
	// Element packageElement = (Element) packageNode;
	// extensionPackages.add(packageElement);
	//
	// }
	//
	// }
	//
	// }
	//
	// }
	//
	// }
	//
	// return extensionPackages;
	// }
	
//	/**
//	 * @param fullClassName
//	 * @return
//	 * @throws MojoExecutionException
//	 */
//	private Object loadClass(String fullClassName)
//			throws MojoExecutionException {
//
//		String classPath = fullClassName.replace('.', File.separatorChar);
//
//		try {
//
//			URL classDir = new File(project.getBuild().getOutputDirectory()
//					+ File.separator + classPath).getParentFile().toURI()
//					.toURL();
//			System.out.println("+++" + classDir.toString());
//			ClassLoader classLoader = RegisterECoreModel.class.getClassLoader();
//			ClassLoader urlClassLoader = new URLClassLoader(
//					new URL[] { classDir }, classLoader);
//
//			Class<?> loadedClass = urlClassLoader.loadClass(fullClassName);
//			return loadedClass.newInstance();
//
//		} catch (ClassNotFoundException | InstantiationException
//				| IllegalAccessException | MalformedURLException e) {
//			throw new MojoExecutionException(e.getLocalizedMessage(), e);
//		}
//
//	}
//
//	/**
//	 * @param modelNamespaceURI
//	 * @param modelPackage
//	 * @throws MojoExecutionException
//	 */
//	private void registerECoreModel(String modelNamespaceURI,
//			EPackage modelPackage) throws MojoExecutionException {
//
//		try {
//
//			Field eInstanceField = modelPackage.getClass().getDeclaredField(
//					"eINSTANCE");
//
//			if (eInstanceField.getType() == modelPackage.getClass()) {
//				EPackage.Registry.INSTANCE.put(modelNamespaceURI,
//						eInstanceField.get(modelPackage));
//			} else {
//				throw new MojoExecutionException(
//						"Field eINSTANCE is of the invalid type "
//								+ eInstanceField.getType().getName());
//			}
//
//		} catch (NoSuchFieldException | IllegalArgumentException
//				| IllegalAccessException exc) {
//			throw new MojoExecutionException(exc.getLocalizedMessage(), exc);
//		}
//
//	}

}
