package de.uni_stuttgart.iste.cowolf.core.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;

public class CommandLineExecutor {

	public static void execCommand(String directory, String command, String consoleName) throws Exception {
		Reader r = new InputStreamReader(execCommandAndGetStream(directory,
				command, consoleName));
		BufferedReader in = new BufferedReader(r);
		while ((in.readLine()) != null) { /* Read output until process finished. */
		}
		in.close();
	}

	public static InputStream execCommandAndGetStream(String directory, String command, String consolename)
			throws Exception {
		File dir = new File(directory);
		Process process;
		if (isWindowsSystem()) {
			process = Runtime.getRuntime().exec("cmd /c " + command, null, dir); //$NON-NLS-1$
		} else if (isLinuxSystem()) {
			process = Runtime.getRuntime().exec("./" + command, null, dir);
		} else {
			throw new Exception(Messages.commandLineExecutor_unknown_operating_system);
		}
		MessageConsole cons = findConsole(consolename);
		if (cons == null) {
			return new PrintToConsoleInputStream(process.getInputStream(), null);
		}
		return new PrintToConsoleInputStream(process.getInputStream(), cons.newOutputStream());
	}

	static boolean isWindowsSystem() {
		String osName = System.getProperty("os.name").toLowerCase(); //$NON-NLS-1$
		return osName.indexOf("windows") >= 0; //$NON-NLS-1$
	}

	static boolean isLinuxSystem() {
		String osName = System.getProperty("os.name").toLowerCase(); //$NON-NLS-1$
		return osName.indexOf("linux") >= 0; //$NON-NLS-1$
	}
	
	private static MessageConsole findConsole(String name) {
		if (name == null) {
			return null;
		}
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++) {
			if (name.equals(existing[i].getName())) {
				conMan.removeConsoles(new IConsole[] { existing[i] });
				((MessageConsole) existing[i]).clearConsole();
				return (MessageConsole) existing[i];
			}
		}

		// no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] { myConsole });
		return myConsole;
	}
}
