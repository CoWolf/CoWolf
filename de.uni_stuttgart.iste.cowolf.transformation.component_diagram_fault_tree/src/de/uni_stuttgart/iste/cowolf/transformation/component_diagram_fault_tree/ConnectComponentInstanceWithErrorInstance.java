package de.uni_stuttgart.iste.cowolf.transformation.component_diagram_fault_tree;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

import de.unistuttgart.ensure.transformations.util.HenshinTransformations;
import de.unistuttgart.ensure.transformations.util.TransformationsLogger;
import de.unistuttgart.ensure.transformations.util.TransformationsUtil;

/**
 * Provides the functionality to execute the rule
 * "ConnectComponentInstanceWithErrorInstance".
 * 
 * @version 1.01 14 December 2013
 * @author Yannic Noller
 * 
 */
public class ConnectComponentInstanceWithErrorInstance {

	private static Resource saInstanceModel;
	private static Resource faulttreeInstanceModel;
	private static EGraph saGraph;
	private static EGraph faulttreeGraph;

	private static void init(Resource sa, Resource ft) {
		// Add the own extension to importable instance models.
		TransformationsUtil.registerExtensions();

		// Load Packages.
		TransformationsUtil.loadPackages();

		// Load instance models.
		saInstanceModel = sa;
		faulttreeInstanceModel = ft;

		// Initialize the graphs.
		saGraph = new EGraphImpl(saInstanceModel);
		faulttreeGraph = new EGraphImpl(faulttreeInstanceModel);
	}

	/**
	 * Executes the rule "ConnectComponentInstanceWithErrorInstance" with the given
	 * parameter.
	 * 
	 * @param input
	 *            - String name of file
	 * @param component_instance
	 *            - String
	 * @param error_instance
	 *            - String
	 */
	public static void run(Resource sa, Resource ft, String component_instance, String error_instance) {
		// Logging.
		TransformationsLogger.log("Preparing...");
		init(sa, ft);
		// Merge all input models in the saGraph.
		saGraph = TransformationsUtil.mergeInstanceModels(saGraph, faulttreeGraph);

		HenshinTransformations.connectComponentInstanceWithErrorInstance(component_instance, error_instance, saGraph, true);

		// Sync root objects.
		TransformationsLogger.log("Syncing models...");
		saInstanceModel = TransformationsUtil.getSAInstanceModel(saGraph, saInstanceModel);
		faulttreeInstanceModel = TransformationsUtil.getFaultTreeInstanceModel(saGraph, faulttreeInstanceModel);
		
		// Save the models.
		TransformationsLogger.log("Saving models...");
		TransformationsUtil.saveResource(saInstanceModel);
		TransformationsUtil.saveResource(faulttreeInstanceModel);

		// Logging.
		TransformationsLogger.log("Terminated.");
	}
}
