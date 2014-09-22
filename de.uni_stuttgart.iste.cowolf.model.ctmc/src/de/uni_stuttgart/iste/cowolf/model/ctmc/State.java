/**
 */
package de.uni_stuttgart.iste.cowolf.model.ctmc;

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
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.ctmc.State#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.ctmc.State#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.ctmc.State#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.ctmc.State#getLabels <em>Labels</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.ctmc.State#getExitRate <em>Exit Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.ctmc.CtmcPackage#getState()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OutgoingDontAddUpToOne NonDeterministic NoDuplicateLabels ExitRateGreaterZero'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL OutgoingDontAddUpToOne='Tuple {\n\tmessage : String = \'Probability of all outgoing transitions must be 1.0.\',\n\tstatus : Boolean = \n            self.outgoing->size() = 0 or (self.outgoing.prob->sum() - 1.0).abs()  < 0.000001\n}.status' NonDeterministic='Tuple {\n\tmessage : String = \'There must not be any nondeterminism. Please union transitions to the same target.\',\n\tstatus : Boolean = \n\t\t\tself.outgoing.to->asSet()->size() = self.outgoing->size()\n}.status' NoDuplicateLabels='Tuple {\n\tmessage : String = \'Labels must be unique per state.\',\n\tstatus : Boolean = \n\t\t\tself.labels.name->asSet()->size() = self.labels->size()\n}.status' ExitRateGreaterZero='Tuple {\n\tmessage : String = \'Exit rate must be greater than 0.\',\n\tstatus : Boolean = \n\t\t    exitRate > 0.0 or self.outgoing->size() = 0\n}.status'"
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
	 * @see de.uni_stuttgart.iste.cowolf.model.ctmc.CtmcPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.ctmc.Transition}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.ctmc.CtmcPackage#getState_Incoming()
	 * @see de.uni_stuttgart.iste.cowolf.model.ctmc.Transition#getTo
	 * @model opposite="to" ordered="false"
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.ctmc.Transition}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.ctmc.CtmcPackage#getState_Outgoing()
	 * @see de.uni_stuttgart.iste.cowolf.model.ctmc.Transition#getFrom
	 * @model opposite="from" containment="true" ordered="false"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.ctmc.Label}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.Label#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.ctmc.CtmcPackage#getState_Labels()
	 * @see de.uni_stuttgart.iste.cowolf.model.ctmc.Label#getState
	 * @model opposite="state" containment="true"
	 * @generated
	 */
	EList<Label> getLabels();

	/**
	 * Returns the value of the '<em><b>Exit Rate</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Rate</em>' attribute.
	 * @see #setExitRate(float)
	 * @see de.uni_stuttgart.iste.cowolf.model.ctmc.CtmcPackage#getState_ExitRate()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	float getExitRate();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.State#getExitRate <em>Exit Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit Rate</em>' attribute.
	 * @see #getExitRate()
	 * @generated
	 */
	void setExitRate(float value);

} // State
