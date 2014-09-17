package de.uni_stuttgart.iste.cowolf.model.lqn.analysis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.core.utilities.CommandLineExecutor;
import de.uni_stuttgart.iste.cowolf.core.utilities.PrinterRegistry;
import de.uni_stuttgart.iste.cowolf.model.IAnalysisListener;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityType;
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
	private final String PATH_TO_INPUT_LQN_FILE = System.getProperty("java.io.tmpdir") + INPUT_FILE_NAME;
	private final String PATH_TO_OUTPUT_LQN_FILE = System.getProperty("java.io.tmpdir") + OUTPUT_FOLDER_NAME +"/" + OUTPUT_FILE_NAME;

	private final String lqnSolverBasicCommand = "lqns.exe -x ";
	private Map<String,String> mapIdName;

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
		monitor.beginTask("Analyze LQN Model", 2);

		try {
			// 1. Generate lqn file
			LQNAnalyzeFilesWriter.writeTempFileFromGenerator(model, PATH_TO_INPUT_LQN_FILE, parameters);
			monitor.worked(1);

			// 2. Use CommandLineExecutor to execute lqn solver.
			final StringBuilder lqnSolverCommand = new StringBuilder();
			lqnSolverCommand.append("cd ").append(System.getProperty("java.io.tmpdir")).append(" & ");
			lqnSolverCommand.append(pathToLQNSolver).append("/").append(lqnSolverBasicCommand);
			lqnSolverCommand.append("-o ").append(OUTPUT_NAME);
			lqnSolverCommand.append(" ").append(INPUT_FILE_NAME);
			Reader r = new InputStreamReader(
					CommandLineExecutor.execCommandAndGetOutput(System.getProperty("java.io.tmpdir"), lqnSolverCommand.toString())
					);
			
			BufferedReader in = new BufferedReader(r);
			String line;
			while ((line = in.readLine()) != null) {
				PrinterRegistry.getInstance().println("DTMC Analysis", line);
			}
			PrinterRegistry.getInstance().close();
			
			monitor.worked(1);

			// 3. Parse the results from generated file
			parseResultFile(PATH_TO_OUTPUT_LQN_FILE);
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
	
	protected void writeToResultFile(){
//		StringBuilder sb = new StringBuilder("");
//		if (results != null) {
//			for (String string : results) {
//				sb.append(string);
//			}
//		}
//		IFile resultFile = LQNFilesWriter.writeToResultFile(model, results);
		
		IFile resultFile = LQNAnalyzeFilesWriter.generateHTMLFile(model,PATH_TO_OUTPUT_LQN_FILE);

		if (this.listener != null) {
			this.listener.finished(model, resultFile);
		}
	}

	@SuppressWarnings("all")
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
