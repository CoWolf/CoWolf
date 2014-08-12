/**
 */
package de.uni_stuttgart.iste.cowolf.model.fault_tree.impl;

import de.uni_stuttgart.iste.cowolf.model.fault_tree.Event;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.IntermediateEvent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intermediate Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.IntermediateEventImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.IntermediateEventImpl#getInEvent <em>In Event</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.IntermediateEventImpl#getOutEvent <em>Out Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntermediateEventImpl extends EventImpl implements IntermediateEvent {
	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<FailureInstance> instance;

	/**
	 * The cached value of the '{@link #getInEvent() <em>In Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInEvent()
	 * @generated
	 * @ordered
	 */
	protected Event inEvent;

	/**
	 * The cached value of the '{@link #getOutEvent() <em>Out Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutEvent()
	 * @generated
	 * @ordered
	 */
	protected Event outEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntermediateEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaultTreePackage.Literals.INTERMEDIATE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FailureInstance> getInstance() {
		if (instance == null) {
			instance = new EObjectWithInverseResolvingEList<FailureInstance>(FailureInstance.class, this, FaultTreePackage.INTERMEDIATE_EVENT__INSTANCE, FaultTreePackage.FAILURE_INSTANCE__EVENT);
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getInEvent() {
		if (inEvent != null && inEvent.eIsProxy()) {
			InternalEObject oldInEvent = (InternalEObject)inEvent;
			inEvent = (Event)eResolveProxy(oldInEvent);
			if (inEvent != oldInEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaultTreePackage.INTERMEDIATE_EVENT__IN_EVENT, oldInEvent, inEvent));
			}
		}
		return inEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetInEvent() {
		return inEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInEvent(Event newInEvent) {
		Event oldInEvent = inEvent;
		inEvent = newInEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaultTreePackage.INTERMEDIATE_EVENT__IN_EVENT, oldInEvent, inEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getOutEvent() {
		if (outEvent != null && outEvent.eIsProxy()) {
			InternalEObject oldOutEvent = (InternalEObject)outEvent;
			outEvent = (Event)eResolveProxy(oldOutEvent);
			if (outEvent != oldOutEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaultTreePackage.INTERMEDIATE_EVENT__OUT_EVENT, oldOutEvent, outEvent));
			}
		}
		return outEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetOutEvent() {
		return outEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutEvent(Event newOutEvent) {
		Event oldOutEvent = outEvent;
		outEvent = newOutEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaultTreePackage.INTERMEDIATE_EVENT__OUT_EVENT, oldOutEvent, outEvent));
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
			case FaultTreePackage.INTERMEDIATE_EVENT__INSTANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstance()).basicAdd(otherEnd, msgs);
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
			case FaultTreePackage.INTERMEDIATE_EVENT__INSTANCE:
				return ((InternalEList<?>)getInstance()).basicRemove(otherEnd, msgs);
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
			case FaultTreePackage.INTERMEDIATE_EVENT__INSTANCE:
				return getInstance();
			case FaultTreePackage.INTERMEDIATE_EVENT__IN_EVENT:
				if (resolve) return getInEvent();
				return basicGetInEvent();
			case FaultTreePackage.INTERMEDIATE_EVENT__OUT_EVENT:
				if (resolve) return getOutEvent();
				return basicGetOutEvent();
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
			case FaultTreePackage.INTERMEDIATE_EVENT__INSTANCE:
				getInstance().clear();
				getInstance().addAll((Collection<? extends FailureInstance>)newValue);
				return;
			case FaultTreePackage.INTERMEDIATE_EVENT__IN_EVENT:
				setInEvent((Event)newValue);
				return;
			case FaultTreePackage.INTERMEDIATE_EVENT__OUT_EVENT:
				setOutEvent((Event)newValue);
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
			case FaultTreePackage.INTERMEDIATE_EVENT__INSTANCE:
				getInstance().clear();
				return;
			case FaultTreePackage.INTERMEDIATE_EVENT__IN_EVENT:
				setInEvent((Event)null);
				return;
			case FaultTreePackage.INTERMEDIATE_EVENT__OUT_EVENT:
				setOutEvent((Event)null);
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
			case FaultTreePackage.INTERMEDIATE_EVENT__INSTANCE:
				return instance != null && !instance.isEmpty();
			case FaultTreePackage.INTERMEDIATE_EVENT__IN_EVENT:
				return inEvent != null;
			case FaultTreePackage.INTERMEDIATE_EVENT__OUT_EVENT:
				return outEvent != null;
		}
		return super.eIsSet(featureID);
	}

} //IntermediateEventImpl
