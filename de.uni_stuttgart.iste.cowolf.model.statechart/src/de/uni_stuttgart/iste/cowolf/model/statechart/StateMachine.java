/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart;

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
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase, de.uni_stuttgart.iste.cowolf.model.commonBase.NameBase {
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
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage#getStateMachine_Transitions()
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
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage#getStateMachine_Top()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.State#getState_container
	 * @model opposite="state_container" containment="true" ordered="false"
	 * @generated
	 */
	EList<State> getTop();

} // StateMachine
