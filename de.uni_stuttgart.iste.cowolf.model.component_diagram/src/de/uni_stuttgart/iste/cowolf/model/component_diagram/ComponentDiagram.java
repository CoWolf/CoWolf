/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;
import de.uni_stuttgart.iste.cowolf.model.commonBase.NameBase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentDiagram#getComponetContainer <em>Componet Container</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentDiagram#getInterfaceContainer <em>Interface Container</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentDiagram#getDependencyContainer <em>Dependency Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramemfPackage#getComponentDiagram()
 * @model
 * @generated
 */
public interface ComponentDiagram extends IDBase, NameBase {
	/**
	 * Returns the value of the '<em><b>Componet Container</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Component}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Componet Container</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Componet Container</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramemfPackage#getComponentDiagram_ComponetContainer()
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#getDiagram
	 * @model opposite="diagram" containment="true"
	 * @generated
	 */
	EList<Component> getComponetContainer();

	/**
	 * Returns the value of the '<em><b>Interface Container</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Container</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Container</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramemfPackage#getComponentDiagram_InterfaceContainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface> getInterfaceContainer();

	/**
	 * Returns the value of the '<em><b>Dependency Container</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency Container</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency Container</em>' containment reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramemfPackage#getComponentDiagram_DependencyContainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dependency> getDependencyContainer();

} // ComponentDiagram
