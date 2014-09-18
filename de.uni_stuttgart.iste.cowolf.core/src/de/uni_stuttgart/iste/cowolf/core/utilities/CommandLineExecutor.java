package de.uni_stuttgart.iste.cowolf.core.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * 
 * @author Rene Trefft
 *
 */
public class CommandLineExecutor {

	public static void execCommandAndDiscardOutput(String directory,
			String command, String parameters) throws Exception {
		InputStream inputStream = execCommandAndGetOutput(directory, command, parameters);
		Reader r = new InputStreamReader(inputStream);
		BufferedReader in = new BufferedReader(r);
		while (in.readLine() != null) {
			/* Read output until process finished. */
		}

	}

	public static InputStream execCommandAndGetOutput(String directory,
			String command, String parameters) throws Exception {

		File dir = new File(directory);
		Process process;
		if (isWindowsSystem()) {
			process = Runtime.getRuntime().exec("cmd /c " + "\"" + command + "\" " + parameters, null, dir); //$NON-NLS-1$
		} else if (isLinuxSystem()) {
			if (command.startsWith("/")) {
				process = Runtime.getRuntime().exec(command + " " + parameters, null, dir);
			} else  {
				process = Runtime.getRuntime().exec("./" + command + " " + parameters, null, dir);
			}
		} else {
			throw new Exception(
					Messages.commandLineExecutor_unknown_operating_system);
		}

		return process.getInputStream();

	}

	private static boolean isWindowsSystem() {
		String osName = System.getProperty("os.name").toLowerCase(); //$NON-NLS-1$
		return osName.indexOf("windows") >= 0; //$NON-NLS-1$
	}

	private static boolean isLinuxSystem() {
		String osName = System.getProperty("os.name").toLowerCase(); //$NON-NLS-1$
		return osName.indexOf("linux") >= 0; //$NON-NLS-1$
	}

}
