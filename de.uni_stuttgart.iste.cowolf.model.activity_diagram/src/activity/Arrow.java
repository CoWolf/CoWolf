/**
 */
package activity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.Arrow#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link activity.Arrow#getFromStart <em>From Start</em>}</li>
 *   <li>{@link activity.Arrow#getToEnd <em>To End</em>}</li>
 *   <li>{@link activity.Arrow#getFromAction <em>From Action</em>}</li>
 *   <li>{@link activity.Arrow#getToAction <em>To Action</em>}</li>
 *   <li>{@link activity.Arrow#getFromSplit <em>From Split</em>}</li>
 *   <li>{@link activity.Arrow#getToSplit <em>To Split</em>}</li>
 *   <li>{@link activity.Arrow#getToJoin <em>To Join</em>}</li>
 *   <li>{@link activity.Arrow#getFromJoin <em>From Join</em>}</li>
 *   <li>{@link activity.Arrow#getToDecision <em>To Decision</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getArrow()
 * @model
 * @generated
 */
public interface Arrow extends EObject {
	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' reference.
	 * @see #setEReference0(Start)
	 * @see activity.ActivityPackage#getArrow_EReference0()
	 * @model
	 * @generated
	 */
	Start getEReference0();

	/**
	 * Sets the value of the '{@link activity.Arrow#getEReference0 <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference0</em>' reference.
	 * @see #getEReference0()
	 * @generated
	 */
	void setEReference0(Start value);

	/**
	 * Returns the value of the '<em><b>From Start</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activity.Start#getOutgoingFromStart <em>Outgoing From Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Start</em>' reference.
	 * @see #setFromStart(Start)
	 * @see activity.ActivityPackage#getArrow_FromStart()
	 * @see activity.Start#getOutgoingFromStart
	 * @model opposite="outgoingFromStart"
	 * @generated
	 */
	Start getFromStart();

	/**
	 * Sets the value of the '{@link activity.Arrow#getFromStart <em>From Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Start</em>' reference.
	 * @see #getFromStart()
	 * @generated
	 */
	void setFromStart(Start value);

	/**
	 * Returns the value of the '<em><b>To End</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activity.End#getIncomingToEnd <em>Incoming To End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To End</em>' reference.
	 * @see #setToEnd(End)
	 * @see activity.ActivityPackage#getArrow_ToEnd()
	 * @see activity.End#getIncomingToEnd
	 * @model opposite="incomingToEnd"
	 * @generated
	 */
	End getToEnd();

	/**
	 * Sets the value of the '{@link activity.Arrow#getToEnd <em>To End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To End</em>' reference.
	 * @see #getToEnd()
	 * @generated
	 */
	void setToEnd(End value);

	/**
	 * Returns the value of the '<em><b>From Action</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activity.Action#getOutgoingFromActionAction <em>Outgoing From Action Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Action</em>' reference.
	 * @see #setFromAction(Action)
	 * @see activity.ActivityPackage#getArrow_FromAction()
	 * @see activity.Action#getOutgoingFromActionAction
	 * @model opposite="outgoingFromActionAction"
	 * @generated
	 */
	Action getFromAction();

	/**
	 * Sets the value of the '{@link activity.Arrow#getFromAction <em>From Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Action</em>' reference.
	 * @see #getFromAction()
	 * @generated
	 */
	void setFromAction(Action value);

	/**
	 * Returns the value of the '<em><b>To Action</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activity.Action#getIncomingToAction <em>Incoming To Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Action</em>' reference.
	 * @see #setToAction(Action)
	 * @see activity.ActivityPackage#getArrow_ToAction()
	 * @see activity.Action#getIncomingToAction
	 * @model opposite="incomingToAction"
	 * @generated
	 */
	Action getToAction();

	/**
	 * Sets the value of the '{@link activity.Arrow#getToAction <em>To Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Action</em>' reference.
	 * @see #getToAction()
	 * @generated
	 */
	void setToAction(Action value);

	/**
	 * Returns the value of the '<em><b>From Split</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activity.Split#getOutgoingFromSplit <em>Outgoing From Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Split</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Split</em>' reference.
	 * @see #setFromSplit(Split)
	 * @see activity.ActivityPackage#getArrow_FromSplit()
	 * @see activity.Split#getOutgoingFromSplit
	 * @model opposite="outgoingFromSplit"
	 * @generated
	 */
	Split getFromSplit();

	/**
	 * Sets the value of the '{@link activity.Arrow#getFromSplit <em>From Split</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Split</em>' reference.
	 * @see #getFromSplit()
	 * @generated
	 */
	void setFromSplit(Split value);

	/**
	 * Returns the value of the '<em><b>To Split</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activity.Split#getIncomingToSplit <em>Incoming To Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Split</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Split</em>' reference.
	 * @see #setToSplit(Split)
	 * @see activity.ActivityPackage#getArrow_ToSplit()
	 * @see activity.Split#getIncomingToSplit
	 * @model opposite="incomingToSplit"
	 * @generated
	 */
	Split getToSplit();

	/**
	 * Sets the value of the '{@link activity.Arrow#getToSplit <em>To Split</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Split</em>' reference.
	 * @see #getToSplit()
	 * @generated
	 */
	void setToSplit(Split value);

	/**
	 * Returns the value of the '<em><b>To Join</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activity.Join#getIncomingToJoin <em>Incoming To Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Join</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Join</em>' reference.
	 * @see #setToJoin(Join)
	 * @see activity.ActivityPackage#getArrow_ToJoin()
	 * @see activity.Join#getIncomingToJoin
	 * @model opposite="incomingToJoin"
	 * @generated
	 */
	Join getToJoin();

	/**
	 * Sets the value of the '{@link activity.Arrow#getToJoin <em>To Join</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Join</em>' reference.
	 * @see #getToJoin()
	 * @generated
	 */
	void setToJoin(Join value);

	/**
	 * Returns the value of the '<em><b>From Join</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activity.Join#getOutgoingFromJoin <em>Outgoing From Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Join</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Join</em>' reference.
	 * @see #setFromJoin(Join)
	 * @see activity.ActivityPackage#getArrow_FromJoin()
	 * @see activity.Join#getOutgoingFromJoin
	 * @model opposite="outgoingFromJoin"
	 * @generated
	 */
	Join getFromJoin();

	/**
	 * Sets the value of the '{@link activity.Arrow#getFromJoin <em>From Join</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Join</em>' reference.
	 * @see #getFromJoin()
	 * @generated
	 */
	void setFromJoin(Join value);

	/**
	 * Returns the value of the '<em><b>To Decision</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activity.Decision#getIncomingToDecision <em>Incoming To Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Decision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Decision</em>' reference.
	 * @see #setToDecision(Decision)
	 * @see activity.ActivityPackage#getArrow_ToDecision()
	 * @see activity.Decision#getIncomingToDecision
	 * @model opposite="incomingToDecision"
	 * @generated
	 */
	Decision getToDecision();

	/**
	 * Sets the value of the '{@link activity.Arrow#getToDecision <em>To Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Decision</em>' reference.
	 * @see #getToDecision()
	 * @generated
	 */
	void setToDecision(Decision value);

} // Arrow
