package de.uni_stuttgart.iste.cowolf.ui.navigator.actionprovider;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchCommandConstants;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.RefreshAction;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.eclipse.ui.navigator.ICommonMenuConstants;

import de.uni_stuttgart.iste.cowolf.ui.navigator.Activator;

/**
 * This class does a refresh on the workspace
 *
 */
public class RefreshActionProvider extends CommonActionProvider {

	private RefreshAction refreshAction;

	private Shell currentShell;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.navigator.CommonActionProvider#init(org.eclipse.ui.navigator
	 * .ICommonActionExtensionSite)
	 */
	@Override
	public void init(ICommonActionExtensionSite aSite) {
		super.init(aSite);
		currentShell = aSite.getViewSite().getShell();
		makeActions();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.actions.ActionGroup#fillActionBars(org.eclipse.ui.IActionBars
	 * )
	 */
	@Override
	public void fillActionBars(IActionBars actionBars) {
		actionBars.setGlobalActionHandler(ActionFactory.REFRESH.getId(),
				refreshAction);
		updateActionBars();
	}

	/**
	 * Adds the refresh resource actions to the context menu
	 *
	 * @param menu
	 *            context menu to add actions to
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public void fillContextMenu(IMenuManager menu) {
		IStructuredSelection selection = (IStructuredSelection) getContext()
				.getSelection();
		boolean hasClosedProjects = false;
		Iterator resources = selection.iterator();

		while (resources.hasNext() && (!hasClosedProjects)) {
			Object next = resources.next();
			IProject project = null;

			if (next instanceof IProject) {
				project = (IProject) next;
			} else if (next instanceof IAdaptable) {
				project = (IProject) ((IAdaptable) next)
						.getAdapter(IProject.class);
			}

			if (project == null) {
				continue;
			}

			if (!project.isOpen()) {
				hasClosedProjects = true;
			}
		}

		if (!hasClosedProjects) {
			refreshAction.selectionChanged(selection);
			menu.appendToGroup(ICommonMenuConstants.GROUP_BUILD, refreshAction);
		}
	}

	/**
	 * Does the refresh
	 */
	protected void makeActions() {
		IShellProvider sp = new IShellProvider() {
			@SuppressWarnings("synthetic-access")
			@Override
			public Shell getShell() {
				return currentShell;
			}
		};

		refreshAction = new RefreshAction(sp) {
			@Override
			public void run() {
				final IStatus[] errorStatus = new IStatus[1];
				errorStatus[0] = Status.OK_STATUS;
				final WorkspaceModifyOperation op = (WorkspaceModifyOperation) createOperation(errorStatus);
				WorkspaceJob job = new WorkspaceJob("refresh") { //$NON-NLS-1$

					@SuppressWarnings("synthetic-access")
					@Override
					public IStatus runInWorkspace(IProgressMonitor monitor)
							throws CoreException {
						try {
							op.run(monitor);
							if (currentShell != null
									&& !currentShell.isDisposed()) {
								currentShell.getDisplay().asyncExec(
										new Runnable() {
											@Override
											public void run() {
												StructuredViewer viewer = getActionSite()
														.getStructuredViewer();
												if (viewer != null
														&& viewer.getControl() != null
														&& !viewer.getControl()
																.isDisposed()) {
													viewer.refresh();
												}
											}
										});
							}
						} catch (InvocationTargetException e) {
							String msg = NLS.bind("Exception in {0}. run: {1}", //$NON-NLS-1$
									getClass().getName(),
									e.getTargetException());
							throw new CoreException(new Status(IStatus.ERROR,
									Activator.PLUGIN_ID, IStatus.ERROR, msg,
									e.getTargetException()));
						} catch (InterruptedException e) {
							return Status.CANCEL_STATUS;
						}
						return errorStatus[0];
					}

				};
				ISchedulingRule rule = op.getRule();
				if (rule != null) {
					job.setRule(rule);
				}
				job.setUser(true);
				job.schedule();
			}
		};
		refreshAction
				.setDisabledImageDescriptor(getImageDescriptor("icons/logo_wulf_15x15.png"));//$NON-NLS-1$
		refreshAction
				.setImageDescriptor(getImageDescriptor("icons/logo_wulf_15x15.png"));//$NON-NLS-1$
		refreshAction
				.setActionDefinitionId(IWorkbenchCommandConstants.FILE_REFRESH);
	}

	/**
	 * Returns the image descriptor with the given relative path.
	 */
	protected ImageDescriptor getImageDescriptor(String relativePath) {
		return Activator.getIDEImageDescriptor(relativePath);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.actions.ActionGroup#updateActionBars()
	 */
	@Override
	public void updateActionBars() {
		IStructuredSelection selection = (IStructuredSelection) getContext()
				.getSelection();
		refreshAction.selectionChanged(selection);
	}

}