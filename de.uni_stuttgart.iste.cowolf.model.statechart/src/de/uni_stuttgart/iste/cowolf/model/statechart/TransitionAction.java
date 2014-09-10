/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.TransitionAction#getAct_container <em>Act container</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage#getTransitionAction()
 * @model
 * @generated
 */
public interface TransitionAction extends Action {
	/**
	 * Returns the value of the '<em><b>Act container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.Transition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Act container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Act container</em>' container reference.
	 * @see #setAct_container(Transition)
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage#getTransitionAction_Act_container()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.Transition#getAction
	 * @model opposite="action" transient="false"
	 * @generated
	 */
	Transition getAct_container();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.statechart.TransitionAction#getAct_container <em>Act container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Act container</em>' container reference.
	 * @see #getAct_container()
	 * @generated
	 */
	void setAct_container(Transition value);

} // TransitionAction
