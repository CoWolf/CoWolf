package de.uni_stuttgart.iste.cowolf.ui.model.ctmc.analyze;

import java.io.File;
import java.util.HashMap;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.uni_stuttgart.iste.cowolf.model.AbstractQoSModelManager;
import de.uni_stuttgart.iste.cowolf.model.ctmc.CTMCModelManager;
import de.uni_stuttgart.iste.cowolf.ui.model.analyze.AbstractQoSAnalyzeWizard;
import de.uni_stuttgart.iste.cowolf.ui.model.ctmc.preference.CTMCPreferencePage;

public class CTMCAnalyzeWizard extends AbstractQoSAnalyzeWizard {

	protected AnalyzeWizardPage1 pageOne;
	File clsFile;

	public CTMCAnalyzeWizard() {
		super();
	}

	@Override
	public void initialize(final AbstractQoSModelManager manager,
			final Resource resource, final HashMap<String, Object> properties) {
		super.setWindowTitle("Analyze CTMC with PRISM model checker");
		super.initialize(manager, resource, properties);

		
		this.pageOne = new AnalyzeWizardPage1("", resource);
	}

	@Override
	public boolean performFinish() {
		this.pageOne.setProperties(this.properties);
		this.properties.put("prismRootPath", CTMCPreferencePage.getPrismPath());

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
		return manager instanceof CTMCModelManager;
	}

	@Override
	public boolean canFinish() {
		return super.canFinish();
	}

	@Override
	public boolean checkConditions() {
		String path = CTMCPreferencePage.getPrismPath().trim();
		if (path.isEmpty() || path.equals("")) {
			IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			MessageDialog.openError(window.getShell(), "Path to PRISM not set",
					"The path to PRISM is missing.\nPlease set the path in your preferences first.");
			
			return false;
		}
		if (resource != null && resource.getContents() != null
				&& resource.getContents().get(0) != null) {
			Diagnostic diag = Diagnostician.INSTANCE.validate(this.resource
					.getContents().get(0));
			if (diag.getChildren().size() > 0) {
				IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
				MessageDialog.openError(window.getShell(), "Errors in CTMC model",
						"Errors in CTMC were found, please correct them first.\nRun Validation or enable Live Validation to display them.");
				
				return false;
			}
		} else {
			return false;
		}

		return true;
	}
}
