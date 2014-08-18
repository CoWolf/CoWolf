/**
 */
package activity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.Decision#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getDecision()
 * @model
 * @generated
 */
public interface Decision extends NodesWithoutJoin {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link activity.DecisionArrow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see activity.ActivityPackage#getDecision_Outgoing()
	 * @model lower="2"
	 * @generated
	 */
	EList<DecisionArrow> getOutgoing();

} // Decision
