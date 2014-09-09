package de.uni_stuttgart.iste.cowolf.transformation.component_diagram_fault_tree;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

import de.unistuttgart.ensure.transformations.util.HenshinTransformations;
import de.unistuttgart.ensure.transformations.util.TransformationsConstants;
import de.unistuttgart.ensure.transformations.util.TransformationsLogger;
import de.unistuttgart.ensure.transformations.util.TransformationsUtil;

/**
 * Provides the functionality to adjust the fault tree based on the changes in SA.
 * 
 * @version 0.03 23 April 2014
 * @author Yannic Noller
 * 
 */
public class ChangeTree {

	private static Resource saInstanceModel;
	private static Resource faulttreeInstanceModel;
	private static EGraph saGraph;
	private static EGraph faulttreeGraph;

	private static List<String> handledNewConnections;

	// private static Comparison compare(String path1, String path2) {
	// // Add the own extension to importable instance models.
	// TransformationsUtil.registerExtensions();
	//
	// // Load Packages.
	// TransformationsUtil.loadPackages();
	//
	// // Create a resource set for the working directory.
	// HenshinResourceSet resourceSet = new HenshinResourceSet();
	//
	// // Load instance models.
	// Resource saVersion1 = resourceSet.getResource(path1);
	// Resource saVersion2 = resourceSet.getResource(path2);
	//
	// // Configure EMF Compare
	// IEObjectMatcher matcher = DefaultMatchEngine
	// .createDefaultEObjectMatcher(UseIdentifiers.NEVER);
	// IComparisonFactory comparisonFactory = new DefaultComparisonFactory(
	// new DefaultEqualityHelperFactory());
	// IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(
	// matcher, comparisonFactory);
	// matchEngineFactory.setRanking(20);
	// IMatchEngine.Factory.Registry matchEngineRegistry = new
	// MatchEngineFactoryRegistryImpl();
	// matchEngineRegistry.add(matchEngineFactory);
	// EMFCompare comparator = EMFCompare.builder()
	// .setMatchEngineFactoryRegistry(matchEngineRegistry).build();
	//
	// // Compare the two models
	// IComparisonScope scope = EMFCompare.createDefaultScope(saVersion2,
	// saVersion1);
	// return comparator.compare(scope);
	// }

	/**
	 * Changes a basic event into an intermediate event. Therefore also the associated error instance need to be transformed to an intermediate event.
	 * 
	 * @param basicEvent
	 *            - name of the basic event
	 * @param errorInstance
	 *            - name of the error instance which is connected to the basic event
	 * @param associatedComponent
	 *            - name of the component instance which is associated to the error instance
	 */
	private static void changeBasicEventToIntermediateEvent(String basicEvent, String errorInstance, String associatedComponent) {
		// There should be a Error Instance.
		if (errorInstance == null) {
			return;
		}

		// Delete old Error Instance.
		boolean result = true;
		while (result) {
			result = HenshinTransformations.deleteTargetTraceFromErrorInstance(errorInstance, saGraph, true);
		}
		HenshinTransformations.deleteErrorInstance(errorInstance, saGraph, true);

		// Create default Failure Type, if necessary.
		if (!HenshinTransformations.existsFailureType(HenshinTransformations.DEFAULT_FAILURE_TYPE_NAME, saGraph, true)) {
			HenshinTransformations.createFailureType(HenshinTransformations.DEFAULT_FAILURE_TYPE_NAME, saGraph, true);
		}

		// Create new Failure Instance.
		String failureInstance = errorInstance; // set replacing names
		HenshinTransformations.createAssociatedFailureInstance(associatedComponent, failureInstance, HenshinTransformations.DEFAULT_FAILURE_TYPE_NAME, saGraph,
				true);

		// Get description.
		String description = HenshinTransformations.getDescription(basicEvent, saGraph, true);
		if (description == null) {
			description = "";
		}

		// Get input gate.
		String inputGate = HenshinTransformations.getInputGateForEvent(basicEvent, saGraph, true);

		// Get output gate.
		String outputGate = HenshinTransformations.getOutputGateOfEvent(basicEvent, saGraph, true);

		// Get out event.
		String outEvent = HenshinTransformations.getOutputEventForBasicEvent(basicEvent, saGraph, true);

		// Delete old basic event.
		HenshinTransformations.deleteEvent(basicEvent, saGraph, true);

		String intermediateEvent = basicEvent;

		// Create new intermediate event.

		HenshinTransformations.createIntermediateEvent(intermediateEvent, description, saGraph, true);

		// Restore connections for new event.
		if (inputGate != null) {
			HenshinTransformations.createConnectionGateToEvent(inputGate, intermediateEvent, saGraph, true);
		}
		if (outputGate != null) {
			HenshinTransformations.createConnectionEventToGate(intermediateEvent, String.valueOf(outputGate), saGraph, true);
		}
		if (outEvent != null) {
			HenshinTransformations.connectIntermediateEventToIntermediateEvent(intermediateEvent, outEvent, saGraph, true);
		}

		// Connect new failure instance with new intermediate event.
		HenshinTransformations.createConnectionBetweenIntermediateEventAndFailureInstance(intermediateEvent, failureInstance, saGraph, true);
	}

