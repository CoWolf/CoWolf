/**
 */
package activity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.Join#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getJoin()
 * @model
 * @generated
 */
public interface Join extends Nodes {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference.
	 * @see #setOutgoing(ArrowAfterJoin)
	 * @see activity.ActivityPackage#getJoin_Outgoing()
	 * @model required="true"
	 * @generated
	 */
	ArrowAfterJoin getOutgoing();

	/**
	 * Sets the value of the '{@link activity.Join#getOutgoing <em>Outgoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing</em>' reference.
	 * @see #getOutgoing()
	 * @generated
	 */
	void setOutgoing(ArrowAfterJoin value);

} // Join
