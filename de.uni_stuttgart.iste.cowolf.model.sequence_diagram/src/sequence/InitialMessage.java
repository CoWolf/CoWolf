/**
 */
package sequence;

import commonBase.IDBase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sequence.InitialMessage#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see sequence.SequencePackage#getInitialMessage()
 * @model
 * @generated
 */
public interface InitialMessage extends MessageBase, IDBase {
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
	 * @see sequence.SequencePackage#getInitialMessage_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link sequence.InitialMessage#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

} // InitialMessage
