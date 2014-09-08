/**
 */
package de.uni_stuttgart.iste.cowolf.model.sequence_diagram.util;

import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.*;

import java.util.Map;

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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Not contained' of 'Interaction'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INTERACTION__NOT_CONTAINED = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Sending receiving message event' of 'Message'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MESSAGE__SENDING_RECEIVING_MESSAGE_EVENT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Arguments' of 'Message'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MESSAGE__ARGUMENTS = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Cannot cross boundaries' of 'Message'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MESSAGE__CANNOT_CROSS_BOUNDARIES = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Signature is signal' of 'Message'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MESSAGE__SIGNATURE_IS_SIGNAL = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Occurrence specifications' of 'Message'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MESSAGE__OCCURRENCE_SPECIFICATIONS = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Signature refer to' of 'Message'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MESSAGE__SIGNATURE_REFER_TO = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Signature is operation request' of 'Message'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MESSAGE__SIGNATURE_IS_OPERATION_REQUEST = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Signature is operation reply' of 'Message'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MESSAGE__SIGNATURE_IS_OPERATION_REPLY = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Actual gate matched' of 'Gate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GATE__ACTUAL_GATE_MATCHED = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Inside cf matched' of 'Gate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GATE__INSIDE_CF_MATCHED = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Outside cf matched' of 'Gate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GATE__OUTSIDE_CF_MATCHED = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Formal gate distinguishable' of 'Gate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GATE__FORMAL_GATE_DISTINGUISHABLE = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Actual gate distinguishable' of 'Gate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GATE__ACTUAL_GATE_DISTINGUISHABLE = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Outside cf gate distinguishable' of 'Gate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GATE__OUTSIDE_CF_GATE_DISTINGUISHABLE = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Inside cf gate distinguishable' of 'Gate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GATE__INSIDE_CF_GATE_DISTINGUISHABLE = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Selector specified' of 'Lifeline'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LIFELINE__SELECTOR_SPECIFIED = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Interaction uses share lifeline' of 'Lifeline'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LIFELINE__INTERACTION_USES_SHARE_LIFELINE = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Same classifier' of 'Lifeline'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LIFELINE__SAME_CLASSIFIER = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Selector int or string' of 'Lifeline'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LIFELINE__SELECTOR_INT_OR_STRING = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Same lifeline' of 'Execution Specification'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXECUTION_SPECIFICATION__SAME_LIFELINE = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Associations' of 'Actor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTOR__ASSOCIATIONS = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Must have name' of 'Actor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTOR__MUST_HAVE_NAME = 23;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 23;

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
			case Sequence_diagramPackage.INTERACTION:
				return validateInteraction((Interaction)value, diagnostics, context);
			case Sequence_diagramPackage.MESSAGE:
				return validateMessage((Message)value, diagnostics, context);
			case Sequence_diagramPackage.GATE:
				return validateGate((Gate)value, diagnostics, context);
			case Sequence_diagramPackage.INTERACTION_FRAGMENT:
				return validateInteractionFragment((InteractionFragment)value, diagnostics, context);
			case Sequence_diagramPackage.LIFELINE:
				return validateLifeline((Lifeline)value, diagnostics, context);
			case Sequence_diagramPackage.VALUE_SPECIFICATION:
				return validateValueSpecification((ValueSpecification)value, diagnostics, context);
			case Sequence_diagramPackage.MESSAGE_END:
				return validateMessageEnd((MessageEnd)value, diagnostics, context);
			case Sequence_diagramPackage.EXECUTION_SPECIFICATION:
				return validateExecutionSpecification((ExecutionSpecification)value, diagnostics, context);
			case Sequence_diagramPackage.ACTOR:
				return validateActor((Actor)value, diagnostics, context);
			case Sequence_diagramPackage.MESSAGE_KIND:
				return validateMessageKind((MessageKind)value, diagnostics, context);
			case Sequence_diagramPackage.MESSAGE_SORT:
				return validateMessageSort((MessageSort)value, diagnostics, context);
			default:
				return true;
		}
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
		if (result || diagnostics != null) result &= validateInteraction_not_contained(interaction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the not_contained constraint of '<em>Interaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteraction_not_contained(Interaction interaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return interaction.not_contained(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateMessage_sending_receiving_message_event(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_arguments(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_cannot_cross_boundaries(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_signature_is_signal(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_occurrence_specifications(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_signature_refer_to(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_signature_is_operation_request(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessage_signature_is_operation_reply(message, diagnostics, context);
		return result;
	}

	/**
	 * Validates the sending_receiving_message_event constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_sending_receiving_message_event(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return message.sending_receiving_message_event(diagnostics, context);
	}

	/**
	 * Validates the arguments constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_arguments(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return message.arguments(diagnostics, context);
	}

	/**
	 * Validates the cannot_cross_boundaries constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_cannot_cross_boundaries(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return message.cannot_cross_boundaries(diagnostics, context);
	}

	/**
	 * Validates the signature_is_signal constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_signature_is_signal(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return message.signature_is_signal(diagnostics, context);
	}

	/**
	 * Validates the occurrence_specifications constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_occurrence_specifications(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return message.occurrence_specifications(diagnostics, context);
	}

	/**
	 * Validates the signature_refer_to constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_signature_refer_to(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return message.signature_refer_to(diagnostics, context);
	}

	/**
	 * Validates the signature_is_operation_request constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_signature_is_operation_request(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return message.signature_is_operation_request(diagnostics, context);
	}

	/**
	 * Validates the signature_is_operation_reply constraint of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage_signature_is_operation_reply(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return message.signature_is_operation_reply(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gate, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(gate, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(gate, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(gate, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(gate, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(gate, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_actual_gate_matched(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_inside_cf_matched(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_outside_cf_matched(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_formal_gate_distinguishable(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_actual_gate_distinguishable(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_outside_cf_gate_distinguishable(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_inside_cf_gate_distinguishable(gate, diagnostics, context);
		return result;
	}

	/**
	 * Validates the actual_gate_matched constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate_actual_gate_matched(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return gate.actual_gate_matched(diagnostics, context);
	}

	/**
	 * Validates the inside_cf_matched constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate_inside_cf_matched(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return gate.inside_cf_matched(diagnostics, context);
	}

	/**
	 * Validates the outside_cf_matched constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate_outside_cf_matched(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return gate.outside_cf_matched(diagnostics, context);
	}

	/**
	 * Validates the formal_gate_distinguishable constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate_formal_gate_distinguishable(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return gate.formal_gate_distinguishable(diagnostics, context);
	}

	/**
	 * Validates the actual_gate_distinguishable constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate_actual_gate_distinguishable(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return gate.actual_gate_distinguishable(diagnostics, context);
	}

	/**
	 * Validates the outside_cf_gate_distinguishable constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate_outside_cf_gate_distinguishable(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return gate.outside_cf_gate_distinguishable(diagnostics, context);
	}

	/**
	 * Validates the inside_cf_gate_distinguishable constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate_inside_cf_gate_distinguishable(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return gate.inside_cf_gate_distinguishable(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionFragment(InteractionFragment interactionFragment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(interactionFragment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(interactionFragment, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(interactionFragment, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateLifeline_selector_specified(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validateLifeline_interaction_uses_share_lifeline(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validateLifeline_same_classifier(lifeline, diagnostics, context);
		if (result || diagnostics != null) result &= validateLifeline_selector_int_or_string(lifeline, diagnostics, context);
		return result;
	}

	/**
	 * Validates the selector_specified constraint of '<em>Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLifeline_selector_specified(Lifeline lifeline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lifeline.selector_specified(diagnostics, context);
	}

	/**
	 * Validates the interaction_uses_share_lifeline constraint of '<em>Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLifeline_interaction_uses_share_lifeline(Lifeline lifeline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lifeline.interaction_uses_share_lifeline(diagnostics, context);
	}

	/**
	 * Validates the same_classifier constraint of '<em>Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLifeline_same_classifier(Lifeline lifeline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lifeline.same_classifier(diagnostics, context);
	}

	/**
	 * Validates the selector_int_or_string constraint of '<em>Lifeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLifeline_selector_int_or_string(Lifeline lifeline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lifeline.selector_int_or_string(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpecification(ValueSpecification valueSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(valueSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(valueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(valueSpecification, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageEnd(MessageEnd messageEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(messageEnd, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(messageEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(messageEnd, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionSpecification(ExecutionSpecification executionSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(executionSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(executionSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateExecutionSpecification_same_lifeline(executionSpecification, diagnostics, context);
		return result;
	}

	/**
	 * Validates the same_lifeline constraint of '<em>Execution Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionSpecification_same_lifeline(ExecutionSpecification executionSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return executionSpecification.same_lifeline(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateActor_associations(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateActor_must_have_name(actor, diagnostics, context);
		return result;
	}

	/**
	 * Validates the associations constraint of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActor_associations(Actor actor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return actor.associations(diagnostics, context);
	}

	/**
	 * Validates the must_have_name constraint of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActor_must_have_name(Actor actor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return actor.must_have_name(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageKind(MessageKind messageKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageSort(MessageSort messageSort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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
