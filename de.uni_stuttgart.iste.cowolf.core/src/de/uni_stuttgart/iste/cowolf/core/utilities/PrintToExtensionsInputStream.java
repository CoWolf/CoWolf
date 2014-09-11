package de.uni_stuttgart.iste.cowolf.core.utilities;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class PrintToExtensionsInputStream extends InputStream {

	private InputStream in;
	private int lastRead;
	private List<OutputStream> streams = CommandLineExecutor.createAllCommandLineExecutionListener();

	public PrintToExtensionsInputStream(InputStream in) {
		this.in = in;
	}

	@Override
	public int read() throws IOException {
		lastRead = in.read();
		for (OutputStream currentStream : streams) {
			currentStream.write(lastRead);
		}
		return lastRead;
	}
}