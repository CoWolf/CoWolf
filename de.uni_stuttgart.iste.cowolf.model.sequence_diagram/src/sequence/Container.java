/**
 */
package sequence;

import commonBase.IDBase;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sequence.Container#getMessages <em>Messages</em>}</li>
 *   <li>{@link sequence.Container#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see sequence.SequencePackage#getContainer()
 * @model abstract="true"
 * @generated
 */
public interface Container extends IDBase {
	/**
	 * Returns the value of the '<em><b>Messages</b></em>' reference list.
	 * The list contents are of type {@link sequence.Message}.
	 * It is bidirectional and its opposite is '{@link sequence.Message#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' reference list.
	 * @see sequence.SequencePackage#getContainer_Messages()
	 * @see sequence.Message#getIn
	 * @model opposite="in"
	 * @generated
	 */
	EList<Message> getMessages();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link sequence.Task}.
	 * It is bidirectional and its opposite is '{@link sequence.Task#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see sequence.SequencePackage#getContainer_Tasks()
	 * @see sequence.Task#getIn
	 * @model opposite="in"
	 * @generated
	 */
	EList<Task> getTasks();

} // Container
