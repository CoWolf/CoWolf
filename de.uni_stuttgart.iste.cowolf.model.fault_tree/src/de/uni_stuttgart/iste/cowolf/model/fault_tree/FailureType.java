/**
 */
package de.uni_stuttgart.iste.cowolf.model.fault_tree;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureType#getInstance <em>Instance</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureType#getRoot <em>Root</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getFailureType()
 * @model
 * @generated
 */
public interface FailureType extends EObject {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getFailureType_Instance()
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getType
	 * @model opposite="type" required="true"
	 * @generated
	 */
	EList<FailureInstance> getInstance();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Root#getFailure_type <em>Failure type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' container reference.
	 * @see #setRoot(Root)
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getFailureType_Root()
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.Root#getFailure_type
	 * @model opposite="failure_type" transient="false"
	 * @generated
	 */
	Root getRoot();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureType#getRoot <em>Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' container reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Root value);

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
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getFailureType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // FailureType
