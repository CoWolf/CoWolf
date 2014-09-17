package de.uni_stuttgart.iste.cowolf.ui.transformation.trigger;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.ui.IStartup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.uni_stuttgart.iste.cowolf.ui.transformation.InvalidationListener;

public class Trigger implements IStartup {

	
	private final static Logger LOGGER = LoggerFactory.getLogger(Trigger.class);
	
	@Override
	public void earlyStartup() {
		LOGGER.debug("Register transformation stuff");
		ResourcesPlugin.getWorkspace().addResourceChangeListener(new InvalidationListener());
	}
	
}
