package de.uni_stuttgart.iste.cowolf.model.dtmc.export;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.uni_stuttgart.iste.cowolf.model.dtmc.DTMC;
import de.uni_stuttgart.iste.cowolf.model.dtmc.Label;
import de.uni_stuttgart.iste.cowolf.model.dtmc.State;
import de.uni_stuttgart.iste.cowolf.model.dtmc.analyze.PRISMGenerator;

public class DTMCExportPRISMJob extends Job {
	
	private final static Logger LOGGER = LoggerFactory
			.getLogger(DTMCExportPRISMJob.class);
	
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
		LOGGER.info("Export prism model");
		// For each selected item
		HashSet<Resource> resources = new HashSet<Resource>();
		resources.addAll(this.mappingPCTL.keySet());
		resources.addAll(this.mappingPM.keySet());
		Resource[] resArray = resources.toArray(new Resource[0]); 
		PRISMGenerator generator = new PRISMGenerator();

		//Export PM
		monitor.setTaskName("Exporting PRISM model files");
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
					LOGGER.error("", e); 
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
					out.write(generator.generatePCTL(res, this.getStates(res), this.getLabels(res)).toString().getBytes());
					out.close();
					monitor.worked(1);
				} catch(SecurityException | IOException e) {
					LOGGER.error("", e); 
				}
			}
		}
		monitor.done();

		return Status.OK_STATUS;
	}
	
	private Set<State> getStates(Resource res) {
		HashSet<State> states = new HashSet<State>();
		EList<State> list = ((DTMC) res.getContents().get(0)).getStates();
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
		for (State s : ((DTMC) resource.getContents().get(0)).getStates()) {
			for (Label l : s.getLabels()) {
				labelNames.add(l.getName());
			}
		}
		return labelNames;
	}
}
