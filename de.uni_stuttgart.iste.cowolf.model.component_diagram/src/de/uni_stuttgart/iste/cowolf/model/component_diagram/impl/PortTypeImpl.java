/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram.impl;

import de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentType;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.PortInstance;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.PortType;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.PortTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.PortTypeImpl#getComponent_type <em>Component type</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.PortTypeImpl#getPort_instance <em>Port instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortTypeImpl extends MinimalEObjectImpl.Container implements PortType {
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
	 * The cached value of the '{@link #getPort_instance() <em>Port instance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort_instance()
	 * @generated
	 * @ordered
	 */
	protected EList<PortInstance> port_instance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_diagramPackage.Literals.PORT_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Component_diagramPackage.PORT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType getComponent_type() {
		if (eContainerFeatureID() != Component_diagramPackage.PORT_TYPE__COMPONENT_TYPE) return null;
		return (ComponentType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent_type(ComponentType newComponent_type, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComponent_type, Component_diagramPackage.PORT_TYPE__COMPONENT_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent_type(ComponentType newComponent_type) {
		if (newComponent_type != eInternalContainer() || (eContainerFeatureID() != Component_diagramPackage.PORT_TYPE__COMPONENT_TYPE && newComponent_type != null)) {
			if (EcoreUtil.isAncestor(this, newComponent_type))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponent_type != null)
				msgs = ((InternalEObject)newComponent_type).eInverseAdd(this, Component_diagramPackage.COMPONENT_TYPE__PORT_TYPES, ComponentType.class, msgs);
			msgs = basicSetComponent_type(newComponent_type, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_diagramPackage.PORT_TYPE__COMPONENT_TYPE, newComponent_type, newComponent_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortInstance> getPort_instance() {
		if (port_instance == null) {
			port_instance = new EObjectWithInverseResolvingEList<PortInstance>(PortInstance.class, this, Component_diagramPackage.PORT_TYPE__PORT_INSTANCE, Component_diagramPackage.PORT_INSTANCE__TYPE);
		}
		return port_instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Component_diagramPackage.PORT_TYPE__COMPONENT_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComponent_type((ComponentType)otherEnd, msgs);
			case Component_diagramPackage.PORT_TYPE__PORT_INSTANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPort_instance()).basicAdd(otherEnd, msgs);
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
			case Component_diagramPackage.PORT_TYPE__COMPONENT_TYPE:
				return basicSetComponent_type(null, msgs);
			case Component_diagramPackage.PORT_TYPE__PORT_INSTANCE:
				return ((InternalEList<?>)getPort_instance()).basicRemove(otherEnd, msgs);
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
			case Component_diagramPackage.PORT_TYPE__COMPONENT_TYPE:
				return eInternalContainer().eInverseRemove(this, Component_diagramPackage.COMPONENT_TYPE__PORT_TYPES, ComponentType.class, msgs);
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
			case Component_diagramPackage.PORT_TYPE__NAME:
				return getName();
			case Component_diagramPackage.PORT_TYPE__COMPONENT_TYPE:
				return getComponent_type();
			case Component_diagramPackage.PORT_TYPE__PORT_INSTANCE:
				return getPort_instance();
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
			case Component_diagramPackage.PORT_TYPE__NAME:
				setName((String)newValue);
				return;
			case Component_diagramPackage.PORT_TYPE__COMPONENT_TYPE:
				setComponent_type((ComponentType)newValue);
				return;
			case Component_diagramPackage.PORT_TYPE__PORT_INSTANCE:
				getPort_instance().clear();
				getPort_instance().addAll((Collection<? extends PortInstance>)newValue);
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
			case Component_diagramPackage.PORT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Component_diagramPackage.PORT_TYPE__COMPONENT_TYPE:
				setComponent_type((ComponentType)null);
				return;
			case Component_diagramPackage.PORT_TYPE__PORT_INSTANCE:
				getPort_instance().clear();
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
			case Component_diagramPackage.PORT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Component_diagramPackage.PORT_TYPE__COMPONENT_TYPE:
				return getComponent_type() != null;
			case Component_diagramPackage.PORT_TYPE__PORT_INSTANCE:
				return port_instance != null && !port_instance.isEmpty();
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

} //PortTypeImpl
