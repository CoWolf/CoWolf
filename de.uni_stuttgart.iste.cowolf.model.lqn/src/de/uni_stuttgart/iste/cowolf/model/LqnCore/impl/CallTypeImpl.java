/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.impl;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.CallType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.CallTypeImpl#getDest <em>Dest</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.CallTypeImpl#getFanin <em>Fanin</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.CallTypeImpl#getFanout <em>Fanout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CallTypeImpl extends IDBaseImpl implements CallType {
	/**
	 * The cached value of the '{@link #getDest() <em>Dest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDest()
	 * @generated
	 * @ordered
	 */
	protected EntryType dest;

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
	protected CallTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LQNPackage.Literals.CALL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryType getDest() {
		if (dest != null && dest.eIsProxy()) {
			InternalEObject oldDest = (InternalEObject)dest;
			dest = (EntryType)eResolveProxy(oldDest);
			if (dest != oldDest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LQNPackage.CALL_TYPE__DEST, oldDest, dest));
			}
		}
		return dest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryType basicGetDest() {
		return dest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDest(EntryType newDest) {
		EntryType oldDest = dest;
		dest = newDest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.CALL_TYPE__DEST, oldDest, dest));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.CALL_TYPE__FANIN, oldFanin, fanin, !oldFaninESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, LQNPackage.CALL_TYPE__FANIN, oldFanin, FANIN_EDEFAULT, oldFaninESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.CALL_TYPE__FANOUT, oldFanout, fanout, !oldFanoutESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, LQNPackage.CALL_TYPE__FANOUT, oldFanout, FANOUT_EDEFAULT, oldFanoutESet));
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
			case LQNPackage.CALL_TYPE__DEST:
				if (resolve) return getDest();
				return basicGetDest();
			case LQNPackage.CALL_TYPE__FANIN:
				return getFanin();
			case LQNPackage.CALL_TYPE__FANOUT:
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
			case LQNPackage.CALL_TYPE__DEST:
				setDest((EntryType)newValue);
				return;
			case LQNPackage.CALL_TYPE__FANIN:
				setFanin((Integer)newValue);
				return;
			case LQNPackage.CALL_TYPE__FANOUT:
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
			case LQNPackage.CALL_TYPE__DEST:
				setDest((EntryType)null);
				return;
			case LQNPackage.CALL_TYPE__FANIN:
				unsetFanin();
				return;
			case LQNPackage.CALL_TYPE__FANOUT:
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
			case LQNPackage.CALL_TYPE__DEST:
				return dest != null;
			case LQNPackage.CALL_TYPE__FANIN:
				return isSetFanin();
			case LQNPackage.CALL_TYPE__FANOUT:
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
		result.append(" (fanin: ");
		if (faninESet) result.append(fanin); else result.append("<unset>");
		result.append(", fanout: ");
		if (fanoutESet) result.append(fanout); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CallTypeImpl