	/**
	 * Creates the name of the related error or failure to the given component instance.
	 * 
	 * @param componentName
	 *            - String
	 * @return String
	 */
	private static String createErrorOrFailureName(String componentName) {
		String errorName = componentName + " component fails";
		return errorName;
	}

	/**
	 * Creates the name of the related event to the given component instance.
	 * 
	 * @param componentName
	 *            - String
	 * @return String
	 */
	private static String createEventName(String componentName) {
		String eventName = "'" + componentName + " component fails' occurs";
		return eventName;
	}

	/**
	 * Handles the actions which are needed with new component instances.
	 * 
	 * @param newComponentInstances
	 *            - list of String objects which contain the names of the new components
	 */
	private static void handleNewComponentInstances(List<String> newComponentInstances) {
		for (String newComponentInstance : newComponentInstances) {

			System.out.println("## new component instance: " + newComponentInstance);

			// Get sub components of the new component instance.
			List<String> subComponents = HenshinTransformations.getSubComponents(newComponentInstance, saGraph, false);

			// Get all outgoing port instances of the new component instance.
			List<String> outgoingPorts = HenshinTransformations.getOutPorts(newComponentInstance, saGraph, false);

			if (subComponents.isEmpty() && outgoingPorts.isEmpty()) {
				/*
				 * newComponentInstance has NO sub components AND newComponentInstance has NO outgoing port
				 */

				// Get error instances of the new component.
				List<String> errorInstances = HenshinTransformations.getErrorInstancesForComponent(newComponentInstance, saGraph, true);

				// Corresponding error instance to the new component.
				String errorInstance = null;

				/*
				 * Check if there already exists an error instance. If not create one. If yes, then check if there already exists an BasicEvent for that
				 * component.
				 */
				if (errorInstances.isEmpty()) {
					// Create default error type if necessary.
					if (!HenshinTransformations.existsErrorType(HenshinTransformations.DEFAULT_ERROR_TYPE_NAME, saGraph, true)) {
						HenshinTransformations.createErrorType(HenshinTransformations.DEFAULT_ERROR_TYPE_NAME, saGraph, true);
					}

					/*
					 * Create new error instance and link it with the new component
					 */
					errorInstance = createErrorOrFailureName(newComponentInstance);
					HenshinTransformations.createErrorInstance(errorInstance, HenshinTransformations.DEFAULT_ERROR_TYPE_NAME, saGraph, true);

					// Link it to component via Trace
					HenshinTransformations.connectComponentInstanceWithErrorInstance(newComponentInstance, errorInstance, saGraph, true);

				} else {
					errorInstance = errorInstances.get(0);
				}

				// errorInstance contains now the actual error instance which is
				// connected to the new component instance

				// Get BasicEvent for ErrorInstance
				String basicEvent = HenshinTransformations.getBasicEventForErrorInstance(errorInstance, saGraph, true);

				// If no basic event exists create one.
				if (basicEvent == null) {
					basicEvent = createEventName(newComponentInstance);
					HenshinTransformations.createBasicEvent(basicEvent, "", saGraph, true);

					// Connect basic event with that error instance.
					HenshinTransformations.createConnectionBetweenBasicEventAndErrorInstance(basicEvent, errorInstance, saGraph, true);
				}

				/*
				 * We ensured now the error instance and the basic event. Now it's necessary to include the basic event in the correct position in the fault
				 * tree, but this must be done based on other changes: new connectors...
				 */

			} else {
				/* newComponentInstance has sub components or outgoing ports */

				// Get error instances of the new component.
				List<String> failureInstances = HenshinTransformations.getFailureInstancesForComponent(newComponentInstance, saGraph, true);

				// Corresponding failure instance to the new component.
				String failureInstance = null;

				// Check whether the new component already has a failure
				// instance. If not create a new one and if necessary create the
				// default failure type.
				if (failureInstances.isEmpty()) {
					// Create default failure type if necessary.
					if (!HenshinTransformations.existsFailureType(HenshinTransformations.DEFAULT_FAILURE_TYPE_NAME, saGraph, true)) {
						HenshinTransformations.createFailureType(HenshinTransformations.DEFAULT_FAILURE_TYPE_NAME, saGraph, true);
					}

					// Create new failures instance and link it with the new
					// component
					failureInstance = createErrorOrFailureName(newComponentInstance);
					HenshinTransformations.createFailureInstance(failureInstance, HenshinTransformations.DEFAULT_FAILURE_TYPE_NAME, saGraph, true);

					// Link it to component via Trace
					HenshinTransformations.connectComponentInstanceWithFailureInstance(newComponentInstance, failureInstance, saGraph, true);
				} else {
					failureInstance = failureInstances.get(0);
				}

				// failureInstance contains now the actual error instance which
				// is connected to the new component instance

				// Get IntermediateEvent for FailureInstance
				String intermediateEvent = HenshinTransformations.getIntermediateEventForFailureInstance(failureInstance, saGraph, true);

				// If no intermediate event exists create one.
				if (intermediateEvent == null) {
					intermediateEvent = createEventName(newComponentInstance);
					HenshinTransformations.createIntermediateEvent(intermediateEvent, "", saGraph, true);

					// Connect the intermediate event with that failure
					// instance.
					HenshinTransformations.createConnectionBetweenIntermediateEventAndFailureInstance(intermediateEvent, failureInstance, saGraph, true);
				}

				/*
				 * We ensured now the error instance and the basic event. Now it's necessary to include the basic event in the correct position in the fault
				 * tree, but this must be done based on other changes: new connectors...
				 */

			}
		}
	}

