/**
 */
package sequence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sequence.Message#getMessageKind <em>Message Kind</em>}</li>
 *   <li>{@link sequence.Message#getMessageSort <em>Message Sort</em>}</li>
 *   <li>{@link sequence.Message#getFrom <em>From</em>}</li>
 *   <li>{@link sequence.Message#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see sequence.SequencePackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends Element {
	/**
	 * Returns the value of the '<em><b>Message Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link sequence.MessageKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Kind</em>' attribute.
	 * @see sequence.MessageKind
	 * @see #setMessageKind(MessageKind)
	 * @see sequence.SequencePackage#getMessage_MessageKind()
	 * @model
	 * @generated
	 */
	MessageKind getMessageKind();

	/**
	 * Sets the value of the '{@link sequence.Message#getMessageKind <em>Message Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Kind</em>' attribute.
	 * @see sequence.MessageKind
	 * @see #getMessageKind()
	 * @generated
	 */
	void setMessageKind(MessageKind value);

	/**
	 * Returns the value of the '<em><b>Message Sort</b></em>' attribute.
	 * The literals are from the enumeration {@link sequence.MessageSort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Sort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Sort</em>' attribute.
	 * @see sequence.MessageSort
	 * @see #setMessageSort(MessageSort)
	 * @see sequence.SequencePackage#getMessage_MessageSort()
	 * @model
	 * @generated
	 */
	MessageSort getMessageSort();

	/**
	 * Sets the value of the '{@link sequence.Message#getMessageSort <em>Message Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Sort</em>' attribute.
	 * @see sequence.MessageSort
	 * @see #getMessageSort()
	 * @generated
	 */
	void setMessageSort(MessageSort value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Task)
	 * @see sequence.SequencePackage#getMessage_From()
	 * @model required="true"
	 * @generated
	 */
	Task getFrom();

	/**
	 * Sets the value of the '{@link sequence.Message#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Task value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Task)
	 * @see sequence.SequencePackage#getMessage_To()
	 * @model required="true"
	 * @generated
	 */
	Task getTo();

	/**
	 * Sets the value of the '{@link sequence.Message#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Task value);

} // Message
