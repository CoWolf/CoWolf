/**
 */
package activity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrow After Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.ArrowAfterStart#getSource <em>Source</em>}</li>
 *   <li>{@link activity.ArrowAfterStart#getTargetAfterStart <em>Target After Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getArrowAfterStart()
 * @model
 * @generated
 */
public interface ArrowAfterStart extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activity.Start#getOutgoingFromStart <em>Outgoing From Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Start)
	 * @see activity.ActivityPackage#getArrowAfterStart_Source()
	 * @see activity.Start#getOutgoingFromStart
	 * @model opposite="outgoingFromStart" required="true"
	 * @generated
	 */
	Start getSource();

	/**
	 * Sets the value of the '{@link activity.ArrowAfterStart#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Start value);

	/**
	 * Returns the value of the '<em><b>Target After Start</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activity.NodesWithoutJoin#getIncomingStart <em>Incoming Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target After Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target After Start</em>' reference.
	 * @see #setTargetAfterStart(NodesWithoutJoin)
	 * @see activity.ActivityPackage#getArrowAfterStart_TargetAfterStart()
	 * @see activity.NodesWithoutJoin#getIncomingStart
	 * @model opposite="incomingStart" required="true"
	 * @generated
	 */
	NodesWithoutJoin getTargetAfterStart();

	/**
	 * Sets the value of the '{@link activity.ArrowAfterStart#getTargetAfterStart <em>Target After Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target After Start</em>' reference.
	 * @see #getTargetAfterStart()
	 * @generated
	 */
	void setTargetAfterStart(NodesWithoutJoin value);

} // ArrowAfterStart
