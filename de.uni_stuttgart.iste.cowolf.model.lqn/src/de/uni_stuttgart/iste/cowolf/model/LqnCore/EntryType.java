/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getResultEntry <em>Result Entry</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getServiceTimeDistribution <em>Service Time Distribution</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getForwarding <em>Forwarding</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getEntryActivityGraph <em>Entry Activity Graph</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getEntryPhaseActivities <em>Entry Phase Activities</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getOpenArrivalRate <em>Open Arrival Rate</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getSemaphore <em>Semaphore</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getEntryType()
 * @model extendedMetaData="name='EntryType' kind='elementOnly'"
 * @generated
 */
public interface EntryType extends IDBase {
	/**
	 * Returns the value of the '<em><b>Result Entry</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Entry</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getEntryType_ResultEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='result-entry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OutputResultType> getResultEntry();

	/**
	 * Returns the value of the '<em><b>Service Time Distribution</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputEntryDistributionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Time Distribution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Time Distribution</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getEntryType_ServiceTimeDistribution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='service-time-distribution' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OutputEntryDistributionType> getServiceTimeDistribution();

	/**
	 * Returns the value of the '<em><b>Forwarding</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryMakingCallType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forwarding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forwarding</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getEntryType_Forwarding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='forwarding' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntryMakingCallType> getForwarding();

	/**
	 * Returns the value of the '<em><b>Entry Activity Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Activity Graph</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Activity Graph</em>' containment reference.
	 * @see #setEntryActivityGraph(EntryActivityGraph)
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getEntryType_EntryActivityGraph()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entry-activity-graph' namespace='##targetNamespace'"
	 * @generated
	 */
	EntryActivityGraph getEntryActivityGraph();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getEntryActivityGraph <em>Entry Activity Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Activity Graph</em>' containment reference.
	 * @see #getEntryActivityGraph()
	 * @generated
	 */
	void setEntryActivityGraph(EntryActivityGraph value);

	/**
	 * Returns the value of the '<em><b>Entry Phase Activities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Phase Activities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Phase Activities</em>' containment reference.
	 * @see #setEntryPhaseActivities(PhaseActivities)
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getEntryType_EntryPhaseActivities()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entry-phase-activities' namespace='##targetNamespace'"
	 * @generated
	 */
	PhaseActivities getEntryPhaseActivities();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getEntryPhaseActivities <em>Entry Phase Activities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Phase Activities</em>' containment reference.
	 * @see #getEntryPhaseActivities()
	 * @generated
	 */
	void setEntryPhaseActivities(PhaseActivities value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getEntryType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Open Arrival Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open Arrival Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open Arrival Rate</em>' attribute.
	 * @see #setOpenArrivalRate(Object)
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getEntryType_OpenArrivalRate()
	 * @model dataType="de.uni_stuttgart.iste.cowolf.model.LqnCore.SrvnFloat"
	 *        extendedMetaData="kind='attribute' name='open-arrival-rate' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getOpenArrivalRate();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getOpenArrivalRate <em>Open Arrival Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open Arrival Rate</em>' attribute.
	 * @see #getOpenArrivalRate()
	 * @generated
	 */
	void setOpenArrivalRate(Object value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #setPriority(int)
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getEntryType_Priority()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='priority' namespace='##targetNamespace'"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Unsets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriority()
	 * @see #getPriority()
	 * @see #setPriority(int)
	 * @generated
	 */
	void unsetPriority();

	/**
	 * Returns whether the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getPriority <em>Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priority</em>' attribute is set.
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @see #setPriority(int)
	 * @generated
	 */
	boolean isSetPriority();

	/**
	 * Returns the value of the '<em><b>Semaphore</b></em>' attribute.
	 * The default value is <code>"signal"</code>.
	 * The literals are from the enumeration {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.SemaphoreType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semaphore</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semaphore</em>' attribute.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SemaphoreType
	 * @see #isSetSemaphore()
	 * @see #unsetSemaphore()
	 * @see #setSemaphore(SemaphoreType)
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getEntryType_Semaphore()
	 * @model default="signal" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='semaphore' namespace='##targetNamespace'"
	 * @generated
	 */
	SemaphoreType getSemaphore();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getSemaphore <em>Semaphore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semaphore</em>' attribute.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.SemaphoreType
	 * @see #isSetSemaphore()
	 * @see #unsetSemaphore()
	 * @see #getSemaphore()
	 * @generated
	 */
	void setSemaphore(SemaphoreType value);

	/**
	 * Unsets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getSemaphore <em>Semaphore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSemaphore()
	 * @see #getSemaphore()
	 * @see #setSemaphore(SemaphoreType)
	 * @generated
	 */
	void unsetSemaphore();

	/**
	 * Returns whether the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getSemaphore <em>Semaphore</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Semaphore</em>' attribute is set.
	 * @see #unsetSemaphore()
	 * @see #getSemaphore()
	 * @see #setSemaphore(SemaphoreType)
	 * @generated
	 */
	boolean isSetSemaphore();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"PH1PH2"</code>.
	 * The literals are from the enumeration {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType)
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getEntryType_Type()
	 * @model default="PH1PH2" unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeType getType();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType value);

	/**
	 * Unsets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.EntryType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	boolean isSetType();

} // EntryType
