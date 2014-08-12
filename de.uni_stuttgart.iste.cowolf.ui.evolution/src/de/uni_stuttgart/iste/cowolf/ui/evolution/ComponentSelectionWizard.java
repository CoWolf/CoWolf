package de.uni_stuttgart.iste.cowolf.ui.evolution;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.wizard.Wizard;

/**
 * This wizard allows the user to select the two models to use for
 * evolution.
 * @author Michael Müller
 */
public class ComponentSelectionWizard extends Wizard {

	/**
	 * First model to use for evolution.
	 */
	protected Resource modelA;
	/**
	 * Second model to use for evolution.
	 */
	protected Resource modelB;
	/**
	 * Wizard page displaying contents of wizard.
	 */
	ComponentSelectionWizardPage page;
	/**
	 * Class variable to determine whether first element is selected.
	 */
	private boolean isFirstElementSelected = true;
	
	public ComponentSelectionWizard(Resource modelA, Resource modelB) {
		this.setWindowTitle("Model Selection Wizard");
		this.modelA = modelA;
		this.modelB = modelB;
	}
	@Override
	public void addPages() {
		this.page = new ComponentSelectionWizardPage(this);
		this.addPage(this.page);
	}

	@Override
	public boolean performFinish() {
		this.isFirstElementSelected = this.page.isFirstModelSelected();
		return true;
	}
	
	/**
	 * 
	 * @return true if first element is selected.
	 */
	public boolean isFirstModelSelected() {
		return this.isFirstElementSelected;
	}
	
	
	
	


}
