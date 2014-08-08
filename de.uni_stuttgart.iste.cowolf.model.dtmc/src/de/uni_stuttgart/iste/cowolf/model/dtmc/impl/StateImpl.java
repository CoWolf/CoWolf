/**
 */
package de.uni_stuttgart.iste.cowolf.model.dtmc.impl;

import de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCemfPackage;
import de.uni_stuttgart.iste.cowolf.model.dtmc.Parameter;
import de.uni_stuttgart.iste.cowolf.model.dtmc.State;
import de.uni_stuttgart.iste.cowolf.model.dtmc.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.dtmc.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.dtmc.impl.StateImpl#isIsStart <em>Is Start</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.dtmc.impl.StateImpl#isIsEnd <em>Is End</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.dtmc.impl.StateImpl#isIsFail <em>Is Fail</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.dtmc.impl.StateImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.dtmc.impl.StateImpl#getOutGoing <em>Out Going</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.dtmc.impl.StateImpl#getFormalParam <em>Formal Param</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
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
	 * The default value of the '{@link #isIsStart() <em>Is Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_START_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStart() <em>Is Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStart()
	 * @generated
	 * @ordered
	 */
	protected boolean isStart = IS_START_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsEnd() <em>Is End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_END_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEnd() <em>Is End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnd()
	 * @generated
	 * @ordered
	 */
	protected boolean isEnd = IS_END_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFail() <em>Is Fail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFail()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FAIL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFail() <em>Is Fail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFail()
	 * @generated
	 * @ordered
	 */
	protected boolean isFail = IS_FAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incoming;

	/**
	 * The cached value of the '{@link #getOutGoing() <em>Out Going</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutGoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outGoing;

	/**
	 * The cached value of the '{@link #getFormalParam() <em>Formal Param</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalParam()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> formalParam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DTMCemfPackage.Literals.STATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DTMCemfPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStart() {
		return isStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStart(boolean newIsStart) {
		boolean oldIsStart = isStart;
		isStart = newIsStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTMCemfPackage.STATE__IS_START, oldIsStart, isStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEnd() {
		return isEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEnd(boolean newIsEnd) {
		boolean oldIsEnd = isEnd;
		isEnd = newIsEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTMCemfPackage.STATE__IS_END, oldIsEnd, isEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFail() {
		return isFail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFail(boolean newIsFail) {
		boolean oldIsFail = isFail;
		isFail = newIsFail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTMCemfPackage.STATE__IS_FAIL, oldIsFail, isFail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, DTMCemfPackage.STATE__INCOMING, DTMCemfPackage.TRANSITION__TO);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutGoing() {
		if (outGoing == null) {
			outGoing = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, DTMCemfPackage.STATE__OUT_GOING, DTMCemfPackage.TRANSITION__FROM);
		}
		return outGoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getFormalParam() {
		if (formalParam == null) {
			formalParam = new EObjectWithInverseResolvingEList<Parameter>(Parameter.class, this, DTMCemfPackage.STATE__FORMAL_PARAM, DTMCemfPackage.PARAMETER__STATE);
		}
		return formalParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DTMCemfPackage.STATE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case DTMCemfPackage.STATE__OUT_GOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutGoing()).basicAdd(otherEnd, msgs);
			case DTMCemfPackage.STATE__FORMAL_PARAM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFormalParam()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DTMCemfPackage.STATE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case DTMCemfPackage.STATE__OUT_GOING:
				return ((InternalEList<?>)getOutGoing()).basicRemove(otherEnd, msgs);
			case DTMCemfPackage.STATE__FORMAL_PARAM:
				return ((InternalEList<?>)getFormalParam()).basicRemove(otherEnd, msgs);
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
			case DTMCemfPackage.STATE__NAME:
				return getName();
			case DTMCemfPackage.STATE__IS_START:
				return isIsStart();
			case DTMCemfPackage.STATE__IS_END:
				return isIsEnd();
			case DTMCemfPackage.STATE__IS_FAIL:
				return isIsFail();
			case DTMCemfPackage.STATE__INCOMING:
				return getIncoming();
			case DTMCemfPackage.STATE__OUT_GOING:
				return getOutGoing();
			case DTMCemfPackage.STATE__FORMAL_PARAM:
				return getFormalParam();
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
			case DTMCemfPackage.STATE__NAME:
				setName((String)newValue);
				return;
			case DTMCemfPackage.STATE__IS_START:
				setIsStart((Boolean)newValue);
				return;
			case DTMCemfPackage.STATE__IS_END:
				setIsEnd((Boolean)newValue);
				return;
			case DTMCemfPackage.STATE__IS_FAIL:
				setIsFail((Boolean)newValue);
				return;
			case DTMCemfPackage.STATE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends Transition>)newValue);
				return;
			case DTMCemfPackage.STATE__OUT_GOING:
				getOutGoing().clear();
				getOutGoing().addAll((Collection<? extends Transition>)newValue);
				return;
			case DTMCemfPackage.STATE__FORMAL_PARAM:
				getFormalParam().clear();
				getFormalParam().addAll((Collection<? extends Parameter>)newValue);
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
			case DTMCemfPackage.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DTMCemfPackage.STATE__IS_START:
				setIsStart(IS_START_EDEFAULT);
				return;
			case DTMCemfPackage.STATE__IS_END:
				setIsEnd(IS_END_EDEFAULT);
				return;
			case DTMCemfPackage.STATE__IS_FAIL:
				setIsFail(IS_FAIL_EDEFAULT);
				return;
			case DTMCemfPackage.STATE__INCOMING:
				getIncoming().clear();
				return;
			case DTMCemfPackage.STATE__OUT_GOING:
				getOutGoing().clear();
				return;
			case DTMCemfPackage.STATE__FORMAL_PARAM:
				getFormalParam().clear();
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
			case DTMCemfPackage.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DTMCemfPackage.STATE__IS_START:
				return isStart != IS_START_EDEFAULT;
			case DTMCemfPackage.STATE__IS_END:
				return isEnd != IS_END_EDEFAULT;
			case DTMCemfPackage.STATE__IS_FAIL:
				return isFail != IS_FAIL_EDEFAULT;
			case DTMCemfPackage.STATE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case DTMCemfPackage.STATE__OUT_GOING:
				return outGoing != null && !outGoing.isEmpty();
			case DTMCemfPackage.STATE__FORMAL_PARAM:
				return formalParam != null && !formalParam.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", isStart: ");
		result.append(isStart);
		result.append(", isEnd: ");
		result.append(isEnd);
		result.append(", isFail: ");
		result.append(isFail);
		result.append(')');
		return result.toString();
	}

} //StateImpl
