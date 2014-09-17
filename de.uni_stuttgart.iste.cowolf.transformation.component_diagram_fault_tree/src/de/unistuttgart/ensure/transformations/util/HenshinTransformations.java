package de.unistuttgart.ensure.transformations.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Match;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.MatchImpl;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.Parameter;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

/**
 * Provides the methods to execute the related henshin rules.
 * 
 * @version 1.07 10 May 2014
 * @author Yannic Noller
 * 
 */
public class HenshinTransformations {

	public static final String DEFAULT_ERROR_TYPE_NAME = "DefaultErrorType";
	public static final String DEFAULT_FAILURE_TYPE_NAME = "DefaultFailureType";

	/**
	 * Executes the rule ChangeParentComponent.
	 * 
	 * @param child_component
	 *            - String
	 * @param parent_component
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return boolean
	 */
	public static boolean changeParentComponent(String child_component, String parent_component, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.SA_HENSHIN), true).getUnit("ChangeParentComponent");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("child_component", child_component);
		application.setParameterValue("parent_component", parent_component);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(child_component);
			param.add(parent_component);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule ClearErrorInstance. Should be executed till it returns false.
	 * 
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean clearErrorInstance(EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("ClearErrorInstance");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), result);
		}

		return result;
	}

	/**
	 * Executes the rule ClearErrorType. Should be executed till it returns false.
	 * 
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean clearErrorType(EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("ClearErrorType");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), result);
		}

		return result;
	}

	/**
	 * Executes the rule ClearEvent. Should be executed till it returns false.
	 * 
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean clearEvent(EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("ClearEvent");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), result);
		}

		return result;
	}

	/**
	 * Executes the rule ClearFailureInstance. Should be executed till it returns false.
	 * 
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean clearFailureInstance(EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("ClearFailureInstance");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), result);
		}

		return result;
	}

	/**
	 * Executes the rule ClearFailureType. Should be executed till it returns false.
	 * 
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean clearFailureType(EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("ClearFailureType");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), result);
		}

		return result;
	}

	/**
	 * Executes the rule ClearGate. Should be executed till it returns false.
	 * 
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean clearGate(EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("ClearGate");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), result);
		}

		return result;
	}

	/**
	 * Executes the rule ClearTrace. Should be executed till it returns false.
	 * 
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean clearTrace(EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("ClearTrace");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), result);
		}

		return result;
	}

	/**
	 * Executes the rule CreateConnectionGateToEvent.
	 * 
	 * @param source_event
	 *            - name of the source event object
	 * @param target_event
	 *            - name of the target event object
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean connectBasicEventToIntermediateEvent(String source_event, String target_event, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.CHANGE_TREE_HENSHIN), true).getUnit("ConnectBasicEventToIntermediateEvent");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("source_event", source_event);
		application.setParameterValue("target_event", target_event);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(source_event);
			param.add(target_event);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule ConnectComponentInstanceWithErrorInstance.
	 * 
	 * @param component_instance
	 *            - String
	 * @param error_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean connectComponentInstanceWithErrorInstance(String component_instance, String error_instance, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.ENSURE_HENSHIN), true).getUnit("ConnectComponentInstanceWithErrorInstance");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("component_instance", component_instance);
		application.setParameterValue("error_instance", error_instance);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(component_instance);
			param.add(error_instance);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule ConnectComponentInstanceWithFailureInstance.
	 * 
	 * @param component_instance
	 *            - String
	 * @param failure_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean connectComponentInstanceWithFailureInstance(String component_instance, String failure_instance, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.ENSURE_HENSHIN), true).getUnit("ConnectComponentInstanceWithFailureInstance");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("component_instance", component_instance);
		application.setParameterValue("failure_instance", failure_instance);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(component_instance);
			param.add(failure_instance);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule ConnectConnectorWithFailureInstance.
	 * 
	 * @param connector
	 *            - String
	 * @param failure_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean connectConnectorWithFailureInstance(String connector, String failure_instance, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.ENSURE_HENSHIN), true).getUnit("ConnectConnectorWithFailureInstance");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("connector", connector);
		application.setParameterValue("failure_instance", failure_instance);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(connector);
			param.add(failure_instance);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule ConnectIntermediateEventToIntermediateEvent.
	 * 
	 * @param source_event
	 *            - name of the source event object
	 * @param target_event
	 *            - name of the target event object
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean connectIntermediateEventToIntermediateEvent(String source_event, String target_event, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.CHANGE_TREE_HENSHIN), true).getUnit("ConnectIntermediateEventToIntermediateEvent");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("source_event", source_event);
		application.setParameterValue("target_event", target_event);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(source_event);
			param.add(target_event);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule ConnectPortInstanceWithErrorInstance.
	 * 
	 * @param port_instance
	 *            - String
	 * @param error_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean connectPortInstanceWithErrorInstance(String port_instance, String error_instance, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.ENSURE_HENSHIN), true).getUnit("ConnectPortInstanceWithErrorInstance");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("port_instance", port_instance);
		application.setParameterValue("error_instance", error_instance);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(port_instance);
			param.add(error_instance);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule ConnectPortInstanceWithFailureInstance.
	 * 
	 * @param port_instance
	 *            - String
	 * @param failure_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean connectPortInstanceWithFailureInstance(String port_instance, String failure_instance, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.ENSURE_HENSHIN), true).getUnit("ConnectPortInstanceWithFailureInstance");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("port_instance", port_instance);
		application.setParameterValue("failure_instance", failure_instance);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(port_instance);
			param.add(failure_instance);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule CreateANDGate.
	 * 
	 * @param gate_id
	 *            - int
	 * 
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean createANDGate(String gate_id, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("CreateANDGate");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("gate_id", gate_id);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), gate_id, result);
		}

		return result;
	}

	/**
	 * Executes the rule CreateAssociatedConnector.
	 * 
	 * @param connector
	 *            - String
	 * @param port1
	 *            - String
	 * @param port2
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean createAssociatedConnector(String connector, String port1, String port2, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.SA_HENSHIN), true).getUnit("CreateAssociatedConnector");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("connector", connector);
		application.setParameterValue("port1", port1);
		application.setParameterValue("port2", port2);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(connector);
			param.add(port1);
			param.add(port2);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule CreateAssociatedErrorInstance.
	 * 
	 * @param component_instance
	 *            - String
	 * @param error_name
	 *            - String
	 * @param error_type
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean createAssociatedErrorInstance(String component_instance, String error_name, String error_type, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.ENSURE_HENSHIN), true).getUnit("CreateAssociatedErrorInstance");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("component_instance", component_instance);
		application.setParameterValue("error_name", error_name);
		application.setParameterValue("error_type", error_type);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(component_instance);
			param.add(error_name);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule CreateAssociatedFailureInstance.
	 * 
	 * @param component_instance
	 *            - String
	 * @param failure_name
	 *            - String
	 * @param failure_type
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean createAssociatedFailureInstance(String component_instance, String failure_name, String failure_type, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.ENSURE_HENSHIN), true).getUnit("CreateAssociatedFailureInstance");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("component_instance", component_instance);
		application.setParameterValue("failure_name", failure_name);
		application.setParameterValue("failure_type", failure_type);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(component_instance);
			param.add(failure_name);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule CreateBasicEvent.
	 * 
	 * @param event_id
	 *            - int
	 * @param event_name
	 *            - String
	 * @param pDescription
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean createBasicEvent(String event_name, String event_description, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("CreateBasicEvent");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("event_name", event_name);
		application.setParameterValue("event_description", event_description);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(event_name);
			param.add(event_description);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule CreateConnectionBetweenBasicEventAndErrorInstance.
	 * 
	 * @param basic_event
	 *            - String
	 * @param error_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean createConnectionBetweenBasicEventAndErrorInstance(String basic_event, String error_instance, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("CreateConnectionBetweenBasicEventAndErrorInstance");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("basic_event", basic_event);
		application.setParameterValue("error_instance", error_instance);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(basic_event);
			param.add(error_instance);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule CreateConnectionBetweenIntermediateEventAndFailureInstance.
	 * 
	 * @param intermediate_event
	 *            - String
	 * @param failure_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean createConnectionBetweenIntermediateEventAndFailureInstance(String intermediate_event, String failure_instance, EGraph graph,
			boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("CreateConnectionBetweenIntermediateEventAndFailureInstance");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("intermediate_event", intermediate_event);
		application.setParameterValue("failure_instance", failure_instance);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(intermediate_event);
			param.add(failure_instance);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule CreateConnectionEventToGate.
	 * 
	 * @param event_name
	 *            - String
	 * @param gate_id
	 *            - int
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean createConnectionEventToGate(String event_name, String gate_id, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("CreateConnectionEventToGate");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("event_name", event_name);
		application.setParameterValue("gate_id", gate_id);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(event_name);
			param.add(gate_id);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule CreateConnectionGateToEvent.
	 * 
	 * @param gate_id
	 *            - int
	 * @param event_name
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean createConnectionGateToEvent(String gate_id, String event_name, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("CreateConnectionGateToEvent");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("gate_id", gate_id);
		application.setParameterValue("event_name", event_name);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(gate_id);
			param.add(event_name);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule CreateConnectionGateToGate.
	 * 
	 * @param gate_id1
	 *            - int
	 * @param gate_id2
	 *            - int
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean createConnectionGateToGate(String gate_id1, String gate_id2, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("CreateConnectionGateToGate");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("gate_id1", gate_id1);
		application.setParameterValue("gate_id2", gate_id2);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(gate_id1);
			param.add(gate_id2);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule CreateErrorInstance.
	 * 
	 * @param error_name
	 *            - String
	 * @param type
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean createErrorInstance(String error_name, String type, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("CreateErrorInstance");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("error_name", error_name);
		application.setParameterValue("type", type);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(error_name);
			param.add(type);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule CreateErrorType.
	 * 
	 * @param type_name
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean createErrorType(String type_name, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("CreateErrorType");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("type_name", type_name);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), type_name, result);
		}

		return result;
	}

	/**
	 * Executes the rule CreateFailureInstance.
	 * 
	 * @param failure_name
	 *            - String
	 * @param type
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean createFailureInstance(String failure_name, String type, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("CreateFailureInstance");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("failure_name", failure_name);
		application.setParameterValue("type", type);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(failure_name);
			param.add(type);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule CreateFailureType.
	 * 
	 * @param type_name
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean createFailureType(String type_name, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("CreateFailureType");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("type_name", type_name);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), type_name, result);
		}

		return result;
	}

	/**
	 * Executes the rule CreateINHIBITGate.
	 * 
	 * @param gate_id
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean createINHIBITGate(String gate_id, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("CreateINHIBITGate");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("gate_id", gate_id);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), gate_id, result);
		}

		return result;
	}

	/**
	 * Executes the rule CreateIntermediateEvent.
	 * 
	 * @param event_id
	 *            - int
	 * @param event_name
	 *            - String
	 * @param event_description
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean createIntermediateEvent(String event_name, String event_description, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("CreateIntermediateEvent");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("event_name", event_name);
		application.setParameterValue("event_description", event_description);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(event_name);
			param.add(event_description);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule CreateNewFailureWithPreviousError to create a new FailureInstance with the given name and the given previous error.
	 * 
	 * @param new_name
	 *            - String
	 * @param previous_error
	 *            - String
	 * @param failure_type
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean createNewFailureWithPreviousError(String new_name, String previous_error, String failure_type, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("CreateNewFailureWithPreviousError");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("new_name", new_name);
		application.setParameterValue("previous_error", previous_error);
		application.setParameterValue("failure_type", failure_type);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(new_name);
			param.add(previous_error);
			param.add(failure_type);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule CreateNewFailureWithPreviousError to create a new FailureInstance with the given name and the given previous failure.
	 * 
	 * @param new_name
	 *            - String
	 * @param previous_failure
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean createNewFailureWithPreviousFailure(String new_name, String previous_failure, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("CreateNewFailureWithPreviousFailure");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("new_name", new_name);
		application.setParameterValue("previous_failure", previous_failure);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(new_name);
			param.add(previous_failure);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule CreateORGate.
	 * 
	 * @param gate_id
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean createORGate(String gate_id, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("CreateORGate");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("gate_id", gate_id);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), gate_id, result);
		}

		return result;
	}

	/**
	 * Executes the rule CreatePriorANDGate.
	 * 
	 * @param gate_id
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean createPriorANDGate(String gate_id, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("CreatePriorANDGate");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("gate_id", gate_id);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), gate_id, result);
		}

		return result;
	}

	/**
	 * Executes the rule CreateXORGate.
	 * 
	 * @param gate_id
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean createXORGate(String gate_id, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("CreateXORGate");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("gate_id", gate_id);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), gate_id, result);
		}

		return result;
	}

	/**
	 * Executes the rule DeleteComponentInstance.
	 * 
	 * @param component_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean deleteComponentInstance(String component_instance, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.SA_HENSHIN), true).getUnit("DeleteComponentInstance");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("component_instance", component_instance);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), component_instance, result);
		}

		return result;
	}

	/**
	 * Executes the rule DeleteComponentType.
	 * 
	 * @param type_name
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean deleteComponentType(String type_name, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.SA_HENSHIN), true).getUnit("DeleteComponentType");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("component_type", type_name);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), type_name, result);
		}

		return result;
	}

	/**
	 * Executes the rule DeleteConnectionBEToIE.
	 * 
	 * @param basic_event
	 *            - String
	 * @param intermediate_event
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return boolean
	 */
	public static boolean deleteConnectionBEToIE(String basic_event, String intermediate_event, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("DeleteConnectionBEToIE");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("basic_event", basic_event);
		application.setParameterValue("intermediate_event", intermediate_event);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(basic_event);
			param.add(intermediate_event);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule DeleteConnectionBetweenParentAndChildComponent.
	 * 
	 * @param child_component
	 *            - String
	 * @param parent_component
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return boolean
	 */
	public static boolean deleteConnectionBetweenParentAndChildComponent(String child_component, String parent_component, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.SA_HENSHIN), true).getUnit("DeleteConnectionBetweenParentAndChildComponent");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("child_component", child_component);
		application.setParameterValue("parent_component", parent_component);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(child_component);
			param.add(parent_component);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule DeleteConnectionGateToEvent.
	 * 
	 * @param gateID
	 *            - ID of source gate
	 * @param eventNames
	 *            - name of target event
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return boolean
	 */
	public static boolean deleteConnectionGateToEvent(String gateID, String eventName, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("DeleteConnectionGateToEvent");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("gateID", gateID);
		application.setParameterValue("eventName", eventName);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(gateID);
			param.add(eventName);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule DeleteConnectionIEToIE.
	 * 
	 * @param intermediate_event_1
	 *            - String
	 * @param intermediate_event_2
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return boolean
	 */
	public static boolean deleteConnectionIEToIE(String intermediate_event_1, String intermediate_event_2, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("DeleteConnectionIEToIE");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("intermediate_event_1", intermediate_event_1);
		application.setParameterValue("intermediate_event_2", intermediate_event_2);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(intermediate_event_1);
			param.add(intermediate_event_2);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule DeleteConnector.
	 * 
	 * @param connector
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean deleteConnector(String connector, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.SA_HENSHIN), true).getUnit("DeleteConnector");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("connector", connector);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), connector, result);
		}

		return result;
	}

	/**
	 * Executes the rule "DeleteConnectorForPortInstance".
	 * 
	 * @param port_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean deleteConnectorForPortInstance(String port_instance, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.SA_HENSHIN), true).getUnit("DeleteConnectorForPortInstance");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("port_instance", port_instance);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), port_instance, result);
		}

		return result;
	}

	/**
	 * Executes the rule "DeleteErrorInstance".
	 * 
	 * @param error_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean deleteErrorInstance(String error_instance, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("DeleteErrorInstance");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("error_instance", error_instance);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), error_instance, result);
		}

		return result;
	}

	/**
	 * Executes the rule "DeleteErrorType".
	 * 
	 * @param error_type
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean deleteErrorType(String error_type, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("DeleteErrorType");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("error_type", error_type);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), error_type, result);
		}

		return result;
	}

	/**
	 * Executes the rule DeleteEvent.
	 * 
	 * @param event_name
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean deleteEvent(String event_name, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("DeleteEvent");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("event_name", event_name);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), event_name, result);
		}

		return result;
	}

	/**
	 * Executes the rule "DeleteFailureInstance".
	 * 
	 * @param failure_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean deleteFailureInstance(String failure_instance, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("DeleteFailureInstance");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("failure_instance", failure_instance);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), failure_instance, result);
		}

		return result;
	}

	/**
	 * Executes the rule "DeleteFailureType".
	 * 
	 * @param failure_type
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean deleteFailureType(String failure_type, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("DeleteFailureType");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("failure_type", failure_type);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), failure_type, result);
		}

		return result;
	}

	/**
	 * Executes the rule DeleteGate.
	 * 
	 * @param gateID
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean deleteGate(String gateID, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("DeleteGate");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("gateID", gateID);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), gateID, result);
		}

		return result;
	}

	/**
	 * Executes the rule DeleteInputRelationBEToIE.
	 * 
	 * @param source_event
	 *            - String
	 * @param target_events
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean deleteInputRelationBEToIE(String source_event, String target_event, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.CHANGE_TREE_HENSHIN), true).getUnit("DeleteInputRelationBEToIE");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("source_event", source_event);
		application.setParameterValue("target_event", target_event);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(source_event);
			param.add(target_event);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule DeleteInputRelationIEToIE.
	 * 
	 * @param source_event
	 *            - String
	 * @param target_events
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean deleteInputRelationIEToIE(String source_event, String target_event, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.CHANGE_TREE_HENSHIN), true).getUnit("DeleteInputRelationIEToIE");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("source_event", source_event);
		application.setParameterValue("target_event", target_event);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(source_event);
			param.add(target_event);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule "DeletePortInstance".
	 * 
	 * @param port_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean deletePortInstance(String port_instance, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.SA_HENSHIN), true).getUnit("DeletePortInstance");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("port_instance", port_instance);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), port_instance, result);
		}

		return result;
	}

	/**
	 * Executes the rule DeletePortType.
	 * 
	 * @param port_type
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean deletePortType(String port_type, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.SA_HENSHIN), true).getUnit("DeletePortType");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("port_type", port_type);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), port_type, result);
		}

		return result;
	}

	/**
	 * Executes the rule DeleteSourceTraceFromComponentInstance.
	 * 
	 * @param component_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean deleteSourceTraceFromComponentInstance(String component_instance, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.SA_HENSHIN), true).getUnit("DeleteSourceTraceFromComponentInstance");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("component_instance", component_instance);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), component_instance, result);
		}

		return result;
	}

	/**
	 * Executes the rule "DeleteSourceTraceFromPortInstance".
	 * 
	 * @param port_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean deleteSourceTraceFromPortInstance(String port_instance, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.SA_HENSHIN), true).getUnit("DeleteSourceTraceFromPortInstance");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("port_instance", port_instance);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), port_instance, result);
		}

		return result;
	}

	/**
	 * Executes the rule "DeleteTargetTraceFromErrorInstance".
	 * 
	 * @param error_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean deleteTargetTraceFromErrorInstance(String error_instance, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("DeleteTargetTraceFromErrorInstance");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("error_instance", error_instance);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), error_instance, result);
		}

		return result;
	}

	/**
	 * Executes the rule "DeleteTargetTraceFromFailureInstance".
	 * 
	 * @param failure_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean deleteTargetTraceFromFailureInstance(String failure_instance, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("DeleteTargetTraceFromFailureInstance");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("failure_instance", failure_instance);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), failure_instance, result);
		}

		return result;
	}

	/**
	 * Executes the rule EnsureError.
	 * 
	 * @param component_instance
	 *            - String
	 * @param new_event_id
	 *            - int
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean ensureError(String component_instance, int new_event_id, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.ENSURE_HENSHIN), true).getUnit("EnsureError");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("component_instance", component_instance);
		application.setParameterValue("new_event_id", new_event_id);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), component_instance, result);
		}

		return result;
	}

	/**
	 * Executes the rule EnsureFailures.
	 * 
	 * @param component_instance
	 *            - String
	 * @param new_event_id
	 *            - int
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean ensureFailure(String component_instance, int new_event_id, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.ENSURE_HENSHIN), true).getUnit("EnsureFailure");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("component_instance", component_instance);
		application.setParameterValue("new_event_id", new_event_id);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), component_instance, result);
		}

		return result;
	}

	/**
	 * Executes the rule ExistsErrorType to determine whether the given error type already exists in the instance model.
	 * 
	 * @param error_type
	 *            - name of error type as String object
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return true if error type already exists in model, otherwise false
	 */
	public static boolean existsErrorType(String error_type, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.CHANGE_TREE_HENSHIN), true).getUnit("ExistsErrorType");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("error_type", error_type);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(error_type);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule ExistsFailureType(failure_type:EString) to determine whether the given failure type already exists in the instance model.
	 * 
	 * @param failure_type
	 *            - name of failure type as String object
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return true if failure type already exists in model, otherwise false
	 */
	public static boolean existsFailureType(String failure_type, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.CHANGE_TREE_HENSHIN), true).getUnit("ExistsFailureType");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("failure_type", failure_type);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(failure_type);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Gets the affected ComponentInstance for the rule PropagateErrorToComponentFromPort without executing the rule.
	 * 
	 * @param port_instance
	 *            - String
	 * @param error_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return affected component instance
	 * @throws RuntimeException
	 */
	public static String getAffectedComponentForRulePropagateErrorToComponentFromPort(String port_instance, String error_instance, EGraph graph, boolean logging)
			throws RuntimeException {
		// List of Strings for the resulting ComponentInstances (should be only
		// one).
		List<String> componentInstances = new ArrayList<String>();

		// Get the rule and the according multirule, which store the result
		// parameter.
		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.ENSURE_HENSHIN), true).getUnit("PropagateErrorToComponentFromPort");
		Rule multiRule = rule.getMultiRule("propagateError");
		Parameter resultParameter = multiRule.getParameter("affected_component");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("port_instance"), port_instance);
		partialMatch.setParameterValue(rule.getParameter("error_instance"), error_instance);

		// Find all matches of the rule with the used graph.
		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				componentInstances.add(multiMatch.getParameterValue(resultParameter).toString());
			}

		}

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(port_instance);
			param.add(error_instance);
			TransformationsLogger.logRuleMatching(rule.getName(), param, componentInstances.size());
		}

		if (componentInstances.isEmpty()) {
			return null;
		} else if (componentInstances.size() == 1) {
			return componentInstances.get(0);
		} else {
			throw new RuntimeException("More than one component found. This is not possible.");
		}
	}

	/**
	 * Gets the affected ComponentInstance for the rule PropagateFailureToComponentFromPort without executing the rule.
	 * 
	 * @param port_instance
	 *            - String
	 * @param failure_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return affected component instance
	 * @throws RuntimeException
	 */
	public static String getAffectedComponentForRulePropagateFailureToComponentFromPort(String port_instance, String failure_instance, EGraph graph,
			boolean logging) throws RuntimeException {
		// List of Strings for the resulting ComponentInstances.
		List<String> componentInstances = new ArrayList<String>();

		// Get the rule and the according multirule, which store the result
		// parameter.
		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.ENSURE_HENSHIN), true).getUnit("PropagateFailureToComponentFromPort");
		Rule multiRule = rule.getMultiRule("propagateError");
		Parameter resultParameter = multiRule.getParameter("affected_component");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("port_instance"), port_instance);
		partialMatch.setParameterValue(rule.getParameter("failure_instance"), failure_instance);

		// Find all matches of the rule with the used graph.
		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				componentInstances.add(multiMatch.getParameterValue(resultParameter).toString());
			}

		}

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(port_instance);
			param.add(failure_instance);
			TransformationsLogger.logRuleMatching(rule.getName(), param, componentInstances.size());
		}

		if (componentInstances.isEmpty()) {
			return null;
		} else if (componentInstances.size() == 1) {
			return componentInstances.get(0);
		} else {
			throw new RuntimeException("More than one component found. This is not possible.");
		}
	}

	/**
	 * Gets the affected ComponentInstances for the rule PropagateFailureToParentComponent without executing the rule.
	 * 
	 * @param component_instance
	 *            - String
	 * @param failure_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return the affected component instance
	 * @throws RuntimeException
	 */
	public static String getAffectedComponentForRulePropagateFailureToParentComponent(String component_instance, String failure_instance, EGraph graph,
			boolean logging) throws RuntimeException {
		// List of Strings for the resulting components (it should be only
		// one).
		List<String> components = new ArrayList<String>();

		// Get the rule and the according multirule, which store the result
		// parameter.
		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.ENSURE_HENSHIN), true).getUnit("PropagateFailureToParentComponent");
		Rule multiRule = rule.getMultiRule("propagateError");
		Parameter resultParameter = multiRule.getParameter("affected_component");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("component_instance"), component_instance);
		partialMatch.setParameterValue(rule.getParameter("failure_instance"), failure_instance);

		// Find all matches of the rule with the used graph.
		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				components.add(multiMatch.getParameterValue(resultParameter).toString());
			}
		}

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(component_instance);
			param.add(failure_instance);
			TransformationsLogger.logRuleMatching(rule.getName(), param, components.size());
		}

		if (components.isEmpty()) {
			return null;
		} else if (components.size() == 1) {
			return components.get(0);
		} else {
			throw new RuntimeException("More than one parent component found. This is not possible.");
		}
	}

	/**
	 * Gets the affected PortInstance for the rule PropagateFailureToConnectedPortFromPort without executing the rule.
	 * 
	 * @param port_instance
	 *            - String
	 * @param failure_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return the affected port instance
	 * @throws RuntimeException
	 */
	public static String getAffectedPortForRulePropagateFailureToConnectedPortFromPort(String port_instance, String failure_instance, EGraph graph,
			boolean logging) throws RuntimeException {
		// List of Strings for the resulting PortInstances.
		List<String> portInstances = new ArrayList<String>();

		// Get the rule and the according multirule, which store the result
		// parameter.
		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.ENSURE_HENSHIN), true).getUnit("PropagateFailureToConnectedPortFromPort");
		Rule multiRule = rule.getMultiRule("propagateError");
		Parameter resultParameter = multiRule.getParameter("affected_port");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("port_instance"), port_instance);
		partialMatch.setParameterValue(rule.getParameter("failure_instance"), failure_instance);

		// Find all matches of the rule with the used graph.
		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				portInstances.add(multiMatch.getParameterValue(resultParameter).toString());
			}

		}

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(port_instance);
			param.add(failure_instance);
			TransformationsLogger.logRuleMatching(rule.getName(), param, portInstances.size());
		}

		if (portInstances.isEmpty()) {
			return null;
		} else if (portInstances.size() == 1) {
			return portInstances.get(0);
		} else {
			throw new RuntimeException("More than one connected port found. This is not possible.");
		}
	}

	/**
	 * Gets the basic event for the given error instance. If there is no basic event defined, this method will return null.
	 * 
	 * @param error_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return String
	 * @throws RuntimeException
	 *             If there are more than one basic event, this method will throw a RuntimeException.
	 */
	public static String getBasicEventForErrorInstance(String error_instance, EGraph graph, boolean logging) throws RuntimeException {
		// List of Strings for the resulting basic events (it should be
		// only one).
		List<String> basicEvents = new ArrayList<String>();

		// Get the rule and the according multirule, which store the result
		// parameter.
		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("GetBasicEventForErrorInstance");
		Rule multiRule = rule.getMultiRule("searchBasicEvent");
		Parameter resultParameter = multiRule.getParameter("found_basic_event");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("error_instance"), error_instance);

		// Find all matches of the rule with the used graph.
		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				basicEvents.add(multiMatch.getParameterValue(resultParameter).toString());
			}
		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), error_instance, basicEvents.size());
		}

		if (basicEvents.isEmpty()) {
			return null;
		} else if (basicEvents.size() == 1) {
			return basicEvents.get(0);
		} else {
			throw new RuntimeException("More than one basic event found. This is not possible.");
		}
	}

	/**
	 * Gets the component instances for the given component type.
	 * 
	 * @param component_type
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return List<String>
	 */
	public static List<String> getComponentInstancesOfType(String component_type, EGraph graph, boolean logging) {
		// List of Strings for the resulting PortInstances.
		List<String> componentInstances = new ArrayList<String>();

		// Get the rule and the according multirule, which store the result
		// parameter.
		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.SA_HENSHIN), true).getUnit("GetComponentInstancesOfType");
		Rule multiRule = rule.getMultiRule("searchComponents");
		Parameter resultParameter = multiRule.getParameter("found_component");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("component_type"), component_type);

		// Find all matches of the rule with the used graph.
		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				componentInstances.add(multiMatch.getParameterValue(resultParameter).toString());
			}

		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), component_type, componentInstances.size());
		}

		return componentInstances;
	}

	/**
	 * Gets the connected port for the given PortInstance. If there is no port, this method will return null.
	 * 
	 * @param port_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return the affected port instance
	 * @throws RuntimeException
	 *             If there are more than one port, this method will throw a RuntimeException.
	 */
	public static String getConnectedPortOfPort(String port_instance, EGraph graph, boolean logging) throws RuntimeException {
		// List of Strings for the resulting PortInstances (should be only
		// one).
		List<String> portInstances = new ArrayList<String>();

		// Get the rule and the according multirule, which store the result
		// parameter.
		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.SA_HENSHIN), true).getUnit("GetConnectedPortOfPort");
		Rule multiRule = rule.getMultiRule("searchPort");
		Parameter resultParameter = multiRule.getParameter("found_port");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("port_instance"), port_instance);

		// Find all matches of the rule with the used graph.
		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				portInstances.add(multiMatch.getParameterValue(resultParameter).toString());
			}

		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), port_instance, portInstances.size());
		}

		if (portInstances.isEmpty()) {
			return null;
		} else if (portInstances.size() == 1) {
			return portInstances.get(0);
		} else {
			throw new RuntimeException("More than one connected port. This is not possible.");
		}
	}

	/**
	 * Gets the connector for a given PortInstance. If there is no connector, this method will return null.
	 * 
	 * @param port_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return name of the connector, null if there is no connected connector
	 * @throws RuntimeException
	 *             If there are more than one component, this method will throw a RuntimeException.
	 */
	public static String getConnector(String port_instance, EGraph graph, boolean logging) throws RuntimeException {
		// List of Strings for the resulting ComponentInstances (should be only one).
		List<String> connectors = new ArrayList<String>();

		// Get the rule and the according multirule, which store the result parameter.
		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.CHANGE_TREE_HENSHIN), true).getUnit("GetConnector");
		Rule multiRule = rule.getMultiRule("searchConnector");
		Parameter resultParameter = multiRule.getParameter("found_connector");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("port_instance"), port_instance);

		// Find all matches of the rule with the used graph.
		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				connectors.add(multiMatch.getParameterValue(resultParameter).toString());
			}

		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), port_instance, connectors.size());
		}

		if (connectors.isEmpty()) {
			return null;
		} else if (connectors.size() == 1) {
			return connectors.get(0);
		} else {
			throw new RuntimeException("More than one connector for the given port. This is not possible.");
		}
	}

	/**
	 * Gets the event description.
	 * 
	 * @param event
	 *            - name of
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return description of given event as String object
	 * @throws RuntimeException
	 *             If there are more than one input event, this method will throw a RuntimeException.
	 */
	public static String getDescription(String event, EGraph graph, boolean logging) throws RuntimeException {
		List<String> desriptions = new ArrayList<String>();

		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.CHANGE_TREE_HENSHIN), true).getUnit("GetDescription");
		Rule multiRule = rule.getMultiRule("searchDescription");
		Parameter resultParameter = multiRule.getParameter("found_description");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("event"), event);

		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				desriptions.add(multiMatch.getParameterValue(resultParameter).toString());
			}
		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), event, desriptions.size());
		}

		if (desriptions.isEmpty()) {
			return null;
		} else if (desriptions.size() == 1) {
			return desriptions.get(0);
		} else {
			throw new RuntimeException("More than one description found. This is not possible.");
		}
	}

	/**
	 * Uses the rule "GetErrorInstancesForComponent" to get all ErrorInstances which are connected with the given ComponentInstance. This method doesn't execute
	 * the rule, it only finds the matches.
	 * 
	 * @param component_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return List<String> - List of ErrorInstances
	 */
	public static List<String> getErrorInstancesForComponent(String component_instance, EGraph graph, boolean logging) {
		// List of Strings for the resulting ErrorInstances.
		List<String> errorInstances = new ArrayList<String>();

		// Get the rule and the according multirule, which store the result
		// parameter.
		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.ENSURE_HENSHIN), true).getUnit("GetErrorInstancesForComponent");
		Rule multiRule = rule.getMultiRule("searchErrors");
		Parameter resultParameter = multiRule.getParameter("found_error");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("component_instance"), component_instance);

		// Find all matches of the rule with the used graph.
		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				errorInstances.add(multiMatch.getParameterValue(resultParameter).toString());
			}

		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), component_instance, errorInstances.size());
		}

		return errorInstances;
	}

	/**
	 * Gets all ErrorInstances which are connected with the given PortInstance. This method doesn't execute the rule, it only finds the matches.
	 * 
	 * @param port_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return List<String> - List of ErrorInstances
	 */
	public static List<String> getErrorInstancesForPort(String port_instance, EGraph graph, boolean logging) {
		// List of Strings for the resulting ErrorInstances.
		List<String> errorInstances = new ArrayList<String>();

		// Get the rule and the according multirule, which store the result
		// parameter.
		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.ENSURE_HENSHIN), true).getUnit("GetErrorInstancesForPort");
		Rule multiRule = rule.getMultiRule("searchErrors");
		Parameter resultParameter = multiRule.getParameter("found_error");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("port_instance"), port_instance);

		// Find all matches of the rule with the used graph.
		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				errorInstances.add(multiMatch.getParameterValue(resultParameter).toString());
			}

		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), port_instance, errorInstances.size());
		}

		return errorInstances;
	}

	/**
	 * Gets the error instances with the given error type.
	 * 
	 * @param error_type
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return List<String>
	 */
	public static List<String> getErrorInstancesOfType(String error_type, EGraph graph, boolean logging) {
		// List of Strings for the resulting PortInstances.
		List<String> errorInstances = new ArrayList<String>();

		// Get the rule and the according multirule, which store the result
		// parameter.
		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("GetErrorInstancesOfType");
		Rule multiRule = rule.getMultiRule("searchErrors");
		Parameter resultParameter = multiRule.getParameter("found_error");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("error_type"), error_type);

		// Find all matches of the rule with the used graph.
		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				errorInstances.add(multiMatch.getParameterValue(resultParameter).toString());
			}

		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), error_type, errorInstances.size());
		}

		return errorInstances;
	}

	/**
	 * Uses the rule "GetFailureInstancesForComponent" to get all FailureInstances which are connected with the given ComponentInstance. This method doesn't
	 * execute the rule, it only finds the matches.
	 * 
	 * @param component_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return List<String> - List of FailureInstances
	 */
	public static List<String> getFailureInstancesForComponent(String component_instance, EGraph graph, boolean logging) {
		// List of Strings for the resulting FailureInstances.
		List<String> failureInstances = new ArrayList<String>();

		// Get the rule and the according multirule, which store the result
		// parameter.
		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.ENSURE_HENSHIN), true).getUnit("GetFailureInstancesForComponent");
		Rule multiRule = rule.getMultiRule("searchFailures");
		Parameter resultParameter = multiRule.getParameter("found_failure");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("component_instance"), component_instance);

		// Find all matches of the rule with the used graph.
		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				failureInstances.add(multiMatch.getParameterValue(resultParameter).toString());
			}

		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), component_instance, failureInstances.size());
		}

		return failureInstances;
	}

	/**
	 * Gets all FailureInstances which are connected with the given PortInstance. This method doesn't execute the rule, it only finds the matches.
	 * 
	 * @param port_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return List<String> - List of FailureInstances
	 */
	public static List<String> getFailureInstancesForPort(String port_instance, EGraph graph, boolean logging) {
		// List of Strings for the resulting FailureInstances.
		List<String> failureInstances = new ArrayList<String>();

		// Get the rule and the according multirule, which store the result
		// parameter.
		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.ENSURE_HENSHIN), true).getUnit("GetFailureInstancesForPort");
		Rule multiRule = rule.getMultiRule("searchFailures");
		Parameter resultParameter = multiRule.getParameter("found_failure");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("port_instance"), port_instance);

		// Find all matches of the rule with the used graph.
		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				failureInstances.add(multiMatch.getParameterValue(resultParameter).toString());
			}

		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), port_instance, failureInstances.size());
		}

		return failureInstances;
	}

	/**
	 * Gets the failure instances with the given failure type.
	 * 
	 * @param failure_type
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return List<String>
	 */
	public static List<String> getFailureInstancesOfType(String failure_type, EGraph graph, boolean logging) {
		// List of Strings for the resulting PortInstances.
		List<String> failureInstances = new ArrayList<String>();

		// Get the rule and the according multirule, which store the result
		// parameter.
		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("GetFailureInstancesOfType");
		Rule multiRule = rule.getMultiRule("searchFailures");
		Parameter resultParameter = multiRule.getParameter("found_failure");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("failure_type"), failure_type);

		// Find all matches of the rule with the used graph.
		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				failureInstances.add(multiMatch.getParameterValue(resultParameter).toString());
			}

		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), failure_type, failureInstances.size());
		}

		return failureInstances;
	}

	/**
	 * Gets the next free gate ID starting with 1.
	 * 
	 * @param graph
	 * @param logging
	 * @return free gate ID
	 */
	public static int getFreeGateID(EGraph graph, boolean logging) {
		int freeID = 0;
		boolean idAlreadyExists = true;

		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.CHANGE_TREE_HENSHIN), true).getUnit("ExistsGateID");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);

		while (idAlreadyExists) {
			freeID++;
			application.setParameterValue("gateID", String.valueOf(freeID));
			idAlreadyExists = application.execute(null);
			if (logging) {
				TransformationsLogger.logRuleExecution(unit.getName(), Integer.toString(freeID), idAlreadyExists);
			}
		}

		return freeID;
	}

	/**
	 * Gets the next free event ID starting with 1.
	 * 
	 * @param graph
	 * @param logging
	 * @return free event ID
	 */
	public static String getFreeEventID(IDBase object) {

		return object.getId();
	}

	/**
	 * Gets the in component for a given PortInstance. If there is no component, this method will return null.
	 * 
	 * @param port_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return String
	 * @throws RuntimeException
	 *             If there are more than one component, this method will throw a RuntimeException.
	 */
	public static String getInComponentOfPort(String port_instance, EGraph graph, boolean logging) throws RuntimeException {
		// List of Strings for the resulting ComponentInstances (should be only
		// one).
		List<String> componentInstances = new ArrayList<String>();

		// Get the rule and the according multirule, which store the result
		// parameter.
		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.SA_HENSHIN), true).getUnit("GetInComponentOfPort");
		Rule multiRule = rule.getMultiRule("searchComponent");
		Parameter resultParameter = multiRule.getParameter("found_component");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("port_instance"), port_instance);

		// Find all matches of the rule with the used graph.
		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				if(multiMatch.getParameterValue(resultParameter) != null) {
					componentInstances.add(multiMatch.getParameterValue(resultParameter).toString());
				}
			}

		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), port_instance, componentInstances.size());
		}

		if (componentInstances.isEmpty()) {
			return null;
		} else if (componentInstances.size() == 1) {
			return componentInstances.get(0);
		} else {
			throw new RuntimeException("More than one component for the given port. This is not possible.");
		}
	}

	/**
	 * Gets all incoming ports for the given ComponentInstance.
	 * 
	 * @param component_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return List<String>
	 */
	public static List<String> getInPorts(String component_instance, EGraph graph, boolean logging) {
		// List of Strings for the resulting PortInstances.
		List<String> portInstances = new ArrayList<String>();

		// Get the rule and the according multirule, which store the result
		// parameter.
		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.SA_HENSHIN), true).getUnit("GetInPorts");
		Rule multiRule = rule.getMultiRule("searchInPorts");
		Parameter resultParameter = multiRule.getParameter("found_port");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("component_instance"), component_instance);

		// Find all matches of the rule with the used graph.
		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				portInstances.add(multiMatch.getParameterValue(resultParameter).toString());
			}

		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), component_instance, portInstances.size());
		}

		return portInstances;
	}

	/**
	 * Gets the input event for the given intermediate event. If there is no input event defined, this method will return null.
	 * 
	 * @param intermediate_event
	 *            - name of intermediate event
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return Name of the input event as String object
	 * @throws RuntimeException
	 *             If there are more than one input event, this method will throw a RuntimeException.
	 */
	public static String getInputEventOfIntermediateEvent(String intermediate_event, EGraph graph, boolean logging) throws RuntimeException {
		List<String> incomingEvents = new ArrayList<String>();

		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.CHANGE_TREE_HENSHIN), true).getUnit("GetInputEventOfIntermediateEvent");
		Rule multiRule = rule.getMultiRule("searchEvent");
		Parameter resultParameter = multiRule.getParameter("found_event");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("intermediate_event"), intermediate_event);

		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				incomingEvents.add(multiMatch.getParameterValue(resultParameter).toString());
			}
		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), intermediate_event, incomingEvents.size());
		}

		if (incomingEvents.isEmpty()) {
			return null;
		} else if (incomingEvents.size() == 1) {
			return incomingEvents.get(0);
		} else {
			throw new RuntimeException("More than one input event found. This is not possible.");
		}
	}

	/**
	 * Gets all incoming events for a gate.
	 * 
	 * @param gate
	 *            - int
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return List<String>
	 */
	public static List<String> getInputEvents(String gate, EGraph graph, boolean logging) {
		List<String> events = new ArrayList<String>();

		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("GetInputEvents");
		Rule multiRule = rule.getMultiRule("searchEvents");
		Parameter resultParameter = multiRule.getParameter("found_event");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("gate"), gate);

		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				events.add(multiMatch.getParameterValue(resultParameter).toString());
			}

		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), gate, events.size());
		}

		return events;
	}

	/**
	 * Gets the input gate for the given event. If there is no input gate defined, this method will return null.
	 * 
	 * @param gate
	 *            - int
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return String ID of the input event, or null if the input event doesn't exist
	 * @throws RuntimeException
	 *             If there are more than one input event, this method will throw a RuntimeException.
	 */
	public static String getInputGateForEvent(String event, EGraph graph, boolean logging) throws RuntimeException {
		List<String> gates = new ArrayList<String>();

		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.CHANGE_TREE_HENSHIN), true).getUnit("GetInputGateForEvent");
		Rule multiRule = rule.getMultiRule("searchGate");
		Parameter resultParameter = multiRule.getParameter("found_id");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("event"), event);

		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				gates.add(multiMatch.getParameterValue(resultParameter).toString());
			}
		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), event, gates.size());
		}

		if (gates.isEmpty()) {
			return null;
		} else if (gates.size() == 1) {
			return gates.get(0);
		} else {
			throw new RuntimeException("More than one input gate found. This is not possible.");
		}
	}

	/**
	 * Gets all incoming gates for a gate.
	 * 
	 * @param gate
	 *            - int
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return List<String>
	 */
	public static List<String> getInputGates(String gate, EGraph graph, boolean logging) {
		List<String> gates = new ArrayList<String>();

		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("GetInputGates");
		Rule multiRule = rule.getMultiRule("searchGates");
		Parameter resultParameter = multiRule.getParameter("found_gate");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("gate"), gate);

		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				gates.add(multiMatch.getParameterValue(resultParameter).toString());
			}

		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), gate, gates.size());
		}

		return gates;
	}

	/**
	 * Gets the intermediate event for the given failure instance. If there is no intermediate event defined, this method will return null.
	 * 
	 * @param failure_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return String
	 * @throws RuntimeException
	 *             If there are more than one basic event, this method will throw a RuntimeException.
	 */
	public static String getIntermediateEventForFailureInstance(String failure_instance, EGraph graph, boolean logging) throws RuntimeException {
		// List of Strings for the resulting intermediate events (it should be
		// only one).
		List<String> failureEvents = new ArrayList<String>();

		// Get the rule and the according multirule, which store the result
		// parameter.
		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.CHANGE_TREE_HENSHIN), true).getUnit("GetIntermediateEventForFailureInstance");
		Rule multiRule = rule.getMultiRule("searchEvent");
		Parameter resultParameter = multiRule.getParameter("found_event");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("failure_instance"), failure_instance);

		// Find all matches of the rule with the used graph.
		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				failureEvents.add(multiMatch.getParameterValue(resultParameter).toString());
			}
		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), failure_instance, failureEvents.size());
		}

		if (failureEvents.isEmpty()) {
			return null;
		} else if (failureEvents.size() == 1) {
			return failureEvents.get(0);
		} else {
			throw new RuntimeException("More than one intermediate event found. This is not possible.");
		}
	}

	/**
	 * Gets the out component for a given PortInstance. If there is no component, this method will return null.
	 * 
	 * @param port_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return String
	 * @throws RuntimeException
	 *             If there are more than one component, this method will throw a RuntimeException.
	 */
	public static String getOutComponentOfPort(String port_instance, EGraph graph, boolean logging) throws RuntimeException {
		// List of Strings for the resulting ComponentInstances (should be only
		// one).
		List<String> componentInstances = new ArrayList<String>();

		// Get the rule and the according multirule, which store the result
		// parameter.
		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.SA_HENSHIN), true).getUnit("GetOutComponentOfPort");
		Rule multiRule = rule.getMultiRule("searchComponent");
		Parameter resultParameter = multiRule.getParameter("found_component");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("port_instance"), port_instance);

		// Find all matches of the rule with the used graph.
		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				componentInstances.add(multiMatch.getParameterValue(resultParameter).toString());
			}

		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), port_instance, componentInstances.size());
		}

		if (componentInstances.isEmpty()) {
			return null;
		} else if (componentInstances.size() == 1) {
			return componentInstances.get(0);
		} else {
			throw new RuntimeException("More than one component for the given port. This is not possible.");
		}
	}

	/**
	 * Gets all outgoing ports for the given ComponentInstance.
	 * 
	 * @param component_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return List<String>
	 */
	public static List<String> getOutPorts(String component_instance, EGraph graph, boolean logging) {
		// List of Strings for the resulting PortInstances.
		List<String> portInstances = new ArrayList<String>();

		// Get the rule and the according multirule, which store the result
		// parameter.
		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.SA_HENSHIN), true).getUnit("GetOutPorts");
		Rule multiRule = rule.getMultiRule("searchOutPorts");
		Parameter resultParameter = multiRule.getParameter("found_port");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("component_instance"), component_instance);

		// Find all matches of the rule with the used graph.
		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				portInstances.add(multiMatch.getParameterValue(resultParameter).toString());
			}

		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), component_instance, portInstances.size());
		}

		return portInstances;
	}

	/**
	 * Gets the output event for the given gate. If there is no output event defined, this method will return null.
	 * 
	 * @param gate
	 *            - int
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return String ID of the input event, or null if the input event doesn't exist
	 * @throws RuntimeException
	 *             If there are more than one output event, this method will throw a RuntimeException.
	 */
	public static String getOutputEvent(String gate, EGraph graph, boolean logging) throws RuntimeException {
		List<String> events = new ArrayList<String>();

		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("GetOutputEvent");
		Rule multiRule = rule.getMultiRule("searchEvent");
		Parameter resultParameter = multiRule.getParameter("found_event");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("gate"), gate);

		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				Object result = multiMatch.getParameterValue(resultParameter);
				if (result != null) {
					events.add(result.toString());
				}
			}
		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), gate, events.size());
		}

		if (events.isEmpty()) {
			return null;
		} else if (events.size() == 1) {
			return events.get(0);
		} else {
			throw new RuntimeException("More than one output event found. This is not possible.");
		}
	}

	/**
	 * Gets the output event for the given basic event. If there is no output event defined, this method will return null.
	 * 
	 * @param basic_event
	 *            - name of basic event
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return Name of the input event as String object
	 * @throws RuntimeException
	 *             If there are more than one output event, this method will throw a RuntimeException.
	 */
	public static String getOutputEventForBasicEvent(String basic_event, EGraph graph, boolean logging) throws RuntimeException {
		List<String> outgoingEvents = new ArrayList<String>();

		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.CHANGE_TREE_HENSHIN), true).getUnit("GetOutputEventForBasicEvent");
		Rule multiRule = rule.getMultiRule("searchEvent");
		Parameter resultParameter = multiRule.getParameter("found_event");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("basic_event"), basic_event);

		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				outgoingEvents.add(multiMatch.getParameterValue(resultParameter).toString());
			}
		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), basic_event, outgoingEvents.size());
		}

		if (outgoingEvents.isEmpty()) {
			return null;
		} else if (outgoingEvents.size() == 1) {
			return outgoingEvents.get(0);
		} else {
			throw new RuntimeException("More than one output event found. This is not possible.");
		}
	}

	/**
	 * Gets the output event for the given intermediate event. If there is no output event defined, this method will return null.
	 * 
	 * @param intermediate_event
	 *            - name of basic event
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return Name of the input event as String object
	 * @throws RuntimeException
	 *             If there are more than one output event, this method will throw a RuntimeException.
	 */
	public static String getOutputEventForIntermediateEvent(String intermediate_event, EGraph graph, boolean logging) throws RuntimeException {
		List<String> outgoingEvents = new ArrayList<String>();

		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.CHANGE_TREE_HENSHIN), true).getUnit("GetOutputEventForIntermediateEvent");
		Rule multiRule = rule.getMultiRule("searchEvent");
		Parameter resultParameter = multiRule.getParameter("found_event");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("intermediate_event"), intermediate_event);

		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				outgoingEvents.add(multiMatch.getParameterValue(resultParameter).toString());
			}
		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), intermediate_event, outgoingEvents.size());
		}

		if (outgoingEvents.isEmpty()) {
			return null;
		} else if (outgoingEvents.size() == 1) {
			return outgoingEvents.get(0);
		} else {
			throw new RuntimeException("More than one output event found. This is not possible.");
		}
	}

	/**
	 * Gets the output gate for the given gate. If there is no output gate defined, this method will return null.
	 * 
	 * @param gate
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return String ID of the input event, or null if the input event doesn't exist
	 * @throws RuntimeException
	 *             If there are more than one output event, this method will throw a RuntimeException.
	 */
	public static String getOutputGate(String gate, EGraph graph, boolean logging) throws RuntimeException {
		List<String> gates = new ArrayList<String>();

		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("GetOutputGate");
		Rule multiRule = rule.getMultiRule("searchGate");
		Parameter resultParameter = multiRule.getParameter("found_gate");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("gate"), gate);

		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				gates.add(multiMatch.getParameterValue(resultParameter).toString());
			}
		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), gate, gates.size());
		}

		if (gates.isEmpty()) {
			return null;
		} else if (gates.size() == 1) {
			return gates.get(0);
		} else {
			throw new RuntimeException("More than one output gate found. This is not possible.");
		}
	}

	/**
	 * Gets the output gate for the given event. If there is no output gate defined, this method will return null.
	 * 
	 * @param gate
	 *            - int
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return String ID of the input event, or null if the input event doesn't exist
	 * @throws RuntimeException
	 *             If there are more than one input event, this method will throw a RuntimeException.
	 */
	public static String getOutputGateOfEvent(String event, EGraph graph, boolean logging) throws RuntimeException {
		List<String> gates = new ArrayList<String>();

		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.CHANGE_TREE_HENSHIN), true).getUnit("GetOutputGateOfEvent");
		Rule multiRule = rule.getMultiRule("searchGate");
		Parameter resultParameter = multiRule.getParameter("found_gate");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("event"), event);

		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				gates.add(multiMatch.getParameterValue(resultParameter).toString());
			}
		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), event, gates.size());
		}

		if (gates.isEmpty()) {
			return null;
		} else if (gates.size() == 1) {
			return gates.get(0);
		} else {
			throw new RuntimeException("More than one output gate found. This is not possible.");
		}
	}

	/**
	 * Gets the parent component for the given ComponentInstance. If there is no parent component, this method will return null.
	 * 
	 * @param component_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return String
	 * @throws RuntimeException
	 *             If there are more than one parent component, this method will throw a RuntimeException.
	 */
	public static String getParentComponent(String component_instance, EGraph graph, boolean logging) throws RuntimeException {
		// List of Strings for the resulting parent components (it should be
		// only one).
		List<String> parentComponents = new ArrayList<String>();

		// Get the rule and the according multirule, which store the result
		// parameter.
		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.SA_HENSHIN), true).getUnit("GetParentComponent");
		Rule multiRule = rule.getMultiRule("searchParent");
		Parameter resultParameter = multiRule.getParameter("parent_component");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("component_instance"), component_instance);

		// Find all matches of the rule with the used graph.
		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				parentComponents.add(multiMatch.getParameterValue(resultParameter).toString());
			}
		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), component_instance, parentComponents.size());
		}

		if (parentComponents.isEmpty()) {
			return null;
		} else if (parentComponents.size() == 1) {
			return parentComponents.get(0);
		} else {
			throw new RuntimeException("More than one parent component found. This is not possible.");
		}
	}

	/**
	 * Gets the port instances for the given port type.
	 * 
	 * @param port_type
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return List<String>
	 */
	public static List<String> getPortInstancesOfType(String port_type, EGraph graph, boolean logging) {
		// List of Strings for the resulting PortInstances.
		List<String> portInstances = new ArrayList<String>();

		// Get the rule and the according multirule, which store the result
		// parameter.
		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.SA_HENSHIN), true).getUnit("GetPortInstancesOfType");
		Rule multiRule = rule.getMultiRule("searchPorts");
		Parameter resultParameter = multiRule.getParameter("found_port");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("port_type"), port_type);

		// Find all matches of the rule with the used graph.
		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				portInstances.add(multiMatch.getParameterValue(resultParameter).toString());
			}

		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), port_type, portInstances.size());
		}

		return portInstances;
	}

	/**
	 * Gets all incoming ports for the given ComponentInstance.
	 * 
	 * @param component_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return List<String>
	 */
	public static List<String> getPorts(String connector, EGraph graph, boolean logging) {
		// List of Strings for the resulting PortInstances.
		List<String> portInstances = new ArrayList<String>();

		// Get the rule and the according multirule, which store the result
		// parameter.
		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.SA_HENSHIN), true).getUnit("GetPorts");
		Rule multiRule = rule.getMultiRule("searchPorts");
		Parameter resultParameter = multiRule.getParameter("found_port");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("connector"), connector);

		// Find all matches of the rule with the used graph.
		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				portInstances.add(multiMatch.getParameterValue(resultParameter).toString());
			}

		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), connector, portInstances.size());
		}

		return portInstances;
	}

	/**
	 * Gets the port types for the given component type.
	 * 
	 * @param component_type
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return List<String>
	 */
	public static List<String> getPortTypesOfComponentType(String component_type, EGraph graph, boolean logging) {
		// List of Strings for the resulting PortInstances.
		List<String> portTypes = new ArrayList<String>();

		// Get the rule and the according multirule, which store the result
		// parameter.
		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.SA_HENSHIN), true).getUnit("GetPortTypesOfComponentType");
		Rule multiRule = rule.getMultiRule("searchTypes");
		Parameter resultParameter = multiRule.getParameter("found_type");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("component_type"), component_type);

		// Find all matches of the rule with the used graph.
		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				portTypes.add(multiMatch.getParameterValue(resultParameter).toString());
			}

		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), component_type, portTypes.size());
		}

		return portTypes;
	}

	/**
	 * Gets the previous error for the given FailureInstance. If there is no previous error, this method will return null.
	 * 
	 * @param failure_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return String
	 * @throws RuntimeException
	 *             If there are more than one previous error, this method will throw a RuntimeException.
	 */
	public static String getPreviousError(String failure_instance, EGraph graph, boolean logging) throws RuntimeException {
		// List of Strings for the resulting ErrorInstances (should be only
		// one).
		List<String> errorInstances = new ArrayList<String>();

		// Get the rule and the according multirule, which store the result
		// parameter.
		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("GetPreviousError");
		Rule multiRule = rule.getMultiRule("getPreviousError");
		Parameter resultParameter = multiRule.getParameter("previous_error");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("failure_instance"), failure_instance);

		// Find all matches of the rule with the used graph.
		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				errorInstances.add(multiMatch.getParameterValue(resultParameter).toString());
			}

		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), failure_instance, errorInstances.size());
		}

		if (errorInstances.isEmpty()) {
			return null;
		} else if (errorInstances.size() == 1) {
			return errorInstances.get(0);
		} else {
			throw new RuntimeException("More than one previous error found. This is not possible.");
		}
	}

	/**
	 * Gets the previous failure for the given FailureInstance. If there is no previous failure, this method will return null.
	 * 
	 * @param failure_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return String
	 * @throws RuntimeException
	 *             If there are more than one previous failure, this method will throw a RuntimeException.
	 */
	public static String getPreviousFailure(String failure_instance, EGraph graph, boolean logging) throws RuntimeException {
		// List of Strings for the resulting FailureInstances (should be only
		// one).
		List<String> failureInstances = new ArrayList<String>();

		// Get the rule and the according multirule, which store the result
		// parameter.
		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("GetPreviousFailure");
		Rule multiRule = rule.getMultiRule("getPreviousFailure");
		Parameter resultParameter = multiRule.getParameter("previous_failure");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("failure_instance"), failure_instance);

		// Find all matches of the rule with the used graph.
		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				failureInstances.add(multiMatch.getParameterValue(resultParameter).toString());
			}

		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), failure_instance, failureInstances.size());
		}

		if (failureInstances.isEmpty()) {
			return null;
		} else if (failureInstances.size() == 1) {
			return failureInstances.get(0);
		} else {
			throw new RuntimeException("More than one previous failure found. This is not possible.");
		}
	}

	/**
	 * Gets the children of the given component instance.
	 * 
	 * @param component_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return List<String>
	 */
	public static List<String> getSubComponents(String component_instance, EGraph graph, boolean logging) {
		// List of Strings for the resulting PortInstances.
		List<String> children = new ArrayList<String>();

		// Get the rule and the according multirule, which store the result
		// parameter.
		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.SA_HENSHIN), true).getUnit("GetChildComponents");
		Rule multiRule = rule.getMultiRule("searchChildren");
		Parameter resultParameter = multiRule.getParameter("child_component");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("component_instance"), component_instance);

		// Find all matches of the rule with the used graph.
		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				children.add(multiMatch.getParameterValue(resultParameter).toString());
			}

		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), component_instance, children.size());
		}

		return children;
	}

	/**
	 * Gets the error type for the given error instance. If there is no error type defined, this method will return null.
	 * 
	 * @param error_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return String
	 * @throws RuntimeException
	 *             If there are more than one error type, this method will throw a RuntimeException.
	 */
	public static String getTypeOfErrorInstance(String error_instance, EGraph graph, boolean logging) throws RuntimeException {
		// List of Strings for the resulting error types (it should be
		// only one).
		List<String> errorTypes = new ArrayList<String>();

		// Get the rule and the according multirule, which store the result
		// parameter.
		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("GetTypeOfErrorInstance");
		Rule multiRule = rule.getMultiRule("searchType");
		Parameter resultParameter = multiRule.getParameter("error_type");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("error_instance"), error_instance);

		// Find all matches of the rule with the used graph.
		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				errorTypes.add(multiMatch.getParameterValue(resultParameter).toString());
			}
		}

		if (logging) {
			TransformationsLogger.logRuleMatching(rule.getName(), error_instance, errorTypes.size());
		}

		if (errorTypes.isEmpty()) {
			return null;
		} else if (errorTypes.size() == 1) {
			return errorTypes.get(0);
		} else {
			throw new RuntimeException("More than one error type found. This is not possible.");
		}
	}

	/**
	 * Gets the port instance of source component which is involved in the connection between. If there is no port, this method will return null.
	 * 
	 * @param source_component
	 *            - String
	 * @param target_component
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return the affected port instance
	 * @throws RuntimeException
	 *             If there are more than one port, this method will throw a RuntimeException.
	 */
	public static String getUsedPortInSourceComponentForConnection(String source_component, String target_component, EGraph graph, boolean logging)
			throws RuntimeException {
		// List of Strings for the resulting PortInstances (should be only
		// one).
		List<String> portInstances = new ArrayList<String>();

		// Get the rule and the according multirule, which store the result
		// parameter.
		Rule rule = (Rule) new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.SA_HENSHIN), true).getUnit("GetUsedPortInSourceComponentForConnection");
		Rule multiRule = rule.getMultiRule("searchPort");
		Parameter resultParameter = multiRule.getParameter("found_port");

		Match partialMatch = new MatchImpl(rule);
		partialMatch.setParameterValue(rule.getParameter("source_component"), source_component);
		partialMatch.setParameterValue(rule.getParameter("target_component"), target_component);

		// Find all matches of the rule with the used graph.
		for (Match match : new EngineImpl().findMatches(rule, graph, partialMatch)) {
			for (Match multiMatch : match.getMultiMatches(multiRule)) {
				portInstances.add(multiMatch.getParameterValue(resultParameter).toString());
			}

		}

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(source_component);
			param.add(target_component);
			TransformationsLogger.logRuleMatching(rule.getName(), param, portInstances.size());
		}

		if (portInstances.isEmpty()) {
			return null;
		} else if (portInstances.size() == 1) {
			return portInstances.get(0);
		} else {
			throw new RuntimeException("More than one connected port. This is not possible.");
		}
	}

	/**
	 * Executes the rule HasEventAsInput to determine whether the given intermediate event has an event as input.
	 * 
	 * @param event
	 *            - name of the event as String object
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return true if given intermediate event has an event as input
	 */
	public static boolean hasEventAsInput(String intermediate_event, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.CHANGE_TREE_HENSHIN), true).getUnit("HasEventAsInput");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("intermediate_event", intermediate_event);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), intermediate_event, result);
		}

		return result;
	}

	/**
	 * Executes the rule HasGateAsInput to determine whether the given event has any Gate as input.
	 * 
	 * @param event
	 *            - name of the event as String object
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return true if given event has any Gate as input, otherwise false
	 */
	public static boolean hasGateAsInput(String event, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.CHANGE_TREE_HENSHIN), true).getUnit("HasGateAsInput");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("event", event);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), event, result);
		}

		return result;
	}

	/**
	 * Executes the rule HasORGateAsInput to determine whether the given event has an OR-Gate as input.
	 * 
	 * @param event
	 *            - name of the event as String object
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return true if given event has an OR-Gate as input, otherwise false
	 */
	public static boolean hasORGateAsInput(String event, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.CHANGE_TREE_HENSHIN), true).getUnit("HasORGateAsInput");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("event", event);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), event, result);
		}

		return result;
	}

	/**
	 * Executes the rule IsBasicEvent to determine whether the given event is a basic event.
	 * 
	 * @param event
	 *            - name of the event as String object
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return true if given event is a basic event, otherwise false
	 */
	public static boolean isBasicEvent(String event, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.CHANGE_TREE_HENSHIN), true).getUnit("IsBasicEvent");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("event", event);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), event, result);
		}

		return result;
	}

	/**
	 * Executes the rule IsIntermediateEvent to determine whether the given event is a intermediate event.
	 * 
	 * @param event
	 *            - name of the event as String object
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return true if given event is a intermediate event, otherwise false
	 */
	public static boolean isIntermediateEvent(String event, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.CHANGE_TREE_HENSHIN), true).getUnit("IsIntermediateEvent");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("event", event);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), event, result);
		}

		return result;
	}

	/**
	 * Executes the rule IsORGate to determine whether the given gate ID refers to an OR gate.
	 * 
	 * @param gate
	 *            - ID of gate
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return true if given gate ID refers to an OR gate, otherwise false
	 */
	public static boolean isORGate(String gate, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.CHANGE_TREE_HENSHIN), true).getUnit("IsORGate");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("gate", gate);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), gate, result);
		}

		return result;
	}

	/**
	 * Executes the rule IsPortInstanceInPort to determine whether the given PortInstance is an incoming port or not.
	 * 
	 * @param port_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return boolean
	 */
	public static boolean isPortInstanceInPort(String port_instance, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.SA_HENSHIN), true).getUnit("IsPortInstanceInPort");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("port_instance", port_instance);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), port_instance, result);
		}

		return result;
	}

	/**
	 * Executes the rule IsPortInstanceOutPort to determine whether the given PortInstance is a outgoing port or not.
	 * 
	 * @param port_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return boolean
	 */
	public static boolean isPortInstanceOutPort(String port_instance, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.SA_HENSHIN), true).getUnit("IsPortInstanceOutPort");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("port_instance", port_instance);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), port_instance, result);
		}

		return result;
	}

	/**
	 * Executes the rule IsSensor to determine whether the given ComponentInstance is Sensor.
	 * 
	 * @param component_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return boolean
	 */
	public static boolean isSensor(String component_instance, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.CHANGE_TREE_HENSHIN), true).getUnit("IsSensor");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("component_instance", component_instance);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), component_instance, result);
		}

		return result;
	}

	/**
	 * Executes the rule IsSoftwareComponent to determine whether the given ComponentInstance is SoftwareComponent.
	 * 
	 * @param component_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return boolean
	 */
	public static boolean isSoftwareComponent(String component_instance, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.CHANGE_TREE_HENSHIN), true).getUnit("IsSoftwareComponent");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("component_instance", component_instance);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), component_instance, result);
		}

		return result;
	}

	/**
	 * Executes the rule "MovePortToComponentAsIncoming".
	 * 
	 * @param port_instance
	 *            - String
	 * @param component_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean movePortToComponentAsIncoming(String port_instance, String component_instance, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.SA_HENSHIN), true).getUnit("MovePortToComponentAsIncoming");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("port_instance", port_instance);
		application.setParameterValue("component_instance", component_instance);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(port_instance);
			param.add(component_instance);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule "MovePortToComponentAsOutgoing".
	 * 
	 * @param port_instance
	 *            - String
	 * @param component_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean movePortToComponentAsOutgoing(String port_instance, String component_instance, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.SA_HENSHIN), true).getUnit("MovePortToComponentAsOutgoing");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("port_instance", port_instance);
		application.setParameterValue("component_instance", component_instance);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(port_instance);
			param.add(component_instance);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule PropagateErrorToComponentFromPort to propagate an error to the component of the given PortInstance.
	 * 
	 * @param port_instance
	 *            - String
	 * @param error_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return boolean, whether rule executed successful.
	 */
	public static boolean propagateErrorToComponentFromPort(String port_instance, String error_instance, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.ENSURE_HENSHIN), true).getUnit("PropagateErrorToComponentFromPort");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("port_instance", port_instance);
		application.setParameterValue("error_instance", error_instance);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(port_instance);
			param.add(error_instance);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule PropagateFailureToComponentFromPortInstance to propagate a failure to the component of the given PortInstance.
	 * 
	 * @param port_instance
	 *            - String
	 * @param failure_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return boolean, whether rule executed successful.
	 */
	public static boolean propagateFailureToComponentFromPort(String port_instance, String failure_instance, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.ENSURE_HENSHIN), true).getUnit("PropagateFailureToComponentFromPort");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("port_instance", port_instance);
		application.setParameterValue("failure_instance", failure_instance);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(port_instance);
			param.add(failure_instance);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule PropagateFailureToConnectedPortFromPort to propagate a failure to the connected port from the given PortInstance.
	 * 
	 * @param port_instance
	 *            - String
	 * @param failure_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return boolean, whether rule executed successful.
	 */
	public static boolean propagateFailureToConnectedPortFromPort(String port_instance, String failure_instance, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.ENSURE_HENSHIN), true).getUnit("PropagateFailureToConnectedPortFromPort");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("port_instance", port_instance);
		application.setParameterValue("failure_instance", failure_instance);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(port_instance);
			param.add(failure_instance);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes the rule PropagateFailureToParentComponent to propagate a failure to the parent component of the given ComponentInstance.
	 * 
	 * @param component_instance
	 *            - String
	 * @param failure_instance
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return boolean, whether it was successful.
	 */
	public static boolean propagateFailureToParentComponent(String component_instance, String failure_instance, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.ENSURE_HENSHIN), true).getUnit("PropagateFailureToParentComponent");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("component_instance", component_instance);
		application.setParameterValue("failure_instance", failure_instance);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(component_instance);
			param.add(failure_instance);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}

	/**
	 * Executes a specific rule which must be stored in the henshin file. You have to change the RuleName and the parameters of the rule.
	 * 
	 * @param param
	 *            - String
	 * @param graph
	 *            - graph on which the rule is executed
	 * @param logging
	 *            - determines whether the execution should be logged
	 * @return success of execution
	 */
	public static boolean sampleRule(String param, EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule("henshin/rules.henshin").getUnit("RuleName");
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("param", param);
		boolean result = application.execute(null);

		if (logging) {
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}


	/**
	 * Executes the rule CreateHazard, which creates a new Hazard if there is no one already present.
	 * 
	 * @param graph
	 * 			- Graph on which the rule is executed
	 * @param logging
	 * 			- Whether the execution should be logged
	 * @return
	 * 			- true: success
	 * 			- false: otherwise
	 */
	public static boolean createHazard(EGraph graph, boolean logging) {
		Unit unit = new HenshinResourceSet().getModule(URI.createURI(TransformationsConstants.FT_HENSHIN), true).getUnit("CreateHazard");
		final String hazardName = "Hazard";
		final String hazardDescription = "Auto-generated Hazard";
		UnitApplication application = new UnitApplicationImpl(new EngineImpl(), graph, unit, null);
		application.setParameterValue("hazard_name", hazardName);
		application.setParameterValue("hazard_description", hazardDescription);
		boolean result = application.execute(null);

		if (logging) {
			ArrayList<String> param = new ArrayList<String>();
			param.add(hazardName);
			param.add(hazardDescription);
			TransformationsLogger.logRuleExecution(unit.getName(), param, result);
		}

		return result;
	}
}
