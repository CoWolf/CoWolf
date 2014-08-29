/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.impl;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryActivityGraph;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.ReplyActivityType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Activity Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.EntryActivityGraphImpl#getReplyActivity <em>Reply Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntryActivityGraphImpl extends ActivityGraphBaseImpl implements EntryActivityGraph {
	/**
	 * The cached value of the '{@link #getReplyActivity() <em>Reply Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<ReplyActivityType> replyActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryActivityGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LQNPackage.Literals.ENTRY_ACTIVITY_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReplyActivityType> getReplyActivity() {
		if (replyActivity == null) {
			replyActivity = new EObjectContainmentEList<ReplyActivityType>(ReplyActivityType.class, this, LQNPackage.ENTRY_ACTIVITY_GRAPH__REPLY_ACTIVITY);
		}
		return replyActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LQNPackage.ENTRY_ACTIVITY_GRAPH__REPLY_ACTIVITY:
				return ((InternalEList<?>)getReplyActivity()).basicRemove(otherEnd, msgs);
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
			case LQNPackage.ENTRY_ACTIVITY_GRAPH__REPLY_ACTIVITY:
				return getReplyActivity();
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
			case LQNPackage.ENTRY_ACTIVITY_GRAPH__REPLY_ACTIVITY:
				getReplyActivity().clear();
				getReplyActivity().addAll((Collection<? extends ReplyActivityType>)newValue);
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
			case LQNPackage.ENTRY_ACTIVITY_GRAPH__REPLY_ACTIVITY:
				getReplyActivity().clear();
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
			case LQNPackage.ENTRY_ACTIVITY_GRAPH__REPLY_ACTIVITY:
				return replyActivity != null && !replyActivity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntryActivityGraphImpl
