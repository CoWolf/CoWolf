/**
 */
package activity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Arrow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.ConditionArrow#getFromDecision <em>From Decision</em>}</li>
 *   <li>{@link activity.ConditionArrow#getToActionFromDecision <em>To Action From Decision</em>}</li>
 *   <li>{@link activity.ConditionArrow#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getConditionArrow()
 * @model
 * @generated
 */
public interface ConditionArrow extends EObject {
	/**
	 * Returns the value of the '<em><b>From Decision</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activity.Decision#getOutgoingFromDecision <em>Outgoing From Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Decision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Decision</em>' reference.
	 * @see #setFromDecision(Decision)
	 * @see activity.ActivityPackage#getConditionArrow_FromDecision()
	 * @see activity.Decision#getOutgoingFromDecision
	 * @model opposite="outgoingFromDecision" required="true"
	 * @generated
	 */
	Decision getFromDecision();

	/**
	 * Sets the value of the '{@link activity.ConditionArrow#getFromDecision <em>From Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Decision</em>' reference.
	 * @see #getFromDecision()
	 * @generated
	 */
	void setFromDecision(Decision value);

	/**
	 * Returns the value of the '<em><b>To Action From Decision</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activity.Action#getIncomingToActionFromDecision <em>Incoming To Action From Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Action From Decision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Action From Decision</em>' reference.
	 * @see #setToActionFromDecision(Action)
	 * @see activity.ActivityPackage#getConditionArrow_ToActionFromDecision()
	 * @see activity.Action#getIncomingToActionFromDecision
	 * @model opposite="incomingToActionFromDecision" required="true"
	 * @generated
	 */
	Action getToActionFromDecision();

	/**
	 * Sets the value of the '{@link activity.ConditionArrow#getToActionFromDecision <em>To Action From Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Action From Decision</em>' reference.
	 * @see #getToActionFromDecision()
	 * @generated
	 */
	void setToActionFromDecision(Action value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see activity.ActivityPackage#getConditionArrow_Condition()
	 * @model required="true"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link activity.ConditionArrow#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

} // ConditionArrow
