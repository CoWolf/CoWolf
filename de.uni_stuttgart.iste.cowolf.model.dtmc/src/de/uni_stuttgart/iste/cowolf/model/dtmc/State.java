/**
 */
package de.uni_stuttgart.iste.cowolf.model.dtmc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.dtmc.State#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.dtmc.State#isIsStart <em>Is Start</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.dtmc.State#isIsEnd <em>Is End</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.dtmc.State#isIsFail <em>Is Fail</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.dtmc.State#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.dtmc.State#getOutGoing <em>Out Going</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.dtmc.State#getFormalParam <em>Formal Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCemfPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
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
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCemfPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Start</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Start</em>' attribute.
	 * @see #setIsStart(boolean)
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCemfPackage#getState_IsStart()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsStart();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.State#isIsStart <em>Is Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Start</em>' attribute.
	 * @see #isIsStart()
	 * @generated
	 */
	void setIsStart(boolean value);

	/**
	 * Returns the value of the '<em><b>Is End</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is End</em>' attribute.
	 * @see #setIsEnd(boolean)
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCemfPackage#getState_IsEnd()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsEnd();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.State#isIsEnd <em>Is End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is End</em>' attribute.
	 * @see #isIsEnd()
	 * @generated
	 */
	void setIsEnd(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Fail</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Fail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Fail</em>' attribute.
	 * @see #setIsFail(boolean)
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCemfPackage#getState_IsFail()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsFail();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.State#isIsFail <em>Is Fail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Fail</em>' attribute.
	 * @see #isIsFail()
	 * @generated
	 */
	void setIsFail(boolean value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.dtmc.Transition}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCemfPackage#getState_Incoming()
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.Transition#getTo
	 * @model opposite="to" ordered="false"
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Returns the value of the '<em><b>Out Going</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.dtmc.Transition}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Going</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Going</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCemfPackage#getState_OutGoing()
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.Transition#getFrom
	 * @model opposite="from" ordered="false"
	 * @generated
	 */
	EList<Transition> getOutGoing();

	/**
	 * Returns the value of the '<em><b>Formal Param</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.dtmc.Parameter}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.dtmc.Parameter#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Param</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Param</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCemfPackage#getState_FormalParam()
	 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.Parameter#getState
	 * @model opposite="state"
	 * @generated
	 */
	EList<Parameter> getFormalParam();

} // State
