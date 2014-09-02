/**
 */
package sequence;

import commonBase.IDBase;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lifeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sequence.Lifeline#getName <em>Name</em>}</li>
 *   <li>{@link sequence.Lifeline#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see sequence.SequencePackage#getLifeline()
 * @model
 * @generated
 */
public interface Lifeline extends IDBase {
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
	 * @see sequence.SequencePackage#getLifeline_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sequence.Lifeline#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link sequence.Task}.
	 * It is bidirectional and its opposite is '{@link sequence.Task#getLifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see sequence.SequencePackage#getLifeline_Tasks()
	 * @see sequence.Task#getLifeline
	 * @model opposite="lifeline"
	 * @generated
	 */
	EList<Task> getTasks();

} // Lifeline
