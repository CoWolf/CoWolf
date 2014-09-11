package de.uni_stuttgart.iste.cowolf.ui.model.dtmc.analyze;

import de.uni_stuttgart.iste.cowolf.ui.model.analyze.StreamToConsoleStream;

public class DTMCToConsoleStream extends StreamToConsoleStream {

	@Override
	protected String getConsoleName() {
		return "Analyze DTMC";
	}

}
