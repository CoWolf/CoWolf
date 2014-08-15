/**
 */
package activity.impl;

import activity.ActivityPackage;
import activity.Arrow;
import activity.Start;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activity.impl.StartImpl#getOutgoingFromStart <em>Outgoing From Start</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StartImpl extends MinimalEObjectImpl.Container implements Start {
	/**
	 * The cached value of the '{@link #getOutgoingFromStart() <em>Outgoing From Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingFromStart()
	 * @generated
	 * @ordered
	 */
	protected Arrow outgoingFromStart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.START;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arrow getOutgoingFromStart() {
		if (outgoingFromStart != null && outgoingFromStart.eIsProxy()) {
			InternalEObject oldOutgoingFromStart = (InternalEObject)outgoingFromStart;
			outgoingFromStart = (Arrow)eResolveProxy(oldOutgoingFromStart);
			if (outgoingFromStart != oldOutgoingFromStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.START__OUTGOING_FROM_START, oldOutgoingFromStart, outgoingFromStart));
			}
		}
		return outgoingFromStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arrow basicGetOutgoingFromStart() {
		return outgoingFromStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutgoingFromStart(Arrow newOutgoingFromStart, NotificationChain msgs) {
		Arrow oldOutgoingFromStart = outgoingFromStart;
		outgoingFromStart = newOutgoingFromStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.START__OUTGOING_FROM_START, oldOutgoingFromStart, newOutgoingFromStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutgoingFromStart(Arrow newOutgoingFromStart) {
		if (newOutgoingFromStart != outgoingFromStart) {
			NotificationChain msgs = null;
			if (outgoingFromStart != null)
				msgs = ((InternalEObject)outgoingFromStart).eInverseRemove(this, ActivityPackage.ARROW__FROM_START, Arrow.class, msgs);
			if (newOutgoingFromStart != null)
				msgs = ((InternalEObject)newOutgoingFromStart).eInverseAdd(this, ActivityPackage.ARROW__FROM_START, Arrow.class, msgs);
			msgs = basicSetOutgoingFromStart(newOutgoingFromStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.START__OUTGOING_FROM_START, newOutgoingFromStart, newOutgoingFromStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityPackage.START__OUTGOING_FROM_START:
				if (outgoingFromStart != null)
					msgs = ((InternalEObject)outgoingFromStart).eInverseRemove(this, ActivityPackage.ARROW__FROM_START, Arrow.class, msgs);
				return basicSetOutgoingFromStart((Arrow)otherEnd, msgs);
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
			case ActivityPackage.START__OUTGOING_FROM_START:
				return basicSetOutgoingFromStart(null, msgs);
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
			case ActivityPackage.START__OUTGOING_FROM_START:
				if (resolve) return getOutgoingFromStart();
				return basicGetOutgoingFromStart();
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
			case ActivityPackage.START__OUTGOING_FROM_START:
				setOutgoingFromStart((Arrow)newValue);
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
			case ActivityPackage.START__OUTGOING_FROM_START:
				setOutgoingFromStart((Arrow)null);
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
			case ActivityPackage.START__OUTGOING_FROM_START:
				return outgoingFromStart != null;
		}
		return super.eIsSet(featureID);
	}

} //StartImpl
