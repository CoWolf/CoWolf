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
 * An implementation of the model object '<em><b>Arrow After Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link activity.impl.ArrowAfterStartImpl#getSource <em>Source</em>}</li>
 *   <li>{@link activity.impl.ArrowAfterStartImpl#getTargetAfterStart <em>Target After Start</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrowAfterStartImpl extends MinimalEObjectImpl.Container implements ArrowAfterStart {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Start source;

	/**
	 * The cached value of the '{@link #getTargetAfterStart() <em>Target After Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAfterStart()
	 * @generated
	 * @ordered
	 */
	protected NodesWithoutJoin targetAfterStart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrowAfterStartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.ARROW_AFTER_START;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Start)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.ARROW_AFTER_START__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Start newSource, NotificationChain msgs) {
		Start oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.ARROW_AFTER_START__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Start newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, ActivityPackage.START__OUTGOING_FROM_START, Start.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, ActivityPackage.START__OUTGOING_FROM_START, Start.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ARROW_AFTER_START__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodesWithoutJoin getTargetAfterStart() {
		if (targetAfterStart != null && targetAfterStart.eIsProxy()) {
			InternalEObject oldTargetAfterStart = (InternalEObject)targetAfterStart;
			targetAfterStart = (NodesWithoutJoin)eResolveProxy(oldTargetAfterStart);
			if (targetAfterStart != oldTargetAfterStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.ARROW_AFTER_START__TARGET_AFTER_START, oldTargetAfterStart, targetAfterStart));
			}
		}
		return targetAfterStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodesWithoutJoin basicGetTargetAfterStart() {
		return targetAfterStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetAfterStart(NodesWithoutJoin newTargetAfterStart, NotificationChain msgs) {
		NodesWithoutJoin oldTargetAfterStart = targetAfterStart;
		targetAfterStart = newTargetAfterStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.ARROW_AFTER_START__TARGET_AFTER_START, oldTargetAfterStart, newTargetAfterStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetAfterStart(NodesWithoutJoin newTargetAfterStart) {
		if (newTargetAfterStart != targetAfterStart) {
			NotificationChain msgs = null;
			if (targetAfterStart != null)
				msgs = ((InternalEObject)targetAfterStart).eInverseRemove(this, ActivityPackage.NODES_WITHOUT_JOIN__INCOMING_START, NodesWithoutJoin.class, msgs);
			if (newTargetAfterStart != null)
				msgs = ((InternalEObject)newTargetAfterStart).eInverseAdd(this, ActivityPackage.NODES_WITHOUT_JOIN__INCOMING_START, NodesWithoutJoin.class, msgs);
			msgs = basicSetTargetAfterStart(newTargetAfterStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ARROW_AFTER_START__TARGET_AFTER_START, newTargetAfterStart, newTargetAfterStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityPackage.ARROW_AFTER_START__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, ActivityPackage.START__OUTGOING_FROM_START, Start.class, msgs);
				return basicSetSource((Start)otherEnd, msgs);
			case ActivityPackage.ARROW_AFTER_START__TARGET_AFTER_START:
				if (targetAfterStart != null)
					msgs = ((InternalEObject)targetAfterStart).eInverseRemove(this, ActivityPackage.NODES_WITHOUT_JOIN__INCOMING_START, NodesWithoutJoin.class, msgs);
				return basicSetTargetAfterStart((NodesWithoutJoin)otherEnd, msgs);
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
			case ActivityPackage.ARROW_AFTER_START__SOURCE:
				return basicSetSource(null, msgs);
			case ActivityPackage.ARROW_AFTER_START__TARGET_AFTER_START:
				return basicSetTargetAfterStart(null, msgs);
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
			case ActivityPackage.ARROW_AFTER_START__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ActivityPackage.ARROW_AFTER_START__TARGET_AFTER_START:
				if (resolve) return getTargetAfterStart();
				return basicGetTargetAfterStart();
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
			case ActivityPackage.ARROW_AFTER_START__SOURCE:
				setSource((Start)newValue);
				return;
			case ActivityPackage.ARROW_AFTER_START__TARGET_AFTER_START:
				setTargetAfterStart((NodesWithoutJoin)newValue);
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
			case ActivityPackage.ARROW_AFTER_START__SOURCE:
				setSource((Start)null);
				return;
			case ActivityPackage.ARROW_AFTER_START__TARGET_AFTER_START:
				setTargetAfterStart((NodesWithoutJoin)null);
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
			case ActivityPackage.ARROW_AFTER_START__SOURCE:
				return source != null;
			case ActivityPackage.ARROW_AFTER_START__TARGET_AFTER_START:
				return targetAfterStart != null;
		}
		return super.eIsSet(featureID);
	}

} //ArrowAfterStartImpl
