package de.uni_stuttgart.iste.cowolf.transformation.generator.ui;

import javax.xml.bind.JAXBException;

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

import de.uni_stuttgart.iste.cowolf.transformation.generator.l10n.Messages;
import de.uni_stuttgart.iste.cowolf.transformation.model.Mappings;
import de.uni_stuttgart.iste.cowolf.transformation.model.util.XMLMappingLoader;

/**
 * Wizard for a new Transformation Mapping.
 *
 * @author Rene Trefft
 */
public class TransformationMappingWizard extends Wizard implements INewWizard,
		IExecutableExtension {

	private static final String PAGE_NAME = "New CoWolf Transformation Mapping Wizard";
	private static final String WIZARD_NAME = "CoWolf Transformation Mapping";

	private WizardNewFileCreationPage page;

	private IWorkbench workbench;

	public TransformationMappingWizard() {
		this.setWindowTitle(WIZARD_NAME);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
	}

	@Override
	public boolean performFinish() {

		Mappings transformationMappings = new Mappings();

		IFile transformationMappingFile = this.page.createNewFile();

		try {
			XMLMappingLoader.storeMappings(transformationMappings,
					transformationMappingFile.getLocation().toFile());
		} catch (JAXBException e1) {
			e1.printStackTrace();
			return false;
		}

		TransformationMappingEditorInput input = new TransformationMappingEditorInput(
				transformationMappingFile);

		IWorkbenchWindow window = this.workbench.getActiveWorkbenchWindow();
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

		this.page = new WizardNewFileCreationPage(PAGE_NAME, selection);
		this.page.setTitle("CoWolf Transformation Mapping");
		this.page
		.setDescription("Creates a new Transformation Mapping file for Co-Evolution.");
		this.page
				.setFileExtension(Messages.Cowolf_Transformation_Mapping_Extension);
		this.addPage(this.page);
	}

	@Override
	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
	}

}
