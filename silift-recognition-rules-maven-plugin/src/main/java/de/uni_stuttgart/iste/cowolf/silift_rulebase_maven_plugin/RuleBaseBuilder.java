package de.uni_stuttgart.iste.cowolf.silift_rulebase_maven_plugin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.resource.HenshinResourceFactory;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.sidiff.difference.lifting.edit2recognition.util.Edit2RecognitionUtil;
import org.sidiff.difference.rulebase.RecognitionRule;
import org.sidiff.difference.rulebase.RulebasePackage;
import org.sidiff.difference.rulebase.extension.AbstractProjectRuleBase;
import org.sidiff.difference.rulebase.nature.RuleBaseProjectNature;
import org.sidiff.difference.rulebase.wrapper.RuleBaseWrapper;
import org.sidiff.difference.rulebase.wrapper.util.Edit2RecognitionException;
import org.sidiff.editrule.validation.EditRuleValidation;
import org.sidiff.editrule.validation.EditRuleValidator;
import org.silift.common.util.emf.EMFStorage;
import org.silift.common.util.emf.XMIIDResourceImpl;
import org.silift.common.util.emf.EMFStorage.PlatformResourceDeresolve;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import de.uni_stuttgart.iste.cowolf.silift_rulebase_maven_plugin.rulebase_ext.RulebaseResourceFactory;

/**
 * Builds the SiLift rulebase and generates the recognition rules that are
 * needed for the comparison of two model versions.
 * 
 * @author Rene Trefft
 */
