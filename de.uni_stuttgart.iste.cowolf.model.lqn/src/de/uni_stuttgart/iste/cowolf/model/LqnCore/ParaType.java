/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Para Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ParaType#getStartValue <em>Start Value</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ParaType#getEndValue <em>End Value</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ParaType#getStepValue <em>Step Value</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ParaType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getParaType()
 * @model extendedMetaData="name='para_._type' kind='elementOnly'"
 * @generated
 */
public interface ParaType extends IDBase {
	/**
	 * Returns the value of the '<em><b>Start Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Value</em>' attribute.
	 * @see #isSetStartValue()
	 * @see #unsetStartValue()
	 * @see #setStartValue(int)
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getParaType_StartValue()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='start-value' namespace='##targetNamespace'"
	 * @generated
	 */
	int getStartValue();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ParaType#getStartValue <em>Start Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Value</em>' attribute.
	 * @see #isSetStartValue()
	 * @see #unsetStartValue()
	 * @see #getStartValue()
	 * @generated
	 */
	void setStartValue(int value);

	/**
	 * Unsets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ParaType#getStartValue <em>Start Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStartValue()
	 * @see #getStartValue()
	 * @see #setStartValue(int)
	 * @generated
	 */
	void unsetStartValue();

	/**
	 * Returns whether the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ParaType#getStartValue <em>Start Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start Value</em>' attribute is set.
	 * @see #unsetStartValue()
	 * @see #getStartValue()
	 * @see #setStartValue(int)
	 * @generated
	 */
	boolean isSetStartValue();

	/**
	 * Returns the value of the '<em><b>End Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Value</em>' attribute.
	 * @see #isSetEndValue()
	 * @see #unsetEndValue()
	 * @see #setEndValue(int)
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getParaType_EndValue()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='end-value' namespace='##targetNamespace'"
	 * @generated
	 */
	int getEndValue();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ParaType#getEndValue <em>End Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Value</em>' attribute.
	 * @see #isSetEndValue()
	 * @see #unsetEndValue()
	 * @see #getEndValue()
	 * @generated
	 */
	void setEndValue(int value);

	/**
	 * Unsets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ParaType#getEndValue <em>End Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndValue()
	 * @see #getEndValue()
	 * @see #setEndValue(int)
	 * @generated
	 */
	void unsetEndValue();

	/**
	 * Returns whether the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ParaType#getEndValue <em>End Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>End Value</em>' attribute is set.
	 * @see #unsetEndValue()
	 * @see #getEndValue()
	 * @see #setEndValue(int)
	 * @generated
	 */
	boolean isSetEndValue();

	/**
	 * Returns the value of the '<em><b>Step Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Value</em>' attribute.
	 * @see #isSetStepValue()
	 * @see #unsetStepValue()
	 * @see #setStepValue(int)
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getParaType_StepValue()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='step-value' namespace='##targetNamespace'"
	 * @generated
	 */
	int getStepValue();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ParaType#getStepValue <em>Step Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Value</em>' attribute.
	 * @see #isSetStepValue()
	 * @see #unsetStepValue()
	 * @see #getStepValue()
	 * @generated
	 */
	void setStepValue(int value);

	/**
	 * Unsets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ParaType#getStepValue <em>Step Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStepValue()
	 * @see #getStepValue()
	 * @see #setStepValue(int)
	 * @generated
	 */
	void unsetStepValue();

	/**
	 * Returns whether the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ParaType#getStepValue <em>Step Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Step Value</em>' attribute is set.
	 * @see #unsetStepValue()
	 * @see #getStepValue()
	 * @see #setStepValue(int)
	 * @generated
	 */
	boolean isSetStepValue();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getParaType_Value()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Integer> getValue();

} // ParaType
