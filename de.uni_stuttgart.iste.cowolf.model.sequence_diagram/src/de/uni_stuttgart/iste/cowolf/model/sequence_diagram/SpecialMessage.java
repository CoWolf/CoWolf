/**
 */
package de.uni_stuttgart.iste.cowolf.model.sequence_diagram;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Special Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.SpecialMessage#getTo <em>To</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.SpecialMessage#getMessageSort <em>Message Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramPackage#getSpecialMessage()
 * @model
 * @generated
 */
public interface SpecialMessage extends Message, IDBase {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Lifeline)
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramPackage#getSpecialMessage_To()
	 * @model required="true"
	 * @generated
	 */
	Lifeline getTo();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.SpecialMessage#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Lifeline value);

	/**
	 * Returns the value of the '<em><b>Message Sort</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.MessageSortSpecial}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Sort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Sort</em>' attribute.
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.MessageSortSpecial
	 * @see #setMessageSort(MessageSortSpecial)
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramPackage#getSpecialMessage_MessageSort()
	 * @model
	 * @generated
	 */
	MessageSortSpecial getMessageSort();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.SpecialMessage#getMessageSort <em>Message Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Sort</em>' attribute.
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.MessageSortSpecial
	 * @see #getMessageSort()
	 * @generated
	 */
	void setMessageSort(MessageSortSpecial value);

} // SpecialMessage
