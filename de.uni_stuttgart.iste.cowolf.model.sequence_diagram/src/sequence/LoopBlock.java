/**
 */
package sequence;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sequence.LoopBlock#getInclude <em>Include</em>}</li>
 * </ul>
 * </p>
 *
 * @see sequence.SequencePackage#getLoopBlock()
 * @model
 * @generated
 */
public interface LoopBlock extends Block {

	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference list.
	 * The list contents are of type {@link sequence.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' containment reference list.
	 * @see sequence.SequencePackage#getLoopBlock_Include()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getInclude();
} // LoopBlock