	private static void handleNewComponentTypes(List<String> newComponentTypes) {
		// New component type doesn't lead to direct changes in fault tree.
		for (String newComponentType : newComponentTypes) {
			System.out.println("## new component type: " + newComponentType);
		}
	}

	/**
	 * Handles a new connection in SA model, that could be caused by a new connector or a new port instance.
	 * 
	 * @param sourceComponent
	 *            - name of the source component instance
	 * @param targetComponent
	 *            - name of the target component instance
	 */
	private static void handleNewConnection(String sourceComponent, String targetComponent) {
		// Get errors and failures and change source and target terms because of
		// usage relation.
		List<String> sourceErrorInstances = HenshinTransformations.getErrorInstancesForComponent(targetComponent, saGraph, true);
		List<String> sourceFailureInstances = HenshinTransformations.getFailureInstancesForComponent(targetComponent, saGraph, true);
		List<String> targetErrorInstances = HenshinTransformations.getErrorInstancesForComponent(sourceComponent, saGraph, true);
		List<String> targetFailureInstances = HenshinTransformations.getFailureInstancesForComponent(sourceComponent, saGraph, true);

		String sourceErrorInstance = null;
		if (sourceErrorInstances != null && !sourceErrorInstances.isEmpty()) {
			sourceErrorInstance = sourceErrorInstances.get(0);
		}

		String sourceFailureInstance = null;
		if (sourceFailureInstances != null && !sourceFailureInstances.isEmpty()) {
			sourceFailureInstance = sourceFailureInstances.get(0);
		}

		String targetErrorInstance = null;
		if (targetErrorInstances != null && !targetErrorInstances.isEmpty()) {
			targetErrorInstance = targetErrorInstances.get(0);
		}

		String targetFailureInstance = null;
		if (targetFailureInstances != null && !targetFailureInstances.isEmpty()) {
			targetFailureInstance = targetFailureInstances.get(0);
		}

		// Quit the current connector because the components have no error or
		// failures or have both, which is not considered in that version.
		if (!(sourceErrorInstance == null ^ sourceFailureInstance == null)) {
			return;
		}

		if (!(targetErrorInstance == null ^ targetFailureInstance == null)) {
			return;
		}

		// Get the events for the components.
		String sourceEvent = null;
		if (sourceErrorInstance != null) {
			sourceEvent = HenshinTransformations.getBasicEventForErrorInstance(sourceErrorInstance, saGraph, true);
		} else {
			sourceEvent = HenshinTransformations.getIntermediateEventForFailureInstance(sourceFailureInstance, saGraph, true);
		}
		String targetEvent = null;
		if (targetErrorInstance != null) {
			targetEvent = HenshinTransformations.getBasicEventForErrorInstance(targetErrorInstance, saGraph, true);
		} else {
			targetEvent = HenshinTransformations.getIntermediateEventForFailureInstance(targetFailureInstance, saGraph, true);
		}

		// If source component is a software component AND target component is a sensor, then apply the associated SCE+SE pattern. Otherwise use the new
		// connection pattern.
		if (HenshinTransformations.isSoftwareComponent(sourceComponent, saGraph, true) && HenshinTransformations.isSensor(targetComponent, saGraph, true)) {

			// If SCE+SE have no outgoing connection, then create OR + IE.
			if (hasNoOutgoingConnection(sourceEvent) && hasNoOutgoingConnection(targetEvent)) {
				// Create OR-Gate.
				int newORGate = HenshinTransformations.getFreeGateID(saGraph, true);
				HenshinTransformations.createORGate(String.valueOf(newORGate), saGraph, true);

				// Create IE.
				String intermediate_event_name = "SCE+SE_Pattern_" + newORGate;
				HenshinTransformations.createIntermediateEvent(intermediate_event_name, "", saGraph, true);

				// Create connection OR to IE.
				HenshinTransformations.createConnectionGateToEvent(String.valueOf(newORGate), intermediate_event_name, saGraph, true);

				// Connect SCE+SE to OR.
				HenshinTransformations.createConnectionEventToGate(sourceEvent, String.valueOf(newORGate), saGraph, true);
				HenshinTransformations.createConnectionEventToGate(targetEvent, String.valueOf(newORGate), saGraph, true);
			}

			// IF one event already has outgoing connection, and one not.
			else if (hasNoOutgoingConnection(sourceEvent) ^ hasNoOutgoingConnection(targetEvent)) {

				String alreadyConnectedEvent = "";
				String yetNotConnectedEvent = "";

				// IF SCE has not outgoing IE AND SE connected to IE, then (OR) + IE connection.
				if (!hasNoOutgoingConnection(targetEvent)) {
					alreadyConnectedEvent = targetEvent;
					yetNotConnectedEvent = sourceEvent;
				}

				// If SCE connected to IE AND SE has no outgoing connection, then (OR) + IE connection.
				else {
					alreadyConnectedEvent = sourceEvent;
					yetNotConnectedEvent = targetEvent;
				}

				String gate = HenshinTransformations.getOutputGateOfEvent(alreadyConnectedEvent, saGraph, true);
				String orGate = "";

				String intermediate_event = "";

				// IF target event is connected to a gate.
				if (gate != null) {
					// Get top intermediate event.
					intermediate_event = HenshinTransformations.getOutputEvent(gate, saGraph, true);

					if (HenshinTransformations.isORGate(gate, saGraph, true)) {
						orGate = gate;
					} else {
						orGate = String.valueOf(HenshinTransformations.getFreeGateID(saGraph, true));
						HenshinTransformations.createORGate(orGate, saGraph, true);

						// Reconnect original gate to new or gate.
						HenshinTransformations.deleteConnectionGateToEvent(gate, intermediate_event, saGraph, true);
						HenshinTransformations.createConnectionGateToGate(gate, orGate, saGraph, true);
					}
				}

				// IF target event is directly connected to an intermediate event.
				else {
					// Get top intermediate event.
					if (HenshinTransformations.isBasicEvent(alreadyConnectedEvent, saGraph, true)) {
						intermediate_event = HenshinTransformations.getOutputEventForBasicEvent(alreadyConnectedEvent, saGraph, true);
					} else if (HenshinTransformations.isIntermediateEvent(alreadyConnectedEvent, saGraph, true)) {
						intermediate_event = HenshinTransformations.getOutputEventForIntermediateEvent(alreadyConnectedEvent, saGraph, true);
					} else {
						TransformationsLogger.log("No intermediate event found, but this is not possible.");
					}

					orGate = String.valueOf(HenshinTransformations.getFreeGateID(saGraph, true));
					HenshinTransformations.createORGate(orGate, saGraph, true);

					// Reconnect target event to OR gate.
					if (HenshinTransformations.isBasicEvent(alreadyConnectedEvent, saGraph, true)) {
						HenshinTransformations.deleteConnectionBEToIE(alreadyConnectedEvent, intermediate_event, saGraph, true);
					} else if (HenshinTransformations.isIntermediateEvent(alreadyConnectedEvent, saGraph, true)) {
						HenshinTransformations.deleteConnectionIEToIE(alreadyConnectedEvent, intermediate_event, saGraph, true);
					}

					HenshinTransformations.createConnectionEventToGate(alreadyConnectedEvent, String.valueOf(orGate), saGraph, true);
				}

				// Create connection OR to IE.
				HenshinTransformations.createConnectionGateToEvent(orGate, intermediate_event, saGraph, true);

				// Connect SCE to OR.
				HenshinTransformations.createConnectionEventToGate(yetNotConnectedEvent, String.valueOf(orGate), saGraph, true);
			}

			// If SCE+SE already connected to different IE, then ?.
			else {
				// TODO
			}

		} else {
			// If target event is a basic event, replace it with intermediate event
			if (HenshinTransformations.isBasicEvent(targetEvent, saGraph, true)) {
				changeBasicEventToIntermediateEvent(targetEvent, targetErrorInstance, targetComponent);
			}

			// Target event should be now an intermediate event. Check that.
			if (!HenshinTransformations.isIntermediateEvent(targetEvent, saGraph, true)) {
				return;
			}

			if (HenshinTransformations.hasORGateAsInput(targetEvent, saGraph, true)) {
				String orGateID = HenshinTransformations.getInputGateForEvent(targetEvent, saGraph, true);
				if (orGateID == null) {
					return;
				}
				HenshinTransformations.createConnectionEventToGate(sourceEvent, String.valueOf(orGateID), saGraph, true);
			} else if (HenshinTransformations.hasGateAsInput(targetEvent, saGraph, true)) {
				String existingInputGate = HenshinTransformations.getInputGateForEvent(targetEvent, saGraph, true);
				if (HenshinTransformations.isORGate(existingInputGate, saGraph, true)) {

					// Put source event to newORGate.
					HenshinTransformations.createConnectionEventToGate(sourceEvent, String.valueOf(existingInputGate), saGraph, true);

				} else {

					// Create new OR gate as parent gate, which will be connected to
					// target component later.
					String newORGate = String.valueOf(HenshinTransformations.getFreeGateID(saGraph, true));
					HenshinTransformations.createORGate(newORGate, saGraph, true);

					// Delete relation existingInPutGate.
					HenshinTransformations.deleteConnectionGateToEvent(existingInputGate, targetEvent, saGraph, true);

					// Put existingInPutGate as input for newORGate.
					HenshinTransformations.createConnectionGateToGate(existingInputGate, newORGate, saGraph, true);

					// Put event to newORGate.
					HenshinTransformations.createConnectionEventToGate(sourceEvent, String.valueOf(newORGate), saGraph, true);

					// Connect new OR gate with target component.
					HenshinTransformations.createConnectionGateToEvent(newORGate, targetComponent, saGraph, true);
				}

			} else if (HenshinTransformations.hasEventAsInput(targetEvent, saGraph, true)) {
				// Create OR-Gate and put existing input and source event to
				// OR-Gate.
				String gateID = String.valueOf(HenshinTransformations.getFreeGateID(saGraph, true));
				HenshinTransformations.createORGate(gateID, saGraph, true);

				String existingInputEvent = HenshinTransformations.getInputEventOfIntermediateEvent(targetEvent, saGraph, true);

				// Remove connection of input event.
				if (HenshinTransformations.isBasicEvent(existingInputEvent, saGraph, true)) {
					HenshinTransformations.deleteInputRelationBEToIE(existingInputEvent, targetEvent, saGraph, true);
				} else {
					HenshinTransformations.deleteInputRelationIEToIE(existingInputEvent, targetEvent, saGraph, true);
				}

				// Connect new event and old incoming event to new OR Gate.
				HenshinTransformations.createConnectionEventToGate(existingInputEvent, String.valueOf(gateID), saGraph, true);
				HenshinTransformations.createConnectionEventToGate(sourceEvent, String.valueOf(gateID), saGraph, true);

				// Connect new OR Gate to target event.
				HenshinTransformations.createConnectionGateToEvent(gateID, targetEvent, saGraph, true);
			} else {
				if (HenshinTransformations.isBasicEvent(sourceEvent, saGraph, true)) {
					HenshinTransformations.connectBasicEventToIntermediateEvent(sourceEvent, targetEvent, saGraph, true);
				} else if (HenshinTransformations.isIntermediateEvent(sourceEvent, saGraph, true)) {
					HenshinTransformations.connectIntermediateEventToIntermediateEvent(sourceEvent, targetEvent, saGraph, false);
				} else {
					// source event is no basic event and no intermediate event,
					// then this case is not considered.
					return;
				}
			}

		}

	}

