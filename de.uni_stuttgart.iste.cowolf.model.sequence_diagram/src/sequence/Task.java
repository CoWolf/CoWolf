/**
 */
package sequence;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sequence.Task#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link sequence.Task#getIncoming <em>Incoming</em>}</li>
 * </ul>
 * </p>
 *
 * @see sequence.SequencePackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' containment reference list.
	 * The list contents are of type {@link sequence.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' containment reference list.
	 * @see sequence.SequencePackage#getTask_Outgoing()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link sequence.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see sequence.SequencePackage#getTask_Incoming()
	 * @model
	 * @generated
	 */
	EList<Message> getIncoming();
} // Task
