package de.uni_stuttgart.iste.cowolf.transformation.component_diagram_fault_tree;

import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

import de.unistuttgart.ensure.transformations.util.HenshinTransformations;
import de.unistuttgart.ensure.transformations.util.TransformationsConstants;
import de.unistuttgart.ensure.transformations.util.TransformationsLogger;
import de.unistuttgart.ensure.transformations.util.TransformationsUtil;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.*;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.*;
/**
 * Provides the functionality to construct a fault tree out of a given software
 * architecture instance model.
 * 
 * @version 0.05 27 December 2013
 * @author Yannic Noller
 * 
 */
public class ConstructTree {

	protected static Resource saInstanceModel;
	protected static Resource faulttreeInstanceModel;
	protected static EGraph saGraph;
	protected static EGraph faulttreeGraph;

	/**
	 * Maps the components to the created event. Only the names are saved. Only
	 * original events are concerned, not copies. <component, event>
	 */
	private static HashMap<String, String> componentEventMap = new HashMap<String, String>();

	/**
	 * Maps the error instances to the components. Only the names are saved.
	 * <error instance, component>
	 */
	private static HashMap<String, String> errorComponentMap = new HashMap<String, String>();

	/**
	 * Maps the failure instances to the components. Only the names are saved.
	 * <failure instance, component>
	 */
	private static HashMap<String, String> failureComponentMap = new HashMap<String, String>();

	/**
	 * Creates the name of the related error or failure to the given component
	 * instance.
	 * 
	 * @param comp_name
	 *            - String
	 * @return String
	 */
	private static String createErrorOrFailureName(String comp_name) {
		String event_name = comp_name + " component fails";
		return event_name;
	}

	/**
	 * Creates the name of the related event to the given component instance.
	 * 
	 * @param comp_name
	 *            - String
	 * @return String
	 */
	private static String createEventName(String comp_name) {
		String event_name = "'" + comp_name + " component fails' occurs";
		return event_name;
	}

	/**
	 * Gets the related event to the given component instance.
	 * 
	 * @param component
	 *            - ComponentInstance
	 * @param graph
	 *            - EGraph
	 * @return Event
	 */
	private static Event getRelatedEventToComponentInstance(
			ComponentInstance component, EGraph graph) {
		for (EObject object : graph.getRoots()) {
			if (object instanceof FaultTree) {
				for (Event event : ((FaultTree) object).getEvent()) {
					if (event.getName() != null
							&& event.getName().equals(
									componentEventMap.get(component.getName()))) {
						return event;
					}
				}
				break;
			}
		}
		return null;
	}

