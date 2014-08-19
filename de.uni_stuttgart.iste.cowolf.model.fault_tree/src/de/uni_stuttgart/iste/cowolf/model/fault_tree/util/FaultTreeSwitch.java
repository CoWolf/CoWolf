/**
 */
package de.uni_stuttgart.iste.cowolf.model.fault_tree.util;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage
 * @generated
 */
public class FaultTreeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FaultTreePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultTreeSwitch() {
		if (modelPackage == null) {
			modelPackage = FaultTreePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FaultTreePackage.HAZARD: {
				Hazard hazard = (Hazard)theEObject;
				T result = caseHazard(hazard);
				if (result == null) result = caseEvent(hazard);
				if (result == null) result = caseIDBase(hazard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaultTreePackage.GATE: {
				Gate gate = (Gate)theEObject;
				T result = caseGate(gate);
				if (result == null) result = caseIDBase(gate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaultTreePackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseIDBase(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaultTreePackage.INTERMEDIATE_EVENT: {
				IntermediateEvent intermediateEvent = (IntermediateEvent)theEObject;
				T result = caseIntermediateEvent(intermediateEvent);
				if (result == null) result = caseEvent(intermediateEvent);
				if (result == null) result = caseIDBase(intermediateEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaultTreePackage.FAILURE_TYPE: {
				FailureType failureType = (FailureType)theEObject;
				T result = caseFailureType(failureType);
				if (result == null) result = caseIDBase(failureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaultTreePackage.FAILURE_INSTANCE: {
				FailureInstance failureInstance = (FailureInstance)theEObject;
				T result = caseFailureInstance(failureInstance);
				if (result == null) result = caseIDBase(failureInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaultTreePackage.BASIC_EVENT: {
				BasicEvent basicEvent = (BasicEvent)theEObject;
				T result = caseBasicEvent(basicEvent);
				if (result == null) result = caseEvent(basicEvent);
				if (result == null) result = caseIDBase(basicEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaultTreePackage.UNDEVELOPED_EVENT: {
				UndevelopedEvent undevelopedEvent = (UndevelopedEvent)theEObject;
				T result = caseUndevelopedEvent(undevelopedEvent);
				if (result == null) result = caseEvent(undevelopedEvent);
				if (result == null) result = caseIDBase(undevelopedEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaultTreePackage.ERROR_TYPE: {
				ErrorType errorType = (ErrorType)theEObject;
				T result = caseErrorType(errorType);
				if (result == null) result = caseIDBase(errorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaultTreePackage.ERROR_INSTANCE: {
				ErrorInstance errorInstance = (ErrorInstance)theEObject;
				T result = caseErrorInstance(errorInstance);
				if (result == null) result = caseIDBase(errorInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaultTreePackage.OR: {
				OR or = (OR)theEObject;
				T result = caseOR(or);
				if (result == null) result = caseGate(or);
				if (result == null) result = caseIDBase(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaultTreePackage.AND: {
				AND and = (AND)theEObject;
				T result = caseAND(and);
				if (result == null) result = caseGate(and);
				if (result == null) result = caseIDBase(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaultTreePackage.XOR: {
				XOR xor = (XOR)theEObject;
				T result = caseXOR(xor);
				if (result == null) result = caseGate(xor);
				if (result == null) result = caseIDBase(xor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaultTreePackage.PRIOR_AND: {
				PriorAND priorAND = (PriorAND)theEObject;
				T result = casePriorAND(priorAND);
				if (result == null) result = caseGate(priorAND);
				if (result == null) result = caseIDBase(priorAND);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaultTreePackage.INHIBIT: {
				Inhibit inhibit = (Inhibit)theEObject;
				T result = caseInhibit(inhibit);
				if (result == null) result = caseGate(inhibit);
				if (result == null) result = caseIDBase(inhibit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FaultTreePackage.FAULT_TREE: {
				FaultTree faultTree = (FaultTree)theEObject;
				T result = caseFaultTree(faultTree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hazard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHazard(Hazard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGate(Gate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intermediate Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intermediate Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermediateEvent(IntermediateEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureType(FailureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureInstance(FailureInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicEvent(BasicEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Undeveloped Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Undeveloped Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUndevelopedEvent(UndevelopedEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorType(ErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorInstance(ErrorInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOR(OR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AND</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AND</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAND(AND object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XOR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XOR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXOR(XOR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prior AND</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prior AND</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePriorAND(PriorAND object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inhibit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inhibit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInhibit(Inhibit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Tree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Tree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultTree(FaultTree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDBase(IDBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FaultTreeSwitch
