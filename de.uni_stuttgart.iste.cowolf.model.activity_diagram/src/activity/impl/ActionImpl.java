/**
 */
package activity.impl;

import activity.Action;
import activity.ActivityPackage;
import activity.Arrow;
import activity.ConditionArrow;

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
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activity.impl.ActionImpl#getIncomingToAction <em>Incoming To Action</em>}</li>
 *   <li>{@link activity.impl.ActionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link activity.impl.ActionImpl#getOutgoingFromActionAction <em>Outgoing From Action Action</em>}</li>
 *   <li>{@link activity.impl.ActionImpl#getIncomingToActionFromDecision <em>Incoming To Action From Decision</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action {
	/**
	 * The cached value of the '{@link #getIncomingToAction() <em>Incoming To Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingToAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Arrow> incomingToAction;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected String action = ACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutgoingFromActionAction() <em>Outgoing From Action Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingFromActionAction()
	 * @generated
	 * @ordered
	 */
	protected Arrow outgoingFromActionAction;

	/**
	 * The cached value of the '{@link #getIncomingToActionFromDecision() <em>Incoming To Action From Decision</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingToActionFromDecision()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionArrow> incomingToActionFromDecision;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arrow> getIncomingToAction() {
		if (incomingToAction == null) {
			incomingToAction = new EObjectWithInverseResolvingEList<Arrow>(Arrow.class, this, ActivityPackage.ACTION__INCOMING_TO_ACTION, ActivityPackage.ARROW__TO_ACTION);
		}
		return incomingToAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(String newAction) {
		String oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTION__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arrow getOutgoingFromActionAction() {
		if (outgoingFromActionAction != null && outgoingFromActionAction.eIsProxy()) {
			InternalEObject oldOutgoingFromActionAction = (InternalEObject)outgoingFromActionAction;
			outgoingFromActionAction = (Arrow)eResolveProxy(oldOutgoingFromActionAction);
			if (outgoingFromActionAction != oldOutgoingFromActionAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.ACTION__OUTGOING_FROM_ACTION_ACTION, oldOutgoingFromActionAction, outgoingFromActionAction));
			}
		}
		return outgoingFromActionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arrow basicGetOutgoingFromActionAction() {
		return outgoingFromActionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutgoingFromActionAction(Arrow newOutgoingFromActionAction, NotificationChain msgs) {
		Arrow oldOutgoingFromActionAction = outgoingFromActionAction;
		outgoingFromActionAction = newOutgoingFromActionAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTION__OUTGOING_FROM_ACTION_ACTION, oldOutgoingFromActionAction, newOutgoingFromActionAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutgoingFromActionAction(Arrow newOutgoingFromActionAction) {
		if (newOutgoingFromActionAction != outgoingFromActionAction) {
			NotificationChain msgs = null;
			if (outgoingFromActionAction != null)
				msgs = ((InternalEObject)outgoingFromActionAction).eInverseRemove(this, ActivityPackage.ARROW__FROM_ACTION, Arrow.class, msgs);
			if (newOutgoingFromActionAction != null)
				msgs = ((InternalEObject)newOutgoingFromActionAction).eInverseAdd(this, ActivityPackage.ARROW__FROM_ACTION, Arrow.class, msgs);
			msgs = basicSetOutgoingFromActionAction(newOutgoingFromActionAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTION__OUTGOING_FROM_ACTION_ACTION, newOutgoingFromActionAction, newOutgoingFromActionAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionArrow> getIncomingToActionFromDecision() {
		if (incomingToActionFromDecision == null) {
			incomingToActionFromDecision = new EObjectWithInverseResolvingEList<ConditionArrow>(ConditionArrow.class, this, ActivityPackage.ACTION__INCOMING_TO_ACTION_FROM_DECISION, ActivityPackage.CONDITION_ARROW__TO_ACTION_FROM_DECISION);
		}
		return incomingToActionFromDecision;
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
			case ActivityPackage.ACTION__INCOMING_TO_ACTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingToAction()).basicAdd(otherEnd, msgs);
			case ActivityPackage.ACTION__OUTGOING_FROM_ACTION_ACTION:
				if (outgoingFromActionAction != null)
					msgs = ((InternalEObject)outgoingFromActionAction).eInverseRemove(this, ActivityPackage.ARROW__FROM_ACTION, Arrow.class, msgs);
				return basicSetOutgoingFromActionAction((Arrow)otherEnd, msgs);
			case ActivityPackage.ACTION__INCOMING_TO_ACTION_FROM_DECISION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingToActionFromDecision()).basicAdd(otherEnd, msgs);
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
			case ActivityPackage.ACTION__INCOMING_TO_ACTION:
				return ((InternalEList<?>)getIncomingToAction()).basicRemove(otherEnd, msgs);
			case ActivityPackage.ACTION__OUTGOING_FROM_ACTION_ACTION:
				return basicSetOutgoingFromActionAction(null, msgs);
			case ActivityPackage.ACTION__INCOMING_TO_ACTION_FROM_DECISION:
				return ((InternalEList<?>)getIncomingToActionFromDecision()).basicRemove(otherEnd, msgs);
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
			case ActivityPackage.ACTION__INCOMING_TO_ACTION:
				return getIncomingToAction();
			case ActivityPackage.ACTION__ACTION:
				return getAction();
			case ActivityPackage.ACTION__OUTGOING_FROM_ACTION_ACTION:
				if (resolve) return getOutgoingFromActionAction();
				return basicGetOutgoingFromActionAction();
			case ActivityPackage.ACTION__INCOMING_TO_ACTION_FROM_DECISION:
				return getIncomingToActionFromDecision();
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
			case ActivityPackage.ACTION__INCOMING_TO_ACTION:
				getIncomingToAction().clear();
				getIncomingToAction().addAll((Collection<? extends Arrow>)newValue);
				return;
			case ActivityPackage.ACTION__ACTION:
				setAction((String)newValue);
				return;
			case ActivityPackage.ACTION__OUTGOING_FROM_ACTION_ACTION:
				setOutgoingFromActionAction((Arrow)newValue);
				return;
			case ActivityPackage.ACTION__INCOMING_TO_ACTION_FROM_DECISION:
				getIncomingToActionFromDecision().clear();
				getIncomingToActionFromDecision().addAll((Collection<? extends ConditionArrow>)newValue);
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
			case ActivityPackage.ACTION__INCOMING_TO_ACTION:
				getIncomingToAction().clear();
				return;
			case ActivityPackage.ACTION__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case ActivityPackage.ACTION__OUTGOING_FROM_ACTION_ACTION:
				setOutgoingFromActionAction((Arrow)null);
				return;
			case ActivityPackage.ACTION__INCOMING_TO_ACTION_FROM_DECISION:
				getIncomingToActionFromDecision().clear();
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
			case ActivityPackage.ACTION__INCOMING_TO_ACTION:
				return incomingToAction != null && !incomingToAction.isEmpty();
			case ActivityPackage.ACTION__ACTION:
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
			case ActivityPackage.ACTION__OUTGOING_FROM_ACTION_ACTION:
				return outgoingFromActionAction != null;
			case ActivityPackage.ACTION__INCOMING_TO_ACTION_FROM_DECISION:
				return incomingToActionFromDecision != null && !incomingToActionFromDecision.isEmpty();
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
		result.append(" (Action: ");
		result.append(action);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
