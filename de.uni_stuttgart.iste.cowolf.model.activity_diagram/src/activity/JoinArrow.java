/**
 */
package activity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Arrow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.JoinArrow#getSource <em>Source</em>}</li>
 *   <li>{@link activity.JoinArrow#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getJoinArrow()
 * @model
 * @generated
 */
public interface JoinArrow extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link activity.NodesWithoutJoin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see activity.ActivityPackage#getJoinArrow_Source()
	 * @model lower="2"
	 * @generated
	 */
	EList<NodesWithoutJoin> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Join)
	 * @see activity.ActivityPackage#getJoinArrow_Target()
	 * @model required="true"
	 * @generated
	 */
	Join getTarget();

	/**
	 * Sets the value of the '{@link activity.JoinArrow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Join value);

} // JoinArrow
