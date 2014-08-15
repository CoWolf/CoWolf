/**
 */
package activity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.Decision#getOutgoingFromDecision <em>Outgoing From Decision</em>}</li>
 *   <li>{@link activity.Decision#getIncomingToDecision <em>Incoming To Decision</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getDecision()
 * @model
 * @generated
 */
public interface Decision extends EObject {
	/**
	 * Returns the value of the '<em><b>Outgoing From Decision</b></em>' reference list.
	 * The list contents are of type {@link activity.ConditionArrow}.
	 * It is bidirectional and its opposite is '{@link activity.ConditionArrow#getFromDecision <em>From Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing From Decision</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing From Decision</em>' reference list.
	 * @see activity.ActivityPackage#getDecision_OutgoingFromDecision()
	 * @see activity.ConditionArrow#getFromDecision
	 * @model opposite="fromDecision" lower="2"
	 * @generated
	 */
	EList<ConditionArrow> getOutgoingFromDecision();

	/**
	 * Returns the value of the '<em><b>Incoming To Decision</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activity.Arrow#getToDecision <em>To Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming To Decision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming To Decision</em>' reference.
	 * @see #setIncomingToDecision(Arrow)
	 * @see activity.ActivityPackage#getDecision_IncomingToDecision()
	 * @see activity.Arrow#getToDecision
	 * @model opposite="toDecision" required="true"
	 * @generated
	 */
	Arrow getIncomingToDecision();

	/**
	 * Sets the value of the '{@link activity.Decision#getIncomingToDecision <em>Incoming To Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming To Decision</em>' reference.
	 * @see #getIncomingToDecision()
	 * @generated
	 */
	void setIncomingToDecision(Arrow value);

} // Decision
