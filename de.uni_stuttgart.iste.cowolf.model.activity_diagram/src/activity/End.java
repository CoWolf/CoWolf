/**
 */
package activity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.End#getIncomingToEnd <em>Incoming To End</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getEnd()
 * @model
 * @generated
 */
public interface End extends EObject {
	/**
	 * Returns the value of the '<em><b>Incoming To End</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activity.Arrow#getToEnd <em>To End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming To End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming To End</em>' reference.
	 * @see #setIncomingToEnd(Arrow)
	 * @see activity.ActivityPackage#getEnd_IncomingToEnd()
	 * @see activity.Arrow#getToEnd
	 * @model opposite="toEnd" required="true"
	 * @generated
	 */
	Arrow getIncomingToEnd();

	/**
	 * Sets the value of the '{@link activity.End#getIncomingToEnd <em>Incoming To End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming To End</em>' reference.
	 * @see #getIncomingToEnd()
	 * @generated
	 */
	void setIncomingToEnd(Arrow value);

} // End
