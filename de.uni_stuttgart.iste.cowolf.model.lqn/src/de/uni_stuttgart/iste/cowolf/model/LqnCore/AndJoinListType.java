/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Join List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.AndJoinListType#getActivity <em>Activity</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.AndJoinListType#getQuorum <em>Quorum</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getAndJoinListType()
 * @model extendedMetaData="name='AndJoinListType' kind='elementOnly'"
 * @generated
 */
public interface AndJoinListType extends IDBase {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getAndJoinListType_Activity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='activity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActivityType> getActivity();

	/**
	 * Returns the value of the '<em><b>Quorum</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quorum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quorum</em>' attribute.
	 * @see #isSetQuorum()
	 * @see #unsetQuorum()
	 * @see #setQuorum(BigInteger)
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getAndJoinListType_Quorum()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='quorum' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getQuorum();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.AndJoinListType#getQuorum <em>Quorum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quorum</em>' attribute.
	 * @see #isSetQuorum()
	 * @see #unsetQuorum()
	 * @see #getQuorum()
	 * @generated
	 */
	void setQuorum(BigInteger value);

	/**
	 * Unsets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.AndJoinListType#getQuorum <em>Quorum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuorum()
	 * @see #getQuorum()
	 * @see #setQuorum(BigInteger)
	 * @generated
	 */
	void unsetQuorum();

	/**
	 * Returns whether the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.AndJoinListType#getQuorum <em>Quorum</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quorum</em>' attribute is set.
	 * @see #unsetQuorum()
	 * @see #getQuorum()
	 * @see #setQuorum(BigInteger)
	 * @generated
	 */
	boolean isSetQuorum();

} // AndJoinListType
