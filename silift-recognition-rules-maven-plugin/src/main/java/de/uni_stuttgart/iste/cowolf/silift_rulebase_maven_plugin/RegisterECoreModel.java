package de.uni_stuttgart.iste.cowolf.silift_rulebase_maven_plugin;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
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

@Mojo(name = "register-ecore-model", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class RegisterECoreModel extends AbstractMojo {

	private final String ECORE_FILE_EXTENSION = "ecore";

	/**
	 * Directory relative to the project base directory containing the Ecore
	 * Model.
	 */
	private final String DEFAULT_MODEL_DIR_PATH = "model";

	/**
	 * The project itself. This parameter is set by Maven.
	 */
	@Parameter(property = "project", readonly = true, required = true)
	private MavenProject project;

	/**
	 * 
	 * Retrieves all ecore files the directory {@code dir}.
	 * 
	 * @param dir
	 *            to check for ecore files.
	 * @param henshinFiles
	 *            contains the found ecore files
	 */
	private void listEcoreFilesRecursively(File dir, List<File> ecoreFiles) {

		File[] files = dir.listFiles();

		for (File file : files) {

			if (file.isDirectory())
				listEcoreFilesRecursively(file, ecoreFiles);
			else if (file.getName().toLowerCase()
					.endsWith("." + ECORE_FILE_EXTENSION)) {
				ecoreFiles.add(file);
			}
		}

	}

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {

		File ecoreModelDir = new File(project.getBasedir() + File.separator
				+ DEFAULT_MODEL_DIR_PATH);

		if (ecoreModelDir.isDirectory()) {

			List<File> ecoreFiles = new ArrayList<File>();
			listEcoreFilesRecursively(ecoreModelDir, ecoreFiles);

			if (!ecoreFiles.isEmpty()) {

				// it's weird, but first of all we have to register the ecore
				// XMI model
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
						.put(ECORE_FILE_EXTENSION,
								new EcoreResourceFactoryImpl());

				ResourceSet rs = new ResourceSetImpl();
				// enable extended metadata
				final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(
						rs.getPackageRegistry());

				rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA,
						extendedMetaData);

				for (File ecoreFile : ecoreFiles) {

					Resource resource = rs.getResource(
							URI.createFileURI(ecoreFile.toString()), true);
					EObject eObject = resource.getContents().get(0);

					if (eObject instanceof EPackage) {

						EPackage ePackage = (EPackage) eObject;

						// we must set the Epackage namespace as resource URI,
						// otherwise the resource reference points to the Ecore
						// file
						resource.setURI(URI.createURI(ePackage.getNsURI()));

						getLog().info(
								"Registering Ecore model with namespace \""
										+ ePackage.getNsURI() + "\"...");

						EPackage.Registry.INSTANCE.put(ePackage.getNsURI(),
								ePackage);

						getLog().info(
								"Registering Ecore model with namespace \""
										+ ePackage.getNsURI() + "\" completed.");

					}

				}

				if (!ecoreFiles.isEmpty()) {
					return;
				}

			}

		}

		getLog().info(
				"Artifact \"" + project.getArtifactId()
						+ "\" is not a Ecore model.");

	}

}
