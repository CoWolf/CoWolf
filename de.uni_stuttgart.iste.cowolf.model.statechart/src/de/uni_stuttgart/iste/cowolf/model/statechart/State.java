/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.State#getState_container <em>State container</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.State#getInternalTransitions <em>Internal Transitions</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.State#getDeferrableEvents <em>Deferrable Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage#getState()
 * @model
 * @generated
 */
public interface State extends StateVertex {
	/**
	 * Returns the value of the '<em><b>State container</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine#getInitialStates <em>Initial States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State container</em>' reference.
	 * @see #setState_container(StateMachine)
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage#getState_State_container()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine#getInitialStates
	 * @model opposite="initialStates" required="true" ordered="false"
	 * @generated
	 */
	StateMachine getState_container();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.statechart.State#getState_container <em>State container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State container</em>' reference.
	 * @see #getState_container()
	 * @generated
	 */
	void setState_container(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Internal Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.statechart.Transition}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.Transition#getTransS_container <em>Trans Scontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Transitions</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage#getState_InternalTransitions()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.Transition#getTransS_container
	 * @model opposite="transS_container" containment="true" ordered="false"
	 * @generated
	 */
	EList<Transition> getInternalTransitions();

	/**
	 * Returns the value of the '<em><b>Deferrable Events</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.statechart.Event}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.Event#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deferrable Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deferrable Events</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage#getState_DeferrableEvents()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.Event#getTargets
	 * @model opposite="targets" ordered="false"
	 * @generated
	 */
	EList<Event> getDeferrableEvents();

} // State
