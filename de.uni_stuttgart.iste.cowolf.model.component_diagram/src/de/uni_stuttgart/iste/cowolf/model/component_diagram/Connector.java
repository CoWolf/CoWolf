/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Connector#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Connector#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TwoPorts TwoDifferentPorts'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL TwoPorts='self.port->size() = 2' TwoDifferentPorts='self.port->forAll(p1, p2 | p1<>p2 implies (p1.outComponent->size() + p2.outComponent->size() = 1 and p1.inComponent->size() + p2.inComponent->size() = 1))'"
 * @generated
 */
public interface Connector extends EObject {
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
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getConnector_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Connector#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.component_diagram.PortInstance}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.PortInstance#getConnect <em>Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getConnector_Port()
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.PortInstance#getConnect
	 * @model opposite="connect" lower="2" upper="2"
	 * @generated
	 */
	EList<PortInstance> getPort();

} // Connector
