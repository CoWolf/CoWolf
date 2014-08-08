/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.impl;

import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.State;
import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.StateMachine;
import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.StatechartemfPackage;
import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.impl.StateMachineImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.impl.StateMachineImpl#getTop <em>Top</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateMachineImpl extends MinimalEObjectImpl.Container implements StateMachine {
	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getTop() <em>Top</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTop()
	 * @generated
	 * @ordered
	 */
	protected EList<State> top;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatechartemfPackage.Literals.STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, StatechartemfPackage.STATE_MACHINE__TRANSITIONS, StatechartemfPackage.TRANSITION__TRANS_SM_CONTAINER);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getTop() {
		if (top == null) {
			top = new EObjectContainmentWithInverseEList<State>(State.class, this, StatechartemfPackage.STATE_MACHINE__TOP, StatechartemfPackage.STATE__STATE_CONTAINER);
		}
		return top;
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
			case StatechartemfPackage.STATE_MACHINE__TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransitions()).basicAdd(otherEnd, msgs);
			case StatechartemfPackage.STATE_MACHINE__TOP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTop()).basicAdd(otherEnd, msgs);
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
			case StatechartemfPackage.STATE_MACHINE__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case StatechartemfPackage.STATE_MACHINE__TOP:
				return ((InternalEList<?>)getTop()).basicRemove(otherEnd, msgs);
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
			case StatechartemfPackage.STATE_MACHINE__TRANSITIONS:
				return getTransitions();
			case StatechartemfPackage.STATE_MACHINE__TOP:
				return getTop();
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
			case StatechartemfPackage.STATE_MACHINE__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case StatechartemfPackage.STATE_MACHINE__TOP:
				getTop().clear();
				getTop().addAll((Collection<? extends State>)newValue);
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
			case StatechartemfPackage.STATE_MACHINE__TRANSITIONS:
				getTransitions().clear();
				return;
			case StatechartemfPackage.STATE_MACHINE__TOP:
				getTop().clear();
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
			case StatechartemfPackage.STATE_MACHINE__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case StatechartemfPackage.STATE_MACHINE__TOP:
				return top != null && !top.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateMachineImpl
