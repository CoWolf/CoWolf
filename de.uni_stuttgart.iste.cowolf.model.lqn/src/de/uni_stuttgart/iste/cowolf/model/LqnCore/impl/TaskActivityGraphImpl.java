/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.impl;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.ReplyEntryType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskActivityGraph;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Activity Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.TaskActivityGraphImpl#getReplyEntry <em>Reply Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskActivityGraphImpl extends ActivityGraphBaseImpl implements TaskActivityGraph {
	/**
	 * The cached value of the '{@link #getReplyEntry() <em>Reply Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<ReplyEntryType> replyEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskActivityGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LQNPackage.Literals.TASK_ACTIVITY_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReplyEntryType> getReplyEntry() {
		if (replyEntry == null) {
			replyEntry = new EObjectContainmentEList<ReplyEntryType>(ReplyEntryType.class, this, LQNPackage.TASK_ACTIVITY_GRAPH__REPLY_ENTRY);
		}
		return replyEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LQNPackage.TASK_ACTIVITY_GRAPH__REPLY_ENTRY:
				return ((InternalEList<?>)getReplyEntry()).basicRemove(otherEnd, msgs);
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
			case LQNPackage.TASK_ACTIVITY_GRAPH__REPLY_ENTRY:
				return getReplyEntry();
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
			case LQNPackage.TASK_ACTIVITY_GRAPH__REPLY_ENTRY:
				getReplyEntry().clear();
				getReplyEntry().addAll((Collection<? extends ReplyEntryType>)newValue);
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
			case LQNPackage.TASK_ACTIVITY_GRAPH__REPLY_ENTRY:
				getReplyEntry().clear();
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
			case LQNPackage.TASK_ACTIVITY_GRAPH__REPLY_ENTRY:
				return replyEntry != null && !replyEntry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TaskActivityGraphImpl
