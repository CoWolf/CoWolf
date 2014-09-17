package de.uni_stuttgart.iste.cowolf.ui.evolution;

import java.io.FileNotFoundException;

import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.swt.widgets.Display;
import org.silift.common.util.ui.UIUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Difference view that shows the differences between two models. It uses the
 * view provided by SiLift.
 *
 * @author Rene Trefft
 */
public class DifferencesView {

	private final static Logger LOGGER = LoggerFactory
			.getLogger(DifferencesView.class);
	
	/**
	 * Opens the difference view of SiLift with the symmetric or asymmetric
	 * difference file at {@code differenceFilePath}.
	 * 
	 * @param differenceFilePath
	 *            to open in difference view.
	 */
	public void open(final String differenceFilePath) {

		Display.getDefault().asyncExec(new Runnable() {

			@Override
			public void run() {
				try {
					UIUtil.openEditor(differenceFilePath);
				} catch (OperationCanceledException e) {
					LOGGER.error("", e);
				} catch (FileNotFoundException e) {
					LOGGER.error("", e);
				}
			}
		});

	}
}
