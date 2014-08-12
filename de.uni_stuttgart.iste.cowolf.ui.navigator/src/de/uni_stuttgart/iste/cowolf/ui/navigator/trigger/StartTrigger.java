package de.uni_stuttgart.iste.cowolf.ui.navigator.trigger;

import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchListener;
import org.eclipse.ui.PlatformUI;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociationManager.ModelAssociationManager;

/**
 * This trigger is executed at the very start of eclipse. You can add necessary
 * listeners here.
 *
 */
public class StartTrigger implements IStartup {

	private IWorkbenchListener workbenchListener;

	@Override
	public void earlyStartup() {

		// listener for end of eclipse
		addWorkbenchListener();

		// load properties
		ModelAssociationManager.getInstance().loadAll();

	}

	/**
	 * Adds a workbench listener which saves the properties at the end of
	 * eclipse
	 */
	private void addWorkbenchListener() {
		if (workbenchListener == null) {
			workbenchListener = new IWorkbenchListener() {
				/*
				 * (non-Javadoc)
				 * 
				 * @see
				 * org.eclipse.ui.IWorkbenchListener#preShutdown(org.eclipse
				 * .ui.IWorkbench, boolean)
				 */
				@Override
				public boolean preShutdown(IWorkbench workbench, boolean forced) {
					ModelAssociationManager.getInstance().saveAll();
					return true;
				}

				/*
				 * (non-Javadoc)
				 * 
				 * @see
				 * org.eclipse.ui.IWorkbenchListener#postShutdown(org.eclipse
				 * .ui.IWorkbench)
				 */
				@Override
				public void postShutdown(IWorkbench workbench) {
				}

			};
			PlatformUI.getWorkbench().addWorkbenchListener(workbenchListener);
		}
	}

}
