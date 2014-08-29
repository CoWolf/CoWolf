/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.impl;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Conf99 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultConf99TypeImpl#getJoinVariance <em>Join Variance</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultConf99TypeImpl#getJoinWaiting <em>Join Waiting</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultConf99TypeImpl#getWaiting <em>Waiting</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultConf99TypeImpl extends IDBaseImpl implements ResultConf99Type {
	/**
	 * The default value of the '{@link #getJoinVariance() <em>Join Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinVariance()
	 * @generated
	 * @ordered
	 */
	protected static final Object JOIN_VARIANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJoinVariance() <em>Join Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinVariance()
	 * @generated
	 * @ordered
	 */
	protected Object joinVariance = JOIN_VARIANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJoinWaiting() <em>Join Waiting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinWaiting()
	 * @generated
	 * @ordered
	 */
	protected static final Object JOIN_WAITING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJoinWaiting() <em>Join Waiting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinWaiting()
	 * @generated
	 * @ordered
	 */
	protected Object joinWaiting = JOIN_WAITING_EDEFAULT;

	/**
	 * The default value of the '{@link #getWaiting() <em>Waiting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaiting()
	 * @generated
	 * @ordered
	 */
	protected static final Object WAITING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWaiting() <em>Waiting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaiting()
	 * @generated
	 * @ordered
	 */
	protected Object waiting = WAITING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultConf99TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LQNPackage.Literals.RESULT_CONF99_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getJoinVariance() {
		return joinVariance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinVariance(Object newJoinVariance) {
		Object oldJoinVariance = joinVariance;
		joinVariance = newJoinVariance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.RESULT_CONF99_TYPE__JOIN_VARIANCE, oldJoinVariance, joinVariance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getJoinWaiting() {
		return joinWaiting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinWaiting(Object newJoinWaiting) {
		Object oldJoinWaiting = joinWaiting;
		joinWaiting = newJoinWaiting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.RESULT_CONF99_TYPE__JOIN_WAITING, oldJoinWaiting, joinWaiting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getWaiting() {
		return waiting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaiting(Object newWaiting) {
		Object oldWaiting = waiting;
		waiting = newWaiting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.RESULT_CONF99_TYPE__WAITING, oldWaiting, waiting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LQNPackage.RESULT_CONF99_TYPE__JOIN_VARIANCE:
				return getJoinVariance();
			case LQNPackage.RESULT_CONF99_TYPE__JOIN_WAITING:
				return getJoinWaiting();
			case LQNPackage.RESULT_CONF99_TYPE__WAITING:
				return getWaiting();
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
			case LQNPackage.RESULT_CONF99_TYPE__JOIN_VARIANCE:
				setJoinVariance(newValue);
				return;
			case LQNPackage.RESULT_CONF99_TYPE__JOIN_WAITING:
				setJoinWaiting(newValue);
				return;
			case LQNPackage.RESULT_CONF99_TYPE__WAITING:
				setWaiting(newValue);
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
			case LQNPackage.RESULT_CONF99_TYPE__JOIN_VARIANCE:
				setJoinVariance(JOIN_VARIANCE_EDEFAULT);
				return;
			case LQNPackage.RESULT_CONF99_TYPE__JOIN_WAITING:
				setJoinWaiting(JOIN_WAITING_EDEFAULT);
				return;
			case LQNPackage.RESULT_CONF99_TYPE__WAITING:
				setWaiting(WAITING_EDEFAULT);
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
			case LQNPackage.RESULT_CONF99_TYPE__JOIN_VARIANCE:
				return JOIN_VARIANCE_EDEFAULT == null ? joinVariance != null : !JOIN_VARIANCE_EDEFAULT.equals(joinVariance);
			case LQNPackage.RESULT_CONF99_TYPE__JOIN_WAITING:
				return JOIN_WAITING_EDEFAULT == null ? joinWaiting != null : !JOIN_WAITING_EDEFAULT.equals(joinWaiting);
			case LQNPackage.RESULT_CONF99_TYPE__WAITING:
				return WAITING_EDEFAULT == null ? waiting != null : !WAITING_EDEFAULT.equals(waiting);
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
		result.append(" (joinVariance: ");
		result.append(joinVariance);
		result.append(", joinWaiting: ");
		result.append(joinWaiting);
		result.append(", waiting: ");
		result.append(waiting);
		result.append(')');
		return result.toString();
	}

} //ResultConf99TypeImpl
