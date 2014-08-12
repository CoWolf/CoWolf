package de.uni_stuttgart.iste.cowolf.ui.model.analyze;

import javax.swing.JOptionPane;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

import de.uni_stuttgart.iste.cowolf.model.IAnalysisListener;

public class FileOpenAnalysisListener implements IAnalysisListener{

	@Override
	public void finished(final Resource resource, final IFile result) {
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					IDE.openEditor(page, result, true);
				} catch (PartInitException e) {
					JOptionPane.showMessageDialog(null, "Missing editor to open file", "Path to file: " + result.getProjectRelativePath(), JOptionPane.ERROR_MESSAGE);
				}
			}
		});

	}

}
