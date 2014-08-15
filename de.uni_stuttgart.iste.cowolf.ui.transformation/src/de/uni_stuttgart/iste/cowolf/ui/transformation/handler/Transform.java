package de.uni_stuttgart.iste.cowolf.ui.transformation.handler;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
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
import org.sidiff.difference.symmetric.SymmetricDifference;

import de.uni_stuttgart.iste.cowolf.core.extensions.ExtensionHandler;
import de.uni_stuttgart.iste.cowolf.evolution.AbstractEvolutionManager;
import de.uni_stuttgart.iste.cowolf.evolution.EvolutionException;
import de.uni_stuttgart.iste.cowolf.transformation.AbstractTransformationManager;
import de.uni_stuttgart.iste.cowolf.ui.transformation.wizard.TransformationWizard;

public class Transform extends AbstractHandler {

	private ExtensionHandler extensionHandler;

	public Transform() {
		this.extensionHandler = ExtensionHandler.getInstance();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// initialize variables
		IFile firstElement = null;
		IFile secondElement = null;

		final IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();

		IStructuredSelection selection = (IStructuredSelection) window
				.getSelectionService().getSelection();
		List<?> list = selection.toList();
		if (list.size() >= 1) {
			firstElement = (IFile) list.get(0);
		}
		if (list.size() == 2) {
			secondElement = (IFile) list.get(1);
		}

		TransformationWizard modelWizard = new TransformationWizard(
				firstElement, secondElement);
		WizardDialog wizard = new WizardDialog(window.getShell(), modelWizard);
		if (wizard.open() == Window.CANCEL) {
			return null;
		}

		Resource firstModel = this.getResourceOfIFile(firstElement);
		Resource secondModel = this.getResourceOfIFile(secondElement);
		AbstractTransformationManager manager = this.extensionHandler
				.getTransformationManager(firstModel, secondModel);

		// TODO first evolve, second co-evolve

		AbstractEvolutionManager evoManager = this.extensionHandler
				.getEvolutionManager(firstModel);

		SymmetricDifference difference;
		try {
			difference = evoManager.evolve(firstModel, secondModel);

			manager.transform(firstModel, secondModel, difference);
		} catch (EvolutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	private Resource getResourceOfIFile(IFile model) {
		URI uri = URI.createPlatformResourceURI(model.getFullPath().toString(),
				true);
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource modelResource = resourceSet.getResource(uri, true);
		return modelResource;
	}
}