/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.impl;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.ResultGeneralType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.ValidType;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result General Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultGeneralTypeImpl#getConvVal <em>Conv Val</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultGeneralTypeImpl#getElapsedTime <em>Elapsed Time</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultGeneralTypeImpl#getIterations <em>Iterations</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultGeneralTypeImpl#getPlatformInfo <em>Platform Info</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultGeneralTypeImpl#getSolverInfo <em>Solver Info</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultGeneralTypeImpl#getSystemCpuTime <em>System Cpu Time</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultGeneralTypeImpl#getUserCpuTime <em>User Cpu Time</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ResultGeneralTypeImpl#getValid <em>Valid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultGeneralTypeImpl extends IDBaseImpl implements ResultGeneralType {
	/**
	 * The default value of the '{@link #getConvVal() <em>Conv Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvVal()
	 * @generated
	 * @ordered
	 */
	protected static final Object CONV_VAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConvVal() <em>Conv Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvVal()
	 * @generated
	 * @ordered
	 */
	protected Object convVal = CONV_VAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getElapsedTime() <em>Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElapsedTime()
	 * @generated
	 * @ordered
	 */
	protected static final String ELAPSED_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElapsedTime() <em>Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElapsedTime()
	 * @generated
	 * @ordered
	 */
	protected String elapsedTime = ELAPSED_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIterations() <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterations()
	 * @generated
	 * @ordered
	 */
	protected static final Object ITERATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIterations() <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterations()
	 * @generated
	 * @ordered
	 */
	protected Object iterations = ITERATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlatformInfo() <em>Platform Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String PLATFORM_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlatformInfo() <em>Platform Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformInfo()
	 * @generated
	 * @ordered
	 */
	protected String platformInfo = PLATFORM_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolverInfo() <em>Solver Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolverInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLVER_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolverInfo() <em>Solver Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolverInfo()
	 * @generated
	 * @ordered
	 */
	protected String solverInfo = SOLVER_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemCpuTime() <em>System Cpu Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCpuTime()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_CPU_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemCpuTime() <em>System Cpu Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCpuTime()
	 * @generated
	 * @ordered
	 */
	protected String systemCpuTime = SYSTEM_CPU_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserCpuTime() <em>User Cpu Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserCpuTime()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_CPU_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserCpuTime() <em>User Cpu Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserCpuTime()
	 * @generated
	 * @ordered
	 */
	protected String userCpuTime = USER_CPU_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValid() <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValid()
	 * @generated
	 * @ordered
	 */
	protected static final ValidType VALID_EDEFAULT = ValidType.YES;

	/**
	 * The cached value of the '{@link #getValid() <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValid()
	 * @generated
	 * @ordered
	 */
	protected ValidType valid = VALID_EDEFAULT;

	/**
	 * This is true if the Valid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean validESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultGeneralTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LQNPackage.Literals.RESULT_GENERAL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getConvVal() {
		return convVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConvVal(Object newConvVal) {
		Object oldConvVal = convVal;
		convVal = newConvVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.RESULT_GENERAL_TYPE__CONV_VAL, oldConvVal, convVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElapsedTime() {
		return elapsedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElapsedTime(String newElapsedTime) {
		String oldElapsedTime = elapsedTime;
		elapsedTime = newElapsedTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.RESULT_GENERAL_TYPE__ELAPSED_TIME, oldElapsedTime, elapsedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getIterations() {
		return iterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterations(Object newIterations) {
		Object oldIterations = iterations;
		iterations = newIterations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.RESULT_GENERAL_TYPE__ITERATIONS, oldIterations, iterations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlatformInfo() {
		return platformInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatformInfo(String newPlatformInfo) {
		String oldPlatformInfo = platformInfo;
		platformInfo = newPlatformInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.RESULT_GENERAL_TYPE__PLATFORM_INFO, oldPlatformInfo, platformInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolverInfo() {
		return solverInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolverInfo(String newSolverInfo) {
		String oldSolverInfo = solverInfo;
		solverInfo = newSolverInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.RESULT_GENERAL_TYPE__SOLVER_INFO, oldSolverInfo, solverInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemCpuTime() {
		return systemCpuTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemCpuTime(String newSystemCpuTime) {
		String oldSystemCpuTime = systemCpuTime;
		systemCpuTime = newSystemCpuTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME, oldSystemCpuTime, systemCpuTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserCpuTime() {
		return userCpuTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserCpuTime(String newUserCpuTime) {
		String oldUserCpuTime = userCpuTime;
		userCpuTime = newUserCpuTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.RESULT_GENERAL_TYPE__USER_CPU_TIME, oldUserCpuTime, userCpuTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidType getValid() {
		return valid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValid(ValidType newValid) {
		ValidType oldValid = valid;
		valid = newValid == null ? VALID_EDEFAULT : newValid;
		boolean oldValidESet = validESet;
		validESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.RESULT_GENERAL_TYPE__VALID, oldValid, valid, !oldValidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValid() {
		ValidType oldValid = valid;
		boolean oldValidESet = validESet;
		valid = VALID_EDEFAULT;
		validESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LQNPackage.RESULT_GENERAL_TYPE__VALID, oldValid, VALID_EDEFAULT, oldValidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValid() {
		return validESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LQNPackage.RESULT_GENERAL_TYPE__CONV_VAL:
				return getConvVal();
			case LQNPackage.RESULT_GENERAL_TYPE__ELAPSED_TIME:
				return getElapsedTime();
			case LQNPackage.RESULT_GENERAL_TYPE__ITERATIONS:
				return getIterations();
			case LQNPackage.RESULT_GENERAL_TYPE__PLATFORM_INFO:
				return getPlatformInfo();
			case LQNPackage.RESULT_GENERAL_TYPE__SOLVER_INFO:
				return getSolverInfo();
			case LQNPackage.RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME:
				return getSystemCpuTime();
			case LQNPackage.RESULT_GENERAL_TYPE__USER_CPU_TIME:
				return getUserCpuTime();
			case LQNPackage.RESULT_GENERAL_TYPE__VALID:
				return getValid();
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
			case LQNPackage.RESULT_GENERAL_TYPE__CONV_VAL:
				setConvVal(newValue);
				return;
			case LQNPackage.RESULT_GENERAL_TYPE__ELAPSED_TIME:
				setElapsedTime((String)newValue);
				return;
			case LQNPackage.RESULT_GENERAL_TYPE__ITERATIONS:
				setIterations(newValue);
				return;
			case LQNPackage.RESULT_GENERAL_TYPE__PLATFORM_INFO:
				setPlatformInfo((String)newValue);
				return;
			case LQNPackage.RESULT_GENERAL_TYPE__SOLVER_INFO:
				setSolverInfo((String)newValue);
				return;
			case LQNPackage.RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME:
				setSystemCpuTime((String)newValue);
				return;
			case LQNPackage.RESULT_GENERAL_TYPE__USER_CPU_TIME:
				setUserCpuTime((String)newValue);
				return;
			case LQNPackage.RESULT_GENERAL_TYPE__VALID:
				setValid((ValidType)newValue);
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
			case LQNPackage.RESULT_GENERAL_TYPE__CONV_VAL:
				setConvVal(CONV_VAL_EDEFAULT);
				return;
			case LQNPackage.RESULT_GENERAL_TYPE__ELAPSED_TIME:
				setElapsedTime(ELAPSED_TIME_EDEFAULT);
				return;
			case LQNPackage.RESULT_GENERAL_TYPE__ITERATIONS:
				setIterations(ITERATIONS_EDEFAULT);
				return;
			case LQNPackage.RESULT_GENERAL_TYPE__PLATFORM_INFO:
				setPlatformInfo(PLATFORM_INFO_EDEFAULT);
				return;
			case LQNPackage.RESULT_GENERAL_TYPE__SOLVER_INFO:
				setSolverInfo(SOLVER_INFO_EDEFAULT);
				return;
			case LQNPackage.RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME:
				setSystemCpuTime(SYSTEM_CPU_TIME_EDEFAULT);
				return;
			case LQNPackage.RESULT_GENERAL_TYPE__USER_CPU_TIME:
				setUserCpuTime(USER_CPU_TIME_EDEFAULT);
				return;
			case LQNPackage.RESULT_GENERAL_TYPE__VALID:
				unsetValid();
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
			case LQNPackage.RESULT_GENERAL_TYPE__CONV_VAL:
				return CONV_VAL_EDEFAULT == null ? convVal != null : !CONV_VAL_EDEFAULT.equals(convVal);
			case LQNPackage.RESULT_GENERAL_TYPE__ELAPSED_TIME:
				return ELAPSED_TIME_EDEFAULT == null ? elapsedTime != null : !ELAPSED_TIME_EDEFAULT.equals(elapsedTime);
			case LQNPackage.RESULT_GENERAL_TYPE__ITERATIONS:
				return ITERATIONS_EDEFAULT == null ? iterations != null : !ITERATIONS_EDEFAULT.equals(iterations);
			case LQNPackage.RESULT_GENERAL_TYPE__PLATFORM_INFO:
				return PLATFORM_INFO_EDEFAULT == null ? platformInfo != null : !PLATFORM_INFO_EDEFAULT.equals(platformInfo);
			case LQNPackage.RESULT_GENERAL_TYPE__SOLVER_INFO:
				return SOLVER_INFO_EDEFAULT == null ? solverInfo != null : !SOLVER_INFO_EDEFAULT.equals(solverInfo);
			case LQNPackage.RESULT_GENERAL_TYPE__SYSTEM_CPU_TIME:
				return SYSTEM_CPU_TIME_EDEFAULT == null ? systemCpuTime != null : !SYSTEM_CPU_TIME_EDEFAULT.equals(systemCpuTime);
			case LQNPackage.RESULT_GENERAL_TYPE__USER_CPU_TIME:
				return USER_CPU_TIME_EDEFAULT == null ? userCpuTime != null : !USER_CPU_TIME_EDEFAULT.equals(userCpuTime);
			case LQNPackage.RESULT_GENERAL_TYPE__VALID:
				return isSetValid();
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
		result.append(" (convVal: ");
		result.append(convVal);
		result.append(", elapsedTime: ");
		result.append(elapsedTime);
		result.append(", iterations: ");
		result.append(iterations);
		result.append(", platformInfo: ");
		result.append(platformInfo);
		result.append(", solverInfo: ");
		result.append(solverInfo);
		result.append(", systemCpuTime: ");
		result.append(systemCpuTime);
		result.append(", userCpuTime: ");
		result.append(userCpuTime);
		result.append(", valid: ");
		if (validESet) result.append(valid); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ResultGeneralTypeImpl
