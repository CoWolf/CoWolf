/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.CallListType#getSynchCall <em>Synch Call</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.CallListType#getAsynchCall <em>Asynch Call</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getCallListType()
 * @model extendedMetaData="name='call-list_._type' kind='elementOnly'"
 * @generated
 */
public interface CallListType extends IDBase {
	/**
	 * Returns the value of the '<em><b>Synch Call</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.SynchCallType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synch Call</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synch Call</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getCallListType_SynchCall()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='synch-call' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SynchCallType> getSynchCall();

	/**
	 * Returns the value of the '<em><b>Asynch Call</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.AsynchCallType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asynch Call</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asynch Call</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getCallListType_AsynchCall()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='asynch-call' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AsynchCallType> getAsynchCall();

} // CallListType
