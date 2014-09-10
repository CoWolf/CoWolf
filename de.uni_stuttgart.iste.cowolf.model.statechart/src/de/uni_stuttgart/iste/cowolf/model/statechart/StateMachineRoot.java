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

} // StateMachineRoot
