package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Wizard for a new Transformation Mapping.
 *
 * @author Rene Trefft
 *
 */
public class TransformationMappingWizard extends Wizard implements INewWizard,
		IExecutableExtension {

	private static final String PAGE_NAME = "New CoWolf Transformation Mapping Wizard";
	private static final String WIZARD_NAME = "CoWolf Transformation Mapping";

	private WizardNewFileCreationPage page;

	private IWorkbench workbench;

	public TransformationMappingWizard() {
		setWindowTitle(WIZARD_NAME);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
	}

	@Override
	public boolean performFinish() {

		IFile transformationMappingFile = page.createNewFile();

		TransformationMappingEditorInput input = new TransformationMappingEditorInput(transformationMappingFile.getFullPath());

		IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();

		try {
			
			page.openEditor(input, TransformationMappingEditor.ID);

		} catch (PartInitException e) {
			throw new RuntimeException(e);
		}

		return true;
	}

	@Override
	public void addPages() {
		super.addPages();

		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IStructuredSelection selection = (IStructuredSelection) window
				.getSelectionService().getSelection();

		page = new WizardNewFileCreationPage(PAGE_NAME, selection);
		page.setTitle("CoWolf Transformation Mapping");
		page.setDescription("Creates a new Transformation Mapping file for Co-Evolution.");
		page.setFileExtension("xml");
		addPage(page);
	}

	@Override
	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
	}

}