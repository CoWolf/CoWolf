package de.uni_stuttgart.iste.cowolf.ui.model.fault_tree.analyze;

import java.util.HashMap;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.uni_stuttgart.iste.cowolf.model.AbstractQoSModelManager;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreeModelManager;
import de.uni_stuttgart.iste.cowolf.ui.model.analyze.AbstractQoSAnalyzeWizard;
import de.uni_stuttgart.iste.cowolf.ui.model.fault_tree.preferences.FaultTreePreferencePage;

public class FaultTreeAnalyzeWizard extends AbstractQoSAnalyzeWizard {

	protected FaultTreeAnalyzeWizardPage1 pageOne;
	
	private static final String VALIDATE_PATH_ERROR_TITLE = "Path to xFTA not set";
	private static final String VALIDATE_PATH_ERROR_MESSAGE = "The path to xFTA is missing.\nPlease set the path in your preferences first.";

	private static final String VALIDATE_MODEL_ERROR_TITLE = "Errors in Fault Tree model";
	private static final String VALIDATE_MODEL_ERROR_MESSAGE = "Errors in Fault Tree were found, please correct them first.\nRun Validation or enable Live Validation to display them.";

	public FaultTreeAnalyzeWizard() {
		super();
	}

	@Override
	public void initialize(final AbstractQoSModelManager manager,
			final Resource resource, final HashMap<String, Object> properties) {
		super.setWindowTitle("Analyze Fault Tree with xFTA");
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
		return checkXftaPath() & checkValidModel();
	}
	
	private boolean checkXftaPath(){
		String path = FaultTreePreferencePage.getPathToXFTA().trim();
		if (path.isEmpty() || path.equals("")) {
			IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			   MessageDialog.openError(window.getShell(), VALIDATE_PATH_ERROR_TITLE,VALIDATE_PATH_ERROR_MESSAGE);
			return false;
		}
		return true;
	}
	
	private boolean checkValidModel(){
		if (resource != null && resource.getContents() != null
				&& resource.getContents().get(0) != null) {
			Diagnostic diag = Diagnostician.INSTANCE.validate(this.resource
					.getContents().get(0));
			if (diag.getChildren().size() > 0) {
				IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
				MessageDialog.openError(window.getShell(), VALIDATE_MODEL_ERROR_TITLE, VALIDATE_MODEL_ERROR_MESSAGE);
				return false;
			}
			else {
				return true;
			}
		}
		else {
			return false;
		}
	}
}
