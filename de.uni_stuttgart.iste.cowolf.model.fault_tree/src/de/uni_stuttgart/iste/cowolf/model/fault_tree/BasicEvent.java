/**
 */
package de.uni_stuttgart.iste.cowolf.model.fault_tree;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.BasicEvent#getInstance <em>Instance</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.BasicEvent#getProbability <em>Probability</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.BasicEvent#getOutEvent <em>Out Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getBasicEvent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoStandaloneBasicEvent'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL NoStandaloneBasicEvent='self.inputGate->size() + self.outputGate->size() + self.outEvent->size()> 0'"
 * @generated
 */
public interface BasicEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorInstance#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getBasicEvent_Instance()
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.ErrorInstance#getError
	 * @model opposite="error"
	 * @generated
	 */
	EList<ErrorInstance> getInstance();

	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getBasicEvent_Probability()
	 * @model default="1"
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.BasicEvent#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

	/**
	 * Returns the value of the '<em><b>Out Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Event</em>' reference.
	 * @see #setOutEvent(IntermediateEvent)
	 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage#getBasicEvent_OutEvent()
	 * @model
	 * @generated
	 */
	IntermediateEvent getOutEvent();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.BasicEvent#getOutEvent <em>Out Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Event</em>' reference.
	 * @see #getOutEvent()
	 * @generated
	 */
	void setOutEvent(IntermediateEvent value);

} // BasicEvent
