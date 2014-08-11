package de.uni_stuttgart.iste.cowolf.ui.navigator.handlers;

import java.util.HashMap;

import javax.swing.JOptionPane;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.uni_stuttgart.iste.cowolf.core.extensions.ExtensionHandler;
import de.uni_stuttgart.iste.cowolf.model.IModelManager;
import de.uni_stuttgart.iste.cowolf.model.IQoSModelManager;
import de.uni_stuttgart.iste.cowolf.ui.model.AbstractQoSAnalyzeWizard;
import de.uni_stuttgart.iste.cowolf.ui.model.AnalyzeWizardHandler;
import de.uni_stuttgart.iste.cowolf.ui.navigator.externalizedStrings.Messages;

public class Analyze implements IHandler {

	@Override
	public void addHandlerListener(final IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		JOptionPane.showMessageDialog(null, Messages.Analyze_analyze_menu);
		System.out.println("Doing Analyze");
		ExtensionHandler extensionHandler = new ExtensionHandler();
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();

		Object selectedElement = selection.getFirstElement();

		if (selectedElement != null && selectedElement instanceof IFile) {
			IFile iFile = (IFile) selectedElement;
			ResourceSet resSet = new ResourceSetImpl();
			Resource resource;
			URI uri = URI.createPlatformResourceURI(iFile.getFullPath().toString(), true);
			resource = resSet.getResource(uri, true);
			IModelManager modelManager = extensionHandler
					.getModelManager(resource);
			if (modelManager != null && modelManager instanceof IQoSModelManager) {
				IQoSModelManager qosModelManager = (IQoSModelManager) modelManager;
				HashMap<String, Object> properties = new HashMap<String, Object>();
				AbstractQoSAnalyzeWizard wizard = AnalyzeWizardHandler.getInstance().getQosAnalyzeWizard((IQoSModelManager) modelManager);

				if (wizard != null) {
					//TODO call UI to define Properties
					wizard.initialize(qosModelManager, resource, properties);
					WizardDialog wizardDialog = new WizardDialog(window.getShell(), wizard);
					wizardDialog.setBlockOnOpen(true);
					if (wizardDialog.open() == Window.OK) {
						System.out.println("Ok pressed");
						qosModelManager.analyze(resource, properties);
					} else {
						System.out.println("Cancel pressed");
					}
				}
			}
		}

		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeHandlerListener(final IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

}
