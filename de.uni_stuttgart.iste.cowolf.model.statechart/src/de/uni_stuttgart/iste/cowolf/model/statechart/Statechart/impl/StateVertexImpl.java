/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.impl;

import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.CompositeState;
import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.StateVertex;
import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.StatechartemfPackage;
import de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Vertex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.impl.StateVertexImpl#getSv_container <em>Sv container</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.impl.StateVertexImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.impl.StateVertexImpl#getIncoming <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateVertexImpl extends MinimalEObjectImpl.Container implements StateVertex {
	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoing;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incoming;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateVertexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatechartemfPackage.Literals.STATE_VERTEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeState getSv_container() {
		if (eContainerFeatureID() != StatechartemfPackage.STATE_VERTEX__SV_CONTAINER) return null;
		return (CompositeState)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSv_container(CompositeState newSv_container, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSv_container, StatechartemfPackage.STATE_VERTEX__SV_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSv_container(CompositeState newSv_container) {
		if (newSv_container != eInternalContainer() || (eContainerFeatureID() != StatechartemfPackage.STATE_VERTEX__SV_CONTAINER && newSv_container != null)) {
			if (EcoreUtil.isAncestor(this, newSv_container))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSv_container != null)
				msgs = ((InternalEObject)newSv_container).eInverseAdd(this, StatechartemfPackage.COMPOSITE_STATE__SUB_VERTEXES, CompositeState.class, msgs);
			msgs = basicSetSv_container(newSv_container, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatechartemfPackage.STATE_VERTEX__SV_CONTAINER, newSv_container, newSv_container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, StatechartemfPackage.STATE_VERTEX__OUTGOING, StatechartemfPackage.TRANSITION__SOURCE);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, StatechartemfPackage.STATE_VERTEX__INCOMING, StatechartemfPackage.TRANSITION__TARGET);
		}
		return incoming;
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
			case StatechartemfPackage.STATE_VERTEX__SV_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSv_container((CompositeState)otherEnd, msgs);
			case StatechartemfPackage.STATE_VERTEX__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
			case StatechartemfPackage.STATE_VERTEX__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
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
			case StatechartemfPackage.STATE_VERTEX__SV_CONTAINER:
				return basicSetSv_container(null, msgs);
			case StatechartemfPackage.STATE_VERTEX__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
			case StatechartemfPackage.STATE_VERTEX__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
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
			case StatechartemfPackage.STATE_VERTEX__SV_CONTAINER:
				return eInternalContainer().eInverseRemove(this, StatechartemfPackage.COMPOSITE_STATE__SUB_VERTEXES, CompositeState.class, msgs);
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
			case StatechartemfPackage.STATE_VERTEX__SV_CONTAINER:
				return getSv_container();
			case StatechartemfPackage.STATE_VERTEX__OUTGOING:
				return getOutgoing();
			case StatechartemfPackage.STATE_VERTEX__INCOMING:
				return getIncoming();
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
			case StatechartemfPackage.STATE_VERTEX__SV_CONTAINER:
				setSv_container((CompositeState)newValue);
				return;
			case StatechartemfPackage.STATE_VERTEX__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Transition>)newValue);
				return;
			case StatechartemfPackage.STATE_VERTEX__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends Transition>)newValue);
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
			case StatechartemfPackage.STATE_VERTEX__SV_CONTAINER:
				setSv_container((CompositeState)null);
				return;
			case StatechartemfPackage.STATE_VERTEX__OUTGOING:
				getOutgoing().clear();
				return;
			case StatechartemfPackage.STATE_VERTEX__INCOMING:
				getIncoming().clear();
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
			case StatechartemfPackage.STATE_VERTEX__SV_CONTAINER:
				return getSv_container() != null;
			case StatechartemfPackage.STATE_VERTEX__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case StatechartemfPackage.STATE_VERTEX__INCOMING:
				return incoming != null && !incoming.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateVertexImpl
