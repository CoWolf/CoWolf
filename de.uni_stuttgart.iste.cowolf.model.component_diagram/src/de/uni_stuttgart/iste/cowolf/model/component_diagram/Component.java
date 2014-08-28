/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;
import de.uni_stuttgart.iste.cowolf.model.commonBase.NameBase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#isIsIndirectlyInstantiated <em>Is Indirectly Instantiated</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#getComponentContainer <em>Component Container</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#getPorts <em>Ports</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#getRealization <em>Realization</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#getOnDepend <em>On Depend</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getComponent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ComponentCantRealizieItself DontRequireOwnInterfaces'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ComponentCantRealizieItself='self <> self.realization' DontRequireOwnInterfaces='self.ports.requiredInterfaces.homePort.portHost -> forAll(\n\t\t\tcomponent | component <> self\n\t\t) or self.ports.requiredInterfaces.homePort.portHost -> size() = 0'"
 * @generated
 */
public interface Component extends NameBase, IDBase {
	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentStereotype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype</em>' attribute.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentStereotype
	 * @see #setStereotype(ComponentStereotype)
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getComponent_Stereotype()
	 * @model
	 * @generated
	 */
	ComponentStereotype getStereotype();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#getStereotype <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' attribute.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentStereotype
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(ComponentStereotype value);

	/**
	 * Returns the value of the '<em><b>Is Indirectly Instantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Indirectly Instantiated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Indirectly Instantiated</em>' attribute.
	 * @see #setIsIndirectlyInstantiated(boolean)
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getComponent_IsIndirectlyInstantiated()
	 * @model
	 * @generated
	 */
	boolean isIsIndirectlyInstantiated();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#isIsIndirectlyInstantiated <em>Is Indirectly Instantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Indirectly Instantiated</em>' attribute.
	 * @see #isIsIndirectlyInstantiated()
	 * @generated
	 */
	void setIsIndirectlyInstantiated(boolean value);

	/**
	 * Returns the value of the '<em><b>Component Container</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Container</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Container</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getComponent_ComponentContainer()
	 * @model
	 * @generated
	 */
	EList<Component> getComponentContainer();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Port}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Port#getPortHost <em>Port Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getComponent_Ports()
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Port#getPortHost
	 * @model opposite="portHost" containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Realization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realization</em>' reference.
	 * @see #setRealization(Component)
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getComponent_Realization()
	 * @model
	 * @generated
	 */
	Component getRealization();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#getRealization <em>Realization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realization</em>' reference.
	 * @see #getRealization()
	 * @generated
	 */
	void setRealization(Component value);

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentDiagram#getComponetContainer <em>Componet Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see #setDiagram(ComponentDiagram)
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getComponent_Diagram()
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentDiagram#getComponetContainer
	 * @model opposite="componetContainer" required="true" transient="false"
	 * @generated
	 */
	ComponentDiagram getDiagram();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#getDiagram <em>Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' container reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram(ComponentDiagram value);

	/**
	 * Returns the value of the '<em><b>On Depend</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Dependency}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Dependency#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Depend</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Depend</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getComponent_OnDepend()
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Dependency#getSupplier
	 * @model opposite="supplier"
	 * @generated
	 */
	EList<Dependency> getOnDepend();

} // Component
