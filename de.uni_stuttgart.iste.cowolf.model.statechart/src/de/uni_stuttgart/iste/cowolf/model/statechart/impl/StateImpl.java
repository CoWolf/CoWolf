/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart.impl;

import de.uni_stuttgart.iste.cowolf.model.statechart.Event;
import de.uni_stuttgart.iste.cowolf.model.statechart.State;
import de.uni_stuttgart.iste.cowolf.model.statechart.StateAction;
import de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine;
import de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage;
import de.uni_stuttgart.iste.cowolf.model.statechart.Transition;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.StateImpl#getActions <em>Actions</em>}</li>
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
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<StateAction> actions;

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
		return StatemachinePackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getState_container() {
		if (eContainerFeatureID() != StatemachinePackage.STATE__STATE_CONTAINER) return null;
		return (StateMachine)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState_container(StateMachine newState_container, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newState_container, StatemachinePackage.STATE__STATE_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState_container(StateMachine newState_container) {
		if (newState_container != eInternalContainer() || (eContainerFeatureID() != StatemachinePackage.STATE__STATE_CONTAINER && newState_container != null)) {
			if (EcoreUtil.isAncestor(this, newState_container))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newState_container != null)
				msgs = ((InternalEObject)newState_container).eInverseAdd(this, StatemachinePackage.STATE_MACHINE__TOP, StateMachine.class, msgs);
			msgs = basicSetState_container(newState_container, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE__STATE_CONTAINER, newState_container, newState_container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getInternalTransitions() {
		if (internalTransitions == null) {
			internalTransitions = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, StatemachinePackage.STATE__INTERNAL_TRANSITIONS, StatemachinePackage.TRANSITION__TRANS_SCONTAINER);
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
			deferrableEvents = new EObjectResolvingEList<Event>(Event.class, this, StatemachinePackage.STATE__DEFERRABLE_EVENTS);
		}
		return deferrableEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentWithInverseEList<StateAction>(StateAction.class, this, StatemachinePackage.STATE__ACTIONS, StatemachinePackage.STATE_ACTION__ACTION_CONTAINER);
		}
		return actions;
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
			case StatemachinePackage.STATE__STATE_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetState_container((StateMachine)otherEnd, msgs);
			case StatemachinePackage.STATE__INTERNAL_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInternalTransitions()).basicAdd(otherEnd, msgs);
			case StatemachinePackage.STATE__ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActions()).basicAdd(otherEnd, msgs);
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
			case StatemachinePackage.STATE__STATE_CONTAINER:
				return basicSetState_container(null, msgs);
			case StatemachinePackage.STATE__INTERNAL_TRANSITIONS:
				return ((InternalEList<?>)getInternalTransitions()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATE__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
			case StatemachinePackage.STATE__STATE_CONTAINER:
				return eInternalContainer().eInverseRemove(this, StatemachinePackage.STATE_MACHINE__TOP, StateMachine.class, msgs);
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
			case StatemachinePackage.STATE__STATE_CONTAINER:
				return getState_container();
			case StatemachinePackage.STATE__INTERNAL_TRANSITIONS:
				return getInternalTransitions();
			case StatemachinePackage.STATE__DEFERRABLE_EVENTS:
				return getDeferrableEvents();
			case StatemachinePackage.STATE__ACTIONS:
				return getActions();
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
			case StatemachinePackage.STATE__STATE_CONTAINER:
				setState_container((StateMachine)newValue);
				return;
			case StatemachinePackage.STATE__INTERNAL_TRANSITIONS:
				getInternalTransitions().clear();
				getInternalTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case StatemachinePackage.STATE__DEFERRABLE_EVENTS:
				getDeferrableEvents().clear();
				getDeferrableEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case StatemachinePackage.STATE__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends StateAction>)newValue);
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
			case StatemachinePackage.STATE__STATE_CONTAINER:
				setState_container((StateMachine)null);
				return;
			case StatemachinePackage.STATE__INTERNAL_TRANSITIONS:
				getInternalTransitions().clear();
				return;
			case StatemachinePackage.STATE__DEFERRABLE_EVENTS:
				getDeferrableEvents().clear();
				return;
			case StatemachinePackage.STATE__ACTIONS:
				getActions().clear();
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
			case StatemachinePackage.STATE__STATE_CONTAINER:
				return getState_container() != null;
			case StatemachinePackage.STATE__INTERNAL_TRANSITIONS:
				return internalTransitions != null && !internalTransitions.isEmpty();
			case StatemachinePackage.STATE__DEFERRABLE_EVENTS:
				return deferrableEvents != null && !deferrableEvents.isEmpty();
			case StatemachinePackage.STATE__ACTIONS:
				return actions != null && !actions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
