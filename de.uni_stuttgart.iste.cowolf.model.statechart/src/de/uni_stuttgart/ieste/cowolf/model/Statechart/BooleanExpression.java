/**
 */
package de.uni_stuttgart.ieste.cowolf.model.Statechart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.ieste.cowolf.model.Statechart.BooleanExpression#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.ieste.cowolf.model.Statechart.statchartemfPackage#getBooleanExpression()
 * @model
 * @generated
 */
public interface BooleanExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.uni_stuttgart.ieste.cowolf.model.Statechart.statchartemfPackage#getBooleanExpression_Value()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.ieste.cowolf.model.Statechart.BooleanExpression#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // BooleanExpression