@Mojo(name = "build", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class RuleBaseBuilder extends AbstractMojo {

	private RuleBaseWrapper ruleBaseWrapper = null;

	private final String ECLIPSE_PROJECT_DESCRIPTION_FILE_NAME = ".project";

	/**
	 * The project itself. This parameter is set by Maven.
	 */
	@Parameter(property = "project", readonly = true, required = true)
	private MavenProject project;

	/**
	 * @param projectRoot
	 * @return
	 * @throws MojoExecutionException
	 */
	private boolean isRulebaseProject(File projectRoot)
			throws MojoExecutionException {

		getLog().debug(
				"Checking if artifact \"" + project.getArtifactId()
						+ "\" is a Rulebase project...");

		File projectDescriptionFile = new File(projectRoot,
				ECLIPSE_PROJECT_DESCRIPTION_FILE_NAME);

		if (projectDescriptionFile.isFile()) {

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

			try {

				DocumentBuilder db = dbf.newDocumentBuilder();
				Document doc = db.parse(projectDescriptionFile);

				doc.getDocumentElement().normalize();

				NodeList naturesList = doc.getElementsByTagName("natures");

				Node naturesNode = naturesList.item(0);

				if (naturesNode != null
						&& naturesNode.getNodeType() == Node.ELEMENT_NODE) {

					Element naturesElement = (Element) naturesNode;
					NodeList natureList = naturesElement
							.getElementsByTagName("nature");

					for (int s = 0; s < natureList.getLength(); s++) {

						Node natureNode = natureList.item(s);
						NodeList natureChildNodes = natureNode.getChildNodes();

						if (RuleBaseProjectNature.NATURE_ID
								.equals(natureChildNodes.item(0).getNodeValue())) {
							getLog().info(
									"Artifact \"" + project.getArtifactId()
											+ "\" is a Rulebase project.");
							return true;
						}

					}

				}

				getLog().debug(
						"Rulebase nature \""
								+ RuleBaseProjectNature.NATURE_ID
								+ "\" does not exist in project description file \""
								+ ECLIPSE_PROJECT_DESCRIPTION_FILE_NAME + "\".");

			} catch (ParserConfigurationException | SAXException | IOException exc) {

				throw new MojoExecutionException(exc.getLocalizedMessage(), exc);

			}

		} else {

			getLog().debug(
					"Artifact \""
							+ project.getArtifactId()
							+ "\" is not a Eclipse project, because project description file \""
							+ ECLIPSE_PROJECT_DESCRIPTION_FILE_NAME
							+ "\" is missing.");

		}

		getLog().info(
				"Artifact \"" + project.getArtifactId()
						+ "\" is not a Rulebase project.");

		return false;

	}

	/**
	 * 
	 */
	private void registerHenshinEcoreModel() {

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"henshin", new HenshinResourceFactory());

	};

	private void registerRulebaseEcoreModel() {

		// ResourceSet rs = new ResourceSetImpl();
		// // enable extended metadata
		// final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(
		// rs.getPackageRegistry());
		// rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA,
		// extendedMetaData);
		//
		// Resource r = rs.getResource(
		// URI.createFileURI(project.getBasedir() + File.separator + "model" +
		// File.separator + "RuleBase.ecore"), true);
		// EObject eObject = r.getContents().get(0);
		// if (eObject instanceof EPackage) {
		//
		// EPackage p = (EPackage) eObject;
		// EPackage.Registry.INSTANCE.put(p.getNsURI(), p);

		// EPackage.Registry.INSTANCE.put(RulebasePackage.getNsURI(), p);

		// Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
		// "rulebase", new
		// XMIResourceFactoryImpl().createResource(URI.createURI(RulebasePackage.eNS_URI)));
		//
		// RulebasePackage.eINSTANCE.getName();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"rulebase", new XMIResourceFactoryImpl());

		// RulebasePackage.eINSTANCE.getEFactoryInstance();

	};

	/**
	 * @param editRule
	 * @return
	 * @throws MojoExecutionException
	 */
	private boolean validateEditRule(File editRule)
			throws MojoExecutionException {

		getLog().debug("Validating editrule \"" + editRule.getPath() + "\"...");

		HenshinResourceSet resourceSet = new HenshinResourceSet();
		Module editModule = resourceSet.getModule(editRule.getPath());

		List<EditRuleValidation> validations = new ArrayList<EditRuleValidation>();
		validations = EditRuleValidator
				.calculateEditRuleValidations(editModule);

		boolean noValidationErrors = true;

		for (EditRuleValidation validation : validations) {

			switch (validation.severity) {

			case Diagnostic.ERROR:
				getLog().error(
						validation.infoMessage + " (Type: "
								+ validation.validationType + ")");
				noValidationErrors = false;
			case Diagnostic.WARNING:
				getLog().warn(
						validation.infoMessage + " (Type: "
								+ validation.validationType + ")");
			case Diagnostic.INFO:
				getLog().info(
						validation.infoMessage + " (Type: "
								+ validation.validationType + ")");
			}

		}

		getLog().debug(
				"Validating editrule \"" + editRule.getPath() + "\" completed.");

		return noValidationErrors;

	}

	/**
	 * @param editRules
	 * @throws MojoExecutionException
	 */
	private void validateAndGenerateRecognitionRules(List<File> editRules)
			throws MojoExecutionException {

		getLog().info(
				"Validating edit rules and generating recognition rules of them...");

		for (File editRule : editRules) {

			boolean noValidationErrors = validateEditRule(editRule);

			if (noValidationErrors) {

				try {
					generateRecognitionRule(editRule);
				} catch (Edit2RecognitionException exc) {
					throw new MojoExecutionException(exc.getLocalizedMessage(),
							exc);
				}

			} else {
				getLog().error(
						"Edit rule \""
								+ editRule.getPath()
								+ "\" is not valid, so no recognition rule will be generated of them. Skip to next edit rule.");
			}

		}

		getLog().info(
				"Validating edit rules and generating recognition rules of them completed.");

	}

	/**
	 * 
	 */
	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {

		File projectRoot = project.getBasedir();

		if (!isRulebaseProject(projectRoot)) {
			return;
		}

		File editRulesDir = new File(projectRoot,
				AbstractProjectRuleBase.SOURCE_FOLDER);

		if (!editRulesDir.isDirectory()) {
			getLog().warn(
					"Artifact "
							+ project.getArtifactId()
							+ " is a Rulebase project, but has no editrules directory.");
			return;
		}

		List<File> editRules = new ArrayList<File>();
		listHenshinFilesRecursively(editRulesDir, editRules);

		if (editRules.isEmpty()) {
			getLog().warn(
					"Artifact "
							+ project.getArtifactId()
							+ " is a Rulebase project, but has no rules in the editrules directory.");
			return;
		}

		registerHenshinEcoreModel();
		registerRulebaseEcoreModel();

		validateAndGenerateRecognitionRules(editRules);

		try {
			buildRuleBase();
		} catch (IOException exc) {
			throw new MojoExecutionException(exc.getLocalizedMessage(), exc);
		}

	}

	/**
	 * @throws IOException
	 * @throws MojoExecutionException
	 */
	private void buildRuleBase() throws IOException, MojoExecutionException {
		getLog().info(
				"Building rulebase file \"" + project.getBasedir()
						+ File.separator
						+ AbstractProjectRuleBase.RULEBASE_FILE + "\"...");
		saveRuleBase();
		getLog().info(
				"Building rulebase file \"" + project.getBasedir()
						+ "\" completed.");
	}

	private void saveRuleBase() throws MojoExecutionException {

		saveRecognitionModules();

		if (new File(project.getBasedir() + File.separator
				+ AbstractProjectRuleBase.RULEBASE_FILE).exists()) {
			EMFStorage.eSave(getRuleBaseWrapper().getRuleBase());
		} else {

			Resource resource = new XMIIDResourceImpl(getRuleBaseWrapper()
					.getRuleBaseLocation());
			resource.getContents().add(getRuleBaseWrapper().getRuleBase());

			Map<String, Object> options = new HashMap<String, Object>();
			options.put(XMIResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
			options.put(XMIResource.OPTION_URI_HANDLER,
					new PlatformResourceDeresolve());

			try {
				resource.save(options);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	/**
	 * Deresolve as platform resource URI.
	 */
	private static class PlatformResourceDeresolve extends URIHandlerImpl {
		@Override
		public URI deresolve(URI uri) {
			
				return URI.createPlatformResourceURI(uri.toFileString(), false).appendFragment(uri.fragment());
		
		}
	}

	/**
	 * 
	 * @throws MojoExecutionException
	 */
	private void saveRecognitionModules() throws MojoExecutionException {

		try {

			Field recognitionRulesField = RuleBaseWrapper.class
					.getDeclaredField("newRecognitionRules");
			recognitionRulesField.setAccessible(true);

			Object obj = recognitionRulesField.get(getRuleBaseWrapper());

			if (obj instanceof Set<?>) {

				@SuppressWarnings("unchecked")
				Set<RecognitionRule> recognitionRules = (Set<RecognitionRule>) obj;

				for (RecognitionRule rrRule : recognitionRules) {

					if (rrRule.getRecognitionMainUnit().eResource() != null) {
						// Existing recognition rule:
						EMFStorage.eSave(rrRule.getRecognitionModule());
					} else {
						// New recognition rule:
						Edit2RecognitionUtil.saveRecognitionRule(rrRule
								.getRecognitionModule(), rrRule.getEditRule()
								.getExecuteModule(),
								getRecognitionRuleSaveURI(rrRule.getEditRule()
										.getExecuteModule()));
					}
				}

			} else {
				throw new MojoExecutionException(
						"newRecognitionRules field is not of correct type.");
			}

		} catch (NoSuchFieldException | SecurityException
				| IllegalArgumentException | IllegalAccessException e) {
			throw new MojoExecutionException(e.getLocalizedMessage(), e);
		}

	}

	private URI getRecognitionRuleSaveURI(Module editModule) {

		// Replace Edit-Rule with Recognition-Rule to keep folder structure:
		String editRuleFolderString = getRuleBaseWrapper().getEditRuleFolder()
				.lastSegment();
		String recognitionRuleFolderString = getRuleBaseWrapper()
				.getRecognitionRuleFolder().lastSegment();

		System.out.println("++++" + editModule.eResource().getURI());

		// String savePath =
		// EMFStorage.uriToPath(editModule.eResource().getURI());

		String savePath = editModule.eResource().getURI().toFileString();

		// Get URI without filename
		savePath = savePath.substring(0, savePath.lastIndexOf(File.separator));

		// Replace EditRuleFolder with RecognitionRuleFolder
		savePath = savePath.replace(File.separator + editRuleFolderString,
				File.separator + recognitionRuleFolderString);

		return pathToUri(savePath);
	}

	public URI pathToUri(String path) {

		return URI.createPlatformResourceURI(path, false);

		// IFile[] iFiles = ResourcesPlugin.getWorkspace().getRoot()
		// .findFilesForLocationURI(new File(path).toURI());
		//
		// if (iFiles.length > 0) {
		// return URI.createPlatformResourceURI(iFiles[0].getFullPath()
		// .toString(), true);
		// } else {
		// return URI.createFileURI(new File(path).getAbsolutePath());
		// }

	}

	/**
	 * @return
	 */
	private RuleBaseWrapper getRuleBaseWrapper() {

		if (ruleBaseWrapper == null) {

			URI ruleBaseURI = URI.createFileURI(project.getBasedir()
					+ File.separator + AbstractProjectRuleBase.RULEBASE_FILE);
			URI editRulesDir = URI.createFileURI(project.getBasedir()
					+ File.separator + AbstractProjectRuleBase.SOURCE_FOLDER);
			URI recognitionRulesDir = URI.createFileURI(project.getBasedir()
					+ File.separator + AbstractProjectRuleBase.BUILD_FOLDER);

			ruleBaseWrapper = new RuleBaseWrapper(ruleBaseURI,
					recognitionRulesDir, editRulesDir, false);

			ruleBaseWrapper.setName(chooseRuleBaseName());

		}

		return ruleBaseWrapper;

	}

	private void generateRecognitionRule(File editRule)
			throws Edit2RecognitionException {
		getLog().debug(
				"Generating recognition rule of edit rule \""
						+ editRule.getPath() + "\"...");

		getRuleBaseWrapper().generateItemFromFile(
				URI.createFileURI(editRule.getPath()));
	}

	/**
	 * @return
	 */
	private String chooseRuleBaseName() {

		File bundleManifestFile = new File(project.getBasedir()
				+ File.separator + "META-INF" + File.separator + "MANIFEST.MF");

		if (bundleManifestFile.isFile()) {

			BufferedReader br = null;

			try {

				br = new BufferedReader(new FileReader(bundleManifestFile));

				StringBuilder bundleManifestContent = new StringBuilder();

				String currentLine;

				while ((currentLine = br.readLine()) != null) {
					System.out.println("+++++++ " + currentLine);
					bundleManifestContent.append(currentLine);
				}

				String pattern = ".*Bundle-Name:\\s*([(\\w|/[^\\S\\n]/)]*);?.*";
				Matcher matcher = Pattern.compile(pattern, Pattern.DOTALL)
						.matcher(bundleManifestContent);
				if (matcher.matches()) {
					String bundleName = matcher.group(1);
					getLog().debug(
							"Bundle name \"" + bundleName
									+ "\" used as name of rulebase.");
					return matcher.group(1);
				} else {
					getLog().debug("Bundle name not defined in manifest.");
				}

			} catch (IOException exc) {
				getLog().error(exc);
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException exc) {
						getLog().error(exc);
					}
				}

			}

		}

		getLog().warn(
				"Retrieving bundle name from manifest not possible. Try to use Maven artifact name.");

		String artifactName = project.getName();

		if (artifactName != null) {
			getLog().debug(
					"Maven artifact name \"" + artifactName
							+ "\" used as name of rulebase.");
			return artifactName;
		}

		getLog().warn(
				"Maven artifact name is not defined. Using an empty string as rulebase name.");

		return "";

	}

	/**
	 * @param dir
	 * @param henshinFiles
	 */
	private void listHenshinFilesRecursively(File dir, List<File> henshinFiles) {

		File[] files = dir.listFiles();

		for (File file : files) {

			if (file.isDirectory())
				listHenshinFilesRecursively(file, henshinFiles);
			else if (file.getName().toLowerCase().endsWith(".henshin")) {
				henshinFiles.add(file);
			}
		}

	}

}
