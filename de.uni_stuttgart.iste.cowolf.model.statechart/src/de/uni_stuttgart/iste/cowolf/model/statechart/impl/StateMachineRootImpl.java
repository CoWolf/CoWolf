/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart.impl;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;

import de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine;
import de.uni_stuttgart.iste.cowolf.model.statechart.StateMachineRoot;
import de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
		}
		return super.eIsSet(featureID);
	}

} //StateMachineRootImpl
