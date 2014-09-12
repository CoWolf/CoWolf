/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram.impl;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.Architecture;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentType;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.Connector;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.PortInstance;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.PortType;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ArchitectureImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ArchitectureImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ArchitectureImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ArchitectureImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ArchitectureImpl#getPort_type <em>Port type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArchitectureImpl extends IDBaseImpl implements Architecture {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentType> component;

	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connectors;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<PortInstance> ports;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstance> instances;

	/**
	 * The cached value of the '{@link #getPort_type() <em>Port type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_type()
	 * @generated
	 * @ordered
	 */
	protected EList<PortType> port_type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_diagramPackage.Literals.ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentType> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<ComponentType>(ComponentType.class, this, Component_diagramPackage.ARCHITECTURE__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentEList<Connector>(Connector.class, this, Component_diagramPackage.ARCHITECTURE__CONNECTORS);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortInstance> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<PortInstance>(PortInstance.class, this, Component_diagramPackage.ARCHITECTURE__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInstance> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentEList<ComponentInstance>(ComponentInstance.class, this, Component_diagramPackage.ARCHITECTURE__INSTANCES);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortType> getPort_type() {
		if (port_type == null) {
			port_type = new EObjectContainmentEList<PortType>(PortType.class, this, Component_diagramPackage.ARCHITECTURE__PORT_TYPE);
		}
		return port_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Component_diagramPackage.ARCHITECTURE__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case Component_diagramPackage.ARCHITECTURE__CONNECTORS:
				return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
			case Component_diagramPackage.ARCHITECTURE__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case Component_diagramPackage.ARCHITECTURE__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
			case Component_diagramPackage.ARCHITECTURE__PORT_TYPE:
				return ((InternalEList<?>)getPort_type()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Component_diagramPackage.ARCHITECTURE__COMPONENT:
				return getComponent();
			case Component_diagramPackage.ARCHITECTURE__CONNECTORS:
				return getConnectors();
			case Component_diagramPackage.ARCHITECTURE__PORTS:
				return getPorts();
			case Component_diagramPackage.ARCHITECTURE__INSTANCES:
				return getInstances();
			case Component_diagramPackage.ARCHITECTURE__PORT_TYPE:
				return getPort_type();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Component_diagramPackage.ARCHITECTURE__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends ComponentType>)newValue);
				return;
			case Component_diagramPackage.ARCHITECTURE__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends Connector>)newValue);
				return;
			case Component_diagramPackage.ARCHITECTURE__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends PortInstance>)newValue);
				return;
			case Component_diagramPackage.ARCHITECTURE__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends ComponentInstance>)newValue);
				return;
			case Component_diagramPackage.ARCHITECTURE__PORT_TYPE:
				getPort_type().clear();
				getPort_type().addAll((Collection<? extends PortType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Component_diagramPackage.ARCHITECTURE__COMPONENT:
				getComponent().clear();
				return;
			case Component_diagramPackage.ARCHITECTURE__CONNECTORS:
				getConnectors().clear();
				return;
			case Component_diagramPackage.ARCHITECTURE__PORTS:
				getPorts().clear();
				return;
			case Component_diagramPackage.ARCHITECTURE__INSTANCES:
				getInstances().clear();
				return;
			case Component_diagramPackage.ARCHITECTURE__PORT_TYPE:
				getPort_type().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Component_diagramPackage.ARCHITECTURE__COMPONENT:
				return component != null && !component.isEmpty();
			case Component_diagramPackage.ARCHITECTURE__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
			case Component_diagramPackage.ARCHITECTURE__PORTS:
				return ports != null && !ports.isEmpty();
			case Component_diagramPackage.ARCHITECTURE__INSTANCES:
				return instances != null && !instances.isEmpty();
			case Component_diagramPackage.ARCHITECTURE__PORT_TYPE:
				return port_type != null && !port_type.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArchitectureImpl
