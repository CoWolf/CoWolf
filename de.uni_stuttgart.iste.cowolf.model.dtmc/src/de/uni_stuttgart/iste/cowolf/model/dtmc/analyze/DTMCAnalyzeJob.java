package de.uni_stuttgart.iste.cowolf.model.dtmc.analyze;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.core.utilities.CommandLineExecutor;
import de.uni_stuttgart.iste.cowolf.model.dtmc.DTMC;
import de.uni_stuttgart.iste.cowolf.model.dtmc.State;

public class DTMCAnalyzeJob extends Job {

	private final Resource model;
	private final Map<String, Object> parameters;
	
	private EList<State> states;
	private HashMap<State, String> prismResult;

	private String prismRootPath = "";
	private String prismPMPath = "";
	private String prismPCTLPath = "";
	private String prismResultPath = "";
	private String prismParameters = "";

	/**
	 * Used to analyze a DTMC using PRISM. As this might take some time for
	 * large models, a job is created to run as a thread. The DTMC resource is
	 * transfered into a PRISM-readable format and saved to a temporary file.
	 * For every end-state that is defined in the DTMC, a evaluation will be
	 * run.
	 *
	 * @param model
	 *            The DTMC resource containing a Root node and
	 *            states/transitions.
	 * @param parameters
	 *            prismRootPath : The path to the PRISM root directory. 
	 *            verify : Calculate reachability using verification. Doesn't require any other parameters. 
	 *            simulate : Calculate reachability by simulation. Requires:
	 *            	samples : number of samples, ]0, 2147483647] 
	 *            	confidence : Confidence for reachability, ]0, 1[
	 *            	pathlength : Maximum pathlength, ]0, 2147483647]
	 *      
	 */
	public DTMCAnalyzeJob(final Resource model,
			final Map<String, Object> parameters) {
		super("DTMC Analyse");
		this.model = model;
		this.parameters = parameters;

		if (this.parameters.containsKey("prismRootPath")) {
			this.prismRootPath = this.parameters.get("prismRootPath") + File.separator + "bin" + File.separator;
		}
		if (this.parameters.containsKey("verify")) {
			this.prismParameters = ""; // PRISM uses verify as default setting.
		}
		if (this.parameters.containsKey("simulation")) {
			this.prismParameters = " -sim -simmethod ci -simsamples "
					+ parameters.get("samples") + " -simconf "
					+ parameters.get("confidence") + " -simpathlen "
					+ parameters.get("pathlength");
		}

	}	
	
	public Resource getModel() {
		return this.model;
	}

	public HashMap<State, String> getAnalysis() {
		return this.prismResult;
	}

	@Override
	protected IStatus run(final IProgressMonitor monitor) {
		if (this.model == null || this.model.getContents() == null
				|| this.model.getContents().size() == 0
				|| !(this.model.getContents().get(0) instanceof DTMC)) {
			return Status.CANCEL_STATUS;
		}
	
		try {
			DTMC root = (DTMC) this.model.getContents().get(0);
			states = root.getStates();
			
			this.prismResult = new HashMap<State,String>();

			monitor.beginTask("Analyse DTMC", prismResult.size() + 4);

			PRISMGenerator generator = new PRISMGenerator();

			// 1. Generate pm-file from model and save it to a temporary file.
			File pmFile = File.createTempFile("dtmc_prism_pm", ".pm");

			System.out.println(generator.generatePM(this.model));

			FileOutputStream out = new FileOutputStream(
					pmFile.getAbsolutePath());
			out.write(generator.generatePM(this.model).toString().getBytes());
			out.close();

			monitor.worked(1);

			// 2. Generate pctl-file from model and save it to a temporary file.
			File pctlFile = File.createTempFile("dtmc_prism_pctl", ".pctl");

			System.out.println(generator.generatePCTL(this.model));

			out = new FileOutputStream(pctlFile.getAbsolutePath());
			out.write(generator.generatePCTL(this.model).toString().getBytes());
			out.close();
			monitor.worked(1);

			// 3. Generate result-file and set paths.
			File resultFile = File.createTempFile("dtmc_prism_result", ".txt");
			this.prismPMPath = pmFile.getAbsolutePath();
			this.prismPCTLPath = pctlFile.getAbsolutePath();
			this.prismResultPath = resultFile.getAbsolutePath();
			monitor.worked(1);

			// 4. Use CommandLineExecutor to execute PRISM.
			Reader r = new InputStreamReader(
					CommandLineExecutor.execCommandAndGetStream(this.prismRootPath,
							"prism " + this.prismPMPath + " " + this.prismPCTLPath
									+ " -exportresults " + this.prismResultPath + this.prismParameters));
			BufferedReader in = new BufferedReader(r);
			String line;
			while ((line = in.readLine()) != null) {
				// Every time a PRISM test run finishes, a line of dashes is
				// printed. We look for them and increment the progress bar.
				System.out.println(line);
				if (line.contains("-------------------------------------------------------------------")) {
					monitor.worked(1);
				}
			}
			in.close();
			monitor.done();

			this.parseResultFile(this.prismResultPath);
			
			pmFile.delete();
			pctlFile.delete();
			resultFile.delete();
			
			System.out.println("Results:");
			for(Entry<State, String> entry : this.prismResult.entrySet()) {
				  State key = entry.getKey();
				  String value = entry.getValue();

				  System.out.println(key.getName() + " => " + value);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return Status.OK_STATUS;
	}

	protected void parseResultFile(final String file) {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			Pattern propPattern = Pattern.compile("^P=\\?\\s*\\[\\s*F\\s*s=(\\d+)\\s*\\]:\\s*$");
			Pattern resultPattern = Pattern.compile("^([0|1]?\\.\\d+)$");
			boolean first = true;
			while ((line = br.readLine()) != null) {
				Matcher m = propPattern.matcher(line);
				int index = -1;
				if (!m.find()) {
					if (!first) {
						// no useful line, try next one.
						continue;
					} else {
						// maybe only one result, save into first end state.
						for (int i=0; i<this.states.size(); i++) {
							if (this.states.get(i).getOutgoing().size() == 0) {
								index = i;
							}
						}
					}
				} else {
					index = Integer.parseInt(m.group(1));
					line = br.readLine();
				}

				if (line == null || !line.equals("Result")) {
					continue;
				}
				line = br.readLine();

				m = resultPattern.matcher(line);
				if (line == null || !m.find()) {
					continue;
				}
				String result = m.group(1);
				this.prismResult.put(states.get(index), result);
				
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
