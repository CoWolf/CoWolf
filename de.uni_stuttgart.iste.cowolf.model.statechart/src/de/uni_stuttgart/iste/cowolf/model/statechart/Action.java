/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.Action#getValue <em>Value</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.Action#getStateMachineCall <em>State Machine Call</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage#getAction()
 * @model
 * @generated
 */
public interface Action extends IDBase {
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
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage#getAction_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.statechart.Action#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>State Machine Call</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine#getCalledByAction <em>Called By Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine Call</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine Call</em>' reference.
	 * @see #setStateMachineCall(StateMachine)
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage#getAction_StateMachineCall()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine#getCalledByAction
	 * @model opposite="calledByAction"
	 * @generated
	 */
	StateMachine getStateMachineCall();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.statechart.Action#getStateMachineCall <em>State Machine Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine Call</em>' reference.
	 * @see #getStateMachineCall()
	 * @generated
	 */
	void setStateMachineCall(StateMachine value);

} // Action
