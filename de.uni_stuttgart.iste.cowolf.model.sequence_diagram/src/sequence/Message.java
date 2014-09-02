/**
 */
package sequence;

import commonBase.IDBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sequence.Message#getMessageKind <em>Message Kind</em>}</li>
 *   <li>{@link sequence.Message#getMessage <em>Message</em>}</li>
 *   <li>{@link sequence.Message#getIn <em>In</em>}</li>
 * </ul>
 * </p>
 *
 * @see sequence.SequencePackage#getMessage()
 * @model abstract="true"
 * @generated
 */
public interface Message extends IDBase {
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
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see sequence.SequencePackage#getMessage_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link sequence.Message#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sequence.Container#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference.
	 * @see #setIn(Container)
	 * @see sequence.SequencePackage#getMessage_In()
	 * @see sequence.Container#getMessages
	 * @model opposite="messages" required="true"
	 * @generated
	 */
	Container getIn();

	/**
	 * Sets the value of the '{@link sequence.Message#getIn <em>In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(Container value);

} // Message
