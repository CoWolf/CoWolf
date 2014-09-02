package de.uni_stuttgart.iste.cowolf.transformation.component_diagram_fault_tree;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;

import de.unistuttgart.ensure.transformations.util.TransformationsUtil;

public class CoWolfConstructTree extends ConstructTree {
	
	protected static void init(Resource source, Resource target) {
		// Add the own extension to importable instance models.
		TransformationsUtil.registerExtensions();

		// Load Packages.
		TransformationsUtil.loadPackages();

		// Load instance models.
		saInstanceModel = source;
		faulttreeInstanceModel = target;

		// Initialize the graphs.
		saGraph = new EGraphImpl(saInstanceModel);
		faulttreeGraph = new EGraphImpl(faulttreeInstanceModel);
	}
}
