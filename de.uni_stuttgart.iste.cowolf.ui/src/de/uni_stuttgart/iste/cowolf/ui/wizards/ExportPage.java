package de.uni_stuttgart.iste.cowolf.ui.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.dialogs.WizardExportResourcesPage;

/**
 * The first page of our export wizard
 *
 */
public class ExportPage extends WizardExportResourcesPage {

	protected ExportPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleEvent(Event event) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void createDestinationGroup(Composite parent) {

		// Label label = new Label(parent, SWT.SHADOW_NONE);
		// Text text = new Text(parent, SWT.BORDER);
		// Button button = new Button(parent, SWT.PUSH);

	}

}
