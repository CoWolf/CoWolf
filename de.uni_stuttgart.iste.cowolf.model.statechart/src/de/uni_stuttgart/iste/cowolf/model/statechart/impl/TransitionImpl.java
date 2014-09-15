/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart.impl;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;
import de.uni_stuttgart.iste.cowolf.model.statechart.Event;
import de.uni_stuttgart.iste.cowolf.model.statechart.Guard;
import de.uni_stuttgart.iste.cowolf.model.statechart.State;
import de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine;
import de.uni_stuttgart.iste.cowolf.model.statechart.StateVertex;
import de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage;
import de.uni_stuttgart.iste.cowolf.model.statechart.Transition;
import de.uni_stuttgart.iste.cowolf.model.statechart.TransitionAction;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.TransitionImpl#getTransSM_container <em>Trans SM container</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.TransitionImpl#getTransS_container <em>Trans Scontainer</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.TransitionImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.TransitionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.TransitionImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends IDBaseImpl implements Transition {
	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference.
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
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected TransitionAction action;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
		return StatemachinePackage.Literals.TRANSITION;
	}
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getTransSM_container() {
		if (eContainerFeatureID() != StatemachinePackage.TRANSITION__TRANS_SM_CONTAINER) return null;
		return (StateMachine)eInternalContainer();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public EList<StateVertex> getTransStates() {
		
		if(  this.eContainer instanceof CompositeStateImpl){
			return ((CompositeStateImpl) this.eContainer).getSubVertexes();
		}
		else if(this.eContainer instanceof StateMachineImpl){
			return (EList<StateVertex>)(EList<?>)((StateMachineImpl) this.eContainer).getTop();
		}
		else {
			return null;
		}

//		
//		
//		if (eContainerFeatureID() != StatemachinePackage.TRANSITION__TRANS_SM_CONTAINER) return null;
//		return ((StateMachine)eInternalContainer()).getTop();
		
		
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransSM_container(StateMachine newTransSM_container, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTransSM_container, StatemachinePackage.TRANSITION__TRANS_SM_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransSM_container(StateMachine newTransSM_container) {
		if (newTransSM_container != eInternalContainer() || (eContainerFeatureID() != StatemachinePackage.TRANSITION__TRANS_SM_CONTAINER && newTransSM_container != null)) {
			if (EcoreUtil.isAncestor(this, newTransSM_container))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTransSM_container != null)
				msgs = ((InternalEObject)newTransSM_container).eInverseAdd(this, StatemachinePackage.STATE_MACHINE__TRANSITIONS, StateMachine.class, msgs);
			msgs = basicSetTransSM_container(newTransSM_container, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TRANS_SM_CONTAINER, newTransSM_container, newTransSM_container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTransS_container() {
		if (eContainerFeatureID() != StatemachinePackage.TRANSITION__TRANS_SCONTAINER) return null;
		return (State)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransS_container(State newTransS_container, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTransS_container, StatemachinePackage.TRANSITION__TRANS_SCONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransS_container(State newTransS_container) {
		if (newTransS_container != eInternalContainer() || (eContainerFeatureID() != StatemachinePackage.TRANSITION__TRANS_SCONTAINER && newTransS_container != null)) {
			if (EcoreUtil.isAncestor(this, newTransS_container))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTransS_container != null)
				msgs = ((InternalEObject)newTransS_container).eInverseAdd(this, StatemachinePackage.STATE__INTERNAL_TRANSITIONS, State.class, msgs);
			msgs = basicSetTransS_container(newTransS_container, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TRANS_SCONTAINER, newTransS_container, newTransS_container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getTrigger() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TRIGGER, oldTrigger, newTrigger);
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
				msgs = ((InternalEObject)trigger).eInverseRemove(this, StatemachinePackage.EVENT__EVT_CONTAINER, Event.class, msgs);
			if (newTrigger != null)
				msgs = ((InternalEObject)newTrigger).eInverseAdd(this, StatemachinePackage.EVENT__EVT_CONTAINER, Event.class, msgs);
			msgs = basicSetTrigger(newTrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TRIGGER, newTrigger, newTrigger));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD, oldGuard, newGuard);
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
				msgs = ((InternalEObject)guard).eInverseRemove(this, StatemachinePackage.GUARD__GUA_CONTAINER, Guard.class, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, StatemachinePackage.GUARD__GUA_CONTAINER, Guard.class, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__GUARD, newGuard, newGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionAction getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(TransitionAction newAction, NotificationChain msgs) {
		TransitionAction oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION, oldAction, newAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(TransitionAction newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, StatemachinePackage.TRANSITION_ACTION__ACT_CONTAINER, TransitionAction.class, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, StatemachinePackage.TRANSITION_ACTION__ACT_CONTAINER, TransitionAction.class, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__ACTION, newAction, newAction));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__SOURCE, oldSource, source));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE, oldSource, newSource);
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
				msgs = ((InternalEObject)source).eInverseRemove(this, StatemachinePackage.STATE_VERTEX__OUTGOING, StateVertex.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, StatemachinePackage.STATE_VERTEX__OUTGOING, StateVertex.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__SOURCE, newSource, newSource));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.TRANSITION__TARGET, oldTarget, target));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET, oldTarget, newTarget);
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
				msgs = ((InternalEObject)target).eInverseRemove(this, StatemachinePackage.STATE_VERTEX__INCOMING, StateVertex.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, StatemachinePackage.STATE_VERTEX__INCOMING, StateVertex.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatemachinePackage.TRANSITION__TRANS_SM_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTransSM_container((StateMachine)otherEnd, msgs);
			case StatemachinePackage.TRANSITION__TRANS_SCONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTransS_container((State)otherEnd, msgs);
			case StatemachinePackage.TRANSITION__TRIGGER:
				if (trigger != null)
					msgs = ((InternalEObject)trigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatemachinePackage.TRANSITION__TRIGGER, null, msgs);
				return basicSetTrigger((Event)otherEnd, msgs);
			case StatemachinePackage.TRANSITION__GUARD:
				if (guard != null)
					msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatemachinePackage.TRANSITION__GUARD, null, msgs);
				return basicSetGuard((Guard)otherEnd, msgs);
			case StatemachinePackage.TRANSITION__ACTION:
				if (action != null)
					msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatemachinePackage.TRANSITION__ACTION, null, msgs);
				return basicSetAction((TransitionAction)otherEnd, msgs);
			case StatemachinePackage.TRANSITION__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, StatemachinePackage.STATE_VERTEX__OUTGOING, StateVertex.class, msgs);
				return basicSetSource((StateVertex)otherEnd, msgs);
			case StatemachinePackage.TRANSITION__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, StatemachinePackage.STATE_VERTEX__INCOMING, StateVertex.class, msgs);
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
			case StatemachinePackage.TRANSITION__TRANS_SM_CONTAINER:
				return basicSetTransSM_container(null, msgs);
			case StatemachinePackage.TRANSITION__TRANS_SCONTAINER:
				return basicSetTransS_container(null, msgs);
			case StatemachinePackage.TRANSITION__TRIGGER:
				return basicSetTrigger(null, msgs);
			case StatemachinePackage.TRANSITION__GUARD:
				return basicSetGuard(null, msgs);
			case StatemachinePackage.TRANSITION__ACTION:
				return basicSetAction(null, msgs);
			case StatemachinePackage.TRANSITION__SOURCE:
				return basicSetSource(null, msgs);
			case StatemachinePackage.TRANSITION__TARGET:
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
			case StatemachinePackage.TRANSITION__TRANS_SM_CONTAINER:
				return eInternalContainer().eInverseRemove(this, StatemachinePackage.STATE_MACHINE__TRANSITIONS, StateMachine.class, msgs);
			case StatemachinePackage.TRANSITION__TRANS_SCONTAINER:
				return eInternalContainer().eInverseRemove(this, StatemachinePackage.STATE__INTERNAL_TRANSITIONS, State.class, msgs);
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
			case StatemachinePackage.TRANSITION__TRANS_SM_CONTAINER:
				return getTransSM_container();
			case StatemachinePackage.TRANSITION__TRANS_SCONTAINER:
				return getTransS_container();
			case StatemachinePackage.TRANSITION__TRIGGER:
				return getTrigger();
			case StatemachinePackage.TRANSITION__GUARD:
				return getGuard();
			case StatemachinePackage.TRANSITION__ACTION:
				return getAction();
			case StatemachinePackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StatemachinePackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StatemachinePackage.TRANSITION__DESCRIPTION:
				return getDescription();
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
			case StatemachinePackage.TRANSITION__TRANS_SM_CONTAINER:
				setTransSM_container((StateMachine)newValue);
				return;
			case StatemachinePackage.TRANSITION__TRANS_SCONTAINER:
				setTransS_container((State)newValue);
				return;
			case StatemachinePackage.TRANSITION__TRIGGER:
				setTrigger((Event)newValue);
				return;
			case StatemachinePackage.TRANSITION__GUARD:
				setGuard((Guard)newValue);
				return;
			case StatemachinePackage.TRANSITION__ACTION:
				setAction((TransitionAction)newValue);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((StateVertex)newValue);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((StateVertex)newValue);
				return;
			case StatemachinePackage.TRANSITION__DESCRIPTION:
				setDescription((String)newValue);
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
			case StatemachinePackage.TRANSITION__TRANS_SM_CONTAINER:
				setTransSM_container((StateMachine)null);
				return;
			case StatemachinePackage.TRANSITION__TRANS_SCONTAINER:
				setTransS_container((State)null);
				return;
			case StatemachinePackage.TRANSITION__TRIGGER:
				setTrigger((Event)null);
				return;
			case StatemachinePackage.TRANSITION__GUARD:
				setGuard((Guard)null);
				return;
			case StatemachinePackage.TRANSITION__ACTION:
				setAction((TransitionAction)null);
				return;
			case StatemachinePackage.TRANSITION__SOURCE:
				setSource((StateVertex)null);
				return;
			case StatemachinePackage.TRANSITION__TARGET:
				setTarget((StateVertex)null);
				return;
			case StatemachinePackage.TRANSITION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case StatemachinePackage.TRANSITION__TRANS_SM_CONTAINER:
				return getTransSM_container() != null;
			case StatemachinePackage.TRANSITION__TRANS_SCONTAINER:
				return getTransS_container() != null;
			case StatemachinePackage.TRANSITION__TRIGGER:
				return trigger != null;
			case StatemachinePackage.TRANSITION__GUARD:
				return guard != null;
			case StatemachinePackage.TRANSITION__ACTION:
				return action != null;
			case StatemachinePackage.TRANSITION__SOURCE:
				return source != null;
			case StatemachinePackage.TRANSITION__TARGET:
				return target != null;
			case StatemachinePackage.TRANSITION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
