/**
 */
package activity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.Action#getAction <em>Action</em>}</li>
 *   <li>{@link activity.Action#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends NodesWithoutJoin {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see activity.ActivityPackage#getAction_Action()
	 * @model required="true"
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link activity.Action#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference.
	 * @see #setOutgoing(AfterActionArrow)
	 * @see activity.ActivityPackage#getAction_Outgoing()
	 * @model required="true"
	 * @generated
	 */
	AfterActionArrow getOutgoing();

	/**
	 * Sets the value of the '{@link activity.Action#getOutgoing <em>Outgoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing</em>' reference.
	 * @see #getOutgoing()
	 * @generated
	 */
	void setOutgoing(AfterActionArrow value);

} // Action
