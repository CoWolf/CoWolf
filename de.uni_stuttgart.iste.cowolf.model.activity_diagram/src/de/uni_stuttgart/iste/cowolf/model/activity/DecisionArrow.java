/**
 */
package de.uni_stuttgart.iste.cowolf.model.activity;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Arrow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.activity.DecisionArrow#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.activity.DecisionArrow#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.activity.ActivityPackage#getDecisionArrow()
 * @model
 * @generated
 */
public interface DecisionArrow extends IDBase {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see de.uni_stuttgart.iste.cowolf.model.activity.ActivityPackage#getDecisionArrow_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.activity.DecisionArrow#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(NodesWithoutJoin)
	 * @see de.uni_stuttgart.iste.cowolf.model.activity.ActivityPackage#getDecisionArrow_Target()
	 * @model required="true"
	 * @generated
	 */
	NodesWithoutJoin getTarget();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.activity.DecisionArrow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(NodesWithoutJoin value);

} // DecisionArrow
