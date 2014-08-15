/**
 */
package activity.impl;

import activity.ActivityPackage;
import activity.Arrow;
import activity.Split;

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
 * An implementation of the model object '<em><b>Split</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activity.impl.SplitImpl#getOutgoingFromSplit <em>Outgoing From Split</em>}</li>
 *   <li>{@link activity.impl.SplitImpl#getIncomingToSplit <em>Incoming To Split</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SplitImpl extends BarImpl implements Split {
	/**
	 * The cached value of the '{@link #getOutgoingFromSplit() <em>Outgoing From Split</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingFromSplit()
	 * @generated
	 * @ordered
	 */
	protected EList<Arrow> outgoingFromSplit;

	/**
	 * The cached value of the '{@link #getIncomingToSplit() <em>Incoming To Split</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingToSplit()
	 * @generated
	 * @ordered
	 */
	protected Arrow incomingToSplit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.SPLIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arrow> getOutgoingFromSplit() {
		if (outgoingFromSplit == null) {
			outgoingFromSplit = new EObjectWithInverseResolvingEList<Arrow>(Arrow.class, this, ActivityPackage.SPLIT__OUTGOING_FROM_SPLIT, ActivityPackage.ARROW__FROM_SPLIT);
		}
		return outgoingFromSplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arrow getIncomingToSplit() {
		if (incomingToSplit != null && incomingToSplit.eIsProxy()) {
			InternalEObject oldIncomingToSplit = (InternalEObject)incomingToSplit;
			incomingToSplit = (Arrow)eResolveProxy(oldIncomingToSplit);
			if (incomingToSplit != oldIncomingToSplit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.SPLIT__INCOMING_TO_SPLIT, oldIncomingToSplit, incomingToSplit));
			}
		}
		return incomingToSplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arrow basicGetIncomingToSplit() {
		return incomingToSplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingToSplit(Arrow newIncomingToSplit, NotificationChain msgs) {
		Arrow oldIncomingToSplit = incomingToSplit;
		incomingToSplit = newIncomingToSplit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.SPLIT__INCOMING_TO_SPLIT, oldIncomingToSplit, newIncomingToSplit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncomingToSplit(Arrow newIncomingToSplit) {
		if (newIncomingToSplit != incomingToSplit) {
			NotificationChain msgs = null;
			if (incomingToSplit != null)
				msgs = ((InternalEObject)incomingToSplit).eInverseRemove(this, ActivityPackage.ARROW__TO_SPLIT, Arrow.class, msgs);
			if (newIncomingToSplit != null)
				msgs = ((InternalEObject)newIncomingToSplit).eInverseAdd(this, ActivityPackage.ARROW__TO_SPLIT, Arrow.class, msgs);
			msgs = basicSetIncomingToSplit(newIncomingToSplit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.SPLIT__INCOMING_TO_SPLIT, newIncomingToSplit, newIncomingToSplit));
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
			case ActivityPackage.SPLIT__OUTGOING_FROM_SPLIT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingFromSplit()).basicAdd(otherEnd, msgs);
			case ActivityPackage.SPLIT__INCOMING_TO_SPLIT:
				if (incomingToSplit != null)
					msgs = ((InternalEObject)incomingToSplit).eInverseRemove(this, ActivityPackage.ARROW__TO_SPLIT, Arrow.class, msgs);
				return basicSetIncomingToSplit((Arrow)otherEnd, msgs);
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
			case ActivityPackage.SPLIT__OUTGOING_FROM_SPLIT:
				return ((InternalEList<?>)getOutgoingFromSplit()).basicRemove(otherEnd, msgs);
			case ActivityPackage.SPLIT__INCOMING_TO_SPLIT:
				return basicSetIncomingToSplit(null, msgs);
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
			case ActivityPackage.SPLIT__OUTGOING_FROM_SPLIT:
				return getOutgoingFromSplit();
			case ActivityPackage.SPLIT__INCOMING_TO_SPLIT:
				if (resolve) return getIncomingToSplit();
				return basicGetIncomingToSplit();
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
			case ActivityPackage.SPLIT__OUTGOING_FROM_SPLIT:
				getOutgoingFromSplit().clear();
				getOutgoingFromSplit().addAll((Collection<? extends Arrow>)newValue);
				return;
			case ActivityPackage.SPLIT__INCOMING_TO_SPLIT:
				setIncomingToSplit((Arrow)newValue);
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
			case ActivityPackage.SPLIT__OUTGOING_FROM_SPLIT:
				getOutgoingFromSplit().clear();
				return;
			case ActivityPackage.SPLIT__INCOMING_TO_SPLIT:
				setIncomingToSplit((Arrow)null);
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
			case ActivityPackage.SPLIT__OUTGOING_FROM_SPLIT:
				return outgoingFromSplit != null && !outgoingFromSplit.isEmpty();
			case ActivityPackage.SPLIT__INCOMING_TO_SPLIT:
				return incomingToSplit != null;
		}
		return super.eIsSet(featureID);
	}

} //SplitImpl
