/**
 */
package de.uni_stuttgart.iste.cowolf.model.activity_diagram;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>After Action Arrow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.AfterActionArrow#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.Activity_diagramPackage#getAfterActionArrow()
 * @model
 * @generated
 */
public interface AfterActionArrow extends IDBase {
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
	 * @see de.uni_stuttgart.iste.cowolf.model.activity_diagram.Activity_diagramPackage#getAfterActionArrow_Target()
	 * @model required="true"
	 * @generated
	 */
	NodesWithoutJoin getTarget();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.AfterActionArrow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(NodesWithoutJoin value);

} // AfterActionArrow
