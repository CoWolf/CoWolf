package de.uni_stuttgart.iste.cowolf.ui.model.dtmc.export;

import java.util.HashMap;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;

import de.uni_stuttgart.iste.cowolf.model.dtmc.export.DTMCExportPRISMJob;

public class DtmcPrismExportWizard extends Wizard implements IExportWizard {

	public DtmcPrismExportWizard() {
		// TODO Auto-generated constructor stub
		super();
	}

	private DtmcPrismExportPage1 page1;
	private HashMap<String,Object> properties;
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		properties = new HashMap<String,Object> ();
		page1 = new DtmcPrismExportPage1("DTMC export PRISM model", workbench, selection);
	}

	@Override
	public boolean performFinish() {
		page1.setProperties(properties);
		// Start export of prism models
		DTMCExportPRISMJob job = new DTMCExportPRISMJob(properties);
		job.schedule();
		return true;
	}
	
	@Override
	public void addPages() {
		// TODO Auto-generated method stub
		super.addPages();
		this.addPage(page1);
	}
}
