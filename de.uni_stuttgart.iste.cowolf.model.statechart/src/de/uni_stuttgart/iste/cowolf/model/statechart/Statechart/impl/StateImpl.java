/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.impl;

import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.Event;
import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.State;
import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.StateMachine;
import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.StatechartemfPackage;
import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.impl.StateImpl#getState_container <em>State container</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.impl.StateImpl#getInternalTransitions <em>Internal Transitions</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.impl.StateImpl#getDeferrableEvents <em>Deferrable Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends StateVertexImpl implements State {
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
		return StatechartemfPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getState_container() {
		if (eContainerFeatureID() != StatechartemfPackage.STATE__STATE_CONTAINER) return null;
		return (StateMachine)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState_container(StateMachine newState_container, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newState_container, StatechartemfPackage.STATE__STATE_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState_container(StateMachine newState_container) {
		if (newState_container != eInternalContainer() || (eContainerFeatureID() != StatechartemfPackage.STATE__STATE_CONTAINER && newState_container != null)) {
			if (EcoreUtil.isAncestor(this, newState_container))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newState_container != null)
				msgs = ((InternalEObject)newState_container).eInverseAdd(this, StatechartemfPackage.STATE_MACHINE__TOP, StateMachine.class, msgs);
			msgs = basicSetState_container(newState_container, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatechartemfPackage.STATE__STATE_CONTAINER, newState_container, newState_container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getInternalTransitions() {
		if (internalTransitions == null) {
			internalTransitions = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, StatechartemfPackage.STATE__INTERNAL_TRANSITIONS, StatechartemfPackage.TRANSITION__TRANS_SCONTAINER);
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
			deferrableEvents = new EObjectWithInverseResolvingEList.ManyInverse<Event>(Event.class, this, StatechartemfPackage.STATE__DEFERRABLE_EVENTS, StatechartemfPackage.EVENT__TARGETS);
		}
		return deferrableEvents;
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
			case StatechartemfPackage.STATE__STATE_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetState_container((StateMachine)otherEnd, msgs);
			case StatechartemfPackage.STATE__INTERNAL_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInternalTransitions()).basicAdd(otherEnd, msgs);
			case StatechartemfPackage.STATE__DEFERRABLE_EVENTS:
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
			case StatechartemfPackage.STATE__STATE_CONTAINER:
				return basicSetState_container(null, msgs);
			case StatechartemfPackage.STATE__INTERNAL_TRANSITIONS:
				return ((InternalEList<?>)getInternalTransitions()).basicRemove(otherEnd, msgs);
			case StatechartemfPackage.STATE__DEFERRABLE_EVENTS:
				return ((InternalEList<?>)getDeferrableEvents()).basicRemove(otherEnd, msgs);
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
			case StatechartemfPackage.STATE__STATE_CONTAINER:
				return eInternalContainer().eInverseRemove(this, StatechartemfPackage.STATE_MACHINE__TOP, StateMachine.class, msgs);
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
			case StatechartemfPackage.STATE__STATE_CONTAINER:
				return getState_container();
			case StatechartemfPackage.STATE__INTERNAL_TRANSITIONS:
				return getInternalTransitions();
			case StatechartemfPackage.STATE__DEFERRABLE_EVENTS:
				return getDeferrableEvents();
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
			case StatechartemfPackage.STATE__STATE_CONTAINER:
				setState_container((StateMachine)newValue);
				return;
			case StatechartemfPackage.STATE__INTERNAL_TRANSITIONS:
				getInternalTransitions().clear();
				getInternalTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case StatechartemfPackage.STATE__DEFERRABLE_EVENTS:
				getDeferrableEvents().clear();
				getDeferrableEvents().addAll((Collection<? extends Event>)newValue);
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
			case StatechartemfPackage.STATE__STATE_CONTAINER:
				setState_container((StateMachine)null);
				return;
			case StatechartemfPackage.STATE__INTERNAL_TRANSITIONS:
				getInternalTransitions().clear();
				return;
			case StatechartemfPackage.STATE__DEFERRABLE_EVENTS:
				getDeferrableEvents().clear();
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
			case StatechartemfPackage.STATE__STATE_CONTAINER:
				return getState_container() != null;
			case StatechartemfPackage.STATE__INTERNAL_TRANSITIONS:
				return internalTransitions != null && !internalTransitions.isEmpty();
			case StatechartemfPackage.STATE__DEFERRABLE_EVENTS:
				return deferrableEvents != null && !deferrableEvents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
