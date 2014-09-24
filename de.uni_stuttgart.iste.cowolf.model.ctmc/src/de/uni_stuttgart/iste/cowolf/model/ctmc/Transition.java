/**
 */
package de.uni_stuttgart.iste.cowolf.model.ctmc;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.ctmc.Transition#getFrom <em>From</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.ctmc.Transition#getTo <em>To</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.ctmc.Transition#getProb <em>Prob</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.ctmc.Transition#getRate <em>Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.ctmc.CtmcPackage#getTransition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ProbBetween0and1'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ProbBetween0and1='Tuple {\n\tmessage : String = \'Probability must be between 0 and 1.\',\n\tstatus : Boolean = \n            prob >= 0.0 and prob <= 1.0\n}.status'"
 * @generated
 */
public interface Transition extends IDBase {
	/**
	 * Returns the value of the '<em><b>From</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.State#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' container reference.
	 * @see #setFrom(State)
	 * @see de.uni_stuttgart.iste.cowolf.model.ctmc.CtmcPackage#getTransition_From()
	 * @see de.uni_stuttgart.iste.cowolf.model.ctmc.State#getOutgoing
	 * @model opposite="outgoing" required="true" transient="false"
	 * @generated
	 */
	State getFrom();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.Transition#getFrom <em>From</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' container reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(State value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.State#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(State)
	 * @see de.uni_stuttgart.iste.cowolf.model.ctmc.CtmcPackage#getTransition_To()
	 * @see de.uni_stuttgart.iste.cowolf.model.ctmc.State#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	State getTo();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.Transition#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(State value);

	/**
	 * Returns the value of the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prob</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prob</em>' attribute.
	 * @see #setProb(float)
	 * @see de.uni_stuttgart.iste.cowolf.model.ctmc.CtmcPackage#getTransition_Prob()
	 * @model required="true"
	 * @generated
	 */
	float getProb();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.Transition#getProb <em>Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prob</em>' attribute.
	 * @see #getProb()
	 * @generated
	 */
	void setProb(float value);

	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(float)
	 * @see de.uni_stuttgart.iste.cowolf.model.ctmc.CtmcPackage#getTransition_Rate()
	 * @model required="true" transient="true" volatile="true"
	 * @generated
	 */
	float getRate();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.Transition#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(float value);

} // Transition
