package de.uni_stuttgart.iste.cowolf.ui.evolution;

import java.io.FileNotFoundException;

import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.swt.widgets.Display;
import org.silift.common.util.ui.UIUtil;

/**
 * Differences view
 *
 * @author Rene Trefft
 */
public class DifferencesView {

	public void open(final String differenceFilePath) {

		Display.getDefault().asyncExec(new Runnable() {

			@Override
			public void run() {
				try {
					UIUtil.openEditor(differenceFilePath);
				} catch (OperationCanceledException e) {
					e.printStackTrace();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
		});

	}
}
