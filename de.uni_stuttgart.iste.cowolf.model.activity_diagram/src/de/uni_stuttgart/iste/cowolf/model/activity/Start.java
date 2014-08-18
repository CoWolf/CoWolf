/**
 */
package de.uni_stuttgart.iste.cowolf.model.activity;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.activity.Start#getOutgoingFromStart <em>Outgoing From Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.activity.ActivityPackage#getStart()
 * @model
 * @generated
 */
public interface Start extends IDBase {
	/**
	 * Returns the value of the '<em><b>Outgoing From Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing From Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing From Start</em>' reference.
	 * @see #setOutgoingFromStart(ArrowAfterStart)
	 * @see de.uni_stuttgart.iste.cowolf.model.activity.ActivityPackage#getStart_OutgoingFromStart()
	 * @model required="true"
	 * @generated
	 */
	ArrowAfterStart getOutgoingFromStart();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.activity.Start#getOutgoingFromStart <em>Outgoing From Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing From Start</em>' reference.
	 * @see #getOutgoingFromStart()
	 * @generated
	 */
	void setOutgoingFromStart(ArrowAfterStart value);

} // Start
