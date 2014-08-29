/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run Control Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.RunControlType#getPara <em>Para</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getRunControlType()
 * @model extendedMetaData="name='run-control_._type' kind='elementOnly'"
 * @generated
 */
public interface RunControlType extends IDBase {
	/**
	 * Returns the value of the '<em><b>Para</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ParaType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Para</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Para</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getRunControlType_Para()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='para' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParaType> getPara();

} // RunControlType
