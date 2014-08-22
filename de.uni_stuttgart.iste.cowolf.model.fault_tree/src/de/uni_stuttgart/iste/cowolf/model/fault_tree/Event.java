/**
 */
package de.uni_stuttgart.iste.cowolf.model.fault_tree;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Event#getDescription <em>Description</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Event#getInputGate <em>Input Gate</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Event#getOutputGate <em>Output Gate</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Event#getRoot <em>Root</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Event#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getEvent()
 * @model abstract="true"
 * @generated
 */
public interface Event extends IDBase {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getEvent_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Event#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Input Gate</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate#getOutputEvent <em>Output Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Gate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Gate</em>' reference.
	 * @see #setInputGate(Gate)
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getEvent_InputGate()
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate#getOutputEvent
	 * @model opposite="outputEvent"
	 * @generated
	 */
	Gate getInputGate();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Event#getInputGate <em>Input Gate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Gate</em>' reference.
	 * @see #getInputGate()
	 * @generated
	 */
	void setInputGate(Gate value);

	/**
	 * Returns the value of the '<em><b>Output Gate</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate#getInputEvents <em>Input Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Gate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Gate</em>' reference.
	 * @see #setOutputGate(Gate)
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getEvent_OutputGate()
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate#getInputEvents
	 * @model opposite="inputEvents"
	 * @generated
	 */
	Gate getOutputGate();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Event#getOutputGate <em>Output Gate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Gate</em>' reference.
	 * @see #getOutputGate()
	 * @generated
	 */
	void setOutputGate(Gate value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' container reference.
	 * @see #setRoot(FaultTree)
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getEvent_Root()
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree#getEvent
	 * @model opposite="event" transient="false"
	 * @generated
	 */
	FaultTree getRoot();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Event#getRoot <em>Root</em>}' container reference.
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
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getEvent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Event#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Event
