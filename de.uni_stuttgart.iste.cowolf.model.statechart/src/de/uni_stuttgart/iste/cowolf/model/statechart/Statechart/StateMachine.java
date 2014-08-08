/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart.Statechart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.StateMachine#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.StateMachine#getTop <em>Top</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.StatechartemfPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.Transition}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.Transition#getTransSM_container <em>Trans SM container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.StatechartemfPackage#getStateMachine_Transitions()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.Transition#getTransSM_container
	 * @model opposite="transSM_container" containment="true" ordered="false"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Top</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.State}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.State#getState_container <em>State container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.StatechartemfPackage#getStateMachine_Top()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.Statechart.State#getState_container
	 * @model opposite="state_container" containment="true" ordered="false"
	 * @generated
	 */
	EList<State> getTop();

} // StateMachine
