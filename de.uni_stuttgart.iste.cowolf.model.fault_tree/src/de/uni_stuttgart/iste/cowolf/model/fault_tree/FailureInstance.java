/**
 */
package de.uni_stuttgart.iste.cowolf.model.fault_tree;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getType <em>Type</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getRoot <em>Root</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getPreviousFailure <em>Previous Failure</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getPreviousError <em>Previous Error</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getEvent <em>Event</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getFailureInstance()
 * @model
 * @generated
 */
public interface FailureInstance extends IDBase {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureType#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(FailureType)
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getFailureInstance_Type()
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureType#getInstance
	 * @model opposite="instance" required="true"
	 * @generated
	 */
	FailureType getType();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(FailureType value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree#getFailure_instance <em>Failure instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' container reference.
	 * @see #setRoot(FaultTree)
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getFailureInstance_Root()
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree#getFailure_instance
	 * @model opposite="failure_instance" transient="false"
	 * @generated
	 */
	FaultTree getRoot();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getRoot <em>Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' container reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(FaultTree value);

	/**
	 * Returns the value of the '<em><b>Previous Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Failure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Failure</em>' reference.
	 * @see #setPreviousFailure(FailureInstance)
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getFailureInstance_PreviousFailure()
	 * @model
	 * @generated
	 */
	FailureInstance getPreviousFailure();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getPreviousFailure <em>Previous Failure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Failure</em>' reference.
	 * @see #getPreviousFailure()
	 * @generated
	 */
	void setPreviousFailure(FailureInstance value);

	/**
	 * Returns the value of the '<em><b>Previous Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Error</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Error</em>' reference.
	 * @see #setPreviousError(ErrorInstance)
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getFailureInstance_PreviousError()
	 * @model
	 * @generated
	 */
	ErrorInstance getPreviousError();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getPreviousError <em>Previous Error</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Error</em>' reference.
	 * @see #getPreviousError()
	 * @generated
	 */
	void setPreviousError(ErrorInstance value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.IntermediateEvent#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(IntermediateEvent)
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getFailureInstance_Event()
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.IntermediateEvent#getInstance
	 * @model opposite="instance"
	 * @generated
	 */
	IntermediateEvent getEvent();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(IntermediateEvent value);

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
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getFailureInstance_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // FailureInstance
