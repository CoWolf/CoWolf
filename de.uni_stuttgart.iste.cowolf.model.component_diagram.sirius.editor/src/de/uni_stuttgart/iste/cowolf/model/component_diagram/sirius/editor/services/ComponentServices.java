package de.uni_stuttgart.iste.cowolf.model.component_diagram.sirius.editor.services;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.Connector;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.PortInstance;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ArchitectureImpl;

public class ComponentServices {

	public static EObject getRootElement(PortInstance port) {
		ComponentInstance component = (ComponentInstance)port.eContainer();
		EObject container = component.eContainer();
		while (!(container instanceof ArchitectureImpl)) {
			container = container.eContainer();
		}
		return container;
	}

	public static EObject findSource(Connector connector) {
		EList<PortInstance> ports = connector.getPort();
		for(PortInstance port : ports){
			if(port.getOutComponent() != null){
				return port;
			}
		}
		

		return null;
	}
	
	public static EObject findTarget(Connector connector) {
		EList<PortInstance> ports = connector.getPort();
		for(PortInstance port : ports){
			if(port.getInComponent() != null){
				return port;
			}
		}
		

		return null;
	}

	
}
