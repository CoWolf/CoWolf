/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram.impl;

import de.uni_stuttgart.iste.cowolf.model.component_diagram.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Component_diagramFactoryImpl extends EFactoryImpl implements Component_diagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Component_diagramFactory init() {
		try {
			Component_diagramFactory theComponent_diagramFactory = (Component_diagramFactory)EPackage.Registry.INSTANCE.getEFactory(Component_diagramPackage.eNS_URI);
			if (theComponent_diagramFactory != null) {
				return theComponent_diagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Component_diagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component_diagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Component_diagramPackage.CONNECTOR: return createConnector();
			case Component_diagramPackage.PORT_INSTANCE: return createPortInstance();
			case Component_diagramPackage.HARDWARE_COMPONENT: return createHardwareComponent();
			case Component_diagramPackage.SOFTWARE_COMPONENT: return createSoftwareComponent();
			case Component_diagramPackage.ELECTRONIC_DEVICE: return createElectronicDevice();
			case Component_diagramPackage.MECHANICAL_DEVICE: return createMechanicalDevice();
			case Component_diagramPackage.ACTUATOR: return createActuator();
			case Component_diagramPackage.SENSOR: return createSensor();
			case Component_diagramPackage.ARCHITECTURE: return createArchitecture();
			case Component_diagramPackage.COMPONENT_INSTANCE: return createComponentInstance();
			case Component_diagramPackage.PORT_TYPE: return createPortType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortInstance createPortInstance() {
		PortInstanceImpl portInstance = new PortInstanceImpl();
		return portInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareComponent createHardwareComponent() {
		HardwareComponentImpl hardwareComponent = new HardwareComponentImpl();
		return hardwareComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareComponent createSoftwareComponent() {
		SoftwareComponentImpl softwareComponent = new SoftwareComponentImpl();
		return softwareComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectronicDevice createElectronicDevice() {
		ElectronicDeviceImpl electronicDevice = new ElectronicDeviceImpl();
		return electronicDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MechanicalDevice createMechanicalDevice() {
		MechanicalDeviceImpl mechanicalDevice = new MechanicalDeviceImpl();
		return mechanicalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator createActuator() {
		ActuatorImpl actuator = new ActuatorImpl();
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Architecture createArchitecture() {
		ArchitectureImpl architecture = new ArchitectureImpl();
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance createComponentInstance() {
		ComponentInstanceImpl componentInstance = new ComponentInstanceImpl();
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType createPortType() {
		PortTypeImpl portType = new PortTypeImpl();
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component_diagramPackage getComponent_diagramPackage() {
		return (Component_diagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Component_diagramPackage getPackage() {
		return Component_diagramPackage.eINSTANCE;
	}

} //Component_diagramFactoryImpl
