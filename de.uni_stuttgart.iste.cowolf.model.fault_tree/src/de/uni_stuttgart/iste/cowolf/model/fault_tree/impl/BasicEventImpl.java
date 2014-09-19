/**
 */
package de.uni_stuttgart.iste.cowolf.model.fault_tree.impl;

import de.uni_stuttgart.iste.cowolf.model.fault_tree.BasicEvent;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorInstance;
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
 * An implementation of the model object '<em><b>Basic Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.BasicEventImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.BasicEventImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.BasicEventImpl#getOutEvent <em>Out Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicEventImpl extends EventImpl implements BasicEvent {
	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorInstance> instance;

	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected double probability = PROBABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutEvent() <em>Out Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutEvent()
	 * @generated
	 * @ordered
	 */
	protected IntermediateEvent outEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaultTreePackage.Literals.BASIC_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErrorInstance> getInstance() {
		if (instance == null) {
			instance = new EObjectWithInverseResolvingEList<ErrorInstance>(ErrorInstance.class, this, FaultTreePackage.BASIC_EVENT__INSTANCE, FaultTreePackage.ERROR_INSTANCE__ERROR);
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(double newProbability) {
		double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaultTreePackage.BASIC_EVENT__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateEvent getOutEvent() {
		if (outEvent != null && outEvent.eIsProxy()) {
			InternalEObject oldOutEvent = (InternalEObject)outEvent;
			outEvent = (IntermediateEvent)eResolveProxy(oldOutEvent);
			if (outEvent != oldOutEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaultTreePackage.BASIC_EVENT__OUT_EVENT, oldOutEvent, outEvent));
			}
		}
		return outEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateEvent basicGetOutEvent() {
		return outEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutEvent(IntermediateEvent newOutEvent) {
		IntermediateEvent oldOutEvent = outEvent;
		outEvent = newOutEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaultTreePackage.BASIC_EVENT__OUT_EVENT, oldOutEvent, outEvent));
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
			case FaultTreePackage.BASIC_EVENT__INSTANCE:
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
			case FaultTreePackage.BASIC_EVENT__INSTANCE:
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
			case FaultTreePackage.BASIC_EVENT__INSTANCE:
				return getInstance();
			case FaultTreePackage.BASIC_EVENT__PROBABILITY:
				return getProbability();
			case FaultTreePackage.BASIC_EVENT__OUT_EVENT:
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
			case FaultTreePackage.BASIC_EVENT__INSTANCE:
				getInstance().clear();
				getInstance().addAll((Collection<? extends ErrorInstance>)newValue);
				return;
			case FaultTreePackage.BASIC_EVENT__PROBABILITY:
				setProbability((Double)newValue);
				return;
			case FaultTreePackage.BASIC_EVENT__OUT_EVENT:
				setOutEvent((IntermediateEvent)newValue);
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
			case FaultTreePackage.BASIC_EVENT__INSTANCE:
				getInstance().clear();
				return;
			case FaultTreePackage.BASIC_EVENT__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case FaultTreePackage.BASIC_EVENT__OUT_EVENT:
				setOutEvent((IntermediateEvent)null);
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
			case FaultTreePackage.BASIC_EVENT__INSTANCE:
				return instance != null && !instance.isEmpty();
			case FaultTreePackage.BASIC_EVENT__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
			case FaultTreePackage.BASIC_EVENT__OUT_EVENT:
				return outEvent != null;
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
		result.append(" (probability: ");
		result.append(probability);
		result.append(')');
		return result.toString();
	}

} //BasicEventImpl
