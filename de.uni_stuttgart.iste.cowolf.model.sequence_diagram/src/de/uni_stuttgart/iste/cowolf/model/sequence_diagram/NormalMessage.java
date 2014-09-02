/**
 */
package de.uni_stuttgart.iste.cowolf.model.sequence_diagram;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.NormalMessage#getMessageSort <em>Message Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramPackage#getNormalMessage()
 * @model
 * @generated
 */
public interface NormalMessage extends Message, MessageBase, IDBase {
	/**
	 * Returns the value of the '<em><b>Message Sort</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.MessageSortNormal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Sort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Sort</em>' attribute.
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.MessageSortNormal
	 * @see #setMessageSort(MessageSortNormal)
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramPackage#getNormalMessage_MessageSort()
	 * @model
	 * @generated
	 */
	MessageSortNormal getMessageSort();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.NormalMessage#getMessageSort <em>Message Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Sort</em>' attribute.
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.MessageSortNormal
	 * @see #getMessageSort()
	 * @generated
	 */
	void setMessageSort(MessageSortNormal value);

} // NormalMessage
