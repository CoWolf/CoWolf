package de.uni_stuttgart.iste.cowolf.model.dtmc.analyze;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;
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
import de.uni_stuttgart.iste.cowolf.ui.console.ConsolePrinter;

public class DTMCAnalyzeJob extends Job {

	private final Resource model;
	private final Map<String, Object> parameters;

	private EList<State> states;
	private HashMap<Object, String> prismResult;

	private String prismRootPath = "";
	private String prismPMPath = "";
	private String prismPCTLPath = "";
	private String prismResultPath = "";
	private String prismParameters = "";
	private HashSet<State> analyzeStates;
	private TreeSet<String> analyzeLabels;

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
	 *            prismRootPath : The path to the PRISM root directory. verify :
	 *            Calculate reachability using verification. Doesn't require any
	 *            other parameters. simulate : Calculate reachability by
	 *            simulation. Requires: samples : number of samples, ]0,
	 *            2147483647] confidence : Confidence for reachability, ]0, 1[
	 *            pathlength : Maximum pathlength, ]0, 2147483647]
	 * 
	 */
	public DTMCAnalyzeJob(final Resource model,
			final Map<String, Object> parameters) {
		super("DTMC Analyse");
		this.model = model;
		this.parameters = parameters;

		if (this.parameters.containsKey("prismRootPath")) {
			this.prismRootPath = this.parameters.get("prismRootPath")
					+ File.separator + "bin" + File.separator;
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

	public HashMap<Object, String> getAnalysis() {
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

			getAnalyzeProperties();

			this.prismResult = new HashMap<Object, String>();

			monitor.beginTask("Analyse CTMC", analyzeLabels.size()
					+ analyzeStates.size() + 3);

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

			String pctl = generator.generatePCTL(this.model,
					this.analyzeStates, this.analyzeLabels).toString();

			System.out.println(pctl);

			out = new FileOutputStream(pctlFile.getAbsolutePath());
			out.write(pctl.getBytes());
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
					CommandLineExecutor.execCommandAndGetStream(
							this.prismRootPath, "prism " + this.prismPMPath
									+ " " + this.prismPCTLPath
									+ " -exportresults " + this.prismResultPath
									+ this.prismParameters));
			BufferedReader in = new BufferedReader(r);
			String line;
			ConsolePrinter consolePrinter = new ConsolePrinter("DTMC Analysis");
			while ((line = in.readLine()) != null) {
				// Every time a PRISM test run finishes, a line of dashes is
				// printed. We look for them and increment the progress bar.
				consolePrinter.println(line);
				if (line.contains("-------------------------------------------------------------------")) {
					monitor.worked(1);
				}
			}
			in.close();
			consolePrinter.close();
			monitor.done();

			this.parseResultFile(this.prismResultPath);

			pmFile.delete();
			pctlFile.delete();
			resultFile.delete();

			System.out.println("Results:");
			for (Entry<Object, String> entry : this.prismResult.entrySet()) {
				String key = "";
				if (entry.getKey() instanceof State) {
					key = ((State) entry.getKey()).getName();
				} else if (entry.getKey() instanceof String) {
					key = "Label: " + (String) entry.getKey();
				}
				String value = entry.getValue();

				System.out.println(key + " => " + value);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return Status.OK_STATUS;
	}

	private void getAnalyzeProperties() {
		boolean absorbing = !this.parameters.containsKey("analyzeAbsorbing")
				|| (boolean) this.parameters.get("analyzeAbsorbing");

		this.analyzeStates = new HashSet<State>();
		if (this.parameters.containsKey("analyzeStates")
				&& this.parameters.get("analyzeStates") instanceof Collection) {
			@SuppressWarnings("unchecked")
			Collection<String> as = (Collection<String>) this.parameters
					.get("analyzeStates");

			for (State s : states) {
				if (absorbing && s.getOutgoing().size() == 0) {
					this.analyzeStates.add(s);
				} else if (as.contains(s.getId())) {
					this.analyzeStates.add(s);
				}
			}
		}

		this.analyzeLabels = new TreeSet<String>();
		if (this.parameters.containsKey("analyzeLabels")
				&& this.parameters.get("analyzeLabels") instanceof Collection) {
			@SuppressWarnings("unchecked")
			Collection<String> al = (Collection<String>) this.parameters
					.get("analyzeLabels");
			this.analyzeLabels.addAll(al);
		}
	}

	protected void parseResultFile(final String file) {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			Pattern propPattern = Pattern
					.compile("^P=\\?\\s*\\[\\s*F\\s*(?:s=(\\d+)|\"(\\w+)\")\\s*\\]:\\s*$");
			Pattern resultPattern = Pattern.compile("^([0|1]?\\.\\d+)$");
			boolean first = true;
			while ((line = br.readLine()) != null) {
				Matcher m = propPattern.matcher(line);
				int index = -1;
				String label = "";
				if (!m.find()) {
					if (!first) {
						// no useful line, try next one.
						continue;
					} else {
						// maybe only one result, save into first end state.
						if (this.analyzeStates.size() > 0) {
							index = this.states.indexOf(this.analyzeStates
									.iterator().next());
						} else if (this.analyzeLabels.size() > 0) {
							index = -1;
							label = this.analyzeLabels.first();
						}
					}
				} else {
					if (m.group(1) != null) {
						index = Integer.parseInt(m.group(1));
					} else if (m.group(2) != null) {
						label = m.group(2);
					} else {
						continue;
					}
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
				if (index >= 0) {
					this.prismResult.put(states.get(index), result);
				} else if (!label.isEmpty()) {
					this.prismResult.put(label, result);
				}

			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
