/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart.impl;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;

import de.uni_stuttgart.iste.cowolf.model.statechart.Action;
import de.uni_stuttgart.iste.cowolf.model.statechart.State;
import de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine;
import de.uni_stuttgart.iste.cowolf.model.statechart.StateMachineRoot;
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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.StateMachineImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.StateMachineImpl#getTop <em>Top</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.StateMachineImpl#getStatemachine_container <em>Statemachine container</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.StateMachineImpl#getCalledByAction <em>Called By Action</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.StateMachineImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateMachineImpl extends IDBaseImpl implements StateMachine {
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
	 * The cached value of the '{@link #getCalledByAction() <em>Called By Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledByAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> calledByAction;

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
		return StatemachinePackage.Literals.STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, StatemachinePackage.STATE_MACHINE__TRANSITIONS, StatemachinePackage.TRANSITION__TRANS_SM_CONTAINER);
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
			top = new EObjectContainmentWithInverseEList<State>(State.class, this, StatemachinePackage.STATE_MACHINE__TOP, StatemachinePackage.STATE__STATE_CONTAINER);
		}
		return top;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachineRoot getStatemachine_container() {
		if (eContainerFeatureID() != StatemachinePackage.STATE_MACHINE__STATEMACHINE_CONTAINER) return null;
		return (StateMachineRoot)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatemachine_container(StateMachineRoot newStatemachine_container, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStatemachine_container, StatemachinePackage.STATE_MACHINE__STATEMACHINE_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatemachine_container(StateMachineRoot newStatemachine_container) {
		if (newStatemachine_container != eInternalContainer() || (eContainerFeatureID() != StatemachinePackage.STATE_MACHINE__STATEMACHINE_CONTAINER && newStatemachine_container != null)) {
			if (EcoreUtil.isAncestor(this, newStatemachine_container))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStatemachine_container != null)
				msgs = ((InternalEObject)newStatemachine_container).eInverseAdd(this, StatemachinePackage.STATE_MACHINE_ROOT__SUB_STATE_MACHINES, StateMachineRoot.class, msgs);
			msgs = basicSetStatemachine_container(newStatemachine_container, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE_MACHINE__STATEMACHINE_CONTAINER, newStatemachine_container, newStatemachine_container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getCalledByAction() {
		if (calledByAction == null) {
			calledByAction = new EObjectWithInverseResolvingEList<Action>(Action.class, this, StatemachinePackage.STATE_MACHINE__CALLED_BY_ACTION, StatemachinePackage.ACTION__STATE_MACHINE_CALL);
		}
		return calledByAction;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.STATE_MACHINE__NAME, oldName, name));
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
			case StatemachinePackage.STATE_MACHINE__TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransitions()).basicAdd(otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__TOP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTop()).basicAdd(otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__STATEMACHINE_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStatemachine_container((StateMachineRoot)otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__CALLED_BY_ACTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCalledByAction()).basicAdd(otherEnd, msgs);
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
			case StatemachinePackage.STATE_MACHINE__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__TOP:
				return ((InternalEList<?>)getTop()).basicRemove(otherEnd, msgs);
			case StatemachinePackage.STATE_MACHINE__STATEMACHINE_CONTAINER:
				return basicSetStatemachine_container(null, msgs);
			case StatemachinePackage.STATE_MACHINE__CALLED_BY_ACTION:
				return ((InternalEList<?>)getCalledByAction()).basicRemove(otherEnd, msgs);
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
			case StatemachinePackage.STATE_MACHINE__STATEMACHINE_CONTAINER:
				return eInternalContainer().eInverseRemove(this, StatemachinePackage.STATE_MACHINE_ROOT__SUB_STATE_MACHINES, StateMachineRoot.class, msgs);
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
			case StatemachinePackage.STATE_MACHINE__TRANSITIONS:
				return getTransitions();
			case StatemachinePackage.STATE_MACHINE__TOP:
				return getTop();
			case StatemachinePackage.STATE_MACHINE__STATEMACHINE_CONTAINER:
				return getStatemachine_container();
			case StatemachinePackage.STATE_MACHINE__CALLED_BY_ACTION:
				return getCalledByAction();
			case StatemachinePackage.STATE_MACHINE__NAME:
				return getName();
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
			case StatemachinePackage.STATE_MACHINE__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__TOP:
				getTop().clear();
				getTop().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__STATEMACHINE_CONTAINER:
				setStatemachine_container((StateMachineRoot)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__CALLED_BY_ACTION:
				getCalledByAction().clear();
				getCalledByAction().addAll((Collection<? extends Action>)newValue);
				return;
			case StatemachinePackage.STATE_MACHINE__NAME:
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
			case StatemachinePackage.STATE_MACHINE__TRANSITIONS:
				getTransitions().clear();
				return;
			case StatemachinePackage.STATE_MACHINE__TOP:
				getTop().clear();
				return;
			case StatemachinePackage.STATE_MACHINE__STATEMACHINE_CONTAINER:
				setStatemachine_container((StateMachineRoot)null);
				return;
			case StatemachinePackage.STATE_MACHINE__CALLED_BY_ACTION:
				getCalledByAction().clear();
				return;
			case StatemachinePackage.STATE_MACHINE__NAME:
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
			case StatemachinePackage.STATE_MACHINE__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case StatemachinePackage.STATE_MACHINE__TOP:
				return top != null && !top.isEmpty();
			case StatemachinePackage.STATE_MACHINE__STATEMACHINE_CONTAINER:
				return getStatemachine_container() != null;
			case StatemachinePackage.STATE_MACHINE__CALLED_BY_ACTION:
				return calledByAction != null && !calledByAction.isEmpty();
			case StatemachinePackage.STATE_MACHINE__NAME:
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

} //StateMachineImpl
