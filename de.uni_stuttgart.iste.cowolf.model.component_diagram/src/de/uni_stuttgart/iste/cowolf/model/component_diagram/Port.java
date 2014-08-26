/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;
import de.uni_stuttgart.iste.cowolf.model.commonBase.NameBase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Port#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Port#isIsBehavior <em>Is Behavior</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Port#isIsService <em>Is Service</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Port#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Port#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Port#getPortHost <em>Port Host</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends IDBase, NameBase {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getPort_Protocol()
	 * @model
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Port#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Is Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Behavior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Behavior</em>' attribute.
	 * @see #setIsBehavior(boolean)
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getPort_IsBehavior()
	 * @model
	 * @generated
	 */
	boolean isIsBehavior();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Port#isIsBehavior <em>Is Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Behavior</em>' attribute.
	 * @see #isIsBehavior()
	 * @generated
	 */
	void setIsBehavior(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Service</em>' attribute.
	 * @see #setIsService(boolean)
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getPort_IsService()
	 * @model
	 * @generated
	 */
	boolean isIsService();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Port#isIsService <em>Is Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Service</em>' attribute.
	 * @see #isIsService()
	 * @generated
	 */
	void setIsService(boolean value);

	/**
	 * Returns the value of the '<em><b>Required Interfaces</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Interfaces</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getPort_RequiredInterfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getRequiredInterfaces();

	/**
	 * Returns the value of the '<em><b>Provided Interfaces</b></em>' reference list.
	 * The list contents are of type {@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Interface}.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Interface#getHomePort <em>Home Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Interfaces</em>' reference list.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getPort_ProvidedInterfaces()
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Interface#getHomePort
	 * @model opposite="homePort"
	 * @generated
	 */
	EList<Interface> getProvidedInterfaces();

	/**
	 * Returns the value of the '<em><b>Port Host</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Host</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Host</em>' container reference.
	 * @see #setPortHost(Component)
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage#getPort_PortHost()
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#getPorts
	 * @model opposite="ports" transient="false"
	 * @generated
	 */
	Component getPortHost();

	/**
	 * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Port#getPortHost <em>Port Host</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Host</em>' container reference.
	 * @see #getPortHost()
	 * @generated
	 */
	void setPortHost(Component value);

} // Port
