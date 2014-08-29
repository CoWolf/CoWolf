/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Graph Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityGraphBase#getActivity <em>Activity</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityGraphBase#getPrecedence <em>Precedence</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getActivityGraphBase()
 * @model extendedMetaData="name='ActivityGraphBase' kind='elementOnly'"
 * @generated
 */
public interface ActivityGraphBase extends IDBase {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getActivityGraphBase_Activity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='activity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActivityDefType> getActivity();

	/**
	 * Returns the value of the '<em><b>Precedence</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.PrecedenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precedence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedence</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getActivityGraphBase_Precedence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='precedence' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PrecedenceType> getPrecedence();

} // ActivityGraphBase
