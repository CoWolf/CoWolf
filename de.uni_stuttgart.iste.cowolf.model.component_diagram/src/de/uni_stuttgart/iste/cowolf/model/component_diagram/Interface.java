/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;
import de.uni_stuttgart.iste.cowolf.model.commonBase.NameBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Interface#getDescription <em>Description</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Interface#getHomePort <em>Home Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramemfPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends IDBase, NameBase {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramemfPackage#getInterface_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Interface#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Home Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Port#getProvidedInterfaces <em>Provided Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Home Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Port</em>' reference.
	 * @see #setHomePort(Port)
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramemfPackage#getInterface_HomePort()
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Port#getProvidedInterfaces
	 * @model opposite="providedInterfaces"
	 * @generated
	 */
	Port getHomePort();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Interface#getHomePort <em>Home Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Port</em>' reference.
	 * @see #getHomePort()
	 * @generated
	 */
	void setHomePort(Port value);

} // Interface
