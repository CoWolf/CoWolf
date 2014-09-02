/**
 */
package de.uni_stuttgart.iste.cowolf.model.sequence_diagram;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.MessageBase#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramPackage#getMessageBase()
 * @model abstract="true"
 * @generated
 */
public interface MessageBase extends IDBase {
	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Task#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(Task)
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramPackage#getMessageBase_To()
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Task#getFrom
	 * @model opposite="from" containment="true" required="true"
	 * @generated
	 */
	Task getTo();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.MessageBase#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Task value);

} // MessageBase
