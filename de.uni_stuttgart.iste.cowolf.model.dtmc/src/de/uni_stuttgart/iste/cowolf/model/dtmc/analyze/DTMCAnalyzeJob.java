package de.uni_stuttgart.iste.cowolf.model.dtmc.analyze;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.resource.Resource;
import org.xtext.example.mydsl.generator.MyDslGenerator;

import de.uni_stuttgart.iste.cowolf.core.utilities.CommandLineExecutor;

public class DTMCAnalyzeJob extends Job {

	private final Resource model;
	private final Map<String, Object> parameters;

	private String prismRootPath = "C:\\Program Files (x86)\\prism-4.2.beta1\\bin\\";
	private String prismPMPath = "C:\\Program Files (x86)\\prism-4.2.beta1\\bin\\die.pm";
	private String prismPCTLPath = "C:\\Program Files (x86)\\prism-4.2.beta1\\bin\\die.pctl";
	private String prismResultPath = "C:\\Users\\David\\Desktop\\result.txt";

	public DTMCAnalyzeJob(final Resource model,
			final Map<String, Object> parameters) {
		super("DTMC Analyse");
		this.model = model;
		this.parameters = parameters;
		
//		this.prismRootPath = prismRootPath + "bin\\";
//		this.prismPMPath = prismPMPath;
//		this.prismPCTLPath = prismPCTLPath;
//		this.prismResultPath = prismResultPath;
	}

	@Override
	protected IStatus run(final IProgressMonitor monitor) {
		// TODO use parameters to do the job
		monitor.beginTask("Analyse DTMC", 1000);

		MyDslGenerator generator = new MyDslGenerator();
		System.out.println(generator.doGenerate(model));

		try {
			// 1. Generate file from model and save it to temporary file.
			File temp = File.createTempFile("dtmc_prism_file", ".pm");
			System.out.println("Temp file : " + temp.getAbsolutePath());

			FileOutputStream out = new FileOutputStream(temp.getAbsolutePath());
			out.write(generator.doGenerate(model).toString().getBytes("UTF-8"));
			out.close();

			// 2. Call CommandLineExecutor to evaluate.
			Reader r = new InputStreamReader(
					CommandLineExecutor.execCommandAndGetStream(prismRootPath,
							"prism \"" + prismPMPath + "\" \"" + prismPCTLPath
									+ "\" -exportresults \"" + prismResultPath
									+ "\""));
			BufferedReader in = new BufferedReader(r);
			while ((in.readLine()) != null) { /*
											 * Read output until process
											 * finished.
											 */
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			// TODO do analyse
			int i = 0;
			while (true) {
				i += 10;
				monitor.worked(10);
				Thread.sleep(2000);
				if (i == 1000) {
					break;
				}
			}
		} catch (final InterruptedException e) {
			e.printStackTrace();
		} finally {
			this.schedule(600); // start again in an
		}
		return Status.OK_STATUS;
	}
}
