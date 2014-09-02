/**
 */
package sequence;

import commonBase.IDBase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sequence.NormalMessage#getMessageSort <em>Message Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @see sequence.SequencePackage#getNormalMessage()
 * @model
 * @generated
 */
public interface NormalMessage extends Message, MessageBase, IDBase {
	/**
	 * Returns the value of the '<em><b>Message Sort</b></em>' attribute.
	 * The literals are from the enumeration {@link sequence.MessageSortNormal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Sort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Sort</em>' attribute.
	 * @see sequence.MessageSortNormal
	 * @see #setMessageSort(MessageSortNormal)
	 * @see sequence.SequencePackage#getNormalMessage_MessageSort()
	 * @model
	 * @generated
	 */
	MessageSortNormal getMessageSort();

	/**
	 * Sets the value of the '{@link sequence.NormalMessage#getMessageSort <em>Message Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Sort</em>' attribute.
	 * @see sequence.MessageSortNormal
	 * @see #getMessageSort()
	 * @generated
	 */
	void setMessageSort(MessageSortNormal value);

} // NormalMessage
