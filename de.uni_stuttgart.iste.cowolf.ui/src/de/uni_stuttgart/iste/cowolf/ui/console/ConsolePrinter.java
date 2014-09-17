package de.uni_stuttgart.iste.cowolf.ui.console;

import java.io.IOException;
import java.net.URL;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IOConsoleOutputStream;
import org.eclipse.ui.console.MessageConsole;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import de.uni_stuttgart.iste.cowolf.core.utilities.IPrinter;

/**
 * Prints text on a console of CoWolf. If necessary, the console with a passed
 * name will be created.
 * 
 * @author Rene Trefft
 */
public class ConsolePrinter implements IPrinter {

	private IOConsoleOutputStream consoleOutputStream = null;

	/**
	 * Creates or use an already existing console and setups them.
	 * 
	 * @param consoleName
	 * @return Console
	 */
	private MessageConsole initConsole(String consoleName) {
		MessageConsole console = findConsole(consoleName);
		// unlimited console buffer
		console.setWaterMarks(-1, -1);
		console.activate();
		return console;
	}

	/**
	 * Checks if console {@code name} already exist. If it exists, it will be
	 * returned, otherwise a new console will created and returned.
	 * 
	 * @param name
	 *            of console
	 * @return Console
	 */
	private MessageConsole findConsole(String name) {

		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] consoles = conMan.getConsoles();

		for (IConsole console : consoles) {
			if (console.getName().equals(name)) {
				if (console instanceof MessageConsole) {
					MessageConsole msgConsole = ((MessageConsole) console);
					return msgConsole;

				}
			}
		}

		// no console found, so create a new one

		Bundle bundle = FrameworkUtil.getBundle(ConsolePrinter.class);
		URL coWolfIconURL = FileLocator.find(bundle, new Path(
				"icons/logo_wulf_15x15.png"), null);
		ImageDescriptor coWolfIconImageDescriptor = ImageDescriptor
				.createFromURL(coWolfIconURL);

		MessageConsole newConsole = new MessageConsole(name,
				coWolfIconImageDescriptor);
		conMan.addConsoles(new IConsole[] { newConsole });
		return newConsole;

	}

	private String printName = null;

	@Override
	public void println(String printName, String printLine) {

		// if no print was executed before, last print closed or new print name
		// (= console name) passed, create a new console and output stream
		if (!printName.equals(this.printName)) {
			this.printName = printName;
			MessageConsole messageConsole = initConsole(printName);
			consoleOutputStream = messageConsole.newOutputStream();
		}

		try {
			consoleOutputStream.write(printLine + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void close() {
		if (consoleOutputStream == null) {
			return;
		}
		try {
			consoleOutputStream.close();
			this.printName = null;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
