/**
 */
package activity.impl;

import activity.ActivityPackage;
import activity.ArrowAfterStart;
import activity.NodesWithoutJoin;
import activity.Start;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activity.impl.StartImpl#getOutgoingFromStart <em>Outgoing From Start</em>}</li>
 *   <li>{@link activity.impl.StartImpl#getSuccessor <em>Successor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StartImpl extends MinimalEObjectImpl.Container implements Start {
	/**
	 * The cached value of the '{@link #getOutgoingFromStart() <em>Outgoing From Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingFromStart()
	 * @generated
	 * @ordered
	 */
	protected ArrowAfterStart outgoingFromStart;

	/**
	 * The cached value of the '{@link #getSuccessor() <em>Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessor()
	 * @generated
	 * @ordered
	 */
	protected NodesWithoutJoin successor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.START;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowAfterStart getOutgoingFromStart() {
		if (outgoingFromStart != null && outgoingFromStart.eIsProxy()) {
			InternalEObject oldOutgoingFromStart = (InternalEObject)outgoingFromStart;
			outgoingFromStart = (ArrowAfterStart)eResolveProxy(oldOutgoingFromStart);
			if (outgoingFromStart != oldOutgoingFromStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.START__OUTGOING_FROM_START, oldOutgoingFromStart, outgoingFromStart));
			}
		}
		return outgoingFromStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowAfterStart basicGetOutgoingFromStart() {
		return outgoingFromStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutgoingFromStart(ArrowAfterStart newOutgoingFromStart, NotificationChain msgs) {
		ArrowAfterStart oldOutgoingFromStart = outgoingFromStart;
		outgoingFromStart = newOutgoingFromStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.START__OUTGOING_FROM_START, oldOutgoingFromStart, newOutgoingFromStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutgoingFromStart(ArrowAfterStart newOutgoingFromStart) {
		if (newOutgoingFromStart != outgoingFromStart) {
			NotificationChain msgs = null;
			if (outgoingFromStart != null)
				msgs = ((InternalEObject)outgoingFromStart).eInverseRemove(this, ActivityPackage.ARROW_AFTER_START__SOURCE, ArrowAfterStart.class, msgs);
			if (newOutgoingFromStart != null)
				msgs = ((InternalEObject)newOutgoingFromStart).eInverseAdd(this, ActivityPackage.ARROW_AFTER_START__SOURCE, ArrowAfterStart.class, msgs);
			msgs = basicSetOutgoingFromStart(newOutgoingFromStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.START__OUTGOING_FROM_START, newOutgoingFromStart, newOutgoingFromStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodesWithoutJoin getSuccessor() {
		if (successor != null && successor.eIsProxy()) {
			InternalEObject oldSuccessor = (InternalEObject)successor;
			successor = (NodesWithoutJoin)eResolveProxy(oldSuccessor);
			if (successor != oldSuccessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.START__SUCCESSOR, oldSuccessor, successor));
			}
		}
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodesWithoutJoin basicGetSuccessor() {
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessor(NodesWithoutJoin newSuccessor) {
		NodesWithoutJoin oldSuccessor = successor;
		successor = newSuccessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.START__SUCCESSOR, oldSuccessor, successor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityPackage.START__OUTGOING_FROM_START:
				if (outgoingFromStart != null)
					msgs = ((InternalEObject)outgoingFromStart).eInverseRemove(this, ActivityPackage.ARROW_AFTER_START__SOURCE, ArrowAfterStart.class, msgs);
				return basicSetOutgoingFromStart((ArrowAfterStart)otherEnd, msgs);
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
			case ActivityPackage.START__OUTGOING_FROM_START:
				return basicSetOutgoingFromStart(null, msgs);
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
			case ActivityPackage.START__OUTGOING_FROM_START:
				if (resolve) return getOutgoingFromStart();
				return basicGetOutgoingFromStart();
			case ActivityPackage.START__SUCCESSOR:
				if (resolve) return getSuccessor();
				return basicGetSuccessor();
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
			case ActivityPackage.START__OUTGOING_FROM_START:
				setOutgoingFromStart((ArrowAfterStart)newValue);
				return;
			case ActivityPackage.START__SUCCESSOR:
				setSuccessor((NodesWithoutJoin)newValue);
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
			case ActivityPackage.START__OUTGOING_FROM_START:
				setOutgoingFromStart((ArrowAfterStart)null);
				return;
			case ActivityPackage.START__SUCCESSOR:
				setSuccessor((NodesWithoutJoin)null);
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
			case ActivityPackage.START__OUTGOING_FROM_START:
				return outgoingFromStart != null;
			case ActivityPackage.START__SUCCESSOR:
				return successor != null;
		}
		return super.eIsSet(featureID);
	}

} //StartImpl
