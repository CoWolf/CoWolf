package de.uni_stuttgart.iste.cowolf.ui.model.dtmc.analyze;

import java.util.HashMap;

import javax.swing.JOptionPane;

import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.model.IQoSModelManager;
import de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCModelManager;
import de.uni_stuttgart.iste.cowolf.ui.model.AbstractQoSAnalyzeWizard;
import de.uni_stuttgart.iste.cowolf.ui.model.dtmc.preference.DTMCPreferencePage;

public class DTMCAnalyzeWizard extends AbstractQoSAnalyzeWizard {

	protected AnalyzeWizardPage1 pageOne;

	public DTMCAnalyzeWizard() {
		super();
	}

	@Override
	public void initialize(final IQoSModelManager manager, final Resource resource, final HashMap<String, Object> properties) {
		super.setWindowTitle("Analyze DTMC");
		super.initialize(manager, resource, properties);
		this.pageOne = new AnalyzeWizardPage1("Page 1");
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
	public boolean isManaged(final IQoSModelManager manager) {
		return manager instanceof DTMCModelManager;
	}

	@Override
	public boolean canFinish() {
		return super.canFinish();
	}

	@Override
	public boolean checkConditions() {
		String path = DTMCPreferencePage.getPrismPath().trim();
		if (path.isEmpty() || path.equals("")) {
			JOptionPane.showMessageDialog(null, "Path to PRISM is missing, please add in the preferences!");
			return false;
		}
		return true;
	}
}
