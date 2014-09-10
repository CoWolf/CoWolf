/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.Guard#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.Guard#getGua_container <em>Gua container</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage#getGuard()
 * @model
 * @generated
 */
public interface Guard extends IDBase {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage#getGuard_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.statechart.Guard#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Gua container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gua container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gua container</em>' container reference.
	 * @see #setGua_container(Transition)
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage#getGuard_Gua_container()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.Transition#getGuard
	 * @model opposite="guard" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Transition getGua_container();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.statechart.Guard#getGua_container <em>Gua container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gua container</em>' container reference.
	 * @see #getGua_container()
	 * @generated
	 */
	void setGua_container(Transition value);

} // Guard
