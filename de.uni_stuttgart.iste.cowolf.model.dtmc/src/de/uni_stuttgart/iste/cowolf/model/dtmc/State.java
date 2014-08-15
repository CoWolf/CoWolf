/**
 */
package de.uni_stuttgart.iste.cowolf.model.dtmc;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.dtmc.State#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.dtmc.State#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.dtmc.State#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.dtmc.State#getLabels <em>Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCemfPackage#getState()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OutgoingDontAddUpToOne NonDeterministic NoDuplicateLabels'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot OutgoingDontAddUpToOne='Tuple {\n\tmessage : String = \'Probability of all outgoing transitions must be 1.0.\',\n\tstatus : Boolean = \n\t\t\tself.outgoing->size() = 0 or (self.outgoing.prob->sum() - 1.0).abs()  < 0.000001\n}.status' NonDeterministic='Tuple {\n\tmessage : String = \'There must not be any nondeterminism. Please union transitions to the same target.\',\n\tstatus : Boolean = \n\t\t\tself.outgoing.to->asSet()->size() = self.outgoing->size()\n}.status' NoDuplicateLabels='Tuple {\n\tmessage : String = \'Labels must be unique per state.\',\n\tstatus : Boolean = \n\t\t\tself.labels.name->asSet()->size() = self.labels->size()\n}.status'"
 * @generated
 */
public interface State extends IDBase {
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
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCemfPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.dtmc.Transition}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCemfPackage#getState_Incoming()
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.Transition#getTo
	 * @model opposite="to" ordered="false"
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.dtmc.Transition}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCemfPackage#getState_Outgoing()
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.Transition#getFrom
	 * @model opposite="from" ordered="false"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.dtmc.Label}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.Label#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCemfPackage#getState_Labels()
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.Label#getState
	 * @model opposite="state" containment="true"
	 * @generated
	 */
	EList<Label> getLabels();

} // State
