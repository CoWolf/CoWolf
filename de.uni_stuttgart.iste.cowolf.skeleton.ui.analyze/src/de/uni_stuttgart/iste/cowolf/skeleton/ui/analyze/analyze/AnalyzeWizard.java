package de.uni_stuttgart.iste.cowolf.skeleton.ui.analyze.analyze;

import java.util.HashMap;

import org.eclipse.emf.ecore.resource.Resource;
import de.uni_stuttgart.iste.cowolf.model.AbstractQoSModelManager;
import de.uni_stuttgart.iste.cowolf.ui.model.analyze.AbstractQoSAnalyzeWizard;

public class AnalyzeWizard extends AbstractQoSAnalyzeWizard {

	protected MyWizardPage pageOne;

	public AnalyzeWizard() {
		super();
	}

	@Override
	public void initialize(final AbstractQoSModelManager manager,
			final Resource resource, final HashMap<String, Object> properties) {
		super.setWindowTitle("name");
		super.initialize(manager, resource, properties);
		this.pageOne = new MyWizardPage("name");
	}

	@Override
	public boolean performFinish() {
		this.pageOne.setProperties(this.properties);
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
		//TODO return if manager is matching
		return true;
	}

	@Override
	public boolean canFinish() {
		return super.canFinish();
	}

	@Override
	public boolean checkConditions() {
		//TODO return true, if all conditions for the start of the wizard are fulfilled
		return true;
	}
}
