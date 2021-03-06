/**
 */
package de.uni_stuttgart.iste.cowolf.model.fault_tree;

import org.eclipse.emf.common.util.EList;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorType#getError <em>Error</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorType#getRoot <em>Root</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getErrorType()
 * @model
 * @generated
 */
public interface ErrorType extends IDBase {
	/**
	 * Returns the value of the '<em><b>Error</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getErrorType_Error()
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorInstance#getType
	 * @model opposite="type" required="true"
	 * @generated
	 */
	EList<ErrorInstance> getError();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree#getError_type <em>Error type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' container reference.
	 * @see #setRoot(FaultTree)
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getErrorType_Root()
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree#getError_type
	 * @model opposite="error_type" transient="false"
	 * @generated
	 */
	FaultTree getRoot();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorType#getRoot <em>Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' container reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(FaultTree value);

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
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getErrorType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ErrorType
