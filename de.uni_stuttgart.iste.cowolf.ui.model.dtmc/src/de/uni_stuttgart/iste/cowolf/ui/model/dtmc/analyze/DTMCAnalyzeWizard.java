package de.uni_stuttgart.iste.cowolf.ui.model.dtmc.analyze;

import java.util.HashMap;

import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.model.IQoSModelManager;
import de.uni_stuttgart.iste.cowolf.ui.model.AbstractQoSAnalyzeWizard;

public class DTMCAnalyzeWizard extends AbstractQoSAnalyzeWizard {

	protected AnalyzeWizardPage1 pageOne;

	public DTMCAnalyzeWizard() {
		super();
	}

	@Override
	public void initialize(final IQoSModelManager manager, final Resource resource, final HashMap<String, Object> properties) {
		super.setWindowTitle("Analyze DTMC");
		this.pageOne = new AnalyzeWizardPage1("Page 1");
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
	}

	@Override
	public boolean isManaged(final IQoSModelManager manager) {
		return true;
	}
}
