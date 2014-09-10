/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart.impl;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;

import de.uni_stuttgart.iste.cowolf.model.statechart.Guard;
import de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage;
import de.uni_stuttgart.iste.cowolf.model.statechart.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.GuardImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.GuardImpl#getGua_container <em>Gua container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuardImpl extends IDBaseImpl implements Guard {
	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

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
		return StatemachinePackage.Literals.GUARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.GUARD__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getGua_container() {
		if (eContainerFeatureID() != StatemachinePackage.GUARD__GUA_CONTAINER) return null;
		return (Transition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGua_container(Transition newGua_container, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGua_container, StatemachinePackage.GUARD__GUA_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGua_container(Transition newGua_container) {
		if (newGua_container != eInternalContainer() || (eContainerFeatureID() != StatemachinePackage.GUARD__GUA_CONTAINER && newGua_container != null)) {
			if (EcoreUtil.isAncestor(this, newGua_container))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGua_container != null)
				msgs = ((InternalEObject)newGua_container).eInverseAdd(this, StatemachinePackage.TRANSITION__GUARD, Transition.class, msgs);
			msgs = basicSetGua_container(newGua_container, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.GUARD__GUA_CONTAINER, newGua_container, newGua_container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatemachinePackage.GUARD__GUA_CONTAINER:
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
			case StatemachinePackage.GUARD__GUA_CONTAINER:
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
			case StatemachinePackage.GUARD__GUA_CONTAINER:
				return eInternalContainer().eInverseRemove(this, StatemachinePackage.TRANSITION__GUARD, Transition.class, msgs);
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
			case StatemachinePackage.GUARD__EXPRESSION:
				return getExpression();
			case StatemachinePackage.GUARD__GUA_CONTAINER:
				return getGua_container();
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
			case StatemachinePackage.GUARD__EXPRESSION:
				setExpression((String)newValue);
				return;
			case StatemachinePackage.GUARD__GUA_CONTAINER:
				setGua_container((Transition)newValue);
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
			case StatemachinePackage.GUARD__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case StatemachinePackage.GUARD__GUA_CONTAINER:
				setGua_container((Transition)null);
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
			case StatemachinePackage.GUARD__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case StatemachinePackage.GUARD__GUA_CONTAINER:
				return getGua_container() != null;
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
		result.append(" (expression: ");
		result.append(expression);
		result.append(')');
		return result.toString();
	}

} //GuardImpl
