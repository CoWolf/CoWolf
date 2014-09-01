/**
 */
package de.uni_stuttgart.iste.cowolf.model.dtmc.util;

import de.uni_stuttgart.iste.cowolf.model.dtmc.*;

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
 * @see de.uni_stuttgart.iste.cowolf.model.dtmc.DTMCPackage
 * @generated
 */
public class DTMCValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DTMCValidator INSTANCE = new DTMCValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uni_stuttgart.iste.cowolf.model.dtmc";

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
	public DTMCValidator() {
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
	  return DTMCPackage.eINSTANCE;
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
			case DTMCPackage.DTMC:
				return validateDTMC((DTMC)value, diagnostics, context);
			case DTMCPackage.STATE:
				return validateState((State)value, diagnostics, context);
			case DTMCPackage.TRANSITION:
				return validateTransition((Transition)value, diagnostics, context);
			case DTMCPackage.LABEL:
				return validateLabel((Label)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDTMC(DTMC dtmc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dtmc, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dtmc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dtmc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dtmc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dtmc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dtmc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dtmc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dtmc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dtmc, diagnostics, context);
		if (result || diagnostics != null) result &= validateDTMC_initalStateRequired(dtmc, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the initalStateRequired constraint of '<em>DTMC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DTMC__INITAL_STATE_REQUIRED__EEXPRESSION = "self.initialState -> size() >0";

	/**
	 * Validates the initalStateRequired constraint of '<em>DTMC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDTMC_initalStateRequired(DTMC dtmc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DTMCPackage.Literals.DTMC,
				 dtmc,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "initalStateRequired",
				 DTMC__INITAL_STATE_REQUIRED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(state, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_OutgoingDontAddUpToOne(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_NonDeterministic(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_NoDuplicateLabels(state, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OutgoingDontAddUpToOne constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__OUTGOING_DONT_ADD_UP_TO_ONE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Probability of all outgoing transitions must be 1.0.',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tself.outgoing->size() = 0 or (self.outgoing.prob->sum() - 1.0).abs()  < 0.000001\n" +
		"}.status";

	/**
	 * Validates the OutgoingDontAddUpToOne constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_OutgoingDontAddUpToOne(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DTMCPackage.Literals.STATE,
				 state,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "OutgoingDontAddUpToOne",
				 STATE__OUTGOING_DONT_ADD_UP_TO_ONE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NonDeterministic constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__NON_DETERMINISTIC__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'There must not be any nondeterminism. Please union transitions to the same target.',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tself.outgoing.to->asSet()->size() = self.outgoing->size()\n" +
		"}.status";

	/**
	 * Validates the NonDeterministic constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_NonDeterministic(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DTMCPackage.Literals.STATE,
				 state,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NonDeterministic",
				 STATE__NON_DETERMINISTIC__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NoDuplicateLabels constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__NO_DUPLICATE_LABELS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Labels must be unique per state.',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tself.labels.name->asSet()->size() = self.labels->size()\n" +
		"}.status";

	/**
	 * Validates the NoDuplicateLabels constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_NoDuplicateLabels(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DTMCPackage.Literals.STATE,
				 state,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "NoDuplicateLabels",
				 STATE__NO_DUPLICATE_LABELS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_ProbBetween0and1(transition, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ProbBetween0and1 constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__PROB_BETWEEN0AND1__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Probability must be between 0 and 1.',\n" +
		"\tstatus : Boolean = \n" +
		"\t \t\tprob >= 0.0 and prob <= 1.0\n" +
		"}.status";

	/**
	 * Validates the ProbBetween0and1 constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_ProbBetween0and1(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(DTMCPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "ProbBetween0and1",
				 TRANSITION__PROB_BETWEEN0AND1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabel(Label label, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(label, diagnostics, context);
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

} //DTMCValidator
