package de.uni_stuttgart.iste.cowolf.ui.navigator.handlers;

import java.io.File;
import java.util.List;

import javax.swing.JOptionPane;

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
import de.uni_stuttgart.iste.cowolf.ui.evolution.ComponentSelectionWizard;
import de.uni_stuttgart.iste.cowolf.ui.evolution.DifferencesView;

public class Evolve extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		
		ExtensionHandler extensionHandler = new ExtensionHandler();

		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		
		IStructuredSelection selection = (IStructuredSelection) window
				.getSelectionService().getSelection();

		List list = selection.toList();
		Object firstElement = list.get(0);
		Object secondElement = list.get(1);
		
		IFile firstElementeIFile = (IFile) firstElement;
		IFile secondElementeIFile = (IFile) secondElement;

		URI firstElementURI = URI.createPlatformResourceURI(firstElementeIFile
				.getFullPath().toString(), true);
		URI secondElementURI = URI.createPlatformResourceURI(
				secondElementeIFile.getFullPath().toString(), true);

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource firstElementResource = resourceSet.getResource(
				firstElementURI, true);
		Resource secondElementResource = resourceSet.getResource(
				secondElementURI, true);
		ComponentSelectionWizard modelWizard = new ComponentSelectionWizard(firstElementResource, secondElementResource);
		WizardDialog wizard = new WizardDialog(window.getShell(), modelWizard);
		if(wizard.open() == Window.CANCEL) {
			return null;
		}
		Resource firstModel;
		Resource secondModel;
		if(modelWizard.isFirstModelSelected()) {
			firstModel = firstElementResource;
			secondModel = secondElementResource;
		} else {
			firstModel = secondElementResource;
			secondModel = firstElementResource;
		}
		
		AbstractEvolutionManager modelManager = extensionHandler
				.getEvolutionManager(firstElementResource);

		SymmetricDifference symmetricDifference;
		try {
			symmetricDifference = modelManager.evolve(
					firstModel, secondModel);
			String firstElementParentDir = new File(firstElementeIFile
					.getFullPath().toString()).getParentFile().getParent();

			String evolveResultsFilePath = modelManager.saveEvolveResults(
					symmetricDifference, firstElementParentDir + "differences");
			new DifferencesView().open(evolveResultsFilePath);
		} catch (EvolutionException e) {
			JOptionPane.showMessageDialog(null, e.getLocalizedMessage(), 
					"Exception", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}

		return null;
	}
}
