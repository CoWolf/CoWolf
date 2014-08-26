package de.uni_stuttgart.iste.cowolf.model.ctmc.export;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.model.ctmc.CTMC;
import de.uni_stuttgart.iste.cowolf.model.ctmc.Label;
import de.uni_stuttgart.iste.cowolf.model.ctmc.State;
import de.uni_stuttgart.iste.cowolf.model.ctmc.analyze.PRISMGenerator;

public class CTMCExportPRISMJob extends Job {

	private Map<Resource, File> mappingCSL = new HashMap<Resource, File> ();
	private Map<Resource, File> mappingSM = new HashMap<Resource, File> ();

	/**
	 * Used to export a PRISM model from CTMC. As this might take some time for
	 * large models, a job is created to run as a thread. The CTMC resource is
	 * transfered into a PRISM-readable format and saved to a specified path.
	 * run.
	 * @param mappingSM Defines resources and export file for PRISM model
	 * @param mappingCSL Defines resources and export file for CSL
	 */
	public CTMCExportPRISMJob(Map<Resource, File> mappingSM, Map<Resource, File> mappingCSL) {
		super("CTMC Export PRISM model");
		this.mappingCSL = mappingCSL;
		this.mappingSM = mappingSM;
	}

	@Override
	protected IStatus run(final IProgressMonitor monitor) {
		monitor.beginTask("Export ctmc's as prism model", this.mappingSM.size() + this.mappingCSL.size());
		System.out.println("Export prism model");
		// For each selected item
		HashSet<Resource> resources = new HashSet<Resource>();
		resources.addAll(this.mappingCSL.keySet());
		resources.addAll(this.mappingSM.keySet());
		Resource[] resArray = resources.toArray(new Resource[0]); 
		PRISMGenerator generator = new PRISMGenerator();

		//Export SM
		monitor.setTaskName("Exporting PRISM model files");
		if (this.mappingSM != null) {
			for (Resource res : resArray) {
				try {
					File output = null;
					if (!this.mappingSM.containsKey(res)) {
						continue;
					}
					output = this.mappingSM.get(res);
					monitor.subTask("Exporting: " + output.getAbsolutePath());
					FileOutputStream out = new FileOutputStream(output);
					out.write(generator.generateSM(res).toString().getBytes());
					out.close();
					monitor.worked(1);
				} catch(SecurityException | IOException e) {
					e.printStackTrace();
				}
			}
		}

		//Export CSL
		monitor.setTaskName("Exporting CSL files");
		if (this.mappingCSL != null) {
			for (Resource res : resArray) {
				try {
					File output = null;
					if (!this.mappingCSL.containsKey(res)) {
						continue;
					}
					output = this.mappingCSL.get(res);
					monitor.subTask("Exporting: " + output.getAbsolutePath());
					FileOutputStream out = new FileOutputStream(output);
					out.write(generator.generateCSL(res, this.getStates(res), this.getLabels(res), true).toString().getBytes());
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
	
	private Set<State> getStates(Resource res) {
		HashSet<State> states = new HashSet<State>();
		EList<State> list = ((CTMC) res.getContents().get(0)).getStates();
		for (State state : list) {
			states.add(state);
		}
		return states;
	}

	/**
	 * Returns all labelnames for the given model.
	 * @param resource Resource to get labels for.
	 * @return Names of labels, empty if none can found.
	 */
	private Set<String> getLabels(Resource resource) {
		HashSet<String> labelNames = new HashSet<String>();
		for (State s : ((CTMC) resource.getContents().get(0)).getStates()) {
			for (Label l : s.getLabels()) {
				labelNames.add(l.getName());
			}
		}
		return labelNames;
	}
}
