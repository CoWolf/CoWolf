/**
 */
package sequence;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Message Sort Special</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sequence.SequencePackage#getMessageSortSpecial()
 * @model
 * @generated
 */
public enum MessageSortSpecial implements Enumerator {
	/**
	 * The '<em><b>Create Message</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_MESSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	CREATE_MESSAGE(0, "createMessage", "createMessage"),

	/**
	 * The '<em><b>Delete Message</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE_MESSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	DELETE_MESSAGE(1, "deleteMessage", "deleteMessage");

	/**
	 * The '<em><b>Create Message</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Create Message</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREATE_MESSAGE
	 * @model name="createMessage"
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_MESSAGE_VALUE = 0;

	/**
	 * The '<em><b>Delete Message</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Delete Message</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETE_MESSAGE
	 * @model name="deleteMessage"
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_MESSAGE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Message Sort Special</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MessageSortSpecial[] VALUES_ARRAY =
		new MessageSortSpecial[] {
			CREATE_MESSAGE,
			DELETE_MESSAGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Message Sort Special</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MessageSortSpecial> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Message Sort Special</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MessageSortSpecial get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageSortSpecial result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Sort Special</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MessageSortSpecial getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageSortSpecial result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Sort Special</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MessageSortSpecial get(int value) {
		switch (value) {
			case CREATE_MESSAGE_VALUE: return CREATE_MESSAGE;
			case DELETE_MESSAGE_VALUE: return DELETE_MESSAGE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MessageSortSpecial(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //MessageSortSpecial
