/**
 */
package de.uni_stuttgart.iste.cowolf.model.fault_tree.impl;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.Event;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.GateImpl#getInputGates <em>Input Gates</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.GateImpl#getInputEvents <em>Input Events</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.GateImpl#getOutputGate <em>Output Gate</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.GateImpl#getOutputEvent <em>Output Event</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.GateImpl#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GateImpl extends IDBaseImpl implements Gate {
	/**
	 * The cached value of the '{@link #getInputGates() <em>Input Gates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputGates()
	 * @generated
	 * @ordered
	 */
	protected EList<Gate> inputGates;

	/**
	 * The cached value of the '{@link #getInputEvents() <em>Input Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> inputEvents;

	/**
	 * The cached value of the '{@link #getOutputGate() <em>Output Gate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputGate()
	 * @generated
	 * @ordered
	 */
	protected Gate outputGate;

	/**
	 * The cached value of the '{@link #getOutputEvent() <em>Output Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputEvent()
	 * @generated
	 * @ordered
	 */
	protected Event outputEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaultTreePackage.Literals.GATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gate> getInputGates() {
		if (inputGates == null) {
			inputGates = new EObjectResolvingEList<Gate>(Gate.class, this, FaultTreePackage.GATE__INPUT_GATES);
		}
		return inputGates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getInputEvents() {
		if (inputEvents == null) {
			inputEvents = new EObjectWithInverseResolvingEList<Event>(Event.class, this, FaultTreePackage.GATE__INPUT_EVENTS, FaultTreePackage.EVENT__OUTPUT_GATE);
		}
		return inputEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate getOutputGate() {
		if (outputGate != null && outputGate.eIsProxy()) {
			InternalEObject oldOutputGate = (InternalEObject)outputGate;
			outputGate = (Gate)eResolveProxy(oldOutputGate);
			if (outputGate != oldOutputGate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaultTreePackage.GATE__OUTPUT_GATE, oldOutputGate, outputGate));
			}
		}
		return outputGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate basicGetOutputGate() {
		return outputGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputGate(Gate newOutputGate) {
		Gate oldOutputGate = outputGate;
		outputGate = newOutputGate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaultTreePackage.GATE__OUTPUT_GATE, oldOutputGate, outputGate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getOutputEvent() {
		if (outputEvent != null && outputEvent.eIsProxy()) {
			InternalEObject oldOutputEvent = (InternalEObject)outputEvent;
			outputEvent = (Event)eResolveProxy(oldOutputEvent);
			if (outputEvent != oldOutputEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaultTreePackage.GATE__OUTPUT_EVENT, oldOutputEvent, outputEvent));
			}
		}
		return outputEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetOutputEvent() {
		return outputEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputEvent(Event newOutputEvent, NotificationChain msgs) {
		Event oldOutputEvent = outputEvent;
		outputEvent = newOutputEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaultTreePackage.GATE__OUTPUT_EVENT, oldOutputEvent, newOutputEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputEvent(Event newOutputEvent) {
		if (newOutputEvent != outputEvent) {
			NotificationChain msgs = null;
			if (outputEvent != null)
				msgs = ((InternalEObject)outputEvent).eInverseRemove(this, FaultTreePackage.EVENT__INPUT_GATE, Event.class, msgs);
			if (newOutputEvent != null)
				msgs = ((InternalEObject)newOutputEvent).eInverseAdd(this, FaultTreePackage.EVENT__INPUT_GATE, Event.class, msgs);
			msgs = basicSetOutputEvent(newOutputEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaultTreePackage.GATE__OUTPUT_EVENT, newOutputEvent, newOutputEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultTree getRoot() {
		if (eContainerFeatureID() != FaultTreePackage.GATE__ROOT) return null;
		return (FaultTree)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(FaultTree newRoot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRoot, FaultTreePackage.GATE__ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(FaultTree newRoot) {
		if (newRoot != eInternalContainer() || (eContainerFeatureID() != FaultTreePackage.GATE__ROOT && newRoot != null)) {
			if (EcoreUtil.isAncestor(this, newRoot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRoot != null)
				msgs = ((InternalEObject)newRoot).eInverseAdd(this, FaultTreePackage.FAULT_TREE__GATE, FaultTree.class, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaultTreePackage.GATE__ROOT, newRoot, newRoot));
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
			case FaultTreePackage.GATE__INPUT_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputEvents()).basicAdd(otherEnd, msgs);
			case FaultTreePackage.GATE__OUTPUT_EVENT:
				if (outputEvent != null)
					msgs = ((InternalEObject)outputEvent).eInverseRemove(this, FaultTreePackage.EVENT__INPUT_GATE, Event.class, msgs);
				return basicSetOutputEvent((Event)otherEnd, msgs);
			case FaultTreePackage.GATE__ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRoot((FaultTree)otherEnd, msgs);
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
			case FaultTreePackage.GATE__INPUT_EVENTS:
				return ((InternalEList<?>)getInputEvents()).basicRemove(otherEnd, msgs);
			case FaultTreePackage.GATE__OUTPUT_EVENT:
				return basicSetOutputEvent(null, msgs);
			case FaultTreePackage.GATE__ROOT:
				return basicSetRoot(null, msgs);
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
			case FaultTreePackage.GATE__ROOT:
				return eInternalContainer().eInverseRemove(this, FaultTreePackage.FAULT_TREE__GATE, FaultTree.class, msgs);
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
			case FaultTreePackage.GATE__INPUT_GATES:
				return getInputGates();
			case FaultTreePackage.GATE__INPUT_EVENTS:
				return getInputEvents();
			case FaultTreePackage.GATE__OUTPUT_GATE:
				if (resolve) return getOutputGate();
				return basicGetOutputGate();
			case FaultTreePackage.GATE__OUTPUT_EVENT:
				if (resolve) return getOutputEvent();
				return basicGetOutputEvent();
			case FaultTreePackage.GATE__ROOT:
				return getRoot();
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
			case FaultTreePackage.GATE__INPUT_GATES:
				getInputGates().clear();
				getInputGates().addAll((Collection<? extends Gate>)newValue);
				return;
			case FaultTreePackage.GATE__INPUT_EVENTS:
				getInputEvents().clear();
				getInputEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case FaultTreePackage.GATE__OUTPUT_GATE:
				setOutputGate((Gate)newValue);
				return;
			case FaultTreePackage.GATE__OUTPUT_EVENT:
				setOutputEvent((Event)newValue);
				return;
			case FaultTreePackage.GATE__ROOT:
				setRoot((FaultTree)newValue);
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
			case FaultTreePackage.GATE__INPUT_GATES:
				getInputGates().clear();
				return;
			case FaultTreePackage.GATE__INPUT_EVENTS:
				getInputEvents().clear();
				return;
			case FaultTreePackage.GATE__OUTPUT_GATE:
				setOutputGate((Gate)null);
				return;
			case FaultTreePackage.GATE__OUTPUT_EVENT:
				setOutputEvent((Event)null);
				return;
			case FaultTreePackage.GATE__ROOT:
				setRoot((FaultTree)null);
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
			case FaultTreePackage.GATE__INPUT_GATES:
				return inputGates != null && !inputGates.isEmpty();
			case FaultTreePackage.GATE__INPUT_EVENTS:
				return inputEvents != null && !inputEvents.isEmpty();
			case FaultTreePackage.GATE__OUTPUT_GATE:
				return outputGate != null;
			case FaultTreePackage.GATE__OUTPUT_EVENT:
				return outputEvent != null;
			case FaultTreePackage.GATE__ROOT:
				return getRoot() != null;
		}
		return super.eIsSet(featureID);
	}

} //GateImpl
