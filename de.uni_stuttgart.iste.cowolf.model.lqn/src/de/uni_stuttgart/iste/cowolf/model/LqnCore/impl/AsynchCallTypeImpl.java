/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.impl;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.AsynchCallType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asynch Call Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.AsynchCallTypeImpl#getDest <em>Dest</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.AsynchCallTypeImpl#getFanin <em>Fanin</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.AsynchCallTypeImpl#getFanout <em>Fanout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AsynchCallTypeImpl extends IDBaseImpl implements AsynchCallType {
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
	 * The default value of the '{@link #getFanin() <em>Fanin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFanin()
	 * @generated
	 * @ordered
	 */
	protected static final int FANIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFanin() <em>Fanin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFanin()
	 * @generated
	 * @ordered
	 */
	protected int fanin = FANIN_EDEFAULT;

	/**
	 * This is true if the Fanin attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean faninESet;

	/**
	 * The default value of the '{@link #getFanout() <em>Fanout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFanout()
	 * @generated
	 * @ordered
	 */
	protected static final int FANOUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFanout() <em>Fanout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFanout()
	 * @generated
	 * @ordered
	 */
	protected int fanout = FANOUT_EDEFAULT;

	/**
	 * This is true if the Fanout attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fanoutESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsynchCallTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LQNPackage.Literals.ASYNCH_CALL_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.ASYNCH_CALL_TYPE__DEST, oldDest, dest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFanin() {
		return fanin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFanin(int newFanin) {
		int oldFanin = fanin;
		fanin = newFanin;
		boolean oldFaninESet = faninESet;
		faninESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.ASYNCH_CALL_TYPE__FANIN, oldFanin, fanin, !oldFaninESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFanin() {
		int oldFanin = fanin;
		boolean oldFaninESet = faninESet;
		fanin = FANIN_EDEFAULT;
		faninESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LQNPackage.ASYNCH_CALL_TYPE__FANIN, oldFanin, FANIN_EDEFAULT, oldFaninESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFanin() {
		return faninESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFanout() {
		return fanout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFanout(int newFanout) {
		int oldFanout = fanout;
		fanout = newFanout;
		boolean oldFanoutESet = fanoutESet;
		fanoutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.ASYNCH_CALL_TYPE__FANOUT, oldFanout, fanout, !oldFanoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFanout() {
		int oldFanout = fanout;
		boolean oldFanoutESet = fanoutESet;
		fanout = FANOUT_EDEFAULT;
		fanoutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LQNPackage.ASYNCH_CALL_TYPE__FANOUT, oldFanout, FANOUT_EDEFAULT, oldFanoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFanout() {
		return fanoutESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LQNPackage.ASYNCH_CALL_TYPE__DEST:
				return getDest();
			case LQNPackage.ASYNCH_CALL_TYPE__FANIN:
				return getFanin();
			case LQNPackage.ASYNCH_CALL_TYPE__FANOUT:
				return getFanout();
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
			case LQNPackage.ASYNCH_CALL_TYPE__DEST:
				setDest((String)newValue);
				return;
			case LQNPackage.ASYNCH_CALL_TYPE__FANIN:
				setFanin((Integer)newValue);
				return;
			case LQNPackage.ASYNCH_CALL_TYPE__FANOUT:
				setFanout((Integer)newValue);
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
			case LQNPackage.ASYNCH_CALL_TYPE__DEST:
				setDest(DEST_EDEFAULT);
				return;
			case LQNPackage.ASYNCH_CALL_TYPE__FANIN:
				unsetFanin();
				return;
			case LQNPackage.ASYNCH_CALL_TYPE__FANOUT:
				unsetFanout();
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
			case LQNPackage.ASYNCH_CALL_TYPE__DEST:
				return DEST_EDEFAULT == null ? dest != null : !DEST_EDEFAULT.equals(dest);
			case LQNPackage.ASYNCH_CALL_TYPE__FANIN:
				return isSetFanin();
			case LQNPackage.ASYNCH_CALL_TYPE__FANOUT:
				return isSetFanout();
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
		result.append(", fanin: ");
		if (faninESet) result.append(fanin); else result.append("<unset>");
		result.append(", fanout: ");
		if (fanoutESet) result.append(fanout); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AsynchCallTypeImpl
