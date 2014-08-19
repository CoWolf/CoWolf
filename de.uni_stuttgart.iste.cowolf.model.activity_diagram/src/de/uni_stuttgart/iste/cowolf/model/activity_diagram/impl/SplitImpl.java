/**
 */
package de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl;

import de.uni_stuttgart.iste.cowolf.model.activity_diagram.Activity_diagramPackage;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.Split;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.SplitArrow;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Split</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.impl.SplitImpl#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SplitImpl extends NodesWithoutJoinImpl implements Split {
	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<SplitArrow> outgoing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Activity_diagramPackage.Literals.SPLIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SplitArrow> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectResolvingEList<SplitArrow>(SplitArrow.class, this, Activity_diagramPackage.SPLIT__OUTGOING);
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
			case Activity_diagramPackage.SPLIT__OUTGOING:
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
			case Activity_diagramPackage.SPLIT__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends SplitArrow>)newValue);
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
			case Activity_diagramPackage.SPLIT__OUTGOING:
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
			case Activity_diagramPackage.SPLIT__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SplitImpl
