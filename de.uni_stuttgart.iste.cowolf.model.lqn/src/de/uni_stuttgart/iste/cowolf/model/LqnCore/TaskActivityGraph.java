/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Activity Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskActivityGraph#getReplyEntry <em>Reply Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getTaskActivityGraph()
 * @model extendedMetaData="name='TaskActivityGraph' kind='elementOnly'"
 * @generated
 */
public interface TaskActivityGraph extends ActivityGraphBase {
	/**
	 * Returns the value of the '<em><b>Reply Entry</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ReplyEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reply Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply Entry</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getTaskActivityGraph_ReplyEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reply-entry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReplyEntryType> getReplyEntry();

} // TaskActivityGraph
