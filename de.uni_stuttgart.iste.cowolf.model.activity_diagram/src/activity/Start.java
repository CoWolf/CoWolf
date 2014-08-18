/**
 */
package activity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.Start#getOutgoingFromStart <em>Outgoing From Start</em>}</li>
 *   <li>{@link activity.Start#getSuccessor <em>Successor</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getStart()
 * @model
 * @generated
 */
public interface Start extends EObject {
	/**
	 * Returns the value of the '<em><b>Outgoing From Start</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activity.ArrowAfterStart#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing From Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing From Start</em>' reference.
	 * @see #setOutgoingFromStart(ArrowAfterStart)
	 * @see activity.ActivityPackage#getStart_OutgoingFromStart()
	 * @see activity.ArrowAfterStart#getSource
	 * @model opposite="source" required="true"
	 * @generated
	 */
	ArrowAfterStart getOutgoingFromStart();

	/**
	 * Sets the value of the '{@link activity.Start#getOutgoingFromStart <em>Outgoing From Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing From Start</em>' reference.
	 * @see #getOutgoingFromStart()
	 * @generated
	 */
	void setOutgoingFromStart(ArrowAfterStart value);

	/**
	 * Returns the value of the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor</em>' reference.
	 * @see #setSuccessor(NodesWithoutJoin)
	 * @see activity.ActivityPackage#getStart_Successor()
	 * @model
	 * @generated
	 */
	NodesWithoutJoin getSuccessor();

	/**
	 * Sets the value of the '{@link activity.Start#getSuccessor <em>Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successor</em>' reference.
	 * @see #getSuccessor()
	 * @generated
	 */
	void setSuccessor(NodesWithoutJoin value);

} // Start
