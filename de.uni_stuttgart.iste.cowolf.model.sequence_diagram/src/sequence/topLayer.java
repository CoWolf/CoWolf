/**
 */
package sequence;

import commonBase.IDBase;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>top Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sequence.topLayer#getLifelines <em>Lifelines</em>}</li>
 *   <li>{@link sequence.topLayer#getLoopBlocks <em>Loop Blocks</em>}</li>
 *   <li>{@link sequence.topLayer#getAltBlocks <em>Alt Blocks</em>}</li>
 *   <li>{@link sequence.topLayer#getOptBlocks <em>Opt Blocks</em>}</li>
 *   <li>{@link sequence.topLayer#getActors <em>Actors</em>}</li>
 * </ul>
 * </p>
 *
 * @see sequence.SequencePackage#gettopLayer()
 * @model
 * @generated
 */
public interface topLayer extends Container, IDBase {
	/**
	 * Returns the value of the '<em><b>Lifelines</b></em>' containment reference list.
	 * The list contents are of type {@link sequence.Lifeline}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lifelines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifelines</em>' containment reference list.
	 * @see sequence.SequencePackage#gettopLayer_Lifelines()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Lifeline> getLifelines();

	/**
	 * Returns the value of the '<em><b>Loop Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link sequence.LoopBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Blocks</em>' containment reference list.
	 * @see sequence.SequencePackage#gettopLayer_LoopBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<LoopBlock> getLoopBlocks();

	/**
	 * Returns the value of the '<em><b>Alt Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link sequence.AltBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Blocks</em>' containment reference list.
	 * @see sequence.SequencePackage#gettopLayer_AltBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<AltBlock> getAltBlocks();

	/**
	 * Returns the value of the '<em><b>Opt Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link sequence.optBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opt Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opt Blocks</em>' containment reference list.
	 * @see sequence.SequencePackage#gettopLayer_OptBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<optBlock> getOptBlocks();

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link sequence.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see sequence.SequencePackage#gettopLayer_Actors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Actor> getActors();

} // topLayer
