/**
 */
package de.uni_stuttgart.iste.cowolf.model.fault_tree;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree#getHazard <em>Hazard</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree#getGate <em>Gate</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree#getEvent <em>Event</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree#getFailure_instance <em>Failure instance</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree#getFailure_type <em>Failure type</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree#getError_instance <em>Error instance</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree#getError_type <em>Error type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getFaultTree()
 * @model
 * @generated
 */
public interface FaultTree extends IDBase {
	/**
	 * Returns the value of the '<em><b>Hazard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard</em>' containment reference.
	 * @see #setHazard(Hazard)
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getFaultTree_Hazard()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Hazard getHazard();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree#getHazard <em>Hazard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazard</em>' containment reference.
	 * @see #getHazard()
	 * @generated
	 */
	void setHazard(Hazard value);

	/**
	 * Returns the value of the '<em><b>Gate</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gate</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getFaultTree_Gate()
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate#getRoot
	 * @model opposite="root" containment="true"
	 * @generated
	 */
	EList<Gate> getGate();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Event}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Event#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getFaultTree_Event()
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.Event#getRoot
	 * @model opposite="root" containment="true"
	 * @generated
	 */
	EList<Event> getEvent();

	/**
	 * Returns the value of the '<em><b>Failure instance</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure instance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure instance</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getFaultTree_Failure_instance()
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getRoot
	 * @model opposite="root" containment="true"
	 * @generated
	 */
	EList<FailureInstance> getFailure_instance();

	/**
	 * Returns the value of the '<em><b>Failure type</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureType}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureType#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure type</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getFaultTree_Failure_type()
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureType#getRoot
	 * @model opposite="root" containment="true"
	 * @generated
	 */
	EList<FailureType> getFailure_type();

	/**
	 * Returns the value of the '<em><b>Error instance</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorInstance#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error instance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error instance</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getFaultTree_Error_instance()
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorInstance#getRoot
	 * @model opposite="root" containment="true"
	 * @generated
	 */
	EList<ErrorInstance> getError_instance();

	/**
	 * Returns the value of the '<em><b>Error type</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorType}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorType#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error type</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getFaultTree_Error_type()
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorType#getRoot
	 * @model opposite="root" containment="true"
	 * @generated
	 */
	EList<ErrorType> getError_type();

} // FaultTree
