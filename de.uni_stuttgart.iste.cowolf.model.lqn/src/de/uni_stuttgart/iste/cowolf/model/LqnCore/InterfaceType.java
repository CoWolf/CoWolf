/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.InterfaceType#getInPort <em>In Port</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.InterfaceType#getOutPort <em>Out Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getInterfaceType()
 * @model extendedMetaData="name='Interface_._type' kind='elementOnly'"
 * @generated
 */
public interface InterfaceType extends IDBase {
	/**
	 * Returns the value of the '<em><b>In Port</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.InPortType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Port</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getInterfaceType_InPort()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='in-port' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InPortType> getInPort();

	/**
	 * Returns the value of the '<em><b>Out Port</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutPortType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Port</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getInterfaceType_OutPort()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='out-port' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OutPortType> getOutPort();

} // InterfaceType
