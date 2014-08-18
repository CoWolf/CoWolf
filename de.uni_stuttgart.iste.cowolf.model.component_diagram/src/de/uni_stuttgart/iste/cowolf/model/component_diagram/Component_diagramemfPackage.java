/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram;

import de.uni_stuttgart.iste.cowolf.model.commonBase.CommonBasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramemfFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import commonBase='../../de.uni_stuttgart.iste.cowolf.model/model/CommonBase.ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface Component_diagramemfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "component_diagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ComponentDiagram/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "component_diagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Component_diagramemfPackage eINSTANCE = de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.Component_diagramemfPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ComponentDiagramImpl <em>Component Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ComponentDiagramImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.Component_diagramemfPackageImpl#getComponentDiagram()
	 * @generated
	 */
	int COMPONENT_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DIAGRAM__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DIAGRAM__NAME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Componet Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DIAGRAM__COMPONET_CONTAINER = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interface Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DIAGRAM__INTERFACE_CONTAINER = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dependency Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DIAGRAM__DEPENDENCY_CONTAINER = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DIAGRAM_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Component Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DIAGRAM_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ComponentImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.Component_diagramemfPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = CommonBasePackage.NAME_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = CommonBasePackage.NAME_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__STEREOTYPE = CommonBasePackage.NAME_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Indirectly Instantiated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IS_INDIRECTLY_INSTANTIATED = CommonBasePackage.NAME_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Component Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_CONTAINER = CommonBasePackage.NAME_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PORTS = CommonBasePackage.NAME_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Realization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REALIZATION = CommonBasePackage.NAME_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DIAGRAM = CommonBasePackage.NAME_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>On Depend</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ON_DEPEND = CommonBasePackage.NAME_BASE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = CommonBasePackage.NAME_BASE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = CommonBasePackage.NAME_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.PortImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.Component_diagramemfPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PROTOCOL = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__IS_BEHAVIOR = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__IS_SERVICE = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__REQUIRED_INTERFACES = CommonBasePackage.ID_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PROVIDED_INTERFACES = CommonBasePackage.ID_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Port Host</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PORT_HOST = CommonBasePackage.ID_BASE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.InterfaceImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.Component_diagramemfPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DESCRIPTION = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Home Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__HOME_PORT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.DependencyImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.Component_diagramemfPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__ID = CommonBasePackage.ID_BASE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__NAME = CommonBasePackage.ID_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__SUPPLIER = CommonBasePackage.ID_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__CLIENT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = CommonBasePackage.ID_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = CommonBasePackage.ID_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentStereotype <em>Component Stereotype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentStereotype
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.Component_diagramemfPackageImpl#getComponentStereotype()
	 * @generated
	 */
	int COMPONENT_STEREOTYPE = 5;


	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentDiagram <em>Component Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Diagram</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentDiagram
	 * @generated
	 */
	EClass getComponentDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentDiagram#getComponetContainer <em>Componet Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Componet Container</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentDiagram#getComponetContainer()
	 * @see #getComponentDiagram()
	 * @generated
	 */
	EReference getComponentDiagram_ComponetContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentDiagram#getInterfaceContainer <em>Interface Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Container</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentDiagram#getInterfaceContainer()
	 * @see #getComponentDiagram()
	 * @generated
	 */
	EReference getComponentDiagram_InterfaceContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentDiagram#getDependencyContainer <em>Dependency Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependency Container</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentDiagram#getDependencyContainer()
	 * @see #getComponentDiagram()
	 * @generated
	 */
	EReference getComponentDiagram_DependencyContainer();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#getStereotype()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Stereotype();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#isIsIndirectlyInstantiated <em>Is Indirectly Instantiated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Indirectly Instantiated</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#isIsIndirectlyInstantiated()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_IsIndirectlyInstantiated();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#getComponentContainer <em>Component Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Component Container</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#getComponentContainer()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ComponentContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#getPorts()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Ports();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#getRealization <em>Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realization</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#getRealization()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Realization();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diagram</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#getDiagram()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Diagram();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#getOnDepend <em>On Depend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>On Depend</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Component#getOnDepend()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_OnDepend();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Port#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Port#getProtocol()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Port#isIsBehavior <em>Is Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Behavior</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Port#isIsBehavior()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_IsBehavior();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Port#isIsService <em>Is Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Service</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Port#isIsService()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_IsService();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Port#getRequiredInterfaces <em>Required Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Interfaces</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Port#getRequiredInterfaces()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_RequiredInterfaces();

	/**
	 * Returns the meta object for the reference list '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Port#getProvidedInterfaces <em>Provided Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Interfaces</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Port#getProvidedInterfaces()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_ProvidedInterfaces();

	/**
	 * Returns the meta object for the container reference '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Port#getPortHost <em>Port Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Port Host</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Port#getPortHost()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_PortHost();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Interface#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Interface#getDescription()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Description();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Interface#getHomePort <em>Home Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Home Port</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Interface#getHomePort()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_HomePort();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Dependency#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supplier</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Dependency#getSupplier()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Supplier();

	/**
	 * Returns the meta object for the reference '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Dependency#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.Dependency#getClient()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Client();

	/**
	 * Returns the meta object for enum '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentStereotype <em>Component Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component Stereotype</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentStereotype
	 * @generated
	 */
	EEnum getComponentStereotype();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Component_diagramemfFactory getComponent_diagramemfFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ComponentDiagramImpl <em>Component Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ComponentDiagramImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.Component_diagramemfPackageImpl#getComponentDiagram()
		 * @generated
		 */
		EClass COMPONENT_DIAGRAM = eINSTANCE.getComponentDiagram();

		/**
		 * The meta object literal for the '<em><b>Componet Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DIAGRAM__COMPONET_CONTAINER = eINSTANCE.getComponentDiagram_ComponetContainer();

		/**
		 * The meta object literal for the '<em><b>Interface Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DIAGRAM__INTERFACE_CONTAINER = eINSTANCE.getComponentDiagram_InterfaceContainer();

		/**
		 * The meta object literal for the '<em><b>Dependency Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DIAGRAM__DEPENDENCY_CONTAINER = eINSTANCE.getComponentDiagram_DependencyContainer();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ComponentImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.Component_diagramemfPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__STEREOTYPE = eINSTANCE.getComponent_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Is Indirectly Instantiated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__IS_INDIRECTLY_INSTANTIATED = eINSTANCE.getComponent_IsIndirectlyInstantiated();

		/**
		 * The meta object literal for the '<em><b>Component Container</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__COMPONENT_CONTAINER = eINSTANCE.getComponent_ComponentContainer();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PORTS = eINSTANCE.getComponent_Ports();

		/**
		 * The meta object literal for the '<em><b>Realization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__REALIZATION = eINSTANCE.getComponent_Realization();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__DIAGRAM = eINSTANCE.getComponent_Diagram();

		/**
		 * The meta object literal for the '<em><b>On Depend</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ON_DEPEND = eINSTANCE.getComponent_OnDepend();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.PortImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.Component_diagramemfPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__PROTOCOL = eINSTANCE.getPort_Protocol();

		/**
		 * The meta object literal for the '<em><b>Is Behavior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__IS_BEHAVIOR = eINSTANCE.getPort_IsBehavior();

		/**
		 * The meta object literal for the '<em><b>Is Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__IS_SERVICE = eINSTANCE.getPort_IsService();

		/**
		 * The meta object literal for the '<em><b>Required Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__REQUIRED_INTERFACES = eINSTANCE.getPort_RequiredInterfaces();

		/**
		 * The meta object literal for the '<em><b>Provided Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__PROVIDED_INTERFACES = eINSTANCE.getPort_ProvidedInterfaces();

		/**
		 * The meta object literal for the '<em><b>Port Host</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__PORT_HOST = eINSTANCE.getPort_PortHost();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.InterfaceImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.Component_diagramemfPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__DESCRIPTION = eINSTANCE.getInterface_Description();

		/**
		 * The meta object literal for the '<em><b>Home Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__HOME_PORT = eINSTANCE.getInterface_HomePort();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.DependencyImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.Component_diagramemfPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Supplier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__SUPPLIER = eINSTANCE.getDependency_Supplier();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__CLIENT = eINSTANCE.getDependency_Client();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentStereotype <em>Component Stereotype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentStereotype
		 * @see de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.Component_diagramemfPackageImpl#getComponentStereotype()
		 * @generated
		 */
		EEnum COMPONENT_STEREOTYPE = eINSTANCE.getComponentStereotype();

	}

} //Component_diagramemfPackage
