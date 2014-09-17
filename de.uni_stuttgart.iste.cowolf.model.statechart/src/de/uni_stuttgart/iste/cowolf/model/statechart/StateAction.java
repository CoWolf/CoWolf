/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.statechart.StateAction#getAction_container <em>Action container</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage#getStateAction()
 * @model abstract="true"
 * @generated
 */
public interface StateAction extends Action {
	/**
	 * Returns the value of the '<em><b>Action container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.statechart.State#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action container</em>' container reference.
	 * @see #setAction_container(State)
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage#getStateAction_Action_container()
	 * @see de.uni_stuttgart.iste.cowolf.model.statechart.State#getActions
	 * @model opposite="actions" transient="false"
	 * @generated
	 */
	State getAction_container();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.statechart.StateAction#getAction_container <em>Action container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action container</em>' container reference.
	 * @see #getAction_container()
	 * @generated
	 */
	void setAction_container(State value);

} // StateAction
