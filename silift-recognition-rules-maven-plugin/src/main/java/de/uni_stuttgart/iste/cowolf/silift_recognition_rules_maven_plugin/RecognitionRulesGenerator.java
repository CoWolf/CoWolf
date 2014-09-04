package de.uni_stuttgart.iste.cowolf.silift_recognition_rules_maven_plugin;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.sidiff.difference.rulebase.extension.AbstractProjectRuleBase;
import org.sidiff.difference.rulebase.nature.RuleBaseProjectNature;
import org.sidiff.difference.rulebase.wrapper.RuleBaseWrapper;
import org.sidiff.difference.rulebase.wrapper.util.Edit2RecognitionException;
import org.sidiff.editrule.validation.EditRuleValidation;
import org.sidiff.editrule.validation.EditRuleValidator;

/**
 * Builds the SiLift rulebase and generates the recognition rules that are needed for the comparison of two
 * model versions.
 * 
 * @author Rene Trefft
 */
public class RecognitionRulesGenerator extends AbstractMojo {

	RuleBaseWrapper ruleBaseWrapper = null;

	/**
	 * The project itself. This parameter is set by Maven.
	 */
	@Parameter(property = "project", readonly = true, required = true)
	private MavenProject project;

	/**
	 * 
	 * @param projectRoot
	 * @return
	 */
	private boolean isRulebaseProject(File projectRoot) {

		File projectDescriptionFile = new File(projectRoot,
				IProjectDescription.DESCRIPTION_FILE_NAME);

		try {

			InputStream projectDescriptionInputStream = new BufferedInputStream(
					new FileInputStream(projectDescriptionFile));
			IProjectDescription projectDescription = ResourcesPlugin
					.getWorkspace().loadProjectDescription(
							projectDescriptionInputStream);

			String[] projectNatures = projectDescription.getNatureIds();

			for (String projectNature : projectNatures) {

				if (projectNature.equals(RuleBaseProjectNature.NATURE_ID)) {
					getLog().info(
							"Artifact " + project.getArtifactId()
									+ " is a Rulebase project.");
					return true;
				}

			}

			getLog().debug(
					"Artifact " + project.getArtifactId()
							+ " is not a Rulebase project.");

		} catch (CoreException | FileNotFoundException e) {
			getLog().debug(
					"Artifact "
							+ project.getArtifactId()
							+ " is not a valid Eclipse project, because project description file is invalid or missing.");
		}

		return false;

	}

	/**
	 * 
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

		return noValidationErrors;

	}

	/**
	 * 
	 * @param editRules
	 * @throws MojoExecutionException
	 */
	private void validateAndGenerateRecognitionRules(List<File> editRules) throws MojoExecutionException {

		getLog().info(
				"Validating edit rules and generating recognition rules of them in artifact \""
						+ project.getArtifactId() + "\"...");

		for (File editRule : editRules) {

			boolean noValidationErrors = validateEditRule(editRule);

			if (!noValidationErrors) {

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
				"Validating edit rules and generating recognition rules of them in artifact \""
						+ project.getArtifactId() + "\" completed.");

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
							+ " is a Rulebase project, but has no editrules in the editrules directory.");
			return;
		}
		
		

		validateAndGenerateRecognitionRules(editRules);

		try {
			buildRuleBase();
		} catch (IOException exc) {
			throw new MojoExecutionException(exc.getLocalizedMessage(), exc);
		}

	}

	/**
	 * 
	 * @throws IOException
	 */
	private void buildRuleBase() throws IOException {
		getLog().info(
				"Building rulebase file \"" + project.getBasedir() + "\"...");
		getRuleBaseWrapper().saveRuleBase();
		getLog().info(
				"Building rulebase file \"" + project.getBasedir()
						+ "\" completed.");
	}

	/**
	 * 
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

			RuleBaseWrapper ruleBaseWrapper = new RuleBaseWrapper(ruleBaseURI,
					recognitionRulesDir, editRulesDir, false);

			ruleBaseWrapper.setName(getRuleBasePluginBundleName());

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
	 * 
	 * @return
	 */
	private String getRuleBasePluginBundleName() {

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
									+ "\" used for name of rulebase.");
					return matcher.group(1);
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

		getLog().debug(
				"Retrieving bundle name from manifest not possible. Try to use Maven artifact name.");

		String artifactName = project.getName();

		if (artifactName != null) {
			getLog().debug(
					"Maven artifact name \"" + artifactName
							+ "\" used for name of rulebase.");
			return artifactName;
		}

		getLog().debug(
				"Maven artifact name is not defined. Using an empty string as rulebase name.");

		return "";

	}

	/**
	 * @param dir
	 * @param henshinFiles
	 */
	private void listHenshinFilesRecursively(File dir, List<File> henshinFiles) {

		File[] files = dir.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.toLowerCase().endsWith(".henshin");
			}
		});

		for (File file : files) {

			if (file.isDirectory())
				listHenshinFilesRecursively(file, henshinFiles);
			else {
				henshinFiles.add(file);
			}
		}

	}

}
