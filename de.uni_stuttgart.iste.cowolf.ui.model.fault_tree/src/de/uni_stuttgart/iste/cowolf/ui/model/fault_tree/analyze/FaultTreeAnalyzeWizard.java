package de.uni_stuttgart.iste.cowolf.ui.model.fault_tree.analyze;

import java.util.HashMap;

import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.model.AbstractQoSModelManager;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreeModelManager;
import de.uni_stuttgart.iste.cowolf.ui.model.analyze.AbstractQoSAnalyzeWizard;
import de.uni_stuttgart.iste.cowolf.ui.model.fault_tree.preferences.FaultTreePreferencePage;

public class FaultTreeAnalyzeWizard extends AbstractQoSAnalyzeWizard {

	protected FaultTreeAnalyzeWizardPage1 pageOne;

	public FaultTreeAnalyzeWizard() {
		super();
	}

	@Override
	public void initialize(final AbstractQoSModelManager manager,
			final Resource resource, final HashMap<String, Object> properties) {
		super.setWindowTitle("Analyze Fault Tree");
		super.initialize(manager, resource, properties);
		this.pageOne = new FaultTreeAnalyzeWizardPage1("Page 1");
	}

	@Override
	public boolean performFinish() {
		this.pageOne.setProperties(this.properties);
		properties.put(FaultTreeModelManager.PARAM_PATH_TO_XFTA,
				FaultTreePreferencePage.getPathToXFTA());
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
	public boolean isManaged(final AbstractQoSModelManager manager) {
		return manager instanceof FaultTreeModelManager;
	}

	@Override
	public boolean canFinish() {
		return super.canFinish();
	}

	@Override
	public boolean checkConditions() {
		return true;
	}
}
