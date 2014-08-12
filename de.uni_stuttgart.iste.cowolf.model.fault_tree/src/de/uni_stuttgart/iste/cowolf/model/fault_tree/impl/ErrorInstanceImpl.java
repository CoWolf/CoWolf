/**
 */
package de.uni_stuttgart.iste.cowolf.model.fault_tree.impl;

import de.uni_stuttgart.iste.cowolf.model.fault_tree.BasicEvent;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorInstance;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorType;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.Root;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.ErrorInstanceImpl#getError <em>Error</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.ErrorInstanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.ErrorInstanceImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.ErrorInstanceImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorInstanceImpl extends EObjectImpl implements ErrorInstance {
	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected BasicEvent error;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ErrorType type;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaultTreePackage.Literals.ERROR_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicEvent getError() {
		if (error != null && error.eIsProxy()) {
			InternalEObject oldError = (InternalEObject)error;
			error = (BasicEvent)eResolveProxy(oldError);
			if (error != oldError) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaultTreePackage.ERROR_INSTANCE__ERROR, oldError, error));
			}
		}
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicEvent basicGetError() {
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetError(BasicEvent newError, NotificationChain msgs) {
		BasicEvent oldError = error;
		error = newError;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaultTreePackage.ERROR_INSTANCE__ERROR, oldError, newError);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setError(BasicEvent newError) {
		if (newError != error) {
			NotificationChain msgs = null;
			if (error != null)
				msgs = ((InternalEObject)error).eInverseRemove(this, FaultTreePackage.BASIC_EVENT__INSTANCE, BasicEvent.class, msgs);
			if (newError != null)
				msgs = ((InternalEObject)newError).eInverseAdd(this, FaultTreePackage.BASIC_EVENT__INSTANCE, BasicEvent.class, msgs);
			msgs = basicSetError(newError, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaultTreePackage.ERROR_INSTANCE__ERROR, newError, newError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (ErrorType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaultTreePackage.ERROR_INSTANCE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ErrorType newType, NotificationChain msgs) {
		ErrorType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaultTreePackage.ERROR_INSTANCE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ErrorType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, FaultTreePackage.ERROR_TYPE__ERROR, ErrorType.class, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, FaultTreePackage.ERROR_TYPE__ERROR, ErrorType.class, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaultTreePackage.ERROR_INSTANCE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root getRoot() {
		if (eContainerFeatureID() != FaultTreePackage.ERROR_INSTANCE__ROOT) return null;
		return (Root)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(Root newRoot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRoot, FaultTreePackage.ERROR_INSTANCE__ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(Root newRoot) {
		if (newRoot != eInternalContainer() || (eContainerFeatureID() != FaultTreePackage.ERROR_INSTANCE__ROOT && newRoot != null)) {
			if (EcoreUtil.isAncestor(this, newRoot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRoot != null)
				msgs = ((InternalEObject)newRoot).eInverseAdd(this, FaultTreePackage.ROOT__ERROR_INSTANCE, Root.class, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaultTreePackage.ERROR_INSTANCE__ROOT, newRoot, newRoot));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaultTreePackage.ERROR_INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FaultTreePackage.ERROR_INSTANCE__ERROR:
				if (error != null)
					msgs = ((InternalEObject)error).eInverseRemove(this, FaultTreePackage.BASIC_EVENT__INSTANCE, BasicEvent.class, msgs);
				return basicSetError((BasicEvent)otherEnd, msgs);
			case FaultTreePackage.ERROR_INSTANCE__TYPE:
				if (type != null)
					msgs = ((InternalEObject)type).eInverseRemove(this, FaultTreePackage.ERROR_TYPE__ERROR, ErrorType.class, msgs);
				return basicSetType((ErrorType)otherEnd, msgs);
			case FaultTreePackage.ERROR_INSTANCE__ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRoot((Root)otherEnd, msgs);
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
			case FaultTreePackage.ERROR_INSTANCE__ERROR:
				return basicSetError(null, msgs);
			case FaultTreePackage.ERROR_INSTANCE__TYPE:
				return basicSetType(null, msgs);
			case FaultTreePackage.ERROR_INSTANCE__ROOT:
				return basicSetRoot(null, msgs);
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
			case FaultTreePackage.ERROR_INSTANCE__ROOT:
				return eInternalContainer().eInverseRemove(this, FaultTreePackage.ROOT__ERROR_INSTANCE, Root.class, msgs);
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
			case FaultTreePackage.ERROR_INSTANCE__ERROR:
				if (resolve) return getError();
				return basicGetError();
			case FaultTreePackage.ERROR_INSTANCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FaultTreePackage.ERROR_INSTANCE__ROOT:
				return getRoot();
			case FaultTreePackage.ERROR_INSTANCE__NAME:
				return getName();
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
			case FaultTreePackage.ERROR_INSTANCE__ERROR:
				setError((BasicEvent)newValue);
				return;
			case FaultTreePackage.ERROR_INSTANCE__TYPE:
				setType((ErrorType)newValue);
				return;
			case FaultTreePackage.ERROR_INSTANCE__ROOT:
				setRoot((Root)newValue);
				return;
			case FaultTreePackage.ERROR_INSTANCE__NAME:
				setName((String)newValue);
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
			case FaultTreePackage.ERROR_INSTANCE__ERROR:
				setError((BasicEvent)null);
				return;
			case FaultTreePackage.ERROR_INSTANCE__TYPE:
				setType((ErrorType)null);
				return;
			case FaultTreePackage.ERROR_INSTANCE__ROOT:
				setRoot((Root)null);
				return;
			case FaultTreePackage.ERROR_INSTANCE__NAME:
				setName(NAME_EDEFAULT);
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
			case FaultTreePackage.ERROR_INSTANCE__ERROR:
				return error != null;
			case FaultTreePackage.ERROR_INSTANCE__TYPE:
				return type != null;
			case FaultTreePackage.ERROR_INSTANCE__ROOT:
				return getRoot() != null;
			case FaultTreePackage.ERROR_INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //ErrorInstanceImpl
