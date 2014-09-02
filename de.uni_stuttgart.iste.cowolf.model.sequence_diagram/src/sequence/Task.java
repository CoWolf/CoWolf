/**
 */
package sequence;

import commonBase.IDBase;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sequence.Task#getOutgoingMessages <em>Outgoing Messages</em>}</li>
 *   <li>{@link sequence.Task#getLifeline <em>Lifeline</em>}</li>
 *   <li>{@link sequence.Task#getFrom <em>From</em>}</li>
 *   <li>{@link sequence.Task#getIn <em>In</em>}</li>
 * </ul>
 * </p>
 *
 * @see sequence.SequencePackage#getTask()
 * @model
 * @generated
 */
public interface Task extends IDBase {
	/**
	 * Returns the value of the '<em><b>Outgoing Messages</b></em>' containment reference list.
	 * The list contents are of type {@link sequence.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Messages</em>' containment reference list.
	 * @see sequence.SequencePackage#getTask_OutgoingMessages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getOutgoingMessages();

	/**
	 * Returns the value of the '<em><b>Lifeline</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sequence.Lifeline#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lifeline</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifeline</em>' reference.
	 * @see #setLifeline(Lifeline)
	 * @see sequence.SequencePackage#getTask_Lifeline()
	 * @see sequence.Lifeline#getTasks
	 * @model opposite="tasks" required="true"
	 * @generated
	 */
	Lifeline getLifeline();

	/**
	 * Sets the value of the '{@link sequence.Task#getLifeline <em>Lifeline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifeline</em>' reference.
	 * @see #getLifeline()
	 * @generated
	 */
	void setLifeline(Lifeline value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sequence.MessageBase#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' container reference.
	 * @see #setFrom(MessageBase)
	 * @see sequence.SequencePackage#getTask_From()
	 * @see sequence.MessageBase#getTo
	 * @model opposite="to" required="true" transient="false"
	 * @generated
	 */
	MessageBase getFrom();

	/**
	 * Sets the value of the '{@link sequence.Task#getFrom <em>From</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' container reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(MessageBase value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sequence.Container#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference.
	 * @see #setIn(Container)
	 * @see sequence.SequencePackage#getTask_In()
	 * @see sequence.Container#getTasks
	 * @model opposite="tasks" required="true"
	 * @generated
	 */
	Container getIn();

	/**
	 * Sets the value of the '{@link sequence.Task#getIn <em>In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(Container value);

} // Task
