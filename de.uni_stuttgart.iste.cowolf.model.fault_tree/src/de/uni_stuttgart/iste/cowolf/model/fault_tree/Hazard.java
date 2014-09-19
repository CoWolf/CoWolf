/**
 */
package de.uni_stuttgart.iste.cowolf.model.fault_tree;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Hazard#getInEvent <em>In Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getHazard()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoStandaloneUndevelopedEvent'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL NoStandaloneUndevelopedEvent='self.inputGate->size() + self.outputGate->size() + self.inEvent->size() > 0'"
 * @generated
 */
public interface Hazard extends Event {
	/**
	 * Returns the value of the '<em><b>In Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Event</em>' reference.
	 * @see #setInEvent(IntermediateEvent)
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getHazard_InEvent()
	 * @model
	 * @generated
	 */
	IntermediateEvent getInEvent();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.Hazard#getInEvent <em>In Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Event</em>' reference.
	 * @see #getInEvent()
	 * @generated
	 */
	void setInEvent(IntermediateEvent value);

} // Hazard
