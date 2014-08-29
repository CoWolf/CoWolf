/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.impl;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf95Type1;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultConf99Type1;

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
 * An implementation of the model object '<em><b>Output Result Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl#getResultConf95 <em>Result Conf95</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl#getResultConf99 <em>Result Conf99</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl#getOpenWaitTime <em>Open Wait Time</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl#getPhase1ProcWaiting <em>Phase1 Proc Waiting</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl#getPhase1ServiceTime <em>Phase1 Service Time</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl#getPhase1ServiceTimeVariance <em>Phase1 Service Time Variance</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl#getPhase1Utilization <em>Phase1 Utilization</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl#getPhase2ProcWaiting <em>Phase2 Proc Waiting</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl#getPhase2ServiceTime <em>Phase2 Service Time</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl#getPhase2ServiceTimeVariance <em>Phase2 Service Time Variance</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl#getPhase2Utilization <em>Phase2 Utilization</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl#getPhase3ProcWaiting <em>Phase3 Proc Waiting</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl#getPhase3ServiceTime <em>Phase3 Service Time</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl#getPhase3ServiceTimeVariance <em>Phase3 Service Time Variance</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl#getPhase3Utilization <em>Phase3 Utilization</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl#getProbExceedMaxServiceTime <em>Prob Exceed Max Service Time</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl#getProcUtilization <em>Proc Utilization</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl#getProcWaiting <em>Proc Waiting</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl#getServiceTime <em>Service Time</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl#getServiceTimeVariance <em>Service Time Variance</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl#getSquaredCoeffVariation <em>Squared Coeff Variation</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl#getThroughputBound <em>Throughput Bound</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl#getUtilization <em>Utilization</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl#getWaiting <em>Waiting</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.OutputResultTypeImpl#getWaitingVariance <em>Waiting Variance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputResultTypeImpl extends IDBaseImpl implements OutputResultType {
	/**
	 * The cached value of the '{@link #getResultConf95() <em>Result Conf95</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultConf95()
	 * @generated
	 * @ordered
	 */
	protected EList<ResultConf95Type1> resultConf95;

	/**
	 * The cached value of the '{@link #getResultConf99() <em>Result Conf99</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultConf99()
	 * @generated
	 * @ordered
	 */
	protected EList<ResultConf99Type1> resultConf99;

	/**
	 * The default value of the '{@link #getOpenWaitTime() <em>Open Wait Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenWaitTime()
	 * @generated
	 * @ordered
	 */
	protected static final Object OPEN_WAIT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpenWaitTime() <em>Open Wait Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenWaitTime()
	 * @generated
	 * @ordered
	 */
	protected Object openWaitTime = OPEN_WAIT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhase1ProcWaiting() <em>Phase1 Proc Waiting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase1ProcWaiting()
	 * @generated
	 * @ordered
	 */
	protected static final Object PHASE1_PROC_WAITING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhase1ProcWaiting() <em>Phase1 Proc Waiting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase1ProcWaiting()
	 * @generated
	 * @ordered
	 */
	protected Object phase1ProcWaiting = PHASE1_PROC_WAITING_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhase1ServiceTime() <em>Phase1 Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase1ServiceTime()
	 * @generated
	 * @ordered
	 */
	protected static final Object PHASE1_SERVICE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhase1ServiceTime() <em>Phase1 Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase1ServiceTime()
	 * @generated
	 * @ordered
	 */
	protected Object phase1ServiceTime = PHASE1_SERVICE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhase1ServiceTimeVariance() <em>Phase1 Service Time Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase1ServiceTimeVariance()
	 * @generated
	 * @ordered
	 */
	protected static final Object PHASE1_SERVICE_TIME_VARIANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhase1ServiceTimeVariance() <em>Phase1 Service Time Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase1ServiceTimeVariance()
	 * @generated
	 * @ordered
	 */
	protected Object phase1ServiceTimeVariance = PHASE1_SERVICE_TIME_VARIANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhase1Utilization() <em>Phase1 Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase1Utilization()
	 * @generated
	 * @ordered
	 */
	protected static final Object PHASE1_UTILIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhase1Utilization() <em>Phase1 Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase1Utilization()
	 * @generated
	 * @ordered
	 */
	protected Object phase1Utilization = PHASE1_UTILIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhase2ProcWaiting() <em>Phase2 Proc Waiting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase2ProcWaiting()
	 * @generated
	 * @ordered
	 */
	protected static final Object PHASE2_PROC_WAITING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhase2ProcWaiting() <em>Phase2 Proc Waiting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase2ProcWaiting()
	 * @generated
	 * @ordered
	 */
	protected Object phase2ProcWaiting = PHASE2_PROC_WAITING_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhase2ServiceTime() <em>Phase2 Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase2ServiceTime()
	 * @generated
	 * @ordered
	 */
	protected static final Object PHASE2_SERVICE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhase2ServiceTime() <em>Phase2 Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase2ServiceTime()
	 * @generated
	 * @ordered
	 */
	protected Object phase2ServiceTime = PHASE2_SERVICE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhase2ServiceTimeVariance() <em>Phase2 Service Time Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase2ServiceTimeVariance()
	 * @generated
	 * @ordered
	 */
	protected static final Object PHASE2_SERVICE_TIME_VARIANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhase2ServiceTimeVariance() <em>Phase2 Service Time Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase2ServiceTimeVariance()
	 * @generated
	 * @ordered
	 */
	protected Object phase2ServiceTimeVariance = PHASE2_SERVICE_TIME_VARIANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhase2Utilization() <em>Phase2 Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase2Utilization()
	 * @generated
	 * @ordered
	 */
	protected static final Object PHASE2_UTILIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhase2Utilization() <em>Phase2 Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase2Utilization()
	 * @generated
	 * @ordered
	 */
	protected Object phase2Utilization = PHASE2_UTILIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhase3ProcWaiting() <em>Phase3 Proc Waiting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase3ProcWaiting()
	 * @generated
	 * @ordered
	 */
	protected static final Object PHASE3_PROC_WAITING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhase3ProcWaiting() <em>Phase3 Proc Waiting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase3ProcWaiting()
	 * @generated
	 * @ordered
	 */
	protected Object phase3ProcWaiting = PHASE3_PROC_WAITING_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhase3ServiceTime() <em>Phase3 Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase3ServiceTime()
	 * @generated
	 * @ordered
	 */
	protected static final Object PHASE3_SERVICE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhase3ServiceTime() <em>Phase3 Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase3ServiceTime()
	 * @generated
	 * @ordered
	 */
	protected Object phase3ServiceTime = PHASE3_SERVICE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhase3ServiceTimeVariance() <em>Phase3 Service Time Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase3ServiceTimeVariance()
	 * @generated
	 * @ordered
	 */
	protected static final Object PHASE3_SERVICE_TIME_VARIANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhase3ServiceTimeVariance() <em>Phase3 Service Time Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase3ServiceTimeVariance()
	 * @generated
	 * @ordered
	 */
	protected Object phase3ServiceTimeVariance = PHASE3_SERVICE_TIME_VARIANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhase3Utilization() <em>Phase3 Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase3Utilization()
	 * @generated
	 * @ordered
	 */
	protected static final Object PHASE3_UTILIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhase3Utilization() <em>Phase3 Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase3Utilization()
	 * @generated
	 * @ordered
	 */
	protected Object phase3Utilization = PHASE3_UTILIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProbExceedMaxServiceTime() <em>Prob Exceed Max Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbExceedMaxServiceTime()
	 * @generated
	 * @ordered
	 */
	protected static final Object PROB_EXCEED_MAX_SERVICE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProbExceedMaxServiceTime() <em>Prob Exceed Max Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbExceedMaxServiceTime()
	 * @generated
	 * @ordered
	 */
	protected Object probExceedMaxServiceTime = PROB_EXCEED_MAX_SERVICE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcUtilization() <em>Proc Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcUtilization()
	 * @generated
	 * @ordered
	 */
	protected static final Object PROC_UTILIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcUtilization() <em>Proc Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcUtilization()
	 * @generated
	 * @ordered
	 */
	protected Object procUtilization = PROC_UTILIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcWaiting() <em>Proc Waiting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcWaiting()
	 * @generated
	 * @ordered
	 */
	protected static final Object PROC_WAITING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcWaiting() <em>Proc Waiting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcWaiting()
	 * @generated
	 * @ordered
	 */
	protected Object procWaiting = PROC_WAITING_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceTime() <em>Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTime()
	 * @generated
	 * @ordered
	 */
	protected static final Object SERVICE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceTime() <em>Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTime()
	 * @generated
	 * @ordered
	 */
	protected Object serviceTime = SERVICE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceTimeVariance() <em>Service Time Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTimeVariance()
	 * @generated
	 * @ordered
	 */
	protected static final Object SERVICE_TIME_VARIANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceTimeVariance() <em>Service Time Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTimeVariance()
	 * @generated
	 * @ordered
	 */
	protected Object serviceTimeVariance = SERVICE_TIME_VARIANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSquaredCoeffVariation() <em>Squared Coeff Variation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSquaredCoeffVariation()
	 * @generated
	 * @ordered
	 */
	protected static final Object SQUARED_COEFF_VARIATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSquaredCoeffVariation() <em>Squared Coeff Variation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSquaredCoeffVariation()
	 * @generated
	 * @ordered
	 */
	protected Object squaredCoeffVariation = SQUARED_COEFF_VARIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getThroughput() <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected static final Object THROUGHPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThroughput() <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected Object throughput = THROUGHPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getThroughputBound() <em>Throughput Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughputBound()
	 * @generated
	 * @ordered
	 */
	protected static final Object THROUGHPUT_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThroughputBound() <em>Throughput Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughputBound()
	 * @generated
	 * @ordered
	 */
	protected Object throughputBound = THROUGHPUT_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUtilization() <em>Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilization()
	 * @generated
	 * @ordered
	 */
	protected static final Object UTILIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUtilization() <em>Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilization()
	 * @generated
	 * @ordered
	 */
	protected Object utilization = UTILIZATION_EDEFAULT;

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
	 * The default value of the '{@link #getWaitingVariance() <em>Waiting Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitingVariance()
	 * @generated
	 * @ordered
	 */
	protected static final Object WAITING_VARIANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWaitingVariance() <em>Waiting Variance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitingVariance()
	 * @generated
	 * @ordered
	 */
	protected Object waitingVariance = WAITING_VARIANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputResultTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LQNPackage.Literals.OUTPUT_RESULT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultConf95Type1> getResultConf95() {
		if (resultConf95 == null) {
			resultConf95 = new EObjectContainmentEList<ResultConf95Type1>(ResultConf95Type1.class, this, LQNPackage.OUTPUT_RESULT_TYPE__RESULT_CONF95);
		}
		return resultConf95;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultConf99Type1> getResultConf99() {
		if (resultConf99 == null) {
			resultConf99 = new EObjectContainmentEList<ResultConf99Type1>(ResultConf99Type1.class, this, LQNPackage.OUTPUT_RESULT_TYPE__RESULT_CONF99);
		}
		return resultConf99;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getOpenWaitTime() {
		return openWaitTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenWaitTime(Object newOpenWaitTime) {
		Object oldOpenWaitTime = openWaitTime;
		openWaitTime = newOpenWaitTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_RESULT_TYPE__OPEN_WAIT_TIME, oldOpenWaitTime, openWaitTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPhase1ProcWaiting() {
		return phase1ProcWaiting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase1ProcWaiting(Object newPhase1ProcWaiting) {
		Object oldPhase1ProcWaiting = phase1ProcWaiting;
		phase1ProcWaiting = newPhase1ProcWaiting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_RESULT_TYPE__PHASE1_PROC_WAITING, oldPhase1ProcWaiting, phase1ProcWaiting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPhase1ServiceTime() {
		return phase1ServiceTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase1ServiceTime(Object newPhase1ServiceTime) {
		Object oldPhase1ServiceTime = phase1ServiceTime;
		phase1ServiceTime = newPhase1ServiceTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME, oldPhase1ServiceTime, phase1ServiceTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPhase1ServiceTimeVariance() {
		return phase1ServiceTimeVariance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase1ServiceTimeVariance(Object newPhase1ServiceTimeVariance) {
		Object oldPhase1ServiceTimeVariance = phase1ServiceTimeVariance;
		phase1ServiceTimeVariance = newPhase1ServiceTimeVariance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME_VARIANCE, oldPhase1ServiceTimeVariance, phase1ServiceTimeVariance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPhase1Utilization() {
		return phase1Utilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase1Utilization(Object newPhase1Utilization) {
		Object oldPhase1Utilization = phase1Utilization;
		phase1Utilization = newPhase1Utilization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_RESULT_TYPE__PHASE1_UTILIZATION, oldPhase1Utilization, phase1Utilization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPhase2ProcWaiting() {
		return phase2ProcWaiting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase2ProcWaiting(Object newPhase2ProcWaiting) {
		Object oldPhase2ProcWaiting = phase2ProcWaiting;
		phase2ProcWaiting = newPhase2ProcWaiting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_RESULT_TYPE__PHASE2_PROC_WAITING, oldPhase2ProcWaiting, phase2ProcWaiting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPhase2ServiceTime() {
		return phase2ServiceTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase2ServiceTime(Object newPhase2ServiceTime) {
		Object oldPhase2ServiceTime = phase2ServiceTime;
		phase2ServiceTime = newPhase2ServiceTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME, oldPhase2ServiceTime, phase2ServiceTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPhase2ServiceTimeVariance() {
		return phase2ServiceTimeVariance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase2ServiceTimeVariance(Object newPhase2ServiceTimeVariance) {
		Object oldPhase2ServiceTimeVariance = phase2ServiceTimeVariance;
		phase2ServiceTimeVariance = newPhase2ServiceTimeVariance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME_VARIANCE, oldPhase2ServiceTimeVariance, phase2ServiceTimeVariance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPhase2Utilization() {
		return phase2Utilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase2Utilization(Object newPhase2Utilization) {
		Object oldPhase2Utilization = phase2Utilization;
		phase2Utilization = newPhase2Utilization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_RESULT_TYPE__PHASE2_UTILIZATION, oldPhase2Utilization, phase2Utilization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPhase3ProcWaiting() {
		return phase3ProcWaiting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase3ProcWaiting(Object newPhase3ProcWaiting) {
		Object oldPhase3ProcWaiting = phase3ProcWaiting;
		phase3ProcWaiting = newPhase3ProcWaiting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_RESULT_TYPE__PHASE3_PROC_WAITING, oldPhase3ProcWaiting, phase3ProcWaiting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPhase3ServiceTime() {
		return phase3ServiceTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase3ServiceTime(Object newPhase3ServiceTime) {
		Object oldPhase3ServiceTime = phase3ServiceTime;
		phase3ServiceTime = newPhase3ServiceTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME, oldPhase3ServiceTime, phase3ServiceTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPhase3ServiceTimeVariance() {
		return phase3ServiceTimeVariance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase3ServiceTimeVariance(Object newPhase3ServiceTimeVariance) {
		Object oldPhase3ServiceTimeVariance = phase3ServiceTimeVariance;
		phase3ServiceTimeVariance = newPhase3ServiceTimeVariance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME_VARIANCE, oldPhase3ServiceTimeVariance, phase3ServiceTimeVariance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPhase3Utilization() {
		return phase3Utilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase3Utilization(Object newPhase3Utilization) {
		Object oldPhase3Utilization = phase3Utilization;
		phase3Utilization = newPhase3Utilization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_RESULT_TYPE__PHASE3_UTILIZATION, oldPhase3Utilization, phase3Utilization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getProbExceedMaxServiceTime() {
		return probExceedMaxServiceTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbExceedMaxServiceTime(Object newProbExceedMaxServiceTime) {
		Object oldProbExceedMaxServiceTime = probExceedMaxServiceTime;
		probExceedMaxServiceTime = newProbExceedMaxServiceTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_RESULT_TYPE__PROB_EXCEED_MAX_SERVICE_TIME, oldProbExceedMaxServiceTime, probExceedMaxServiceTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getProcUtilization() {
		return procUtilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcUtilization(Object newProcUtilization) {
		Object oldProcUtilization = procUtilization;
		procUtilization = newProcUtilization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_RESULT_TYPE__PROC_UTILIZATION, oldProcUtilization, procUtilization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getProcWaiting() {
		return procWaiting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcWaiting(Object newProcWaiting) {
		Object oldProcWaiting = procWaiting;
		procWaiting = newProcWaiting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_RESULT_TYPE__PROC_WAITING, oldProcWaiting, procWaiting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getServiceTime() {
		return serviceTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceTime(Object newServiceTime) {
		Object oldServiceTime = serviceTime;
		serviceTime = newServiceTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME, oldServiceTime, serviceTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getServiceTimeVariance() {
		return serviceTimeVariance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceTimeVariance(Object newServiceTimeVariance) {
		Object oldServiceTimeVariance = serviceTimeVariance;
		serviceTimeVariance = newServiceTimeVariance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME_VARIANCE, oldServiceTimeVariance, serviceTimeVariance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSquaredCoeffVariation() {
		return squaredCoeffVariation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSquaredCoeffVariation(Object newSquaredCoeffVariation) {
		Object oldSquaredCoeffVariation = squaredCoeffVariation;
		squaredCoeffVariation = newSquaredCoeffVariation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_RESULT_TYPE__SQUARED_COEFF_VARIATION, oldSquaredCoeffVariation, squaredCoeffVariation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getThroughput() {
		return throughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThroughput(Object newThroughput) {
		Object oldThroughput = throughput;
		throughput = newThroughput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_RESULT_TYPE__THROUGHPUT, oldThroughput, throughput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getThroughputBound() {
		return throughputBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThroughputBound(Object newThroughputBound) {
		Object oldThroughputBound = throughputBound;
		throughputBound = newThroughputBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_RESULT_TYPE__THROUGHPUT_BOUND, oldThroughputBound, throughputBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getUtilization() {
		return utilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilization(Object newUtilization) {
		Object oldUtilization = utilization;
		utilization = newUtilization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_RESULT_TYPE__UTILIZATION, oldUtilization, utilization));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_RESULT_TYPE__WAITING, oldWaiting, waiting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getWaitingVariance() {
		return waitingVariance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaitingVariance(Object newWaitingVariance) {
		Object oldWaitingVariance = waitingVariance;
		waitingVariance = newWaitingVariance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.OUTPUT_RESULT_TYPE__WAITING_VARIANCE, oldWaitingVariance, waitingVariance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LQNPackage.OUTPUT_RESULT_TYPE__RESULT_CONF95:
				return ((InternalEList<?>)getResultConf95()).basicRemove(otherEnd, msgs);
			case LQNPackage.OUTPUT_RESULT_TYPE__RESULT_CONF99:
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
			case LQNPackage.OUTPUT_RESULT_TYPE__RESULT_CONF95:
				return getResultConf95();
			case LQNPackage.OUTPUT_RESULT_TYPE__RESULT_CONF99:
				return getResultConf99();
			case LQNPackage.OUTPUT_RESULT_TYPE__OPEN_WAIT_TIME:
				return getOpenWaitTime();
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE1_PROC_WAITING:
				return getPhase1ProcWaiting();
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME:
				return getPhase1ServiceTime();
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME_VARIANCE:
				return getPhase1ServiceTimeVariance();
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE1_UTILIZATION:
				return getPhase1Utilization();
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE2_PROC_WAITING:
				return getPhase2ProcWaiting();
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME:
				return getPhase2ServiceTime();
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME_VARIANCE:
				return getPhase2ServiceTimeVariance();
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE2_UTILIZATION:
				return getPhase2Utilization();
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE3_PROC_WAITING:
				return getPhase3ProcWaiting();
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME:
				return getPhase3ServiceTime();
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME_VARIANCE:
				return getPhase3ServiceTimeVariance();
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE3_UTILIZATION:
				return getPhase3Utilization();
			case LQNPackage.OUTPUT_RESULT_TYPE__PROB_EXCEED_MAX_SERVICE_TIME:
				return getProbExceedMaxServiceTime();
			case LQNPackage.OUTPUT_RESULT_TYPE__PROC_UTILIZATION:
				return getProcUtilization();
			case LQNPackage.OUTPUT_RESULT_TYPE__PROC_WAITING:
				return getProcWaiting();
			case LQNPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME:
				return getServiceTime();
			case LQNPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME_VARIANCE:
				return getServiceTimeVariance();
			case LQNPackage.OUTPUT_RESULT_TYPE__SQUARED_COEFF_VARIATION:
				return getSquaredCoeffVariation();
			case LQNPackage.OUTPUT_RESULT_TYPE__THROUGHPUT:
				return getThroughput();
			case LQNPackage.OUTPUT_RESULT_TYPE__THROUGHPUT_BOUND:
				return getThroughputBound();
			case LQNPackage.OUTPUT_RESULT_TYPE__UTILIZATION:
				return getUtilization();
			case LQNPackage.OUTPUT_RESULT_TYPE__WAITING:
				return getWaiting();
			case LQNPackage.OUTPUT_RESULT_TYPE__WAITING_VARIANCE:
				return getWaitingVariance();
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
			case LQNPackage.OUTPUT_RESULT_TYPE__RESULT_CONF95:
				getResultConf95().clear();
				getResultConf95().addAll((Collection<? extends ResultConf95Type1>)newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__RESULT_CONF99:
				getResultConf99().clear();
				getResultConf99().addAll((Collection<? extends ResultConf99Type1>)newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__OPEN_WAIT_TIME:
				setOpenWaitTime(newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE1_PROC_WAITING:
				setPhase1ProcWaiting(newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME:
				setPhase1ServiceTime(newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME_VARIANCE:
				setPhase1ServiceTimeVariance(newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE1_UTILIZATION:
				setPhase1Utilization(newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE2_PROC_WAITING:
				setPhase2ProcWaiting(newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME:
				setPhase2ServiceTime(newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME_VARIANCE:
				setPhase2ServiceTimeVariance(newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE2_UTILIZATION:
				setPhase2Utilization(newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE3_PROC_WAITING:
				setPhase3ProcWaiting(newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME:
				setPhase3ServiceTime(newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME_VARIANCE:
				setPhase3ServiceTimeVariance(newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE3_UTILIZATION:
				setPhase3Utilization(newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PROB_EXCEED_MAX_SERVICE_TIME:
				setProbExceedMaxServiceTime(newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PROC_UTILIZATION:
				setProcUtilization(newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PROC_WAITING:
				setProcWaiting(newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME:
				setServiceTime(newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME_VARIANCE:
				setServiceTimeVariance(newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__SQUARED_COEFF_VARIATION:
				setSquaredCoeffVariation(newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__THROUGHPUT:
				setThroughput(newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__THROUGHPUT_BOUND:
				setThroughputBound(newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__UTILIZATION:
				setUtilization(newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__WAITING:
				setWaiting(newValue);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__WAITING_VARIANCE:
				setWaitingVariance(newValue);
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
			case LQNPackage.OUTPUT_RESULT_TYPE__RESULT_CONF95:
				getResultConf95().clear();
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__RESULT_CONF99:
				getResultConf99().clear();
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__OPEN_WAIT_TIME:
				setOpenWaitTime(OPEN_WAIT_TIME_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE1_PROC_WAITING:
				setPhase1ProcWaiting(PHASE1_PROC_WAITING_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME:
				setPhase1ServiceTime(PHASE1_SERVICE_TIME_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME_VARIANCE:
				setPhase1ServiceTimeVariance(PHASE1_SERVICE_TIME_VARIANCE_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE1_UTILIZATION:
				setPhase1Utilization(PHASE1_UTILIZATION_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE2_PROC_WAITING:
				setPhase2ProcWaiting(PHASE2_PROC_WAITING_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME:
				setPhase2ServiceTime(PHASE2_SERVICE_TIME_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME_VARIANCE:
				setPhase2ServiceTimeVariance(PHASE2_SERVICE_TIME_VARIANCE_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE2_UTILIZATION:
				setPhase2Utilization(PHASE2_UTILIZATION_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE3_PROC_WAITING:
				setPhase3ProcWaiting(PHASE3_PROC_WAITING_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME:
				setPhase3ServiceTime(PHASE3_SERVICE_TIME_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME_VARIANCE:
				setPhase3ServiceTimeVariance(PHASE3_SERVICE_TIME_VARIANCE_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE3_UTILIZATION:
				setPhase3Utilization(PHASE3_UTILIZATION_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PROB_EXCEED_MAX_SERVICE_TIME:
				setProbExceedMaxServiceTime(PROB_EXCEED_MAX_SERVICE_TIME_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PROC_UTILIZATION:
				setProcUtilization(PROC_UTILIZATION_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__PROC_WAITING:
				setProcWaiting(PROC_WAITING_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME:
				setServiceTime(SERVICE_TIME_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME_VARIANCE:
				setServiceTimeVariance(SERVICE_TIME_VARIANCE_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__SQUARED_COEFF_VARIATION:
				setSquaredCoeffVariation(SQUARED_COEFF_VARIATION_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__THROUGHPUT:
				setThroughput(THROUGHPUT_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__THROUGHPUT_BOUND:
				setThroughputBound(THROUGHPUT_BOUND_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__UTILIZATION:
				setUtilization(UTILIZATION_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__WAITING:
				setWaiting(WAITING_EDEFAULT);
				return;
			case LQNPackage.OUTPUT_RESULT_TYPE__WAITING_VARIANCE:
				setWaitingVariance(WAITING_VARIANCE_EDEFAULT);
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
			case LQNPackage.OUTPUT_RESULT_TYPE__RESULT_CONF95:
				return resultConf95 != null && !resultConf95.isEmpty();
			case LQNPackage.OUTPUT_RESULT_TYPE__RESULT_CONF99:
				return resultConf99 != null && !resultConf99.isEmpty();
			case LQNPackage.OUTPUT_RESULT_TYPE__OPEN_WAIT_TIME:
				return OPEN_WAIT_TIME_EDEFAULT == null ? openWaitTime != null : !OPEN_WAIT_TIME_EDEFAULT.equals(openWaitTime);
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE1_PROC_WAITING:
				return PHASE1_PROC_WAITING_EDEFAULT == null ? phase1ProcWaiting != null : !PHASE1_PROC_WAITING_EDEFAULT.equals(phase1ProcWaiting);
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME:
				return PHASE1_SERVICE_TIME_EDEFAULT == null ? phase1ServiceTime != null : !PHASE1_SERVICE_TIME_EDEFAULT.equals(phase1ServiceTime);
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE1_SERVICE_TIME_VARIANCE:
				return PHASE1_SERVICE_TIME_VARIANCE_EDEFAULT == null ? phase1ServiceTimeVariance != null : !PHASE1_SERVICE_TIME_VARIANCE_EDEFAULT.equals(phase1ServiceTimeVariance);
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE1_UTILIZATION:
				return PHASE1_UTILIZATION_EDEFAULT == null ? phase1Utilization != null : !PHASE1_UTILIZATION_EDEFAULT.equals(phase1Utilization);
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE2_PROC_WAITING:
				return PHASE2_PROC_WAITING_EDEFAULT == null ? phase2ProcWaiting != null : !PHASE2_PROC_WAITING_EDEFAULT.equals(phase2ProcWaiting);
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME:
				return PHASE2_SERVICE_TIME_EDEFAULT == null ? phase2ServiceTime != null : !PHASE2_SERVICE_TIME_EDEFAULT.equals(phase2ServiceTime);
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE2_SERVICE_TIME_VARIANCE:
				return PHASE2_SERVICE_TIME_VARIANCE_EDEFAULT == null ? phase2ServiceTimeVariance != null : !PHASE2_SERVICE_TIME_VARIANCE_EDEFAULT.equals(phase2ServiceTimeVariance);
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE2_UTILIZATION:
				return PHASE2_UTILIZATION_EDEFAULT == null ? phase2Utilization != null : !PHASE2_UTILIZATION_EDEFAULT.equals(phase2Utilization);
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE3_PROC_WAITING:
				return PHASE3_PROC_WAITING_EDEFAULT == null ? phase3ProcWaiting != null : !PHASE3_PROC_WAITING_EDEFAULT.equals(phase3ProcWaiting);
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME:
				return PHASE3_SERVICE_TIME_EDEFAULT == null ? phase3ServiceTime != null : !PHASE3_SERVICE_TIME_EDEFAULT.equals(phase3ServiceTime);
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE3_SERVICE_TIME_VARIANCE:
				return PHASE3_SERVICE_TIME_VARIANCE_EDEFAULT == null ? phase3ServiceTimeVariance != null : !PHASE3_SERVICE_TIME_VARIANCE_EDEFAULT.equals(phase3ServiceTimeVariance);
			case LQNPackage.OUTPUT_RESULT_TYPE__PHASE3_UTILIZATION:
				return PHASE3_UTILIZATION_EDEFAULT == null ? phase3Utilization != null : !PHASE3_UTILIZATION_EDEFAULT.equals(phase3Utilization);
			case LQNPackage.OUTPUT_RESULT_TYPE__PROB_EXCEED_MAX_SERVICE_TIME:
				return PROB_EXCEED_MAX_SERVICE_TIME_EDEFAULT == null ? probExceedMaxServiceTime != null : !PROB_EXCEED_MAX_SERVICE_TIME_EDEFAULT.equals(probExceedMaxServiceTime);
			case LQNPackage.OUTPUT_RESULT_TYPE__PROC_UTILIZATION:
				return PROC_UTILIZATION_EDEFAULT == null ? procUtilization != null : !PROC_UTILIZATION_EDEFAULT.equals(procUtilization);
			case LQNPackage.OUTPUT_RESULT_TYPE__PROC_WAITING:
				return PROC_WAITING_EDEFAULT == null ? procWaiting != null : !PROC_WAITING_EDEFAULT.equals(procWaiting);
			case LQNPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME:
				return SERVICE_TIME_EDEFAULT == null ? serviceTime != null : !SERVICE_TIME_EDEFAULT.equals(serviceTime);
			case LQNPackage.OUTPUT_RESULT_TYPE__SERVICE_TIME_VARIANCE:
				return SERVICE_TIME_VARIANCE_EDEFAULT == null ? serviceTimeVariance != null : !SERVICE_TIME_VARIANCE_EDEFAULT.equals(serviceTimeVariance);
			case LQNPackage.OUTPUT_RESULT_TYPE__SQUARED_COEFF_VARIATION:
				return SQUARED_COEFF_VARIATION_EDEFAULT == null ? squaredCoeffVariation != null : !SQUARED_COEFF_VARIATION_EDEFAULT.equals(squaredCoeffVariation);
			case LQNPackage.OUTPUT_RESULT_TYPE__THROUGHPUT:
				return THROUGHPUT_EDEFAULT == null ? throughput != null : !THROUGHPUT_EDEFAULT.equals(throughput);
			case LQNPackage.OUTPUT_RESULT_TYPE__THROUGHPUT_BOUND:
				return THROUGHPUT_BOUND_EDEFAULT == null ? throughputBound != null : !THROUGHPUT_BOUND_EDEFAULT.equals(throughputBound);
			case LQNPackage.OUTPUT_RESULT_TYPE__UTILIZATION:
				return UTILIZATION_EDEFAULT == null ? utilization != null : !UTILIZATION_EDEFAULT.equals(utilization);
			case LQNPackage.OUTPUT_RESULT_TYPE__WAITING:
				return WAITING_EDEFAULT == null ? waiting != null : !WAITING_EDEFAULT.equals(waiting);
			case LQNPackage.OUTPUT_RESULT_TYPE__WAITING_VARIANCE:
				return WAITING_VARIANCE_EDEFAULT == null ? waitingVariance != null : !WAITING_VARIANCE_EDEFAULT.equals(waitingVariance);
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
		result.append(" (openWaitTime: ");
		result.append(openWaitTime);
		result.append(", phase1ProcWaiting: ");
		result.append(phase1ProcWaiting);
		result.append(", phase1ServiceTime: ");
		result.append(phase1ServiceTime);
		result.append(", phase1ServiceTimeVariance: ");
		result.append(phase1ServiceTimeVariance);
		result.append(", phase1Utilization: ");
		result.append(phase1Utilization);
		result.append(", phase2ProcWaiting: ");
		result.append(phase2ProcWaiting);
		result.append(", phase2ServiceTime: ");
		result.append(phase2ServiceTime);
		result.append(", phase2ServiceTimeVariance: ");
		result.append(phase2ServiceTimeVariance);
		result.append(", phase2Utilization: ");
		result.append(phase2Utilization);
		result.append(", phase3ProcWaiting: ");
		result.append(phase3ProcWaiting);
		result.append(", phase3ServiceTime: ");
		result.append(phase3ServiceTime);
		result.append(", phase3ServiceTimeVariance: ");
		result.append(phase3ServiceTimeVariance);
		result.append(", phase3Utilization: ");
		result.append(phase3Utilization);
		result.append(", probExceedMaxServiceTime: ");
		result.append(probExceedMaxServiceTime);
		result.append(", procUtilization: ");
		result.append(procUtilization);
		result.append(", procWaiting: ");
		result.append(procWaiting);
		result.append(", serviceTime: ");
		result.append(serviceTime);
		result.append(", serviceTimeVariance: ");
		result.append(serviceTimeVariance);
		result.append(", squaredCoeffVariation: ");
		result.append(squaredCoeffVariation);
		result.append(", throughput: ");
		result.append(throughput);
		result.append(", throughputBound: ");
		result.append(throughputBound);
		result.append(", utilization: ");
		result.append(utilization);
		result.append(", waiting: ");
		result.append(waiting);
		result.append(", waitingVariance: ");
		result.append(waitingVariance);
		result.append(')');
		return result.toString();
	}

} //OutputResultTypeImpl
