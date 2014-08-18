/**
 */
package ctmc;

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
 *   <li>{@link ctmc.State#getName <em>Name</em>}</li>
 *   <li>{@link ctmc.State#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link ctmc.State#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link ctmc.State#getLabels <em>Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @see ctmc.CtmcPackage#getState()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NonDeterministic NoDuplicateLabels'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL NonDeterministic='Tuple {\n\tmessage : String = \'There must not be any nondeterminism. Please union transitions to the same target.\',\n\tstatus : Boolean = \n\t\t\tself.outgoing.to->asSet()->size() = self.outgoing->size()\n}.status' NoDuplicateLabels='Tuple {\n\tmessage : String = \'Labels must be unique per state.\',\n\tstatus : Boolean = \n\t\t\tself.labels.name->asSet()->size() = self.labels->size()\n}.status'"
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
	 * @see ctmc.CtmcPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ctmc.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link ctmc.Transition}.
	 * It is bidirectional and its opposite is '{@link ctmc.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see ctmc.CtmcPackage#getState_Incoming()
	 * @see ctmc.Transition#getTo
	 * @model opposite="to" ordered="false"
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link ctmc.Transition}.
	 * It is bidirectional and its opposite is '{@link ctmc.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see ctmc.CtmcPackage#getState_Outgoing()
	 * @see ctmc.Transition#getFrom
	 * @model opposite="from" ordered="false"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link ctmc.Label}.
	 * It is bidirectional and its opposite is '{@link ctmc.Label#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see ctmc.CtmcPackage#getState_Labels()
	 * @see ctmc.Label#getState
	 * @model opposite="state" containment="true"
	 * @generated
	 */
	EList<Label> getLabels();

} // State
