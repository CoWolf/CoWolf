/**
 */
package activity.impl;

import activity.Action;
import activity.ActivityPackage;
import activity.ConditionArrow;
import activity.Decision;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Arrow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activity.impl.ConditionArrowImpl#getFromDecision <em>From Decision</em>}</li>
 *   <li>{@link activity.impl.ConditionArrowImpl#getToActionFromDecision <em>To Action From Decision</em>}</li>
 *   <li>{@link activity.impl.ConditionArrowImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionArrowImpl extends MinimalEObjectImpl.Container implements ConditionArrow {
	/**
	 * The cached value of the '{@link #getFromDecision() <em>From Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDecision()
	 * @generated
	 * @ordered
	 */
	protected Decision fromDecision;

	/**
	 * The cached value of the '{@link #getToActionFromDecision() <em>To Action From Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToActionFromDecision()
	 * @generated
	 * @ordered
	 */
	protected Action toActionFromDecision;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionArrowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.CONDITION_ARROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision getFromDecision() {
		if (fromDecision != null && fromDecision.eIsProxy()) {
			InternalEObject oldFromDecision = (InternalEObject)fromDecision;
			fromDecision = (Decision)eResolveProxy(oldFromDecision);
			if (fromDecision != oldFromDecision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.CONDITION_ARROW__FROM_DECISION, oldFromDecision, fromDecision));
			}
		}
		return fromDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision basicGetFromDecision() {
		return fromDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromDecision(Decision newFromDecision, NotificationChain msgs) {
		Decision oldFromDecision = fromDecision;
		fromDecision = newFromDecision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.CONDITION_ARROW__FROM_DECISION, oldFromDecision, newFromDecision);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromDecision(Decision newFromDecision) {
		if (newFromDecision != fromDecision) {
			NotificationChain msgs = null;
			if (fromDecision != null)
				msgs = ((InternalEObject)fromDecision).eInverseRemove(this, ActivityPackage.DECISION__OUTGOING_FROM_DECISION, Decision.class, msgs);
			if (newFromDecision != null)
				msgs = ((InternalEObject)newFromDecision).eInverseAdd(this, ActivityPackage.DECISION__OUTGOING_FROM_DECISION, Decision.class, msgs);
			msgs = basicSetFromDecision(newFromDecision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.CONDITION_ARROW__FROM_DECISION, newFromDecision, newFromDecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getToActionFromDecision() {
		if (toActionFromDecision != null && toActionFromDecision.eIsProxy()) {
			InternalEObject oldToActionFromDecision = (InternalEObject)toActionFromDecision;
			toActionFromDecision = (Action)eResolveProxy(oldToActionFromDecision);
			if (toActionFromDecision != oldToActionFromDecision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.CONDITION_ARROW__TO_ACTION_FROM_DECISION, oldToActionFromDecision, toActionFromDecision));
			}
		}
		return toActionFromDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetToActionFromDecision() {
		return toActionFromDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToActionFromDecision(Action newToActionFromDecision, NotificationChain msgs) {
		Action oldToActionFromDecision = toActionFromDecision;
		toActionFromDecision = newToActionFromDecision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.CONDITION_ARROW__TO_ACTION_FROM_DECISION, oldToActionFromDecision, newToActionFromDecision);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToActionFromDecision(Action newToActionFromDecision) {
		if (newToActionFromDecision != toActionFromDecision) {
			NotificationChain msgs = null;
			if (toActionFromDecision != null)
				msgs = ((InternalEObject)toActionFromDecision).eInverseRemove(this, ActivityPackage.ACTION__INCOMING_TO_ACTION_FROM_DECISION, Action.class, msgs);
			if (newToActionFromDecision != null)
				msgs = ((InternalEObject)newToActionFromDecision).eInverseAdd(this, ActivityPackage.ACTION__INCOMING_TO_ACTION_FROM_DECISION, Action.class, msgs);
			msgs = basicSetToActionFromDecision(newToActionFromDecision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.CONDITION_ARROW__TO_ACTION_FROM_DECISION, newToActionFromDecision, newToActionFromDecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.CONDITION_ARROW__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityPackage.CONDITION_ARROW__FROM_DECISION:
				if (fromDecision != null)
					msgs = ((InternalEObject)fromDecision).eInverseRemove(this, ActivityPackage.DECISION__OUTGOING_FROM_DECISION, Decision.class, msgs);
				return basicSetFromDecision((Decision)otherEnd, msgs);
			case ActivityPackage.CONDITION_ARROW__TO_ACTION_FROM_DECISION:
				if (toActionFromDecision != null)
					msgs = ((InternalEObject)toActionFromDecision).eInverseRemove(this, ActivityPackage.ACTION__INCOMING_TO_ACTION_FROM_DECISION, Action.class, msgs);
				return basicSetToActionFromDecision((Action)otherEnd, msgs);
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
			case ActivityPackage.CONDITION_ARROW__FROM_DECISION:
				return basicSetFromDecision(null, msgs);
			case ActivityPackage.CONDITION_ARROW__TO_ACTION_FROM_DECISION:
				return basicSetToActionFromDecision(null, msgs);
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
			case ActivityPackage.CONDITION_ARROW__FROM_DECISION:
				if (resolve) return getFromDecision();
				return basicGetFromDecision();
			case ActivityPackage.CONDITION_ARROW__TO_ACTION_FROM_DECISION:
				if (resolve) return getToActionFromDecision();
				return basicGetToActionFromDecision();
			case ActivityPackage.CONDITION_ARROW__CONDITION:
				return getCondition();
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
			case ActivityPackage.CONDITION_ARROW__FROM_DECISION:
				setFromDecision((Decision)newValue);
				return;
			case ActivityPackage.CONDITION_ARROW__TO_ACTION_FROM_DECISION:
				setToActionFromDecision((Action)newValue);
				return;
			case ActivityPackage.CONDITION_ARROW__CONDITION:
				setCondition((String)newValue);
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
			case ActivityPackage.CONDITION_ARROW__FROM_DECISION:
				setFromDecision((Decision)null);
				return;
			case ActivityPackage.CONDITION_ARROW__TO_ACTION_FROM_DECISION:
				setToActionFromDecision((Action)null);
				return;
			case ActivityPackage.CONDITION_ARROW__CONDITION:
				setCondition(CONDITION_EDEFAULT);
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
			case ActivityPackage.CONDITION_ARROW__FROM_DECISION:
				return fromDecision != null;
			case ActivityPackage.CONDITION_ARROW__TO_ACTION_FROM_DECISION:
				return toActionFromDecision != null;
			case ActivityPackage.CONDITION_ARROW__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
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
		result.append(" (condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //ConditionArrowImpl
