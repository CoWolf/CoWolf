package de.uni_stuttgart.iste.cowolf.ui.navigator.actionprovider;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.eclipse.ui.navigator.ICommonMenuConstants;
import org.eclipse.ui.navigator.ICommonViewerWorkbenchSite;
import org.eclipse.ui.navigator.WizardActionGroup;

/**
 * This class creates a Export -> something menu in the popup menu
 *
 */
public class ExportActionProvider extends CommonActionProvider {

	private static final String ExPORT_MENU_NAME = "common.port.menu";//$NON-NLS-1$

	private ActionFactory.IWorkbenchAction showDlgAction;

	private WizardActionGroup exportWizardActionGroup;

	private boolean contribute = false;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.navigator.CommonActionProvider#init(org.eclipse.ui.navigator
	 * .ICommonActionExtensionSite)
	 */
	@Override
	public void init(ICommonActionExtensionSite anExtensionSite) {

		if (anExtensionSite.getViewSite() instanceof ICommonViewerWorkbenchSite) {
			IWorkbenchWindow window = ((ICommonViewerWorkbenchSite) anExtensionSite
					.getViewSite()).getWorkbenchWindow();
			showDlgAction = ActionFactory.EXPORT.create(window);

			exportWizardActionGroup = new WizardActionGroup(window, PlatformUI
					.getWorkbench().getNewWizardRegistry(),
					WizardActionGroup.TYPE_EXPORT,
					anExtensionSite.getContentService());

			contribute = true;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.actions.ActionGroup#fillContextMenu(org.eclipse.jface.
	 * action.IMenuManager)
	 */
	@Override
	public void fillContextMenu(IMenuManager menu) {
		IMenuManager submenu = new MenuManager("Export", ExPORT_MENU_NAME); //$NON-NLS-1$
		if (!contribute) {
			return;
		}

		// fill the menu from the newWizard contributions
		exportWizardActionGroup.setContext(getContext());
		exportWizardActionGroup.fillContextMenu(submenu);

		submenu.add(new Separator(ICommonMenuConstants.GROUP_PORT));

		// Add other ..
		submenu.add(new Separator());
		submenu.add(showDlgAction);

		// append the submenu after the GROUP_PORT group.
		menu.insertAfter(ICommonMenuConstants.GROUP_PORT, submenu);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.actions.ActionGroup#dispose()
	 */
	@Override
	public void dispose() {
		if (showDlgAction != null) {
			showDlgAction.dispose();
			showDlgAction = null;
		}
		super.dispose();
	}
}