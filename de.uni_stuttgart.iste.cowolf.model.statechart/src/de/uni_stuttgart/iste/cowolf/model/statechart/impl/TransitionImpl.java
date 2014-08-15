/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart.impl;

import de.uni_stuttgart.iste.cowolf.model.statechart.Event;
import de.uni_stuttgart.iste.cowolf.model.statechart.Guard;
import de.uni_stuttgart.iste.cowolf.model.statechart.State;
import de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine;
import de.uni_stuttgart.iste.cowolf.model.statechart.StateVertex;
import de.uni_stuttgart.iste.cowolf.model.statechart.Transition;
import de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.TransitionImpl#getTransSM_container <em>Trans SM container</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.TransitionImpl#getTransS_container <em>Trans Scontainer</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.TransitionImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl implements Transition {
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
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected Event trigger;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected Guard guard;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected StateVertex source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected StateVertex target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return statechartemfPackage.Literals.TRANSITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, statechartemfPackage.TRANSITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getTransSM_container() {
		if (eContainerFeatureID() != statechartemfPackage.TRANSITION__TRANS_SM_CONTAINER) return null;
		return (StateMachine)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransSM_container(StateMachine newTransSM_container, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTransSM_container, statechartemfPackage.TRANSITION__TRANS_SM_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransSM_container(StateMachine newTransSM_container) {
		if (newTransSM_container != eInternalContainer() || (eContainerFeatureID() != statechartemfPackage.TRANSITION__TRANS_SM_CONTAINER && newTransSM_container != null)) {
			if (EcoreUtil.isAncestor(this, newTransSM_container))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTransSM_container != null)
				msgs = ((InternalEObject)newTransSM_container).eInverseAdd(this, statechartemfPackage.STATE_MACHINE__TRANSITIONS, StateMachine.class, msgs);
			msgs = basicSetTransSM_container(newTransSM_container, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, statechartemfPackage.TRANSITION__TRANS_SM_CONTAINER, newTransSM_container, newTransSM_container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTransS_container() {
		if (eContainerFeatureID() != statechartemfPackage.TRANSITION__TRANS_SCONTAINER) return null;
		return (State)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransS_container(State newTransS_container, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTransS_container, statechartemfPackage.TRANSITION__TRANS_SCONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransS_container(State newTransS_container) {
		if (newTransS_container != eInternalContainer() || (eContainerFeatureID() != statechartemfPackage.TRANSITION__TRANS_SCONTAINER && newTransS_container != null)) {
			if (EcoreUtil.isAncestor(this, newTransS_container))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTransS_container != null)
				msgs = ((InternalEObject)newTransS_container).eInverseAdd(this, statechartemfPackage.STATE__INTERNAL_TRANSITIONS, State.class, msgs);
			msgs = basicSetTransS_container(newTransS_container, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, statechartemfPackage.TRANSITION__TRANS_SCONTAINER, newTransS_container, newTransS_container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getTrigger() {
		if (trigger != null && trigger.eIsProxy()) {
			InternalEObject oldTrigger = (InternalEObject)trigger;
			trigger = (Event)eResolveProxy(oldTrigger);
			if (trigger != oldTrigger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, statechartemfPackage.TRANSITION__TRIGGER, oldTrigger, trigger));
			}
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrigger(Event newTrigger, NotificationChain msgs) {
		Event oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, statechartemfPackage.TRANSITION__TRIGGER, oldTrigger, newTrigger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(Event newTrigger) {
		if (newTrigger != trigger) {
			NotificationChain msgs = null;
			if (trigger != null)
				msgs = ((InternalEObject)trigger).eInverseRemove(this, statechartemfPackage.EVENT__EVT_CONTAINER, Event.class, msgs);
			if (newTrigger != null)
				msgs = ((InternalEObject)newTrigger).eInverseAdd(this, statechartemfPackage.EVENT__EVT_CONTAINER, Event.class, msgs);
			msgs = basicSetTrigger(newTrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, statechartemfPackage.TRANSITION__TRIGGER, newTrigger, newTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guard getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(Guard newGuard, NotificationChain msgs) {
		Guard oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, statechartemfPackage.TRANSITION__GUARD, oldGuard, newGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(Guard newGuard) {
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject)guard).eInverseRemove(this, statechartemfPackage.GUARD__GUA_CONTAINER, Guard.class, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, statechartemfPackage.GUARD__GUA_CONTAINER, Guard.class, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, statechartemfPackage.TRANSITION__GUARD, newGuard, newGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateVertex getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (StateVertex)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, statechartemfPackage.TRANSITION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateVertex basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(StateVertex newSource, NotificationChain msgs) {
		StateVertex oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, statechartemfPackage.TRANSITION__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(StateVertex newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, statechartemfPackage.STATE_VERTEX__OUTGOING, StateVertex.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, statechartemfPackage.STATE_VERTEX__OUTGOING, StateVertex.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, statechartemfPackage.TRANSITION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateVertex getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (StateVertex)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, statechartemfPackage.TRANSITION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateVertex basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(StateVertex newTarget, NotificationChain msgs) {
		StateVertex oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, statechartemfPackage.TRANSITION__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(StateVertex newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, statechartemfPackage.STATE_VERTEX__INCOMING, StateVertex.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, statechartemfPackage.STATE_VERTEX__INCOMING, StateVertex.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, statechartemfPackage.TRANSITION__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case statechartemfPackage.TRANSITION__TRANS_SM_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTransSM_container((StateMachine)otherEnd, msgs);
			case statechartemfPackage.TRANSITION__TRANS_SCONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTransS_container((State)otherEnd, msgs);
			case statechartemfPackage.TRANSITION__TRIGGER:
				if (trigger != null)
					msgs = ((InternalEObject)trigger).eInverseRemove(this, statechartemfPackage.EVENT__EVT_CONTAINER, Event.class, msgs);
				return basicSetTrigger((Event)otherEnd, msgs);
			case statechartemfPackage.TRANSITION__GUARD:
				if (guard != null)
					msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - statechartemfPackage.TRANSITION__GUARD, null, msgs);
				return basicSetGuard((Guard)otherEnd, msgs);
			case statechartemfPackage.TRANSITION__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, statechartemfPackage.STATE_VERTEX__OUTGOING, StateVertex.class, msgs);
				return basicSetSource((StateVertex)otherEnd, msgs);
			case statechartemfPackage.TRANSITION__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, statechartemfPackage.STATE_VERTEX__INCOMING, StateVertex.class, msgs);
				return basicSetTarget((StateVertex)otherEnd, msgs);
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
			case statechartemfPackage.TRANSITION__TRANS_SM_CONTAINER:
				return basicSetTransSM_container(null, msgs);
			case statechartemfPackage.TRANSITION__TRANS_SCONTAINER:
				return basicSetTransS_container(null, msgs);
			case statechartemfPackage.TRANSITION__TRIGGER:
				return basicSetTrigger(null, msgs);
			case statechartemfPackage.TRANSITION__GUARD:
				return basicSetGuard(null, msgs);
			case statechartemfPackage.TRANSITION__SOURCE:
				return basicSetSource(null, msgs);
			case statechartemfPackage.TRANSITION__TARGET:
				return basicSetTarget(null, msgs);
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
			case statechartemfPackage.TRANSITION__TRANS_SM_CONTAINER:
				return eInternalContainer().eInverseRemove(this, statechartemfPackage.STATE_MACHINE__TRANSITIONS, StateMachine.class, msgs);
			case statechartemfPackage.TRANSITION__TRANS_SCONTAINER:
				return eInternalContainer().eInverseRemove(this, statechartemfPackage.STATE__INTERNAL_TRANSITIONS, State.class, msgs);
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
			case statechartemfPackage.TRANSITION__NAME:
				return getName();
			case statechartemfPackage.TRANSITION__TRANS_SM_CONTAINER:
				return getTransSM_container();
			case statechartemfPackage.TRANSITION__TRANS_SCONTAINER:
				return getTransS_container();
			case statechartemfPackage.TRANSITION__TRIGGER:
				if (resolve) return getTrigger();
				return basicGetTrigger();
			case statechartemfPackage.TRANSITION__GUARD:
				return getGuard();
			case statechartemfPackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case statechartemfPackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case statechartemfPackage.TRANSITION__NAME:
				setName((String)newValue);
				return;
			case statechartemfPackage.TRANSITION__TRANS_SM_CONTAINER:
				setTransSM_container((StateMachine)newValue);
				return;
			case statechartemfPackage.TRANSITION__TRANS_SCONTAINER:
				setTransS_container((State)newValue);
				return;
			case statechartemfPackage.TRANSITION__TRIGGER:
				setTrigger((Event)newValue);
				return;
			case statechartemfPackage.TRANSITION__GUARD:
				setGuard((Guard)newValue);
				return;
			case statechartemfPackage.TRANSITION__SOURCE:
				setSource((StateVertex)newValue);
				return;
			case statechartemfPackage.TRANSITION__TARGET:
				setTarget((StateVertex)newValue);
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
			case statechartemfPackage.TRANSITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case statechartemfPackage.TRANSITION__TRANS_SM_CONTAINER:
				setTransSM_container((StateMachine)null);
				return;
			case statechartemfPackage.TRANSITION__TRANS_SCONTAINER:
				setTransS_container((State)null);
				return;
			case statechartemfPackage.TRANSITION__TRIGGER:
				setTrigger((Event)null);
				return;
			case statechartemfPackage.TRANSITION__GUARD:
				setGuard((Guard)null);
				return;
			case statechartemfPackage.TRANSITION__SOURCE:
				setSource((StateVertex)null);
				return;
			case statechartemfPackage.TRANSITION__TARGET:
				setTarget((StateVertex)null);
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
			case statechartemfPackage.TRANSITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case statechartemfPackage.TRANSITION__TRANS_SM_CONTAINER:
				return getTransSM_container() != null;
			case statechartemfPackage.TRANSITION__TRANS_SCONTAINER:
				return getTransS_container() != null;
			case statechartemfPackage.TRANSITION__TRIGGER:
				return trigger != null;
			case statechartemfPackage.TRANSITION__GUARD:
				return guard != null;
			case statechartemfPackage.TRANSITION__SOURCE:
				return source != null;
			case statechartemfPackage.TRANSITION__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == de.uni_stuttgart.iste.cowolf.model.commonBase.NameBase.class) {
			switch (derivedFeatureID) {
				case statechartemfPackage.TRANSITION__NAME: return de.uni_stuttgart.iste.cowolf.model.commonBase.CommonBasePackage.NAME_BASE__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == de.uni_stuttgart.iste.cowolf.model.commonBase.NameBase.class) {
			switch (baseFeatureID) {
				case de.uni_stuttgart.iste.cowolf.model.commonBase.CommonBasePackage.NAME_BASE__NAME: return statechartemfPackage.TRANSITION__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //TransitionImpl
