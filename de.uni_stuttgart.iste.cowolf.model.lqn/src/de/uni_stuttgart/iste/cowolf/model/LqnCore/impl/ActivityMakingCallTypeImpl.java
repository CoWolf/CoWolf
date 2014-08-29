/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.impl;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityMakingCallType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Making Call Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityMakingCallTypeImpl#getCallsMean <em>Calls Mean</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityMakingCallTypeImpl extends MakingCallTypeImpl implements ActivityMakingCallType {
	/**
	 * The default value of the '{@link #getCallsMean() <em>Calls Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallsMean()
	 * @generated
	 * @ordered
	 */
	protected static final Object CALLS_MEAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCallsMean() <em>Calls Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallsMean()
	 * @generated
	 * @ordered
	 */
	protected Object callsMean = CALLS_MEAN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityMakingCallTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LQNPackage.Literals.ACTIVITY_MAKING_CALL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCallsMean() {
		return callsMean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallsMean(Object newCallsMean) {
		Object oldCallsMean = callsMean;
		callsMean = newCallsMean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.ACTIVITY_MAKING_CALL_TYPE__CALLS_MEAN, oldCallsMean, callsMean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LQNPackage.ACTIVITY_MAKING_CALL_TYPE__CALLS_MEAN:
				return getCallsMean();
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
			case LQNPackage.ACTIVITY_MAKING_CALL_TYPE__CALLS_MEAN:
				setCallsMean(newValue);
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
			case LQNPackage.ACTIVITY_MAKING_CALL_TYPE__CALLS_MEAN:
				setCallsMean(CALLS_MEAN_EDEFAULT);
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
			case LQNPackage.ACTIVITY_MAKING_CALL_TYPE__CALLS_MEAN:
				return CALLS_MEAN_EDEFAULT == null ? callsMean != null : !CALLS_MEAN_EDEFAULT.equals(callsMean);
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
		result.append(" (callsMean: ");
		result.append(callsMean);
		result.append(')');
		return result.toString();
	}

} //ActivityMakingCallTypeImpl
