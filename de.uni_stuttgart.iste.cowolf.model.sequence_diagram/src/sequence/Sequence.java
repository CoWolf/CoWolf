/**
 */
package sequence;

import commonBase.IDBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sequence.Sequence#getTopLayer <em>Top Layer</em>}</li>
 * </ul>
 * </p>
 *
 * @see sequence.SequencePackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends IDBase {
	/**
	 * Returns the value of the '<em><b>Top Layer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Layer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Layer</em>' containment reference.
	 * @see #setTopLayer(topLayer)
	 * @see sequence.SequencePackage#getSequence_TopLayer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	topLayer getTopLayer();

	/**
	 * Sets the value of the '{@link sequence.Sequence#getTopLayer <em>Top Layer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Layer</em>' containment reference.
	 * @see #getTopLayer()
	 * @generated
	 */
	void setTopLayer(topLayer value);

} // Sequence
