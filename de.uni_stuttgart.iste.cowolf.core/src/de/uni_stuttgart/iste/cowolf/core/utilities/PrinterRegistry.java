package de.uni_stuttgart.iste.cowolf.core.utilities;

import java.util.HashSet;
import java.util.Set;

public class PrinterRegistry {

	/**
	 * SingletonHolder is loaded on the first execution of
	 * PrinterRegistry.getInstance(), not before.
	 */
	private static class SingletonHolder {
		private static final PrinterRegistry INSTANCE = new PrinterRegistry();
	}

	public static PrinterRegistry getInstance() {
		return SingletonHolder.INSTANCE;
	}

	private PrinterRegistry() {
	}

	private Set<IPrinter> printers = new HashSet<IPrinter>();

	public void addListener(IPrinter printer) {
		printers.add(printer);
	}

	public void println(String printName, String printMessage) {
		for (IPrinter printer : printers) {
			printer.println(printName, printMessage);
		}
	}

}
