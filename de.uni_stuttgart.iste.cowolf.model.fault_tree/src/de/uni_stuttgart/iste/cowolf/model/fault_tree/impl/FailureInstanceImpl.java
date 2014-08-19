/**
 */
package de.uni_stuttgart.iste.cowolf.model.fault_tree.impl;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorInstance;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureType;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.IntermediateEvent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failure Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FailureInstanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FailureInstanceImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FailureInstanceImpl#getPreviousFailure <em>Previous Failure</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FailureInstanceImpl#getPreviousError <em>Previous Error</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FailureInstanceImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FailureInstanceImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FailureInstanceImpl extends IDBaseImpl implements FailureInstance {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected FailureType type;

	/**
	 * The cached value of the '{@link #getPreviousFailure() <em>Previous Failure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousFailure()
	 * @generated
	 * @ordered
	 */
	protected FailureInstance previousFailure;

	/**
	 * The cached value of the '{@link #getPreviousError() <em>Previous Error</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousError()
	 * @generated
	 * @ordered
	 */
	protected ErrorInstance previousError;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected IntermediateEvent event;

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
	protected FailureInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaultTreePackage.Literals.FAILURE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (FailureType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaultTreePackage.FAILURE_INSTANCE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(FailureType newType, NotificationChain msgs) {
		FailureType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaultTreePackage.FAILURE_INSTANCE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(FailureType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, FaultTreePackage.FAILURE_TYPE__INSTANCE, FailureType.class, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, FaultTreePackage.FAILURE_TYPE__INSTANCE, FailureType.class, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaultTreePackage.FAILURE_INSTANCE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultTree getRoot() {
		if (eContainerFeatureID() != FaultTreePackage.FAILURE_INSTANCE__ROOT) return null;
		return (FaultTree)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(FaultTree newRoot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRoot, FaultTreePackage.FAILURE_INSTANCE__ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(FaultTree newRoot) {
		if (newRoot != eInternalContainer() || (eContainerFeatureID() != FaultTreePackage.FAILURE_INSTANCE__ROOT && newRoot != null)) {
			if (EcoreUtil.isAncestor(this, newRoot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRoot != null)
				msgs = ((InternalEObject)newRoot).eInverseAdd(this, FaultTreePackage.FAULT_TREE__FAILURE_INSTANCE, FaultTree.class, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaultTreePackage.FAILURE_INSTANCE__ROOT, newRoot, newRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureInstance getPreviousFailure() {
		if (previousFailure != null && previousFailure.eIsProxy()) {
			InternalEObject oldPreviousFailure = (InternalEObject)previousFailure;
			previousFailure = (FailureInstance)eResolveProxy(oldPreviousFailure);
			if (previousFailure != oldPreviousFailure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaultTreePackage.FAILURE_INSTANCE__PREVIOUS_FAILURE, oldPreviousFailure, previousFailure));
			}
		}
		return previousFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailureInstance basicGetPreviousFailure() {
		return previousFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousFailure(FailureInstance newPreviousFailure) {
		FailureInstance oldPreviousFailure = previousFailure;
		previousFailure = newPreviousFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaultTreePackage.FAILURE_INSTANCE__PREVIOUS_FAILURE, oldPreviousFailure, previousFailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorInstance getPreviousError() {
		if (previousError != null && previousError.eIsProxy()) {
			InternalEObject oldPreviousError = (InternalEObject)previousError;
			previousError = (ErrorInstance)eResolveProxy(oldPreviousError);
			if (previousError != oldPreviousError) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaultTreePackage.FAILURE_INSTANCE__PREVIOUS_ERROR, oldPreviousError, previousError));
			}
		}
		return previousError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorInstance basicGetPreviousError() {
		return previousError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousError(ErrorInstance newPreviousError) {
		ErrorInstance oldPreviousError = previousError;
		previousError = newPreviousError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaultTreePackage.FAILURE_INSTANCE__PREVIOUS_ERROR, oldPreviousError, previousError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateEvent getEvent() {
		if (event != null && event.eIsProxy()) {
			InternalEObject oldEvent = (InternalEObject)event;
			event = (IntermediateEvent)eResolveProxy(oldEvent);
			if (event != oldEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaultTreePackage.FAILURE_INSTANCE__EVENT, oldEvent, event));
			}
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateEvent basicGetEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvent(IntermediateEvent newEvent, NotificationChain msgs) {
		IntermediateEvent oldEvent = event;
		event = newEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaultTreePackage.FAILURE_INSTANCE__EVENT, oldEvent, newEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(IntermediateEvent newEvent) {
		if (newEvent != event) {
			NotificationChain msgs = null;
			if (event != null)
				msgs = ((InternalEObject)event).eInverseRemove(this, FaultTreePackage.INTERMEDIATE_EVENT__INSTANCE, IntermediateEvent.class, msgs);
			if (newEvent != null)
				msgs = ((InternalEObject)newEvent).eInverseAdd(this, FaultTreePackage.INTERMEDIATE_EVENT__INSTANCE, IntermediateEvent.class, msgs);
			msgs = basicSetEvent(newEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaultTreePackage.FAILURE_INSTANCE__EVENT, newEvent, newEvent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaultTreePackage.FAILURE_INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FaultTreePackage.FAILURE_INSTANCE__TYPE:
				if (type != null)
					msgs = ((InternalEObject)type).eInverseRemove(this, FaultTreePackage.FAILURE_TYPE__INSTANCE, FailureType.class, msgs);
				return basicSetType((FailureType)otherEnd, msgs);
			case FaultTreePackage.FAILURE_INSTANCE__ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRoot((FaultTree)otherEnd, msgs);
			case FaultTreePackage.FAILURE_INSTANCE__EVENT:
				if (event != null)
					msgs = ((InternalEObject)event).eInverseRemove(this, FaultTreePackage.INTERMEDIATE_EVENT__INSTANCE, IntermediateEvent.class, msgs);
				return basicSetEvent((IntermediateEvent)otherEnd, msgs);
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
			case FaultTreePackage.FAILURE_INSTANCE__TYPE:
				return basicSetType(null, msgs);
			case FaultTreePackage.FAILURE_INSTANCE__ROOT:
				return basicSetRoot(null, msgs);
			case FaultTreePackage.FAILURE_INSTANCE__EVENT:
				return basicSetEvent(null, msgs);
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
			case FaultTreePackage.FAILURE_INSTANCE__ROOT:
				return eInternalContainer().eInverseRemove(this, FaultTreePackage.FAULT_TREE__FAILURE_INSTANCE, FaultTree.class, msgs);
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
			case FaultTreePackage.FAILURE_INSTANCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FaultTreePackage.FAILURE_INSTANCE__ROOT:
				return getRoot();
			case FaultTreePackage.FAILURE_INSTANCE__PREVIOUS_FAILURE:
				if (resolve) return getPreviousFailure();
				return basicGetPreviousFailure();
			case FaultTreePackage.FAILURE_INSTANCE__PREVIOUS_ERROR:
				if (resolve) return getPreviousError();
				return basicGetPreviousError();
			case FaultTreePackage.FAILURE_INSTANCE__EVENT:
				if (resolve) return getEvent();
				return basicGetEvent();
			case FaultTreePackage.FAILURE_INSTANCE__NAME:
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
			case FaultTreePackage.FAILURE_INSTANCE__TYPE:
				setType((FailureType)newValue);
				return;
			case FaultTreePackage.FAILURE_INSTANCE__ROOT:
				setRoot((FaultTree)newValue);
				return;
			case FaultTreePackage.FAILURE_INSTANCE__PREVIOUS_FAILURE:
				setPreviousFailure((FailureInstance)newValue);
				return;
			case FaultTreePackage.FAILURE_INSTANCE__PREVIOUS_ERROR:
				setPreviousError((ErrorInstance)newValue);
				return;
			case FaultTreePackage.FAILURE_INSTANCE__EVENT:
				setEvent((IntermediateEvent)newValue);
				return;
			case FaultTreePackage.FAILURE_INSTANCE__NAME:
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
			case FaultTreePackage.FAILURE_INSTANCE__TYPE:
				setType((FailureType)null);
				return;
			case FaultTreePackage.FAILURE_INSTANCE__ROOT:
				setRoot((FaultTree)null);
				return;
			case FaultTreePackage.FAILURE_INSTANCE__PREVIOUS_FAILURE:
				setPreviousFailure((FailureInstance)null);
				return;
			case FaultTreePackage.FAILURE_INSTANCE__PREVIOUS_ERROR:
				setPreviousError((ErrorInstance)null);
				return;
			case FaultTreePackage.FAILURE_INSTANCE__EVENT:
				setEvent((IntermediateEvent)null);
				return;
			case FaultTreePackage.FAILURE_INSTANCE__NAME:
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
			case FaultTreePackage.FAILURE_INSTANCE__TYPE:
				return type != null;
			case FaultTreePackage.FAILURE_INSTANCE__ROOT:
				return getRoot() != null;
			case FaultTreePackage.FAILURE_INSTANCE__PREVIOUS_FAILURE:
				return previousFailure != null;
			case FaultTreePackage.FAILURE_INSTANCE__PREVIOUS_ERROR:
				return previousError != null;
			case FaultTreePackage.FAILURE_INSTANCE__EVENT:
				return event != null;
			case FaultTreePackage.FAILURE_INSTANCE__NAME:
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

} //FailureInstanceImpl
