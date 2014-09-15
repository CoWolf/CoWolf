package de.uni_stuttgart.iste.cowolf.core.utilities;

/**
 * 
 * Prints text on a certain location.
 * 
 * @author Rene Trefft
 *
 */
public interface IPrinter {

	/**
	 * Prints the line {@code printLine} and terminates the line with the Unix line
	 * separator.
	 * 
	 * @param printName
	 * @param printLine
	 */
	public void println(String printName, String printLine);

	/**
	 * Closes the printer. Mostly it consists of the closing of opened streams.
	 */
	public void close();

}
