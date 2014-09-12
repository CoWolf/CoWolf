package de.uni_stuttgart.iste.cowolf.ui.console;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

/**
 * 
 * Prints text on a console of CoWolf. If necessary, the console will be
 * created.
 * 
 * @author Rene Trefft
 *
 */
public class ConsolePrinter extends MessageConsoleStream {

	/**
	 * Creates a new {@code ConsolePrinter} for printing on a console.
	 * 
	 * @param consoleName
	 */
	public ConsolePrinter(String consoleName) {
		super(initConsole(consoleName));
	}

	/**
	 * Creates or use an already existing console and setups them.
	 * 
	 * @param consoleName
	 * @return Console
	 */
	private static MessageConsole initConsole(String consoleName) {
		MessageConsole console = findConsole(consoleName);
		// unlimited console buffer
		console.setWaterMarks(-1, -1);
		console.activate();
		return console;
	}

	@Override
	public void print(String message) {
		super.print(message);
	}

	@Override
	public void println() {
		super.println();
	}

	@Override
	public void println(String message) {
		super.println(message);
	}

	/**
	 * Checks if console {@code name} already exist. If it exists, it will be
	 * returned, otherwise a new console will created and returned.
	 * 
	 * @param name
	 *            of console
	 * @return Console
	 */
	private static MessageConsole findConsole(String name) {

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

		// Bundle bundle = FrameworkUtil.getBundle(ConsolePrinter.class);
		// URL coWolfIconURL = FileLocator.find(bundle, new Path(
		// "icons/logo_wulf_15x15.png"), null);
		// ImageDescriptor coWolfIconImageDescriptor = ImageDescriptor
		// .createFromURL(coWolfIconURL);

		// no console found, so create a new one
		MessageConsole newConsole = new MessageConsole(name,
				ImageDescriptor.getMissingImageDescriptor());
		conMan.addConsoles(new IConsole[] { newConsole });
		return newConsole;

	}
}
