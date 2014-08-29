/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.impl;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityMakingCallType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityPhasesType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.CallListType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Phases Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityPhasesTypeImpl#getCallList <em>Call List</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityPhasesTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityPhasesTypeImpl#getSynchCall <em>Synch Call</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityPhasesTypeImpl#getAsynchCall <em>Asynch Call</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityPhasesTypeImpl#getPhase <em>Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityPhasesTypeImpl extends ActivityDefBaseImpl implements ActivityPhasesType {
	/**
	 * The cached value of the '{@link #getCallList() <em>Call List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallList()
	 * @generated
	 * @ordered
	 */
	protected EList<CallListType> callList;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PHASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected BigInteger phase = PHASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityPhasesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LQNPackage.Literals.ACTIVITY_PHASES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallListType> getCallList() {
		if (callList == null) {
			callList = new EObjectContainmentEList<CallListType>(CallListType.class, this, LQNPackage.ACTIVITY_PHASES_TYPE__CALL_LIST);
		}
		return callList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, LQNPackage.ACTIVITY_PHASES_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityMakingCallType> getSynchCall() {
		return getGroup().list(LQNPackage.Literals.ACTIVITY_PHASES_TYPE__SYNCH_CALL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityMakingCallType> getAsynchCall() {
		return getGroup().list(LQNPackage.Literals.ACTIVITY_PHASES_TYPE__ASYNCH_CALL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPhase() {
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase(BigInteger newPhase) {
		BigInteger oldPhase = phase;
		phase = newPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.ACTIVITY_PHASES_TYPE__PHASE, oldPhase, phase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LQNPackage.ACTIVITY_PHASES_TYPE__CALL_LIST:
				return ((InternalEList<?>)getCallList()).basicRemove(otherEnd, msgs);
			case LQNPackage.ACTIVITY_PHASES_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case LQNPackage.ACTIVITY_PHASES_TYPE__SYNCH_CALL:
				return ((InternalEList<?>)getSynchCall()).basicRemove(otherEnd, msgs);
			case LQNPackage.ACTIVITY_PHASES_TYPE__ASYNCH_CALL:
				return ((InternalEList<?>)getAsynchCall()).basicRemove(otherEnd, msgs);
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
			case LQNPackage.ACTIVITY_PHASES_TYPE__CALL_LIST:
				return getCallList();
			case LQNPackage.ACTIVITY_PHASES_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case LQNPackage.ACTIVITY_PHASES_TYPE__SYNCH_CALL:
				return getSynchCall();
			case LQNPackage.ACTIVITY_PHASES_TYPE__ASYNCH_CALL:
				return getAsynchCall();
			case LQNPackage.ACTIVITY_PHASES_TYPE__PHASE:
				return getPhase();
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
			case LQNPackage.ACTIVITY_PHASES_TYPE__CALL_LIST:
				getCallList().clear();
				getCallList().addAll((Collection<? extends CallListType>)newValue);
				return;
			case LQNPackage.ACTIVITY_PHASES_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case LQNPackage.ACTIVITY_PHASES_TYPE__SYNCH_CALL:
				getSynchCall().clear();
				getSynchCall().addAll((Collection<? extends ActivityMakingCallType>)newValue);
				return;
			case LQNPackage.ACTIVITY_PHASES_TYPE__ASYNCH_CALL:
				getAsynchCall().clear();
				getAsynchCall().addAll((Collection<? extends ActivityMakingCallType>)newValue);
				return;
			case LQNPackage.ACTIVITY_PHASES_TYPE__PHASE:
				setPhase((BigInteger)newValue);
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
			case LQNPackage.ACTIVITY_PHASES_TYPE__CALL_LIST:
				getCallList().clear();
				return;
			case LQNPackage.ACTIVITY_PHASES_TYPE__GROUP:
				getGroup().clear();
				return;
			case LQNPackage.ACTIVITY_PHASES_TYPE__SYNCH_CALL:
				getSynchCall().clear();
				return;
			case LQNPackage.ACTIVITY_PHASES_TYPE__ASYNCH_CALL:
				getAsynchCall().clear();
				return;
			case LQNPackage.ACTIVITY_PHASES_TYPE__PHASE:
				setPhase(PHASE_EDEFAULT);
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
			case LQNPackage.ACTIVITY_PHASES_TYPE__CALL_LIST:
				return callList != null && !callList.isEmpty();
			case LQNPackage.ACTIVITY_PHASES_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case LQNPackage.ACTIVITY_PHASES_TYPE__SYNCH_CALL:
				return !getSynchCall().isEmpty();
			case LQNPackage.ACTIVITY_PHASES_TYPE__ASYNCH_CALL:
				return !getAsynchCall().isEmpty();
			case LQNPackage.ACTIVITY_PHASES_TYPE__PHASE:
				return PHASE_EDEFAULT == null ? phase != null : !PHASE_EDEFAULT.equals(phase);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", phase: ");
		result.append(phase);
		result.append(')');
		return result.toString();
	}

} //ActivityPhasesTypeImpl
