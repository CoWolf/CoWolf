/**
 */
package activity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nodes Without Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.NodesWithoutJoin#getIncomingStart <em>Incoming Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getNodesWithoutJoin()
 * @model abstract="true"
 * @generated
 */
public interface NodesWithoutJoin extends EObject {
	/**
	 * Returns the value of the '<em><b>Incoming Start</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activity.ArrowAfterStart#getTargetAfterStart <em>Target After Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Start</em>' reference.
	 * @see #setIncomingStart(ArrowAfterStart)
	 * @see activity.ActivityPackage#getNodesWithoutJoin_IncomingStart()
	 * @see activity.ArrowAfterStart#getTargetAfterStart
	 * @model opposite="targetAfterStart" required="true"
	 * @generated
	 */
	ArrowAfterStart getIncomingStart();

	/**
	 * Sets the value of the '{@link activity.NodesWithoutJoin#getIncomingStart <em>Incoming Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Start</em>' reference.
	 * @see #getIncomingStart()
	 * @generated
	 */
	void setIncomingStart(ArrowAfterStart value);

} // NodesWithoutJoin
