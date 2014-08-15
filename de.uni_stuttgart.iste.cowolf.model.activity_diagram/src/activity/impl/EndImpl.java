/**
 */
package activity.impl;

import activity.ActivityPackage;
import activity.Arrow;
import activity.End;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activity.impl.EndImpl#getIncomingToEnd <em>Incoming To End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndImpl extends MinimalEObjectImpl.Container implements End {
	/**
	 * The cached value of the '{@link #getIncomingToEnd() <em>Incoming To End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingToEnd()
	 * @generated
	 * @ordered
	 */
	protected Arrow incomingToEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arrow getIncomingToEnd() {
		if (incomingToEnd != null && incomingToEnd.eIsProxy()) {
			InternalEObject oldIncomingToEnd = (InternalEObject)incomingToEnd;
			incomingToEnd = (Arrow)eResolveProxy(oldIncomingToEnd);
			if (incomingToEnd != oldIncomingToEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.END__INCOMING_TO_END, oldIncomingToEnd, incomingToEnd));
			}
		}
		return incomingToEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arrow basicGetIncomingToEnd() {
		return incomingToEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingToEnd(Arrow newIncomingToEnd, NotificationChain msgs) {
		Arrow oldIncomingToEnd = incomingToEnd;
		incomingToEnd = newIncomingToEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.END__INCOMING_TO_END, oldIncomingToEnd, newIncomingToEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncomingToEnd(Arrow newIncomingToEnd) {
		if (newIncomingToEnd != incomingToEnd) {
			NotificationChain msgs = null;
			if (incomingToEnd != null)
				msgs = ((InternalEObject)incomingToEnd).eInverseRemove(this, ActivityPackage.ARROW__TO_END, Arrow.class, msgs);
			if (newIncomingToEnd != null)
				msgs = ((InternalEObject)newIncomingToEnd).eInverseAdd(this, ActivityPackage.ARROW__TO_END, Arrow.class, msgs);
			msgs = basicSetIncomingToEnd(newIncomingToEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.END__INCOMING_TO_END, newIncomingToEnd, newIncomingToEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityPackage.END__INCOMING_TO_END:
				if (incomingToEnd != null)
					msgs = ((InternalEObject)incomingToEnd).eInverseRemove(this, ActivityPackage.ARROW__TO_END, Arrow.class, msgs);
				return basicSetIncomingToEnd((Arrow)otherEnd, msgs);
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
			case ActivityPackage.END__INCOMING_TO_END:
				return basicSetIncomingToEnd(null, msgs);
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
			case ActivityPackage.END__INCOMING_TO_END:
				if (resolve) return getIncomingToEnd();
				return basicGetIncomingToEnd();
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
			case ActivityPackage.END__INCOMING_TO_END:
				setIncomingToEnd((Arrow)newValue);
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
			case ActivityPackage.END__INCOMING_TO_END:
				setIncomingToEnd((Arrow)null);
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
			case ActivityPackage.END__INCOMING_TO_END:
				return incomingToEnd != null;
		}
		return super.eIsSet(featureID);
	}

} //EndImpl
