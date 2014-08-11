package de.uni_stuttgart.iste.cowolf.ui.model.dtmc.analyze;

import java.util.HashMap;

import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.model.IQoSModelManager;
import de.uni_stuttgart.iste.cowolf.ui.model.AbstractQoSAnalyzeWizard;

public class DTMCAnalyzeWizard extends AbstractQoSAnalyzeWizard {

	protected AnalyzeWizardPage1 pageOne;
	protected AnalyzeWizardPage2 pageTwo;
	protected AnalyzeWizardPage3 pageThree;

	public DTMCAnalyzeWizard() {
		super();
	}

	@Override
	public void initialize(final IQoSModelManager manager, final Resource resource, final HashMap<String, Object> properties) {
		super.setWindowTitle("Analyze DTMC");
		this.pageOne = new AnalyzeWizardPage1("Page 1");
		this.pageTwo = new AnalyzeWizardPage2("Page 2");
		this.pageThree = new AnalyzeWizardPage3("Page 3");
	}

	@Override
	public boolean performFinish() {
		return true;
	}

	@Override
	public String getWindowTitle() {
		return super.getWindowTitle();
	}

	@Override
	public void addPages() {
		this.addPage(this.pageOne);
		this.addPage(this.pageTwo);
		this.addPage(this.pageThree);
	}

	@Override
	public boolean isManaged(final IQoSModelManager manager) {
		return true;
	}


}
