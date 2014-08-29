/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Def Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefType#getCallList <em>Call List</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefType#getGroup <em>Group</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefType#getSynchCall <em>Synch Call</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefType#getAsynchCall <em>Asynch Call</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefType#getBoundToEntry <em>Bound To Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getActivityDefType()
 * @model extendedMetaData="name='ActivityDefType' kind='elementOnly'"
 * @generated
 */
public interface ActivityDefType extends ActivityDefBase {
	/**
	 * Returns the value of the '<em><b>Call List</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.CallListType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call List</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getActivityDefType_CallList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='call-list' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CallListType> getCallList();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getActivityDefType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:11'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Synch Call</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityMakingCallType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synch Call</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synch Call</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getActivityDefType_SynchCall()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='synch-call' namespace='##targetNamespace' group='group:11'"
	 * @generated
	 */
	EList<ActivityMakingCallType> getSynchCall();

	/**
	 * Returns the value of the '<em><b>Asynch Call</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityMakingCallType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asynch Call</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asynch Call</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getActivityDefType_AsynchCall()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='asynch-call' namespace='##targetNamespace' group='group:11'"
	 * @generated
	 */
	EList<ActivityMakingCallType> getAsynchCall();

	/**
	 * Returns the value of the '<em><b>Bound To Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound To Entry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound To Entry</em>' attribute.
	 * @see #setBoundToEntry(String)
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getActivityDefType_BoundToEntry()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='bound-to-entry' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBoundToEntry();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefType#getBoundToEntry <em>Bound To Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound To Entry</em>' attribute.
	 * @see #getBoundToEntry()
	 * @generated
	 */
	void setBoundToEntry(String value);

} // ActivityDefType