	private static void handleNewConnectors(List<String> newConnectors) {
		for (String newConnector : newConnectors) {
			System.out.println("## new connector: " + newConnector);

			// Check whether the new connector creates a new connection between
			// components.

			// Get the connected ports.
			List<String> connectedPorts = HenshinTransformations.getPorts(newConnector, saGraph, true);

			// If connected ports are null or not two, i.e. the connection is
			// not closed yet, don't consider this object.
			if (connectedPorts == null || connectedPorts.size() != 2) {
				continue;
			}

			// Get now the events of the connected components to check and
			// adjust the structure of the fault tree.
			String sourceComponent = null;
			String targetComponent = null;
			for (String port : connectedPorts) {
				if (HenshinTransformations.isPortInstanceInPort(port, saGraph, true)) {
					targetComponent = HenshinTransformations.getInComponentOfPort(port, saGraph, true);
				} else {
					sourceComponent = HenshinTransformations.getOutComponentOfPort(port, saGraph, true);
				}
			}

			// If components are still null, there is an error in the model.
			if (sourceComponent == null || targetComponent == null) {
				continue;
			}

			if (!handledNewConnections.contains(newConnector)) {
				handledNewConnections.add(newConnector);
				handleNewConnection(sourceComponent, targetComponent);
			}
		}
	}

