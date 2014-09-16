package de.uni_stuttgart.iste.cowolf.model.ctmc.analyze;

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
import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.core.utilities.CommandLineExecutor;
import de.uni_stuttgart.iste.cowolf.core.utilities.PrinterRegistry;
import de.uni_stuttgart.iste.cowolf.model.ctmc.CTMC;

public class CTMCAnalyzeJob extends Job {

	private final Resource model;
	private final Map<String, Object> parameters;

	private ArrayList<Result> prismResult;

	private String prismRootPath = "";
	private String prismSMPath = "";
	private String prismCSLPath = "";
	private String prismResultPath = "";
	private String prismParameters = "";
	ArrayList<String> analyzeProperties;
	ArrayList<String> analyzePropertyNames;

	/**
	 * Used to analyze a CTMC using PRISM. As this might take some time for
	 * large models, a job is created to run as a thread. The CTMC resource is
	 * transfered into a PRISM-readable format and saved to a temporary file.
	 * For every end-state that is defined in the CTMC, a evaluation will be
	 * run.
	 *
	 * @param model
	 *            The CTMC resource containing a Root node and
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
	public CTMCAnalyzeJob(final Resource model,
			final Map<String, Object> parameters) {
		super("CTMC Analyse");
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

	public ArrayList<Result> getAnalysis() {
		return this.prismResult;
	}

	@Override
	protected IStatus run(final IProgressMonitor monitor) {
		if (this.model == null || this.model.getContents() == null
				|| this.model.getContents().size() == 0
				|| !(this.model.getContents().get(0) instanceof CTMC)) {
			return Status.CANCEL_STATUS;
		}

		try {
			getAnalyzeProperties();

			this.prismResult = new ArrayList<CTMCAnalyzeJob.Result>();

			if (this.parameters.containsKey("verify")) {
				monitor.beginTask("Analyse CTMC", analyzeProperties.size() + 3);
			} else {
				monitor.beginTask("Analyse CTMC", analyzeProperties.size() + 3);
			}

			PRISMGenerator generator = new PRISMGenerator();

			// 1. Generate sm-file from model and save it to a temporary file.
			File smFile = File.createTempFile("ctmc_prism_sm", ".sm");

			System.out.println(generator.generateSM(this.model));

			FileOutputStream out = new FileOutputStream(
					smFile.getAbsolutePath());
			out.write(generator.generateSM(this.model).toString().getBytes());
			out.close();

			monitor.worked(1);

			// 2. Generate csl-file from model and save it to a temporary file.
			File cslFile = File.createTempFile("ctmc_prism_csl", ".csl");

			String csl = generator.generateCSL(this.model,
					this.analyzeProperties,
					this.parameters.containsKey("verify")).toString();

			System.out.println(csl);

			out = new FileOutputStream(cslFile.getAbsolutePath());
			out.write(csl.getBytes());
			out.close();
			monitor.worked(1);

			// 3. Generate result-file and set paths.
			File resultFile = File.createTempFile("ctmc_prism_result", ".txt");
			this.prismSMPath = smFile.getAbsolutePath();
			this.prismCSLPath = cslFile.getAbsolutePath();
			this.prismResultPath = resultFile.getAbsolutePath();
			monitor.worked(1);

			// 4. Use CommandLineExecutor to execute PRISM.
			Reader r = new InputStreamReader(
					CommandLineExecutor.execCommandAndGetOutput(
							this.prismRootPath, "prism " + this.prismSMPath
									+ " " + this.prismCSLPath
									+ " -exportresults " + this.prismResultPath
									+ this.prismParameters));
			BufferedReader in = new BufferedReader(r);
			String line;
		
			while ((line = in.readLine()) != null) {
				// Every time a PRISM test run finishes, a line of dashes is
				// printed. We look for them and increment the progress bar.
				PrinterRegistry.getInstance().println("CTMC Analysis", line
						);
				if (line.contains("-------------------------------------------------------------------")) {
					monitor.worked(1);
				}
			}
			PrinterRegistry.getInstance().close();
			in.close();
			monitor.done();

			this.parseResultFile(this.prismResultPath);

			smFile.delete();
			cslFile.delete();
			resultFile.delete();

			System.out.println("Results:");
			for (Result entry : this.prismResult) {
				System.out.println(entry.name + " => " + entry.value);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return Status.OK_STATUS;
	}

	@SuppressWarnings("unchecked")
	private void getAnalyzeProperties() {
		if (this.parameters.containsKey("analyzeProperties")
				&& this.parameters.get("analyzeProperties") instanceof ArrayList<?>
				&& this.parameters.containsKey("analyzePropertyNames")
				&& this.parameters.get("analyzePropertyNames") instanceof ArrayList<?>) {
			analyzeProperties = (ArrayList<String>) this.parameters
					.get("analyzeProperties");
			analyzePropertyNames = (ArrayList<String>) this.parameters
					.get("analyzePropertyNames");
		} else {
			analyzeProperties = new ArrayList<String>();
			analyzePropertyNames = new ArrayList<String>();
		}
	}

	protected void parseResultFile(final String file) {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			Boolean getNext = false;
			int counter = 0;
			while ((line = br.readLine()) != null) {
				if (getNext) {
					Result result = new Result();
					result.property = analyzeProperties.get(counter);
					result.name = analyzePropertyNames.get(counter);
					result.value = line;
					this.prismResult.add(result);
					getNext = false;
					counter++;
				}
				if (line.equals("Result")) {
					getNext = true;
				}
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	class Result {
		public String property;
		public String name;
		public String value;
	}
}
