/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart.impl;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;

import de.uni_stuttgart.iste.cowolf.model.statechart.Action;
import de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine;
import de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.ActionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.ActionImpl#getStateMachineCall <em>State Machine Call</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends IDBaseImpl implements Action {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStateMachineCall() <em>State Machine Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachineCall()
	 * @generated
	 * @ordered
	 */
	protected StateMachine stateMachineCall;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinePackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.ACTION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getStateMachineCall() {
		if (stateMachineCall != null && stateMachineCall.eIsProxy()) {
			InternalEObject oldStateMachineCall = (InternalEObject)stateMachineCall;
			stateMachineCall = (StateMachine)eResolveProxy(oldStateMachineCall);
			if (stateMachineCall != oldStateMachineCall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.ACTION__STATE_MACHINE_CALL, oldStateMachineCall, stateMachineCall));
			}
		}
		return stateMachineCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine basicGetStateMachineCall() {
		return stateMachineCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateMachineCall(StateMachine newStateMachineCall, NotificationChain msgs) {
		StateMachine oldStateMachineCall = stateMachineCall;
		stateMachineCall = newStateMachineCall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatemachinePackage.ACTION__STATE_MACHINE_CALL, oldStateMachineCall, newStateMachineCall);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachineCall(StateMachine newStateMachineCall) {
		if (newStateMachineCall != stateMachineCall) {
			NotificationChain msgs = null;
			if (stateMachineCall != null)
				msgs = ((InternalEObject)stateMachineCall).eInverseRemove(this, StatemachinePackage.STATE_MACHINE__CALLED_BY_ACTION, StateMachine.class, msgs);
			if (newStateMachineCall != null)
				msgs = ((InternalEObject)newStateMachineCall).eInverseAdd(this, StatemachinePackage.STATE_MACHINE__CALLED_BY_ACTION, StateMachine.class, msgs);
			msgs = basicSetStateMachineCall(newStateMachineCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.ACTION__STATE_MACHINE_CALL, newStateMachineCall, newStateMachineCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatemachinePackage.ACTION__STATE_MACHINE_CALL:
				if (stateMachineCall != null)
					msgs = ((InternalEObject)stateMachineCall).eInverseRemove(this, StatemachinePackage.STATE_MACHINE__CALLED_BY_ACTION, StateMachine.class, msgs);
				return basicSetStateMachineCall((StateMachine)otherEnd, msgs);
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
			case StatemachinePackage.ACTION__STATE_MACHINE_CALL:
				return basicSetStateMachineCall(null, msgs);
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
			case StatemachinePackage.ACTION__VALUE:
				return getValue();
			case StatemachinePackage.ACTION__STATE_MACHINE_CALL:
				if (resolve) return getStateMachineCall();
				return basicGetStateMachineCall();
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
			case StatemachinePackage.ACTION__VALUE:
				setValue((String)newValue);
				return;
			case StatemachinePackage.ACTION__STATE_MACHINE_CALL:
				setStateMachineCall((StateMachine)newValue);
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
			case StatemachinePackage.ACTION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case StatemachinePackage.ACTION__STATE_MACHINE_CALL:
				setStateMachineCall((StateMachine)null);
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
			case StatemachinePackage.ACTION__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case StatemachinePackage.ACTION__STATE_MACHINE_CALL:
				return stateMachineCall != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
