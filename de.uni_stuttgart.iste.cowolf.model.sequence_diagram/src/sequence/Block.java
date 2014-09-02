/**
 */
package sequence;

import commonBase.IDBase;
import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sequence.Block#getIncludes <em>Includes</em>}</li>
 * </ul>
 * </p>
 *
 * @see sequence.SequencePackage#getBlock()
 * @model abstract="true"
 * @generated
 */
public interface Block extends Container, IDBase {

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' containment reference list.
	 * The list contents are of type {@link sequence.BlockBase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Includes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' containment reference list.
	 * @see sequence.SequencePackage#getBlock_Includes()
	 * @model containment="true"
	 * @generated
	 */
	EList<BlockBase> getIncludes();
} // Block
