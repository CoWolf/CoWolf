/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.HardwareComponent#getPowerSupply <em>Power Supply</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getHardwareComponent()
 * @model
 * @generated
 */
public interface HardwareComponent extends ComponentType {
	/**
	 * Returns the value of the '<em><b>Power Supply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Supply</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Supply</em>' attribute.
	 * @see #setPowerSupply(String)
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getHardwareComponent_PowerSupply()
	 * @model
	 * @generated
	 */
	String getPowerSupply();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.HardwareComponent#getPowerSupply <em>Power Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Supply</em>' attribute.
	 * @see #getPowerSupply()
	 * @generated
	 */
	void setPowerSupply(String value);

} // HardwareComponent
