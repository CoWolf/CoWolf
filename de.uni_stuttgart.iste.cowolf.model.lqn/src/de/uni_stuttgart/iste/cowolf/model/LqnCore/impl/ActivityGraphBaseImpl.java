/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.impl;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityGraphBase;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.PrecedenceType;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Graph Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityGraphBaseImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.ActivityGraphBaseImpl#getPrecedence <em>Precedence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityGraphBaseImpl extends IDBaseImpl implements ActivityGraphBase {
	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityDefType> activity;

	/**
	 * The cached value of the '{@link #getPrecedence() <em>Precedence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedence()
	 * @generated
	 * @ordered
	 */
	protected EList<PrecedenceType> precedence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityGraphBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LQNPackage.Literals.ACTIVITY_GRAPH_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityDefType> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentEList<ActivityDefType>(ActivityDefType.class, this, LQNPackage.ACTIVITY_GRAPH_BASE__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrecedenceType> getPrecedence() {
		if (precedence == null) {
			precedence = new EObjectContainmentEList<PrecedenceType>(PrecedenceType.class, this, LQNPackage.ACTIVITY_GRAPH_BASE__PRECEDENCE);
		}
		return precedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LQNPackage.ACTIVITY_GRAPH_BASE__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
			case LQNPackage.ACTIVITY_GRAPH_BASE__PRECEDENCE:
				return ((InternalEList<?>)getPrecedence()).basicRemove(otherEnd, msgs);
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
			case LQNPackage.ACTIVITY_GRAPH_BASE__ACTIVITY:
				return getActivity();
			case LQNPackage.ACTIVITY_GRAPH_BASE__PRECEDENCE:
				return getPrecedence();
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
			case LQNPackage.ACTIVITY_GRAPH_BASE__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends ActivityDefType>)newValue);
				return;
			case LQNPackage.ACTIVITY_GRAPH_BASE__PRECEDENCE:
				getPrecedence().clear();
				getPrecedence().addAll((Collection<? extends PrecedenceType>)newValue);
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
			case LQNPackage.ACTIVITY_GRAPH_BASE__ACTIVITY:
				getActivity().clear();
				return;
			case LQNPackage.ACTIVITY_GRAPH_BASE__PRECEDENCE:
				getPrecedence().clear();
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
			case LQNPackage.ACTIVITY_GRAPH_BASE__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case LQNPackage.ACTIVITY_GRAPH_BASE__PRECEDENCE:
				return precedence != null && !precedence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityGraphBaseImpl
