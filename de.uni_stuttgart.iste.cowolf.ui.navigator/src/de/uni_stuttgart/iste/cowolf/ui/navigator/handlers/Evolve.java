package de.uni_stuttgart.iste.cowolf.ui.navigator.handlers;

import java.io.File;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.resource.Resource;
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
		Resource firstElement = (Resource) list.get(0);
		Resource secondElement = (Resource) list.get(1);

		AbstractEvolutionManager modelManager = extensionHandler
				.getEvolutionManager(firstElement);

		SymmetricDifference symmetricDifference = modelManager.evolve(
				firstElement, secondElement);

		String firstElementParentDir = new File(firstElement.getURI()
				.toFileString()).getParentFile().getParent();

		String evolveResultsFilePath = modelManager.saveEvolveResults(
				symmetricDifference, firstElementParentDir + "differences");

		new DifferencesView().open(evolveResultsFilePath);

		return null;
	}
}
