package de.uni_stuttgart.iste.cowolf.model.ctmc.export;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;

import de.uni_stuttgart.iste.cowolf.model.ctmc.analyze.PRISMGenerator;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Comment;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Fragment;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Rule;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Start;

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
					
					List<Object[]> tableData = loadPCTL(res);
					
					ArrayList<String> properties = new ArrayList<>();
					ArrayList<String> propertyNames = new ArrayList<>();
					for (Object[] data : tableData) {
						if (data[1] != null && data[1] instanceof Comment) {
							propertyNames.add(((Comment) data[1]).getComment().replaceFirst("^/+\\s*", ""));
						} else {
							propertyNames.add("");
						}
						if (data[2] != null && data[2] instanceof Rule) {
							properties.add(NodeModelUtils.findActualNodeFor((Rule) data[2]).getText().trim());
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
	
	private List<Object[]> loadPCTL(Resource resource) {
		IFile modelfile = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path(resource.getURI().toPlatformString(true)));

		IFile resultfile = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(modelfile.getFullPath().addFileExtension("pctl"));

		File clsFile = new File(resultfile.getLocationURI());

		ResourceSet resSet = new ResourceSetImpl();
		
		XtextResource pctlRes = (XtextResource) resSet.getResource(URI.createPlatformResourceURI(resultfile.getFullPath().toString(), false), true);
		
		List<Object[]> tableData = new LinkedList<>();
		
		if (clsFile.exists()) {
			
			try {
				pctlRes.load(Collections.EMPTY_MAP);
			} catch (IOException e) {
				System.out.println("Could not load pctl file.");
				return tableData;
			}
			
			if (pctlRes.getContents().size() == 0 || !(pctlRes.getContents().get(0) instanceof Start)) {
				return tableData;
			}
			
			Iterator<Fragment> it = ((Start)pctlRes.getContents().get(0)).getRule().iterator();

			Comment comment = null;
			while (it.hasNext()) {
				Fragment current = it.next();
				if (current instanceof Comment) {
					comment = (Comment) current;
				} else if (current instanceof Rule) {
					tableData.add(new Object[] {null, comment, (Rule) current});
					comment = null;
				}
			}
		}
		
		return tableData;
	}
}
