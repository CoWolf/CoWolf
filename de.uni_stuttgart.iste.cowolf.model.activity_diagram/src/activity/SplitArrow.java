/**
 */
package activity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Split Arrow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.SplitArrow#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getSplitArrow()
 * @model
 * @generated
 */
public interface SplitArrow extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(NodesWithoutJoin)
	 * @see activity.ActivityPackage#getSplitArrow_Target()
	 * @model required="true"
	 * @generated
	 */
	NodesWithoutJoin getTarget();

	/**
	 * Sets the value of the '{@link activity.SplitArrow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(NodesWithoutJoin value);

} // SplitArrow
