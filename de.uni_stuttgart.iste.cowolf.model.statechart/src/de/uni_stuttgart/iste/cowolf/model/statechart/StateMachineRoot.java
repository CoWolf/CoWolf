/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.StateMachineRoot#getSubStateMachines <em>Sub State Machines</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.StateMachineRoot#getInitialStateMachine <em>Initial State Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage#getStateMachineRoot()
 * @model
 * @generated
 */
public interface StateMachineRoot extends IDBase {
	/**
	 * Returns the value of the '<em><b>Sub State Machines</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine#getStatemachine_container <em>Statemachine container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub State Machines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub State Machines</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage#getStateMachineRoot_SubStateMachines()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine#getStatemachine_container
	 * @model opposite="statemachine_container" containment="true"
	 * @generated
	 */
	EList<StateMachine> getSubStateMachines();

	/**
	 * Returns the value of the '<em><b>Initial State Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State Machine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State Machine</em>' reference.
	 * @see #setInitialStateMachine(StateMachine)
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage#getStateMachineRoot_InitialStateMachine()
	 * @model
	 * @generated
	 */
	StateMachine getInitialStateMachine();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.statechart.StateMachineRoot#getInitialStateMachine <em>Initial State Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State Machine</em>' reference.
	 * @see #getInitialStateMachine()
	 * @generated
	 */
	void setInitialStateMachine(StateMachine value);

} // StateMachineRoot
