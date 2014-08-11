package de.uni_stuttgart.iste.cowolf.ui.navigator.handlers;

import java.io.File;
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
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.sidiff.difference.symmetric.SymmetricDifference;

import de.uni_stuttgart.iste.cowolf.core.extensions.ExtensionHandler;
import de.uni_stuttgart.iste.cowolf.evolution.AbstractEvolutionManager;
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

		AbstractEvolutionManager modelManager = extensionHandler
				.getEvolutionManager(firstElementResource);

		SymmetricDifference symmetricDifference = modelManager.evolve(
				firstElementResource, secondElementResource);

		String firstElementParentDir = new File(firstElementeIFile
				.getFullPath().toString()).getParentFile().getParent();

		String evolveResultsFilePath = modelManager.saveEvolveResults(
				symmetricDifference, firstElementParentDir + "differences");

		new DifferencesView().open(evolveResultsFilePath);

		return null;
	}
}
