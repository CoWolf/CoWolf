package de.uni_stuttgart.iste.cowolf.ui.model.dtmc.export;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.uni_stuttgart.iste.cowolf.model.dtmc.export.DTMCExportPRISMJob;
import de.uni_stuttgart.iste.cowolf.ui.model.dtmc.Activator;

public class DtmcPrismExportWizard extends Wizard implements IExportWizard {

	private final static Logger LOGGER = LoggerFactory
			.getLogger(DtmcPrismExportWizard.class);
	
	/**
	 * Creates a Wizarz, which executes the export of dtmc models to PRISM models.
	 */
	public DtmcPrismExportWizard() {
		super();
		IDialogSettings pluginSettings =  Activator.getDefault().getDialogSettings();
		if (pluginSettings.getSection("DtmcToPrismExportDialog") == null) {
			this.settings = pluginSettings.addNewSection("DtmcToPrismExportDialog");
		} else {
			this.settings = pluginSettings.getSection("DtmcToPrismExportDialog");
		}
	}

	private DtmcPrismExportPage1 page1;

	private final IDialogSettings settings;
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		new HashMap<String,Object> ();
		page1 = new DtmcPrismExportPage1("DTMC export PRISM model", selection, this.settings);
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

		HashMap<Resource, File> mappingPM = new HashMap<Resource, File>();
		HashMap<Resource, File> mappingPCTL = new HashMap<Resource, File>();

		fileloop: for(final IFile iFile : files) {
			try {
				if (!isValidModel(iFile)) {
					MessageDialog.openInformation(null, "Skipped Export", "Skipped Export of invalid model: " + iFile.getFullPath().toOSString());
					continue fileloop;
				}
				final String pathPM;
				final String pathPCTL;
				if (this.page1.getUseProjectStructure()) {
					String projectStructure = iFile.getFullPath().removeLastSegments(1).toOSString();
					pathPM = outputPath + projectStructure + File.separator + iFile.getName().substring(0, iFile.getName().length() - iFile.getFileExtension().length()) + "prism";
					pathPCTL = outputPath + projectStructure + File.separator + iFile.getName().substring(0, iFile.getName().length() - iFile.getFileExtension().length()) + "props";
				} else {
					pathPM = outputPath + File.separator + iFile.getName().substring(0, iFile.getName().length() - iFile.getFileExtension().length()) + "prism";
					pathPCTL = outputPath + File.separator + iFile.getName().substring(0, iFile.getName().length() - iFile.getFileExtension().length()) + "props";
				}
				LOGGER.debug("Path for pm: {}", pathPM);
				LOGGER.debug("Path for pctl: {}", pathPCTL);
				// Generate new file and folders
				File pmFile = new File(pathPM);
				File pctlFile = new File(pathPCTL);
				if (pmFile.exists() && !this.page1.getOverwritePermission()) {

					int result = this.requestOverwrite(pathPM);
					switch(result) {
					case 0: 
						//yes
						LOGGER.debug("User allowed to delete the file: {}", pathPM);
						break;
					case 1:
						//no
						LOGGER.debug("User didn't allowed to delete the file: {}", pathPM);
						continue fileloop;
					case 2:
						//cancel
						LOGGER.debug("User canceled the export.");
						return true;
					}
					if (!pmFile.delete()) {
						LOGGER.warn("Can't delete file: {}", pathPCTL);
						continue fileloop;
					}
				}
				if (pctlFile.exists() && !this.page1.getOverwritePermission()) {
					int result = this.requestOverwrite(pathPCTL);
					switch(result) {
					case 0: 
						//yes
						LOGGER.debug("User allowed to delete the file: {}", pathPCTL);
						break;
					case 1:
						//no
						LOGGER.debug("User didn't allowed to delete the file: {}", pathPCTL);
						continue fileloop;
					case 2:
						//cancel
						LOGGER.debug("User canceled the export.");
						return true;
					}
					if (!pctlFile.delete()) {
						LOGGER.warn("Can't delete file: {}", pathPCTL);
						continue fileloop;
					}
				}
				

				if (pmFile.getParent() != null) {
					pmFile.getParentFile().mkdirs();
				}
				if (pctlFile.getParent() != null) {
					pctlFile.getParentFile().mkdirs();
				}
				pmFile.createNewFile();
				if (this.page1.isExportPctlEnabled()) {
					pctlFile.createNewFile();					
				}


				URI uri = URI.createPlatformResourceURI(iFile.getFullPath().toString(), true);
				ResourceSet resSet = new ResourceSetImpl();
				Resource resource = resSet.getResource(uri, true);

				mappingPM.put(resource, pmFile);
				mappingPCTL.put(resource, pctlFile);
			} catch (SecurityException e) {
				LOGGER.error("", e);
			} catch (NullPointerException e) {
				LOGGER.error("", e);
			} catch (IOException e) {
				LOGGER.error("", e);
			}
		}

		// Start export of prism models
		DTMCExportPRISMJob job = new DTMCExportPRISMJob(mappingPM, mappingPCTL);
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
