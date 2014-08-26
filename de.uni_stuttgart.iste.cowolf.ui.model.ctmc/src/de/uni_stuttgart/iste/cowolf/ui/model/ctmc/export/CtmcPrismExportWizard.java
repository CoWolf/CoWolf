package de.uni_stuttgart.iste.cowolf.ui.model.ctmc.export;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;

import de.uni_stuttgart.iste.cowolf.model.ctmc.export.CTMCExportPRISMJob;
import de.uni_stuttgart.iste.cowolf.ui.model.ctmc.Activator;

public class CtmcPrismExportWizard extends Wizard implements IExportWizard {

	/**
	 * Creates a Wizarz, which executes the export of ctmc models to PRISM models.
	 */
	public CtmcPrismExportWizard() {
		super();
		IDialogSettings pluginSettings =  Activator.getDefault().getDialogSettings();
		if (pluginSettings.getSection("CtmcToPrismExportDialog") == null) {
			this.settings = pluginSettings.addNewSection("DCtmcToPrismExportDialog");
		} else {
			this.settings = pluginSettings.getSection("CtmcToPrismExportDialog");
		}
	}

	private CtmcPrismExportPage1 page1;

	private final IDialogSettings settings;
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		new HashMap<String,Object> ();
		page1 = new CtmcPrismExportPage1("CTMC export PRISM model", selection, this.settings);
	}
	
	private boolean isValidModel(IFile iFile) {
		try {
			URI uri = URI.createPlatformResourceURI(iFile.getFullPath().toString(), true);
			ResourceSet resSet = new ResourceSetImpl();
			Resource res = resSet.getResource(uri, true);
			if (res != null && res.getContents() != null && res.getContents().get(0) != null) {
				Diagnostic diag = Diagnostician.INSTANCE.validate(res.getContents().get(0));
				if (diag.getChildren().size() > 0) {
					return false;
				}
			} else {
				return false;
			}
		} catch(RuntimeException e) {
			return false;
		}
		return true;
	}
	
	@Override
	public boolean performFinish() {
		String outputPath = this.page1.getOutputPath();
		List<IFile> files = this.page1.getSelectedFiles();

		HashMap<Resource, File> mappingSM = new HashMap<Resource, File>();
		HashMap<Resource, File> mappingCSL = new HashMap<Resource, File>();

		fileloop: for(final IFile iFile : files) {
			try {
				if (!isValidModel(iFile)) {
					MessageDialog.openInformation(null, "Skipped Export", "Skipped Export of invalid model: " + iFile.getFullPath().toOSString());
					continue fileloop;
				}
				final String pathSM;
				final String pathCSL;
				if (this.page1.getUseProjectStructure()) {
					String projectStructure = iFile.getFullPath().removeLastSegments(1).toOSString();
					pathSM = outputPath + projectStructure + File.separator + iFile.getName().substring(0, iFile.getName().length() - iFile.getFileExtension().length()) + "prism";
					pathCSL = outputPath + projectStructure + File.separator + iFile.getName().substring(0, iFile.getName().length() - iFile.getFileExtension().length()) + "props";
				} else {
					pathSM = outputPath + File.separator + iFile.getName().substring(0, iFile.getName().length() - iFile.getFileExtension().length()) + "prism";
					pathCSL = outputPath + File.separator + iFile.getName().substring(0, iFile.getName().length() - iFile.getFileExtension().length()) + "props";
				}
				System.out.println("Path for sm: " + pathSM);
				System.out.println("Path for csl: " + pathCSL);
				// Generate new file and folders
				File smFile = new File(pathSM);
				File cslFile = new File(pathCSL);
				if (smFile.exists() && !this.page1.getOverwritePermission()) {

					int result = this.requestOverwrite(pathSM);
					switch(result) {
					case 0: 
						//yes
						System.out.println("User allowed to delete the file: " + pathSM);
						break;
					case 1:
						//no
						System.out.println("User didn't allowed to delete the file: " + pathSM);
						continue fileloop;
					case 2:
						//cancel
						System.out.println("User canceled the export");
						return true;
					}
					if (!smFile.delete()) {
						System.out.println("Can't delete file: " + pathCSL);
						continue fileloop;
					}
				}
				if (cslFile.exists() && !this.page1.getOverwritePermission()) {
					int result = this.requestOverwrite(pathCSL);
					switch(result) {
					case 0: 
						//yes
						System.out.println("User allowed to delete the file: " + pathCSL);
						break;
					case 1:
						//no
						System.out.println("User didn't allowed to delete the file: " + pathCSL);
						continue fileloop;
					case 2:
						//cancel
						System.out.println("User canceled the export");
						return true;
					}
					if (!cslFile.delete()) {
						System.out.println("Can't delete file: " + pathCSL);
						continue fileloop;
					}
				}
				

				if (smFile.getParent() != null) {
					smFile.getParentFile().mkdirs();
				}
				if (cslFile.getParent() != null) {
					cslFile.getParentFile().mkdirs();
				}
				smFile.createNewFile();
				if (this.page1.isExportCslEnabled()) {
					cslFile.createNewFile();					
				}


				URI uri = URI.createPlatformResourceURI(iFile.getFullPath().toString(), true);
				ResourceSet resSet = new ResourceSetImpl();
				Resource resource = resSet.getResource(uri, true);

				mappingSM.put(resource, smFile);
				mappingCSL.put(resource, cslFile);
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (NullPointerException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// Start export of prism models
		CTMCExportPRISMJob job = new CTMCExportPRISMJob(mappingSM, mappingCSL);
		job.schedule();
		this.page1.saveSettings();
		return true;
	}

	/**
	 * Asks the user, if the specified path can be overwritten.
	 * @param path path to the file to overwrite.
	 * @return 0 if the overwrite is granted,
	 * 		   1 if overwrite for this file is not granted
	 * 		   2 if the process should cancel.
	 */
	private int requestOverwrite(String path) {
		MessageDialog dg = new MessageDialog(
				null,
				"Confirm File Replace",
				null,
				"Would you like to replace the existing file " + path + " ?",
				MessageDialog.QUESTION_WITH_CANCEL, 
				new String[]{
						IDialogConstants.YES_LABEL, 
						IDialogConstants.NO_LABEL, 
						IDialogConstants.CANCEL_LABEL},
						0
				);
		return dg.open();
	}

	@Override
	public void addPages() {
		super.addPages();
		this.addPage(page1);
	}
}
