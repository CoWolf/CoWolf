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

/**
 * The transformation action is handled here.
 *
 * @author Michael Zimmermann
 */
public class Transform extends AbstractHandler {

	private ExtensionHandler extensionHandler;

	public Transform() {
		this.extensionHandler = ExtensionHandler.getInstance();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// initialize variables
		IFile firstSourceElement = null;
		IFile secondSourceElement = null;
		IFile targetElement = null;
		IFile tempElement = null;
		Resource firstSourceModel = null;
		Resource secondSourceModel = null;
		Resource targetModel = null;
		Resource tempModel = null;

		final IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();

		IStructuredSelection selection = (IStructuredSelection) window
				.getSelectionService().getSelection();

		List<?> list = selection.toList();

		if (list.size() >= 1) {
			firstSourceElement = (IFile) list.get(0);
			firstSourceModel = this.getResourceOfIFile(firstSourceElement);
		}
		if (list.size() >= 2) {
			tempElement = (IFile) list.get(1);
			tempModel = this.getResourceOfIFile(tempElement);

			// If first and second element of different type, make second
			// element to third element
			if (this.extensionHandler.getEvolutionManager(firstSourceModel)
					.equals(this.extensionHandler
							.getEvolutionManager(tempModel))) {
				secondSourceModel = tempModel;
				secondSourceElement = tempElement;
			} else {
				targetModel = tempModel;
				targetElement = tempElement;
			}
		}
		if (list.size() >= 3) {
			tempElement = (IFile) list.get(2);
			tempModel = this.getResourceOfIFile(tempElement);

			// Element one and two of same type.
			if (targetModel == null) {
				targetModel = this.getResourceOfIFile(tempElement);
				targetElement = tempElement;

				// Element one and three of same type
			} else if (this.extensionHandler.getEvolutionManager(
					firstSourceModel).equals(
					this.extensionHandler.getEvolutionManager(tempModel))) {
				secondSourceModel = this.getResourceOfIFile(tempElement);
				secondSourceElement = tempElement;

				// Element two and three of same type
			} else {
				secondSourceElement = tempElement;
				secondSourceModel = tempModel;
				tempElement = firstSourceElement;
				tempModel = firstSourceModel;
				firstSourceElement = targetElement;
				firstSourceModel = targetModel;
				targetElement = tempElement;
				targetModel = tempModel;
			}
		}

		TransformationWizard modelWizard = new TransformationWizard(
				firstSourceElement, secondSourceElement, targetElement);
		WizardDialog wizard = new WizardDialog(window.getShell(), modelWizard);
		if (wizard.open() == Window.CANCEL) {
			return null;
		}

		AbstractEvolutionManager evoManager = this.extensionHandler
				.getEvolutionManager(firstSourceModel);

		AbstractTransformationManager transManager = this.extensionHandler
				.getTransformationManager(firstSourceModel, targetModel);

		if (evoManager != null && transManager != null) {

			try {
				SymmetricDifference difference = evoManager.evolve(
						firstSourceModel, secondSourceModel);

				transManager.transform(secondSourceModel, targetModel,
						difference);
			} catch (EvolutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return null;
	}

	private Resource getResourceOfIFile(IFile model) {
		URI uri = URI.createPlatformResourceURI(model.getFullPath().toString(),
				true);
		ResourceSet resourceSet = new ResourceSetImpl();
		try {
			Resource modelResource = resourceSet.getResource(uri, true);
			return modelResource;
		} catch (Exception exc) {
		}

		return null;
	}
}