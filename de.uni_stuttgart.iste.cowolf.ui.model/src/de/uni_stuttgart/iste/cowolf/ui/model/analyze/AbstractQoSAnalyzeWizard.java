package de.uni_stuttgart.iste.cowolf.ui.model.analyze;

import java.util.HashMap;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.wizard.Wizard;

import de.uni_stuttgart.iste.cowolf.model.AbstractQoSModelManager;

public abstract class AbstractQoSAnalyzeWizard extends Wizard {

	protected AbstractQoSModelManager manager;
	protected Resource resource;
	protected HashMap<String, Object> properties;

	public AbstractQoSAnalyzeWizard() {
		super();
	}

	public void initialize(final AbstractQoSModelManager manager, final Resource resource, final HashMap<String, Object> properties) {
		super.setWindowTitle("Analyse DTMC");
		this.setNeedsProgressMonitor(true);
		this.manager = manager;
		this.resource = resource;
		this.properties = properties;
	}

	public abstract boolean isManaged(final AbstractQoSModelManager manager);

	public abstract boolean checkConditions();
}
