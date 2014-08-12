/**
 */
package de.uni_stuttgart.iste.cowolf.model.fault_tree;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate#getId <em>Id</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate#getInputGates <em>Input Gates</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate#getInputEvents <em>Input Events</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate#getOutputGate <em>Output Gate</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate#getOutputEvent <em>Output Event</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getGate()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoHazardAsInput NoBasicEventAsOutput AtLeastTwoInputs ExactlyOneOutput'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NoHazardAsInput='self.inputEvents->forAll(e : Event | (e.oclIsTypeOf(BasicEvent) or e.oclIsTypeOf(IntermediateEvent)) and not e.oclIsTypeOf(Hazard))' NoBasicEventAsOutput='self.outputEvent->forAll(e : Event | (e.oclIsTypeOf(IntermediateEvent) or e.oclIsTypeOf(Hazard)) and not e.oclIsTypeOf(BasicEvent))' AtLeastTwoInputs='self.inputGates->size() + self.inputEvents->size() >= 2' ExactlyOneOutput='self.outputGate->size() + self.outputEvent->size() = 1'"
 * @generated
 */
public interface Gate extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getGate_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Input Gates</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Gates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Gates</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getGate_InputGates()
	 * @model
	 * @generated
	 */
	EList<Gate> getInputGates();

	/**
	 * Returns the value of the '<em><b>Input Events</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Event}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Event#getOutputGate <em>Output Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Events</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getGate_InputEvents()
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.Event#getOutputGate
	 * @model opposite="outputGate"
	 * @generated
	 */
	EList<Event> getInputEvents();

	/**
	 * Returns the value of the '<em><b>Output Gate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Gate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Gate</em>' reference.
	 * @see #setOutputGate(Gate)
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getGate_OutputGate()
	 * @model
	 * @generated
	 */
	Gate getOutputGate();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate#getOutputGate <em>Output Gate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Gate</em>' reference.
	 * @see #getOutputGate()
	 * @generated
	 */
	void setOutputGate(Gate value);

	/**
	 * Returns the value of the '<em><b>Output Event</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Event#getInputGate <em>Input Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Event</em>' reference.
	 * @see #setOutputEvent(Event)
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getGate_OutputEvent()
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.Event#getInputGate
	 * @model opposite="inputGate"
	 * @generated
	 */
	Event getOutputEvent();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate#getOutputEvent <em>Output Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Event</em>' reference.
	 * @see #getOutputEvent()
	 * @generated
	 */
	void setOutputEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Root#getGate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' container reference.
	 * @see #setRoot(Root)
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getGate_Root()
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.Root#getGate
	 * @model opposite="gate" transient="false"
	 * @generated
	 */
	Root getRoot();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate#getRoot <em>Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' container reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Root value);

} // Gate
