/**
 */
package sequence;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sequence.Alternative#getIncludes <em>Includes</em>}</li>
 * </ul>
 * </p>
 *
 * @see sequence.SequencePackage#getAlternative()
 * @model
 * @generated
 */
public interface Alternative extends EObject {
	/**
	 * Returns the value of the '<em><b>Includes</b></em>' containment reference list.
	 * The list contents are of type {@link sequence.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Includes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' containment reference list.
	 * @see sequence.SequencePackage#getAlternative_Includes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getIncludes();

} // Alternative
