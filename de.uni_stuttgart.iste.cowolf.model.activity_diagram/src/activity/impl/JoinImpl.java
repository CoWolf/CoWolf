/**
 */
package activity.impl;

import activity.ActivityPackage;
import activity.Arrow;
import activity.Join;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activity.impl.JoinImpl#getIncomingToJoin <em>Incoming To Join</em>}</li>
 *   <li>{@link activity.impl.JoinImpl#getOutgoingFromJoin <em>Outgoing From Join</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JoinImpl extends BarImpl implements Join {
	/**
	 * The cached value of the '{@link #getIncomingToJoin() <em>Incoming To Join</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingToJoin()
	 * @generated
	 * @ordered
	 */
	protected EList<Arrow> incomingToJoin;

	/**
	 * The cached value of the '{@link #getOutgoingFromJoin() <em>Outgoing From Join</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingFromJoin()
	 * @generated
	 * @ordered
	 */
	protected Arrow outgoingFromJoin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.JOIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arrow> getIncomingToJoin() {
		if (incomingToJoin == null) {
			incomingToJoin = new EObjectWithInverseResolvingEList<Arrow>(Arrow.class, this, ActivityPackage.JOIN__INCOMING_TO_JOIN, ActivityPackage.ARROW__TO_JOIN);
		}
		return incomingToJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arrow getOutgoingFromJoin() {
		if (outgoingFromJoin != null && outgoingFromJoin.eIsProxy()) {
			InternalEObject oldOutgoingFromJoin = (InternalEObject)outgoingFromJoin;
			outgoingFromJoin = (Arrow)eResolveProxy(oldOutgoingFromJoin);
			if (outgoingFromJoin != oldOutgoingFromJoin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.JOIN__OUTGOING_FROM_JOIN, oldOutgoingFromJoin, outgoingFromJoin));
			}
		}
		return outgoingFromJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arrow basicGetOutgoingFromJoin() {
		return outgoingFromJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutgoingFromJoin(Arrow newOutgoingFromJoin, NotificationChain msgs) {
		Arrow oldOutgoingFromJoin = outgoingFromJoin;
		outgoingFromJoin = newOutgoingFromJoin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.JOIN__OUTGOING_FROM_JOIN, oldOutgoingFromJoin, newOutgoingFromJoin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutgoingFromJoin(Arrow newOutgoingFromJoin) {
		if (newOutgoingFromJoin != outgoingFromJoin) {
			NotificationChain msgs = null;
			if (outgoingFromJoin != null)
				msgs = ((InternalEObject)outgoingFromJoin).eInverseRemove(this, ActivityPackage.ARROW__FROM_JOIN, Arrow.class, msgs);
			if (newOutgoingFromJoin != null)
				msgs = ((InternalEObject)newOutgoingFromJoin).eInverseAdd(this, ActivityPackage.ARROW__FROM_JOIN, Arrow.class, msgs);
			msgs = basicSetOutgoingFromJoin(newOutgoingFromJoin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.JOIN__OUTGOING_FROM_JOIN, newOutgoingFromJoin, newOutgoingFromJoin));
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
			case ActivityPackage.JOIN__INCOMING_TO_JOIN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingToJoin()).basicAdd(otherEnd, msgs);
			case ActivityPackage.JOIN__OUTGOING_FROM_JOIN:
				if (outgoingFromJoin != null)
					msgs = ((InternalEObject)outgoingFromJoin).eInverseRemove(this, ActivityPackage.ARROW__FROM_JOIN, Arrow.class, msgs);
				return basicSetOutgoingFromJoin((Arrow)otherEnd, msgs);
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
			case ActivityPackage.JOIN__INCOMING_TO_JOIN:
				return ((InternalEList<?>)getIncomingToJoin()).basicRemove(otherEnd, msgs);
			case ActivityPackage.JOIN__OUTGOING_FROM_JOIN:
				return basicSetOutgoingFromJoin(null, msgs);
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
			case ActivityPackage.JOIN__INCOMING_TO_JOIN:
				return getIncomingToJoin();
			case ActivityPackage.JOIN__OUTGOING_FROM_JOIN:
				if (resolve) return getOutgoingFromJoin();
				return basicGetOutgoingFromJoin();
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
			case ActivityPackage.JOIN__INCOMING_TO_JOIN:
				getIncomingToJoin().clear();
				getIncomingToJoin().addAll((Collection<? extends Arrow>)newValue);
				return;
			case ActivityPackage.JOIN__OUTGOING_FROM_JOIN:
				setOutgoingFromJoin((Arrow)newValue);
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
			case ActivityPackage.JOIN__INCOMING_TO_JOIN:
				getIncomingToJoin().clear();
				return;
			case ActivityPackage.JOIN__OUTGOING_FROM_JOIN:
				setOutgoingFromJoin((Arrow)null);
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
			case ActivityPackage.JOIN__INCOMING_TO_JOIN:
				return incomingToJoin != null && !incomingToJoin.isEmpty();
			case ActivityPackage.JOIN__OUTGOING_FROM_JOIN:
				return outgoingFromJoin != null;
		}
		return super.eIsSet(featureID);
	}

} //JoinImpl
