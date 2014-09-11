package de.uni_stuttgart.iste.cowolf.model.fault_tree.analyze;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
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
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreeModelManager;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.EventImpl;

public class FaultTreeAnalyzeJob extends Job {

	private static final Map<String, XFTAGenerator> XFTAScriptGenerators;
	private static final Map<String, String> resultFileTitles;
	private static final String TAB = "\t";
	private static final String CRLF = "\r\n";

	private final Resource model;
	private final Map<String, Object> parameters;
	private List<String> results;
	private final IAnalysisListener listener;
	private Map<String,String> mapIdName;

	public FaultTreeAnalyzeJob(final Resource model,
			final Map<String, Object> parameters, IAnalysisListener listener) {
		super("Fault Tree Analysys Job");
		this.model = model;
		this.parameters = parameters;
		this.listener = listener;
		generateModelIdNameMap();
	}

	static {
		XFTAScriptGenerators = new HashMap<String, XFTAGenerator>();
		XFTAScriptGenerators.put("probabilityTopEvent",
				new XFTAProbailityTopEventScriptGenerator());
		XFTAScriptGenerators.put("minimalCutSets",
				new XFTAMinimalCutsetsScriptGenerator());
		
		resultFileTitles = new HashMap<String, String>();
		StringBuilder pteTitle = new StringBuilder();
		pteTitle.append("Probability of The Top Event").append(CRLF);
		pteTitle.append("Id Top Evenet").append(TAB).append("Mission Time").append(TAB).append("Probability");
		resultFileTitles.put("probabilityTopEvent", pteTitle.toString());
		
		StringBuilder mcsTitle = new StringBuilder();
		mcsTitle.append("Minimal cutsets").append(CRLF);
		mcsTitle.append("Rank").append(TAB).append("Probability").append(TAB).append("Contribution").append(TAB).append("Cut-Set");
		resultFileTitles.put("minimalCutSets", mcsTitle.toString());
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try {

			final String inputFaultTreeFileName = "xFTA_tree.xml";
			final String scriptFileName = "xFTA_script.xml";
			final String outputFaultTreeFileName = "xFTA_out.txt";
			final String pathToXFTA = (String) parameters
					.get(FaultTreeModelManager.PARAM_PATH_TO_XFTA);
			final String xFTABasicCommand = "xftar ";
			final String pathToOutputXFTAFile = System.getProperty("java.io.tmpdir") + "/"
					+ outputFaultTreeFileName;

			monitor.beginTask("Analyse Fault Tree", 3);

			// 1. Generate xFTA file
			File xFTAFaultTreeFile = writeTempFileFromGenerator(
					inputFaultTreeFileName, new XFTAFaultTreeGenerator());
			monitor.worked(1);

			// 2. Generate xFTA script
			parameters.put("pathToInputXFTAFile", xFTAFaultTreeFile.getAbsoluteFile());
			parameters.put("pathToOutputXFTAFile", pathToOutputXFTAFile);
			File xFTAScriptFile = writeTempFileFromGenerator(
					scriptFileName,
					XFTAScriptGenerators.get((parameters.get("typeOfAnalysis"))));
			monitor.worked(1);

			// 3. Use CommandLineExecutor to execute xFTA.
			final String xFTACommand = xFTABasicCommand
					+ xFTAScriptFile.getAbsolutePath();
			CommandLineExecutor.execCommand(pathToXFTA, xFTACommand, "Analyze Faulttree with xFTA");
			monitor.worked(1);

			// 4. Parse the results from generated file
			parseResultFile(pathToOutputXFTAFile);
			monitor.done();

			xFTAFaultTreeFile.delete();
			xFTAScriptFile.delete();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Status.OK_STATUS;
	}

	public void writeToResultFile() {
		Resource resource = this.getModel();

		IFile modelfile = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path(resource.getURI().toPlatformString(true)));

		IFile resultfile = ResourcesPlugin
				.getWorkspace()
				.getRoot()
				.getFile(
						modelfile.getFullPath()
								.addFileExtension("analysis.csv"));
		OutputStreamWriter out = null;
		try {
			out = new FileWriter(resultfile.getLocation().toOSString());

			StringBuilder sb = new StringBuilder();
			sb.append(resultFileTitles.get(parameters.get("typeOfAnalysis")));
			sb.append(CRLF);
			for (String line : this.getResults()) {
				sb.append(transformIdToNames(line)).append(CRLF);
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

	private File writeTempFileFromGenerator(String name, XFTAGenerator generator)
			throws Exception {
		String fileNameParts[] = name.split("\\.");
		File xftaFile = File.createTempFile(fileNameParts[0], "."+fileNameParts[1]);

		OutputStreamWriter out = new FileWriter(xftaFile.getAbsolutePath());
		out.write(generator.doGenerateXFTAFile(
				(FaultTree) model.getContents().get(0), parameters).toString());
		out.close();

		return xftaFile;
	}
	
	private void generateModelIdNameMap(){
		mapIdName = new HashMap<String,String>();
		
		for ( Iterator<EObject> iter = model.getAllContents();iter.hasNext();) {
			EObject o = iter.next();
			if (o instanceof EventImpl) {
				EventImpl e = (EventImpl) o;
				mapIdName.put(e.getId(), e.getName());
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

	public Resource getModel() {
		return model;
	}

	public List<String> getResults() {
		return results;
	}

}