/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Def Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getResultJoinDelay <em>Result Join Delay</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getResultForwarding <em>Result Forwarding</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getServiceTimeDistribution <em>Service Time Distribution</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getResultActivity <em>Result Activity</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getCallOrder <em>Call Order</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getHostDemandCvsq <em>Host Demand Cvsq</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getHostDemandMean <em>Host Demand Mean</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getMaxServiceTime <em>Max Service Time</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getThinkTime <em>Think Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getActivityDefBase()
 * @model extendedMetaData="name='ActivityDefBase' kind='elementOnly'"
 * @generated
 */
public interface ActivityDefBase extends IDBase {
	/**
	 * Returns the value of the '<em><b>Result Join Delay</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultForwardingANDJoinDelay}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Join Delay</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Join Delay</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getActivityDefBase_ResultJoinDelay()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='result-join-delay' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OutputResultForwardingANDJoinDelay> getResultJoinDelay();

	/**
	 * Returns the value of the '<em><b>Result Forwarding</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultForwardingANDJoinDelay}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Forwarding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Forwarding</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getActivityDefBase_ResultForwarding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='result-forwarding' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OutputResultForwardingANDJoinDelay> getResultForwarding();

	/**
	 * Returns the value of the '<em><b>Service Time Distribution</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputDistributionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Time Distribution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Time Distribution</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getActivityDefBase_ServiceTimeDistribution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='service-time-distribution' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OutputDistributionType> getServiceTimeDistribution();

	/**
	 * Returns the value of the '<em><b>Result Activity</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.OutputResultType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Activity</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getActivityDefBase_ResultActivity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='result-activity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OutputResultType> getResultActivity();

	/**
	 * Returns the value of the '<em><b>Call Order</b></em>' attribute.
	 * The default value is <code>"STOCHASTIC"</code>.
	 * The literals are from the enumeration {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.CallOrderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Order</em>' attribute.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.CallOrderType
	 * @see #isSetCallOrder()
	 * @see #unsetCallOrder()
	 * @see #setCallOrder(CallOrderType)
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getActivityDefBase_CallOrder()
	 * @model default="STOCHASTIC" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='call-order' namespace='##targetNamespace'"
	 * @generated
	 */
	CallOrderType getCallOrder();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getCallOrder <em>Call Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Order</em>' attribute.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.CallOrderType
	 * @see #isSetCallOrder()
	 * @see #unsetCallOrder()
	 * @see #getCallOrder()
	 * @generated
	 */
	void setCallOrder(CallOrderType value);

	/**
	 * Unsets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getCallOrder <em>Call Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCallOrder()
	 * @see #getCallOrder()
	 * @see #setCallOrder(CallOrderType)
	 * @generated
	 */
	void unsetCallOrder();

	/**
	 * Returns whether the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getCallOrder <em>Call Order</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Call Order</em>' attribute is set.
	 * @see #unsetCallOrder()
	 * @see #getCallOrder()
	 * @see #setCallOrder(CallOrderType)
	 * @generated
	 */
	boolean isSetCallOrder();

	/**
	 * Returns the value of the '<em><b>Host Demand Cvsq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Demand Cvsq</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Demand Cvsq</em>' attribute.
	 * @see #setHostDemandCvsq(Object)
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getActivityDefBase_HostDemandCvsq()
	 * @model dataType="de.uni_stuttgart.iste.cowolf.model.LqnCore.SrvnFloat"
	 *        extendedMetaData="kind='attribute' name='host-demand-cvsq' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getHostDemandCvsq();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getHostDemandCvsq <em>Host Demand Cvsq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Demand Cvsq</em>' attribute.
	 * @see #getHostDemandCvsq()
	 * @generated
	 */
	void setHostDemandCvsq(Object value);

	/**
	 * Returns the value of the '<em><b>Host Demand Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Demand Mean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Demand Mean</em>' attribute.
	 * @see #setHostDemandMean(Object)
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getActivityDefBase_HostDemandMean()
	 * @model dataType="de.uni_stuttgart.iste.cowolf.model.LqnCore.SrvnFloat" required="true"
	 *        extendedMetaData="kind='attribute' name='host-demand-mean' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getHostDemandMean();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getHostDemandMean <em>Host Demand Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Demand Mean</em>' attribute.
	 * @see #getHostDemandMean()
	 * @generated
	 */
	void setHostDemandMean(Object value);

	/**
	 * Returns the value of the '<em><b>Max Service Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Service Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Service Time</em>' attribute.
	 * @see #setMaxServiceTime(Object)
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getActivityDefBase_MaxServiceTime()
	 * @model dataType="de.uni_stuttgart.iste.cowolf.model.LqnCore.SrvnFloat"
	 *        extendedMetaData="kind='attribute' name='max-service-time' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getMaxServiceTime();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getMaxServiceTime <em>Max Service Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Service Time</em>' attribute.
	 * @see #getMaxServiceTime()
	 * @generated
	 */
	void setMaxServiceTime(Object value);

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
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getActivityDefBase_Name()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Think Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Think Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Think Time</em>' attribute.
	 * @see #setThinkTime(Object)
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getActivityDefBase_ThinkTime()
	 * @model dataType="de.uni_stuttgart.iste.cowolf.model.LqnCore.SrvnFloat"
	 *        extendedMetaData="kind='attribute' name='think-time' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getThinkTime();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase#getThinkTime <em>Think Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Think Time</em>' attribute.
	 * @see #getThinkTime()
	 * @generated
	 */
	void setThinkTime(Object value);

} // ActivityDefBase
