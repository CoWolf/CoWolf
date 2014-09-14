package de.uni_stuttgart.iste.cowolf.model.lqn.analysis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.core.utilities.CommandLineExecutor;
import de.uni_stuttgart.iste.cowolf.model.IAnalysisListener;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.DocumentRoot;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType;
import de.uni_stuttgart.iste.cowolf.model.lqn.LQNModelManager;

public class LQNAnalyzeJob extends Job {

	private final Resource model;
	private final Map<String, Object> parameters;
	private List<String> results;
	private final IAnalysisListener listener;
	private final String INPUT_FILE_NAME = "model.lqn";
	private final String OUTPUT_NAME = "model";
	private final String OUTPUT_FOLDER_NAME = OUTPUT_NAME+".d";
	private final String OUTPUT_FILE_NAME = OUTPUT_NAME+".lqxo";
	private final static Map<String,LQNSolverFileGenerator> lqnFilesGenerator;
	private final String lqnSolverBasicCommand = "lqns.exe -x ";
	private Map<String,String> mapIdName;

	private static final String CRLF = "\r\n";
	
	static{
		lqnFilesGenerator = new HashMap<String, LQNSolverFileGenerator>();
		lqnFilesGenerator.put("serviceTime", new LQNSolverFileStandardGenerator());
	}
	
	public LQNAnalyzeJob(final Resource model,
			final Map<String, Object> parameters, IAnalysisListener listener) {
		super("LQN Analysis Job");
		this.model = model;
		this.parameters = parameters;
		this.listener = listener;
		generateModelIdNameMap();
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		final String pathToLQNSolver = (String) parameters.get(LQNModelManager.PARAM_PATH_TO_LQN_SOLVER);
		final String pathToInputLQNFile = System.getProperty("java.io.tmpdir") + INPUT_FILE_NAME;
		final String pathToOutputLQNFile = System.getProperty("java.io.tmpdir") + OUTPUT_FOLDER_NAME +"/" + OUTPUT_FILE_NAME;

		monitor.beginTask("Analyze LQN Model", 2);

		try {
			// 1. Generate lqn file
			writeTempFileFromGenerator(pathToInputLQNFile);
			monitor.worked(1);

			// 2. Use CommandLineExecutor to execute lqn solver.
			final StringBuilder lqnSolverCommand = new StringBuilder();
			lqnSolverCommand.append("cd ").append(System.getProperty("java.io.tmpdir")).append(" & ");
			lqnSolverCommand.append(pathToLQNSolver).append("/").append(lqnSolverBasicCommand);
			lqnSolverCommand.append("-o ").append(OUTPUT_NAME);
			lqnSolverCommand.append(" ").append(INPUT_FILE_NAME);
			CommandLineExecutor.execCommand(lqnSolverCommand.toString());
			monitor.worked(1);

			// 3. Parse the results from generated file
			parseResultFile(pathToOutputLQNFile);
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
		int i = 1;
		while ((line = br.readLine()) != null) {
			if (i == 2) {
				results.add("<?xml-stylesheet type=\"text/xsl\" href=\"out.xslt\"?>");
			}
			line = line.replaceAll("__", "-");
			line = transformIdToNames(line);
			results.add(line);
			i++;
		}
		br.close();
	}

	protected void writeTempFileFromGenerator(String pathToOutputLQNFile)
			throws Exception {
		LQNSolverFileGenerator generator = lqnFilesGenerator.get((parameters.get("typeOfAnalysis")));
		OutputStreamWriter out = new FileWriter(pathToOutputLQNFile);
		out.write(generator.doGenerateLQNSolverFile(
				(DocumentRoot) model.getContents().get(0), parameters).toString());
		out.flush();
		out.close();
	}

	public void writeToResultFile() {
		Resource resource = model;

		IFile modelfile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(resource.getURI().toPlatformString(true)));

		IFile resultfile = ResourcesPlugin
				.getWorkspace()
				.getRoot()
				.getFile(
						modelfile.getFullPath()
								.addFileExtension("lqnAnalysis.xml"));
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

	private void generateModelIdNameMap(){
		mapIdName = new HashMap<String,String>();
		
		for ( Iterator<EObject> iter = model.getAllContents();iter.hasNext();) {
			EObject o = iter.next();
			if (o instanceof ProcessorType || o instanceof TaskType || o instanceof EntryType || o instanceof ActivityType) {
				try {
					Method gi = o.getClass().getMethod("getId", null);
					Method gn = o.getClass().getMethod("getName", null);
					
					String id = (String) gi.invoke(o, null);
					String name = (String) gn.invoke(o, null);
					
					mapIdName.put(id, name);				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	private String transformIdToNames(String source){
		String target = source;
		for (String key : mapIdName.keySet()) {
			String value = mapIdName.get(key);
			target = target.replaceAll(key, value);
		}
		return target;
	}
}
