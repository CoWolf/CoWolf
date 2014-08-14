/**
 */
package de.uni_stuttgart.iste.cowolf.model.dtmc;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.dtmc.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.dtmc.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.dtmc.Parameter#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCemfPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends IDBase {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute list.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCemfPackage#getParameter_Name()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<String> getName();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute list.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCemfPackage#getParameter_Type()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<String> getType();

	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.State#getFormalParam <em>Formal Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(State)
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCemfPackage#getParameter_State()
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.State#getFormalParam
	 * @model opposite="formalParam" required="true"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.Parameter#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // Parameter
