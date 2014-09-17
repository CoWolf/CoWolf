package de.uni_stuttgart.iste.cowolf.model.lqn.analysis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.uni_stuttgart.iste.cowolf.core.utilities.CommandLineExecutor;
import de.uni_stuttgart.iste.cowolf.core.utilities.PrinterRegistry;
import de.uni_stuttgart.iste.cowolf.model.IAnalysisListener;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType;
import de.uni_stuttgart.iste.cowolf.model.lqn.LQNModelManager;

public class LQNAnalyzeJob extends Job {	
	
	private final static Logger LOGGER = LoggerFactory
			.getLogger(LQNAnalyzeJob.class);
	
	private final Resource model;
	private final Map<String, Object> parameters;
	private List<String> results;
	private final IAnalysisListener listener;
	private File lqnInputFile;
	private String lqnOutputFile;

	private Map<String,String> mapIdName;

	public LQNAnalyzeJob(final Resource model,
			final Map<String, Object> parameters, IAnalysisListener listener) {
		super("LQN Analysis Job");
		
		try {
			lqnInputFile = File.createTempFile("lqnmodel", ".lqn");
			lqnOutputFile = lqnInputFile.getName().replace(".lqn", ".d");
			File dir = new File(lqnInputFile.getParentFile().getAbsolutePath() + File.separator + lqnOutputFile);
			dir.mkdirs();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.model = model;
		this.parameters = parameters;
		this.listener = listener;
		generateModelIdNameMap();
		System.out.println("Input: " + lqnInputFile.getAbsolutePath());
		System.out.println(lqnOutputFile.toString());
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		
		final String pathToLQNSolver = (String) parameters.get(LQNModelManager.PARAM_PATH_TO_LQN_SOLVER);
		monitor.beginTask("Analyze LQN Model", 2);

		try {
			// 1. Generate lqn file
			LQNAnalyzeFilesWriter.writeTempFileFromGenerator(model, lqnInputFile.getAbsolutePath(), parameters);
			monitor.worked(1);

			// 2. Use CommandLineExecutor to execute lqn solver.
			final StringBuilder lqnSolverCommand = new StringBuilder();
			lqnSolverCommand.append("-x -o ").append(lqnOutputFile);
			lqnSolverCommand.append(" ").append(lqnInputFile.getName());
			Reader r = new InputStreamReader(
					CommandLineExecutor.execCommandAndGetOutput(lqnInputFile.getParentFile().getAbsolutePath(),  pathToLQNSolver, lqnSolverCommand.toString())
					);
			
			System.out.println(lqnSolverCommand.toString());
			
			BufferedReader in = new BufferedReader(r);
			String line;
			while ((line = in.readLine()) != null) {
				PrinterRegistry.getInstance().println("DTMC Analysis", line);
			}
			PrinterRegistry.getInstance().close();
			
			monitor.worked(1);

			// 3. Parse the results from generated file
			parseResultFile(lqnInputFile.getParentFile().getAbsolutePath() + File.separator + lqnOutputFile + File.separator + lqnInputFile.getName().replace(".lqn", ".lqxo"));
			monitor.done();
		} catch (Exception e) {
			LOGGER.error("", e); 
			return Status.CANCEL_STATUS;
		}
		return Status.OK_STATUS;
	}

	protected void parseResultFile(final String file) throws Exception {
		results = new ArrayList<>();
		BufferedReader br;
		br = new BufferedReader(new FileReader(file));
		String line;
//		int i = 1;
		while ((line = br.readLine()) != null) {
//			if (i == 2) {
//				results.add("<?xml-stylesheet type=\"text/xsl\" href=\"out.xslt\"?>");
//			}
			line = line.replaceAll("__", "-");
			line = transformIdToNames(line);
			results.add(line);
//			i++;
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
		
		StringBuilder sb = new StringBuilder();
		
		for (String result : results) {
			sb.append(result).append('\n');
		}
		
		IFile resultFile = LQNAnalyzeFilesWriter.generateHTMLFile(model, sb.toString());

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
					LOGGER.error("", e); 
				}
			}
		}
	}

	private String transformIdToNames(String source){
		String target = source;
		for (String key : mapIdName.keySet()) {
			String value = mapIdName.get(key);
			if (value != null && !value.equals("")) {
				target = target.replaceAll(key, value);
			}
		}
		return target;
	}
}
