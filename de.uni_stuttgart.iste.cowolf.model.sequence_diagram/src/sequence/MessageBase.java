/**
 */
package sequence;

import commonBase.IDBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sequence.MessageBase#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see sequence.SequencePackage#getMessageBase()
 * @model abstract="true"
 * @generated
 */
public interface MessageBase extends IDBase {
	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link sequence.Task#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(Task)
	 * @see sequence.SequencePackage#getMessageBase_To()
	 * @see sequence.Task#getFrom
	 * @model opposite="from" containment="true" required="true"
	 * @generated
	 */
	Task getTo();

	/**
	 * Sets the value of the '{@link sequence.MessageBase#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Task value);

} // MessageBase
