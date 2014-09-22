package de.uni_stuttgart.iste.cowolf.silift_rulebase_maven_plugin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
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
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.resource.HenshinResourceFactory;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.sidiff.difference.lifting.edit2recognition.util.Edit2RecognitionUtil;
import org.sidiff.difference.rulebase.RecognitionRule;
import org.sidiff.difference.rulebase.RuleBase;
import org.sidiff.difference.rulebase.RulebasePackage;
import org.sidiff.difference.rulebase.extension.AbstractProjectRuleBase;
import org.sidiff.difference.rulebase.nature.RuleBaseProjectNature;
import org.sidiff.difference.rulebase.wrapper.RuleBaseWrapper;
import org.sidiff.difference.rulebase.wrapper.util.Edit2RecognitionException;
import org.sidiff.editrule.validation.EditRuleValidation;
import org.sidiff.editrule.validation.EditRuleValidator;
import org.silift.common.util.emf.XMIIDResourceImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

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
	 * Checks if the Eclipse project {@code projectRoot} is a SiLift rulebase
	 * project. A rulebase project contains the appropriate nature in the
	 * project description file.
	 * 
	 * @param projectRoot
	 *            of the project
	 * @return {@code true} if project is a rulebase project, otherwise
	 *         {@code false}
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
	 * Registers the Henshin Ecore model in the global EMF Resource Factory and
	 * EPackage registries.
	 */
	private void registerHenshinEcoreModel() {

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"henshin", new HenshinResourceFactory());

		HenshinPackage henshinPackage = HenshinPackage.eINSTANCE;
		EPackage.Registry.INSTANCE.put(HenshinPackage.eNS_URI, henshinPackage);

	};

	/**
	 * Registers the SiLift rulebase Ecore model in the global EMF Resource
	 * Factory and EPackage registries.
	 */
	private void registerRulebaseEcoreModel() {

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"rulebase", new XMIResourceFactoryImpl());

		RulebasePackage rulebasePackage = RulebasePackage.eINSTANCE;
		EPackage.Registry.INSTANCE
				.put(RulebasePackage.eNS_URI, rulebasePackage);

	};

	/**
	 * Validates the edit rule {@code editRule}. Any validation information,
	 * warning and error will be logged using the Maven logger.
	 * 
	 * @param editRule
	 *            to validate
	 * @return {@code true} if no validation error occured, otherwise
	 *         {@code false}
	 */
	private boolean validateEditRule(File editRule) {

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
	 * Validates the edit rules {@code editRules} and generates the recognition
	 * rules.
	 * 
	 * @param editRules
	 *            to validate and generate the recognition rules from.
	 * @throws MojoExecutionException
	 *             if generation of a recognition rule failed
	 */
	private void validateEditRuleAndGenerateRecognitionRules(
			List<File> editRules) throws MojoExecutionException {

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

		validateEditRuleAndGenerateRecognitionRules(editRules);

		try {
			buildRuleBase();
		} catch (IOException exc) {
			throw new MojoExecutionException(exc.getLocalizedMessage(), exc);
		}

	}

	/**
	 * Builds the SiLift rulebase and stores the recognition rules.
	 * 
	 * @throws IOException
	 * @throws MojoExecutionException
	 */
	private void buildRuleBase() throws IOException, MojoExecutionException {
		getLog().info(
				"Building rulebase file \"" + project.getBasedir()
						+ File.separator
						+ AbstractProjectRuleBase.RULEBASE_FILE
						+ "\" and storing recognition rules...");

		saveRecognitionModules();

		RuleBase ruleBase = getRuleBaseWrapper().getRuleBase();

		URI editRuleDir = URI.createURI(ruleBase.getEditRuleFolder());
		URI recognitionRuleDir = URI.createURI(ruleBase
				.getRecognitionRuleFolder());

		URI editRulesDirPlatformResourceURI = URI.createPlatformResourceURI(
				editRuleDir.toFileString().replace(
						project.getBasedir().getParent(), ""), true);
		ruleBase.setEditRuleFolder(editRulesDirPlatformResourceURI.toString());

		URI recognitionRulesDirPlatformResourceURI = URI
				.createPlatformResourceURI(recognitionRuleDir.toFileString()
						.replace(project.getBasedir().getParent(), ""), true);
		ruleBase.setRecognitionRuleFolder(recognitionRulesDirPlatformResourceURI
				.toString());

		// creates a new resource
		Resource resource = new XMIIDResourceImpl(getRuleBaseWrapper()
				.getRuleBaseLocation());

		// adds the rulebase to the resource
		resource.getContents().add(ruleBase);

		Map<String, Object> options = new HashMap<String, Object>();

		options.put(XMIResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		PlatformResourceDeresolve platformResourceDeResolve = new PlatformResourceDeresolve(
				project.getBasedir());
		options.put(XMIResource.OPTION_URI_HANDLER, platformResourceDeResolve);

		try {
			resource.save(options);
		} catch (IOException e) {
			throw new MojoExecutionException("Saving rulebase file \"" +  project.getBasedir()
					+ File.separator
					+ AbstractProjectRuleBase.RULEBASE_FILE + "\" failed.", e);
		}

		getLog().info(
				"Building rulebase file \"" + project.getBasedir()
						+ File.separator
						+ AbstractProjectRuleBase.RULEBASE_FILE
						+ "\" and storing recognition rules completed.");

	}

	/**
	 * Transforms a absolute file URI to a platform resource URI. If its not a
	 * file URI, simply the given URI will be returned.
	 */
	private static class PlatformResourceDeresolve extends URIHandlerImpl {

		public PlatformResourceDeresolve(File projectBaseDir) {
			this.projectBaseDir = projectBaseDir;
		}

		File projectBaseDir;

		@Override
		public URI deresolve(URI uri) {

			if (!uri.isPlatformResource() && uri.isFile()) {
				// removes the project base parent directory
				String recognitionRuleRelPath = uri.toFileString().replace(
						projectBaseDir.getParent(), "");

				return URI.createPlatformResourceURI(recognitionRuleRelPath,
						false).appendFragment(uri.fragment());
			}

			return uri;

		}

	}

	/**
	 * Stores the generated recognition rules contained in the
	 * {@code RuleBaseWrapper}.
	 * 
	 * @throws MojoExecutionException
	 */
	private void saveRecognitionModules() throws MojoExecutionException {

		try {

			// hack for getting the generated recognition rules inside the rule
			// base wrapper
			Field recognitionRulesField = RuleBaseWrapper.class
					.getDeclaredField("newRecognitionRules");
			recognitionRulesField.setAccessible(true);
			Object obj = recognitionRulesField.get(getRuleBaseWrapper());

			if (obj instanceof Set<?>) {

				@SuppressWarnings("unchecked")
				Set<RecognitionRule> recognitionRules = (Set<RecognitionRule>) obj;

				for (RecognitionRule rrRule : recognitionRules) {

					Edit2RecognitionUtil.saveRecognitionRule(rrRule
							.getRecognitionModule(), rrRule.getEditRule()
							.getExecuteModule(),
							getRecognitionRuleSaveURI(rrRule.getEditRule()
									.getExecuteModule()));

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

	/**
	 * Builds the save URI of the recognition rule generated of the edit rule
	 * {@code editModule}.
	 * 
	 * @param editModule
	 * @return the save URI of the recognition rule
	 */
	private URI getRecognitionRuleSaveURI(Module editModule) {

		String editRuleURI = editModule.eResource().getURI().toFileString();

		// Get URI without filename
		String editRuleDir = new File(editRuleURI).getParentFile().getPath();

		// Replace Edit Rule Folder with Recognition Rule Folder
		String recognitionRuleDir = editRuleDir.replace(File.separator
				+ AbstractProjectRuleBase.SOURCE_FOLDER, File.separator
				+ AbstractProjectRuleBase.BUILD_FOLDER);

		return URI.createFileURI(recognitionRuleDir);

	}

	/**
	 * @return Rule base wrapper that especially stores the rulebase and the
	 *         generated recognition rules and provides methods for generating
	 *         them.
	 * @throws MojoExecutionException
	 *             if deletion of a already existent rulebase file failed
	 */
	private RuleBaseWrapper getRuleBaseWrapper() throws MojoExecutionException {

		if (ruleBaseWrapper == null) {

			String ruleBase = project.getBasedir() + File.separator
					+ AbstractProjectRuleBase.RULEBASE_FILE;
			File ruleBaseFile = new File(ruleBase);
			URI ruleBaseURI = URI.createFileURI(ruleBase);

			URI editRulesDirURI = URI.createFileURI(project.getBasedir()
					+ File.separator + AbstractProjectRuleBase.SOURCE_FOLDER);

			URI recognitionRulesDirURI = URI.createFileURI(project.getBasedir()
					+ File.separator + AbstractProjectRuleBase.BUILD_FOLDER);

			if (ruleBaseFile.isFile()) {
				if (!ruleBaseFile.delete()) {
					throw new MojoExecutionException(
							"Deletion of already existent rulebase file \""
									+ ruleBase + "\" failed.");
				}
			}

			ruleBaseWrapper = new RuleBaseWrapper(ruleBaseURI,
					recognitionRulesDirURI, editRulesDirURI, false);

			ruleBaseWrapper.setName(chooseRuleBaseName());

		}

		return ruleBaseWrapper;

	}

	/**
	 * Generates a recognition rule of the edit rule {@code editRule}.
	 * 
	 * @param editRule
	 * @throws Edit2RecognitionException
	 *             if generation failed
	 * @throws MojoExecutionException
	 */
	private void generateRecognitionRule(File editRule)
			throws Edit2RecognitionException, MojoExecutionException {
		getLog().debug(
				"Generating recognition rule of edit rule \""
						+ editRule.getPath() + "\"...");

		getRuleBaseWrapper().generateItemFromFile(
				URI.createFileURI(editRule.getPath()));

		getLog().debug(
				"Generating recognition rule of edit rule \""
						+ editRule.getPath() + "\" completed.");

	}

	/**
	 * Chooses the name of the rule base. If a bundle name is specified in the
	 * manifest, it will be used as rule base name. If not, the Maven artifact
	 * name will be taken. If an artifact name is not specified in the POM, an
	 * empty string will used.
	 *
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
	 * Retrieves all henshin files the directory {@code dir}.
	 * 
	 * @param dir
	 *            to check for henshin files.
	 * @param henshinFiles
	 *            contains the found henshin files
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
