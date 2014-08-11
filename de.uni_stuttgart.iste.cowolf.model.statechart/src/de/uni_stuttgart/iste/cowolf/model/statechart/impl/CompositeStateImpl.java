/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart.impl;

import de.uni_stuttgart.iste.cowolf.model.statechart.CompositeState;
import de.uni_stuttgart.iste.cowolf.model.statechart.StateVertex;
import de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.CompositeStateImpl#getSubVertexes <em>Sub Vertexes</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.impl.CompositeStateImpl#isIsConcurrent <em>Is Concurrent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeStateImpl extends StateImpl implements CompositeState {
	/**
	 * The cached value of the '{@link #getSubVertexes() <em>Sub Vertexes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubVertexes()
	 * @generated
	 * @ordered
	 */
	protected EList<StateVertex> subVertexes;

	/**
	 * The default value of the '{@link #isIsConcurrent() <em>Is Concurrent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConcurrent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONCURRENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsConcurrent() <em>Is Concurrent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConcurrent()
	 * @generated
	 * @ordered
	 */
	protected boolean isConcurrent = IS_CONCURRENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return statechartemfPackage.Literals.COMPOSITE_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateVertex> getSubVertexes() {
		if (subVertexes == null) {
			subVertexes = new EObjectContainmentWithInverseEList<StateVertex>(StateVertex.class, this, statechartemfPackage.COMPOSITE_STATE__SUB_VERTEXES, statechartemfPackage.STATE_VERTEX__SV_CONTAINER);
		}
		return subVertexes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsConcurrent() {
		return isConcurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConcurrent(boolean newIsConcurrent) {
		boolean oldIsConcurrent = isConcurrent;
		isConcurrent = newIsConcurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, statechartemfPackage.COMPOSITE_STATE__IS_CONCURRENT, oldIsConcurrent, isConcurrent));
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
			case statechartemfPackage.COMPOSITE_STATE__SUB_VERTEXES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubVertexes()).basicAdd(otherEnd, msgs);
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
			case statechartemfPackage.COMPOSITE_STATE__SUB_VERTEXES:
				return ((InternalEList<?>)getSubVertexes()).basicRemove(otherEnd, msgs);
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
			case statechartemfPackage.COMPOSITE_STATE__SUB_VERTEXES:
				return getSubVertexes();
			case statechartemfPackage.COMPOSITE_STATE__IS_CONCURRENT:
				return isIsConcurrent();
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
			case statechartemfPackage.COMPOSITE_STATE__SUB_VERTEXES:
				getSubVertexes().clear();
				getSubVertexes().addAll((Collection<? extends StateVertex>)newValue);
				return;
			case statechartemfPackage.COMPOSITE_STATE__IS_CONCURRENT:
				setIsConcurrent((Boolean)newValue);
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
			case statechartemfPackage.COMPOSITE_STATE__SUB_VERTEXES:
				getSubVertexes().clear();
				return;
			case statechartemfPackage.COMPOSITE_STATE__IS_CONCURRENT:
				setIsConcurrent(IS_CONCURRENT_EDEFAULT);
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
			case statechartemfPackage.COMPOSITE_STATE__SUB_VERTEXES:
				return subVertexes != null && !subVertexes.isEmpty();
			case statechartemfPackage.COMPOSITE_STATE__IS_CONCURRENT:
				return isConcurrent != IS_CONCURRENT_EDEFAULT;
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
		result.append(" (isConcurrent: ");
		result.append(isConcurrent);
		result.append(')');
		return result.toString();
	}

} //CompositeStateImpl
