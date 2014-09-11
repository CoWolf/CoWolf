/**
 */
package de.uni_stuttgart.iste.cowolf.model.sequence_diagram.util;

import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Actor;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.ActorLifeline;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.BehaviorExecutionSpecification;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.ExecutionSpecifiaction;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Interaction;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Lifeline;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Message;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.MessageOccurenceSpecification;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.OpaqueBehavior;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Operation;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Property;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramPackage;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramPackage
 * @generated
 */
public class Sequence_diagramValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Sequence_diagramValidator INSTANCE = new Sequence_diagramValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_stuttgart.iste.cowolf.model.sequence_diagram";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLValidator umlValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence_diagramValidator() {
		super();
		umlValidator = UMLValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Sequence_diagramPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Sequence_diagramPackage.PACKAGE:
				return validatePackage((de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Package)value, diagnostics, context);
			case Sequence_diagramPackage.CLASS:
				return validateClass((de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Class)value, diagnostics, context);
			case Sequence_diagramPackage.INTERACTION:
				return validateInteraction((Interaction)value, diagnostics, context);
			case Sequence_diagramPackage.ACTOR:
				return validateActor((Actor)value, diagnostics, context);
			case Sequence_diagramPackage.OPERATION:
				return validateOperation((Operation)value, diagnostics, context);
			case Sequence_diagramPackage.MESSAGE:
				return validateMessage((Message)value, diagnostics, context);
			case Sequence_diagramPackage.MESSAGE_OCCURENCE_SPECIFICATION:
				return validateMessageOccurenceSpecification((MessageOccurenceSpecification)value, diagnostics, context);
			case Sequence_diagramPackage.BEHAVIOR_EXECUTION_SPECIFICATION:
				return validateBehaviorExecutionSpecification((BehaviorExecutionSpecification)value, diagnostics, context);
			case Sequence_diagramPackage.OPAQUE_BEHAVIOR:
				return validateOpaqueBehavior((OpaqueBehavior)value, diagnostics, context);
			case Sequence_diagramPackage.ACTOR_LIFELINE:
				return validateActorLifeline((ActorLifeline)value, diagnostics, context);
			case Sequence_diagramPackage.LIFELINE:
				return validateLifeline((Lifeline)value, diagnostics, context);
			case Sequence_diagramPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case Sequence_diagramPackage.EXECUTION_SPECIFIACTION:
				return validateExecutionSpecifiaction((ExecutionSpecifiaction)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackage(de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Package package_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(package_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(package_, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(package_, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(package_, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(package_, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(package_, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(package_, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(package_, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(package_, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(package_, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(package_, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackage_validateElementsPublicOrPrivate(package_, diagnostics, context);
		if (result || diagnostics != null) result &= validatePackage_onlyOneInteraction(package_, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the onlyOneInteraction constraint of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PACKAGE__ONLY_ONE_INTERACTION__EEXPRESSION = "self.packagedElement -> size() = 1";

	/**
	 * Validates the onlyOneInteraction constraint of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePackage_onlyOneInteraction(de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Package package_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Sequence_diagramPackage.Literals.PACKAGE,
				 package_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "onlyOneInteraction",
				 PACKAGE__ONLY_ONE_INTERACTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClass(de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Class class_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(class_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(class_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(class_, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(class_, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(class_, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(class_, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(class_, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(class_, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(class_, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(class_, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(class_, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(class_, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(class_, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(class_, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(class_, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(class_, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(class_, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(class_, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(class_, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateBehavioredClassifier_validateClassBehavior(class_, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClass_validatePassiveClass(class_, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteraction(Interaction interaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interaction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateBehavioredClassifier_validateClassBehavior(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClass_validatePassiveClass(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateBehavior_validateMostOneBehavior(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateBehavior_validateParametersMatch(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateBehavior_validateFeatureOfContextClassifier(interaction, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateInteraction_validateNotContained(interaction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActor(Actor actor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(actor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(actor, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(actor, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(actor, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(actor, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(actor, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(actor, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(actor, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(actor, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(actor, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(actor, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(actor, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(actor, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(actor, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(actor, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(actor, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(actor, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(actor, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateBehavioredClassifier_validateClassBehavior(actor, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateActor_validateAssociations(actor, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateActor_validateMustHaveName(actor, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(operation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(operation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(operation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(operation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(operation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(operation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(operation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(operation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(operation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(operation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(operation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateBehavioralFeature_validateAbstractNoMethod(operation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateOperation_validateAtMostOneReturn(operation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateOperation_validateOnlyBodyForQuery(operation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(message, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(message, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(message, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(message, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(message, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(message, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(message, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMessage_validateSendingReceivingMessageEvent(message, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMessage_validateArguments(message, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMessage_validateCannotCrossBoundaries(message, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMessage_validateSignatureIsSignal(message, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMessage_validateOccurrenceSpecifications(message, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMessage_validateSignatureReferTo(message, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMessage_validateSignatureIsOperationRequest(message, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMessage_validateSignatureIsOperationReply(message, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageOccurenceSpecification(MessageOccurenceSpecification messageOccurenceSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(messageOccurenceSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(messageOccurenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(messageOccurenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(messageOccurenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(messageOccurenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(messageOccurenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(messageOccurenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(messageOccurenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(messageOccurenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(messageOccurenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(messageOccurenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(messageOccurenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(messageOccurenceSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(messageOccurenceSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehaviorExecutionSpecification(BehaviorExecutionSpecification behaviorExecutionSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(behaviorExecutionSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(behaviorExecutionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateExecutionSpecification_validateSameLifeline(behaviorExecutionSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpaqueBehavior(OpaqueBehavior opaqueBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(opaqueBehavior, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateBehavioredClassifier_validateClassBehavior(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClass_validatePassiveClass(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateBehavior_validateMostOneBehavior(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateBehavior_validateParametersMatch(opaqueBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateBehavior_validateFeatureOfContextClassifier(opaqueBehavior, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActorLifeline(ActorLifeline actorLifeline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(actorLifeline, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(actorLifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(actorLifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(actorLifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(actorLifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(actorLifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(actorLifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(actorLifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(actorLifeline, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(actorLifeline, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(actorLifeline, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(actorLifeline, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(actorLifeline, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(actorLifeline, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateLifeline_validateSelectorSpecified(actorLifeline, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateLifeline_validateInteractionUsesShareLifeline(actorLifeline, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateLifeline_validateSameClassifier(actorLifeline, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateLifeline_validateSelectorIntOrString(actorLifeline, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLifeline(Lifeline lifeline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lifeline, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateLifeline_validateSelectorSpecified(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateLifeline_validateInteractionUsesShareLifeline(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateLifeline_validateSameClassifier(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateLifeline_validateSelectorIntOrString(lifeline, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(property, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(property, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(property, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(property, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(property, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(property, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(property, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(property, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(property, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(property, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperGeLower(property, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerGe0(property, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationNoSideEffects(property, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationConstant(property, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerIsInteger(property, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperIsUnlimitedNatural(property, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingContextConforms(property, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsReadOnly(property, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateMultiplicityOfComposite(property, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateRedefinedPropertyInherited(property, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingRules(property, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateBindingToAttribute(property, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsDerived(property, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDeploymentTarget(property, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettedPropertyNames(property, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateTypeOfOppositeEnd(property, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateQualifiedIsAssociationEnd(property, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionSpecifiaction(ExecutionSpecifiaction executionSpecifiaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(executionSpecifiaction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(executionSpecifiaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(executionSpecifiaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(executionSpecifiaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(executionSpecifiaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(executionSpecifiaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(executionSpecifiaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(executionSpecifiaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(executionSpecifiaction, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(executionSpecifiaction, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(executionSpecifiaction, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(executionSpecifiaction, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(executionSpecifiaction, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(executionSpecifiaction, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateExecutionSpecification_validateSameLifeline(executionSpecifiaction, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Sequence_diagramValidator
