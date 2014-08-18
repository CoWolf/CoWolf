/**
 */
package de.uni_stuttgart.iste.cowolf.model.activity;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.activity.Join#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.activity.ActivityPackage#getJoin()
 * @model
 * @generated
 */
public interface Join extends Nodes, IDBase {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference.
	 * @see #setOutgoing(ArrowAfterJoin)
	 * @see de.uni_stuttgart.iste.cowolf.model.activity.ActivityPackage#getJoin_Outgoing()
	 * @model required="true"
	 * @generated
	 */
	ArrowAfterJoin getOutgoing();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.activity.Join#getOutgoing <em>Outgoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing</em>' reference.
	 * @see #getOutgoing()
	 * @generated
	 */
	void setOutgoing(ArrowAfterJoin value);

} // Join
