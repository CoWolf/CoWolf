package de.uni_stuttgart.iste.cowolf.core.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

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
		return new PrintToExtensionsInputStream(process.getInputStream());
	}

	static boolean isWindowsSystem() {
		String osName = System.getProperty("os.name").toLowerCase(); //$NON-NLS-1$
		return osName.indexOf("windows") >= 0; //$NON-NLS-1$
	}

	static boolean isLinuxSystem() {
		String osName = System.getProperty("os.name").toLowerCase(); //$NON-NLS-1$
		return osName.indexOf("linux") >= 0; //$NON-NLS-1$
	}
}
