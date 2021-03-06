/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart.impl;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;

import de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine;
import de.uni_stuttgart.iste.cowolf.model.statechart.StateMachineRoot;
import de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.StateMachineRootImpl#getSubStateMachines <em>Sub State Machines</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.StateMachineRootImpl#getInitialStateMachine <em>Initial State Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateMachineRootImpl extends IDBaseImpl implements StateMachineRoot {
	/**
	 * The cached value of the '{@link #getSubStateMachines() <em>Sub State Machines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubStateMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachine> subStateMachines;

	/**
	 * The cached value of the '{@link #getInitialStateMachine() <em>Initial State Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialStateMachine()
	 * @generated
	 * @ordered
	 */
	protected StateMachine initialStateMachine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinePackage.Literals.STATE_MACHINE_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachine> getSubStateMachines() {
		if (subStateMachines == null) {
			subStateMachines = new EObjectContainmentWithInverseEList<StateMachine>(StateMachine.class, this, StatemachinePackage.STATE_MACHINE_ROOT__SUB_STATE_MACHINES, StatemachinePackage.STATE_MACHINE__STATEMACHINE_CONTAINER);
		}
		return subStateMachines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getInitialStateMachine() {
		if (initialStateMachine != null && initialStateMachine.eIsProxy()) {
			InternalEObject oldInitialStateMachine = (InternalEObject)initialStateMachine;
			initialStateMachine = (StateMachine)eResolveProxy(oldInitialStateMachine);
			if (initialStateMachine != oldInitialStateMachine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.STATE_MACHINE_ROOT__INITIAL_STATE_MACHINE, oldInitialStateMachine, initialStateMachine));
			}
		}
		return initialStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine basicGetInitialStateMachine() {
		return initialStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialStateMachine(StateMachine newInitialStateMachine) {
		StateMachine oldInitialStateMachine = initialStateMachine;
		initialStateMachine = newInitialStateMachine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE_MACHINE_ROOT__INITIAL_STATE_MACHINE, oldInitialStateMachine, initialStateMachine));
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
			case StatemachinePackage.STATE_MACHINE_ROOT__SUB_STATE_MACHINES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubStateMachines()).basicAdd(otherEnd, msgs);
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
			case StatemachinePackage.STATE_MACHINE_ROOT__SUB_STATE_MACHINES:
				return ((InternalEList<?>)getSubStateMachines()).basicRemove(otherEnd, msgs);
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
			case StatemachinePackage.STATE_MACHINE_ROOT__SUB_STATE_MACHINES:
				return getSubStateMachines();
			case StatemachinePackage.STATE_MACHINE_ROOT__INITIAL_STATE_MACHINE:
				if (resolve) return getInitialStateMachine();
				return basicGetInitialStateMachine();
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
			case StatemachinePackage.STATE_MACHINE_ROOT__SUB_STATE_MACHINES:
				getSubStateMachines().clear();
				getSubStateMachines().addAll((Collection<? extends StateMachine>)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE_ROOT__INITIAL_STATE_MACHINE:
				setInitialStateMachine((StateMachine)newValue);
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
			case StatemachinePackage.STATE_MACHINE_ROOT__SUB_STATE_MACHINES:
				getSubStateMachines().clear();
				return;
			case StatemachinePackage.STATE_MACHINE_ROOT__INITIAL_STATE_MACHINE:
				setInitialStateMachine((StateMachine)null);
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
			case StatemachinePackage.STATE_MACHINE_ROOT__SUB_STATE_MACHINES:
				return subStateMachines != null && !subStateMachines.isEmpty();
			case StatemachinePackage.STATE_MACHINE_ROOT__INITIAL_STATE_MACHINE:
				return initialStateMachine != null;
		}
		return super.eIsSet(featureID);
	}

} //StateMachineRootImpl
