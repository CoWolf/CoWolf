package de.uni_stuttgart.iste.cowolf.ui.model.dtmc.analyze;

import java.util.HashMap;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.uni_stuttgart.iste.cowolf.model.AbstractQoSModelManager;
import de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCModelManager;
import de.uni_stuttgart.iste.cowolf.ui.model.analyze.AbstractQoSAnalyzeWizard;
import de.uni_stuttgart.iste.cowolf.ui.model.dtmc.preference.DTMCPreferencePage;

public class DTMCAnalyzeWizard extends AbstractQoSAnalyzeWizard {

	protected AnalyzeWizardPage1 pageOne;
	private AnalyzeWizardPage2 pageTwo;

	public DTMCAnalyzeWizard() {
		super();
	}

	@Override
	public void initialize(final AbstractQoSModelManager manager, final Resource resource, final HashMap<String, Object> properties) {
		super.setWindowTitle("Analyze DTMC with PRISM model checker");
		super.initialize(manager, resource, properties);
		this.pageOne = new AnalyzeWizardPage1("Page 1");
		this.pageTwo = new AnalyzeWizardPage2("Page 2", this.resource);
	}

	@Override
	public boolean performFinish() {
		this.pageOne.setProperties(this.properties);
		this.pageTwo.setProperties(this.properties);
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
		this.addPage(this.pageTwo);
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
			IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			MessageDialog.openError(window.getShell(), "Path to PRISM not set",
					"The path to PRISM is missing.\nPlease set the path in your preferences first.");
			
			return false;
		}
		if (resource != null && resource.getContents() != null && resource.getContents().get(0) != null) {
			Diagnostic diag = Diagnostician.INSTANCE.validate(resource.getContents().get(0));
			if (diag.getChildren().size() > 0) {
				IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
				MessageDialog.openError(window.getShell(), "Errors in DTMC model",
						"Errors in DTMC were found, please correct them first.\nRun Validation or enable Live Validation to display them.");	
				return false;
			}
		} else {
			return false;
		}
	
		return true;
	}
}
