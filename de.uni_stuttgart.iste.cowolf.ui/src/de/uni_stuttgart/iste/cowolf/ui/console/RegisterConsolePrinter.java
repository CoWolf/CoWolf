package de.uni_stuttgart.iste.cowolf.ui.console;

import org.eclipse.ui.IStartup;

import de.uni_stuttgart.iste.cowolf.core.utilities.PrinterRegistry;

/**
 * 
 * Registers the {@code ConsolePrinter} listener on startup.
 * 
 * @author Rene Trefft
 *
 */
public class RegisterConsolePrinter implements IStartup {

	@Override
	public void earlyStartup() {
		PrinterRegistry.getInstance().addListener(new ConsolePrinter());
	}

}