	private static void handleNewPortInstances(List<String> newPortInstances) {
		for (String newPortInstance : newPortInstances) {
			System.out.println("## new port instance: " + newPortInstance);

			// Check whether the new port instance creates a new connection
			// between components.

			// Get the connected Port.
			String connectedPort = HenshinTransformations.getConnectedPortOfPort(newPortInstance, saGraph, true);
			if (connectedPort == null) {
				continue;
			}

			// Get the connected components.
			String sourceComponent = null;
			String targetComponent = null;
			if (HenshinTransformations.isPortInstanceOutPort(newPortInstance, saGraph, true)) {
				sourceComponent = HenshinTransformations.getOutComponentOfPort(newPortInstance, saGraph, true);
			} else {
				targetComponent = HenshinTransformations.getInComponentOfPort(newPortInstance, saGraph, true);
			}
			if (HenshinTransformations.isPortInstanceOutPort(connectedPort, saGraph, true)) {
				sourceComponent = HenshinTransformations.getOutComponentOfPort(connectedPort, saGraph, true);
			} else {
				targetComponent = HenshinTransformations.getInComponentOfPort(connectedPort, saGraph, true);
			}

			// If components are still null, there is an error in the model.
			if (sourceComponent == null || targetComponent == null) {
				continue;
			}

			// Get the connector of this connection.
			String connector = HenshinTransformations.getConnector(newPortInstance, saGraph, true);
			if (connector == null) {
				continue;
			}

			if (!handledNewConnections.contains(connector)) {
				handledNewConnections.add(connector);
				handleNewConnection(sourceComponent, targetComponent);
			}
		}
	}

