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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing From Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing From Start</em>' reference.
	 * @see #setOutgoingFromStart(ArrowAfterStart)
	 * @see activity.ActivityPackage#getStart_OutgoingFromStart()
	 * @model required="true"
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

} // Start
