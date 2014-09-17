/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>First Plot Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.FirstPlotType#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getFirstPlotType()
 * @model extendedMetaData="name='first-plot_._type' kind='empty'"
 * @generated
 */
public interface FirstPlotType extends IDBase {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage#getFirstPlotType_Variable()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='variable' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.FirstPlotType#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

} // FirstPlotType
