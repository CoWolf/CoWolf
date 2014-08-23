package de.uni_stuttgart.iste.cowolf.model.dtmc.export;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.resource.Resource;
import de.uni_stuttgart.iste.cowolf.model.dtmc.analyze.PRISMGenerator;

public class DTMCExportPRISMJob extends Job {

	private Map<Resource, File> mappingPCTL = new HashMap<Resource, File> ();
	private Map<Resource, File> mappingPM = new HashMap<Resource, File> ();

	/**
	 * Used to export a PRISM model from DTMC. As this might take some time for
	 * large models, a job is created to run as a thread. The DTMC resource is
	 * transfered into a PRISM-readable format and saved to a specified path.
	 * run.
	 * @param mappingPM Defines resources and export file for PRISM model
	 * @param mappingPCTL Defines resources and export file for PCTL
	 */
	public DTMCExportPRISMJob(Map<Resource, File> mappingPM, Map<Resource, File> mappingPCTL) {
		super("DTMC Export PRISM model");
		this.mappingPCTL = mappingPCTL;
		this.mappingPM = mappingPM;
	}

	@Override
	protected IStatus run(final IProgressMonitor monitor) {
		monitor.beginTask("Export dtmc's as prism model", this.mappingPM.size() + this.mappingPCTL.size());
		System.out.println("Export prism model");
		// For each selected item
		HashSet<Resource> resources = new HashSet<Resource>();
		resources.addAll(this.mappingPCTL.keySet());
		resources.addAll(this.mappingPM.keySet());
		Resource[] resArray = resources.toArray(new Resource[0]); 
		PRISMGenerator generator = new PRISMGenerator();

		//Export PM
		monitor.setTaskName("Exporting PM files");
		if (this.mappingPM != null) {
			for (Resource res : resArray) {
				try {
					File output = null;
					if (!this.mappingPM.containsKey(res)) {
						continue;
					}
					output = this.mappingPM.get(res);
					monitor.subTask("Exporting: " + output.getAbsolutePath());
					FileOutputStream out = new FileOutputStream(output);
					out.write(generator.generatePM(res).toString().getBytes());
					out.close();
					monitor.worked(1);
				} catch(SecurityException | IOException e) {
					e.printStackTrace();
				}
			}
		}

		//Export PCTL
		monitor.setTaskName("Exporting PCTL files");
		if (this.mappingPCTL != null) {
			for (Resource res : resArray) {
				try {
					File output = null;
					if (!this.mappingPCTL.containsKey(res)) {
						continue;
					}
					output = this.mappingPCTL.get(res);
					monitor.subTask("Exporting: " + output.getAbsolutePath());
					FileOutputStream out = new FileOutputStream(output);
					out.write(generator.generatePCTL(res).toString().getBytes());
					out.close();
					monitor.worked(1);
				} catch(SecurityException | IOException e) {
					e.printStackTrace();
				}
			}
		}
		monitor.done();

		return Status.OK_STATUS;
	}
}