	private static void handleNewPortTypes(List<String> newPortTypes) {
		// New port type doesn't lead to direct changes in fault tree.
		for (String newPortType : newPortTypes) {
			System.out.println("## new port type: " + newPortType);
		}
	}

	private static void handleNewSubComponentInstances(List<String> newSubComponentInstances) {
		for (String newSubComponent : newSubComponentInstances) {
			// TODO How include new sub component instances?
			System.out.println("## new sub component instance: " + newSubComponent);
		}
	}

	/**
	 * Determines whether the given event has no outgoing connections.
	 * 
	 * @param event_name
	 *            - name of the event
	 * @return TRUE for no outgoing connections, otherwise FALSE.
	 */
	private static boolean hasNoOutgoingConnection(String event_name) {
		// FALSE if there is an outgoing gate connection.
		if (HenshinTransformations.getOutputGateOfEvent(event_name, saGraph, true) != null) {
			return false;
		}

		// FALSE if there is an outgoing event connection.
		else if (HenshinTransformations.isBasicEvent(event_name, saGraph, true)
				&& HenshinTransformations.getOutputEventForBasicEvent(event_name, saGraph, true) != null) {
			return false;
		} else if (HenshinTransformations.isIntermediateEvent(event_name, saGraph, true)
				&& HenshinTransformations.getOutputEventForIntermediateEvent(event_name, saGraph, true) != null) {
			return false;
		}

		// TRUE otherwise.
		else {
			return true;
		}
	}

