/**
 */
package de.uni_stuttgart.iste.cowolf.model.fault_tree.impl;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorInstance;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorType;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.Event;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureType;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.Hazard;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fault Tree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreeImpl#getHazard <em>Hazard</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreeImpl#getGate <em>Gate</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreeImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreeImpl#getFailure_instance <em>Failure instance</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreeImpl#getFailure_type <em>Failure type</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreeImpl#getError_instance <em>Error instance</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.FaultTreeImpl#getError_type <em>Error type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FaultTreeImpl extends IDBaseImpl implements FaultTree {
	/**
	 * The cached value of the '{@link #getHazard() <em>Hazard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazard()
	 * @generated
	 * @ordered
	 */
	protected Hazard hazard;

	/**
	 * The cached value of the '{@link #getGate() <em>Gate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGate()
	 * @generated
	 * @ordered
	 */
	protected EList<Gate> gate;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> event;

	/**
	 * The cached value of the '{@link #getFailure_instance() <em>Failure instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailure_instance()
	 * @generated
	 * @ordered
	 */
	protected EList<FailureInstance> failure_instance;

	/**
	 * The cached value of the '{@link #getFailure_type() <em>Failure type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailure_type()
	 * @generated
	 * @ordered
	 */
	protected EList<FailureType> failure_type;

	/**
	 * The cached value of the '{@link #getError_instance() <em>Error instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError_instance()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorInstance> error_instance;

	/**
	 * The cached value of the '{@link #getError_type() <em>Error type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError_type()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorType> error_type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultTreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaultTreePackage.Literals.FAULT_TREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hazard getHazard() {
		return hazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHazard(Hazard newHazard, NotificationChain msgs) {
		Hazard oldHazard = hazard;
		hazard = newHazard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaultTreePackage.FAULT_TREE__HAZARD, oldHazard, newHazard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHazard(Hazard newHazard) {
		if (newHazard != hazard) {
			NotificationChain msgs = null;
			if (hazard != null)
				msgs = ((InternalEObject)hazard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaultTreePackage.FAULT_TREE__HAZARD, null, msgs);
			if (newHazard != null)
				msgs = ((InternalEObject)newHazard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaultTreePackage.FAULT_TREE__HAZARD, null, msgs);
			msgs = basicSetHazard(newHazard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaultTreePackage.FAULT_TREE__HAZARD, newHazard, newHazard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gate> getGate() {
		if (gate == null) {
			gate = new EObjectContainmentWithInverseEList<Gate>(Gate.class, this, FaultTreePackage.FAULT_TREE__GATE, FaultTreePackage.GATE__ROOT);
		}
		return gate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvent() {
		if (event == null) {
			event = new EObjectContainmentWithInverseEList<Event>(Event.class, this, FaultTreePackage.FAULT_TREE__EVENT, FaultTreePackage.EVENT__ROOT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FailureInstance> getFailure_instance() {
		if (failure_instance == null) {
			failure_instance = new EObjectContainmentWithInverseEList<FailureInstance>(FailureInstance.class, this, FaultTreePackage.FAULT_TREE__FAILURE_INSTANCE, FaultTreePackage.FAILURE_INSTANCE__ROOT);
		}
		return failure_instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FailureType> getFailure_type() {
		if (failure_type == null) {
			failure_type = new EObjectContainmentWithInverseEList<FailureType>(FailureType.class, this, FaultTreePackage.FAULT_TREE__FAILURE_TYPE, FaultTreePackage.FAILURE_TYPE__ROOT);
		}
		return failure_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErrorInstance> getError_instance() {
		if (error_instance == null) {
			error_instance = new EObjectContainmentWithInverseEList<ErrorInstance>(ErrorInstance.class, this, FaultTreePackage.FAULT_TREE__ERROR_INSTANCE, FaultTreePackage.ERROR_INSTANCE__ROOT);
		}
		return error_instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErrorType> getError_type() {
		if (error_type == null) {
			error_type = new EObjectContainmentWithInverseEList<ErrorType>(ErrorType.class, this, FaultTreePackage.FAULT_TREE__ERROR_TYPE, FaultTreePackage.ERROR_TYPE__ROOT);
		}
		return error_type;
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
			case FaultTreePackage.FAULT_TREE__GATE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGate()).basicAdd(otherEnd, msgs);
			case FaultTreePackage.FAULT_TREE__EVENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEvent()).basicAdd(otherEnd, msgs);
			case FaultTreePackage.FAULT_TREE__FAILURE_INSTANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFailure_instance()).basicAdd(otherEnd, msgs);
			case FaultTreePackage.FAULT_TREE__FAILURE_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFailure_type()).basicAdd(otherEnd, msgs);
			case FaultTreePackage.FAULT_TREE__ERROR_INSTANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getError_instance()).basicAdd(otherEnd, msgs);
			case FaultTreePackage.FAULT_TREE__ERROR_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getError_type()).basicAdd(otherEnd, msgs);
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
			case FaultTreePackage.FAULT_TREE__HAZARD:
				return basicSetHazard(null, msgs);
			case FaultTreePackage.FAULT_TREE__GATE:
				return ((InternalEList<?>)getGate()).basicRemove(otherEnd, msgs);
			case FaultTreePackage.FAULT_TREE__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
			case FaultTreePackage.FAULT_TREE__FAILURE_INSTANCE:
				return ((InternalEList<?>)getFailure_instance()).basicRemove(otherEnd, msgs);
			case FaultTreePackage.FAULT_TREE__FAILURE_TYPE:
				return ((InternalEList<?>)getFailure_type()).basicRemove(otherEnd, msgs);
			case FaultTreePackage.FAULT_TREE__ERROR_INSTANCE:
				return ((InternalEList<?>)getError_instance()).basicRemove(otherEnd, msgs);
			case FaultTreePackage.FAULT_TREE__ERROR_TYPE:
				return ((InternalEList<?>)getError_type()).basicRemove(otherEnd, msgs);
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
			case FaultTreePackage.FAULT_TREE__HAZARD:
				return getHazard();
			case FaultTreePackage.FAULT_TREE__GATE:
				return getGate();
			case FaultTreePackage.FAULT_TREE__EVENT:
				return getEvent();
			case FaultTreePackage.FAULT_TREE__FAILURE_INSTANCE:
				return getFailure_instance();
			case FaultTreePackage.FAULT_TREE__FAILURE_TYPE:
				return getFailure_type();
			case FaultTreePackage.FAULT_TREE__ERROR_INSTANCE:
				return getError_instance();
			case FaultTreePackage.FAULT_TREE__ERROR_TYPE:
				return getError_type();
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
			case FaultTreePackage.FAULT_TREE__HAZARD:
				setHazard((Hazard)newValue);
				return;
			case FaultTreePackage.FAULT_TREE__GATE:
				getGate().clear();
				getGate().addAll((Collection<? extends Gate>)newValue);
				return;
			case FaultTreePackage.FAULT_TREE__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends Event>)newValue);
				return;
			case FaultTreePackage.FAULT_TREE__FAILURE_INSTANCE:
				getFailure_instance().clear();
				getFailure_instance().addAll((Collection<? extends FailureInstance>)newValue);
				return;
			case FaultTreePackage.FAULT_TREE__FAILURE_TYPE:
				getFailure_type().clear();
				getFailure_type().addAll((Collection<? extends FailureType>)newValue);
				return;
			case FaultTreePackage.FAULT_TREE__ERROR_INSTANCE:
				getError_instance().clear();
				getError_instance().addAll((Collection<? extends ErrorInstance>)newValue);
				return;
			case FaultTreePackage.FAULT_TREE__ERROR_TYPE:
				getError_type().clear();
				getError_type().addAll((Collection<? extends ErrorType>)newValue);
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
			case FaultTreePackage.FAULT_TREE__HAZARD:
				setHazard((Hazard)null);
				return;
			case FaultTreePackage.FAULT_TREE__GATE:
				getGate().clear();
				return;
			case FaultTreePackage.FAULT_TREE__EVENT:
				getEvent().clear();
				return;
			case FaultTreePackage.FAULT_TREE__FAILURE_INSTANCE:
				getFailure_instance().clear();
				return;
			case FaultTreePackage.FAULT_TREE__FAILURE_TYPE:
				getFailure_type().clear();
				return;
			case FaultTreePackage.FAULT_TREE__ERROR_INSTANCE:
				getError_instance().clear();
				return;
			case FaultTreePackage.FAULT_TREE__ERROR_TYPE:
				getError_type().clear();
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
			case FaultTreePackage.FAULT_TREE__HAZARD:
				return hazard != null;
			case FaultTreePackage.FAULT_TREE__GATE:
				return gate != null && !gate.isEmpty();
			case FaultTreePackage.FAULT_TREE__EVENT:
				return event != null && !event.isEmpty();
			case FaultTreePackage.FAULT_TREE__FAILURE_INSTANCE:
				return failure_instance != null && !failure_instance.isEmpty();
			case FaultTreePackage.FAULT_TREE__FAILURE_TYPE:
				return failure_type != null && !failure_type.isEmpty();
			case FaultTreePackage.FAULT_TREE__ERROR_INSTANCE:
				return error_instance != null && !error_instance.isEmpty();
			case FaultTreePackage.FAULT_TREE__ERROR_TYPE:
				return error_type != null && !error_type.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FaultTreeImpl
