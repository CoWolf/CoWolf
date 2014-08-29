/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.impl;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.HistogramBinType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Histogram Bin Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.HistogramBinTypeImpl#getBegin <em>Begin</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.HistogramBinTypeImpl#getConf95 <em>Conf95</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.HistogramBinTypeImpl#getConf99 <em>Conf99</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.HistogramBinTypeImpl#getEnd <em>End</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.HistogramBinTypeImpl#getProb <em>Prob</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HistogramBinTypeImpl extends IDBaseImpl implements HistogramBinType {
	/**
	 * The default value of the '{@link #getBegin() <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegin()
	 * @generated
	 * @ordered
	 */
	protected static final Object BEGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBegin() <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegin()
	 * @generated
	 * @ordered
	 */
	protected Object begin = BEGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getConf95() <em>Conf95</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConf95()
	 * @generated
	 * @ordered
	 */
	protected static final Object CONF95_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConf95() <em>Conf95</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConf95()
	 * @generated
	 * @ordered
	 */
	protected Object conf95 = CONF95_EDEFAULT;

	/**
	 * The default value of the '{@link #getConf99() <em>Conf99</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConf99()
	 * @generated
	 * @ordered
	 */
	protected static final Object CONF99_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConf99() <em>Conf99</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConf99()
	 * @generated
	 * @ordered
	 */
	protected Object conf99 = CONF99_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Object END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Object end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #getProb() <em>Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProb()
	 * @generated
	 * @ordered
	 */
	protected static final Object PROB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProb() <em>Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProb()
	 * @generated
	 * @ordered
	 */
	protected Object prob = PROB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistogramBinTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LQNPackage.Literals.HISTOGRAM_BIN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBegin() {
		return begin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBegin(Object newBegin) {
		Object oldBegin = begin;
		begin = newBegin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.HISTOGRAM_BIN_TYPE__BEGIN, oldBegin, begin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getConf95() {
		return conf95;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConf95(Object newConf95) {
		Object oldConf95 = conf95;
		conf95 = newConf95;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.HISTOGRAM_BIN_TYPE__CONF95, oldConf95, conf95));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getConf99() {
		return conf99;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConf99(Object newConf99) {
		Object oldConf99 = conf99;
		conf99 = newConf99;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.HISTOGRAM_BIN_TYPE__CONF99, oldConf99, conf99));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Object newEnd) {
		Object oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.HISTOGRAM_BIN_TYPE__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getProb() {
		return prob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProb(Object newProb) {
		Object oldProb = prob;
		prob = newProb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.HISTOGRAM_BIN_TYPE__PROB, oldProb, prob));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LQNPackage.HISTOGRAM_BIN_TYPE__BEGIN:
				return getBegin();
			case LQNPackage.HISTOGRAM_BIN_TYPE__CONF95:
				return getConf95();
			case LQNPackage.HISTOGRAM_BIN_TYPE__CONF99:
				return getConf99();
			case LQNPackage.HISTOGRAM_BIN_TYPE__END:
				return getEnd();
			case LQNPackage.HISTOGRAM_BIN_TYPE__PROB:
				return getProb();
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
			case LQNPackage.HISTOGRAM_BIN_TYPE__BEGIN:
				setBegin(newValue);
				return;
			case LQNPackage.HISTOGRAM_BIN_TYPE__CONF95:
				setConf95(newValue);
				return;
			case LQNPackage.HISTOGRAM_BIN_TYPE__CONF99:
				setConf99(newValue);
				return;
			case LQNPackage.HISTOGRAM_BIN_TYPE__END:
				setEnd(newValue);
				return;
			case LQNPackage.HISTOGRAM_BIN_TYPE__PROB:
				setProb(newValue);
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
			case LQNPackage.HISTOGRAM_BIN_TYPE__BEGIN:
				setBegin(BEGIN_EDEFAULT);
				return;
			case LQNPackage.HISTOGRAM_BIN_TYPE__CONF95:
				setConf95(CONF95_EDEFAULT);
				return;
			case LQNPackage.HISTOGRAM_BIN_TYPE__CONF99:
				setConf99(CONF99_EDEFAULT);
				return;
			case LQNPackage.HISTOGRAM_BIN_TYPE__END:
				setEnd(END_EDEFAULT);
				return;
			case LQNPackage.HISTOGRAM_BIN_TYPE__PROB:
				setProb(PROB_EDEFAULT);
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
			case LQNPackage.HISTOGRAM_BIN_TYPE__BEGIN:
				return BEGIN_EDEFAULT == null ? begin != null : !BEGIN_EDEFAULT.equals(begin);
			case LQNPackage.HISTOGRAM_BIN_TYPE__CONF95:
				return CONF95_EDEFAULT == null ? conf95 != null : !CONF95_EDEFAULT.equals(conf95);
			case LQNPackage.HISTOGRAM_BIN_TYPE__CONF99:
				return CONF99_EDEFAULT == null ? conf99 != null : !CONF99_EDEFAULT.equals(conf99);
			case LQNPackage.HISTOGRAM_BIN_TYPE__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case LQNPackage.HISTOGRAM_BIN_TYPE__PROB:
				return PROB_EDEFAULT == null ? prob != null : !PROB_EDEFAULT.equals(prob);
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
		result.append(" (begin: ");
		result.append(begin);
		result.append(", conf95: ");
		result.append(conf95);
		result.append(", conf99: ");
		result.append(conf99);
		result.append(", end: ");
		result.append(end);
		result.append(", prob: ");
		result.append(prob);
		result.append(')');
		return result.toString();
	}

} //HistogramBinTypeImpl