	public static void init(Resource sa, Resource ft) {
		// Add the own extension to importable instance models.
		TransformationsUtil.registerExtensions();
		
		// Load instance models.
		saInstanceModel = sa;
		faulttreeInstanceModel = ft;
		
		// Load Packages.
		TransformationsUtil.loadPackages();

		handledNewConnections = new ArrayList<String>();
	}

	/**
	 * Provides the functionality to adjust the fault tree based on the changes in SA.
	 */
	public static EGraph run(EGraph graph,
	/* EList<Diff> changes */List<String> newComponentTypes, List<String> newPortTypes, List<String> newComponentInstances, List<String> newPortInstances,
			List<String> newSubComponentInstances, List<String> newConnectors) {
		/*
		 * Assumptions for that version: -----------------------------------------------------------------
		 * 
		 * 1. only one error instance/failure instance per component
		 * 
		 * 2. Diff can be built automatically.
		 * 
		 * 3. Ignore failure instances of components which should refer to basic events (analog for error instances).
		 */

		// Logging.
		TransformationsLogger.log("Preparing...");
		System.out.println("\n\n");

		// Merge all input models in the saGraph.
		saGraph = graph;

		// Handle new component types.
		handleNewComponentTypes(newComponentTypes);

		// Handle new port types.
		handleNewPortTypes(newPortTypes);

		// Handle new component instances.
		handleNewComponentInstances(newComponentInstances);

		// Handle new port instances.
		handleNewPortInstances(newPortInstances);

		// Handle new sub component instances.
		handleNewSubComponentInstances(newSubComponentInstances);

		// Handle new connectors.
		handleNewConnectors(newConnectors);

		// Sync root objects.
		System.out.println("\n\n");
		// TransformationsLogger.log("DON'T Syncing models... DEVELOPING PHASE");

		TransformationsLogger.log("Syncing models...");
		saInstanceModel = TransformationsUtil.getSAInstanceModel(saGraph, saInstanceModel);
		faulttreeInstanceModel = TransformationsUtil.getFaultTreeInstanceModel(saGraph, faulttreeInstanceModel);

		// Logging.
		TransformationsLogger.log("Construction of FaultTree terminated.");
		return saGraph;
	}
}