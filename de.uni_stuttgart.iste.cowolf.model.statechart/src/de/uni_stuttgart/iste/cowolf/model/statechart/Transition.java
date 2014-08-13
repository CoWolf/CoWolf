/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.Transition#getTransSM_container <em>Trans SM container</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.Transition#getTransS_container <em>Trans Scontainer</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.Transition#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.Transition#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Trans SM container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trans SM container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trans SM container</em>' container reference.
	 * @see #setTransSM_container(StateMachine)
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage#getTransition_TransSM_container()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine#getTransitions
	 * @model opposite="transitions" transient="false" ordered="false"
	 * @generated
	 */
	StateMachine getTransSM_container();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.statechart.Transition#getTransSM_container <em>Trans SM container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trans SM container</em>' container reference.
	 * @see #getTransSM_container()
	 * @generated
	 */
	void setTransSM_container(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Trans Scontainer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.State#getInternalTransitions <em>Internal Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trans Scontainer</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trans Scontainer</em>' container reference.
	 * @see #setTransS_container(State)
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage#getTransition_TransS_container()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.State#getInternalTransitions
	 * @model opposite="internalTransitions" transient="false" ordered="false"
	 * @generated
	 */
	State getTransS_container();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.statechart.Transition#getTransS_container <em>Trans Scontainer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trans Scontainer</em>' container reference.
	 * @see #getTransS_container()
	 * @generated
	 */
	void setTransS_container(State value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.Event#getEvt_container <em>Evt container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' reference.
	 * @see #setTrigger(Event)
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage#getTransition_Trigger()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.Event#getEvt_container
	 * @model opposite="evt_container" ordered="false"
	 * @generated
	 */
	Event getTrigger();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.statechart.Transition#getTrigger <em>Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(Event value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.Guard#getGua_container <em>Gua container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(Guard)
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage#getTransition_Guard()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.Guard#getGua_container
	 * @model opposite="gua_container" containment="true" ordered="false"
	 * @generated
	 */
	Guard getGuard();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.statechart.Transition#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Guard value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.StateVertex#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(StateVertex)
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage#getTransition_Source()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StateVertex#getOutgoing
	 * @model opposite="outgoing" required="true" ordered="false"
	 * @generated
	 */
	StateVertex getSource();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.statechart.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(StateVertex value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.StateVertex#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(StateVertex)
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.statechartemfPackage#getTransition_Target()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StateVertex#getIncoming
	 * @model opposite="incoming" required="true" ordered="false"
	 * @generated
	 */
	StateVertex getTarget();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.statechart.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(StateVertex value);

} // Transition
