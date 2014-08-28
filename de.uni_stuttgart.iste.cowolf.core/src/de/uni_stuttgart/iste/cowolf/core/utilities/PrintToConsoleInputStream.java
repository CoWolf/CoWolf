package de.uni_stuttgart.iste.cowolf.core.utilities;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class PrintToConsoleInputStream extends InputStream {

	private InputStream in;
	private OutputStream out;
	private int lastRead;
	
	public PrintToConsoleInputStream(InputStream in, OutputStream out) {
		this.in = in;
		this.out = out;
	}
	
	@Override
	public int read() throws IOException {
		if (out == null) {
			return in.read();
		}
		lastRead = in.read();
		out.write(lastRead);
		return lastRead;
	}
}
