package de.uni_stuttgart.iste.cowolf.model.ctmc.export;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.resource.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.uni_stuttgart.iste.cowolf.model.ctmc.analyze.PRISMGenerator;

public class CTMCExportPRISMJob extends Job {

	private final static Logger LOGGER = LoggerFactory
			.getLogger(CTMCExportPRISMJob.class);
	
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
		LOGGER.info("Export prism model");
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
					LOGGER.error("", e);
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
					
					IFile modelfile = ResourcesPlugin.getWorkspace().getRoot()
							.getFile(new Path(res.getURI().toPlatformString(true)));

					IFile resultfile = ResourcesPlugin.getWorkspace().getRoot()
							.getFile(modelfile.getFullPath().addFileExtension("pctl"));

					File clsFile = new File(resultfile.getLocationURI());

					String data = "";
					if (clsFile.exists()) {
						try (BufferedReader reader = new BufferedReader(new FileReader(
								clsFile))) {

							String line = null;
							while ((line = reader.readLine()) != null) {
								data += line + "\n";
							}
						} catch (IOException x) {
							System.err.format("IOException: %s%n", x);
						}
					} else {
						try {
							clsFile.createNewFile();
						} catch (IOException e) {
							LOGGER.error("", e);
						}
					}
					
					ArrayList<String> properties = new ArrayList<String>();
					ArrayList<String> propertyNames = new ArrayList<String>();
					
					String[] tableData = data.split("//");
					for (String string : tableData) {
						if (!string.isEmpty()) {
							String[] tableSubData = string.split("\n", 2);
							if (tableSubData.length > 1) {
								propertyNames.add(tableSubData[0].trim());
								properties.add(tableSubData[1].trim());
							} else {
								propertyNames.add(tableSubData[0].trim());
							}
						}
					}
					
					monitor.subTask("Exporting: " + output.getAbsolutePath());
					FileOutputStream out = new FileOutputStream(output);
					out.write(generator.generateCSL(res, properties, propertyNames, true).toString().getBytes());
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
}
