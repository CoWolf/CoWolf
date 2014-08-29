/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.impl;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.ParaType;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Para Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ParaTypeImpl#getStartValue <em>Start Value</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ParaTypeImpl#getEndValue <em>End Value</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ParaTypeImpl#getStepValue <em>Step Value</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ParaTypeImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParaTypeImpl extends IDBaseImpl implements ParaType {
	/**
	 * The default value of the '{@link #getStartValue() <em>Start Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartValue()
	 * @generated
	 * @ordered
	 */
	protected static final int START_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartValue() <em>Start Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartValue()
	 * @generated
	 * @ordered
	 */
	protected int startValue = START_VALUE_EDEFAULT;

	/**
	 * This is true if the Start Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startValueESet;

	/**
	 * The default value of the '{@link #getEndValue() <em>End Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndValue()
	 * @generated
	 * @ordered
	 */
	protected static final int END_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEndValue() <em>End Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndValue()
	 * @generated
	 * @ordered
	 */
	protected int endValue = END_VALUE_EDEFAULT;

	/**
	 * This is true if the End Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endValueESet;

	/**
	 * The default value of the '{@link #getStepValue() <em>Step Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepValue()
	 * @generated
	 * @ordered
	 */
	protected static final int STEP_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStepValue() <em>Step Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepValue()
	 * @generated
	 * @ordered
	 */
	protected int stepValue = STEP_VALUE_EDEFAULT;

	/**
	 * This is true if the Step Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stepValueESet;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParaTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LQNPackage.Literals.PARA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartValue() {
		return startValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartValue(int newStartValue) {
		int oldStartValue = startValue;
		startValue = newStartValue;
		boolean oldStartValueESet = startValueESet;
		startValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.PARA_TYPE__START_VALUE, oldStartValue, startValue, !oldStartValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartValue() {
		int oldStartValue = startValue;
		boolean oldStartValueESet = startValueESet;
		startValue = START_VALUE_EDEFAULT;
		startValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LQNPackage.PARA_TYPE__START_VALUE, oldStartValue, START_VALUE_EDEFAULT, oldStartValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartValue() {
		return startValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEndValue() {
		return endValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndValue(int newEndValue) {
		int oldEndValue = endValue;
		endValue = newEndValue;
		boolean oldEndValueESet = endValueESet;
		endValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.PARA_TYPE__END_VALUE, oldEndValue, endValue, !oldEndValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEndValue() {
		int oldEndValue = endValue;
		boolean oldEndValueESet = endValueESet;
		endValue = END_VALUE_EDEFAULT;
		endValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LQNPackage.PARA_TYPE__END_VALUE, oldEndValue, END_VALUE_EDEFAULT, oldEndValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndValue() {
		return endValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStepValue() {
		return stepValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepValue(int newStepValue) {
		int oldStepValue = stepValue;
		stepValue = newStepValue;
		boolean oldStepValueESet = stepValueESet;
		stepValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.PARA_TYPE__STEP_VALUE, oldStepValue, stepValue, !oldStepValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStepValue() {
		int oldStepValue = stepValue;
		boolean oldStepValueESet = stepValueESet;
		stepValue = STEP_VALUE_EDEFAULT;
		stepValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LQNPackage.PARA_TYPE__STEP_VALUE, oldStepValue, STEP_VALUE_EDEFAULT, oldStepValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStepValue() {
		return stepValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getValue() {
		if (value == null) {
			value = new EDataTypeEList<Integer>(Integer.class, this, LQNPackage.PARA_TYPE__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LQNPackage.PARA_TYPE__START_VALUE:
				return getStartValue();
			case LQNPackage.PARA_TYPE__END_VALUE:
				return getEndValue();
			case LQNPackage.PARA_TYPE__STEP_VALUE:
				return getStepValue();
			case LQNPackage.PARA_TYPE__VALUE:
				return getValue();
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
			case LQNPackage.PARA_TYPE__START_VALUE:
				setStartValue((Integer)newValue);
				return;
			case LQNPackage.PARA_TYPE__END_VALUE:
				setEndValue((Integer)newValue);
				return;
			case LQNPackage.PARA_TYPE__STEP_VALUE:
				setStepValue((Integer)newValue);
				return;
			case LQNPackage.PARA_TYPE__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends Integer>)newValue);
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
			case LQNPackage.PARA_TYPE__START_VALUE:
				unsetStartValue();
				return;
			case LQNPackage.PARA_TYPE__END_VALUE:
				unsetEndValue();
				return;
			case LQNPackage.PARA_TYPE__STEP_VALUE:
				unsetStepValue();
				return;
			case LQNPackage.PARA_TYPE__VALUE:
				getValue().clear();
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
			case LQNPackage.PARA_TYPE__START_VALUE:
				return isSetStartValue();
			case LQNPackage.PARA_TYPE__END_VALUE:
				return isSetEndValue();
			case LQNPackage.PARA_TYPE__STEP_VALUE:
				return isSetStepValue();
			case LQNPackage.PARA_TYPE__VALUE:
				return value != null && !value.isEmpty();
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
		result.append(" (startValue: ");
		if (startValueESet) result.append(startValue); else result.append("<unset>");
		result.append(", endValue: ");
		if (endValueESet) result.append(endValue); else result.append("<unset>");
		result.append(", stepValue: ");
		if (stepValueESet) result.append(stepValue); else result.append("<unset>");
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ParaTypeImpl
