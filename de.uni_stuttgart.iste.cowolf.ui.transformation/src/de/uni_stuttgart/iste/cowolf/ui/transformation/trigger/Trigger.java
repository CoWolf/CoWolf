package de.uni_stuttgart.iste.cowolf.ui.transformation.trigger;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.ui.IStartup;

import de.uni_stuttgart.iste.cowolf.ui.transformation.InvalidationListener;

public class Trigger implements IStartup {
	@Override
	public void earlyStartup() {
		System.out.println("Register transformation stuff");
		ResourcesPlugin.getWorkspace().addResourceChangeListener(new InvalidationListener());
	}
}
