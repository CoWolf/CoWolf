/**
 */
package activity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.Join#getIncomingToJoin <em>Incoming To Join</em>}</li>
 *   <li>{@link activity.Join#getOutgoingFromJoin <em>Outgoing From Join</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getJoin()
 * @model
 * @generated
 */
public interface Join extends Bar {
	/**
	 * Returns the value of the '<em><b>Incoming To Join</b></em>' reference list.
	 * The list contents are of type {@link activity.Arrow}.
	 * It is bidirectional and its opposite is '{@link activity.Arrow#getToJoin <em>To Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming To Join</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming To Join</em>' reference list.
	 * @see activity.ActivityPackage#getJoin_IncomingToJoin()
	 * @see activity.Arrow#getToJoin
	 * @model opposite="toJoin" lower="2"
	 * @generated
	 */
	EList<Arrow> getIncomingToJoin();

	/**
	 * Returns the value of the '<em><b>Outgoing From Join</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activity.Arrow#getFromJoin <em>From Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing From Join</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing From Join</em>' reference.
	 * @see #setOutgoingFromJoin(Arrow)
	 * @see activity.ActivityPackage#getJoin_OutgoingFromJoin()
	 * @see activity.Arrow#getFromJoin
	 * @model opposite="fromJoin" required="true"
	 * @generated
	 */
	Arrow getOutgoingFromJoin();

	/**
	 * Sets the value of the '{@link activity.Join#getOutgoingFromJoin <em>Outgoing From Join</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing From Join</em>' reference.
	 * @see #getOutgoingFromJoin()
	 * @generated
	 */
	void setOutgoingFromJoin(Arrow value);

} // Join
