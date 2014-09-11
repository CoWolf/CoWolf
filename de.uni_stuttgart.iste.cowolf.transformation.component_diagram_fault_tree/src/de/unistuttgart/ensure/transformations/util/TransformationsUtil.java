package de.unistuttgart.ensure.transformations.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.trace.Trace;
import org.eclipse.emf.henshin.trace.TracePackage;

import de.uni_stuttgart.iste.cowolf.model.component_diagram.*;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.*;



/**
 * Provides some common functionalities for the Henshin transformations.
 * 
 * Version history:
 * <p>
 * 1.00 2013-06-20: initial implementation
 * <p>
 * 1.01 2013-06-27: added logging for HashMap with distances
 * <p>
 * 1.02 2013-08-16: added methods for merging and separation of instance models
 * <p>
 * 1.03 2013-11-20: added methods to extract BasicEvents, IntermediateEvents,
 * ComponentInstances out of a graph object.
 * <p>
 * 1.04 2013-11-24: added methods to extract Event objects by their name from a
 * EGraph.
 * <p>
 * 1.05 2013-12-13: changed log mechanism
 * <p>
 * 1.06 2013-12-14: added log methods for rule matching, extracted log methods
 * in TransformationsLogger, extracted constants in TransformationsConstants
 * 
 * @version 1.06 14 December 2013
 * @author Yannic Noller
 * 
 */
public class TransformationsUtil {
	// ------------------------------------------------------------
	// INITIALIZATION
	// ------------------------------------------------------------

	/**
	 * Load the required meta model packages.
	 */
	public static void loadPackages() {
		Component_diagramPackage.eINSTANCE.getName();
		FaultTreePackage.eINSTANCE.getName();
		TracePackage.eINSTANCE.getName();
	}

