/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram.impl;

import de.uni_stuttgart.iste.cowolf.model.commonBase.CommonBasePackage;
import de.uni_stuttgart.iste.cowolf.model.commonBase.NameBase;
import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.Component;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.Dependency;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.DependencyImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.DependencyImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.DependencyImpl#getClient <em>Client</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependencyImpl extends IDBaseImpl implements Dependency {
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
	 * The cached value of the '{@link #getSupplier() <em>Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier()
	 * @generated
	 * @ordered
	 */
	protected Component supplier;

	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected Component client;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_diagramPackage.Literals.DEPENDENCY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Component_diagramPackage.DEPENDENCY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getSupplier() {
		if (supplier != null && supplier.eIsProxy()) {
			InternalEObject oldSupplier = (InternalEObject)supplier;
			supplier = (Component)eResolveProxy(oldSupplier);
			if (supplier != oldSupplier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Component_diagramPackage.DEPENDENCY__SUPPLIER, oldSupplier, supplier));
			}
		}
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetSupplier() {
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplier(Component newSupplier, NotificationChain msgs) {
		Component oldSupplier = supplier;
		supplier = newSupplier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Component_diagramPackage.DEPENDENCY__SUPPLIER, oldSupplier, newSupplier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplier(Component newSupplier) {
		if (newSupplier != supplier) {
			NotificationChain msgs = null;
			if (supplier != null)
				msgs = ((InternalEObject)supplier).eInverseRemove(this, Component_diagramPackage.COMPONENT__ON_DEPEND, Component.class, msgs);
			if (newSupplier != null)
				msgs = ((InternalEObject)newSupplier).eInverseAdd(this, Component_diagramPackage.COMPONENT__ON_DEPEND, Component.class, msgs);
			msgs = basicSetSupplier(newSupplier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_diagramPackage.DEPENDENCY__SUPPLIER, newSupplier, newSupplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getClient() {
		if (client != null && client.eIsProxy()) {
			InternalEObject oldClient = (InternalEObject)client;
			client = (Component)eResolveProxy(oldClient);
			if (client != oldClient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Component_diagramPackage.DEPENDENCY__CLIENT, oldClient, client));
			}
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetClient() {
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient(Component newClient) {
		Component oldClient = client;
		client = newClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_diagramPackage.DEPENDENCY__CLIENT, oldClient, client));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Component_diagramPackage.DEPENDENCY__SUPPLIER:
				if (supplier != null)
					msgs = ((InternalEObject)supplier).eInverseRemove(this, Component_diagramPackage.COMPONENT__ON_DEPEND, Component.class, msgs);
				return basicSetSupplier((Component)otherEnd, msgs);
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
			case Component_diagramPackage.DEPENDENCY__SUPPLIER:
				return basicSetSupplier(null, msgs);
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
			case Component_diagramPackage.DEPENDENCY__NAME:
				return getName();
			case Component_diagramPackage.DEPENDENCY__SUPPLIER:
				if (resolve) return getSupplier();
				return basicGetSupplier();
			case Component_diagramPackage.DEPENDENCY__CLIENT:
				if (resolve) return getClient();
				return basicGetClient();
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
			case Component_diagramPackage.DEPENDENCY__NAME:
				setName((String)newValue);
				return;
			case Component_diagramPackage.DEPENDENCY__SUPPLIER:
				setSupplier((Component)newValue);
				return;
			case Component_diagramPackage.DEPENDENCY__CLIENT:
				setClient((Component)newValue);
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
			case Component_diagramPackage.DEPENDENCY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Component_diagramPackage.DEPENDENCY__SUPPLIER:
				setSupplier((Component)null);
				return;
			case Component_diagramPackage.DEPENDENCY__CLIENT:
				setClient((Component)null);
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
			case Component_diagramPackage.DEPENDENCY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Component_diagramPackage.DEPENDENCY__SUPPLIER:
				return supplier != null;
			case Component_diagramPackage.DEPENDENCY__CLIENT:
				return client != null;
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
				case Component_diagramPackage.DEPENDENCY__NAME: return CommonBasePackage.NAME_BASE__NAME;
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
				case CommonBasePackage.NAME_BASE__NAME: return Component_diagramPackage.DEPENDENCY__NAME;
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
		result.append(')');
		return result.toString();
	}

} //DependencyImpl
