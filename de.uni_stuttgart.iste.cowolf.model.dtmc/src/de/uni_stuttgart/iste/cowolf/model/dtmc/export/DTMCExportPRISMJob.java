package de.uni_stuttgart.iste.cowolf.model.dtmc.export;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.content.IContentTypeManager.ISelectionPolicy;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;

import de.uni_stuttgart.iste.cowolf.core.utilities.CommandLineExecutor;
import de.uni_stuttgart.iste.cowolf.model.dtmc.DTMC;
import de.uni_stuttgart.iste.cowolf.model.dtmc.State;
import de.uni_stuttgart.iste.cowolf.model.dtmc.analyze.PRISMGenerator;

public class DTMCExportPRISMJob extends Job {

	private final Map<String, Object> parameters;
	private String outputPath;
	private List<IFile> selection;
	private boolean overwrite_permission;
	private boolean use_project_structure;
	private boolean export_pctl;
	private boolean canRun = true;
	/**
	 * Used to export a PRISM model from DTMC. As this might take some time for
	 * large models, a job is created to run as a thread. The DTMC resource is
	 * transfered into a PRISM-readable format and saved to a specified path.
	 * run.
	 *
	 * @param parameters
	 *            output_path : String with path to a directory to generate the models.
	 *            selected_files : List of workspace paths as Strings to selected dtmc models. 
	 *            overwrite_permission : Boolean defines if window should not be shown when overwriting files. (Default: false)
	 *            use_project_structure : Boolean to define if folders should be created like in the project structure. (Default: true)
	 *      	  export_pctl : Boolean to define it pctl should be exported too.
	 */
	@SuppressWarnings("unchecked")
	public DTMCExportPRISMJob(final Map<String, Object> parameters) {
		super("DTMC Export PRISM model");
		this.parameters = parameters;
		if (this.parameters.containsKey("output_path")) {
			this.outputPath = (String) this.parameters.get("output_path");
		} else {
			this.canRun = false;
		}
		if (this.parameters.containsKey("selected_files")) {
			this.selection = (List<IFile>) this.parameters.get("selected_files");
		} else {
			this.canRun = false;
		}
		if (this.parameters.containsKey("overwrite_permission")) {
			this.overwrite_permission = (boolean) this.parameters.get("overwrite_permission");
		} else {
			this.canRun = false;
		}
		if (this.parameters.containsKey("use_project_structure")) {
			this.use_project_structure = (boolean) this.parameters.get("use_project_structure");
		} else {
			this.canRun = false;
		}
		if (this.parameters.containsKey("export_pctl")) {
			this.export_pctl = (boolean) this.parameters.get("export_pctl");
		} else {
			this.canRun = false;
		}

	}

	@Override
	protected IStatus run(final IProgressMonitor monitor) {
		if (!this.canRun) {
			return Status.CANCEL_STATUS;
		}
		monitor.beginTask("Export dtmc's as prism model", this.selection.size());
		System.out.println("Export prism model");
		// For each selected item
		fileloop: for(final IFile iFile : this.selection) {
			try {
				System.out.println("Path: " + outputPath + File.separator + iFile.getName().replace(iFile.getFileExtension(), "pm"));
				monitor.setTaskName("Exporting: " + outputPath + File.separator + iFile.getName().replace(iFile.getFileExtension(), "pm"));
				// Generate new file and folders
				File newFile = new File(outputPath + File.separator + iFile.getName().replace(iFile.getFileExtension(), "pm"));
				if (newFile.exists()) {
					final int[] vote = {1};
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							MessageDialog dg = new MessageDialog(
									null,
									"Confirm File Replace",
									null,
									"Would you like to replace the existing file " + iFile + " ?",
									MessageDialog.QUESTION_WITH_CANCEL, 
									new String[]{
											IDialogConstants.YES_LABEL, 
											IDialogConstants.NO_LABEL, 
											IDialogConstants.CANCEL_LABEL},
											0
									);
							if (!overwrite_permission) {
								vote[0] = dg.open();
							}

						}
					});
					switch(vote[0]) {
					case 0: 
						//yes
						System.out.println("User allowed to delete the file: " + iFile);
						break;
					case 1:
						//no
						System.out.println("User didn't allowed to delete the file: " + iFile);
						continue fileloop;
					case 2:
						//cancel
						System.out.println("User canceled the export");
						return Status.CANCEL_STATUS;
					}

					if (!newFile.delete()) {
						System.out.println("Can't delete file");
						continue fileloop;
					}
				}
				if (newFile.getParent() != null) {
					newFile.getParentFile().mkdirs();
				}
				newFile.createNewFile();

				// Export model
				PRISMGenerator generator = new PRISMGenerator();
				URI uri = URI.createPlatformResourceURI(iFile.getFullPath().toString(), true);
				ResourceSet resSet = new ResourceSetImpl();
				Resource resource = resSet.getResource(uri, true);

				FileOutputStream out = new FileOutputStream(
						newFile);
				out.write(generator.generatePM(resource).toString().getBytes());
				out.close();
				monitor.worked(1);

				// TODO export pctl
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (NullPointerException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		monitor.done();
		return Status.OK_STATUS;
	}
}
