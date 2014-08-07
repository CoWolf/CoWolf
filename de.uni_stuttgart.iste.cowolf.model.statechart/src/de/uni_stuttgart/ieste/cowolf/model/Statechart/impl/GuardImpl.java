/**
 */
package de.uni_stuttgart.ieste.cowolf.model.Statechart.impl;

import de.uni_stuttgart.ieste.cowolf.model.Statechart.BooleanExpression;
import de.uni_stuttgart.ieste.cowolf.model.Statechart.Guard;
import de.uni_stuttgart.ieste.cowolf.model.Statechart.Transition;
import de.uni_stuttgart.ieste.cowolf.model.Statechart.statchartemfPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.ieste.cowolf.model.Statechart.impl.GuardImpl#getGua_container <em>Gua container</em>}</li>
 *   <li>{@link de.uni_stuttgart.ieste.cowolf.model.Statechart.impl.GuardImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuardImpl extends MinimalEObjectImpl.Container implements Guard {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpression expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return statchartemfPackage.Literals.GUARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getGua_container() {
		if (eContainerFeatureID() != statchartemfPackage.GUARD__GUA_CONTAINER) return null;
		return (Transition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGua_container(Transition newGua_container, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGua_container, statchartemfPackage.GUARD__GUA_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGua_container(Transition newGua_container) {
		if (newGua_container != eInternalContainer() || (eContainerFeatureID() != statchartemfPackage.GUARD__GUA_CONTAINER && newGua_container != null)) {
			if (EcoreUtil.isAncestor(this, newGua_container))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGua_container != null)
				msgs = ((InternalEObject)newGua_container).eInverseAdd(this, statchartemfPackage.TRANSITION__GUARD, Transition.class, msgs);
			msgs = basicSetGua_container(newGua_container, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, statchartemfPackage.GUARD__GUA_CONTAINER, newGua_container, newGua_container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression getExpression() {
		if (expression != null && expression.eIsProxy()) {
			InternalEObject oldExpression = (InternalEObject)expression;
			expression = (BooleanExpression)eResolveProxy(oldExpression);
			if (expression != oldExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, statchartemfPackage.GUARD__EXPRESSION, oldExpression, expression));
			}
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpression basicGetExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(BooleanExpression newExpression) {
		BooleanExpression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, statchartemfPackage.GUARD__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case statchartemfPackage.GUARD__GUA_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGua_container((Transition)otherEnd, msgs);
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
			case statchartemfPackage.GUARD__GUA_CONTAINER:
				return basicSetGua_container(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case statchartemfPackage.GUARD__GUA_CONTAINER:
				return eInternalContainer().eInverseRemove(this, statchartemfPackage.TRANSITION__GUARD, Transition.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case statchartemfPackage.GUARD__GUA_CONTAINER:
				return getGua_container();
			case statchartemfPackage.GUARD__EXPRESSION:
				if (resolve) return getExpression();
				return basicGetExpression();
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
			case statchartemfPackage.GUARD__GUA_CONTAINER:
				setGua_container((Transition)newValue);
				return;
			case statchartemfPackage.GUARD__EXPRESSION:
				setExpression((BooleanExpression)newValue);
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
			case statchartemfPackage.GUARD__GUA_CONTAINER:
				setGua_container((Transition)null);
				return;
			case statchartemfPackage.GUARD__EXPRESSION:
				setExpression((BooleanExpression)null);
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
			case statchartemfPackage.GUARD__GUA_CONTAINER:
				return getGua_container() != null;
			case statchartemfPackage.GUARD__EXPRESSION:
				return expression != null;
		}
		return super.eIsSet(featureID);
	}

} //GuardImpl
