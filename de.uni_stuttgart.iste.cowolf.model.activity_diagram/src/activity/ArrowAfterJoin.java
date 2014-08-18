/**
 */
package activity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrow After Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.ArrowAfterJoin#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getArrowAfterJoin()
 * @model
 * @generated
 */
public interface ArrowAfterJoin extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Nodes)
	 * @see activity.ActivityPackage#getArrowAfterJoin_Target()
	 * @model required="true"
	 * @generated
	 */
	Nodes getTarget();

	/**
	 * Sets the value of the '{@link activity.ArrowAfterJoin#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Nodes value);

} // ArrowAfterJoin
