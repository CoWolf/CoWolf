/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Activity Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryActivityGraph#getReplyActivity <em>Reply Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getEntryActivityGraph()
 * @model extendedMetaData="name='EntryActivityGraph' kind='elementOnly'"
 * @generated
 */
public interface EntryActivityGraph extends ActivityGraphBase {
	/**
	 * Returns the value of the '<em><b>Reply Activity</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ReplyActivityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reply Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply Activity</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getEntryActivityGraph_ReplyActivity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reply-activity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReplyActivityType> getReplyActivity();

} // EntryActivityGraph
