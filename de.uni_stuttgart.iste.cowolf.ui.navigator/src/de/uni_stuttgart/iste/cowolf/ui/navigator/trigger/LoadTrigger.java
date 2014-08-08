package de.uni_stuttgart.iste.cowolf.ui.navigator.trigger;

import org.eclipse.ui.IStartup;


public class LoadTrigger implements IStartup {

	@Override
	public void earlyStartup() {

		de.uni_stuttgart.iste.cowolf.core.ModelAssociationManager.ModelAssociationManager.load();

	}

}
