package de.uni_stuttgart.iste.cowolf.core.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class CommandLineExecutor {

	// private static InputStream commandOutput = null;

//	private BufferedReader bufferedReader = null;
//
//	/**
//	 * SingletonHolder is loaded on the first execution of
//	 * CommandLineExecutor.getInstance(), not before.
//	 */
//	private static class SingletonHolder {
//		private static final CommandLineExecutor INSTANCE = new CommandLineExecutor();
//	}
//
//	public static CommandLineExecutor getInstance() {
//		return SingletonHolder.INSTANCE;
//	}
//
//	private CommandLineExecutor() {
//	}

//	private Set<IPrinter> commandOutputListeners = new HashSet<IPrinter>();
//
//	public void addListener(IPrinter commandOutputListener) {
//		commandOutputListeners.add(commandOutputListener);
//	}
//
//	private void notifyCommandOuputListeners(String message) {
//		for (IPrinter commandOutputListener : commandOutputListeners) {
//			commandOutputListener.println(message);
//		}
//	}

//	private BufferedReader getCommandOutputBufferedReader() {
//		return bufferedReader;
//	}
//
//	private void setCommandOutputBufferedReader(BufferedReader bufferedReader) {
//		this.bufferedReader = bufferedReader;
//	}

	public static void execCommandAndDiscardOutput(String directory, String command)
			throws Exception {
		InputStream inputStream = execCommandAndGetOutput(directory, command);
		Reader r = new InputStreamReader(inputStream);
		BufferedReader in = new BufferedReader(r);
		while (in.readLine() != null) { /*
													 * Read output until process
													 * finished.
													 */
		}
		// in.close();
	}
	
	public static InputStream execCommandAndGetOutput(String directory, String command) throws Exception {
		
		File dir = new File(directory);
		Process process;
		if (isWindowsSystem()) {
			process = Runtime.getRuntime().exec("cmd /c " + command, null, dir); //$NON-NLS-1$
		} else if (isLinuxSystem()) {
			process = Runtime.getRuntime().exec("./" + command, null, dir);
		} else {
			throw new Exception(
					Messages.commandLineExecutor_unknown_operating_system);
		}
		
		return process.getInputStream();

//		Reader r = new InputStreamReader(process.getInputStream());
//		bufferedReader = new BufferedReader(r);
		
	}
	

//	public void execCommandAndStoreOutput(String directory, String command)
//			throws Exception {
//		File dir = new File(directory);
//		Process process;
//		if (isWindowsSystem()) {
//			process = Runtime.getRuntime().exec("cmd /c " + command, null, dir); //$NON-NLS-1$
//		} else if (isLinuxSystem()) {
//			process = Runtime.getRuntime().exec("./" + command, null, dir);
//		} else {
//			throw new Exception(
//					Messages.commandLineExecutor_unknown_operating_system);
//		}
//
//		Reader r = new InputStreamReader(process.getInputStream());
//		bufferedReader = new BufferedReader(r);
//
//		setCommandOutputBufferedReader(bufferedReader);
//
//		// return process.getInputStream();
//
//	}

//	public String getCommandOutputNextLine() {
//		// if (getCommandOutput() == null) {
//		// return null;
//		// }
//
//		BufferedReader bufferedReader = getCommandOutputBufferedReader();
//
//		if (bufferedReader == null) {
//			// Reader r = new InputStreamReader(getCommandOutput());
//			// bufferedReader = new BufferedReader(r);
//			return null;
//		}
//
//		String nextLine = null;
//
//		try {
//			nextLine = bufferedReader.readLine();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		if (nextLine == null) {
//			try {
//				bufferedReader.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			} finally {
//				setCommandOutputBufferedReader(null);
//			}
//		} else {
//			notifyCommandOuputListeners(nextLine);
//		}
//
//		return nextLine;
//
//	}

	private static boolean isWindowsSystem() {
		String osName = System.getProperty("os.name").toLowerCase(); //$NON-NLS-1$
		return osName.indexOf("windows") >= 0; //$NON-NLS-1$
	}

	private static boolean isLinuxSystem() {
		String osName = System.getProperty("os.name").toLowerCase(); //$NON-NLS-1$
		return osName.indexOf("linux") >= 0; //$NON-NLS-1$
	}

}
