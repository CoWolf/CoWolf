package de.uni_stuttgart.iste.cowolf.ui.model.dtmc.analyze;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.wizard.Wizard;

import de.uni_stuttgart.iste.cowolf.model.IQoSModelManager;

public class AnalyzeWizard extends Wizard {

	public AnalyzeWizard(final IQoSModelManager manager, final EPackage model) {
		super();
		super.setWindowTitle("Analyse DTMC");
	}

	@Override
	public boolean performFinish() {

		return false;
	}

	@Override
	public String getWindowTitle() {
		return super.getWindowTitle();
	}

}
