package de.uni_stuttgart.iste.cowolf.ui.model.lqn.analyze;

import java.util.HashMap;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.uni_stuttgart.iste.cowolf.model.AbstractQoSModelManager;
import de.uni_stuttgart.iste.cowolf.model.lqn.LQNModelManager;
import de.uni_stuttgart.iste.cowolf.ui.model.analyze.AbstractQoSAnalyzeWizard;
import de.uni_stuttgart.iste.cowolf.ui.model.lqn.preferences.LQNPreferencePage;

/**
 * This is a sample new wizard. Its role is to create a new file 
 * resource in the provided container. If the container resource
 * (a folder or a project) is selected in the workspace 
 * when the wizard is opened, it will accept it as the target
 * container. The wizard creates one file with the extension
 * "mpe". If a sample multi-page editor (also available
 * as a template) is registered for the same extension, it will
 * be able to open it.
 */

public class LQNAnalyzeWizard extends AbstractQoSAnalyzeWizard{
	private LQNAnalyzeWizardPage1 pageOne;

	/**
	 * Constructor for LQNAnalyzeWizard.
	 */
	public LQNAnalyzeWizard() {
		super();
	}
	
	@Override
	public void initialize(final AbstractQoSModelManager manager,
			final Resource resource, final HashMap<String, Object> properties) {
		super.setWindowTitle("Analyze LQN Model with LQN Solver");
		super.initialize(manager, resource, properties);
		pageOne = new LQNAnalyzeWizardPage1("LQN Analysis Type");
	}

	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		addPage(pageOne);
	}

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	public boolean performFinish() {
		this.pageOne.setProperties(this.properties);
		properties.put(LQNModelManager.PARAM_PATH_TO_LQN_SOLVER, LQNPreferencePage.getPathToLQNSolver());
		return true;
	}
	
	@Override
	public boolean isManaged(AbstractQoSModelManager manager) {
		return manager instanceof LQNModelManager;
	}

	@Override
	public boolean checkConditions() {
		String path = LQNPreferencePage.getPathToLQNSolver().trim();
		if (path.isEmpty() || path.equals("")) {
			IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			MessageDialog.openError(window.getShell(), "Path to LQNSolver not set",
					"The path to LQN Solver is missing.\nPlease set the path in your preferences first.");
			return false;
		}
		if (resource != null && resource.getContents() != null && resource.getContents().get(0) != null) {
			Diagnostic diag = Diagnostician.INSTANCE.validate(this.resource.getContents().get(0));
			if (diag.getChildren().size() > 0) {
				IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
				MessageDialog.openError(window.getShell(), "Errors in LQN model",
						"Errors in LQN were found, please correct them first.\nRun Validation or enable Live Validation to display them.");
				return false;
			}
		} else {
			return false;
		}
	
		return true;
	}
}