package de.uni_stuttgart.iste.cowolf.model.component_diagram.sirius.editor.services;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.uni_stuttgart.iste.cowolf.model.component_diagram.Architecture;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.Connector;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.PortInstance;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ArchitectureImpl;

public class ComponentServices {

	public static EObject getRootElement(PortInstance port) {
		ComponentInstance component = (ComponentInstance) port.eContainer();
		EObject container = component.eContainer();
		while (!(container instanceof ArchitectureImpl)) {
			container = container.eContainer();
		}
		return container;
	}

	public static EObject findSource(Connector connector) {
		EList<PortInstance> ports = connector.getPort();
		for (PortInstance port : ports) {
			if (port.getOutComponent() != null) {
				return port;
			}
		}

		return null;
	}

	public static EObject findTarget(Connector connector) {
		EList<PortInstance> ports = connector.getPort();
		for (PortInstance port : ports) {
			if (port.getInComponent() != null) {
				return port;
			}
		}

		return null;
	}

	public static boolean isConnectionSourceOk(PortInstance port) {
		if (port.getConnect() == null && port.getOutComponent() != null) {
			return true;
		}
		return false;
	}

	public static boolean isConnectionTargetOk(PortInstance port) {
		if (port.getConnect() == null && port.getInComponent() != null) {
			return true;
		}
		return false;
	}
	
	public static void deletePortInstance(PortInstance port){

			Architecture root = (Architecture) getRootElement(port);
			for(EObject object : root.eContents()){
				if(object instanceof Connector){
					if(port.getConnect().equals(object)){
						EcoreUtil.remove(object);
					}
				}
			
			EcoreUtil.remove(port);
		}
	}
	
	public static void deleteComponentInstance(ComponentInstance component){
		for(EObject object : component.eContents()){
			if(object instanceof ComponentInstance){
				deleteComponentInstance((ComponentInstance) object);
			}else{
				deletePortInstance((PortInstance) object);
			}
		}
		EcoreUtil.remove(component);
	}

}
