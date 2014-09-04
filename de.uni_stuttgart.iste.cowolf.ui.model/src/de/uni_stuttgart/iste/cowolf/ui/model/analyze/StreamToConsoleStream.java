package de.uni_stuttgart.iste.cowolf.ui.model.analyze;

import java.io.IOException;
import java.io.OutputStream;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;

public abstract class StreamToConsoleStream extends OutputStream {

	private OutputStream console;
	
	public StreamToConsoleStream() {
		console = findConsole(getConsoleName()).newOutputStream();
	}
	
	@Override
	public void write(int b) throws IOException {
		console.write(b);
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
	
	protected abstract String getConsoleName();
}
