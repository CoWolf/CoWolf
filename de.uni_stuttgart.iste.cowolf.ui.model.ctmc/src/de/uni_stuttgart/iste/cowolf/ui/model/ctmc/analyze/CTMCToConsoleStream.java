package de.uni_stuttgart.iste.cowolf.ui.model.ctmc.analyze;

import de.uni_stuttgart.iste.cowolf.ui.model.analyze.StreamToConsoleStream;

public class CTMCToConsoleStream  extends StreamToConsoleStream{

	@Override
	protected String getConsoleName() {
		return "Analyze CTMC";
	}

}
