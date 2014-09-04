/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram;

import org.eclipse.emf.ecore.EObject;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.PortInstance#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.PortInstance#getConnect <em>Connect</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.PortInstance#getOutComponent <em>Out Component</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.PortInstance#getInComponent <em>In Component</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.PortInstance#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getPortInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ExactlyOneConnector ExactlyOneComponent'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ExactlyOneConnector='self.connect->size() = 1' ExactlyOneComponent='self.outComponent->size() + self.inComponent->size() = 1'"
 * @generated
 */
public interface PortInstance extends EObject, IDBase {
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
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getPortInstance_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.PortInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Connect</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Connector#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect</em>' reference.
	 * @see #setConnect(Connector)
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getPortInstance_Connect()
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Connector#getPort
	 * @model opposite="port"
	 * @generated
	 */
	Connector getConnect();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.PortInstance#getConnect <em>Connect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect</em>' reference.
	 * @see #getConnect()
	 * @generated
	 */
	void setConnect(Connector value);

	/**
	 * Returns the value of the '<em><b>Out Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance#getOutPorts <em>Out Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Component</em>' container reference.
	 * @see #setOutComponent(ComponentInstance)
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getPortInstance_OutComponent()
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance#getOutPorts
	 * @model opposite="outPorts" transient="false"
	 * @generated
	 */
	ComponentInstance getOutComponent();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.PortInstance#getOutComponent <em>Out Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Component</em>' container reference.
	 * @see #getOutComponent()
	 * @generated
	 */
	void setOutComponent(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>In Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance#getInPorts <em>In Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Component</em>' container reference.
	 * @see #setInComponent(ComponentInstance)
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getPortInstance_InComponent()
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentInstance#getInPorts
	 * @model opposite="inPorts" transient="false"
	 * @generated
	 */
	ComponentInstance getInComponent();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.PortInstance#getInComponent <em>In Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Component</em>' container reference.
	 * @see #getInComponent()
	 * @generated
	 */
	void setInComponent(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.PortType#getPort_instance <em>Port instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(PortType)
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getPortInstance_Type()
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.PortType#getPort_instance
	 * @model opposite="port_instance" required="true"
	 * @generated
	 */
	PortType getType();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.PortInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(PortType value);

} // PortInstance