	/**
	 * Registers the needed file extension of our instance models.
	 */
	public static void registerExtensions() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				TransformationsConstants.SA_EXTENSION, new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				TransformationsConstants.FT_EXTENSION, new XMIResourceFactoryImpl());
	}

	// ------------------------------------------------------------
	// GETTING INFORMATION OUT OF THE INSTANCE MODELS
	// ------------------------------------------------------------

	/**
	 * Gets the Event object for the given name in the given graph.
	 * 
	 * @param eventName
	 *            - String
	 * @param graph
	 *            - EGraph
	 * @return Event
	 */
	public static Event getEventByName(String eventName, EGraph graph) {
		for (EObject object : graph.getRoots()) {
			if (object instanceof FaultTree) {
				for (Event event : ((FaultTree) object).getEvent()) {
					if (event.getName().equals(eventName)) {
						return event;
					}
				}
				break;
			}
		}
		return null;
	}

	/**
	 * Gets all BasicEvent from the given graph.
	 * 
	 * @param graph
	 *            - EGraph
	 * @return EList<BasicEvent>
	 */
	public static EList<BasicEvent> getAllBasicEvents(EGraph graph) {
		EList<BasicEvent> resultList = new BasicEList<BasicEvent>();
		for (EObject object : graph.getRoots()) {
			if (object instanceof FaultTree) {
				for (Event event : ((FaultTree) object).getEvent()) {
					if (event instanceof BasicEvent) {
						resultList.add((BasicEvent) event);
					}
				}
				break;
			}
		}
		return resultList;
	}

	/**
	 * Gets all IntermediateEvents from the given graph.
	 * 
	 * @param graph
	 *            - EGraph
	 * @return EList<IntermediateEvent>
	 */
	public static EList<IntermediateEvent> getAllIntermediateEvents(EGraph graph) {
		EList<IntermediateEvent> resultList = new BasicEList<IntermediateEvent>();
		for (EObject object : graph.getRoots()) {
			if (object instanceof FaultTree) {
				for (Event event : ((FaultTree) object).getEvent()) {
					if (event instanceof IntermediateEvent) {
						resultList.add((IntermediateEvent) event);
					}
				}
				break;
			}
		}
		return resultList;
	}

	/**
	 * Gets all ComponentInstance objects of an EGraph object.
	 * 
	 * @param graph
	 *            - EGraph
	 * @return EList<ComponentInstance>
	 */
	public static EList<ComponentInstance> getAllComponentInstances(EGraph graph) {
		EList<ComponentInstance> resultList = new BasicEList<ComponentInstance>();
		EList<ComponentInstance> tempList = new BasicEList<ComponentInstance>();
		for (EObject object : graph.getRoots()) {
			if (object instanceof Architecture) {
				// Add all components in the list. The subcomponents of that
				// components are still missing.
				tempList.addAll(((Architecture) object).getInstances());
				break;
			}
		}

		ComponentInstance current_component;
		while (!tempList.isEmpty()) {
			// Get the first element of the tempList.
			current_component = tempList.remove(0);

			// Add the current component to the resultList.
			resultList.add(current_component);

			// Add all sub components of the current component to the tempList.
			tempList.addAll(current_component.getSubcomponent());
		}

		return resultList;
	}

	// ------------------------------------------------------------
	// TRANSFORMATINOS OF INSTANCE MODELS
	// ------------------------------------------------------------

	/**
	 * Merges two EGraph objects to one EGraph.
	 * 
	 * @param firstGraph
	 *            - EGraph
	 * @param secondGraph
	 *            - EGraph
	 * @return EGraph with the merged objects.
	 */
	public static EGraph mergeInstanceModels(EGraph firstGraph,
			EGraph secondGraph) {
		for (EObject tree : secondGraph.getRoots()) {
			firstGraph.addTree(tree);
		}

		return firstGraph;
	}

	/**
	 * Separates the resulting objects from Trace or FaultTree in the given
	 * FaulTree instance model.
	 * 
	 * @return FaultTree instance model as Resource object.
	 */
	public static Resource getFaultTreeInstanceModel(EGraph saGraph,
			Resource faulttreeInstanceModel) {
		// Get Root object.
		FaultTree root = null;
		for (EObject object : saGraph.getRoots()) {
			if (object instanceof FaultTree) {
				root = (FaultTree) object;
				break;
			}
		}
		if (root == null) {
			throw new RuntimeException(
					"No Root object in FaultTree instance model");
		}

		// Merge the new objects.
		for (EObject object : saGraph.getRoots()) {
			if (object instanceof FaultTree) {
				for (EObject element : object.eContents()) {
					if (element instanceof de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorInstance) {
						root.getError_instance().add((ErrorInstance) element);
					} else if (element instanceof de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorType) {
						root.getError_type().add((ErrorType) element);
					} else if (element instanceof de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate) {
						root.getGate().add((Gate) element);
					} else if (element instanceof de.uni_stuttgart.iste.cowolf.model.fault_tree.Event) {
						root.getEvent().add((Event) element);
					} else if (element instanceof de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance) {
						root.getFailure_instance().add(
								(FailureInstance) element);
					} else if (element instanceof de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureType) {
						root.getFailure_type().add((FailureType) element);
					} else {
						throw new RuntimeException("Unknown model class: "
								+ element.getClass());
					}

					if (element instanceof de.uni_stuttgart.iste.cowolf.model.fault_tree.Hazard) {
						root.setHazard((Hazard) element);
					}
				}
			} else if (object.getClass().getPackage().getName()
					.equals(TransformationsConstants.FAULTTREE_PACKAGE)) {
				if (object instanceof de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorInstance) {
					root.getError_instance().add((ErrorInstance) object);
				} else if (object instanceof de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorType) {
					root.getError_type().add((ErrorType) object);
				} else if (object instanceof de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate) {
					root.getGate().add((Gate) object);
				} else if (object instanceof de.uni_stuttgart.iste.cowolf.model.fault_tree.Event) {
					root.getEvent().add((Event) object);
				} else if (object instanceof de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance) {
					root.getFailure_instance().add((FailureInstance) object);
				} else if (object instanceof de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureType) {
					root.getFailure_type().add((FailureType) object);
				} else {
					throw new RuntimeException("Unknown model class: "
							+ object.getClass());
				}

				if (object instanceof de.uni_stuttgart.iste.cowolf.model.fault_tree.Hazard) {
					root.setHazard((Hazard) object);
				}
			} else if (object.getClass().getPackage().getName()
					.equals(TransformationsConstants.TRACE_PACKAGE)) {
				faulttreeInstanceModel.getContents().add(object);
			} else if (object instanceof Architecture) {
				// Do nothing.
			} else if (object.getClass().getPackage().getName()
					.equals(TransformationsConstants.SA_PACKAGE)) {
				// Do nothing.
			} else {
				// Do nothing.
			}
		}

		if (root != null) {
			faulttreeInstanceModel.getContents().add(root);
		}

		// Check for Traces which should be deleted.
		List<EObject> objectsToDelete = new ArrayList<EObject>();
		for (EObject object : faulttreeInstanceModel.getContents()) {
			if (object instanceof Trace) {
				Trace trace = (Trace) object;
				// If Trace has no source relation, it has to be deleted.
				if (trace.getSource().isEmpty()
						|| (trace.getTarget().isEmpty() && trace.getSource()
								.size() < 2)) {
					objectsToDelete.add(object);
				}
			}
		}
		for (EObject object : objectsToDelete) {
			faulttreeInstanceModel.getContents().remove(object);
		}

		return faulttreeInstanceModel;
	}

	/**
	 * Separates the resulting objects from SA in the given SA instance model.
	 * 
	 * @return SA instance model as Resource object.
	 */
	public static Resource getSAInstanceModel(EGraph saGraph,
			Resource saInstanceModel) {
		// Get Architecture object.
		Architecture architecture = null;
		for (EObject object : saGraph.getRoots()) {
			if (object instanceof Architecture) {
				architecture = (Architecture) object;
				break;
			}
		}
		if (architecture == null) {
			throw new RuntimeException(
					"No Architecture object in SA instance model");
		}

		// Merge the new objects.
		for (EObject object : saGraph.getRoots()) {
			if (object instanceof Architecture) {
				for (EObject element : object.eContents()) {
					if (element instanceof de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentType) {
						architecture.getComponent()
								.add((ComponentType) element);
					} else if (element instanceof de.uni_stuttgart.iste.cowolf.model.component_diagram.Connector) {
						architecture.getConnectors().add((Connector) element);
					} else if (element instanceof de.uni_stuttgart.iste.cowolf.model.component_diagram.PortType) {
						architecture.getPort_type().add((PortType) element);
					} else if (element instanceof de.uni_stuttgart.iste.cowolf.model.component_diagram.PortInstance) {
						architecture.getPorts().add((PortInstance) element);
					} else if (element instanceof de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance) {
						architecture.getInstances().add(
								(ComponentInstance) element);
					} else if (element instanceof de.uni_stuttgart.iste.cowolf.model.component_diagram.Actuator) {
						architecture.getComponent().add((de.uni_stuttgart.iste.cowolf.model.component_diagram.Actuator) element);
					} else if (element instanceof de.uni_stuttgart.iste.cowolf.model.component_diagram.ElectronicDevice) {
						architecture.getComponent().add(
								(de.uni_stuttgart.iste.cowolf.model.component_diagram.ElectronicDevice) element);
					} else if (element instanceof de.uni_stuttgart.iste.cowolf.model.component_diagram.HardwareComponent) {
						architecture.getComponent().add(
								(de.uni_stuttgart.iste.cowolf.model.component_diagram.HardwareComponent) element);
					} else if (element instanceof de.uni_stuttgart.iste.cowolf.model.component_diagram.MechanicalDevice) {
						architecture.getComponent().add(
								(de.uni_stuttgart.iste.cowolf.model.component_diagram.MechanicalDevice) element);
					} else if (element instanceof de.uni_stuttgart.iste.cowolf.model.component_diagram.Sensor) {
						architecture.getComponent().add((de.uni_stuttgart.iste.cowolf.model.component_diagram.Sensor) element);
					} else if (element instanceof de.uni_stuttgart.iste.cowolf.model.component_diagram.SoftwareComponent) {
						architecture.getComponent().add(
								(de.uni_stuttgart.iste.cowolf.model.component_diagram.SoftwareComponent) element);
					} else {
						throw new RuntimeException("Unknown model class: "
								+ object.getClass());
					}
				}
			} else if (object.getClass().getPackage().getName()
					.equals(TransformationsConstants.SA_PACKAGE)) {
				if (object instanceof de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentType) {
					architecture.getComponent().add((ComponentType) object);
				} else if (object instanceof de.uni_stuttgart.iste.cowolf.model.component_diagram.Connector) {
					architecture.getConnectors().add((Connector) object);
				} else if (object instanceof de.uni_stuttgart.iste.cowolf.model.component_diagram.PortType) {
					architecture.getPort_type().add((PortType) object);
				} else if (object instanceof de.uni_stuttgart.iste.cowolf.model.component_diagram.PortInstance) {
					architecture.getPorts().add((PortInstance) object);
				} else if (object instanceof de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance) {
					architecture.getInstances().add((ComponentInstance) object);
				} else {
					throw new RuntimeException("Unknown model class: "
							+ object.getClass());
				}
			} else if (object instanceof FaultTree) {
				// Do nothing.
			} else if (object.getClass().getPackage().getName()
					.equals(TransformationsConstants.FAULTTREE_PACKAGE)) {
				// Do nothing.
			} else if (object.getClass().getPackage().getName()
					.equals(TransformationsConstants.TRACE_PACKAGE)) {
				// Do nothing.
			} else {
				// Do nothing.
			}
		}

		if (architecture != null) {
			saInstanceModel.getContents().add(architecture);
		}

		return saInstanceModel;
	}

	/**
	 * Stores a Resource object in its file.
	 * 
	 * @param resource
	 *            - Resource
	 */
	public static void saveResource(Resource resource) {
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
