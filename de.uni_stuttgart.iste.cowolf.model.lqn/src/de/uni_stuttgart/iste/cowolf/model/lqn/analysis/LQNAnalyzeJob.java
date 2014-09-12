package de.uni_stuttgart.iste.cowolf.model.lqn.analysis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.core.utilities.CommandLineExecutor;
import de.uni_stuttgart.iste.cowolf.model.IAnalysisListener;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.DocumentRoot;
import de.uni_stuttgart.iste.cowolf.model.lqn.LQNModelManager;

public class LQNAnalyzeJob extends Job {

	private final Resource model;
	private final Map<String, Object> parameters;
	private List<String> results;
	private final IAnalysisListener listener;
	private final String PATH_LQN_INPUT_FILE = "model.lqn";
	private final String PATH_LQN_OUTPUT_FILE = "model.out";
	private final static Map<String,LQNSolverFileGenerator> lqnFilesGenerator;
	private final String lqnSolverBasicCommand = "xftar ";

	private static final String CRLF = "\r\n";
	
	static{
		lqnFilesGenerator = new HashMap<String, LQNSolverFileGenerator>();
	}

	public LQNAnalyzeJob(final Resource model,
			final Map<String, Object> parameters, IAnalysisListener listener) {
		super("LQN Analysis Job");
		this.model = model;
		this.parameters = parameters;
		this.listener = listener;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		final String pathToXFTA = (String) parameters
				.get(LQNModelManager.PARAM_PATH_TO_LQN_SOLVER);
		final String pathToOutputXFTAFile = System.getProperty("java.io.tmpdir") + "/"
				+ PATH_LQN_OUTPUT_FILE;

		monitor.beginTask("Analyse Fault Tree", 2);

		try {
			// 1. Generate lqn file
			writeTempFileFromGenerator();
			monitor.worked(1);

			// 2. Use CommandLineExecutor to execute xFTA.
			final String lqnSolverCommand = lqnSolverBasicCommand + PATH_LQN_INPUT_FILE;
			CommandLineExecutor.execCommand(pathToXFTA, lqnSolverCommand);
			monitor.worked(1);

			// 3. Parse the results from generated file
			parseResultFile(pathToOutputXFTAFile);
			monitor.done();
		} catch (Exception e) {
			e.printStackTrace();
			return Status.CANCEL_STATUS;
		}
		return Status.OK_STATUS;
	}

	protected void parseResultFile(final String file) throws Exception {
		results = new ArrayList<>();
		BufferedReader br;
		br = new BufferedReader(new FileReader(file));
		String line;
		while ((line = br.readLine()) != null) {
			results.add(line);
		}
		br.close();
	}

	protected void writeTempFileFromGenerator()
			throws Exception {
		LQNSolverFileGenerator generator = lqnFilesGenerator.get((parameters.get("typeOfAnalysis")));
		OutputStreamWriter out = new FileWriter(PATH_LQN_OUTPUT_FILE);
		out.write(generator.doGenerateLQNSolverFile(
				(DocumentRoot) model.getContents().get(0), parameters).toString());
		out.close();
	}

	public void writeToResultFile() {
		Resource resource = model;

		IFile modelfile = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path(resource.getURI().toPlatformString(true)));

		IFile resultfile = ResourcesPlugin
				.getWorkspace()
				.getRoot()
				.getFile(
						modelfile.getFullPath()
								.addFileExtension("lqnAnalysis.csv"));
		OutputStreamWriter out = null;
		try {
			out = new FileWriter(resultfile.getLocation().toOSString());

			StringBuilder sb = new StringBuilder();

			for (String line : results) {
				sb.append(line).append(CRLF);
			}

			out.write(sb.toString());

			if (this.listener != null) {
				this.listener.finished(resource, resultfile);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				out.flush();
				out.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
