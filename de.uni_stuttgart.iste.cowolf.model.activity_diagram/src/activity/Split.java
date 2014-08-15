/**
 */
package activity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Split</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.Split#getOutgoingFromSplit <em>Outgoing From Split</em>}</li>
 *   <li>{@link activity.Split#getIncomingToSplit <em>Incoming To Split</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getSplit()
 * @model
 * @generated
 */
public interface Split extends Bar {
	/**
	 * Returns the value of the '<em><b>Outgoing From Split</b></em>' reference list.
	 * The list contents are of type {@link activity.Arrow}.
	 * It is bidirectional and its opposite is '{@link activity.Arrow#getFromSplit <em>From Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing From Split</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing From Split</em>' reference list.
	 * @see activity.ActivityPackage#getSplit_OutgoingFromSplit()
	 * @see activity.Arrow#getFromSplit
	 * @model opposite="fromSplit" lower="2"
	 * @generated
	 */
	EList<Arrow> getOutgoingFromSplit();

	/**
	 * Returns the value of the '<em><b>Incoming To Split</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activity.Arrow#getToSplit <em>To Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming To Split</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming To Split</em>' reference.
	 * @see #setIncomingToSplit(Arrow)
	 * @see activity.ActivityPackage#getSplit_IncomingToSplit()
	 * @see activity.Arrow#getToSplit
	 * @model opposite="toSplit" required="true"
	 * @generated
	 */
	Arrow getIncomingToSplit();

	/**
	 * Sets the value of the '{@link activity.Split#getIncomingToSplit <em>Incoming To Split</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming To Split</em>' reference.
	 * @see #getIncomingToSplit()
	 * @generated
	 */
	void setIncomingToSplit(Arrow value);

} // Split
