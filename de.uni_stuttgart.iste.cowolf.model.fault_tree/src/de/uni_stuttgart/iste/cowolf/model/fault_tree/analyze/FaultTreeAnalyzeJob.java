package de.uni_stuttgart.iste.cowolf.model.fault_tree.analyze;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.uni_stuttgart.iste.cowolf.core.utilities.CommandLineExecutor;
import de.uni_stuttgart.iste.cowolf.core.utilities.PrinterRegistry;
import de.uni_stuttgart.iste.cowolf.model.AnalysisResultUtil;
import de.uni_stuttgart.iste.cowolf.model.IAnalysisListener;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreeModelManager;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.EventImpl;

public class FaultTreeAnalyzeJob extends Job {

	private final static Logger LOGGER = LoggerFactory
			.getLogger(FaultTreeAnalyzeJob.class);
	
	private static final Map<String, XFTAGenerator> XFTAScriptGenerators;
	private static final Map<String, String> resultFileTitles;
	private static final String SEP = "</td><td>";

	private final Resource model;
	private final Map<String, Object> parameters;
	private List<String> results;
	private final IAnalysisListener listener;
	private Map<String, String> mapIdName;

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
		pteTitle.append("<h2>Probability of The Top Event</h2>\n");
		
		pteTitle.append("<table>");
		pteTitle.append("<thead><tr>").append("<th>Id Top Event</th>")
			.append("<th>Mission Time</th>")
			.append("<th>Probability</th>")
			.append("</tr></thead>");
		resultFileTitles.put("probabilityTopEvent", pteTitle.toString());

		StringBuilder mcsTitle = new StringBuilder();
		mcsTitle.append("<h2>Minimal cutsets</h2>\n");
		mcsTitle.append("<table>");
		mcsTitle.append("<thead><tr>")
				.append("<th>Rank</th>")
				.append("<th>Probability</th>")
				.append("<th>Contribution</th>")
				.append("<th>Cut-Set</th>")
				.append("</tr></thead>");
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
			final String xFTABasicCommand = "xftar";
			final String pathToOutputXFTAFile = System
					.getProperty("java.io.tmpdir")
					+ "/"
					+ outputFaultTreeFileName;

			monitor.beginTask("Analyse Fault Tree", 3);

			// 1. Generate xFTA file
			File xFTAFaultTreeFile = writeTempFileFromGenerator(
					inputFaultTreeFileName, new XFTAFaultTreeGenerator());
			monitor.worked(1);

			// 2. Generate xFTA script
			parameters.put("pathToInputXFTAFile",
					xFTAFaultTreeFile.getAbsoluteFile());
			parameters.put("pathToOutputXFTAFile", pathToOutputXFTAFile);
			File xFTAScriptFile = writeTempFileFromGenerator(
					scriptFileName,
					XFTAScriptGenerators.get((parameters.get("typeOfAnalysis"))));
			monitor.worked(1);

			// 3. Use CommandLineExecutor to execute xFTA.
			final String xFTACommand = xFTAScriptFile.getAbsolutePath();
			Reader r = new InputStreamReader(
					CommandLineExecutor.execCommandAndGetOutput(pathToXFTA,
							xFTABasicCommand,
							xFTACommand));
			BufferedReader in = new BufferedReader(r);
			String line;
			while ((line = in.readLine()) != null) {
				PrinterRegistry.getInstance().println("FaultTree Analysis",
						line);
			}
			PrinterRegistry.getInstance().close();
			monitor.worked(1);

