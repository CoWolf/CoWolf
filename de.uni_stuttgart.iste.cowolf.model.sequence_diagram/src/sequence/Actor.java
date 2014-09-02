/**
 */
package sequence;

import commonBase.IDBase;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sequence.Actor#getInitialMessages <em>Initial Messages</em>}</li>
 *   <li>{@link sequence.Actor#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see sequence.SequencePackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends IDBase {
	/**
	 * Returns the value of the '<em><b>Initial Messages</b></em>' containment reference list.
	 * The list contents are of type {@link sequence.InitialMessage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Messages</em>' containment reference list.
	 * @see sequence.SequencePackage#getActor_InitialMessages()
	 * @model containment="true"
	 * @generated
	 */
	EList<InitialMessage> getInitialMessages();

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
	 * @see sequence.SequencePackage#getActor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sequence.Actor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Actor
