/**
 */
package activity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nodes Without Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.NodesWithoutJoin#getJoin <em>Join</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getNodesWithoutJoin()
 * @model abstract="true"
 * @generated
 */
public interface NodesWithoutJoin extends Nodes {
	/**
	 * Returns the value of the '<em><b>Join</b></em>' reference list.
	 * The list contents are of type {@link activity.JoinArrow}.
	 * It is bidirectional and its opposite is '{@link activity.JoinArrow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join</em>' reference list.
	 * @see activity.ActivityPackage#getNodesWithoutJoin_Join()
	 * @see activity.JoinArrow#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<JoinArrow> getJoin();

} // NodesWithoutJoin
