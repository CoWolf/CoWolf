/**
 */
package activity.impl;

import activity.ActivityPackage;
import activity.Arrow;
import activity.ConditionArrow;
import activity.Decision;

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
 * An implementation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activity.impl.DecisionImpl#getOutgoingFromDecision <em>Outgoing From Decision</em>}</li>
 *   <li>{@link activity.impl.DecisionImpl#getIncomingToDecision <em>Incoming To Decision</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecisionImpl extends MinimalEObjectImpl.Container implements Decision {
	/**
	 * The cached value of the '{@link #getOutgoingFromDecision() <em>Outgoing From Decision</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingFromDecision()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionArrow> outgoingFromDecision;

	/**
	 * The cached value of the '{@link #getIncomingToDecision() <em>Incoming To Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingToDecision()
	 * @generated
	 * @ordered
	 */
	protected Arrow incomingToDecision;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.DECISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionArrow> getOutgoingFromDecision() {
		if (outgoingFromDecision == null) {
			outgoingFromDecision = new EObjectWithInverseResolvingEList<ConditionArrow>(ConditionArrow.class, this, ActivityPackage.DECISION__OUTGOING_FROM_DECISION, ActivityPackage.CONDITION_ARROW__FROM_DECISION);
		}
		return outgoingFromDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arrow getIncomingToDecision() {
		if (incomingToDecision != null && incomingToDecision.eIsProxy()) {
			InternalEObject oldIncomingToDecision = (InternalEObject)incomingToDecision;
			incomingToDecision = (Arrow)eResolveProxy(oldIncomingToDecision);
			if (incomingToDecision != oldIncomingToDecision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.DECISION__INCOMING_TO_DECISION, oldIncomingToDecision, incomingToDecision));
			}
		}
		return incomingToDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arrow basicGetIncomingToDecision() {
		return incomingToDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingToDecision(Arrow newIncomingToDecision, NotificationChain msgs) {
		Arrow oldIncomingToDecision = incomingToDecision;
		incomingToDecision = newIncomingToDecision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.DECISION__INCOMING_TO_DECISION, oldIncomingToDecision, newIncomingToDecision);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncomingToDecision(Arrow newIncomingToDecision) {
		if (newIncomingToDecision != incomingToDecision) {
			NotificationChain msgs = null;
			if (incomingToDecision != null)
				msgs = ((InternalEObject)incomingToDecision).eInverseRemove(this, ActivityPackage.ARROW__TO_DECISION, Arrow.class, msgs);
			if (newIncomingToDecision != null)
				msgs = ((InternalEObject)newIncomingToDecision).eInverseAdd(this, ActivityPackage.ARROW__TO_DECISION, Arrow.class, msgs);
			msgs = basicSetIncomingToDecision(newIncomingToDecision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.DECISION__INCOMING_TO_DECISION, newIncomingToDecision, newIncomingToDecision));
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
			case ActivityPackage.DECISION__OUTGOING_FROM_DECISION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingFromDecision()).basicAdd(otherEnd, msgs);
			case ActivityPackage.DECISION__INCOMING_TO_DECISION:
				if (incomingToDecision != null)
					msgs = ((InternalEObject)incomingToDecision).eInverseRemove(this, ActivityPackage.ARROW__TO_DECISION, Arrow.class, msgs);
				return basicSetIncomingToDecision((Arrow)otherEnd, msgs);
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
			case ActivityPackage.DECISION__OUTGOING_FROM_DECISION:
				return ((InternalEList<?>)getOutgoingFromDecision()).basicRemove(otherEnd, msgs);
			case ActivityPackage.DECISION__INCOMING_TO_DECISION:
				return basicSetIncomingToDecision(null, msgs);
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
			case ActivityPackage.DECISION__OUTGOING_FROM_DECISION:
				return getOutgoingFromDecision();
			case ActivityPackage.DECISION__INCOMING_TO_DECISION:
				if (resolve) return getIncomingToDecision();
				return basicGetIncomingToDecision();
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
			case ActivityPackage.DECISION__OUTGOING_FROM_DECISION:
				getOutgoingFromDecision().clear();
				getOutgoingFromDecision().addAll((Collection<? extends ConditionArrow>)newValue);
				return;
			case ActivityPackage.DECISION__INCOMING_TO_DECISION:
				setIncomingToDecision((Arrow)newValue);
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
			case ActivityPackage.DECISION__OUTGOING_FROM_DECISION:
				getOutgoingFromDecision().clear();
				return;
			case ActivityPackage.DECISION__INCOMING_TO_DECISION:
				setIncomingToDecision((Arrow)null);
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
			case ActivityPackage.DECISION__OUTGOING_FROM_DECISION:
				return outgoingFromDecision != null && !outgoingFromDecision.isEmpty();
			case ActivityPackage.DECISION__INCOMING_TO_DECISION:
				return incomingToDecision != null;
		}
		return super.eIsSet(featureID);
	}

} //DecisionImpl
