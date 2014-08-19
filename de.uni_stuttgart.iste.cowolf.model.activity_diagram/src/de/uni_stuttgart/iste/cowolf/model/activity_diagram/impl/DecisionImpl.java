/**
 */
package de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl;

import de.uni_stuttgart.iste.cowolf.model.activity_diagram.Activity_diagramPackage;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.Decision;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.DecisionArrow;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.DecisionImpl#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecisionImpl extends NodesWithoutJoinImpl implements Decision {
	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<DecisionArrow> outgoing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Activity_diagramPackage.Literals.DECISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecisionArrow> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectResolvingEList<DecisionArrow>(DecisionArrow.class, this, Activity_diagramPackage.DECISION__OUTGOING);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Activity_diagramPackage.DECISION__OUTGOING:
				return getOutgoing();
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
			case Activity_diagramPackage.DECISION__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends DecisionArrow>)newValue);
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
			case Activity_diagramPackage.DECISION__OUTGOING:
				getOutgoing().clear();
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
			case Activity_diagramPackage.DECISION__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DecisionImpl
