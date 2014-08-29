/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.impl;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.CallOrderType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultForwardingANDJoinDelay;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType;

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
 * An implementation of the model object '<em><b>Activity Def Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityDefBaseImpl#getResultJoinDelay <em>Result Join Delay</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityDefBaseImpl#getResultForwarding <em>Result Forwarding</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityDefBaseImpl#getServiceTimeDistribution <em>Service Time Distribution</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityDefBaseImpl#getResultActivity <em>Result Activity</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityDefBaseImpl#getCallOrder <em>Call Order</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityDefBaseImpl#getHostDemandCvsq <em>Host Demand Cvsq</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityDefBaseImpl#getHostDemandMean <em>Host Demand Mean</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityDefBaseImpl#getMaxServiceTime <em>Max Service Time</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityDefBaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityDefBaseImpl#getThinkTime <em>Think Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityDefBaseImpl extends IDBaseImpl implements ActivityDefBase {
	/**
	 * The cached value of the '{@link #getResultJoinDelay() <em>Result Join Delay</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultJoinDelay()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputResultForwardingANDJoinDelay> resultJoinDelay;

	/**
	 * The cached value of the '{@link #getResultForwarding() <em>Result Forwarding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultForwarding()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputResultForwardingANDJoinDelay> resultForwarding;

	/**
	 * The cached value of the '{@link #getServiceTimeDistribution() <em>Service Time Distribution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTimeDistribution()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputDistributionType> serviceTimeDistribution;

	/**
	 * The cached value of the '{@link #getResultActivity() <em>Result Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputResultType> resultActivity;

	/**
	 * The default value of the '{@link #getCallOrder() <em>Call Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallOrder()
	 * @generated
	 * @ordered
	 */
	protected static final CallOrderType CALL_ORDER_EDEFAULT = CallOrderType.STOCHASTIC;

	/**
	 * The cached value of the '{@link #getCallOrder() <em>Call Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallOrder()
	 * @generated
	 * @ordered
	 */
	protected CallOrderType callOrder = CALL_ORDER_EDEFAULT;

	/**
	 * This is true if the Call Order attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean callOrderESet;

	/**
	 * The default value of the '{@link #getHostDemandCvsq() <em>Host Demand Cvsq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostDemandCvsq()
	 * @generated
	 * @ordered
	 */
	protected static final Object HOST_DEMAND_CVSQ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostDemandCvsq() <em>Host Demand Cvsq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostDemandCvsq()
	 * @generated
	 * @ordered
	 */
	protected Object hostDemandCvsq = HOST_DEMAND_CVSQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostDemandMean() <em>Host Demand Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostDemandMean()
	 * @generated
	 * @ordered
	 */
	protected static final Object HOST_DEMAND_MEAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostDemandMean() <em>Host Demand Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostDemandMean()
	 * @generated
	 * @ordered
	 */
	protected Object hostDemandMean = HOST_DEMAND_MEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxServiceTime() <em>Max Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxServiceTime()
	 * @generated
	 * @ordered
	 */
	protected static final Object MAX_SERVICE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxServiceTime() <em>Max Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxServiceTime()
	 * @generated
	 * @ordered
	 */
	protected Object maxServiceTime = MAX_SERVICE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getThinkTime() <em>Think Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinkTime()
	 * @generated
	 * @ordered
	 */
	protected static final Object THINK_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThinkTime() <em>Think Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinkTime()
	 * @generated
	 * @ordered
	 */
	protected Object thinkTime = THINK_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityDefBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LQNPackage.Literals.ACTIVITY_DEF_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputResultForwardingANDJoinDelay> getResultJoinDelay() {
		if (resultJoinDelay == null) {
			resultJoinDelay = new EObjectContainmentEList<OutputResultForwardingANDJoinDelay>(OutputResultForwardingANDJoinDelay.class, this, LQNPackage.ACTIVITY_DEF_BASE__RESULT_JOIN_DELAY);
		}
		return resultJoinDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputResultForwardingANDJoinDelay> getResultForwarding() {
		if (resultForwarding == null) {
			resultForwarding = new EObjectContainmentEList<OutputResultForwardingANDJoinDelay>(OutputResultForwardingANDJoinDelay.class, this, LQNPackage.ACTIVITY_DEF_BASE__RESULT_FORWARDING);
		}
		return resultForwarding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputDistributionType> getServiceTimeDistribution() {
		if (serviceTimeDistribution == null) {
			serviceTimeDistribution = new EObjectContainmentEList<OutputDistributionType>(OutputDistributionType.class, this, LQNPackage.ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION);
		}
		return serviceTimeDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputResultType> getResultActivity() {
		if (resultActivity == null) {
			resultActivity = new EObjectContainmentEList<OutputResultType>(OutputResultType.class, this, LQNPackage.ACTIVITY_DEF_BASE__RESULT_ACTIVITY);
		}
		return resultActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallOrderType getCallOrder() {
		return callOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallOrder(CallOrderType newCallOrder) {
		CallOrderType oldCallOrder = callOrder;
		callOrder = newCallOrder == null ? CALL_ORDER_EDEFAULT : newCallOrder;
		boolean oldCallOrderESet = callOrderESet;
		callOrderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.ACTIVITY_DEF_BASE__CALL_ORDER, oldCallOrder, callOrder, !oldCallOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCallOrder() {
		CallOrderType oldCallOrder = callOrder;
		boolean oldCallOrderESet = callOrderESet;
		callOrder = CALL_ORDER_EDEFAULT;
		callOrderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LQNPackage.ACTIVITY_DEF_BASE__CALL_ORDER, oldCallOrder, CALL_ORDER_EDEFAULT, oldCallOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCallOrder() {
		return callOrderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getHostDemandCvsq() {
		return hostDemandCvsq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostDemandCvsq(Object newHostDemandCvsq) {
		Object oldHostDemandCvsq = hostDemandCvsq;
		hostDemandCvsq = newHostDemandCvsq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ, oldHostDemandCvsq, hostDemandCvsq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getHostDemandMean() {
		return hostDemandMean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostDemandMean(Object newHostDemandMean) {
		Object oldHostDemandMean = hostDemandMean;
		hostDemandMean = newHostDemandMean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN, oldHostDemandMean, hostDemandMean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMaxServiceTime() {
		return maxServiceTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxServiceTime(Object newMaxServiceTime) {
		Object oldMaxServiceTime = maxServiceTime;
		maxServiceTime = newMaxServiceTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.ACTIVITY_DEF_BASE__MAX_SERVICE_TIME, oldMaxServiceTime, maxServiceTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.ACTIVITY_DEF_BASE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getThinkTime() {
		return thinkTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThinkTime(Object newThinkTime) {
		Object oldThinkTime = thinkTime;
		thinkTime = newThinkTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.ACTIVITY_DEF_BASE__THINK_TIME, oldThinkTime, thinkTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LQNPackage.ACTIVITY_DEF_BASE__RESULT_JOIN_DELAY:
				return ((InternalEList<?>)getResultJoinDelay()).basicRemove(otherEnd, msgs);
			case LQNPackage.ACTIVITY_DEF_BASE__RESULT_FORWARDING:
				return ((InternalEList<?>)getResultForwarding()).basicRemove(otherEnd, msgs);
			case LQNPackage.ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION:
				return ((InternalEList<?>)getServiceTimeDistribution()).basicRemove(otherEnd, msgs);
			case LQNPackage.ACTIVITY_DEF_BASE__RESULT_ACTIVITY:
				return ((InternalEList<?>)getResultActivity()).basicRemove(otherEnd, msgs);
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
			case LQNPackage.ACTIVITY_DEF_BASE__RESULT_JOIN_DELAY:
				return getResultJoinDelay();
			case LQNPackage.ACTIVITY_DEF_BASE__RESULT_FORWARDING:
				return getResultForwarding();
			case LQNPackage.ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION:
				return getServiceTimeDistribution();
			case LQNPackage.ACTIVITY_DEF_BASE__RESULT_ACTIVITY:
				return getResultActivity();
			case LQNPackage.ACTIVITY_DEF_BASE__CALL_ORDER:
				return getCallOrder();
			case LQNPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ:
				return getHostDemandCvsq();
			case LQNPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN:
				return getHostDemandMean();
			case LQNPackage.ACTIVITY_DEF_BASE__MAX_SERVICE_TIME:
				return getMaxServiceTime();
			case LQNPackage.ACTIVITY_DEF_BASE__NAME:
				return getName();
			case LQNPackage.ACTIVITY_DEF_BASE__THINK_TIME:
				return getThinkTime();
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
			case LQNPackage.ACTIVITY_DEF_BASE__RESULT_JOIN_DELAY:
				getResultJoinDelay().clear();
				getResultJoinDelay().addAll((Collection<? extends OutputResultForwardingANDJoinDelay>)newValue);
				return;
			case LQNPackage.ACTIVITY_DEF_BASE__RESULT_FORWARDING:
				getResultForwarding().clear();
				getResultForwarding().addAll((Collection<? extends OutputResultForwardingANDJoinDelay>)newValue);
				return;
			case LQNPackage.ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION:
				getServiceTimeDistribution().clear();
				getServiceTimeDistribution().addAll((Collection<? extends OutputDistributionType>)newValue);
				return;
			case LQNPackage.ACTIVITY_DEF_BASE__RESULT_ACTIVITY:
				getResultActivity().clear();
				getResultActivity().addAll((Collection<? extends OutputResultType>)newValue);
				return;
			case LQNPackage.ACTIVITY_DEF_BASE__CALL_ORDER:
				setCallOrder((CallOrderType)newValue);
				return;
			case LQNPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ:
				setHostDemandCvsq(newValue);
				return;
			case LQNPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN:
				setHostDemandMean(newValue);
				return;
			case LQNPackage.ACTIVITY_DEF_BASE__MAX_SERVICE_TIME:
				setMaxServiceTime(newValue);
				return;
			case LQNPackage.ACTIVITY_DEF_BASE__NAME:
				setName((String)newValue);
				return;
			case LQNPackage.ACTIVITY_DEF_BASE__THINK_TIME:
				setThinkTime(newValue);
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
			case LQNPackage.ACTIVITY_DEF_BASE__RESULT_JOIN_DELAY:
				getResultJoinDelay().clear();
				return;
			case LQNPackage.ACTIVITY_DEF_BASE__RESULT_FORWARDING:
				getResultForwarding().clear();
				return;
			case LQNPackage.ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION:
				getServiceTimeDistribution().clear();
				return;
			case LQNPackage.ACTIVITY_DEF_BASE__RESULT_ACTIVITY:
				getResultActivity().clear();
				return;
			case LQNPackage.ACTIVITY_DEF_BASE__CALL_ORDER:
				unsetCallOrder();
				return;
			case LQNPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ:
				setHostDemandCvsq(HOST_DEMAND_CVSQ_EDEFAULT);
				return;
			case LQNPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN:
				setHostDemandMean(HOST_DEMAND_MEAN_EDEFAULT);
				return;
			case LQNPackage.ACTIVITY_DEF_BASE__MAX_SERVICE_TIME:
				setMaxServiceTime(MAX_SERVICE_TIME_EDEFAULT);
				return;
			case LQNPackage.ACTIVITY_DEF_BASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LQNPackage.ACTIVITY_DEF_BASE__THINK_TIME:
				setThinkTime(THINK_TIME_EDEFAULT);
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
			case LQNPackage.ACTIVITY_DEF_BASE__RESULT_JOIN_DELAY:
				return resultJoinDelay != null && !resultJoinDelay.isEmpty();
			case LQNPackage.ACTIVITY_DEF_BASE__RESULT_FORWARDING:
				return resultForwarding != null && !resultForwarding.isEmpty();
			case LQNPackage.ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION:
				return serviceTimeDistribution != null && !serviceTimeDistribution.isEmpty();
			case LQNPackage.ACTIVITY_DEF_BASE__RESULT_ACTIVITY:
				return resultActivity != null && !resultActivity.isEmpty();
			case LQNPackage.ACTIVITY_DEF_BASE__CALL_ORDER:
				return isSetCallOrder();
			case LQNPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ:
				return HOST_DEMAND_CVSQ_EDEFAULT == null ? hostDemandCvsq != null : !HOST_DEMAND_CVSQ_EDEFAULT.equals(hostDemandCvsq);
			case LQNPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN:
				return HOST_DEMAND_MEAN_EDEFAULT == null ? hostDemandMean != null : !HOST_DEMAND_MEAN_EDEFAULT.equals(hostDemandMean);
			case LQNPackage.ACTIVITY_DEF_BASE__MAX_SERVICE_TIME:
				return MAX_SERVICE_TIME_EDEFAULT == null ? maxServiceTime != null : !MAX_SERVICE_TIME_EDEFAULT.equals(maxServiceTime);
			case LQNPackage.ACTIVITY_DEF_BASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LQNPackage.ACTIVITY_DEF_BASE__THINK_TIME:
				return THINK_TIME_EDEFAULT == null ? thinkTime != null : !THINK_TIME_EDEFAULT.equals(thinkTime);
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
		result.append(" (callOrder: ");
		if (callOrderESet) result.append(callOrder); else result.append("<unset>");
		result.append(", hostDemandCvsq: ");
		result.append(hostDemandCvsq);
		result.append(", hostDemandMean: ");
		result.append(hostDemandMean);
		result.append(", maxServiceTime: ");
		result.append(maxServiceTime);
		result.append(", name: ");
		result.append(name);
		result.append(", thinkTime: ");
		result.append(thinkTime);
		result.append(')');
		return result.toString();
	}

} //ActivityDefBaseImpl