	public static void init(Resource source, Resource target) {
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

	/**
	 * Determines whether the two events are already connected in the given
	 * direction.
	 * 
	 * @param source_event
	 *            - Event
	 * @param target_event
	 *            - Even
	 * @return boolean
	 */
	private static boolean isConnectionBetween(Event source_event,
			Event target_event) {

		if (source_event == target_event) {
			return true;
		}

		Gate outputGate = source_event.getOutputGate();
		Gate inputGate = target_event.getInputGate();

		if (outputGate == null) {
			return false;
		} else if (inputGate == null) {
			return false;
		} else if (outputGate == inputGate) {
			return true;
		}

		Gate temp_gate;
		Event temp_event;
		do {
			temp_gate = outputGate.getOutputGate();
			temp_event = outputGate.getOutputEvent();

			if (temp_gate != null && temp_event == null) {
				outputGate = temp_gate;
			} else if (temp_gate == null && temp_event != null) {
				outputGate = temp_event.getOutputGate();
			} else if (temp_gate == null && temp_event == null) {
				break;
			} else {
				throw new RuntimeException(
						"Gate must not have an outgoing gate AND a outgoing event!");
			}
		} while (outputGate != inputGate);

		if (outputGate == inputGate) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Builds a fault tree out of the given software architecture model.
	 */
	public static void run() {
		// Logging.
		TransformationsLogger.log("Preparing...");

		// Local variables.
		boolean result = false;
		int gateCounter = 0;
		boolean anyFailureInstanceCreated = false;
		boolean anyErrorInstanceCreated = false;
		final String DEFAULT_ERROR_TYPE_NAME = "DefaultErrorType";
		final String DEFAULT_FAILURE_TYPE_NAME = "DefaultFailureType";

		// Merge all input models in the saGraph.
		saGraph = TransformationsUtil.mergeInstanceModels(saGraph,
				faulttreeGraph);

		// Clear the fault tree graph to have an initial fault tree with a empty
		// root element.
		clearFaultTree(saGraph, true);

		// Create the events and errors/failures.
		TransformationsLogger
				.log(">>>(1) Creating events, errors and failures...");
		for (ComponentInstance current_component : TransformationsUtil
				.getAllComponentInstances(saGraph)) {
			String eventName = createEventName(current_component.getName());
			String errorFailureName = createErrorOrFailureName(current_component
					.getName());

			if (current_component.getSubcomponent().isEmpty()
					&& current_component.getOutPorts().isEmpty()) {
				// Components without sub component AND without outgoing port
				// should be linked with a basic event.

				// Create BasicEvent.
				int eventID = HenshinTransformations.getFreeEventID(saGraph, false);
				result = HenshinTransformations.createBasicEvent(eventID, eventName, "", saGraph, true);

				// If this is the first ErrorInstance, then create the default
				// error type.
				if (!anyErrorInstanceCreated) {
					result = HenshinTransformations.createErrorType(
							DEFAULT_ERROR_TYPE_NAME,
							saGraph, true);
				}

				// Create ErrorInstance.
				result = HenshinTransformations.createErrorInstance(errorFailureName,
						DEFAULT_ERROR_TYPE_NAME, saGraph, true);

				if (result) {
					anyErrorInstanceCreated = true;
				}

				// Connect ErrorInstance to BasicEvent.
				result = HenshinTransformations.createConnectionBetweenBasicEventAndErrorInstance(
						eventName, errorFailureName, saGraph, true);

				// Connect ErrorInstance to ComponentInstance (or simply keep in
				// mind to do it at the end).
				errorComponentMap.put(errorFailureName,
						current_component.getName());

				// Save mapping between component and event.
				componentEventMap.put(current_component.getName(), eventName);

			} else if (!current_component.getSubcomponent().isEmpty()) {
				// Components with sub components should be linked with an
				// intermediate event.

				// Create IntermediateEvent.
				int eventID = HenshinTransformations.getFreeEventID(saGraph, false);
				result = HenshinTransformations.createIntermediateEvent(eventID, eventName, "", saGraph, true);

				// If this is the first FailureInstance, then create the default
				// failure type.
				if (!anyFailureInstanceCreated) {
					result = HenshinTransformations.createFailureType(DEFAULT_FAILURE_TYPE_NAME, saGraph, true);
				}

				// Create FailureInstance.
				result = HenshinTransformations.createFailureInstance(errorFailureName,
						DEFAULT_FAILURE_TYPE_NAME, saGraph, true);

				if (result) {
					anyFailureInstanceCreated = true;
				}

				// Connect FailureInstance to IntermediateEvent.
				result = HenshinTransformations.createConnectionBetweenIntermediateEventAndFailureInstance(
						eventName, errorFailureName, saGraph, true);

				// Connect FailureInstance to ComponentInstance (or simply keep
				// in mind to do it at the end).
				failureComponentMap.put(errorFailureName,
						current_component.getName());

				// Save mapping between component and event.
				componentEventMap.put(current_component.getName(), eventName);

			} else {
				// Components with outgoing ports should be linked with an
				// intermediate event.

				// Create IntermediateEvent.
				int eventID = HenshinTransformations.getFreeEventID(saGraph, false);
				result = HenshinTransformations.createIntermediateEvent(eventID, eventName, "", saGraph, true);

				// If this is the first FailureInstance, then create the default
				// failure type.
				if (!anyFailureInstanceCreated) {
					result = HenshinTransformations.createFailureType(DEFAULT_FAILURE_TYPE_NAME, saGraph, true);
				}

				// Create FailureInstance.
				result = HenshinTransformations.createFailureInstance(errorFailureName,
						DEFAULT_FAILURE_TYPE_NAME, saGraph, true);

				if (result) {
					anyFailureInstanceCreated = true;
				}

				// Connect FailureInstance to IntermediateEvent.
				result = HenshinTransformations.createConnectionBetweenIntermediateEventAndFailureInstance(
						eventName, errorFailureName, saGraph, true);

				// Connect FailureInstance to ComponentInstance (or simply keep
				// in mind to do it at the end).
				failureComponentMap.put(errorFailureName,
						current_component.getName());

				// Save mapping between component and event.
				componentEventMap.put(current_component.getName(), eventName);

			}
		}

		// Connect sub components to their parent component via OR-Gate.
		TransformationsLogger
				.log(">>>(2) Connect sub component events to their parent component events...");
		for (ComponentInstance comp : TransformationsUtil
				.getAllComponentInstances(saGraph)) {
			EList<ComponentInstance> subcomponents = comp.getSubcomponent();
			if (!subcomponents.isEmpty()) {
				// Create OR-Gate, target: parent component, source: all sub
				// components.
				result = HenshinTransformations.createORGate(++gateCounter, saGraph, true);

				result = HenshinTransformations.createConnectionGateToEvent(gateCounter,
						componentEventMap.get(comp.getName()), saGraph, true);

				for (ComponentInstance subcomp : subcomponents) {
					result = HenshinTransformations.createConnectionEventToGate(
							componentEventMap.get(subcomp.getName()),
							String.valueOf(gateCounter), saGraph, true);
				}
			}
		}

		// 5. Dependency, like outgoing port, lead to incoming event/gate. ->
		// Find the events and link them to them to the the according upper
		// event. Look for already existing incoming gates and events and
		// connect them.
		TransformationsLogger
				.log(">>>(3) Connect component events to connected component events...");
		for (ComponentInstance source_component : TransformationsUtil
				.getAllComponentInstances(saGraph)) {
			for (PortInstance out_port : source_component.getOutPorts()) {
				Connector connector = out_port.getConnect();
				if (connector != null) {
					for (PortInstance in_port : out_port.getConnect().getPort()) {
						if (in_port != out_port) {
							ComponentInstance target_component = in_port
									.getInComponent();

							Event source_component_event = getRelatedEventToComponentInstance(
									source_component, saGraph);
							Event target_component_event = getRelatedEventToComponentInstance(
									target_component, saGraph);

							/*
							 * Want to connect event for connected_component to
							 * the event for comp.
							 */

							// Check whether there is already a connection from
							// the event for target_component to the event for
							// source_component. Then we're not allowed to
							// create a loop and then we should create a copy of
							// the source_component and connected the copy with
							// the target_component.
							if (isConnectionBetween(source_component_event,
									target_component_event)) {
								// Create copy of this event.
								String event_copy_name = target_component_event
										.getName() + "_Copy";

								if (target_component_event instanceof BasicEvent) {
									String error_copy_name = ((BasicEvent) target_component_event)
											.getInstance().get(0).getName()
											+ "_Copy";
									String error_copy_type = ((BasicEvent) target_component_event)
											.getInstance().get(0).getType()
											.getName();

									// Create copy of BasicEvent
									int eventID = HenshinTransformations.getFreeEventID(saGraph, false);
									result = HenshinTransformations.createBasicEvent(
											eventID,
											event_copy_name,
											target_component_event
													.getDescription(), saGraph, true);

									// Create copy of ErrorInstance
									result = HenshinTransformations.createErrorInstance(
											error_copy_name, error_copy_type, saGraph, true);

									// Connect ErrorInstanceCopy to
									// BasicEventCopy
									result = HenshinTransformations.createConnectionBetweenBasicEventAndErrorInstance(
											event_copy_name, error_copy_name, saGraph, true);

									// Connect ErrorInstanceCopy to
									// ComponentInstance (or simply keep in mind
									// to do it at the end).
									errorComponentMap.put(error_copy_name,
											target_component.getName());

								} else if (target_component_event instanceof IntermediateEvent) {
									String failure_copy_name = ((IntermediateEvent) target_component_event)
											.getInstance().get(0).getName()
											+ "_Copy";
									String failure_copy_type = ((IntermediateEvent) target_component_event)
											.getInstance().get(0).getType()
											.getName();

									// Create copy of IntermediateEvent
									int eventID = HenshinTransformations.getFreeEventID(saGraph, false);
									result = HenshinTransformations.createIntermediateEvent(
											eventID,
											event_copy_name,
											target_component_event
													.getDescription(), saGraph, true);

									// Create copy of FailureInstance
									result = HenshinTransformations.createFailureInstance(
											failure_copy_name,
											failure_copy_type, saGraph, true);

									// Connect FailureInstanceCopy to
									// IntermediateEventCopy
									result = HenshinTransformations.createConnectionBetweenIntermediateEventAndFailureInstance(
											event_copy_name, failure_copy_name, saGraph, true);

									// Connect FailureInstanceCopy to
									// ComponentInstance (or simply keep in mind
									// to do it at the end).
									failureComponentMap.put(failure_copy_name,
											target_component.getName());

								} else {
									throw new RuntimeException(
											"Unsupported event type: "
													+ target_component_event
															.toString());
								}

								// Change the target_copy_event to continue with
								// the connection building.
								target_component_event = TransformationsUtil
										.getEventByName(event_copy_name,
												saGraph);
							}

							// Maybe there is already an Gate for the
							// source_component,
							// check it!
							if (source_component_event != null) {
								Gate inputGate = source_component_event
										.getInputGate();
								if (inputGate == null) {
									// No Gate, create one!
									result = HenshinTransformations.createORGate(++gateCounter, saGraph, true);

									result = HenshinTransformations.createConnectionGateToEvent(
											gateCounter,
											source_component_event.getName(), saGraph, true);

									result = HenshinTransformations.createConnectionEventToGate(
											target_component_event.getName(),
											String.valueOf(gateCounter), saGraph, true);
								} else {
									result = HenshinTransformations.createConnectionEventToGate(
											target_component_event.getName(),
											inputGate.getId(), saGraph, true);
								}

							} else {
								throw new RuntimeException(
										"No related event for component instance, but there must be one.");
							}

							break;
						}
					}
				} else {
					throw new RuntimeException(
							"PortInstance "
									+ out_port.getName()
									+ " has no Connector object. This is an invalid SA model!");
				}
			}
		}

		/*
		 * 6. Use a topological search to determine which events/gates should be
		 * connected and linked to the hazard. -> TODO
		 */

		// Sync root objects.
		TransformationsLogger.log("Syncing models...");
		saInstanceModel = TransformationsUtil.getSAInstanceModel(saGraph,
				saInstanceModel);
		faulttreeInstanceModel = TransformationsUtil.getFaultTreeInstanceModel(
				saGraph, faulttreeInstanceModel);

		// Save the models.
		TransformationsLogger.log("Saving models...");
		TransformationsUtil.saveResource(saInstanceModel);
		TransformationsUtil.saveResource(faulttreeInstanceModel);

		// Logging.
		TransformationsLogger.log("Construction of FaultTree terminated.");

		// Create Traces between SA model and FT model.
		TransformationsLogger.log("Creating Traces...");
		for (String error_name : errorComponentMap.keySet()) {
			ConnectComponentInstanceWithErrorInstance.run(saInstanceModel,
					faulttreeInstanceModel,
					errorComponentMap.get(error_name), error_name);
		}
		for (String failure_name : failureComponentMap.keySet()) {
			ConnectComponentInstanceWithFailureInstance.run(saInstanceModel,
					faulttreeInstanceModel,
					failureComponentMap.get(failure_name), failure_name);
		}
	}
	
	/**
	 * Clears the fault tree. Execute not until the merge process finished!
	 * 
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static void clearFaultTree(EGraph graph, boolean logging) {
		boolean result;
		do {
			result = HenshinTransformations.clearEvent(graph, logging);
		} while (result);
		do {
			result = HenshinTransformations.clearGate(graph, logging);
		} while (result);
		do {
			result = HenshinTransformations.clearErrorType(graph, logging);
		} while (result);
		do {
			result = HenshinTransformations.clearErrorInstance(graph, logging);
		} while (result);
		do {
			result = HenshinTransformations.clearFailureType(graph, logging);
		} while (result);
		do {
			result = HenshinTransformations.clearFailureInstance(graph, logging);
		} while (result);
		do {
			result = HenshinTransformations.clearTrace(graph, logging);
		} while (result);
	}

}
