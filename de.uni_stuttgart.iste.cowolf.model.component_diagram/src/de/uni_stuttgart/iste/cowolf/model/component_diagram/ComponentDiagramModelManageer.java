package de.uni_stuttgart.iste.cowolf.model.component_diagram;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;

import de.uni_stuttgart.iste.cowolf.model.AbstractArchitectureModelManager;
import de.uni_stuttgart.iste.cowolf.model.ModelTypeInfo;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ComponentDiagramImpl;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.Component_diagramFactoryImpl;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.Component_diagramPackageImpl;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.DependencyImpl;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.InterfaceImpl;

/**
 * 
 * @author Rene Trefft
 *
 */
public class ComponentDiagramModelManageer extends AbstractArchitectureModelManager {
	
	@Override
	public ModelTypeInfo getModelTypeInfo() {
		
		List<Class<?>> properContents = new ArrayList<Class<?>>();

		// create the allowed EClasses
		properContents.add(Component_diagramFactoryImpl.class);
		properContents.add(Component_diagramPackageImpl.class);
		properContents.add(ComponentDiagramImpl.class);
		properContents.add(DependencyImpl.class);
		properContents.add(InterfaceImpl.class);
		ModelTypeInfo mti = new ModelTypeInfo("Component Diagram", properContents, Component_diagramPackage.eNS_URI);
		
		return mti;
	}

	@Override
	public boolean isManaged(final Resource model) {
		if (model == null || model.getContents() == null
				|| model.getContents().size() == 0)
			return false;
		else
			return (model.getContents().get(0) instanceof ComponentDiagram);

	}

}
