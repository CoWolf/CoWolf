package de.uni_stuttgart.iste.cowolf.ui.model.dtmc.analyze;

import java.util.HashMap;

import javax.swing.JOptionPane;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;

import de.uni_stuttgart.iste.cowolf.model.AbstractQoSModelManager;
import de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCModelManager;
import de.uni_stuttgart.iste.cowolf.ui.model.analyze.AbstractQoSAnalyzeWizard;
import de.uni_stuttgart.iste.cowolf.ui.model.dtmc.preference.DTMCPreferencePage;

public class DTMCAnalyzeWizard extends AbstractQoSAnalyzeWizard {

	protected AnalyzeWizardPage1 pageOne;

	public DTMCAnalyzeWizard() {
		super();
	}

	@Override
	public void initialize(final AbstractQoSModelManager manager, final Resource resource, final HashMap<String, Object> properties) {
		super.setWindowTitle("Analyze DTMC");
		super.initialize(manager, resource, properties);
		this.pageOne = new AnalyzeWizardPage1("Page 1");
	}

	@Override
	public boolean performFinish() {
		this.pageOne.setProperties(this.properties);
		this.properties.put("prismRootPath", DTMCPreferencePage.getPrismPath());
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
			JOptionPane.showMessageDialog(null, "Path to PRISM is missing, please add in the preferences!", "Missing Path", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		if (super.resource != null && super.resource.getContents() != null && this.resource.getContents().get(0) != null) {
			Diagnostic diag = Diagnostician.INSTANCE.validate(this.resource.getContents().get(0));
			if (diag.getChildren().size() > 0) {
				JOptionPane.showMessageDialog(null,
						"Errors in DTMC were found, please run Validation or enable Live Validation to display them.",
						"Errors in DTMC", JOptionPane.ERROR_MESSAGE);	
				return false;
			}
		} else {
			return false;
		}
	
		return true;
	}
}
