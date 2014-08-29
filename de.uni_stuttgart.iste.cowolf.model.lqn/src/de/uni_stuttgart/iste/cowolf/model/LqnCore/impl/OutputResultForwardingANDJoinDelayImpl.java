/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.impl;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultForwardingANDJoinDelay;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Result Forwarding AND Join Delay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultForwardingANDJoinDelayImpl#getResultConf95 <em>Result Conf95</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultForwardingANDJoinDelayImpl#getResultConf99 <em>Result Conf99</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultForwardingANDJoinDelayImpl#getDest <em>Dest</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultForwardingANDJoinDelayImpl#getJoinVariance <em>Join Variance</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultForwardingANDJoinDelayImpl#getJoinWaiting <em>Join Waiting</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultForwardingANDJoinDelayImpl#getWaiting <em>Waiting</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputResultForwardingANDJoinDelayImpl extends IDBaseImpl implements OutputResultForwardingANDJoinDelay {
	/**
	 * The cached value of the '{@link #getResultConf95() <em>Result Conf95</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultConf95()
	 * @generated
	 * @ordered
	 */
	protected EList<ResultConf95Type> resultConf95;

	/**
	 * The cached value of the '{@link #getResultConf99() <em>Result Conf99</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultConf99()
	 * @generated
	 * @ordered
	 */
	protected EList<ResultConf99Type> resultConf99;

	/**
	 * The default value of the '{@link #getDest() <em>Dest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDest()
	 * @generated
	 * @ordered
	 */
	protected static final String DEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDest() <em>Dest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDest()
	 * @generated
	 * @ordered
	 */
	protected String dest = DEST_EDEFAULT;

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
	protected OutputResultForwardingANDJoinDelayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LQNPackage.Literals.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultConf95Type> getResultConf95() {
		if (resultConf95 == null) {
			resultConf95 = new EObjectContainmentEList<ResultConf95Type>(ResultConf95Type.class, this, LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF95);
		}
		return resultConf95;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultConf99Type> getResultConf99() {
		if (resultConf99 == null) {
			resultConf99 = new EObjectContainmentEList<ResultConf99Type>(ResultConf99Type.class, this, LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF99);
		}
		return resultConf99;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDest() {
		return dest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDest(String newDest) {
		String oldDest = dest;
		dest = newDest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__DEST, oldDest, dest));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_VARIANCE, oldJoinVariance, joinVariance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_WAITING, oldJoinWaiting, joinWaiting));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__WAITING, oldWaiting, waiting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF95:
				return ((InternalEList<?>)getResultConf95()).basicRemove(otherEnd, msgs);
			case LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF99:
				return ((InternalEList<?>)getResultConf99()).basicRemove(otherEnd, msgs);
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
			case LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF95:
				return getResultConf95();
			case LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF99:
				return getResultConf99();
			case LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__DEST:
				return getDest();
			case LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_VARIANCE:
				return getJoinVariance();
			case LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_WAITING:
				return getJoinWaiting();
			case LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__WAITING:
				return getWaiting();
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
			case LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF95:
				getResultConf95().clear();
				getResultConf95().addAll((Collection<? extends ResultConf95Type>)newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF99:
				getResultConf99().clear();
				getResultConf99().addAll((Collection<? extends ResultConf99Type>)newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__DEST:
				setDest((String)newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_VARIANCE:
				setJoinVariance(newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_WAITING:
				setJoinWaiting(newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__WAITING:
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
			case LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF95:
				getResultConf95().clear();
				return;
			case LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF99:
				getResultConf99().clear();
				return;
			case LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__DEST:
				setDest(DEST_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_VARIANCE:
				setJoinVariance(JOIN_VARIANCE_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_WAITING:
				setJoinWaiting(JOIN_WAITING_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__WAITING:
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
			case LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF95:
				return resultConf95 != null && !resultConf95.isEmpty();
			case LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__RESULT_CONF99:
				return resultConf99 != null && !resultConf99.isEmpty();
			case LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__DEST:
				return DEST_EDEFAULT == null ? dest != null : !DEST_EDEFAULT.equals(dest);
			case LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_VARIANCE:
				return JOIN_VARIANCE_EDEFAULT == null ? joinVariance != null : !JOIN_VARIANCE_EDEFAULT.equals(joinVariance);
			case LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__JOIN_WAITING:
				return JOIN_WAITING_EDEFAULT == null ? joinWaiting != null : !JOIN_WAITING_EDEFAULT.equals(joinWaiting);
			case LQNPackage.OUTPUT_RESULT_FORWARDING_AND_JOIN_DELAY__WAITING:
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
		result.append(" (dest: ");
		result.append(dest);
		result.append(", joinVariance: ");
		result.append(joinVariance);
		result.append(", joinWaiting: ");
		result.append(joinWaiting);
		result.append(", waiting: ");
		result.append(waiting);
		result.append(')');
		return result.toString();
	}

} //OutputResultForwardingANDJoinDelayImpl
