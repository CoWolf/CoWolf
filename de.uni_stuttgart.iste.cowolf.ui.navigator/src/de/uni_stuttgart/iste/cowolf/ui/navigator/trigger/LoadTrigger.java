package de.uni_stuttgart.iste.cowolf.ui.navigator.trigger;

import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchListener;
import org.eclipse.ui.PlatformUI;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociationManager.ModelAssociationManager;

public class LoadTrigger implements IStartup {

	private IWorkbenchListener workbenchListener;

	@Override
	public void earlyStartup() {

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
					return ModelAssociationManager.getInstance().saveAll();
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
		
		ModelAssociationManager.getInstance().loadAll();

	}

}
