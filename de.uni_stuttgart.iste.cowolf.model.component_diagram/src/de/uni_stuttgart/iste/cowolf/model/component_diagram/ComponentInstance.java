/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance#getSubcomponent <em>Subcomponent</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance#getParentcomponent <em>Parentcomponent</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance#getInPorts <em>In Ports</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance#getOutPorts <em>Out Ports</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance#getType <em>Type</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getComponentInstance()
 * @model
 * @generated
 */
public interface ComponentInstance extends IDBase {
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
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getComponentInstance_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Subcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance#getParentcomponent <em>Parentcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subcomponent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subcomponent</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getComponentInstance_Subcomponent()
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance#getParentcomponent
	 * @model opposite="parentcomponent" containment="true"
	 * @generated
	 */
	EList<ComponentInstance> getSubcomponent();

	/**
	 * Returns the value of the '<em><b>Parentcomponent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance#getSubcomponent <em>Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parentcomponent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parentcomponent</em>' container reference.
	 * @see #setParentcomponent(ComponentInstance)
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getComponentInstance_Parentcomponent()
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance#getSubcomponent
	 * @model opposite="subcomponent" transient="false"
	 * @generated
	 */
	ComponentInstance getParentcomponent();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance#getParentcomponent <em>Parentcomponent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parentcomponent</em>' container reference.
	 * @see #getParentcomponent()
	 * @generated
	 */
	void setParentcomponent(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>In Ports</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.component_diagram.PortInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.PortInstance#getInComponent <em>In Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Ports</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getComponentInstance_InPorts()
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.PortInstance#getInComponent
	 * @model opposite="inComponent" containment="true"
	 * @generated
	 */
	EList<PortInstance> getInPorts();

	/**
	 * Returns the value of the '<em><b>Out Ports</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.component_diagram.PortInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.PortInstance#getOutComponent <em>Out Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Ports</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getComponentInstance_OutPorts()
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.PortInstance#getOutComponent
	 * @model opposite="outComponent" containment="true"
	 * @generated
	 */
	EList<PortInstance> getOutPorts();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentType#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ComponentType)
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getComponentInstance_Type()
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentType#getInstance
	 * @model opposite="instance" required="true"
	 * @generated
	 */
	ComponentType getType();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ComponentType value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(int)
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getComponentInstance_Version()
	 * @model default="0"
	 * @generated
	 */
	int getVersion();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(int value);

} // ComponentInstance
