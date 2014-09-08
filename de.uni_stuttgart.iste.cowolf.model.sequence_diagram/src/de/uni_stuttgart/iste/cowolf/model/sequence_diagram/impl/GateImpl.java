/**
 */
package de.uni_stuttgart.iste.cowolf.model.sequence_diagram.impl;

import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Gate;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramPackage;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.util.Sequence_diagramValidator;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.uml2.uml.InteractionOperand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GateImpl extends MessageEndImpl implements Gate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sequence_diagramPackage.Literals.GATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean actual_gate_matched(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Sequence_diagramValidator.DIAGNOSTIC_SOURCE,
						 Sequence_diagramValidator.GATE__ACTUAL_GATE_MATCHED,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "actual_gate_matched", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
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
	public boolean inside_cf_matched(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Sequence_diagramValidator.DIAGNOSTIC_SOURCE,
						 Sequence_diagramValidator.GATE__INSIDE_CF_MATCHED,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "inside_cf_matched", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
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
	public boolean outside_cf_matched(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Sequence_diagramValidator.DIAGNOSTIC_SOURCE,
						 Sequence_diagramValidator.GATE__OUTSIDE_CF_MATCHED,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "outside_cf_matched", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
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
	public boolean formal_gate_distinguishable(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Sequence_diagramValidator.DIAGNOSTIC_SOURCE,
						 Sequence_diagramValidator.GATE__FORMAL_GATE_DISTINGUISHABLE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "formal_gate_distinguishable", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
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
	public boolean actual_gate_distinguishable(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Sequence_diagramValidator.DIAGNOSTIC_SOURCE,
						 Sequence_diagramValidator.GATE__ACTUAL_GATE_DISTINGUISHABLE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "actual_gate_distinguishable", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
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
	public boolean outside_cf_gate_distinguishable(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Sequence_diagramValidator.DIAGNOSTIC_SOURCE,
						 Sequence_diagramValidator.GATE__OUTSIDE_CF_GATE_DISTINGUISHABLE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "outside_cf_gate_distinguishable", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
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
	public boolean inside_cf_gate_distinguishable(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Sequence_diagramValidator.DIAGNOSTIC_SOURCE,
						 Sequence_diagramValidator.GATE__INSIDE_CF_GATE_DISTINGUISHABLE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "inside_cf_gate_distinguishable", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
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
	public boolean isOutsideCF() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInsideCF() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActual() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFormal() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean matches(Gate gateToMatch) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand getOperand() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Sequence_diagramPackage.GATE___ACTUAL_GATE_MATCHED__DIAGNOSTICCHAIN_MAP:
				return actual_gate_matched((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Sequence_diagramPackage.GATE___INSIDE_CF_MATCHED__DIAGNOSTICCHAIN_MAP:
				return inside_cf_matched((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Sequence_diagramPackage.GATE___OUTSIDE_CF_MATCHED__DIAGNOSTICCHAIN_MAP:
				return outside_cf_matched((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Sequence_diagramPackage.GATE___FORMAL_GATE_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP:
				return formal_gate_distinguishable((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Sequence_diagramPackage.GATE___ACTUAL_GATE_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP:
				return actual_gate_distinguishable((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Sequence_diagramPackage.GATE___OUTSIDE_CF_GATE_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP:
				return outside_cf_gate_distinguishable((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Sequence_diagramPackage.GATE___INSIDE_CF_GATE_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP:
				return inside_cf_gate_distinguishable((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Sequence_diagramPackage.GATE___IS_OUTSIDE_CF:
				return isOutsideCF();
			case Sequence_diagramPackage.GATE___IS_INSIDE_CF:
				return isInsideCF();
			case Sequence_diagramPackage.GATE___IS_ACTUAL:
				return isActual();
			case Sequence_diagramPackage.GATE___IS_FORMAL:
				return isFormal();
			case Sequence_diagramPackage.GATE___MATCHES__GATE:
				return matches((Gate)arguments.get(0));
			case Sequence_diagramPackage.GATE___GET_OPERAND:
				return getOperand();
		}
		return super.eInvoke(operationID, arguments);
	}

} //GateImpl
