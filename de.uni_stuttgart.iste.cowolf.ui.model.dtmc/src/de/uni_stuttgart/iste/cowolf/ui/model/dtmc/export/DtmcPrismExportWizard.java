package de.uni_stuttgart.iste.cowolf.ui.model.dtmc.export;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;

public class DtmcPrismExportWizard extends Wizard implements IExportWizard {

	public DtmcPrismExportWizard() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		page1 = new DtmcPrismExportPage1("DTMC export PRISM model", workbench, selection);
	}

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return true;
	}
	
	DtmcPrismExportPage1 page1;
	
	@Override
	public void addPages() {
		// TODO Auto-generated method stub
		super.addPages();
		this.addPage(page1);
	}
}
