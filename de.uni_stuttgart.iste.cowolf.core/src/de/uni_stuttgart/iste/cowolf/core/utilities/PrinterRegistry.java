package de.uni_stuttgart.iste.cowolf.core.utilities;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Manages the registered printers.
 * 
 * @author Rene Trefft
 *
 */
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

	/**
	 * Registered printers.
	 */
	private Set<IPrinter> printers = new HashSet<IPrinter>();

	/**
	 * Registers a new printer.
	 * 
	 * @param printer to register
	 */
	public void addListener(IPrinter printer) {
		printers.add(printer);
	}

	/**
	 * Prints the line {@code printLine} and terminates the line with the Unix line
	 * separator with all registered printers.
	 * 
	 * @param printName - description of the print job
	 * @param printLine to print
	 */
	public void println(String printName, String printMessage) {
		for (IPrinter printer : printers) {
			printer.println(printName, printMessage);
		}
	}
	
	/**
	 * Closes all printers. Mostly it consists of the closing of opened streams.
	 */
	public void close() {
		for (IPrinter printer : printers) {
			printer.close();
		}
	}

}
