/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.impl;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityMakingCallType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.CallListType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;
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
 * An implementation of the model object '<em><b>Activity Def Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityDefTypeImpl#getCallList <em>Call List</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityDefTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityDefTypeImpl#getSynchCall <em>Synch Call</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityDefTypeImpl#getAsynchCall <em>Asynch Call</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityDefTypeImpl#getBountToType <em>Bount To Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityDefTypeImpl extends ActivityDefBaseImpl implements ActivityDefType {
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
	 * The default value of the '{@link #getBountToType() <em>Bount To Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBountToType()
	 * @generated
	 * @ordered
	 */
	protected static final String BOUNT_TO_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBountToType() <em>Bount To Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBountToType()
	 * @generated
	 * @ordered
	 */
	protected String bountToType = BOUNT_TO_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityDefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LQNPackage.Literals.ACTIVITY_DEF_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallListType> getCallList() {
		if (callList == null) {
			callList = new EObjectContainmentEList<CallListType>(CallListType.class, this, LQNPackage.ACTIVITY_DEF_TYPE__CALL_LIST);
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
			group = new BasicFeatureMap(this, LQNPackage.ACTIVITY_DEF_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityMakingCallType> getSynchCall() {
		return getGroup().list(LQNPackage.Literals.ACTIVITY_DEF_TYPE__SYNCH_CALL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityMakingCallType> getAsynchCall() {
		return getGroup().list(LQNPackage.Literals.ACTIVITY_DEF_TYPE__ASYNCH_CALL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBountToType() {
		return bountToType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBountToType(String newBountToType) {
		String oldBountToType = bountToType;
		bountToType = newBountToType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.ACTIVITY_DEF_TYPE__BOUNT_TO_TYPE, oldBountToType, bountToType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LQNPackage.ACTIVITY_DEF_TYPE__CALL_LIST:
				return ((InternalEList<?>)getCallList()).basicRemove(otherEnd, msgs);
			case LQNPackage.ACTIVITY_DEF_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case LQNPackage.ACTIVITY_DEF_TYPE__SYNCH_CALL:
				return ((InternalEList<?>)getSynchCall()).basicRemove(otherEnd, msgs);
			case LQNPackage.ACTIVITY_DEF_TYPE__ASYNCH_CALL:
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
			case LQNPackage.ACTIVITY_DEF_TYPE__CALL_LIST:
				return getCallList();
			case LQNPackage.ACTIVITY_DEF_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case LQNPackage.ACTIVITY_DEF_TYPE__SYNCH_CALL:
				return getSynchCall();
			case LQNPackage.ACTIVITY_DEF_TYPE__ASYNCH_CALL:
				return getAsynchCall();
			case LQNPackage.ACTIVITY_DEF_TYPE__BOUNT_TO_TYPE:
				return getBountToType();
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
			case LQNPackage.ACTIVITY_DEF_TYPE__CALL_LIST:
				getCallList().clear();
				getCallList().addAll((Collection<? extends CallListType>)newValue);
				return;
			case LQNPackage.ACTIVITY_DEF_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case LQNPackage.ACTIVITY_DEF_TYPE__SYNCH_CALL:
				getSynchCall().clear();
				getSynchCall().addAll((Collection<? extends ActivityMakingCallType>)newValue);
				return;
			case LQNPackage.ACTIVITY_DEF_TYPE__ASYNCH_CALL:
				getAsynchCall().clear();
				getAsynchCall().addAll((Collection<? extends ActivityMakingCallType>)newValue);
				return;
			case LQNPackage.ACTIVITY_DEF_TYPE__BOUNT_TO_TYPE:
				setBountToType((String)newValue);
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
			case LQNPackage.ACTIVITY_DEF_TYPE__CALL_LIST:
				getCallList().clear();
				return;
			case LQNPackage.ACTIVITY_DEF_TYPE__GROUP:
				getGroup().clear();
				return;
			case LQNPackage.ACTIVITY_DEF_TYPE__SYNCH_CALL:
				getSynchCall().clear();
				return;
			case LQNPackage.ACTIVITY_DEF_TYPE__ASYNCH_CALL:
				getAsynchCall().clear();
				return;
			case LQNPackage.ACTIVITY_DEF_TYPE__BOUNT_TO_TYPE:
				setBountToType(BOUNT_TO_TYPE_EDEFAULT);
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
			case LQNPackage.ACTIVITY_DEF_TYPE__CALL_LIST:
				return callList != null && !callList.isEmpty();
			case LQNPackage.ACTIVITY_DEF_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case LQNPackage.ACTIVITY_DEF_TYPE__SYNCH_CALL:
				return !getSynchCall().isEmpty();
			case LQNPackage.ACTIVITY_DEF_TYPE__ASYNCH_CALL:
				return !getAsynchCall().isEmpty();
			case LQNPackage.ACTIVITY_DEF_TYPE__BOUNT_TO_TYPE:
				return BOUNT_TO_TYPE_EDEFAULT == null ? bountToType != null : !BOUNT_TO_TYPE_EDEFAULT.equals(bountToType);
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
		result.append(", bountToType: ");
		result.append(bountToType);
		result.append(')');
		return result.toString();
	}

} //ActivityDefTypeImpl
