/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart.impl;

import de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage;
import de.uni_stuttgart.iste.cowolf.model.statechart.Transition;
import de.uni_stuttgart.iste.cowolf.model.statechart.TransitionAction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.TransitionActionImpl#getAct_container <em>Act container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionActionImpl extends ActionImpl implements TransitionAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinePackage.Literals.TRANSITION_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getAct_container() {
		if (eContainerFeatureID() != StatemachinePackage.TRANSITION_ACTION__ACT_CONTAINER) return null;
		return (Transition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAct_container(Transition newAct_container, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAct_container, StatemachinePackage.TRANSITION_ACTION__ACT_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAct_container(Transition newAct_container) {
		if (newAct_container != eInternalContainer() || (eContainerFeatureID() != StatemachinePackage.TRANSITION_ACTION__ACT_CONTAINER && newAct_container != null)) {
			if (EcoreUtil.isAncestor(this, newAct_container))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAct_container != null)
				msgs = ((InternalEObject)newAct_container).eInverseAdd(this, StatemachinePackage.TRANSITION__ACTION, Transition.class, msgs);
			msgs = basicSetAct_container(newAct_container, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.TRANSITION_ACTION__ACT_CONTAINER, newAct_container, newAct_container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatemachinePackage.TRANSITION_ACTION__ACT_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAct_container((Transition)otherEnd, msgs);
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
			case StatemachinePackage.TRANSITION_ACTION__ACT_CONTAINER:
				return basicSetAct_container(null, msgs);
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
			case StatemachinePackage.TRANSITION_ACTION__ACT_CONTAINER:
				return eInternalContainer().eInverseRemove(this, StatemachinePackage.TRANSITION__ACTION, Transition.class, msgs);
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
			case StatemachinePackage.TRANSITION_ACTION__ACT_CONTAINER:
				return getAct_container();
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
			case StatemachinePackage.TRANSITION_ACTION__ACT_CONTAINER:
				setAct_container((Transition)newValue);
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
			case StatemachinePackage.TRANSITION_ACTION__ACT_CONTAINER:
				setAct_container((Transition)null);
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
			case StatemachinePackage.TRANSITION_ACTION__ACT_CONTAINER:
				return getAct_container() != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionActionImpl
