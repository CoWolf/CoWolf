package de.uni_stuttgart.iste.cowolf.model.dtmc.analyze;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.core.utilities.CommandLineExecutor;
import de.uni_stuttgart.iste.cowolf.model.dtmc.State;
import de.uni_stuttgart.iste.cowolf.model.dtmc.impl.RootImpl;

public class DTMCAnalyzeJob extends Job {

	private final Resource model;
	private final Map<String, Object> parameters;

	private String prismRootPath = "C:\\Program Files (x86)\\prism-4.2.beta1\\bin\\";
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
	 *            prismRootPath : The path to the PRISM root directory. verify :
	 *            Calculate reachability using verification. Doesn't require any
	 *            other parameters. simulate : Calculate reachability by
	 *            simulation. Requires: samples : number of samples, ]0,
	 *            2147483647] confidence : Confidence for reachability, ]0, 1[
	 *            pathlength : Maximum pathlength, ]0, 2147483647]
	 */
	public DTMCAnalyzeJob(final Resource model,
			final Map<String, Object> parameters) {
		super("DTMC Analyse");
		this.model = model;
		this.parameters = parameters;

		if (this.parameters.containsKey("prismRootPath")) {
			prismRootPath = this.parameters.get("prismRootPath") + "bin\\";
		}
		if (this.parameters.containsKey("verify")) {
			prismParameters = ""; // PRISM uses verify as default setting.
		}
		if (this.parameters.containsKey("simulation")) {
			prismParameters = " -sim -simmethod ci -simsamples "
					+ parameters.get("samples") + " -simconf "
					+ parameters.get("confidence") + " -simpathlen "
					+ parameters.get("pathlength");
		}

	}

	@Override
	protected IStatus run(final IProgressMonitor monitor) {
		if (model == null || model.getContents() == null
				|| model.getContents().size() == 0
				|| !(model.getContents().get(0) instanceof RootImpl)) {
			return Status.CANCEL_STATUS;
		}
		try {
			RootImpl root = (RootImpl) model.getContents().get(0);
			EList<State> states = root.getStates();
			ArrayList<State> endStates = new ArrayList<State>();

			for (State state : states) {
				if (state.isIsEnd())
					endStates.add(state);
			}

			monitor.beginTask("Analyse DTMC", endStates.size() + 4);

			PRISMGenerator generator = new PRISMGenerator();

			// 1. Generate pm-file from model and save it to a temporary file.
			File pmFile = File.createTempFile("dtmc_prism_pm", ".pm");

			System.out.println(generator.generatePM(model));

			FileOutputStream out = new FileOutputStream(
					pmFile.getAbsolutePath());
			out.write(generator.generatePM(model).toString().getBytes());
			out.close();

			monitor.worked(1);

			// 2. Generate pctl-file from model and save it to a temporary file.
			File pctlFile = File.createTempFile("dtmc_prism_pctl", ".pctl");

			System.out.println(generator.generatePCTL(model));

			out = new FileOutputStream(pctlFile.getAbsolutePath());
			out.write(generator.generatePCTL(model).toString().getBytes());
			out.close();
			monitor.worked(1);

			// 3. Generate result-file and set paths.
			File resultFile = File.createTempFile("dtmc_prism_result", ".txt");
			prismPMPath = pmFile.getAbsolutePath();
			prismPCTLPath = pctlFile.getAbsolutePath();
			prismResultPath = resultFile.getAbsolutePath();
			monitor.worked(1);

			// 4. Use CommandLineExecutor to execute PRISM.
			Reader r = new InputStreamReader(
					CommandLineExecutor.execCommandAndGetStream(prismRootPath,
							"prism \"" + prismPMPath + "\" \"" + prismPCTLPath
									+ "\" -exportresults \"" + prismResultPath
									+ "\"" + prismParameters));
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

			parseResultFile(prismResultPath);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return Status.OK_STATUS;
	}

	public void parseResultFile(String file) {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