			// 4. Parse the results from generated file
			parseResultFile(pathToOutputXFTAFile);
			monitor.done();

//			xFTAFaultTreeFile.delete();
//			xFTAScriptFile.delete();

		} catch (IOException e) {
			LOGGER.error("", e); 
		} catch (Exception e) {
			LOGGER.error("", e); 
		}
		return Status.OK_STATUS;
	}

	public void writeToResultFile() {
		Resource resource = this.getModel();

		IFile modelfile = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path(resource.getURI().toPlatformString(true)));

		IFile resultfile = ResourcesPlugin.getWorkspace().getRoot().getFile(
						modelfile.getFullPath().addFileExtension("analysis.html"));
		try {
			StringBuilder sb = new StringBuilder();
			sb.append("<h1>xFTA Analysis Result</h1>\n");
			sb.append(resultFileTitles.get(parameters.get("typeOfAnalysis")));
			sb.append("\n");
			
			if (parameters.get("typeOfAnalysis").equals("probabilityTopEvent")
					&& this.getResults().size() > 0
					&& this.getResults().get(0).startsWith("top-event"+SEP+"mission-time")) {
				this.getResults().remove(0);
			}
			
			sb.append("<tbody>");
			for (String line : this.getResults()) {
				if (parameters.get("typeOfAnalysis").equals("probabilityTopEvent")
						&& line.startsWith("basic-event"+SEP+"occurrences")) {
					sb.append("</tbody></table><br /><br />\n\n");
					sb.append("<table><thead><tr><th>")
					  .append(line.replace(SEP, "</th><th>"))
					  .append("</th></tr></thead>\n")
					  .append("<tbody>");
					continue;
				}
				sb.append("<tr><td>").append(transformIdToNames(line)).append("</td></tr>\n");
			}
			
			sb.append("</tbody></table>");
			
			ByteArrayInputStream in = new ByteArrayInputStream(AnalysisResultUtil.encapsulateHTML(sb.toString()).getBytes());

			if (resultfile.exists()) {
				resultfile.setContents(in, true, false, null);
			} else {
				resultfile.create(in, true, null);
			}

			if (this.listener != null) {
				this.listener.finished(resource, resultfile);
			}
		} catch (CoreException e) {
			LOGGER.error("", e);
		}
	}

	protected void parseResultFile(final String file) throws Exception {
		results = new ArrayList<>();
		BufferedReader br;
		br = new BufferedReader(new FileReader(file));
		String line;
		while ((line = br.readLine()) != null) {
			if (parameters.get("typeOfAnalysis").equals("minimalCutSets")) {
				String[] parsed = line.split("\\t", 4);
				if (parsed.length == 4) {
					parsed[3] = "<ul><li>" + parsed[3].replace("\t", "</li><li>") + "</li></ul>";
				}
				String join = "";
				for (int i=0; i<parsed.length;i++) {
					join += (i==0?"":SEP) + parsed[i];
				}
				results.add(join);
			
			} else {
				results.add(line.replace("\t", SEP));
			}
		}
		br.close();
	}

	private File writeTempFileFromGenerator(String name, XFTAGenerator generator)
			throws Exception {
		String fileNameParts[] = name.split("\\.");
		File xftaFile = File.createTempFile(fileNameParts[0], "."
				+ fileNameParts[1]);

		OutputStreamWriter out = new FileWriter(xftaFile.getAbsolutePath());
		out.write(generator.doGenerateXFTAFile(
				(FaultTree) model.getContents().get(0), parameters).toString());
		out.close();

		return xftaFile;
	}

	private void generateModelIdNameMap() {
		mapIdName = new HashMap<String, String>();

		for (Iterator<EObject> iter = model.getAllContents(); iter.hasNext();) {
			EObject o = iter.next();
			if (o instanceof EventImpl) {
				EventImpl e = (EventImpl) o;
				mapIdName.put(e.getId(), e.getName());
			}
		}
	}

	private String transformIdToNames(String source) {
		String target = source;
		for (String key : mapIdName.keySet()) {
			String value = mapIdName.get(key);
			if (value != null && !value.equals("")) {
				target = target.replaceAll(key, value);
			}
		}
		return target;
	}

	public Resource getModel() {
		return model;
	}

	/**
	 * 
	 * @return a list of results, never null.
	 */
	public List<String> getResults() {
		if (results != null) {
			return results;
		}
		return new ArrayList<String>();
	}

}