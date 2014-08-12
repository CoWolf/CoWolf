/**
 */
package de.uni_stuttgart.iste.cowolf.model.fault_tree.util;

import de.uni_stuttgart.iste.cowolf.model.fault_tree.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage
 * @generated
 */
public class FaultTreeValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FaultTreeValidator INSTANCE = new FaultTreeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_stuttgart.iste.cowolf.model.fault_tree";

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultTreeValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return FaultTreePackage.eINSTANCE;
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
			case FaultTreePackage.HAZARD:
				return validateHazard((Hazard)value, diagnostics, context);
			case FaultTreePackage.GATE:
				return validateGate((Gate)value, diagnostics, context);
			case FaultTreePackage.EVENT:
				return validateEvent((Event)value, diagnostics, context);
			case FaultTreePackage.INTERMEDIATE_EVENT:
				return validateIntermediateEvent((IntermediateEvent)value, diagnostics, context);
			case FaultTreePackage.FAILURE_TYPE:
				return validateFailureType((FailureType)value, diagnostics, context);
			case FaultTreePackage.FAILURE_INSTANCE:
				return validateFailureInstance((FailureInstance)value, diagnostics, context);
			case FaultTreePackage.BASIC_EVENT:
				return validateBasicEvent((BasicEvent)value, diagnostics, context);
			case FaultTreePackage.UNDEVELOPED_EVENT:
				return validateUndevelopedEvent((UndevelopedEvent)value, diagnostics, context);
			case FaultTreePackage.ERROR_TYPE:
				return validateErrorType((ErrorType)value, diagnostics, context);
			case FaultTreePackage.ERROR_INSTANCE:
				return validateErrorInstance((ErrorInstance)value, diagnostics, context);
			case FaultTreePackage.OR:
				return validateOR((OR)value, diagnostics, context);
			case FaultTreePackage.AND:
				return validateAND((AND)value, diagnostics, context);
			case FaultTreePackage.XOR:
				return validateXOR((XOR)value, diagnostics, context);
			case FaultTreePackage.PRIOR_AND:
				return validatePriorAND((PriorAND)value, diagnostics, context);
			case FaultTreePackage.INHIBIT:
				return validateInhibit((Inhibit)value, diagnostics, context);
			case FaultTreePackage.ROOT:
				return validateRoot((Root)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHazard(Hazard hazard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hazard, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hazard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hazard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hazard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hazard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hazard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hazard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hazard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hazard, diagnostics, context);
		if (result || diagnostics != null) result &= validateHazard_NoStandaloneUndevelopedEvent(hazard, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NoStandaloneUndevelopedEvent constraint of '<em>Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHazard_NoStandaloneUndevelopedEvent(Hazard hazard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NoStandaloneUndevelopedEvent", getObjectLabel(hazard, context) },
						 new Object[] { hazard },
						 context));
			}
			return false;
		}
		return true;
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
		if (result || diagnostics != null) result &= validateGate_NoHazardAsInput(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_NoBasicEventAsOutput(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_AtLeastTwoInputs(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_ExactlyOneOutput(gate, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NoHazardAsInput constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate_NoHazardAsInput(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NoHazardAsInput", getObjectLabel(gate, context) },
						 new Object[] { gate },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NoBasicEventAsOutput constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate_NoBasicEventAsOutput(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NoBasicEventAsOutput", getObjectLabel(gate, context) },
						 new Object[] { gate },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the AtLeastTwoInputs constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate_AtLeastTwoInputs(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AtLeastTwoInputs", getObjectLabel(gate, context) },
						 new Object[] { gate },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the ExactlyOneOutput constraint of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate_ExactlyOneOutput(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ExactlyOneOutput", getObjectLabel(gate, context) },
						 new Object[] { gate },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(event, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntermediateEvent(IntermediateEvent intermediateEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(intermediateEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(intermediateEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(intermediateEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(intermediateEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(intermediateEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(intermediateEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(intermediateEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(intermediateEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(intermediateEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateIntermediateEvent_OnlyIntermediateOrBasicEventAsInput(intermediateEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateIntermediateEvent_NoStandaloneIntermediateEvent(intermediateEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateIntermediateEvent_OnlyIntermediateOrHazardtAsOutput(intermediateEvent, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OnlyIntermediateOrBasicEventAsInput constraint of '<em>Intermediate Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntermediateEvent_OnlyIntermediateOrBasicEventAsInput(IntermediateEvent intermediateEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "OnlyIntermediateOrBasicEventAsInput", getObjectLabel(intermediateEvent, context) },
						 new Object[] { intermediateEvent },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NoStandaloneIntermediateEvent constraint of '<em>Intermediate Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntermediateEvent_NoStandaloneIntermediateEvent(IntermediateEvent intermediateEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NoStandaloneIntermediateEvent", getObjectLabel(intermediateEvent, context) },
						 new Object[] { intermediateEvent },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the OnlyIntermediateOrHazardtAsOutput constraint of '<em>Intermediate Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntermediateEvent_OnlyIntermediateOrHazardtAsOutput(IntermediateEvent intermediateEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "OnlyIntermediateOrHazardtAsOutput", getObjectLabel(intermediateEvent, context) },
						 new Object[] { intermediateEvent },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFailureType(FailureType failureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(failureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFailureInstance(FailureInstance failureInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(failureInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicEvent(BasicEvent basicEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(basicEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(basicEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(basicEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(basicEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(basicEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(basicEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(basicEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(basicEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(basicEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateBasicEvent_NoStandaloneBasicEvent(basicEvent, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NoStandaloneBasicEvent constraint of '<em>Basic Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicEvent_NoStandaloneBasicEvent(BasicEvent basicEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NoStandaloneBasicEvent", getObjectLabel(basicEvent, context) },
						 new Object[] { basicEvent },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUndevelopedEvent(UndevelopedEvent undevelopedEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(undevelopedEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(undevelopedEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(undevelopedEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(undevelopedEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(undevelopedEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(undevelopedEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(undevelopedEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(undevelopedEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(undevelopedEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateUndevelopedEvent_NoStandaloneUndevelopedEvent(undevelopedEvent, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NoStandaloneUndevelopedEvent constraint of '<em>Undeveloped Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUndevelopedEvent_NoStandaloneUndevelopedEvent(UndevelopedEvent undevelopedEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NoStandaloneUndevelopedEvent", getObjectLabel(undevelopedEvent, context) },
						 new Object[] { undevelopedEvent },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErrorType(ErrorType errorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(errorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErrorInstance(ErrorInstance errorInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(errorInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOR(OR or, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(or, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(or, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(or, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(or, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(or, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(or, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(or, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(or, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(or, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_NoHazardAsInput(or, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_NoBasicEventAsOutput(or, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_AtLeastTwoInputs(or, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_ExactlyOneOutput(or, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAND(AND and, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(and, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(and, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(and, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(and, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(and, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(and, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(and, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(and, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(and, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_NoHazardAsInput(and, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_NoBasicEventAsOutput(and, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_AtLeastTwoInputs(and, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_ExactlyOneOutput(and, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXOR(XOR xor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(xor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(xor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(xor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(xor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(xor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(xor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(xor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(xor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(xor, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_NoHazardAsInput(xor, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_NoBasicEventAsOutput(xor, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_AtLeastTwoInputs(xor, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_ExactlyOneOutput(xor, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorAND(PriorAND priorAND, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(priorAND, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(priorAND, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(priorAND, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(priorAND, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(priorAND, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(priorAND, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(priorAND, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(priorAND, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(priorAND, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_NoHazardAsInput(priorAND, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_NoBasicEventAsOutput(priorAND, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_AtLeastTwoInputs(priorAND, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_ExactlyOneOutput(priorAND, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInhibit(Inhibit inhibit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(inhibit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(inhibit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(inhibit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(inhibit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(inhibit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(inhibit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(inhibit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(inhibit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(inhibit, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_NoHazardAsInput(inhibit, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_NoBasicEventAsOutput(inhibit, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_AtLeastTwoInputs(inhibit, diagnostics, context);
		if (result || diagnostics != null) result &= validateGate_ExactlyOneOutput(inhibit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoot(Root root, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(root, diagnostics, context);
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

} //FaultTreeValidator
