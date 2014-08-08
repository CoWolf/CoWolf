/**
 */
package de.uni_stuttgart.iste.cowolf.model.dtmc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.dtmc.Root#getStates <em>States</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.dtmc.Root#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCemfPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.dtmc.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCemfPackage#getRoot_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.dtmc.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCemfPackage#getRoot_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

} // Root
