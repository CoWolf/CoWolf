/**
 */
package activity.impl;

import activity.ActivityPackage;
import activity.ArrowAfterStart;
import activity.NodesWithoutJoin;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nodes Without Join</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activity.impl.NodesWithoutJoinImpl#getIncomingStart <em>Incoming Start</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NodesWithoutJoinImpl extends MinimalEObjectImpl.Container implements NodesWithoutJoin {
	/**
	 * The cached value of the '{@link #getIncomingStart() <em>Incoming Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingStart()
	 * @generated
	 * @ordered
	 */
	protected ArrowAfterStart incomingStart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodesWithoutJoinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.NODES_WITHOUT_JOIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowAfterStart getIncomingStart() {
		if (incomingStart != null && incomingStart.eIsProxy()) {
			InternalEObject oldIncomingStart = (InternalEObject)incomingStart;
			incomingStart = (ArrowAfterStart)eResolveProxy(oldIncomingStart);
			if (incomingStart != oldIncomingStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.NODES_WITHOUT_JOIN__INCOMING_START, oldIncomingStart, incomingStart));
			}
		}
		return incomingStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowAfterStart basicGetIncomingStart() {
		return incomingStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingStart(ArrowAfterStart newIncomingStart, NotificationChain msgs) {
		ArrowAfterStart oldIncomingStart = incomingStart;
		incomingStart = newIncomingStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.NODES_WITHOUT_JOIN__INCOMING_START, oldIncomingStart, newIncomingStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncomingStart(ArrowAfterStart newIncomingStart) {
		if (newIncomingStart != incomingStart) {
			NotificationChain msgs = null;
			if (incomingStart != null)
				msgs = ((InternalEObject)incomingStart).eInverseRemove(this, ActivityPackage.ARROW_AFTER_START__TARGET_AFTER_START, ArrowAfterStart.class, msgs);
			if (newIncomingStart != null)
				msgs = ((InternalEObject)newIncomingStart).eInverseAdd(this, ActivityPackage.ARROW_AFTER_START__TARGET_AFTER_START, ArrowAfterStart.class, msgs);
			msgs = basicSetIncomingStart(newIncomingStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.NODES_WITHOUT_JOIN__INCOMING_START, newIncomingStart, newIncomingStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityPackage.NODES_WITHOUT_JOIN__INCOMING_START:
				if (incomingStart != null)
					msgs = ((InternalEObject)incomingStart).eInverseRemove(this, ActivityPackage.ARROW_AFTER_START__TARGET_AFTER_START, ArrowAfterStart.class, msgs);
				return basicSetIncomingStart((ArrowAfterStart)otherEnd, msgs);
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
			case ActivityPackage.NODES_WITHOUT_JOIN__INCOMING_START:
				return basicSetIncomingStart(null, msgs);
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
			case ActivityPackage.NODES_WITHOUT_JOIN__INCOMING_START:
				if (resolve) return getIncomingStart();
				return basicGetIncomingStart();
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
			case ActivityPackage.NODES_WITHOUT_JOIN__INCOMING_START:
				setIncomingStart((ArrowAfterStart)newValue);
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
			case ActivityPackage.NODES_WITHOUT_JOIN__INCOMING_START:
				setIncomingStart((ArrowAfterStart)null);
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
			case ActivityPackage.NODES_WITHOUT_JOIN__INCOMING_START:
				return incomingStart != null;
		}
		return super.eIsSet(featureID);
	}

} //NodesWithoutJoinImpl
