/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentType#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentType#getPort_types <em>Port types</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentType#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getComponentType()
 * @model abstract="true"
 * @generated
 */
public interface ComponentType extends EObject {
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
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getComponentType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Port types</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.component_diagram.PortType}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.PortType#getComponent_type <em>Component type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port types</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getComponentType_Port_types()
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.PortType#getComponent_type
	 * @model opposite="component_type" containment="true"
	 * @generated
	 */
	EList<PortType> getPort_types();

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getComponentType_Instance()
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance#getType
	 * @model opposite="type"
	 * @generated
	 */
	EList<ComponentInstance> getInstance();

} // ComponentType
