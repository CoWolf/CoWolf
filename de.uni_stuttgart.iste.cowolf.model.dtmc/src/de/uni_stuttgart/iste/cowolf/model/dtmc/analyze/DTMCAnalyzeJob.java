package de.uni_stuttgart.iste.cowolf.model.dtmc.analyze;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.resource.Resource;

public class DTMCAnalyzeJob extends Job {

	private final Resource model;
	private final Map<String, Object> parameters;

	public DTMCAnalyzeJob(final Resource model, final Map<String, Object> parameters) {
		super("DTMC Analyse");
		this.model = model;
		this.parameters = parameters;
	}

	@Override
	protected IStatus run(final IProgressMonitor monitor) {
		//TODO use parameters to do the job
		monitor.beginTask("Analyse DTMC", 1000);
		try {
			//TODO do analyse
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
