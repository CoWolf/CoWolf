/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine#getTop <em>Top</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine#getStatemachine_container <em>Statemachine container</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine#getCalledByAction <em>Called By Action</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends IDBase {
	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.statechart.Transition}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.Transition#getTransSM_container <em>Trans SM container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage#getStateMachine_Transitions()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.Transition#getTransSM_container
	 * @model opposite="transSM_container" containment="true" ordered="false"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Top</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.statechart.State}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.State#getState_container <em>State container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage#getStateMachine_Top()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.State#getState_container
	 * @model opposite="state_container" containment="true" ordered="false"
	 * @generated
	 */
	EList<State> getTop();

	/**
	 * Returns the value of the '<em><b>Statemachine container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.StateMachineRoot#getSubStateMachines <em>Sub State Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statemachine container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statemachine container</em>' container reference.
	 * @see #setStatemachine_container(StateMachineRoot)
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage#getStateMachine_Statemachine_container()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StateMachineRoot#getSubStateMachines
	 * @model opposite="subStateMachines" transient="false"
	 * @generated
	 */
	StateMachineRoot getStatemachine_container();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine#getStatemachine_container <em>Statemachine container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statemachine container</em>' container reference.
	 * @see #getStatemachine_container()
	 * @generated
	 */
	void setStatemachine_container(StateMachineRoot value);

	/**
	 * Returns the value of the '<em><b>Called By Action</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.statechart.Action}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.Action#getStateMachineCall <em>State Machine Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Called By Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called By Action</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage#getStateMachine_CalledByAction()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.Action#getStateMachineCall
	 * @model opposite="stateMachineCall"
	 * @generated
	 */
	EList<Action> getCalledByAction();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage#getStateMachine_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // StateMachine
