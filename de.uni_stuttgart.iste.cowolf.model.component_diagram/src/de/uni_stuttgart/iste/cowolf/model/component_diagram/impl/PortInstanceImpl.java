/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram.impl;

import de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.Connector;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.PortInstance;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.PortType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.PortInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.PortInstanceImpl#getConnect <em>Connect</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.PortInstanceImpl#getOutComponent <em>Out Component</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.PortInstanceImpl#getInComponent <em>In Component</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.PortInstanceImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortInstanceImpl extends MinimalEObjectImpl.Container implements PortInstance {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnect() <em>Connect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnect()
	 * @generated
	 * @ordered
	 */
	protected Connector connect;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PortType type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_diagramPackage.Literals.PORT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_diagramPackage.PORT_INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getConnect() {
		if (connect != null && connect.eIsProxy()) {
			InternalEObject oldConnect = (InternalEObject)connect;
			connect = (Connector)eResolveProxy(oldConnect);
			if (connect != oldConnect) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Component_diagramPackage.PORT_INSTANCE__CONNECT, oldConnect, connect));
			}
		}
		return connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetConnect() {
		return connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnect(Connector newConnect, NotificationChain msgs) {
		Connector oldConnect = connect;
		connect = newConnect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Component_diagramPackage.PORT_INSTANCE__CONNECT, oldConnect, newConnect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnect(Connector newConnect) {
		if (newConnect != connect) {
			NotificationChain msgs = null;
			if (connect != null)
				msgs = ((InternalEObject)connect).eInverseRemove(this, Component_diagramPackage.CONNECTOR__PORT, Connector.class, msgs);
			if (newConnect != null)
				msgs = ((InternalEObject)newConnect).eInverseAdd(this, Component_diagramPackage.CONNECTOR__PORT, Connector.class, msgs);
			msgs = basicSetConnect(newConnect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_diagramPackage.PORT_INSTANCE__CONNECT, newConnect, newConnect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getOutComponent() {
		if (eContainerFeatureID() != Component_diagramPackage.PORT_INSTANCE__OUT_COMPONENT) return null;
		return (ComponentInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutComponent(ComponentInstance newOutComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOutComponent, Component_diagramPackage.PORT_INSTANCE__OUT_COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutComponent(ComponentInstance newOutComponent) {
		if (newOutComponent != eInternalContainer() || (eContainerFeatureID() != Component_diagramPackage.PORT_INSTANCE__OUT_COMPONENT && newOutComponent != null)) {
			if (EcoreUtil.isAncestor(this, newOutComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOutComponent != null)
				msgs = ((InternalEObject)newOutComponent).eInverseAdd(this, Component_diagramPackage.COMPONENT_INSTANCE__OUT_PORTS, ComponentInstance.class, msgs);
			msgs = basicSetOutComponent(newOutComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_diagramPackage.PORT_INSTANCE__OUT_COMPONENT, newOutComponent, newOutComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getInComponent() {
		if (eContainerFeatureID() != Component_diagramPackage.PORT_INSTANCE__IN_COMPONENT) return null;
		return (ComponentInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInComponent(ComponentInstance newInComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInComponent, Component_diagramPackage.PORT_INSTANCE__IN_COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInComponent(ComponentInstance newInComponent) {
		if (newInComponent != eInternalContainer() || (eContainerFeatureID() != Component_diagramPackage.PORT_INSTANCE__IN_COMPONENT && newInComponent != null)) {
			if (EcoreUtil.isAncestor(this, newInComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInComponent != null)
				msgs = ((InternalEObject)newInComponent).eInverseAdd(this, Component_diagramPackage.COMPONENT_INSTANCE__IN_PORTS, ComponentInstance.class, msgs);
			msgs = basicSetInComponent(newInComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_diagramPackage.PORT_INSTANCE__IN_COMPONENT, newInComponent, newInComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (PortType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Component_diagramPackage.PORT_INSTANCE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(PortType newType, NotificationChain msgs) {
		PortType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Component_diagramPackage.PORT_INSTANCE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PortType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, Component_diagramPackage.PORT_TYPE__PORT_INSTANCE, PortType.class, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, Component_diagramPackage.PORT_TYPE__PORT_INSTANCE, PortType.class, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_diagramPackage.PORT_INSTANCE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Component_diagramPackage.PORT_INSTANCE__CONNECT:
				if (connect != null)
					msgs = ((InternalEObject)connect).eInverseRemove(this, Component_diagramPackage.CONNECTOR__PORT, Connector.class, msgs);
				return basicSetConnect((Connector)otherEnd, msgs);
			case Component_diagramPackage.PORT_INSTANCE__OUT_COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOutComponent((ComponentInstance)otherEnd, msgs);
			case Component_diagramPackage.PORT_INSTANCE__IN_COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInComponent((ComponentInstance)otherEnd, msgs);
			case Component_diagramPackage.PORT_INSTANCE__TYPE:
				if (type != null)
					msgs = ((InternalEObject)type).eInverseRemove(this, Component_diagramPackage.PORT_TYPE__PORT_INSTANCE, PortType.class, msgs);
				return basicSetType((PortType)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Component_diagramPackage.PORT_INSTANCE__CONNECT:
				return basicSetConnect(null, msgs);
			case Component_diagramPackage.PORT_INSTANCE__OUT_COMPONENT:
				return basicSetOutComponent(null, msgs);
			case Component_diagramPackage.PORT_INSTANCE__IN_COMPONENT:
				return basicSetInComponent(null, msgs);
			case Component_diagramPackage.PORT_INSTANCE__TYPE:
				return basicSetType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Component_diagramPackage.PORT_INSTANCE__OUT_COMPONENT:
				return eInternalContainer().eInverseRemove(this, Component_diagramPackage.COMPONENT_INSTANCE__OUT_PORTS, ComponentInstance.class, msgs);
			case Component_diagramPackage.PORT_INSTANCE__IN_COMPONENT:
				return eInternalContainer().eInverseRemove(this, Component_diagramPackage.COMPONENT_INSTANCE__IN_PORTS, ComponentInstance.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Component_diagramPackage.PORT_INSTANCE__NAME:
				return getName();
			case Component_diagramPackage.PORT_INSTANCE__CONNECT:
				if (resolve) return getConnect();
				return basicGetConnect();
			case Component_diagramPackage.PORT_INSTANCE__OUT_COMPONENT:
				return getOutComponent();
			case Component_diagramPackage.PORT_INSTANCE__IN_COMPONENT:
				return getInComponent();
			case Component_diagramPackage.PORT_INSTANCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Component_diagramPackage.PORT_INSTANCE__NAME:
				setName((String)newValue);
				return;
			case Component_diagramPackage.PORT_INSTANCE__CONNECT:
				setConnect((Connector)newValue);
				return;
			case Component_diagramPackage.PORT_INSTANCE__OUT_COMPONENT:
				setOutComponent((ComponentInstance)newValue);
				return;
			case Component_diagramPackage.PORT_INSTANCE__IN_COMPONENT:
				setInComponent((ComponentInstance)newValue);
				return;
			case Component_diagramPackage.PORT_INSTANCE__TYPE:
				setType((PortType)newValue);
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
			case Component_diagramPackage.PORT_INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Component_diagramPackage.PORT_INSTANCE__CONNECT:
				setConnect((Connector)null);
				return;
			case Component_diagramPackage.PORT_INSTANCE__OUT_COMPONENT:
				setOutComponent((ComponentInstance)null);
				return;
			case Component_diagramPackage.PORT_INSTANCE__IN_COMPONENT:
				setInComponent((ComponentInstance)null);
				return;
			case Component_diagramPackage.PORT_INSTANCE__TYPE:
				setType((PortType)null);
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
			case Component_diagramPackage.PORT_INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Component_diagramPackage.PORT_INSTANCE__CONNECT:
				return connect != null;
			case Component_diagramPackage.PORT_INSTANCE__OUT_COMPONENT:
				return getOutComponent() != null;
			case Component_diagramPackage.PORT_INSTANCE__IN_COMPONENT:
				return getInComponent() != null;
			case Component_diagramPackage.PORT_INSTANCE__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PortInstanceImpl
