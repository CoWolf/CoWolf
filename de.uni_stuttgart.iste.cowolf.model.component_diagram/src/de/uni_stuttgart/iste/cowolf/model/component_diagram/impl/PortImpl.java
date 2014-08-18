/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram.impl;

import de.uni_stuttgart.iste.cowolf.model.commonBase.CommonBasePackage;
import de.uni_stuttgart.iste.cowolf.model.commonBase.NameBase;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;

import de.uni_stuttgart.iste.cowolf.model.component_diagram.Component;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramemfPackage;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.Interface;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.Port;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.PortImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.PortImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.PortImpl#isIsBehavior <em>Is Behavior</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.PortImpl#isIsService <em>Is Service</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.PortImpl#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.PortImpl#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.PortImpl#getPortHost <em>Port Host</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortImpl extends IDBaseImpl implements Port {
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
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected String protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsBehavior() <em>Is Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BEHAVIOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBehavior() <em>Is Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBehavior()
	 * @generated
	 * @ordered
	 */
	protected boolean isBehavior = IS_BEHAVIOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsService() <em>Is Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsService()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SERVICE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsService() <em>Is Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsService()
	 * @generated
	 * @ordered
	 */
	protected boolean isService = IS_SERVICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiredInterfaces() <em>Required Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> requiredInterfaces;

	/**
	 * The cached value of the '{@link #getProvidedInterfaces() <em>Provided Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> providedInterfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_diagramemfPackage.Literals.PORT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Component_diagramemfPackage.PORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(String newProtocol) {
		String oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_diagramemfPackage.PORT__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBehavior() {
		return isBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBehavior(boolean newIsBehavior) {
		boolean oldIsBehavior = isBehavior;
		isBehavior = newIsBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_diagramemfPackage.PORT__IS_BEHAVIOR, oldIsBehavior, isBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsService() {
		return isService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsService(boolean newIsService) {
		boolean oldIsService = isService;
		isService = newIsService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_diagramemfPackage.PORT__IS_SERVICE, oldIsService, isService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getRequiredInterfaces() {
		if (requiredInterfaces == null) {
			requiredInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, Component_diagramemfPackage.PORT__REQUIRED_INTERFACES);
		}
		return requiredInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getProvidedInterfaces() {
		if (providedInterfaces == null) {
			providedInterfaces = new EObjectWithInverseResolvingEList<Interface>(Interface.class, this, Component_diagramemfPackage.PORT__PROVIDED_INTERFACES, Component_diagramemfPackage.INTERFACE__HOME_PORT);
		}
		return providedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getPortHost() {
		if (eContainerFeatureID() != Component_diagramemfPackage.PORT__PORT_HOST) return null;
		return (Component)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortHost(Component newPortHost, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPortHost, Component_diagramemfPackage.PORT__PORT_HOST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortHost(Component newPortHost) {
		if (newPortHost != eInternalContainer() || (eContainerFeatureID() != Component_diagramemfPackage.PORT__PORT_HOST && newPortHost != null)) {
			if (EcoreUtil.isAncestor(this, newPortHost))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPortHost != null)
				msgs = ((InternalEObject)newPortHost).eInverseAdd(this, Component_diagramemfPackage.COMPONENT__PORTS, Component.class, msgs);
			msgs = basicSetPortHost(newPortHost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_diagramemfPackage.PORT__PORT_HOST, newPortHost, newPortHost));
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
			case Component_diagramemfPackage.PORT__PROVIDED_INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvidedInterfaces()).basicAdd(otherEnd, msgs);
			case Component_diagramemfPackage.PORT__PORT_HOST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPortHost((Component)otherEnd, msgs);
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
			case Component_diagramemfPackage.PORT__PROVIDED_INTERFACES:
				return ((InternalEList<?>)getProvidedInterfaces()).basicRemove(otherEnd, msgs);
			case Component_diagramemfPackage.PORT__PORT_HOST:
				return basicSetPortHost(null, msgs);
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
			case Component_diagramemfPackage.PORT__PORT_HOST:
				return eInternalContainer().eInverseRemove(this, Component_diagramemfPackage.COMPONENT__PORTS, Component.class, msgs);
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
			case Component_diagramemfPackage.PORT__NAME:
				return getName();
			case Component_diagramemfPackage.PORT__PROTOCOL:
				return getProtocol();
			case Component_diagramemfPackage.PORT__IS_BEHAVIOR:
				return isIsBehavior();
			case Component_diagramemfPackage.PORT__IS_SERVICE:
				return isIsService();
			case Component_diagramemfPackage.PORT__REQUIRED_INTERFACES:
				return getRequiredInterfaces();
			case Component_diagramemfPackage.PORT__PROVIDED_INTERFACES:
				return getProvidedInterfaces();
			case Component_diagramemfPackage.PORT__PORT_HOST:
				return getPortHost();
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
			case Component_diagramemfPackage.PORT__NAME:
				setName((String)newValue);
				return;
			case Component_diagramemfPackage.PORT__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case Component_diagramemfPackage.PORT__IS_BEHAVIOR:
				setIsBehavior((Boolean)newValue);
				return;
			case Component_diagramemfPackage.PORT__IS_SERVICE:
				setIsService((Boolean)newValue);
				return;
			case Component_diagramemfPackage.PORT__REQUIRED_INTERFACES:
				getRequiredInterfaces().clear();
				getRequiredInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case Component_diagramemfPackage.PORT__PROVIDED_INTERFACES:
				getProvidedInterfaces().clear();
				getProvidedInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case Component_diagramemfPackage.PORT__PORT_HOST:
				setPortHost((Component)newValue);
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
			case Component_diagramemfPackage.PORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Component_diagramemfPackage.PORT__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case Component_diagramemfPackage.PORT__IS_BEHAVIOR:
				setIsBehavior(IS_BEHAVIOR_EDEFAULT);
				return;
			case Component_diagramemfPackage.PORT__IS_SERVICE:
				setIsService(IS_SERVICE_EDEFAULT);
				return;
			case Component_diagramemfPackage.PORT__REQUIRED_INTERFACES:
				getRequiredInterfaces().clear();
				return;
			case Component_diagramemfPackage.PORT__PROVIDED_INTERFACES:
				getProvidedInterfaces().clear();
				return;
			case Component_diagramemfPackage.PORT__PORT_HOST:
				setPortHost((Component)null);
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
			case Component_diagramemfPackage.PORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Component_diagramemfPackage.PORT__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case Component_diagramemfPackage.PORT__IS_BEHAVIOR:
				return isBehavior != IS_BEHAVIOR_EDEFAULT;
			case Component_diagramemfPackage.PORT__IS_SERVICE:
				return isService != IS_SERVICE_EDEFAULT;
			case Component_diagramemfPackage.PORT__REQUIRED_INTERFACES:
				return requiredInterfaces != null && !requiredInterfaces.isEmpty();
			case Component_diagramemfPackage.PORT__PROVIDED_INTERFACES:
				return providedInterfaces != null && !providedInterfaces.isEmpty();
			case Component_diagramemfPackage.PORT__PORT_HOST:
				return getPortHost() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NameBase.class) {
			switch (derivedFeatureID) {
				case Component_diagramemfPackage.PORT__NAME: return CommonBasePackage.NAME_BASE__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NameBase.class) {
			switch (baseFeatureID) {
				case CommonBasePackage.NAME_BASE__NAME: return Component_diagramemfPackage.PORT__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", protocol: ");
		result.append(protocol);
		result.append(", isBehavior: ");
		result.append(isBehavior);
		result.append(", isService: ");
		result.append(isService);
		result.append(')');
		return result.toString();
	}

} //PortImpl
