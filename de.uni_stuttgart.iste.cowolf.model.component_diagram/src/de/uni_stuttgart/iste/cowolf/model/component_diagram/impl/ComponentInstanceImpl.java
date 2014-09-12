/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram.impl;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentType;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.PortInstance;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ComponentInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ComponentInstanceImpl#getSubcomponent <em>Subcomponent</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ComponentInstanceImpl#getParentcomponent <em>Parentcomponent</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ComponentInstanceImpl#getInPorts <em>In Ports</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ComponentInstanceImpl#getOutPorts <em>Out Ports</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ComponentInstanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ComponentInstanceImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentInstanceImpl extends IDBaseImpl implements ComponentInstance {
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
	 * The cached value of the '{@link #getSubcomponent() <em>Subcomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubcomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstance> subcomponent;

	/**
	 * The cached value of the '{@link #getInPorts() <em>In Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<PortInstance> inPorts;

	/**
	 * The cached value of the '{@link #getOutPorts() <em>Out Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<PortInstance> outPorts;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ComponentType type;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected int version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_diagramPackage.Literals.COMPONENT_INSTANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Component_diagramPackage.COMPONENT_INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInstance> getSubcomponent() {
		if (subcomponent == null) {
			subcomponent = new EObjectContainmentWithInverseEList<ComponentInstance>(ComponentInstance.class, this, Component_diagramPackage.COMPONENT_INSTANCE__SUBCOMPONENT, Component_diagramPackage.COMPONENT_INSTANCE__PARENTCOMPONENT);
		}
		return subcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getParentcomponent() {
		if (eContainerFeatureID() != Component_diagramPackage.COMPONENT_INSTANCE__PARENTCOMPONENT) return null;
		return (ComponentInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentcomponent(ComponentInstance newParentcomponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentcomponent, Component_diagramPackage.COMPONENT_INSTANCE__PARENTCOMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentcomponent(ComponentInstance newParentcomponent) {
		if (newParentcomponent != eInternalContainer() || (eContainerFeatureID() != Component_diagramPackage.COMPONENT_INSTANCE__PARENTCOMPONENT && newParentcomponent != null)) {
			if (EcoreUtil.isAncestor(this, newParentcomponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentcomponent != null)
				msgs = ((InternalEObject)newParentcomponent).eInverseAdd(this, Component_diagramPackage.COMPONENT_INSTANCE__SUBCOMPONENT, ComponentInstance.class, msgs);
			msgs = basicSetParentcomponent(newParentcomponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_diagramPackage.COMPONENT_INSTANCE__PARENTCOMPONENT, newParentcomponent, newParentcomponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortInstance> getInPorts() {
		if (inPorts == null) {
			inPorts = new EObjectContainmentWithInverseEList<PortInstance>(PortInstance.class, this, Component_diagramPackage.COMPONENT_INSTANCE__IN_PORTS, Component_diagramPackage.PORT_INSTANCE__IN_COMPONENT);
		}
		return inPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortInstance> getOutPorts() {
		if (outPorts == null) {
			outPorts = new EObjectContainmentWithInverseEList<PortInstance>(PortInstance.class, this, Component_diagramPackage.COMPONENT_INSTANCE__OUT_PORTS, Component_diagramPackage.PORT_INSTANCE__OUT_COMPONENT);
		}
		return outPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (ComponentType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Component_diagramPackage.COMPONENT_INSTANCE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ComponentType newType, NotificationChain msgs) {
		ComponentType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Component_diagramPackage.COMPONENT_INSTANCE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ComponentType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, Component_diagramPackage.COMPONENT_TYPE__INSTANCE, ComponentType.class, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, Component_diagramPackage.COMPONENT_TYPE__INSTANCE, ComponentType.class, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_diagramPackage.COMPONENT_INSTANCE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(int newVersion) {
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_diagramPackage.COMPONENT_INSTANCE__VERSION, oldVersion, version));
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
			case Component_diagramPackage.COMPONENT_INSTANCE__SUBCOMPONENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubcomponent()).basicAdd(otherEnd, msgs);
			case Component_diagramPackage.COMPONENT_INSTANCE__PARENTCOMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentcomponent((ComponentInstance)otherEnd, msgs);
			case Component_diagramPackage.COMPONENT_INSTANCE__IN_PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInPorts()).basicAdd(otherEnd, msgs);
			case Component_diagramPackage.COMPONENT_INSTANCE__OUT_PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutPorts()).basicAdd(otherEnd, msgs);
			case Component_diagramPackage.COMPONENT_INSTANCE__TYPE:
				if (type != null)
					msgs = ((InternalEObject)type).eInverseRemove(this, Component_diagramPackage.COMPONENT_TYPE__INSTANCE, ComponentType.class, msgs);
				return basicSetType((ComponentType)otherEnd, msgs);
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
			case Component_diagramPackage.COMPONENT_INSTANCE__SUBCOMPONENT:
				return ((InternalEList<?>)getSubcomponent()).basicRemove(otherEnd, msgs);
			case Component_diagramPackage.COMPONENT_INSTANCE__PARENTCOMPONENT:
				return basicSetParentcomponent(null, msgs);
			case Component_diagramPackage.COMPONENT_INSTANCE__IN_PORTS:
				return ((InternalEList<?>)getInPorts()).basicRemove(otherEnd, msgs);
			case Component_diagramPackage.COMPONENT_INSTANCE__OUT_PORTS:
				return ((InternalEList<?>)getOutPorts()).basicRemove(otherEnd, msgs);
			case Component_diagramPackage.COMPONENT_INSTANCE__TYPE:
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
			case Component_diagramPackage.COMPONENT_INSTANCE__PARENTCOMPONENT:
				return eInternalContainer().eInverseRemove(this, Component_diagramPackage.COMPONENT_INSTANCE__SUBCOMPONENT, ComponentInstance.class, msgs);
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
			case Component_diagramPackage.COMPONENT_INSTANCE__NAME:
				return getName();
			case Component_diagramPackage.COMPONENT_INSTANCE__SUBCOMPONENT:
				return getSubcomponent();
			case Component_diagramPackage.COMPONENT_INSTANCE__PARENTCOMPONENT:
				return getParentcomponent();
			case Component_diagramPackage.COMPONENT_INSTANCE__IN_PORTS:
				return getInPorts();
			case Component_diagramPackage.COMPONENT_INSTANCE__OUT_PORTS:
				return getOutPorts();
			case Component_diagramPackage.COMPONENT_INSTANCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case Component_diagramPackage.COMPONENT_INSTANCE__VERSION:
				return getVersion();
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
			case Component_diagramPackage.COMPONENT_INSTANCE__NAME:
				setName((String)newValue);
				return;
			case Component_diagramPackage.COMPONENT_INSTANCE__SUBCOMPONENT:
				getSubcomponent().clear();
				getSubcomponent().addAll((Collection<? extends ComponentInstance>)newValue);
				return;
			case Component_diagramPackage.COMPONENT_INSTANCE__PARENTCOMPONENT:
				setParentcomponent((ComponentInstance)newValue);
				return;
			case Component_diagramPackage.COMPONENT_INSTANCE__IN_PORTS:
				getInPorts().clear();
				getInPorts().addAll((Collection<? extends PortInstance>)newValue);
				return;
			case Component_diagramPackage.COMPONENT_INSTANCE__OUT_PORTS:
				getOutPorts().clear();
				getOutPorts().addAll((Collection<? extends PortInstance>)newValue);
				return;
			case Component_diagramPackage.COMPONENT_INSTANCE__TYPE:
				setType((ComponentType)newValue);
				return;
			case Component_diagramPackage.COMPONENT_INSTANCE__VERSION:
				setVersion((Integer)newValue);
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
			case Component_diagramPackage.COMPONENT_INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Component_diagramPackage.COMPONENT_INSTANCE__SUBCOMPONENT:
				getSubcomponent().clear();
				return;
			case Component_diagramPackage.COMPONENT_INSTANCE__PARENTCOMPONENT:
				setParentcomponent((ComponentInstance)null);
				return;
			case Component_diagramPackage.COMPONENT_INSTANCE__IN_PORTS:
				getInPorts().clear();
				return;
			case Component_diagramPackage.COMPONENT_INSTANCE__OUT_PORTS:
				getOutPorts().clear();
				return;
			case Component_diagramPackage.COMPONENT_INSTANCE__TYPE:
				setType((ComponentType)null);
				return;
			case Component_diagramPackage.COMPONENT_INSTANCE__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case Component_diagramPackage.COMPONENT_INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Component_diagramPackage.COMPONENT_INSTANCE__SUBCOMPONENT:
				return subcomponent != null && !subcomponent.isEmpty();
			case Component_diagramPackage.COMPONENT_INSTANCE__PARENTCOMPONENT:
				return getParentcomponent() != null;
			case Component_diagramPackage.COMPONENT_INSTANCE__IN_PORTS:
				return inPorts != null && !inPorts.isEmpty();
			case Component_diagramPackage.COMPONENT_INSTANCE__OUT_PORTS:
				return outPorts != null && !outPorts.isEmpty();
			case Component_diagramPackage.COMPONENT_INSTANCE__TYPE:
				return type != null;
			case Component_diagramPackage.COMPONENT_INSTANCE__VERSION:
				return version != VERSION_EDEFAULT;
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
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ComponentInstanceImpl
