/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart.impl;

import de.uni_stuttgart.iste.cowolf.model.statechart.BooleanExpression;
import de.uni_stuttgart.iste.cowolf.model.statechart.Event;
import de.uni_stuttgart.iste.cowolf.model.statechart.State;
import de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine;
import de.uni_stuttgart.iste.cowolf.model.statechart.Transition;
import de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.StateImpl#getState_container <em>State container</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.StateImpl#getInternalTransitions <em>Internal Transitions</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.StateImpl#getDeferrableEvents <em>Deferrable Events</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.StateImpl#getAtomicProposition <em>Atomic Proposition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends StateVertexImpl implements State {
	/**
	 * The cached value of the '{@link #getState_container() <em>State container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState_container()
	 * @generated
	 * @ordered
	 */
	protected StateMachine state_container;

	/**
	 * The cached value of the '{@link #getInternalTransitions() <em>Internal Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> internalTransitions;

	/**
	 * The cached value of the '{@link #getDeferrableEvents() <em>Deferrable Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeferrableEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> deferrableEvents;

	/**
	 * The cached value of the '{@link #getAtomicProposition() <em>Atomic Proposition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtomicProposition()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanExpression> atomicProposition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return statechartemfPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getState_container() {
		if (state_container != null && state_container.eIsProxy()) {
			InternalEObject oldState_container = (InternalEObject)state_container;
			state_container = (StateMachine)eResolveProxy(oldState_container);
			if (state_container != oldState_container) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, statechartemfPackage.STATE__STATE_CONTAINER, oldState_container, state_container));
			}
		}
		return state_container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine basicGetState_container() {
		return state_container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState_container(StateMachine newState_container, NotificationChain msgs) {
		StateMachine oldState_container = state_container;
		state_container = newState_container;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, statechartemfPackage.STATE__STATE_CONTAINER, oldState_container, newState_container);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState_container(StateMachine newState_container) {
		if (newState_container != state_container) {
			NotificationChain msgs = null;
			if (state_container != null)
				msgs = ((InternalEObject)state_container).eInverseRemove(this, statechartemfPackage.STATE_MACHINE__INITIAL_STATES, StateMachine.class, msgs);
			if (newState_container != null)
				msgs = ((InternalEObject)newState_container).eInverseAdd(this, statechartemfPackage.STATE_MACHINE__INITIAL_STATES, StateMachine.class, msgs);
			msgs = basicSetState_container(newState_container, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, statechartemfPackage.STATE__STATE_CONTAINER, newState_container, newState_container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getInternalTransitions() {
		if (internalTransitions == null) {
			internalTransitions = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, statechartemfPackage.STATE__INTERNAL_TRANSITIONS, statechartemfPackage.TRANSITION__TRANS_SCONTAINER);
		}
		return internalTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getDeferrableEvents() {
		if (deferrableEvents == null) {
			deferrableEvents = new EObjectWithInverseResolvingEList.ManyInverse<Event>(Event.class, this, statechartemfPackage.STATE__DEFERRABLE_EVENTS, statechartemfPackage.EVENT__TARGETS);
		}
		return deferrableEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanExpression> getAtomicProposition() {
		if (atomicProposition == null) {
			atomicProposition = new EObjectContainmentEList<BooleanExpression>(BooleanExpression.class, this, statechartemfPackage.STATE__ATOMIC_PROPOSITION);
		}
		return atomicProposition;
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
			case statechartemfPackage.STATE__STATE_CONTAINER:
				if (state_container != null)
					msgs = ((InternalEObject)state_container).eInverseRemove(this, statechartemfPackage.STATE_MACHINE__INITIAL_STATES, StateMachine.class, msgs);
				return basicSetState_container((StateMachine)otherEnd, msgs);
			case statechartemfPackage.STATE__INTERNAL_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInternalTransitions()).basicAdd(otherEnd, msgs);
			case statechartemfPackage.STATE__DEFERRABLE_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDeferrableEvents()).basicAdd(otherEnd, msgs);
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
			case statechartemfPackage.STATE__STATE_CONTAINER:
				return basicSetState_container(null, msgs);
			case statechartemfPackage.STATE__INTERNAL_TRANSITIONS:
				return ((InternalEList<?>)getInternalTransitions()).basicRemove(otherEnd, msgs);
			case statechartemfPackage.STATE__DEFERRABLE_EVENTS:
				return ((InternalEList<?>)getDeferrableEvents()).basicRemove(otherEnd, msgs);
			case statechartemfPackage.STATE__ATOMIC_PROPOSITION:
				return ((InternalEList<?>)getAtomicProposition()).basicRemove(otherEnd, msgs);
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
			case statechartemfPackage.STATE__STATE_CONTAINER:
				if (resolve) return getState_container();
				return basicGetState_container();
			case statechartemfPackage.STATE__INTERNAL_TRANSITIONS:
				return getInternalTransitions();
			case statechartemfPackage.STATE__DEFERRABLE_EVENTS:
				return getDeferrableEvents();
			case statechartemfPackage.STATE__ATOMIC_PROPOSITION:
				return getAtomicProposition();
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
			case statechartemfPackage.STATE__STATE_CONTAINER:
				setState_container((StateMachine)newValue);
				return;
			case statechartemfPackage.STATE__INTERNAL_TRANSITIONS:
				getInternalTransitions().clear();
				getInternalTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case statechartemfPackage.STATE__DEFERRABLE_EVENTS:
				getDeferrableEvents().clear();
				getDeferrableEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case statechartemfPackage.STATE__ATOMIC_PROPOSITION:
				getAtomicProposition().clear();
				getAtomicProposition().addAll((Collection<? extends BooleanExpression>)newValue);
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
			case statechartemfPackage.STATE__STATE_CONTAINER:
				setState_container((StateMachine)null);
				return;
			case statechartemfPackage.STATE__INTERNAL_TRANSITIONS:
				getInternalTransitions().clear();
				return;
			case statechartemfPackage.STATE__DEFERRABLE_EVENTS:
				getDeferrableEvents().clear();
				return;
			case statechartemfPackage.STATE__ATOMIC_PROPOSITION:
				getAtomicProposition().clear();
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
			case statechartemfPackage.STATE__STATE_CONTAINER:
				return state_container != null;
			case statechartemfPackage.STATE__INTERNAL_TRANSITIONS:
				return internalTransitions != null && !internalTransitions.isEmpty();
			case statechartemfPackage.STATE__DEFERRABLE_EVENTS:
				return deferrableEvents != null && !deferrableEvents.isEmpty();
			case statechartemfPackage.STATE__ATOMIC_PROPOSITION:
				return atomicProposition != null && !atomicProposition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
