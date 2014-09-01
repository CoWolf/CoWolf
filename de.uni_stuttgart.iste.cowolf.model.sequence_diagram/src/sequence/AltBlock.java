/**
 */
package sequence;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alt Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sequence.AltBlock#getAlternative <em>Alternative</em>}</li>
 * </ul>
 * </p>
 *
 * @see sequence.SequencePackage#getAltBlock()
 * @model
 * @generated
 */
public interface AltBlock extends Block {

	/**
	 * Returns the value of the '<em><b>Alternative</b></em>' containment reference list.
	 * The list contents are of type {@link sequence.Alternative}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative</em>' containment reference list.
	 * @see sequence.SequencePackage#getAltBlock_Alternative()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Alternative> getAlternative();
} // AltBlock
