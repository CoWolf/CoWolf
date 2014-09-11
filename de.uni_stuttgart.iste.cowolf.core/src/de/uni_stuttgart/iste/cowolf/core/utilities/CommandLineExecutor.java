package de.uni_stuttgart.iste.cowolf.core.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

public class CommandLineExecutor {

	public static void execCommand(String directory, String command,
			String consoleName) throws Exception {
		Reader r = new InputStreamReader(execCommandAndGetStream(directory,
				command, consoleName));
		BufferedReader in = new BufferedReader(r);
		while ((in.readLine()) != null) { /* Read output until process finished. */
		}
		in.close();
	}

	public static InputStream execCommandAndGetStream(String directory,
			String command, String consoleName) throws Exception {
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
		// return process.getInputStream();

		return new PrintToExtensionsInputStream(process.getInputStream());

	}

	private static boolean isWindowsSystem() {
		String osName = System.getProperty("os.name").toLowerCase(); //$NON-NLS-1$
		return osName.indexOf("windows") >= 0; //$NON-NLS-1$
	}

	private static boolean isLinuxSystem() {
		String osName = System.getProperty("os.name").toLowerCase(); //$NON-NLS-1$
		return osName.indexOf("linux") >= 0; //$NON-NLS-1$
	}
	
    /**
     * Creates the given executable extensions specified by their extension id,
     * propertyName and class type.
     *
     * @param extensionPointID
     *            the unique identifier of the extension point
     * @param propertyName
     *            the name of the property have to be a class
     * @param type
     *            class type of the interface
     * @return All created extensions.
     */
    @SuppressWarnings("unchecked")
    private static <T> List<T> createExecuteableExtensions(String extensionPointID,
            String propertyName, Class<T> type) {
        final IExtensionRegistry registry = Platform.getExtensionRegistry();
        final IConfigurationElement[] config = registry
                .getConfigurationElementsFor(extensionPointID);
        final List<T> extensions = new LinkedList<T>();
        for (final IConfigurationElement element : config) {
            Object obj;
            try {
                obj = element.createExecutableExtension(propertyName);
                if (obj != null && type.isAssignableFrom(obj.getClass())) {
                    extensions.add((T) obj);
                }
            } catch (final CoreException e1) {
                e1.printStackTrace();
            }
        }
        return extensions;
    }

	public static List<OutputStream> createAllCommandLineExecutionListener() {
		return createExecuteableExtensions(
						"de.uni_stuttgart.iste.cowolf.core.utilities.CommandLineExecutor",
						"class", OutputStream.class);
	}

}
