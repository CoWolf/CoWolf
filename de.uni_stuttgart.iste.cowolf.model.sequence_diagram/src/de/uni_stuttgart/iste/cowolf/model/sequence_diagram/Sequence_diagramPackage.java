/**
 */
package de.uni_stuttgart.iste.cowolf.model.sequence_diagram;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.uml2.uml.UMLPackage;

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
 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramFactory
 * @model kind="package"
 * @generated
 */
public interface Sequence_diagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sequence_diagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sequence_diagram/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sequence_diagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Sequence_diagramPackage eINSTANCE = de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.Sequence_diagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.MessageImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.Sequence_diagramPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 5;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.MessageOccurenceSpecificationImpl <em>Message Occurence Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.MessageOccurenceSpecificationImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.Sequence_diagramPackageImpl#getMessageOccurenceSpecification()
	 * @generated
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION = 6;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.BehaviorExecutionSpecificationImpl <em>Behavior Execution Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.BehaviorExecutionSpecificationImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.Sequence_diagramPackageImpl#getBehaviorExecutionSpecification()
	 * @generated
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION = 7;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.OpaqueBehaviorImpl <em>Opaque Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.OpaqueBehaviorImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.Sequence_diagramPackageImpl#getOpaqueBehavior()
	 * @generated
	 */
	int OPAQUE_BEHAVIOR = 8;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.LifelineImpl <em>Lifeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.LifelineImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.Sequence_diagramPackageImpl#getLifeline()
	 * @generated
	 */
	int LIFELINE = 10;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.ActorImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.Sequence_diagramPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 3;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.OperationImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.Sequence_diagramPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 4;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.InteractionImpl <em>Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.InteractionImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.Sequence_diagramPackageImpl#getInteraction()
	 * @generated
	 */
	int INTERACTION = 2;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.PackageImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.Sequence_diagramPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__EANNOTATIONS = UMLPackage.PACKAGE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_COMMENT = UMLPackage.PACKAGE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_ELEMENT = UMLPackage.PACKAGE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNER = UMLPackage.PACKAGE__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CLIENT_DEPENDENCY = UMLPackage.PACKAGE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = UMLPackage.PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME_EXPRESSION = UMLPackage.PACKAGE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAMESPACE = UMLPackage.PACKAGE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__QUALIFIED_NAME = UMLPackage.PACKAGE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__VISIBILITY = UMLPackage.PACKAGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_RULE = UMLPackage.PACKAGE__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ELEMENT_IMPORT = UMLPackage.PACKAGE__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGE_IMPORT = UMLPackage.PACKAGE__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_MEMBER = UMLPackage.PACKAGE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IMPORTED_MEMBER = UMLPackage.PACKAGE__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MEMBER = UMLPackage.PACKAGE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNING_TEMPLATE_PARAMETER = UMLPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TEMPLATE_PARAMETER = UMLPackage.PACKAGE__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TEMPLATE_BINDING = UMLPackage.PACKAGE__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_TEMPLATE_SIGNATURE = UMLPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__URI = UMLPackage.PACKAGE__URI;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NESTED_PACKAGE = UMLPackage.PACKAGE__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NESTING_PACKAGE = UMLPackage.PACKAGE__NESTING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Stereotype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_STEREOTYPE = UMLPackage.PACKAGE__OWNED_STEREOTYPE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNED_TYPE = UMLPackage.PACKAGE__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Package Merge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGE_MERGE = UMLPackage.PACKAGE__PACKAGE_MERGE;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGED_ELEMENT = UMLPackage.PACKAGE__PACKAGED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Profile Application</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PROFILE_APPLICATION = UMLPackage.PACKAGE__PROFILE_APPLICATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ID = UMLPackage.PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = UMLPackage.PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_EANNOTATION__STRING = UMLPackage.PACKAGE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.PACKAGE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.PACKAGE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___ADD_KEYWORD__STRING = UMLPackage.PACKAGE___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.PACKAGE___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___CREATE_EANNOTATION__STRING = UMLPackage.PACKAGE___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___DESTROY = UMLPackage.PACKAGE___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_KEYWORDS = UMLPackage.PACKAGE___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.PACKAGE___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_APPLICABLE_STEREOTYPES = UMLPackage.PACKAGE___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.PACKAGE___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_APPLIED_STEREOTYPES = UMLPackage.PACKAGE___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.PACKAGE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.PACKAGE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_MODEL = UMLPackage.PACKAGE___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_NEAREST_PACKAGE = UMLPackage.PACKAGE___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_RELATIONSHIPS = UMLPackage.PACKAGE___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_RELATIONSHIPS__ECLASS = UMLPackage.PACKAGE___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.PACKAGE___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_REQUIRED_STEREOTYPES = UMLPackage.PACKAGE___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.PACKAGE___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.PACKAGE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.PACKAGE___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_STEREOTYPE_APPLICATIONS = UMLPackage.PACKAGE___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.PACKAGE___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.PACKAGE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_VALUE__STEREOTYPE_STRING = UMLPackage.PACKAGE___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___HAS_KEYWORD__STRING = UMLPackage.PACKAGE___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.PACKAGE___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.PACKAGE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.PACKAGE___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.PACKAGE___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___REMOVE_KEYWORD__STRING = UMLPackage.PACKAGE___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.PACKAGE___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.PACKAGE___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___ALL_OWNED_ELEMENTS = UMLPackage.PACKAGE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___MUST_BE_OWNED = UMLPackage.PACKAGE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.PACKAGE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.PACKAGE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.PACKAGE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.PACKAGE___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___CREATE_USAGE__NAMEDELEMENT = UMLPackage.PACKAGE___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_LABEL = UMLPackage.PACKAGE___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_LABEL__BOOLEAN = UMLPackage.PACKAGE___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_NAMESPACE = UMLPackage.PACKAGE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___ALL_NAMESPACES = UMLPackage.PACKAGE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___ALL_OWNING_PACKAGES = UMLPackage.PACKAGE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.PACKAGE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_QUALIFIED_NAME = UMLPackage.PACKAGE___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___SEPARATOR = UMLPackage.PACKAGE___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_CLIENT_DEPENDENCIES = UMLPackage.PACKAGE___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = UMLPackage.PACKAGE___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.PACKAGE___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP = UMLPackage.PACKAGE___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Element Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = UMLPackage.PACKAGE___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Create Package Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = UMLPackage.PACKAGE___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Get Imported Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_IMPORTED_ELEMENTS = UMLPackage.PACKAGE___GET_IMPORTED_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Imported Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_IMPORTED_PACKAGES = UMLPackage.PACKAGE___GET_IMPORTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_OWNED_MEMBERS = UMLPackage.PACKAGE___GET_OWNED_MEMBERS;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___EXCLUDE_COLLISIONS__ELIST = UMLPackage.PACKAGE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_NAMES_OF_MEMBER__NAMEDELEMENT = UMLPackage.PACKAGE___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___IMPORT_MEMBERS__ELIST = UMLPackage.PACKAGE___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Get Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_IMPORTED_MEMBERS = UMLPackage.PACKAGE___GET_IMPORTED_MEMBERS;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___MEMBERS_ARE_DISTINGUISHABLE = UMLPackage.PACKAGE___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = UMLPackage.PACKAGE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___IS_TEMPLATE_PARAMETER = UMLPackage.PACKAGE___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Validate Namespace Needs Visibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP = UMLPackage.PACKAGE___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___IS_TEMPLATE = UMLPackage.PACKAGE___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___PARAMETERABLE_ELEMENTS = UMLPackage.PACKAGE___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate Elements Public Or Private</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___VALIDATE_ELEMENTS_PUBLIC_OR_PRIVATE__DIAGNOSTICCHAIN_MAP = UMLPackage.PACKAGE___VALIDATE_ELEMENTS_PUBLIC_OR_PRIVATE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Apply Profile</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___APPLY_PROFILE__PROFILE = UMLPackage.PACKAGE___APPLY_PROFILE__PROFILE;

	/**
	 * The operation id for the '<em>Create Owned Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___CREATE_OWNED_CLASS__STRING_BOOLEAN = UMLPackage.PACKAGE___CREATE_OWNED_CLASS__STRING_BOOLEAN;

	/**
	 * The operation id for the '<em>Create Owned Enumeration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___CREATE_OWNED_ENUMERATION__STRING = UMLPackage.PACKAGE___CREATE_OWNED_ENUMERATION__STRING;

	/**
	 * The operation id for the '<em>Create Owned Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___CREATE_OWNED_INTERFACE__STRING = UMLPackage.PACKAGE___CREATE_OWNED_INTERFACE__STRING;

	/**
	 * The operation id for the '<em>Create Owned Primitive Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___CREATE_OWNED_PRIMITIVE_TYPE__STRING = UMLPackage.PACKAGE___CREATE_OWNED_PRIMITIVE_TYPE__STRING;

	/**
	 * The operation id for the '<em>Create Owned Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___CREATE_OWNED_STEREOTYPE__STRING_BOOLEAN = UMLPackage.PACKAGE___CREATE_OWNED_STEREOTYPE__STRING_BOOLEAN;

	/**
	 * The operation id for the '<em>Get All Applied Profiles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_ALL_APPLIED_PROFILES = UMLPackage.PACKAGE___GET_ALL_APPLIED_PROFILES;

	/**
	 * The operation id for the '<em>Get All Profile Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_ALL_PROFILE_APPLICATIONS = UMLPackage.PACKAGE___GET_ALL_PROFILE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Applied Profile</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_APPLIED_PROFILE__STRING = UMLPackage.PACKAGE___GET_APPLIED_PROFILE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Profile</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_APPLIED_PROFILE__STRING_BOOLEAN = UMLPackage.PACKAGE___GET_APPLIED_PROFILE__STRING_BOOLEAN;

	/**
	 * The operation id for the '<em>Get Applied Profiles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_APPLIED_PROFILES = UMLPackage.PACKAGE___GET_APPLIED_PROFILES;

	/**
	 * The operation id for the '<em>Get Profile Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_PROFILE_APPLICATION__PROFILE = UMLPackage.PACKAGE___GET_PROFILE_APPLICATION__PROFILE;

	/**
	 * The operation id for the '<em>Get Profile Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_PROFILE_APPLICATION__PROFILE_BOOLEAN = UMLPackage.PACKAGE___GET_PROFILE_APPLICATION__PROFILE_BOOLEAN;

	/**
	 * The operation id for the '<em>Is Model Library</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___IS_MODEL_LIBRARY = UMLPackage.PACKAGE___IS_MODEL_LIBRARY;

	/**
	 * The operation id for the '<em>Is Profile Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___IS_PROFILE_APPLIED__PROFILE = UMLPackage.PACKAGE___IS_PROFILE_APPLIED__PROFILE;

	/**
	 * The operation id for the '<em>Unapply Profile</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___UNAPPLY_PROFILE__PROFILE = UMLPackage.PACKAGE___UNAPPLY_PROFILE__PROFILE;

	/**
	 * The operation id for the '<em>All Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___ALL_APPLICABLE_STEREOTYPES = UMLPackage.PACKAGE___ALL_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Containing Profile</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___CONTAINING_PROFILE = UMLPackage.PACKAGE___CONTAINING_PROFILE;

	/**
	 * The operation id for the '<em>Makes Visible</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___MAKES_VISIBLE__NAMEDELEMENT = UMLPackage.PACKAGE___MAKES_VISIBLE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Nested Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_NESTED_PACKAGES = UMLPackage.PACKAGE___GET_NESTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_OWNED_STEREOTYPES = UMLPackage.PACKAGE___GET_OWNED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Owned Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_OWNED_TYPES = UMLPackage.PACKAGE___GET_OWNED_TYPES;

	/**
	 * The operation id for the '<em>Visible Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___VISIBLE_MEMBERS = UMLPackage.PACKAGE___VISIBLE_MEMBERS;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = UMLPackage.PACKAGE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.ClassImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.Sequence_diagramPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__EANNOTATIONS = UMLPackage.CLASS__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_COMMENT = UMLPackage.CLASS__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_ELEMENT = UMLPackage.CLASS__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNER = UMLPackage.CLASS__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CLIENT_DEPENDENCY = UMLPackage.CLASS__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = UMLPackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME_EXPRESSION = UMLPackage.CLASS__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAMESPACE = UMLPackage.CLASS__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__QUALIFIED_NAME = UMLPackage.CLASS__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__VISIBILITY = UMLPackage.CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_RULE = UMLPackage.CLASS__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ELEMENT_IMPORT = UMLPackage.CLASS__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PACKAGE_IMPORT = UMLPackage.CLASS__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_MEMBER = UMLPackage.CLASS__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IMPORTED_MEMBER = UMLPackage.CLASS__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__MEMBER = UMLPackage.CLASS__MEMBER;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_LEAF = UMLPackage.CLASS__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__REDEFINED_ELEMENT = UMLPackage.CLASS__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__REDEFINITION_CONTEXT = UMLPackage.CLASS__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNING_TEMPLATE_PARAMETER = UMLPackage.CLASS__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TEMPLATE_PARAMETER = UMLPackage.CLASS__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PACKAGE = UMLPackage.CLASS__PACKAGE;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TEMPLATE_BINDING = UMLPackage.CLASS__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_TEMPLATE_SIGNATURE = UMLPackage.CLASS__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FEATURE = UMLPackage.CLASS__FEATURE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ATTRIBUTE = UMLPackage.CLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__COLLABORATION_USE = UMLPackage.CLASS__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__GENERAL = UMLPackage.CLASS__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__GENERALIZATION = UMLPackage.CLASS__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__POWERTYPE_EXTENT = UMLPackage.CLASS__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__INHERITED_MEMBER = UMLPackage.CLASS__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_ABSTRACT = UMLPackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_FINAL_SPECIALIZATION = UMLPackage.CLASS__IS_FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_USE_CASE = UMLPackage.CLASS__OWNED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__USE_CASE = UMLPackage.CLASS__USE_CASE;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__REDEFINED_CLASSIFIER = UMLPackage.CLASS__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__REPRESENTATION = UMLPackage.CLASS__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUBSTITUTION = UMLPackage.CLASS__SUBSTITUTION;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_ATTRIBUTE = UMLPackage.CLASS__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_CONNECTOR = UMLPackage.CLASS__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__PART = UMLPackage.CLASS__PART;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ROLE = UMLPackage.CLASS__ROLE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_PORT = UMLPackage.CLASS__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CLASSIFIER_BEHAVIOR = UMLPackage.CLASS__CLASSIFIER_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__INTERFACE_REALIZATION = UMLPackage.CLASS__INTERFACE_REALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_BEHAVIOR = UMLPackage.CLASS__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_OPERATION = UMLPackage.CLASS__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__EXTENSION = UMLPackage.CLASS__EXTENSION;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_ACTIVE = UMLPackage.CLASS__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NESTED_CLASSIFIER = UMLPackage.CLASS__NESTED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_RECEPTION = UMLPackage.CLASS__OWNED_RECEPTION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUPER_CLASS = UMLPackage.CLASS__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ID = UMLPackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = UMLPackage.CLASS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_EANNOTATION__STRING = UMLPackage.CLASS___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___ADD_KEYWORD__STRING = UMLPackage.CLASS___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.CLASS___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___CREATE_EANNOTATION__STRING = UMLPackage.CLASS___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___DESTROY = UMLPackage.CLASS___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_KEYWORDS = UMLPackage.CLASS___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.CLASS___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_APPLICABLE_STEREOTYPES = UMLPackage.CLASS___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.CLASS___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_APPLIED_STEREOTYPES = UMLPackage.CLASS___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.CLASS___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.CLASS___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_MODEL = UMLPackage.CLASS___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_NEAREST_PACKAGE = UMLPackage.CLASS___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_RELATIONSHIPS = UMLPackage.CLASS___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_RELATIONSHIPS__ECLASS = UMLPackage.CLASS___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.CLASS___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_REQUIRED_STEREOTYPES = UMLPackage.CLASS___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.CLASS___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.CLASS___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.CLASS___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_STEREOTYPE_APPLICATIONS = UMLPackage.CLASS___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.CLASS___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.CLASS___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_VALUE__STEREOTYPE_STRING = UMLPackage.CLASS___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___HAS_KEYWORD__STRING = UMLPackage.CLASS___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.CLASS___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.CLASS___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.CLASS___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.CLASS___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___REMOVE_KEYWORD__STRING = UMLPackage.CLASS___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.CLASS___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.CLASS___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___ALL_OWNED_ELEMENTS = UMLPackage.CLASS___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___MUST_BE_OWNED = UMLPackage.CLASS___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.CLASS___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___CREATE_USAGE__NAMEDELEMENT = UMLPackage.CLASS___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_LABEL = UMLPackage.CLASS___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_LABEL__BOOLEAN = UMLPackage.CLASS___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_NAMESPACE = UMLPackage.CLASS___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___ALL_NAMESPACES = UMLPackage.CLASS___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___ALL_OWNING_PACKAGES = UMLPackage.CLASS___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.CLASS___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_QUALIFIED_NAME = UMLPackage.CLASS___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___SEPARATOR = UMLPackage.CLASS___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_CLIENT_DEPENDENCIES = UMLPackage.CLASS___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Element Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = UMLPackage.CLASS___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Create Package Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = UMLPackage.CLASS___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Get Imported Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_IMPORTED_ELEMENTS = UMLPackage.CLASS___GET_IMPORTED_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Imported Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_IMPORTED_PACKAGES = UMLPackage.CLASS___GET_IMPORTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_OWNED_MEMBERS = UMLPackage.CLASS___GET_OWNED_MEMBERS;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___EXCLUDE_COLLISIONS__ELIST = UMLPackage.CLASS___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_NAMES_OF_MEMBER__NAMEDELEMENT = UMLPackage.CLASS___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IMPORT_MEMBERS__ELIST = UMLPackage.CLASS___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Get Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_IMPORTED_MEMBERS = UMLPackage.CLASS___GET_IMPORTED_MEMBERS;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___MEMBERS_ARE_DISTINGUISHABLE = UMLPackage.CLASS___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Validate Redefinition Consistent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Leaf Redefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = UMLPackage.CLASS___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = UMLPackage.CLASS___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = UMLPackage.CLASS___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_TEMPLATE_PARAMETER = UMLPackage.CLASS___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Validate Namespace Needs Visibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Association</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT = UMLPackage.CLASS___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT;

	/**
	 * The operation id for the '<em>Get Associations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_ASSOCIATIONS = UMLPackage.CLASS___GET_ASSOCIATIONS;

	/**
	 * The operation id for the '<em>Conforms To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___CONFORMS_TO__TYPE = UMLPackage.CLASS___CONFORMS_TO__TYPE;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_TEMPLATE = UMLPackage.CLASS___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___PARAMETERABLE_ELEMENTS = UMLPackage.CLASS___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Maps To Generalization Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Final Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate No Cycles In Generalization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_ALL_ATTRIBUTES = UMLPackage.CLASS___GET_ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get All Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_ALL_OPERATIONS = UMLPackage.CLASS___GET_ALL_OPERATIONS;

	/**
	 * The operation id for the '<em>Get All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_ALL_USED_INTERFACES = UMLPackage.CLASS___GET_ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_OPERATION__STRING_ELIST_ELIST = UMLPackage.CLASS___GET_OPERATION__STRING_ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN = UMLPackage.CLASS___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN;

	/**
	 * The operation id for the '<em>Get Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_OPERATIONS = UMLPackage.CLASS___GET_OPERATIONS;

	/**
	 * The operation id for the '<em>Get Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_USED_INTERFACES = UMLPackage.CLASS___GET_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___ALL_FEATURES = UMLPackage.CLASS___ALL_FEATURES;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___ALL_PARENTS = UMLPackage.CLASS___ALL_PARENTS;

	/**
	 * The operation id for the '<em>Get Generals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_GENERALS = UMLPackage.CLASS___GET_GENERALS;

	/**
	 * The operation id for the '<em>Has Visibility Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___HAS_VISIBILITY_OF__NAMEDELEMENT = UMLPackage.CLASS___HAS_VISIBILITY_OF__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Inherit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___INHERIT__ELIST = UMLPackage.CLASS___INHERIT__ELIST;

	/**
	 * The operation id for the '<em>Inheritable Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___INHERITABLE_MEMBERS__CLASSIFIER = UMLPackage.CLASS___INHERITABLE_MEMBERS__CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Inherited Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_INHERITED_MEMBERS = UMLPackage.CLASS___GET_INHERITED_MEMBERS;

	/**
	 * The operation id for the '<em>May Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___MAY_SPECIALIZE_TYPE__CLASSIFIER = UMLPackage.CLASS___MAY_SPECIALIZE_TYPE__CLASSIFIER;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___PARENTS = UMLPackage.CLASS___PARENTS;

	/**
	 * The operation id for the '<em>Directly Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___DIRECTLY_REALIZED_INTERFACES = UMLPackage.CLASS___DIRECTLY_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>Directly Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___DIRECTLY_USED_INTERFACES = UMLPackage.CLASS___DIRECTLY_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___ALL_REALIZED_INTERFACES = UMLPackage.CLASS___ALL_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___ALL_USED_INTERFACES = UMLPackage.CLASS___ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Is Substitutable For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_SUBSTITUTABLE_FOR__CLASSIFIER = UMLPackage.CLASS___IS_SUBSTITUTABLE_FOR__CLASSIFIER;

	/**
	 * The operation id for the '<em>All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___ALL_ATTRIBUTES = UMLPackage.CLASS___ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>All Slottable Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___ALL_SLOTTABLE_FEATURES = UMLPackage.CLASS___ALL_SLOTTABLE_FEATURES;

	/**
	 * The operation id for the '<em>Create Owned Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT = UMLPackage.CLASS___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_PARTS = UMLPackage.CLASS___GET_PARTS;

	/**
	 * The operation id for the '<em>All Roles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___ALL_ROLES = UMLPackage.CLASS___ALL_ROLES;

	/**
	 * The operation id for the '<em>Get Owned Ports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_OWNED_PORTS = UMLPackage.CLASS___GET_OWNED_PORTS;

	/**
	 * The operation id for the '<em>Validate Class Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get All Implemented Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_ALL_IMPLEMENTED_INTERFACES = UMLPackage.CLASS___GET_ALL_IMPLEMENTED_INTERFACES;

	/**
	 * The operation id for the '<em>Get Implemented Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_IMPLEMENTED_INTERFACES = UMLPackage.CLASS___GET_IMPLEMENTED_INTERFACES;

	/**
	 * The operation id for the '<em>Validate Passive Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP = UMLPackage.CLASS___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Owned Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE = UMLPackage.CLASS___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE;

	/**
	 * The operation id for the '<em>Is Metaclass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_METACLASS = UMLPackage.CLASS___IS_METACLASS;

	/**
	 * The operation id for the '<em>Get Extensions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_EXTENSIONS = UMLPackage.CLASS___GET_EXTENSIONS;

	/**
	 * The operation id for the '<em>Get Super Classes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_SUPER_CLASSES = UMLPackage.CLASS___GET_SUPER_CLASSES;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = UMLPackage.CLASS_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__EANNOTATIONS = UMLPackage.INTERACTION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_COMMENT = UMLPackage.INTERACTION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_ELEMENT = UMLPackage.INTERACTION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNER = UMLPackage.INTERACTION__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__CLIENT_DEPENDENCY = UMLPackage.INTERACTION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__NAME = UMLPackage.INTERACTION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__NAME_EXPRESSION = UMLPackage.INTERACTION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__NAMESPACE = UMLPackage.INTERACTION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__QUALIFIED_NAME = UMLPackage.INTERACTION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__VISIBILITY = UMLPackage.INTERACTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_RULE = UMLPackage.INTERACTION__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__ELEMENT_IMPORT = UMLPackage.INTERACTION__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__PACKAGE_IMPORT = UMLPackage.INTERACTION__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_MEMBER = UMLPackage.INTERACTION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__IMPORTED_MEMBER = UMLPackage.INTERACTION__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__MEMBER = UMLPackage.INTERACTION__MEMBER;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__IS_LEAF = UMLPackage.INTERACTION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__REDEFINED_ELEMENT = UMLPackage.INTERACTION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__REDEFINITION_CONTEXT = UMLPackage.INTERACTION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNING_TEMPLATE_PARAMETER = UMLPackage.INTERACTION__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__TEMPLATE_PARAMETER = UMLPackage.INTERACTION__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__PACKAGE = UMLPackage.INTERACTION__PACKAGE;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__TEMPLATE_BINDING = UMLPackage.INTERACTION__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_TEMPLATE_SIGNATURE = UMLPackage.INTERACTION__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__FEATURE = UMLPackage.INTERACTION__FEATURE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__ATTRIBUTE = UMLPackage.INTERACTION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__COLLABORATION_USE = UMLPackage.INTERACTION__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__GENERAL = UMLPackage.INTERACTION__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__GENERALIZATION = UMLPackage.INTERACTION__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__POWERTYPE_EXTENT = UMLPackage.INTERACTION__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__INHERITED_MEMBER = UMLPackage.INTERACTION__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__IS_ABSTRACT = UMLPackage.INTERACTION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__IS_FINAL_SPECIALIZATION = UMLPackage.INTERACTION__IS_FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_USE_CASE = UMLPackage.INTERACTION__OWNED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__USE_CASE = UMLPackage.INTERACTION__USE_CASE;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__REDEFINED_CLASSIFIER = UMLPackage.INTERACTION__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__REPRESENTATION = UMLPackage.INTERACTION__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__SUBSTITUTION = UMLPackage.INTERACTION__SUBSTITUTION;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_ATTRIBUTE = UMLPackage.INTERACTION__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_CONNECTOR = UMLPackage.INTERACTION__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__PART = UMLPackage.INTERACTION__PART;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__ROLE = UMLPackage.INTERACTION__ROLE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_PORT = UMLPackage.INTERACTION__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__CLASSIFIER_BEHAVIOR = UMLPackage.INTERACTION__CLASSIFIER_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__INTERFACE_REALIZATION = UMLPackage.INTERACTION__INTERFACE_REALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_BEHAVIOR = UMLPackage.INTERACTION__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_OPERATION = UMLPackage.INTERACTION__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__EXTENSION = UMLPackage.INTERACTION__EXTENSION;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__IS_ACTIVE = UMLPackage.INTERACTION__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__NESTED_CLASSIFIER = UMLPackage.INTERACTION__NESTED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_RECEPTION = UMLPackage.INTERACTION__OWNED_RECEPTION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__SUPER_CLASS = UMLPackage.INTERACTION__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__SPECIFICATION = UMLPackage.INTERACTION__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__CONTEXT = UMLPackage.INTERACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__IS_REENTRANT = UMLPackage.INTERACTION__IS_REENTRANT;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_PARAMETER = UMLPackage.INTERACTION__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__OWNED_PARAMETER_SET = UMLPackage.INTERACTION__OWNED_PARAMETER_SET;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__POSTCONDITION = UMLPackage.INTERACTION__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__PRECONDITION = UMLPackage.INTERACTION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Redefined Behavior</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__REDEFINED_BEHAVIOR = UMLPackage.INTERACTION__REDEFINED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__COVERED = UMLPackage.INTERACTION__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__ENCLOSING_OPERAND = UMLPackage.INTERACTION__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__ENCLOSING_INTERACTION = UMLPackage.INTERACTION__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__GENERAL_ORDERING = UMLPackage.INTERACTION__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Lifeline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__LIFELINE = UMLPackage.INTERACTION__LIFELINE;

	/**
	 * The feature id for the '<em><b>Fragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__FRAGMENT = UMLPackage.INTERACTION__FRAGMENT;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__ACTION = UMLPackage.INTERACTION__ACTION;

	/**
	 * The feature id for the '<em><b>Formal Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__FORMAL_GATE = UMLPackage.INTERACTION__FORMAL_GATE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__MESSAGE = UMLPackage.INTERACTION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__ID = UMLPackage.INTERACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE_COUNT = UMLPackage.INTERACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_EANNOTATION__STRING = UMLPackage.INTERACTION___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERACTION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERACTION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___ADD_KEYWORD__STRING = UMLPackage.INTERACTION___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.INTERACTION___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___CREATE_EANNOTATION__STRING = UMLPackage.INTERACTION___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___DESTROY = UMLPackage.INTERACTION___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_KEYWORDS = UMLPackage.INTERACTION___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.INTERACTION___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_APPLICABLE_STEREOTYPES = UMLPackage.INTERACTION___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.INTERACTION___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_APPLIED_STEREOTYPES = UMLPackage.INTERACTION___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.INTERACTION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.INTERACTION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_MODEL = UMLPackage.INTERACTION___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_NEAREST_PACKAGE = UMLPackage.INTERACTION___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_RELATIONSHIPS = UMLPackage.INTERACTION___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_RELATIONSHIPS__ECLASS = UMLPackage.INTERACTION___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.INTERACTION___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_REQUIRED_STEREOTYPES = UMLPackage.INTERACTION___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.INTERACTION___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.INTERACTION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.INTERACTION___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_STEREOTYPE_APPLICATIONS = UMLPackage.INTERACTION___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.INTERACTION___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.INTERACTION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_VALUE__STEREOTYPE_STRING = UMLPackage.INTERACTION___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___HAS_KEYWORD__STRING = UMLPackage.INTERACTION___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.INTERACTION___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.INTERACTION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.INTERACTION___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.INTERACTION___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___REMOVE_KEYWORD__STRING = UMLPackage.INTERACTION___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.INTERACTION___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.INTERACTION___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___ALL_OWNED_ELEMENTS = UMLPackage.INTERACTION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___MUST_BE_OWNED = UMLPackage.INTERACTION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERACTION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERACTION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERACTION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.INTERACTION___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___CREATE_USAGE__NAMEDELEMENT = UMLPackage.INTERACTION___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_LABEL = UMLPackage.INTERACTION___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_LABEL__BOOLEAN = UMLPackage.INTERACTION___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_NAMESPACE = UMLPackage.INTERACTION___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___ALL_NAMESPACES = UMLPackage.INTERACTION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___ALL_OWNING_PACKAGES = UMLPackage.INTERACTION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.INTERACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_QUALIFIED_NAME = UMLPackage.INTERACTION___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___SEPARATOR = UMLPackage.INTERACTION___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_CLIENT_DEPENDENCIES = UMLPackage.INTERACTION___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERACTION___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERACTION___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERACTION___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Element Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = UMLPackage.INTERACTION___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Create Package Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = UMLPackage.INTERACTION___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Get Imported Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_IMPORTED_ELEMENTS = UMLPackage.INTERACTION___GET_IMPORTED_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Imported Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_IMPORTED_PACKAGES = UMLPackage.INTERACTION___GET_IMPORTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_OWNED_MEMBERS = UMLPackage.INTERACTION___GET_OWNED_MEMBERS;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___EXCLUDE_COLLISIONS__ELIST = UMLPackage.INTERACTION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_NAMES_OF_MEMBER__NAMEDELEMENT = UMLPackage.INTERACTION___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___IMPORT_MEMBERS__ELIST = UMLPackage.INTERACTION___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Get Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_IMPORTED_MEMBERS = UMLPackage.INTERACTION___GET_IMPORTED_MEMBERS;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___MEMBERS_ARE_DISTINGUISHABLE = UMLPackage.INTERACTION___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Validate Redefinition Consistent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERACTION___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Leaf Redefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERACTION___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERACTION___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = UMLPackage.INTERACTION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = UMLPackage.INTERACTION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = UMLPackage.INTERACTION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___IS_TEMPLATE_PARAMETER = UMLPackage.INTERACTION___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Validate Namespace Needs Visibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERACTION___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Association</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT = UMLPackage.INTERACTION___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT;

	/**
	 * The operation id for the '<em>Get Associations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_ASSOCIATIONS = UMLPackage.INTERACTION___GET_ASSOCIATIONS;

	/**
	 * The operation id for the '<em>Conforms To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___CONFORMS_TO__TYPE = UMLPackage.INTERACTION___CONFORMS_TO__TYPE;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___IS_TEMPLATE = UMLPackage.INTERACTION___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___PARAMETERABLE_ELEMENTS = UMLPackage.INTERACTION___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERACTION___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Maps To Generalization Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERACTION___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Final Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERACTION___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate No Cycles In Generalization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERACTION___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_ALL_ATTRIBUTES = UMLPackage.INTERACTION___GET_ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get All Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_ALL_OPERATIONS = UMLPackage.INTERACTION___GET_ALL_OPERATIONS;

	/**
	 * The operation id for the '<em>Get All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_ALL_USED_INTERFACES = UMLPackage.INTERACTION___GET_ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_OPERATION__STRING_ELIST_ELIST = UMLPackage.INTERACTION___GET_OPERATION__STRING_ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN = UMLPackage.INTERACTION___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN;

	/**
	 * The operation id for the '<em>Get Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_OPERATIONS = UMLPackage.INTERACTION___GET_OPERATIONS;

	/**
	 * The operation id for the '<em>Get Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_USED_INTERFACES = UMLPackage.INTERACTION___GET_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___ALL_FEATURES = UMLPackage.INTERACTION___ALL_FEATURES;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___ALL_PARENTS = UMLPackage.INTERACTION___ALL_PARENTS;

	/**
	 * The operation id for the '<em>Get Generals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_GENERALS = UMLPackage.INTERACTION___GET_GENERALS;

	/**
	 * The operation id for the '<em>Has Visibility Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___HAS_VISIBILITY_OF__NAMEDELEMENT = UMLPackage.INTERACTION___HAS_VISIBILITY_OF__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Inherit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___INHERIT__ELIST = UMLPackage.INTERACTION___INHERIT__ELIST;

	/**
	 * The operation id for the '<em>Inheritable Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___INHERITABLE_MEMBERS__CLASSIFIER = UMLPackage.INTERACTION___INHERITABLE_MEMBERS__CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Inherited Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_INHERITED_MEMBERS = UMLPackage.INTERACTION___GET_INHERITED_MEMBERS;

	/**
	 * The operation id for the '<em>May Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___MAY_SPECIALIZE_TYPE__CLASSIFIER = UMLPackage.INTERACTION___MAY_SPECIALIZE_TYPE__CLASSIFIER;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___PARENTS = UMLPackage.INTERACTION___PARENTS;

	/**
	 * The operation id for the '<em>Directly Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___DIRECTLY_REALIZED_INTERFACES = UMLPackage.INTERACTION___DIRECTLY_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>Directly Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___DIRECTLY_USED_INTERFACES = UMLPackage.INTERACTION___DIRECTLY_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___ALL_REALIZED_INTERFACES = UMLPackage.INTERACTION___ALL_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___ALL_USED_INTERFACES = UMLPackage.INTERACTION___ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Is Substitutable For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___IS_SUBSTITUTABLE_FOR__CLASSIFIER = UMLPackage.INTERACTION___IS_SUBSTITUTABLE_FOR__CLASSIFIER;

	/**
	 * The operation id for the '<em>All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___ALL_ATTRIBUTES = UMLPackage.INTERACTION___ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>All Slottable Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___ALL_SLOTTABLE_FEATURES = UMLPackage.INTERACTION___ALL_SLOTTABLE_FEATURES;

	/**
	 * The operation id for the '<em>Create Owned Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT = UMLPackage.INTERACTION___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_PARTS = UMLPackage.INTERACTION___GET_PARTS;

	/**
	 * The operation id for the '<em>All Roles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___ALL_ROLES = UMLPackage.INTERACTION___ALL_ROLES;

	/**
	 * The operation id for the '<em>Get Owned Ports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_OWNED_PORTS = UMLPackage.INTERACTION___GET_OWNED_PORTS;

	/**
	 * The operation id for the '<em>Validate Class Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERACTION___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get All Implemented Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_ALL_IMPLEMENTED_INTERFACES = UMLPackage.INTERACTION___GET_ALL_IMPLEMENTED_INTERFACES;

	/**
	 * The operation id for the '<em>Get Implemented Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_IMPLEMENTED_INTERFACES = UMLPackage.INTERACTION___GET_IMPLEMENTED_INTERFACES;

	/**
	 * The operation id for the '<em>Validate Passive Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERACTION___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Owned Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE = UMLPackage.INTERACTION___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE;

	/**
	 * The operation id for the '<em>Is Metaclass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___IS_METACLASS = UMLPackage.INTERACTION___IS_METACLASS;

	/**
	 * The operation id for the '<em>Get Extensions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_EXTENSIONS = UMLPackage.INTERACTION___GET_EXTENSIONS;

	/**
	 * The operation id for the '<em>Get Super Classes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_SUPER_CLASSES = UMLPackage.INTERACTION___GET_SUPER_CLASSES;

	/**
	 * The operation id for the '<em>Validate Most One Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___VALIDATE_MOST_ONE_BEHAVIOR__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERACTION___VALIDATE_MOST_ONE_BEHAVIOR__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Parameters Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___VALIDATE_PARAMETERS_MATCH__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERACTION___VALIDATE_PARAMETERS_MATCH__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Feature Of Context Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___VALIDATE_FEATURE_OF_CONTEXT_CLASSIFIER__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERACTION___VALIDATE_FEATURE_OF_CONTEXT_CLASSIFIER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___GET_CONTEXT = UMLPackage.INTERACTION___GET_CONTEXT;

	/**
	 * The operation id for the '<em>Behaviored Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___BEHAVIORED_CLASSIFIER__ELEMENT = UMLPackage.INTERACTION___BEHAVIORED_CLASSIFIER__ELEMENT;

	/**
	 * The operation id for the '<em>Input Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___INPUT_PARAMETERS = UMLPackage.INTERACTION___INPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Output Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___OUTPUT_PARAMETERS = UMLPackage.INTERACTION___OUTPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Validate Not Contained</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION___VALIDATE_NOT_CONTAINED__DIAGNOSTICCHAIN_MAP = UMLPackage.INTERACTION___VALIDATE_NOT_CONTAINED__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_OPERATION_COUNT = UMLPackage.INTERACTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__EANNOTATIONS = UMLPackage.ACTOR__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNED_COMMENT = UMLPackage.ACTOR__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNED_ELEMENT = UMLPackage.ACTOR__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNER = UMLPackage.ACTOR__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CLIENT_DEPENDENCY = UMLPackage.ACTOR__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = UMLPackage.ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME_EXPRESSION = UMLPackage.ACTOR__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAMESPACE = UMLPackage.ACTOR__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__QUALIFIED_NAME = UMLPackage.ACTOR__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__VISIBILITY = UMLPackage.ACTOR__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNED_RULE = UMLPackage.ACTOR__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ELEMENT_IMPORT = UMLPackage.ACTOR__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PACKAGE_IMPORT = UMLPackage.ACTOR__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNED_MEMBER = UMLPackage.ACTOR__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__IMPORTED_MEMBER = UMLPackage.ACTOR__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__MEMBER = UMLPackage.ACTOR__MEMBER;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__IS_LEAF = UMLPackage.ACTOR__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__REDEFINED_ELEMENT = UMLPackage.ACTOR__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__REDEFINITION_CONTEXT = UMLPackage.ACTOR__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNING_TEMPLATE_PARAMETER = UMLPackage.ACTOR__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__TEMPLATE_PARAMETER = UMLPackage.ACTOR__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PACKAGE = UMLPackage.ACTOR__PACKAGE;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__TEMPLATE_BINDING = UMLPackage.ACTOR__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNED_TEMPLATE_SIGNATURE = UMLPackage.ACTOR__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__FEATURE = UMLPackage.ACTOR__FEATURE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ATTRIBUTE = UMLPackage.ACTOR__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__COLLABORATION_USE = UMLPackage.ACTOR__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__GENERAL = UMLPackage.ACTOR__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__GENERALIZATION = UMLPackage.ACTOR__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__POWERTYPE_EXTENT = UMLPackage.ACTOR__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__INHERITED_MEMBER = UMLPackage.ACTOR__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__IS_ABSTRACT = UMLPackage.ACTOR__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__IS_FINAL_SPECIALIZATION = UMLPackage.ACTOR__IS_FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNED_USE_CASE = UMLPackage.ACTOR__OWNED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__USE_CASE = UMLPackage.ACTOR__USE_CASE;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__REDEFINED_CLASSIFIER = UMLPackage.ACTOR__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__REPRESENTATION = UMLPackage.ACTOR__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SUBSTITUTION = UMLPackage.ACTOR__SUBSTITUTION;

	/**
	 * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CLASSIFIER_BEHAVIOR = UMLPackage.ACTOR__CLASSIFIER_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__INTERFACE_REALIZATION = UMLPackage.ACTOR__INTERFACE_REALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNED_BEHAVIOR = UMLPackage.ACTOR__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ID = UMLPackage.ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = UMLPackage.ACTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_EANNOTATION__STRING = UMLPackage.ACTOR___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.ACTOR___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.ACTOR___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___ADD_KEYWORD__STRING = UMLPackage.ACTOR___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.ACTOR___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___CREATE_EANNOTATION__STRING = UMLPackage.ACTOR___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___DESTROY = UMLPackage.ACTOR___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_KEYWORDS = UMLPackage.ACTOR___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.ACTOR___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_APPLICABLE_STEREOTYPES = UMLPackage.ACTOR___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.ACTOR___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_APPLIED_STEREOTYPES = UMLPackage.ACTOR___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.ACTOR___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.ACTOR___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_MODEL = UMLPackage.ACTOR___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_NEAREST_PACKAGE = UMLPackage.ACTOR___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_RELATIONSHIPS = UMLPackage.ACTOR___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_RELATIONSHIPS__ECLASS = UMLPackage.ACTOR___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.ACTOR___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_REQUIRED_STEREOTYPES = UMLPackage.ACTOR___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.ACTOR___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.ACTOR___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.ACTOR___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_STEREOTYPE_APPLICATIONS = UMLPackage.ACTOR___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.ACTOR___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.ACTOR___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_VALUE__STEREOTYPE_STRING = UMLPackage.ACTOR___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___HAS_KEYWORD__STRING = UMLPackage.ACTOR___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.ACTOR___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.ACTOR___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.ACTOR___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.ACTOR___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___REMOVE_KEYWORD__STRING = UMLPackage.ACTOR___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.ACTOR___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.ACTOR___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___ALL_OWNED_ELEMENTS = UMLPackage.ACTOR___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___MUST_BE_OWNED = UMLPackage.ACTOR___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.ACTOR___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.ACTOR___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.ACTOR___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.ACTOR___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___CREATE_USAGE__NAMEDELEMENT = UMLPackage.ACTOR___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_LABEL = UMLPackage.ACTOR___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_LABEL__BOOLEAN = UMLPackage.ACTOR___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_NAMESPACE = UMLPackage.ACTOR___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___ALL_NAMESPACES = UMLPackage.ACTOR___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___ALL_OWNING_PACKAGES = UMLPackage.ACTOR___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.ACTOR___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_QUALIFIED_NAME = UMLPackage.ACTOR___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___SEPARATOR = UMLPackage.ACTOR___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_CLIENT_DEPENDENCIES = UMLPackage.ACTOR___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = UMLPackage.ACTOR___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.ACTOR___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP = UMLPackage.ACTOR___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Element Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = UMLPackage.ACTOR___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Create Package Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = UMLPackage.ACTOR___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Get Imported Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_IMPORTED_ELEMENTS = UMLPackage.ACTOR___GET_IMPORTED_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Imported Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_IMPORTED_PACKAGES = UMLPackage.ACTOR___GET_IMPORTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_OWNED_MEMBERS = UMLPackage.ACTOR___GET_OWNED_MEMBERS;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___EXCLUDE_COLLISIONS__ELIST = UMLPackage.ACTOR___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_NAMES_OF_MEMBER__NAMEDELEMENT = UMLPackage.ACTOR___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___IMPORT_MEMBERS__ELIST = UMLPackage.ACTOR___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Get Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_IMPORTED_MEMBERS = UMLPackage.ACTOR___GET_IMPORTED_MEMBERS;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___MEMBERS_ARE_DISTINGUISHABLE = UMLPackage.ACTOR___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Validate Redefinition Consistent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP = UMLPackage.ACTOR___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Leaf Redefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP = UMLPackage.ACTOR___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP = UMLPackage.ACTOR___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = UMLPackage.ACTOR___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = UMLPackage.ACTOR___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = UMLPackage.ACTOR___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___IS_TEMPLATE_PARAMETER = UMLPackage.ACTOR___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Validate Namespace Needs Visibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP = UMLPackage.ACTOR___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Association</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT = UMLPackage.ACTOR___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT;

	/**
	 * The operation id for the '<em>Get Associations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_ASSOCIATIONS = UMLPackage.ACTOR___GET_ASSOCIATIONS;

	/**
	 * The operation id for the '<em>Conforms To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___CONFORMS_TO__TYPE = UMLPackage.ACTOR___CONFORMS_TO__TYPE;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___IS_TEMPLATE = UMLPackage.ACTOR___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___PARAMETERABLE_ELEMENTS = UMLPackage.ACTOR___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP = UMLPackage.ACTOR___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Maps To Generalization Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP = UMLPackage.ACTOR___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Final Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP = UMLPackage.ACTOR___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate No Cycles In Generalization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP = UMLPackage.ACTOR___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_ALL_ATTRIBUTES = UMLPackage.ACTOR___GET_ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get All Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_ALL_OPERATIONS = UMLPackage.ACTOR___GET_ALL_OPERATIONS;

	/**
	 * The operation id for the '<em>Get All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_ALL_USED_INTERFACES = UMLPackage.ACTOR___GET_ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_OPERATION__STRING_ELIST_ELIST = UMLPackage.ACTOR___GET_OPERATION__STRING_ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN = UMLPackage.ACTOR___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN;

	/**
	 * The operation id for the '<em>Get Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_OPERATIONS = UMLPackage.ACTOR___GET_OPERATIONS;

	/**
	 * The operation id for the '<em>Get Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_USED_INTERFACES = UMLPackage.ACTOR___GET_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___ALL_FEATURES = UMLPackage.ACTOR___ALL_FEATURES;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___ALL_PARENTS = UMLPackage.ACTOR___ALL_PARENTS;

	/**
	 * The operation id for the '<em>Get Generals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_GENERALS = UMLPackage.ACTOR___GET_GENERALS;

	/**
	 * The operation id for the '<em>Has Visibility Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___HAS_VISIBILITY_OF__NAMEDELEMENT = UMLPackage.ACTOR___HAS_VISIBILITY_OF__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Inherit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___INHERIT__ELIST = UMLPackage.ACTOR___INHERIT__ELIST;

	/**
	 * The operation id for the '<em>Inheritable Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___INHERITABLE_MEMBERS__CLASSIFIER = UMLPackage.ACTOR___INHERITABLE_MEMBERS__CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Inherited Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_INHERITED_MEMBERS = UMLPackage.ACTOR___GET_INHERITED_MEMBERS;

	/**
	 * The operation id for the '<em>May Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___MAY_SPECIALIZE_TYPE__CLASSIFIER = UMLPackage.ACTOR___MAY_SPECIALIZE_TYPE__CLASSIFIER;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___PARENTS = UMLPackage.ACTOR___PARENTS;

	/**
	 * The operation id for the '<em>Directly Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___DIRECTLY_REALIZED_INTERFACES = UMLPackage.ACTOR___DIRECTLY_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>Directly Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___DIRECTLY_USED_INTERFACES = UMLPackage.ACTOR___DIRECTLY_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___ALL_REALIZED_INTERFACES = UMLPackage.ACTOR___ALL_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___ALL_USED_INTERFACES = UMLPackage.ACTOR___ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Is Substitutable For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___IS_SUBSTITUTABLE_FOR__CLASSIFIER = UMLPackage.ACTOR___IS_SUBSTITUTABLE_FOR__CLASSIFIER;

	/**
	 * The operation id for the '<em>All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___ALL_ATTRIBUTES = UMLPackage.ACTOR___ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>All Slottable Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___ALL_SLOTTABLE_FEATURES = UMLPackage.ACTOR___ALL_SLOTTABLE_FEATURES;

	/**
	 * The operation id for the '<em>Validate Class Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP = UMLPackage.ACTOR___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get All Implemented Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_ALL_IMPLEMENTED_INTERFACES = UMLPackage.ACTOR___GET_ALL_IMPLEMENTED_INTERFACES;

	/**
	 * The operation id for the '<em>Get Implemented Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___GET_IMPLEMENTED_INTERFACES = UMLPackage.ACTOR___GET_IMPLEMENTED_INTERFACES;

	/**
	 * The operation id for the '<em>Validate Associations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___VALIDATE_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP = UMLPackage.ACTOR___VALIDATE_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Must Have Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___VALIDATE_MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.ACTOR___VALIDATE_MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = UMLPackage.ACTOR_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EANNOTATIONS = UMLPackage.OPERATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNED_COMMENT = UMLPackage.OPERATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNED_ELEMENT = UMLPackage.OPERATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNER = UMLPackage.OPERATION__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CLIENT_DEPENDENCY = UMLPackage.OPERATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = UMLPackage.OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME_EXPRESSION = UMLPackage.OPERATION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAMESPACE = UMLPackage.OPERATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__QUALIFIED_NAME = UMLPackage.OPERATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__VISIBILITY = UMLPackage.OPERATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNED_RULE = UMLPackage.OPERATION__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ELEMENT_IMPORT = UMLPackage.OPERATION__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PACKAGE_IMPORT = UMLPackage.OPERATION__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNED_MEMBER = UMLPackage.OPERATION__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IMPORTED_MEMBER = UMLPackage.OPERATION__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__MEMBER = UMLPackage.OPERATION__MEMBER;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_LEAF = UMLPackage.OPERATION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__REDEFINED_ELEMENT = UMLPackage.OPERATION__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__REDEFINITION_CONTEXT = UMLPackage.OPERATION__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__FEATURING_CLASSIFIER = UMLPackage.OPERATION__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_STATIC = UMLPackage.OPERATION__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Concurrency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CONCURRENCY = UMLPackage.OPERATION__CONCURRENCY;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_ABSTRACT = UMLPackage.OPERATION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__METHOD = UMLPackage.OPERATION__METHOD;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNED_PARAMETER = UMLPackage.OPERATION__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNED_PARAMETER_SET = UMLPackage.OPERATION__OWNED_PARAMETER_SET;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RAISED_EXCEPTION = UMLPackage.OPERATION__RAISED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNING_TEMPLATE_PARAMETER = UMLPackage.OPERATION__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TEMPLATE_PARAMETER = UMLPackage.OPERATION__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TEMPLATE_BINDING = UMLPackage.OPERATION__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNED_TEMPLATE_SIGNATURE = UMLPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Body Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__BODY_CONDITION = UMLPackage.OPERATION__BODY_CONDITION;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CLASS = UMLPackage.OPERATION__CLASS;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DATATYPE = UMLPackage.OPERATION__DATATYPE;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__INTERFACE = UMLPackage.OPERATION__INTERFACE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_ORDERED = UMLPackage.OPERATION__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_QUERY = UMLPackage.OPERATION__IS_QUERY;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_UNIQUE = UMLPackage.OPERATION__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__LOWER = UMLPackage.OPERATION__LOWER;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__POSTCONDITION = UMLPackage.OPERATION__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PRECONDITION = UMLPackage.OPERATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Redefined Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__REDEFINED_OPERATION = UMLPackage.OPERATION__REDEFINED_OPERATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TYPE = UMLPackage.OPERATION__TYPE;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__UPPER = UMLPackage.OPERATION__UPPER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ID = UMLPackage.OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = UMLPackage.OPERATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_EANNOTATION__STRING = UMLPackage.OPERATION___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___ADD_KEYWORD__STRING = UMLPackage.OPERATION___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.OPERATION___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___CREATE_EANNOTATION__STRING = UMLPackage.OPERATION___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___DESTROY = UMLPackage.OPERATION___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_KEYWORDS = UMLPackage.OPERATION___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.OPERATION___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_APPLICABLE_STEREOTYPES = UMLPackage.OPERATION___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.OPERATION___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_APPLIED_STEREOTYPES = UMLPackage.OPERATION___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.OPERATION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.OPERATION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_MODEL = UMLPackage.OPERATION___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_NEAREST_PACKAGE = UMLPackage.OPERATION___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_RELATIONSHIPS = UMLPackage.OPERATION___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_RELATIONSHIPS__ECLASS = UMLPackage.OPERATION___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.OPERATION___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_REQUIRED_STEREOTYPES = UMLPackage.OPERATION___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.OPERATION___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.OPERATION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.OPERATION___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_STEREOTYPE_APPLICATIONS = UMLPackage.OPERATION___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.OPERATION___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.OPERATION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_VALUE__STEREOTYPE_STRING = UMLPackage.OPERATION___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___HAS_KEYWORD__STRING = UMLPackage.OPERATION___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.OPERATION___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.OPERATION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.OPERATION___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.OPERATION___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___REMOVE_KEYWORD__STRING = UMLPackage.OPERATION___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.OPERATION___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.OPERATION___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___ALL_OWNED_ELEMENTS = UMLPackage.OPERATION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___MUST_BE_OWNED = UMLPackage.OPERATION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.OPERATION___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___CREATE_USAGE__NAMEDELEMENT = UMLPackage.OPERATION___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_LABEL = UMLPackage.OPERATION___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_LABEL__BOOLEAN = UMLPackage.OPERATION___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_NAMESPACE = UMLPackage.OPERATION___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___ALL_NAMESPACES = UMLPackage.OPERATION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___ALL_OWNING_PACKAGES = UMLPackage.OPERATION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.OPERATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_QUALIFIED_NAME = UMLPackage.OPERATION___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___SEPARATOR = UMLPackage.OPERATION___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_CLIENT_DEPENDENCIES = UMLPackage.OPERATION___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Element Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = UMLPackage.OPERATION___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Create Package Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = UMLPackage.OPERATION___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Get Imported Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_IMPORTED_ELEMENTS = UMLPackage.OPERATION___GET_IMPORTED_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Imported Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_IMPORTED_PACKAGES = UMLPackage.OPERATION___GET_IMPORTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_OWNED_MEMBERS = UMLPackage.OPERATION___GET_OWNED_MEMBERS;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___EXCLUDE_COLLISIONS__ELIST = UMLPackage.OPERATION___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_NAMES_OF_MEMBER__NAMEDELEMENT = UMLPackage.OPERATION___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___IMPORT_MEMBERS__ELIST = UMLPackage.OPERATION___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Get Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_IMPORTED_MEMBERS = UMLPackage.OPERATION___GET_IMPORTED_MEMBERS;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___MEMBERS_ARE_DISTINGUISHABLE = UMLPackage.OPERATION___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Validate Redefinition Consistent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Leaf Redefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = UMLPackage.OPERATION___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = UMLPackage.OPERATION___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Validate Abstract No Method</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___VALIDATE_ABSTRACT_NO_METHOD__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_ABSTRACT_NO_METHOD__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Return Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___CREATE_RETURN_RESULT__STRING_TYPE = UMLPackage.OPERATION___CREATE_RETURN_RESULT__STRING_TYPE;

	/**
	 * The operation id for the '<em>Input Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___INPUT_PARAMETERS = UMLPackage.OPERATION___INPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Output Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___OUTPUT_PARAMETERS = UMLPackage.OPERATION___OUTPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = UMLPackage.OPERATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___IS_TEMPLATE_PARAMETER = UMLPackage.OPERATION___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___IS_TEMPLATE = UMLPackage.OPERATION___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___PARAMETERABLE_ELEMENTS = UMLPackage.OPERATION___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate At Most One Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___VALIDATE_AT_MOST_ONE_RETURN__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_AT_MOST_ONE_RETURN__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Only Body For Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___VALIDATE_ONLY_BODY_FOR_QUERY__DIAGNOSTICCHAIN_MAP = UMLPackage.OPERATION___VALIDATE_ONLY_BODY_FOR_QUERY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Return Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_RETURN_RESULT = UMLPackage.OPERATION___GET_RETURN_RESULT;

	/**
	 * The operation id for the '<em>Set Is Ordered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___SET_IS_ORDERED__BOOLEAN = UMLPackage.OPERATION___SET_IS_ORDERED__BOOLEAN;

	/**
	 * The operation id for the '<em>Set Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___SET_IS_UNIQUE__BOOLEAN = UMLPackage.OPERATION___SET_IS_UNIQUE__BOOLEAN;

	/**
	 * The operation id for the '<em>Set Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___SET_LOWER__INT = UMLPackage.OPERATION___SET_LOWER__INT;

	/**
	 * The operation id for the '<em>Set Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___SET_TYPE__TYPE = UMLPackage.OPERATION___SET_TYPE__TYPE;

	/**
	 * The operation id for the '<em>Set Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___SET_UPPER__INT = UMLPackage.OPERATION___SET_UPPER__INT;

	/**
	 * The operation id for the '<em>Is Ordered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___IS_ORDERED = UMLPackage.OPERATION___IS_ORDERED;

	/**
	 * The operation id for the '<em>Is Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___IS_UNIQUE = UMLPackage.OPERATION___IS_UNIQUE;

	/**
	 * The operation id for the '<em>Get Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_LOWER = UMLPackage.OPERATION___GET_LOWER;

	/**
	 * The operation id for the '<em>Return Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___RETURN_RESULT = UMLPackage.OPERATION___RETURN_RESULT;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_TYPE = UMLPackage.OPERATION___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___GET_UPPER = UMLPackage.OPERATION___GET_UPPER;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = UMLPackage.OPERATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__EANNOTATIONS = UMLPackage.MESSAGE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__OWNED_COMMENT = UMLPackage.MESSAGE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__OWNED_ELEMENT = UMLPackage.MESSAGE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__OWNER = UMLPackage.MESSAGE__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__CLIENT_DEPENDENCY = UMLPackage.MESSAGE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = UMLPackage.MESSAGE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME_EXPRESSION = UMLPackage.MESSAGE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAMESPACE = UMLPackage.MESSAGE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__QUALIFIED_NAME = UMLPackage.MESSAGE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__VISIBILITY = UMLPackage.MESSAGE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ARGUMENT = UMLPackage.MESSAGE__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__CONNECTOR = UMLPackage.MESSAGE__CONNECTOR;

	/**
	 * The feature id for the '<em><b>Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__INTERACTION = UMLPackage.MESSAGE__INTERACTION;

	/**
	 * The feature id for the '<em><b>Message Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE_KIND = UMLPackage.MESSAGE__MESSAGE_KIND;

	/**
	 * The feature id for the '<em><b>Message Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE_SORT = UMLPackage.MESSAGE__MESSAGE_SORT;

	/**
	 * The feature id for the '<em><b>Receive Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__RECEIVE_EVENT = UMLPackage.MESSAGE__RECEIVE_EVENT;

	/**
	 * The feature id for the '<em><b>Send Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SEND_EVENT = UMLPackage.MESSAGE__SEND_EVENT;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SIGNATURE = UMLPackage.MESSAGE__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ID = UMLPackage.MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = UMLPackage.MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_EANNOTATION__STRING = UMLPackage.MESSAGE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.MESSAGE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.MESSAGE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___ADD_KEYWORD__STRING = UMLPackage.MESSAGE___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.MESSAGE___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___CREATE_EANNOTATION__STRING = UMLPackage.MESSAGE___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___DESTROY = UMLPackage.MESSAGE___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_KEYWORDS = UMLPackage.MESSAGE___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.MESSAGE___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_APPLICABLE_STEREOTYPES = UMLPackage.MESSAGE___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.MESSAGE___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_APPLIED_STEREOTYPES = UMLPackage.MESSAGE___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.MESSAGE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.MESSAGE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_MODEL = UMLPackage.MESSAGE___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_NEAREST_PACKAGE = UMLPackage.MESSAGE___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_RELATIONSHIPS = UMLPackage.MESSAGE___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_RELATIONSHIPS__ECLASS = UMLPackage.MESSAGE___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.MESSAGE___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_REQUIRED_STEREOTYPES = UMLPackage.MESSAGE___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.MESSAGE___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.MESSAGE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.MESSAGE___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_STEREOTYPE_APPLICATIONS = UMLPackage.MESSAGE___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.MESSAGE___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.MESSAGE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_VALUE__STEREOTYPE_STRING = UMLPackage.MESSAGE___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___HAS_KEYWORD__STRING = UMLPackage.MESSAGE___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.MESSAGE___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.MESSAGE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.MESSAGE___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.MESSAGE___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___REMOVE_KEYWORD__STRING = UMLPackage.MESSAGE___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.MESSAGE___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.MESSAGE___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___ALL_OWNED_ELEMENTS = UMLPackage.MESSAGE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___MUST_BE_OWNED = UMLPackage.MESSAGE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.MESSAGE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.MESSAGE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.MESSAGE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.MESSAGE___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___CREATE_USAGE__NAMEDELEMENT = UMLPackage.MESSAGE___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_LABEL = UMLPackage.MESSAGE___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_LABEL__BOOLEAN = UMLPackage.MESSAGE___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_NAMESPACE = UMLPackage.MESSAGE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___ALL_NAMESPACES = UMLPackage.MESSAGE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___ALL_OWNING_PACKAGES = UMLPackage.MESSAGE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.MESSAGE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_QUALIFIED_NAME = UMLPackage.MESSAGE___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___SEPARATOR = UMLPackage.MESSAGE___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_CLIENT_DEPENDENCIES = UMLPackage.MESSAGE___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Sending Receiving Message Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___VALIDATE_SENDING_RECEIVING_MESSAGE_EVENT__DIAGNOSTICCHAIN_MAP = UMLPackage.MESSAGE___VALIDATE_SENDING_RECEIVING_MESSAGE_EVENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Arguments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___VALIDATE_ARGUMENTS__DIAGNOSTICCHAIN_MAP = UMLPackage.MESSAGE___VALIDATE_ARGUMENTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Cross Boundaries</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___VALIDATE_CANNOT_CROSS_BOUNDARIES__DIAGNOSTICCHAIN_MAP = UMLPackage.MESSAGE___VALIDATE_CANNOT_CROSS_BOUNDARIES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Signature Is Signal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___VALIDATE_SIGNATURE_IS_SIGNAL__DIAGNOSTICCHAIN_MAP = UMLPackage.MESSAGE___VALIDATE_SIGNATURE_IS_SIGNAL__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Occurrence Specifications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___VALIDATE_OCCURRENCE_SPECIFICATIONS__DIAGNOSTICCHAIN_MAP = UMLPackage.MESSAGE___VALIDATE_OCCURRENCE_SPECIFICATIONS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Signature Refer To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___VALIDATE_SIGNATURE_REFER_TO__DIAGNOSTICCHAIN_MAP = UMLPackage.MESSAGE___VALIDATE_SIGNATURE_REFER_TO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Signature Is Operation Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___VALIDATE_SIGNATURE_IS_OPERATION_REQUEST__DIAGNOSTICCHAIN_MAP = UMLPackage.MESSAGE___VALIDATE_SIGNATURE_IS_OPERATION_REQUEST__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Signature Is Operation Reply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___VALIDATE_SIGNATURE_IS_OPERATION_REPLY__DIAGNOSTICCHAIN_MAP = UMLPackage.MESSAGE___VALIDATE_SIGNATURE_IS_OPERATION_REPLY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Message Kind</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_MESSAGE_KIND = UMLPackage.MESSAGE___GET_MESSAGE_KIND;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = UMLPackage.MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION__EANNOTATIONS = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION__OWNED_COMMENT = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION__OWNED_ELEMENT = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION__OWNER = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION__CLIENT_DEPENDENCY = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION__NAME = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION__NAME_EXPRESSION = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION__NAMESPACE = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION__QUALIFIED_NAME = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION__VISIBILITY = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION__COVERED = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION__ENCLOSING_OPERAND = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION__ENCLOSING_INTERACTION = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION__GENERAL_ORDERING = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>To After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION__TO_AFTER = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_AFTER;

	/**
	 * The feature id for the '<em><b>To Before</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION__TO_BEFORE = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__TO_BEFORE;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION__MESSAGE = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION__ID = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Occurence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION_FEATURE_COUNT = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___GET_EANNOTATION__STRING = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___ADD_KEYWORD__STRING = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___CREATE_EANNOTATION__STRING = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___DESTROY = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___GET_KEYWORDS = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___GET_APPLICABLE_STEREOTYPES = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___GET_APPLIED_STEREOTYPES = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___GET_MODEL = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___GET_NEAREST_PACKAGE = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___GET_RELATIONSHIPS = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___GET_RELATIONSHIPS__ECLASS = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___GET_REQUIRED_STEREOTYPES = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___GET_STEREOTYPE_APPLICATIONS = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___GET_VALUE__STEREOTYPE_STRING = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___HAS_KEYWORD__STRING = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___REMOVE_KEYWORD__STRING = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___ALL_OWNED_ELEMENTS = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___MUST_BE_OWNED = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___CREATE_USAGE__NAMEDELEMENT = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___GET_LABEL = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___GET_LABEL__BOOLEAN = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___GET_NAMESPACE = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___ALL_NAMESPACES = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___ALL_OWNING_PACKAGES = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___GET_QUALIFIED_NAME = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___SEPARATOR = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___GET_CLIENT_DEPENDENCIES = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Get Covered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___GET_COVERED = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___GET_COVERED;

	/**
	 * The operation id for the '<em>Set Covered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___SET_COVERED__LIFELINE = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___SET_COVERED__LIFELINE;

	/**
	 * The operation id for the '<em>Opposite End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___OPPOSITE_END = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___OPPOSITE_END;

	/**
	 * The operation id for the '<em>Is Send</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___IS_SEND = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___IS_SEND;

	/**
	 * The operation id for the '<em>Is Receive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___IS_RECEIVE = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___IS_RECEIVE;

	/**
	 * The operation id for the '<em>Enclosing Fragment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION___ENCLOSING_FRAGMENT = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION___ENCLOSING_FRAGMENT;

	/**
	 * The number of operations of the '<em>Message Occurence Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OCCURENCE_SPECIFICATION_OPERATION_COUNT = UMLPackage.MESSAGE_OCCURRENCE_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__EANNOTATIONS = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__OWNED_COMMENT = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__OWNED_ELEMENT = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__OWNER = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__NAME = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__NAME_EXPRESSION = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__NAMESPACE = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__QUALIFIED_NAME = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__VISIBILITY = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__COVERED = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__ENCLOSING_OPERAND = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__GENERAL_ORDERING = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__FINISH = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__FINISH;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__START = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__START;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION__ID = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Behavior Execution Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION_FEATURE_COUNT = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___GET_EANNOTATION__STRING = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___ADD_KEYWORD__STRING = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___CREATE_EANNOTATION__STRING = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___DESTROY = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___GET_KEYWORDS = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___GET_APPLICABLE_STEREOTYPES = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___GET_APPLIED_STEREOTYPES = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___GET_MODEL = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___GET_NEAREST_PACKAGE = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___GET_RELATIONSHIPS = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___GET_RELATIONSHIPS__ECLASS = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___GET_REQUIRED_STEREOTYPES = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___GET_STEREOTYPE_APPLICATIONS = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___GET_VALUE__STEREOTYPE_STRING = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___HAS_KEYWORD__STRING = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___REMOVE_KEYWORD__STRING = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___ALL_OWNED_ELEMENTS = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___MUST_BE_OWNED = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___CREATE_USAGE__NAMEDELEMENT = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___GET_LABEL = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___GET_LABEL__BOOLEAN = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___GET_NAMESPACE = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___ALL_NAMESPACES = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___ALL_OWNING_PACKAGES = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___GET_QUALIFIED_NAME = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___SEPARATOR = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___GET_CLIENT_DEPENDENCIES = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Same Lifeline</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION___VALIDATE_SAME_LIFELINE__DIAGNOSTICCHAIN_MAP = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION___VALIDATE_SAME_LIFELINE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Behavior Execution Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_EXECUTION_SPECIFICATION_OPERATION_COUNT = UMLPackage.BEHAVIOR_EXECUTION_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__EANNOTATIONS = UMLPackage.OPAQUE_BEHAVIOR__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_COMMENT = UMLPackage.OPAQUE_BEHAVIOR__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_ELEMENT = UMLPackage.OPAQUE_BEHAVIOR__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNER = UMLPackage.OPAQUE_BEHAVIOR__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__CLIENT_DEPENDENCY = UMLPackage.OPAQUE_BEHAVIOR__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__NAME = UMLPackage.OPAQUE_BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__NAME_EXPRESSION = UMLPackage.OPAQUE_BEHAVIOR__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__NAMESPACE = UMLPackage.OPAQUE_BEHAVIOR__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__QUALIFIED_NAME = UMLPackage.OPAQUE_BEHAVIOR__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__VISIBILITY = UMLPackage.OPAQUE_BEHAVIOR__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_RULE = UMLPackage.OPAQUE_BEHAVIOR__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__ELEMENT_IMPORT = UMLPackage.OPAQUE_BEHAVIOR__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__PACKAGE_IMPORT = UMLPackage.OPAQUE_BEHAVIOR__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_MEMBER = UMLPackage.OPAQUE_BEHAVIOR__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__IMPORTED_MEMBER = UMLPackage.OPAQUE_BEHAVIOR__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__MEMBER = UMLPackage.OPAQUE_BEHAVIOR__MEMBER;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__IS_LEAF = UMLPackage.OPAQUE_BEHAVIOR__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__REDEFINED_ELEMENT = UMLPackage.OPAQUE_BEHAVIOR__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__REDEFINITION_CONTEXT = UMLPackage.OPAQUE_BEHAVIOR__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNING_TEMPLATE_PARAMETER = UMLPackage.OPAQUE_BEHAVIOR__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__TEMPLATE_PARAMETER = UMLPackage.OPAQUE_BEHAVIOR__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__PACKAGE = UMLPackage.OPAQUE_BEHAVIOR__PACKAGE;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__TEMPLATE_BINDING = UMLPackage.OPAQUE_BEHAVIOR__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_TEMPLATE_SIGNATURE = UMLPackage.OPAQUE_BEHAVIOR__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__FEATURE = UMLPackage.OPAQUE_BEHAVIOR__FEATURE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__ATTRIBUTE = UMLPackage.OPAQUE_BEHAVIOR__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__COLLABORATION_USE = UMLPackage.OPAQUE_BEHAVIOR__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__GENERAL = UMLPackage.OPAQUE_BEHAVIOR__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__GENERALIZATION = UMLPackage.OPAQUE_BEHAVIOR__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__POWERTYPE_EXTENT = UMLPackage.OPAQUE_BEHAVIOR__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__INHERITED_MEMBER = UMLPackage.OPAQUE_BEHAVIOR__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__IS_ABSTRACT = UMLPackage.OPAQUE_BEHAVIOR__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__IS_FINAL_SPECIALIZATION = UMLPackage.OPAQUE_BEHAVIOR__IS_FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_USE_CASE = UMLPackage.OPAQUE_BEHAVIOR__OWNED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__USE_CASE = UMLPackage.OPAQUE_BEHAVIOR__USE_CASE;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__REDEFINED_CLASSIFIER = UMLPackage.OPAQUE_BEHAVIOR__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__REPRESENTATION = UMLPackage.OPAQUE_BEHAVIOR__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__SUBSTITUTION = UMLPackage.OPAQUE_BEHAVIOR__SUBSTITUTION;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_ATTRIBUTE = UMLPackage.OPAQUE_BEHAVIOR__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_CONNECTOR = UMLPackage.OPAQUE_BEHAVIOR__OWNED_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__PART = UMLPackage.OPAQUE_BEHAVIOR__PART;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__ROLE = UMLPackage.OPAQUE_BEHAVIOR__ROLE;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_PORT = UMLPackage.OPAQUE_BEHAVIOR__OWNED_PORT;

	/**
	 * The feature id for the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__CLASSIFIER_BEHAVIOR = UMLPackage.OPAQUE_BEHAVIOR__CLASSIFIER_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__INTERFACE_REALIZATION = UMLPackage.OPAQUE_BEHAVIOR__INTERFACE_REALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_BEHAVIOR = UMLPackage.OPAQUE_BEHAVIOR__OWNED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_OPERATION = UMLPackage.OPAQUE_BEHAVIOR__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__EXTENSION = UMLPackage.OPAQUE_BEHAVIOR__EXTENSION;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__IS_ACTIVE = UMLPackage.OPAQUE_BEHAVIOR__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__NESTED_CLASSIFIER = UMLPackage.OPAQUE_BEHAVIOR__NESTED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Reception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_RECEPTION = UMLPackage.OPAQUE_BEHAVIOR__OWNED_RECEPTION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__SUPER_CLASS = UMLPackage.OPAQUE_BEHAVIOR__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__SPECIFICATION = UMLPackage.OPAQUE_BEHAVIOR__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__CONTEXT = UMLPackage.OPAQUE_BEHAVIOR__CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Reentrant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__IS_REENTRANT = UMLPackage.OPAQUE_BEHAVIOR__IS_REENTRANT;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_PARAMETER = UMLPackage.OPAQUE_BEHAVIOR__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Owned Parameter Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__OWNED_PARAMETER_SET = UMLPackage.OPAQUE_BEHAVIOR__OWNED_PARAMETER_SET;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__POSTCONDITION = UMLPackage.OPAQUE_BEHAVIOR__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__PRECONDITION = UMLPackage.OPAQUE_BEHAVIOR__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Redefined Behavior</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__REDEFINED_BEHAVIOR = UMLPackage.OPAQUE_BEHAVIOR__REDEFINED_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__BODY = UMLPackage.OPAQUE_BEHAVIOR__BODY;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__LANGUAGE = UMLPackage.OPAQUE_BEHAVIOR__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__ID = UMLPackage.OPAQUE_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Opaque Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_FEATURE_COUNT = UMLPackage.OPAQUE_BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_EANNOTATION__STRING = UMLPackage.OPAQUE_BEHAVIOR___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.OPAQUE_BEHAVIOR___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.OPAQUE_BEHAVIOR___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___ADD_KEYWORD__STRING = UMLPackage.OPAQUE_BEHAVIOR___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.OPAQUE_BEHAVIOR___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___CREATE_EANNOTATION__STRING = UMLPackage.OPAQUE_BEHAVIOR___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___DESTROY = UMLPackage.OPAQUE_BEHAVIOR___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_KEYWORDS = UMLPackage.OPAQUE_BEHAVIOR___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.OPAQUE_BEHAVIOR___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_APPLICABLE_STEREOTYPES = UMLPackage.OPAQUE_BEHAVIOR___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.OPAQUE_BEHAVIOR___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_APPLIED_STEREOTYPES = UMLPackage.OPAQUE_BEHAVIOR___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.OPAQUE_BEHAVIOR___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.OPAQUE_BEHAVIOR___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_MODEL = UMLPackage.OPAQUE_BEHAVIOR___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_NEAREST_PACKAGE = UMLPackage.OPAQUE_BEHAVIOR___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_RELATIONSHIPS = UMLPackage.OPAQUE_BEHAVIOR___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_RELATIONSHIPS__ECLASS = UMLPackage.OPAQUE_BEHAVIOR___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.OPAQUE_BEHAVIOR___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_REQUIRED_STEREOTYPES = UMLPackage.OPAQUE_BEHAVIOR___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.OPAQUE_BEHAVIOR___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.OPAQUE_BEHAVIOR___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.OPAQUE_BEHAVIOR___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_STEREOTYPE_APPLICATIONS = UMLPackage.OPAQUE_BEHAVIOR___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.OPAQUE_BEHAVIOR___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.OPAQUE_BEHAVIOR___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_VALUE__STEREOTYPE_STRING = UMLPackage.OPAQUE_BEHAVIOR___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___HAS_KEYWORD__STRING = UMLPackage.OPAQUE_BEHAVIOR___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.OPAQUE_BEHAVIOR___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.OPAQUE_BEHAVIOR___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.OPAQUE_BEHAVIOR___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.OPAQUE_BEHAVIOR___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___REMOVE_KEYWORD__STRING = UMLPackage.OPAQUE_BEHAVIOR___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.OPAQUE_BEHAVIOR___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.OPAQUE_BEHAVIOR___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___ALL_OWNED_ELEMENTS = UMLPackage.OPAQUE_BEHAVIOR___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___MUST_BE_OWNED = UMLPackage.OPAQUE_BEHAVIOR___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.OPAQUE_BEHAVIOR___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.OPAQUE_BEHAVIOR___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.OPAQUE_BEHAVIOR___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.OPAQUE_BEHAVIOR___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___CREATE_USAGE__NAMEDELEMENT = UMLPackage.OPAQUE_BEHAVIOR___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_LABEL = UMLPackage.OPAQUE_BEHAVIOR___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_LABEL__BOOLEAN = UMLPackage.OPAQUE_BEHAVIOR___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_NAMESPACE = UMLPackage.OPAQUE_BEHAVIOR___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___ALL_NAMESPACES = UMLPackage.OPAQUE_BEHAVIOR___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___ALL_OWNING_PACKAGES = UMLPackage.OPAQUE_BEHAVIOR___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.OPAQUE_BEHAVIOR___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_QUALIFIED_NAME = UMLPackage.OPAQUE_BEHAVIOR___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___SEPARATOR = UMLPackage.OPAQUE_BEHAVIOR___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_CLIENT_DEPENDENCIES = UMLPackage.OPAQUE_BEHAVIOR___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = UMLPackage.OPAQUE_BEHAVIOR___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.OPAQUE_BEHAVIOR___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP = UMLPackage.OPAQUE_BEHAVIOR___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Element Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = UMLPackage.OPAQUE_BEHAVIOR___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Create Package Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = UMLPackage.OPAQUE_BEHAVIOR___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Get Imported Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_IMPORTED_ELEMENTS = UMLPackage.OPAQUE_BEHAVIOR___GET_IMPORTED_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Imported Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_IMPORTED_PACKAGES = UMLPackage.OPAQUE_BEHAVIOR___GET_IMPORTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_OWNED_MEMBERS = UMLPackage.OPAQUE_BEHAVIOR___GET_OWNED_MEMBERS;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___EXCLUDE_COLLISIONS__ELIST = UMLPackage.OPAQUE_BEHAVIOR___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_NAMES_OF_MEMBER__NAMEDELEMENT = UMLPackage.OPAQUE_BEHAVIOR___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___IMPORT_MEMBERS__ELIST = UMLPackage.OPAQUE_BEHAVIOR___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Get Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_IMPORTED_MEMBERS = UMLPackage.OPAQUE_BEHAVIOR___GET_IMPORTED_MEMBERS;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___MEMBERS_ARE_DISTINGUISHABLE = UMLPackage.OPAQUE_BEHAVIOR___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Validate Redefinition Consistent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP = UMLPackage.OPAQUE_BEHAVIOR___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Leaf Redefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP = UMLPackage.OPAQUE_BEHAVIOR___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP = UMLPackage.OPAQUE_BEHAVIOR___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = UMLPackage.OPAQUE_BEHAVIOR___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = UMLPackage.OPAQUE_BEHAVIOR___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = UMLPackage.OPAQUE_BEHAVIOR___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___IS_TEMPLATE_PARAMETER = UMLPackage.OPAQUE_BEHAVIOR___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Validate Namespace Needs Visibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP = UMLPackage.OPAQUE_BEHAVIOR___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Association</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT = UMLPackage.OPAQUE_BEHAVIOR___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT;

	/**
	 * The operation id for the '<em>Get Associations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_ASSOCIATIONS = UMLPackage.OPAQUE_BEHAVIOR___GET_ASSOCIATIONS;

	/**
	 * The operation id for the '<em>Conforms To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___CONFORMS_TO__TYPE = UMLPackage.OPAQUE_BEHAVIOR___CONFORMS_TO__TYPE;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___IS_TEMPLATE = UMLPackage.OPAQUE_BEHAVIOR___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___PARAMETERABLE_ELEMENTS = UMLPackage.OPAQUE_BEHAVIOR___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP = UMLPackage.OPAQUE_BEHAVIOR___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Maps To Generalization Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP = UMLPackage.OPAQUE_BEHAVIOR___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Final Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP = UMLPackage.OPAQUE_BEHAVIOR___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate No Cycles In Generalization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP = UMLPackage.OPAQUE_BEHAVIOR___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_ALL_ATTRIBUTES = UMLPackage.OPAQUE_BEHAVIOR___GET_ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get All Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_ALL_OPERATIONS = UMLPackage.OPAQUE_BEHAVIOR___GET_ALL_OPERATIONS;

	/**
	 * The operation id for the '<em>Get All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_ALL_USED_INTERFACES = UMLPackage.OPAQUE_BEHAVIOR___GET_ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_OPERATION__STRING_ELIST_ELIST = UMLPackage.OPAQUE_BEHAVIOR___GET_OPERATION__STRING_ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN = UMLPackage.OPAQUE_BEHAVIOR___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN;

	/**
	 * The operation id for the '<em>Get Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_OPERATIONS = UMLPackage.OPAQUE_BEHAVIOR___GET_OPERATIONS;

	/**
	 * The operation id for the '<em>Get Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_USED_INTERFACES = UMLPackage.OPAQUE_BEHAVIOR___GET_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___ALL_FEATURES = UMLPackage.OPAQUE_BEHAVIOR___ALL_FEATURES;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___ALL_PARENTS = UMLPackage.OPAQUE_BEHAVIOR___ALL_PARENTS;

	/**
	 * The operation id for the '<em>Get Generals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_GENERALS = UMLPackage.OPAQUE_BEHAVIOR___GET_GENERALS;

	/**
	 * The operation id for the '<em>Has Visibility Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___HAS_VISIBILITY_OF__NAMEDELEMENT = UMLPackage.OPAQUE_BEHAVIOR___HAS_VISIBILITY_OF__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Inherit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___INHERIT__ELIST = UMLPackage.OPAQUE_BEHAVIOR___INHERIT__ELIST;

	/**
	 * The operation id for the '<em>Inheritable Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___INHERITABLE_MEMBERS__CLASSIFIER = UMLPackage.OPAQUE_BEHAVIOR___INHERITABLE_MEMBERS__CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Inherited Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_INHERITED_MEMBERS = UMLPackage.OPAQUE_BEHAVIOR___GET_INHERITED_MEMBERS;

	/**
	 * The operation id for the '<em>May Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___MAY_SPECIALIZE_TYPE__CLASSIFIER = UMLPackage.OPAQUE_BEHAVIOR___MAY_SPECIALIZE_TYPE__CLASSIFIER;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___PARENTS = UMLPackage.OPAQUE_BEHAVIOR___PARENTS;

	/**
	 * The operation id for the '<em>Directly Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___DIRECTLY_REALIZED_INTERFACES = UMLPackage.OPAQUE_BEHAVIOR___DIRECTLY_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>Directly Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___DIRECTLY_USED_INTERFACES = UMLPackage.OPAQUE_BEHAVIOR___DIRECTLY_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___ALL_REALIZED_INTERFACES = UMLPackage.OPAQUE_BEHAVIOR___ALL_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___ALL_USED_INTERFACES = UMLPackage.OPAQUE_BEHAVIOR___ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Is Substitutable For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___IS_SUBSTITUTABLE_FOR__CLASSIFIER = UMLPackage.OPAQUE_BEHAVIOR___IS_SUBSTITUTABLE_FOR__CLASSIFIER;

	/**
	 * The operation id for the '<em>All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___ALL_ATTRIBUTES = UMLPackage.OPAQUE_BEHAVIOR___ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>All Slottable Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___ALL_SLOTTABLE_FEATURES = UMLPackage.OPAQUE_BEHAVIOR___ALL_SLOTTABLE_FEATURES;

	/**
	 * The operation id for the '<em>Create Owned Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT = UMLPackage.OPAQUE_BEHAVIOR___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_PARTS = UMLPackage.OPAQUE_BEHAVIOR___GET_PARTS;

	/**
	 * The operation id for the '<em>All Roles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___ALL_ROLES = UMLPackage.OPAQUE_BEHAVIOR___ALL_ROLES;

	/**
	 * The operation id for the '<em>Get Owned Ports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_OWNED_PORTS = UMLPackage.OPAQUE_BEHAVIOR___GET_OWNED_PORTS;

	/**
	 * The operation id for the '<em>Validate Class Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP = UMLPackage.OPAQUE_BEHAVIOR___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get All Implemented Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_ALL_IMPLEMENTED_INTERFACES = UMLPackage.OPAQUE_BEHAVIOR___GET_ALL_IMPLEMENTED_INTERFACES;

	/**
	 * The operation id for the '<em>Get Implemented Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_IMPLEMENTED_INTERFACES = UMLPackage.OPAQUE_BEHAVIOR___GET_IMPLEMENTED_INTERFACES;

	/**
	 * The operation id for the '<em>Validate Passive Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP = UMLPackage.OPAQUE_BEHAVIOR___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Owned Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE = UMLPackage.OPAQUE_BEHAVIOR___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE;

	/**
	 * The operation id for the '<em>Is Metaclass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___IS_METACLASS = UMLPackage.OPAQUE_BEHAVIOR___IS_METACLASS;

	/**
	 * The operation id for the '<em>Get Extensions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_EXTENSIONS = UMLPackage.OPAQUE_BEHAVIOR___GET_EXTENSIONS;

	/**
	 * The operation id for the '<em>Get Super Classes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_SUPER_CLASSES = UMLPackage.OPAQUE_BEHAVIOR___GET_SUPER_CLASSES;

	/**
	 * The operation id for the '<em>Validate Most One Behavior</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___VALIDATE_MOST_ONE_BEHAVIOR__DIAGNOSTICCHAIN_MAP = UMLPackage.OPAQUE_BEHAVIOR___VALIDATE_MOST_ONE_BEHAVIOR__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Parameters Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___VALIDATE_PARAMETERS_MATCH__DIAGNOSTICCHAIN_MAP = UMLPackage.OPAQUE_BEHAVIOR___VALIDATE_PARAMETERS_MATCH__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Feature Of Context Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___VALIDATE_FEATURE_OF_CONTEXT_CLASSIFIER__DIAGNOSTICCHAIN_MAP = UMLPackage.OPAQUE_BEHAVIOR___VALIDATE_FEATURE_OF_CONTEXT_CLASSIFIER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___GET_CONTEXT = UMLPackage.OPAQUE_BEHAVIOR___GET_CONTEXT;

	/**
	 * The operation id for the '<em>Behaviored Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___BEHAVIORED_CLASSIFIER__ELEMENT = UMLPackage.OPAQUE_BEHAVIOR___BEHAVIORED_CLASSIFIER__ELEMENT;

	/**
	 * The operation id for the '<em>Input Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___INPUT_PARAMETERS = UMLPackage.OPAQUE_BEHAVIOR___INPUT_PARAMETERS;

	/**
	 * The operation id for the '<em>Output Parameters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR___OUTPUT_PARAMETERS = UMLPackage.OPAQUE_BEHAVIOR___OUTPUT_PARAMETERS;

	/**
	 * The number of operations of the '<em>Opaque Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_OPERATION_COUNT = UMLPackage.OPAQUE_BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.PropertyImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.Sequence_diagramPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 11;

	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.ActorLifelineImpl <em>Actor Lifeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.ActorLifelineImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.Sequence_diagramPackageImpl#getActorLifeline()
	 * @generated
	 */
	int ACTOR_LIFELINE = 9;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE__EANNOTATIONS = UMLPackage.LIFELINE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE__OWNED_COMMENT = UMLPackage.LIFELINE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE__OWNED_ELEMENT = UMLPackage.LIFELINE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE__OWNER = UMLPackage.LIFELINE__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE__CLIENT_DEPENDENCY = UMLPackage.LIFELINE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE__NAME = UMLPackage.LIFELINE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE__NAME_EXPRESSION = UMLPackage.LIFELINE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE__NAMESPACE = UMLPackage.LIFELINE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE__QUALIFIED_NAME = UMLPackage.LIFELINE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE__VISIBILITY = UMLPackage.LIFELINE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Decomposed As</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE__DECOMPOSED_AS = UMLPackage.LIFELINE__DECOMPOSED_AS;

	/**
	 * The feature id for the '<em><b>Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE__INTERACTION = UMLPackage.LIFELINE__INTERACTION;

	/**
	 * The feature id for the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE__REPRESENTS = UMLPackage.LIFELINE__REPRESENTS;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE__SELECTOR = UMLPackage.LIFELINE__SELECTOR;

	/**
	 * The feature id for the '<em><b>Covered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE__COVERED_BY = UMLPackage.LIFELINE__COVERED_BY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE__ID = UMLPackage.LIFELINE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actor Lifeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE_FEATURE_COUNT = UMLPackage.LIFELINE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___GET_EANNOTATION__STRING = UMLPackage.LIFELINE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.LIFELINE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.LIFELINE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___ADD_KEYWORD__STRING = UMLPackage.LIFELINE___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.LIFELINE___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___CREATE_EANNOTATION__STRING = UMLPackage.LIFELINE___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___DESTROY = UMLPackage.LIFELINE___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___GET_KEYWORDS = UMLPackage.LIFELINE___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.LIFELINE___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___GET_APPLICABLE_STEREOTYPES = UMLPackage.LIFELINE___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.LIFELINE___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___GET_APPLIED_STEREOTYPES = UMLPackage.LIFELINE___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.LIFELINE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.LIFELINE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___GET_MODEL = UMLPackage.LIFELINE___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___GET_NEAREST_PACKAGE = UMLPackage.LIFELINE___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___GET_RELATIONSHIPS = UMLPackage.LIFELINE___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___GET_RELATIONSHIPS__ECLASS = UMLPackage.LIFELINE___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.LIFELINE___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___GET_REQUIRED_STEREOTYPES = UMLPackage.LIFELINE___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.LIFELINE___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.LIFELINE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.LIFELINE___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___GET_STEREOTYPE_APPLICATIONS = UMLPackage.LIFELINE___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.LIFELINE___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.LIFELINE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___GET_VALUE__STEREOTYPE_STRING = UMLPackage.LIFELINE___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___HAS_KEYWORD__STRING = UMLPackage.LIFELINE___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.LIFELINE___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.LIFELINE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.LIFELINE___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.LIFELINE___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___REMOVE_KEYWORD__STRING = UMLPackage.LIFELINE___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.LIFELINE___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.LIFELINE___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___ALL_OWNED_ELEMENTS = UMLPackage.LIFELINE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___MUST_BE_OWNED = UMLPackage.LIFELINE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.LIFELINE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.LIFELINE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.LIFELINE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.LIFELINE___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___CREATE_USAGE__NAMEDELEMENT = UMLPackage.LIFELINE___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___GET_LABEL = UMLPackage.LIFELINE___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___GET_LABEL__BOOLEAN = UMLPackage.LIFELINE___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___GET_NAMESPACE = UMLPackage.LIFELINE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___ALL_NAMESPACES = UMLPackage.LIFELINE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___ALL_OWNING_PACKAGES = UMLPackage.LIFELINE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.LIFELINE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___GET_QUALIFIED_NAME = UMLPackage.LIFELINE___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___SEPARATOR = UMLPackage.LIFELINE___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___GET_CLIENT_DEPENDENCIES = UMLPackage.LIFELINE___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Selector Specified</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___VALIDATE_SELECTOR_SPECIFIED__DIAGNOSTICCHAIN_MAP = UMLPackage.LIFELINE___VALIDATE_SELECTOR_SPECIFIED__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Interaction Uses Share Lifeline</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___VALIDATE_INTERACTION_USES_SHARE_LIFELINE__DIAGNOSTICCHAIN_MAP = UMLPackage.LIFELINE___VALIDATE_INTERACTION_USES_SHARE_LIFELINE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Same Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___VALIDATE_SAME_CLASSIFIER__DIAGNOSTICCHAIN_MAP = UMLPackage.LIFELINE___VALIDATE_SAME_CLASSIFIER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Selector Int Or String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE___VALIDATE_SELECTOR_INT_OR_STRING__DIAGNOSTICCHAIN_MAP = UMLPackage.LIFELINE___VALIDATE_SELECTOR_INT_OR_STRING__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Actor Lifeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_LIFELINE_OPERATION_COUNT = UMLPackage.LIFELINE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__EANNOTATIONS = UMLPackage.LIFELINE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__OWNED_COMMENT = UMLPackage.LIFELINE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__OWNED_ELEMENT = UMLPackage.LIFELINE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__OWNER = UMLPackage.LIFELINE__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__CLIENT_DEPENDENCY = UMLPackage.LIFELINE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__NAME = UMLPackage.LIFELINE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__NAME_EXPRESSION = UMLPackage.LIFELINE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__NAMESPACE = UMLPackage.LIFELINE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__QUALIFIED_NAME = UMLPackage.LIFELINE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__VISIBILITY = UMLPackage.LIFELINE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Decomposed As</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__DECOMPOSED_AS = UMLPackage.LIFELINE__DECOMPOSED_AS;

	/**
	 * The feature id for the '<em><b>Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__INTERACTION = UMLPackage.LIFELINE__INTERACTION;

	/**
	 * The feature id for the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__REPRESENTS = UMLPackage.LIFELINE__REPRESENTS;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__SELECTOR = UMLPackage.LIFELINE__SELECTOR;

	/**
	 * The feature id for the '<em><b>Covered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__COVERED_BY = UMLPackage.LIFELINE__COVERED_BY;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE__ID = UMLPackage.LIFELINE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lifeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE_FEATURE_COUNT = UMLPackage.LIFELINE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___GET_EANNOTATION__STRING = UMLPackage.LIFELINE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.LIFELINE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.LIFELINE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___ADD_KEYWORD__STRING = UMLPackage.LIFELINE___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.LIFELINE___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___CREATE_EANNOTATION__STRING = UMLPackage.LIFELINE___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___DESTROY = UMLPackage.LIFELINE___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___GET_KEYWORDS = UMLPackage.LIFELINE___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.LIFELINE___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___GET_APPLICABLE_STEREOTYPES = UMLPackage.LIFELINE___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.LIFELINE___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___GET_APPLIED_STEREOTYPES = UMLPackage.LIFELINE___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.LIFELINE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.LIFELINE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___GET_MODEL = UMLPackage.LIFELINE___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___GET_NEAREST_PACKAGE = UMLPackage.LIFELINE___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___GET_RELATIONSHIPS = UMLPackage.LIFELINE___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___GET_RELATIONSHIPS__ECLASS = UMLPackage.LIFELINE___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.LIFELINE___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___GET_REQUIRED_STEREOTYPES = UMLPackage.LIFELINE___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.LIFELINE___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.LIFELINE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.LIFELINE___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___GET_STEREOTYPE_APPLICATIONS = UMLPackage.LIFELINE___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.LIFELINE___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.LIFELINE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___GET_VALUE__STEREOTYPE_STRING = UMLPackage.LIFELINE___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___HAS_KEYWORD__STRING = UMLPackage.LIFELINE___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.LIFELINE___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.LIFELINE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.LIFELINE___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.LIFELINE___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___REMOVE_KEYWORD__STRING = UMLPackage.LIFELINE___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.LIFELINE___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.LIFELINE___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___ALL_OWNED_ELEMENTS = UMLPackage.LIFELINE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___MUST_BE_OWNED = UMLPackage.LIFELINE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.LIFELINE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.LIFELINE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.LIFELINE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.LIFELINE___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___CREATE_USAGE__NAMEDELEMENT = UMLPackage.LIFELINE___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___GET_LABEL = UMLPackage.LIFELINE___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___GET_LABEL__BOOLEAN = UMLPackage.LIFELINE___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___GET_NAMESPACE = UMLPackage.LIFELINE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___ALL_NAMESPACES = UMLPackage.LIFELINE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___ALL_OWNING_PACKAGES = UMLPackage.LIFELINE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.LIFELINE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___GET_QUALIFIED_NAME = UMLPackage.LIFELINE___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___SEPARATOR = UMLPackage.LIFELINE___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___GET_CLIENT_DEPENDENCIES = UMLPackage.LIFELINE___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Selector Specified</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___VALIDATE_SELECTOR_SPECIFIED__DIAGNOSTICCHAIN_MAP = UMLPackage.LIFELINE___VALIDATE_SELECTOR_SPECIFIED__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Interaction Uses Share Lifeline</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___VALIDATE_INTERACTION_USES_SHARE_LIFELINE__DIAGNOSTICCHAIN_MAP = UMLPackage.LIFELINE___VALIDATE_INTERACTION_USES_SHARE_LIFELINE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Same Classifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___VALIDATE_SAME_CLASSIFIER__DIAGNOSTICCHAIN_MAP = UMLPackage.LIFELINE___VALIDATE_SAME_CLASSIFIER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Selector Int Or String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE___VALIDATE_SELECTOR_INT_OR_STRING__DIAGNOSTICCHAIN_MAP = UMLPackage.LIFELINE___VALIDATE_SELECTOR_INT_OR_STRING__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Lifeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFELINE_OPERATION_COUNT = UMLPackage.LIFELINE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__EANNOTATIONS = UMLPackage.PROPERTY__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OWNED_COMMENT = UMLPackage.PROPERTY__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OWNED_ELEMENT = UMLPackage.PROPERTY__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OWNER = UMLPackage.PROPERTY__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CLIENT_DEPENDENCY = UMLPackage.PROPERTY__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = UMLPackage.PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME_EXPRESSION = UMLPackage.PROPERTY__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAMESPACE = UMLPackage.PROPERTY__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__QUALIFIED_NAME = UMLPackage.PROPERTY__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VISIBILITY = UMLPackage.PROPERTY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_LEAF = UMLPackage.PROPERTY__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REDEFINED_ELEMENT = UMLPackage.PROPERTY__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REDEFINITION_CONTEXT = UMLPackage.PROPERTY__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__FEATURING_CLASSIFIER = UMLPackage.PROPERTY__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_STATIC = UMLPackage.PROPERTY__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = UMLPackage.PROPERTY__TYPE;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_ORDERED = UMLPackage.PROPERTY__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_UNIQUE = UMLPackage.PROPERTY__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LOWER = UMLPackage.PROPERTY__LOWER;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LOWER_VALUE = UMLPackage.PROPERTY__LOWER_VALUE;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UPPER = UMLPackage.PROPERTY__UPPER;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UPPER_VALUE = UMLPackage.PROPERTY__UPPER_VALUE;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_READ_ONLY = UMLPackage.PROPERTY__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OWNING_TEMPLATE_PARAMETER = UMLPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TEMPLATE_PARAMETER = UMLPackage.PROPERTY__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__END = UMLPackage.PROPERTY__END;

	/**
	 * The feature id for the '<em><b>Deployed Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DEPLOYED_ELEMENT = UMLPackage.PROPERTY__DEPLOYED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Deployment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DEPLOYMENT = UMLPackage.PROPERTY__DEPLOYMENT;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DATATYPE = UMLPackage.PROPERTY__DATATYPE;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__INTERFACE = UMLPackage.PROPERTY__INTERFACE;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DEFAULT = UMLPackage.PROPERTY__DEFAULT;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__AGGREGATION = UMLPackage.PROPERTY__AGGREGATION;

	/**
	 * The feature id for the '<em><b>Association End</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ASSOCIATION_END = UMLPackage.PROPERTY__ASSOCIATION_END;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__QUALIFIER = UMLPackage.PROPERTY__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CLASS = UMLPackage.PROPERTY__CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DEFAULT_VALUE = UMLPackage.PROPERTY__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_COMPOSITE = UMLPackage.PROPERTY__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_DERIVED = UMLPackage.PROPERTY__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Derived Union</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_DERIVED_UNION = UMLPackage.PROPERTY__IS_DERIVED_UNION;

	/**
	 * The feature id for the '<em><b>Is ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_ID = UMLPackage.PROPERTY__IS_ID;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OPPOSITE = UMLPackage.PROPERTY__OPPOSITE;

	/**
	 * The feature id for the '<em><b>Owning Association</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OWNING_ASSOCIATION = UMLPackage.PROPERTY__OWNING_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Redefined Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REDEFINED_PROPERTY = UMLPackage.PROPERTY__REDEFINED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Subsetted Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SUBSETTED_PROPERTY = UMLPackage.PROPERTY__SUBSETTED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ASSOCIATION = UMLPackage.PROPERTY__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ID = UMLPackage.PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = UMLPackage.PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_EANNOTATION__STRING = UMLPackage.PROPERTY___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.PROPERTY___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.PROPERTY___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___ADD_KEYWORD__STRING = UMLPackage.PROPERTY___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.PROPERTY___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___CREATE_EANNOTATION__STRING = UMLPackage.PROPERTY___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___DESTROY = UMLPackage.PROPERTY___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_KEYWORDS = UMLPackage.PROPERTY___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.PROPERTY___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_APPLICABLE_STEREOTYPES = UMLPackage.PROPERTY___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.PROPERTY___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_APPLIED_STEREOTYPES = UMLPackage.PROPERTY___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.PROPERTY___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.PROPERTY___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_MODEL = UMLPackage.PROPERTY___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_NEAREST_PACKAGE = UMLPackage.PROPERTY___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_RELATIONSHIPS = UMLPackage.PROPERTY___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_RELATIONSHIPS__ECLASS = UMLPackage.PROPERTY___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.PROPERTY___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_REQUIRED_STEREOTYPES = UMLPackage.PROPERTY___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.PROPERTY___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.PROPERTY___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.PROPERTY___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_STEREOTYPE_APPLICATIONS = UMLPackage.PROPERTY___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.PROPERTY___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.PROPERTY___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_VALUE__STEREOTYPE_STRING = UMLPackage.PROPERTY___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___HAS_KEYWORD__STRING = UMLPackage.PROPERTY___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.PROPERTY___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.PROPERTY___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.PROPERTY___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.PROPERTY___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___REMOVE_KEYWORD__STRING = UMLPackage.PROPERTY___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.PROPERTY___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.PROPERTY___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___ALL_OWNED_ELEMENTS = UMLPackage.PROPERTY___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___MUST_BE_OWNED = UMLPackage.PROPERTY___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.PROPERTY___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.PROPERTY___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.PROPERTY___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.PROPERTY___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___CREATE_USAGE__NAMEDELEMENT = UMLPackage.PROPERTY___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_LABEL = UMLPackage.PROPERTY___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_LABEL__BOOLEAN = UMLPackage.PROPERTY___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_NAMESPACE = UMLPackage.PROPERTY___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___ALL_NAMESPACES = UMLPackage.PROPERTY___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___ALL_OWNING_PACKAGES = UMLPackage.PROPERTY___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.PROPERTY___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_QUALIFIED_NAME = UMLPackage.PROPERTY___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___SEPARATOR = UMLPackage.PROPERTY___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_CLIENT_DEPENDENCIES = UMLPackage.PROPERTY___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Redefinition Consistent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP = UMLPackage.PROPERTY___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Leaf Redefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP = UMLPackage.PROPERTY___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP = UMLPackage.PROPERTY___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = UMLPackage.PROPERTY___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = UMLPackage.PROPERTY___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Validate Upper Ge Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP = UMLPackage.PROPERTY___VALIDATE_UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Lower Ge0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP = UMLPackage.PROPERTY___VALIDATE_LOWER_GE0__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Value Specification No Side Effects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP = UMLPackage.PROPERTY___VALIDATE_VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Value Specification Constant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP = UMLPackage.PROPERTY___VALIDATE_VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Lower Is Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP = UMLPackage.PROPERTY___VALIDATE_LOWER_IS_INTEGER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Upper Is Unlimited Natural</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP = UMLPackage.PROPERTY___VALIDATE_UPPER_IS_UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Set Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___SET_LOWER__INT = UMLPackage.PROPERTY___SET_LOWER__INT;

	/**
	 * The operation id for the '<em>Set Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___SET_UPPER__INT = UMLPackage.PROPERTY___SET_UPPER__INT;

	/**
	 * The operation id for the '<em>Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___COMPATIBLE_WITH__MULTIPLICITYELEMENT = UMLPackage.PROPERTY___COMPATIBLE_WITH__MULTIPLICITYELEMENT;

	/**
	 * The operation id for the '<em>Includes Multiplicity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT = UMLPackage.PROPERTY___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT;

	/**
	 * The operation id for the '<em>Is</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS__INT_INT = UMLPackage.PROPERTY___IS__INT_INT;

	/**
	 * The operation id for the '<em>Is Multivalued</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_MULTIVALUED = UMLPackage.PROPERTY___IS_MULTIVALUED;

	/**
	 * The operation id for the '<em>Get Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_LOWER = UMLPackage.PROPERTY___GET_LOWER;

	/**
	 * The operation id for the '<em>Lower Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___LOWER_BOUND = UMLPackage.PROPERTY___LOWER_BOUND;

	/**
	 * The operation id for the '<em>Get Upper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_UPPER = UMLPackage.PROPERTY___GET_UPPER;

	/**
	 * The operation id for the '<em>Upper Bound</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___UPPER_BOUND = UMLPackage.PROPERTY___UPPER_BOUND;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = UMLPackage.PROPERTY___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_TEMPLATE_PARAMETER = UMLPackage.PROPERTY___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Get Ends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_ENDS = UMLPackage.PROPERTY___GET_ENDS;

	/**
	 * The operation id for the '<em>Get Deployed Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_DEPLOYED_ELEMENTS = UMLPackage.PROPERTY___GET_DEPLOYED_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate Subsetting Context Conforms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___VALIDATE_SUBSETTING_CONTEXT_CONFORMS__DIAGNOSTICCHAIN_MAP = UMLPackage.PROPERTY___VALIDATE_SUBSETTING_CONTEXT_CONFORMS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Derived Union Is Read Only</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___VALIDATE_DERIVED_UNION_IS_READ_ONLY__DIAGNOSTICCHAIN_MAP = UMLPackage.PROPERTY___VALIDATE_DERIVED_UNION_IS_READ_ONLY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Multiplicity Of Composite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___VALIDATE_MULTIPLICITY_OF_COMPOSITE__DIAGNOSTICCHAIN_MAP = UMLPackage.PROPERTY___VALIDATE_MULTIPLICITY_OF_COMPOSITE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Redefined Property Inherited</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___VALIDATE_REDEFINED_PROPERTY_INHERITED__DIAGNOSTICCHAIN_MAP = UMLPackage.PROPERTY___VALIDATE_REDEFINED_PROPERTY_INHERITED__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Subsetting Rules</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___VALIDATE_SUBSETTING_RULES__DIAGNOSTICCHAIN_MAP = UMLPackage.PROPERTY___VALIDATE_SUBSETTING_RULES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Binding To Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___VALIDATE_BINDING_TO_ATTRIBUTE__DIAGNOSTICCHAIN_MAP = UMLPackage.PROPERTY___VALIDATE_BINDING_TO_ATTRIBUTE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Derived Union Is Derived</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___VALIDATE_DERIVED_UNION_IS_DERIVED__DIAGNOSTICCHAIN_MAP = UMLPackage.PROPERTY___VALIDATE_DERIVED_UNION_IS_DERIVED__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Deployment Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___VALIDATE_DEPLOYMENT_TARGET__DIAGNOSTICCHAIN_MAP = UMLPackage.PROPERTY___VALIDATE_DEPLOYMENT_TARGET__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Subsetted Property Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___VALIDATE_SUBSETTED_PROPERTY_NAMES__DIAGNOSTICCHAIN_MAP = UMLPackage.PROPERTY___VALIDATE_SUBSETTED_PROPERTY_NAMES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Type Of Opposite End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___VALIDATE_TYPE_OF_OPPOSITE_END__DIAGNOSTICCHAIN_MAP = UMLPackage.PROPERTY___VALIDATE_TYPE_OF_OPPOSITE_END__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Qualified Is Association End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___VALIDATE_QUALIFIED_IS_ASSOCIATION_END__DIAGNOSTICCHAIN_MAP = UMLPackage.PROPERTY___VALIDATE_QUALIFIED_IS_ASSOCIATION_END__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_DEFAULT = UMLPackage.PROPERTY___GET_DEFAULT;

	/**
	 * The operation id for the '<em>Get Other End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_OTHER_END = UMLPackage.PROPERTY___GET_OTHER_END;

	/**
	 * The operation id for the '<em>Is Set Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_SET_DEFAULT = UMLPackage.PROPERTY___IS_SET_DEFAULT;

	/**
	 * The operation id for the '<em>Set Boolean Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___SET_BOOLEAN_DEFAULT_VALUE__BOOLEAN = UMLPackage.PROPERTY___SET_BOOLEAN_DEFAULT_VALUE__BOOLEAN;

	/**
	 * The operation id for the '<em>Set Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___SET_DEFAULT__STRING = UMLPackage.PROPERTY___SET_DEFAULT__STRING;

	/**
	 * The operation id for the '<em>Set Integer Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___SET_INTEGER_DEFAULT_VALUE__INT = UMLPackage.PROPERTY___SET_INTEGER_DEFAULT_VALUE__INT;

	/**
	 * The operation id for the '<em>Set Is Composite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___SET_IS_COMPOSITE__BOOLEAN = UMLPackage.PROPERTY___SET_IS_COMPOSITE__BOOLEAN;

	/**
	 * The operation id for the '<em>Set Is Navigable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___SET_IS_NAVIGABLE__BOOLEAN = UMLPackage.PROPERTY___SET_IS_NAVIGABLE__BOOLEAN;

	/**
	 * The operation id for the '<em>Set Null Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___SET_NULL_DEFAULT_VALUE = UMLPackage.PROPERTY___SET_NULL_DEFAULT_VALUE;

	/**
	 * The operation id for the '<em>Set Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___SET_OPPOSITE__PROPERTY = UMLPackage.PROPERTY___SET_OPPOSITE__PROPERTY;

	/**
	 * The operation id for the '<em>Set Real Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___SET_REAL_DEFAULT_VALUE__DOUBLE = UMLPackage.PROPERTY___SET_REAL_DEFAULT_VALUE__DOUBLE;

	/**
	 * The operation id for the '<em>Set String Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___SET_STRING_DEFAULT_VALUE__STRING = UMLPackage.PROPERTY___SET_STRING_DEFAULT_VALUE__STRING;

	/**
	 * The operation id for the '<em>Set Unlimited Natural Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___SET_UNLIMITED_NATURAL_DEFAULT_VALUE__INT = UMLPackage.PROPERTY___SET_UNLIMITED_NATURAL_DEFAULT_VALUE__INT;

	/**
	 * The operation id for the '<em>Unset Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___UNSET_DEFAULT = UMLPackage.PROPERTY___UNSET_DEFAULT;

	/**
	 * The operation id for the '<em>Is Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_ATTRIBUTE = UMLPackage.PROPERTY___IS_ATTRIBUTE;

	/**
	 * The operation id for the '<em>Is Composite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_COMPOSITE = UMLPackage.PROPERTY___IS_COMPOSITE;

	/**
	 * The operation id for the '<em>Is Navigable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_NAVIGABLE = UMLPackage.PROPERTY___IS_NAVIGABLE;

	/**
	 * The operation id for the '<em>Get Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_OPPOSITE = UMLPackage.PROPERTY___GET_OPPOSITE;

	/**
	 * The operation id for the '<em>Subsetting Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___SUBSETTING_CONTEXT = UMLPackage.PROPERTY___SUBSETTING_CONTEXT;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = UMLPackage.PROPERTY_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.ExecutionSpecifiactionImpl <em>Execution Specifiaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.ExecutionSpecifiactionImpl
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.Sequence_diagramPackageImpl#getExecutionSpecifiaction()
	 * @generated
	 */
	int EXECUTION_SPECIFIACTION = 12;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION__EANNOTATIONS = UMLPackage.EXECUTION_SPECIFICATION__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION__OWNED_COMMENT = UMLPackage.EXECUTION_SPECIFICATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION__OWNED_ELEMENT = UMLPackage.EXECUTION_SPECIFICATION__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION__OWNER = UMLPackage.EXECUTION_SPECIFICATION__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION__CLIENT_DEPENDENCY = UMLPackage.EXECUTION_SPECIFICATION__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION__NAME = UMLPackage.EXECUTION_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION__NAME_EXPRESSION = UMLPackage.EXECUTION_SPECIFICATION__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION__NAMESPACE = UMLPackage.EXECUTION_SPECIFICATION__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION__QUALIFIED_NAME = UMLPackage.EXECUTION_SPECIFICATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION__VISIBILITY = UMLPackage.EXECUTION_SPECIFICATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION__COVERED = UMLPackage.EXECUTION_SPECIFICATION__COVERED;

	/**
	 * The feature id for the '<em><b>Enclosing Operand</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION__ENCLOSING_OPERAND = UMLPackage.EXECUTION_SPECIFICATION__ENCLOSING_OPERAND;

	/**
	 * The feature id for the '<em><b>Enclosing Interaction</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION__ENCLOSING_INTERACTION = UMLPackage.EXECUTION_SPECIFICATION__ENCLOSING_INTERACTION;

	/**
	 * The feature id for the '<em><b>General Ordering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION__GENERAL_ORDERING = UMLPackage.EXECUTION_SPECIFICATION__GENERAL_ORDERING;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION__FINISH = UMLPackage.EXECUTION_SPECIFICATION__FINISH;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION__START = UMLPackage.EXECUTION_SPECIFICATION__START;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION__ID = UMLPackage.EXECUTION_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Execution Specifiaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION_FEATURE_COUNT = UMLPackage.EXECUTION_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___GET_EANNOTATION__STRING = UMLPackage.EXECUTION_SPECIFICATION___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.EXECUTION_SPECIFICATION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.EXECUTION_SPECIFICATION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___ADD_KEYWORD__STRING = UMLPackage.EXECUTION_SPECIFICATION___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.EXECUTION_SPECIFICATION___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___CREATE_EANNOTATION__STRING = UMLPackage.EXECUTION_SPECIFICATION___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___DESTROY = UMLPackage.EXECUTION_SPECIFICATION___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___GET_KEYWORDS = UMLPackage.EXECUTION_SPECIFICATION___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.EXECUTION_SPECIFICATION___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___GET_APPLICABLE_STEREOTYPES = UMLPackage.EXECUTION_SPECIFICATION___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.EXECUTION_SPECIFICATION___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___GET_APPLIED_STEREOTYPES = UMLPackage.EXECUTION_SPECIFICATION___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.EXECUTION_SPECIFICATION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.EXECUTION_SPECIFICATION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___GET_MODEL = UMLPackage.EXECUTION_SPECIFICATION___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___GET_NEAREST_PACKAGE = UMLPackage.EXECUTION_SPECIFICATION___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___GET_RELATIONSHIPS = UMLPackage.EXECUTION_SPECIFICATION___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___GET_RELATIONSHIPS__ECLASS = UMLPackage.EXECUTION_SPECIFICATION___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.EXECUTION_SPECIFICATION___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___GET_REQUIRED_STEREOTYPES = UMLPackage.EXECUTION_SPECIFICATION___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.EXECUTION_SPECIFICATION___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.EXECUTION_SPECIFICATION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.EXECUTION_SPECIFICATION___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___GET_STEREOTYPE_APPLICATIONS = UMLPackage.EXECUTION_SPECIFICATION___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.EXECUTION_SPECIFICATION___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.EXECUTION_SPECIFICATION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___GET_VALUE__STEREOTYPE_STRING = UMLPackage.EXECUTION_SPECIFICATION___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___HAS_KEYWORD__STRING = UMLPackage.EXECUTION_SPECIFICATION___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.EXECUTION_SPECIFICATION___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.EXECUTION_SPECIFICATION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.EXECUTION_SPECIFICATION___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.EXECUTION_SPECIFICATION___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___REMOVE_KEYWORD__STRING = UMLPackage.EXECUTION_SPECIFICATION___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.EXECUTION_SPECIFICATION___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.EXECUTION_SPECIFICATION___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___ALL_OWNED_ELEMENTS = UMLPackage.EXECUTION_SPECIFICATION___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___MUST_BE_OWNED = UMLPackage.EXECUTION_SPECIFICATION___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.EXECUTION_SPECIFICATION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.EXECUTION_SPECIFICATION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.EXECUTION_SPECIFICATION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.EXECUTION_SPECIFICATION___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___CREATE_USAGE__NAMEDELEMENT = UMLPackage.EXECUTION_SPECIFICATION___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___GET_LABEL = UMLPackage.EXECUTION_SPECIFICATION___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___GET_LABEL__BOOLEAN = UMLPackage.EXECUTION_SPECIFICATION___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___GET_NAMESPACE = UMLPackage.EXECUTION_SPECIFICATION___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___ALL_NAMESPACES = UMLPackage.EXECUTION_SPECIFICATION___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___ALL_OWNING_PACKAGES = UMLPackage.EXECUTION_SPECIFICATION___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.EXECUTION_SPECIFICATION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___GET_QUALIFIED_NAME = UMLPackage.EXECUTION_SPECIFICATION___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___SEPARATOR = UMLPackage.EXECUTION_SPECIFICATION___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___GET_CLIENT_DEPENDENCIES = UMLPackage.EXECUTION_SPECIFICATION___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Same Lifeline</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION___VALIDATE_SAME_LIFELINE__DIAGNOSTICCHAIN_MAP = UMLPackage.EXECUTION_SPECIFICATION___VALIDATE_SAME_LIFELINE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Execution Specifiaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_SPECIFIACTION_OPERATION_COUNT = UMLPackage.EXECUTION_SPECIFICATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.MessageOccurenceSpecification <em>Message Occurence Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Occurence Specification</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.MessageOccurenceSpecification
	 * @generated
	 */
	EClass getMessageOccurenceSpecification();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.BehaviorExecutionSpecification <em>Behavior Execution Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Execution Specification</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.BehaviorExecutionSpecification
	 * @generated
	 */
	EClass getBehaviorExecutionSpecification();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.OpaqueBehavior <em>Opaque Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Behavior</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.OpaqueBehavior
	 * @generated
	 */
	EClass getOpaqueBehavior();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Lifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lifeline</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Lifeline
	 * @generated
	 */
	EClass getLifeline();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Interaction
	 * @generated
	 */
	EClass getInteraction();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.ExecutionSpecifiaction <em>Execution Specifiaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Specifiaction</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.ExecutionSpecifiaction
	 * @generated
	 */
	EClass getExecutionSpecifiaction();

	/**
	 * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.ActorLifeline <em>Actor Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Lifeline</em>'.
	 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.ActorLifeline
	 * @generated
	 */
	EClass getActorLifeline();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Sequence_diagramFactory getSequence_diagramFactory();

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
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.MessageImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.Sequence_diagramPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.MessageOccurenceSpecificationImpl <em>Message Occurence Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.MessageOccurenceSpecificationImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.Sequence_diagramPackageImpl#getMessageOccurenceSpecification()
		 * @generated
		 */
		EClass MESSAGE_OCCURENCE_SPECIFICATION = eINSTANCE.getMessageOccurenceSpecification();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.BehaviorExecutionSpecificationImpl <em>Behavior Execution Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.BehaviorExecutionSpecificationImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.Sequence_diagramPackageImpl#getBehaviorExecutionSpecification()
		 * @generated
		 */
		EClass BEHAVIOR_EXECUTION_SPECIFICATION = eINSTANCE.getBehaviorExecutionSpecification();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.OpaqueBehaviorImpl <em>Opaque Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.OpaqueBehaviorImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.Sequence_diagramPackageImpl#getOpaqueBehavior()
		 * @generated
		 */
		EClass OPAQUE_BEHAVIOR = eINSTANCE.getOpaqueBehavior();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.LifelineImpl <em>Lifeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.LifelineImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.Sequence_diagramPackageImpl#getLifeline()
		 * @generated
		 */
		EClass LIFELINE = eINSTANCE.getLifeline();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.ActorImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.Sequence_diagramPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.OperationImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.Sequence_diagramPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.InteractionImpl <em>Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.InteractionImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.Sequence_diagramPackageImpl#getInteraction()
		 * @generated
		 */
		EClass INTERACTION = eINSTANCE.getInteraction();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.PackageImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.Sequence_diagramPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.ClassImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.Sequence_diagramPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.PropertyImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.Sequence_diagramPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.ExecutionSpecifiactionImpl <em>Execution Specifiaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.ExecutionSpecifiactionImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.Sequence_diagramPackageImpl#getExecutionSpecifiaction()
		 * @generated
		 */
		EClass EXECUTION_SPECIFIACTION = eINSTANCE.getExecutionSpecifiaction();

		/**
		 * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.ActorLifelineImpl <em>Actor Lifeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.ActorLifelineImpl
		 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl.Sequence_diagramPackageImpl#getActorLifeline()
		 * @generated
		 */
		EClass ACTOR_LIFELINE = eINSTANCE.getActorLifeline();

	}

} //Sequence_diagramPackage
