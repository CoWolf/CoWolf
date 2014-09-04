/**
 */
package de.uni_stuttgart.iste.cowolf.model.fault_tree;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intermediate Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.IntermediateEvent#getInstance <em>Instance</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.IntermediateEvent#getInEvent <em>In Event</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.IntermediateEvent#getOutEvent <em>Out Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getIntermediateEvent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OnlyIntermediateOrBasicEventAsInput NoStandaloneIntermediateEvent OnlyIntermediateOrHazardtAsOutput'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL OnlyIntermediateOrBasicEventAsInput='self.inEvent->forAll(e : Event | (e.oclIsTypeOf(IntermediateEvent) or e.oclIsTypeOf(BasicEvent)))' NoStandaloneIntermediateEvent='self.inputGate->size() + self.outputGate->size() + self.inEvent->size() + self.outEvent->size()> 0' OnlyIntermediateOrHazardtAsOutput='self.outEvent->forAll(e : Event | (e.oclIsTypeOf(IntermediateEvent) or e.oclIsTypeOf(Hazard)))'"
 * @generated
 */
public interface IntermediateEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getIntermediateEvent_Instance()
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FailureInstance#getEvent
	 * @model opposite="event"
	 * @generated
	 */
	EList<FailureInstance> getInstance();

	/**
	 * Returns the value of the '<em><b>In Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Event</em>' reference.
	 * @see #setInEvent(Event)
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getIntermediateEvent_InEvent()
	 * @model
	 * @generated
	 */
	Event getInEvent();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.IntermediateEvent#getInEvent <em>In Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Event</em>' reference.
	 * @see #getInEvent()
	 * @generated
	 */
	void setInEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Out Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Event</em>' reference.
	 * @see #setOutEvent(Event)
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getIntermediateEvent_OutEvent()
	 * @model
	 * @generated
	 */
	Event getOutEvent();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.IntermediateEvent#getOutEvent <em>Out Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Event</em>' reference.
	 * @see #getOutEvent()
	 * @generated
	 */
	void setOutEvent(Event value);

} // IntermediateEvent
