package de.uni_stuttgart.iste.cowolf.silift_recognition_rules_maven_plugin;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.sidiff.difference.rulebase.extension.AbstractProjectRuleBase;

/**
 * Generates the recognition rules that are needed for the evolution of two
 * model versions.
 * 
 * @author Rene Trefft
 */
public class RecognitionRulesGenerator extends AbstractMojo {

	/**
	 * Generates the recognition rules from the edit rules in all available
	 * SiLift rulebase projects.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// RuleBaseBuilder ruleBaseBuilder = new RuleBaseBuilder();
		//
		// // Uses reflection to invoke private build method in SiLift
		// // RuleBaseBuilder bundle
		// try {
		// Method recognitionRulesFullBuildMethod = RuleBaseBuilder.class
		// .getDeclaredMethod("fullBuild", IProgressMonitor.class);
		//
		//
		//
		// recognitionRulesFullBuildMethod.setAccessible(true);
		// recognitionRulesFullBuildMethod.invoke(ruleBaseBuilder,
		// new NullProgressMonitor());
		// } catch (NoSuchMethodException | SecurityException
		// | IllegalAccessException | IllegalArgumentException
		// | InvocationTargetException e) {
		// e.printStackTrace();
		// }

	}

	/**
	 * The project itself. This parameter is set by Maven.
	 */
	@Parameter(property = "project", readonly = true, required = true)
	private MavenProject project;

	private boolean isRulebaseProject(File projectRoot) {
		
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		
	}
	
	
	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {

		File projectRoot = project.getBasedir();
		
		
		
		
		File projectRoot = new File("").getAbsoluteFile();
		File workspaceRoot = projectRoot.getParentFile();

		List<File> ruleBaseProjects = new ArrayList<File>();

		for (File workspaceProject : workspaceRoot.listFiles()) {

			if (workspaceProject.isDirectory()) {

				File ruleBaseFile = new File(workspaceProject,
						AbstractProjectRuleBase.RULEBASE_FILE);

				if (ruleBaseFile.isFile()) {
					getLog().debug("Rulebase file found: " + ruleBaseFile);
					ruleBaseProjects.add(workspaceProject);
				}

			}

		}

		for (File ruleBaseProject : ruleBaseProjects) {

			getLog().info("Rulebase project: " + ruleBaseProject.getName());

			File editRulesDir = new File(ruleBaseProject,
					AbstractProjectRuleBase.SOURCE_FOLDER);

			if (editRulesDir.isDirectory()) {

				List<File> editRules = new ArrayList<File>();
				listHenshinFilesRecursively(editRulesDir, editRules);

			} else {

				getLog().warn(
						"Rulebase project \"" + ruleBaseProject.getName()
								+ "\" has no directory \""
								+ AbstractProjectRuleBase.SOURCE_FOLDER + "\".");

			}

		}
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
