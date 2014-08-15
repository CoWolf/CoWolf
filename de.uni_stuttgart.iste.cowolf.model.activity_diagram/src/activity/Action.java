/**
 */
package activity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.Action#getIncomingToAction <em>Incoming To Action</em>}</li>
 *   <li>{@link activity.Action#getAction <em>Action</em>}</li>
 *   <li>{@link activity.Action#getOutgoingFromActionAction <em>Outgoing From Action Action</em>}</li>
 *   <li>{@link activity.Action#getIncomingToActionFromDecision <em>Incoming To Action From Decision</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Incoming To Action</b></em>' reference list.
	 * The list contents are of type {@link activity.Arrow}.
	 * It is bidirectional and its opposite is '{@link activity.Arrow#getToAction <em>To Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming To Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming To Action</em>' reference list.
	 * @see activity.ActivityPackage#getAction_IncomingToAction()
	 * @see activity.Arrow#getToAction
	 * @model opposite="toAction" required="true"
	 * @generated
	 */
	EList<Arrow> getIncomingToAction();

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
	 * Returns the value of the '<em><b>Outgoing From Action Action</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activity.Arrow#getFromAction <em>From Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing From Action Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing From Action Action</em>' reference.
	 * @see #setOutgoingFromActionAction(Arrow)
	 * @see activity.ActivityPackage#getAction_OutgoingFromActionAction()
	 * @see activity.Arrow#getFromAction
	 * @model opposite="fromAction" required="true"
	 * @generated
	 */
	Arrow getOutgoingFromActionAction();

	/**
	 * Sets the value of the '{@link activity.Action#getOutgoingFromActionAction <em>Outgoing From Action Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing From Action Action</em>' reference.
	 * @see #getOutgoingFromActionAction()
	 * @generated
	 */
	void setOutgoingFromActionAction(Arrow value);

	/**
	 * Returns the value of the '<em><b>Incoming To Action From Decision</b></em>' reference list.
	 * The list contents are of type {@link activity.ConditionArrow}.
	 * It is bidirectional and its opposite is '{@link activity.ConditionArrow#getToActionFromDecision <em>To Action From Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming To Action From Decision</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming To Action From Decision</em>' reference list.
	 * @see activity.ActivityPackage#getAction_IncomingToActionFromDecision()
	 * @see activity.ConditionArrow#getToActionFromDecision
	 * @model opposite="toActionFromDecision" required="true"
	 * @generated
	 */
	EList<ConditionArrow> getIncomingToActionFromDecision();

} // Action
