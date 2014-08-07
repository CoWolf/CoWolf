/**
 */
package de.uni_stuttgart.ieste.cowolf.model.Statechart.impl;

import de.uni_stuttgart.ieste.cowolf.model.Statechart.Event;
import de.uni_stuttgart.ieste.cowolf.model.Statechart.State;
import de.uni_stuttgart.ieste.cowolf.model.Statechart.Transition;
import de.uni_stuttgart.ieste.cowolf.model.Statechart.statchartemfPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.ieste.cowolf.model.Statechart.impl.EventImpl#getEvt_container <em>Evt container</em>}</li>
 *   <li>{@link de.uni_stuttgart.ieste.cowolf.model.Statechart.impl.EventImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event {
	/**
	 * The cached value of the '{@link #getEvt_container() <em>Evt container</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvt_container()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> evt_container;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<State> targets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return statchartemfPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getEvt_container() {
		if (evt_container == null) {
			evt_container = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, statchartemfPackage.EVENT__EVT_CONTAINER, statchartemfPackage.TRANSITION__TRIGGER);
		}
		return evt_container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getTargets() {
		if (targets == null) {
			targets = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, statchartemfPackage.EVENT__TARGETS, statchartemfPackage.STATE__DEFERRABLE_EVENTS);
		}
		return targets;
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
			case statchartemfPackage.EVENT__EVT_CONTAINER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEvt_container()).basicAdd(otherEnd, msgs);
			case statchartemfPackage.EVENT__TARGETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargets()).basicAdd(otherEnd, msgs);
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
			case statchartemfPackage.EVENT__EVT_CONTAINER:
				return ((InternalEList<?>)getEvt_container()).basicRemove(otherEnd, msgs);
			case statchartemfPackage.EVENT__TARGETS:
				return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
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
			case statchartemfPackage.EVENT__EVT_CONTAINER:
				return getEvt_container();
			case statchartemfPackage.EVENT__TARGETS:
				return getTargets();
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
			case statchartemfPackage.EVENT__EVT_CONTAINER:
				getEvt_container().clear();
				getEvt_container().addAll((Collection<? extends Transition>)newValue);
				return;
			case statchartemfPackage.EVENT__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends State>)newValue);
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
			case statchartemfPackage.EVENT__EVT_CONTAINER:
				getEvt_container().clear();
				return;
			case statchartemfPackage.EVENT__TARGETS:
				getTargets().clear();
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
			case statchartemfPackage.EVENT__EVT_CONTAINER:
				return evt_container != null && !evt_container.isEmpty();
			case statchartemfPackage.EVENT__TARGETS:
				return targets != null && !targets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EventImpl
