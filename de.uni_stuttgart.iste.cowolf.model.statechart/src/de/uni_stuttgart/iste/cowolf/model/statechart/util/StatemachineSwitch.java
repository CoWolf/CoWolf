/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart.util;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;
import de.uni_stuttgart.iste.cowolf.model.commonBase.NameBase;

import de.uni_stuttgart.iste.cowolf.model.statechart.*;

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
 * @see de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage
 * @generated
 */
public class StatemachineSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatemachinePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatemachineSwitch() {
		if (modelPackage == null) {
			modelPackage = StatemachinePackage.eINSTANCE;
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
			case StatemachinePackage.STATE_MACHINE_ROOT: {
				StateMachineRoot stateMachineRoot = (StateMachineRoot)theEObject;
				T result = caseStateMachineRoot(stateMachineRoot);
				if (result == null) result = caseIDBase(stateMachineRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatemachinePackage.STATE_MACHINE: {
				StateMachine stateMachine = (StateMachine)theEObject;
				T result = caseStateMachine(stateMachine);
				if (result == null) result = caseIDBase(stateMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatemachinePackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = caseStateVertex(state);
				if (result == null) result = caseIDBase(state);
				if (result == null) result = caseNameBase(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatemachinePackage.COMPOSITE_STATE: {
				CompositeState compositeState = (CompositeState)theEObject;
				T result = caseCompositeState(compositeState);
				if (result == null) result = caseState(compositeState);
				if (result == null) result = caseStateVertex(compositeState);
				if (result == null) result = caseIDBase(compositeState);
				if (result == null) result = caseNameBase(compositeState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatemachinePackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseIDBase(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatemachinePackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseIDBase(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatemachinePackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseIDBase(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatemachinePackage.GUARD: {
				Guard guard = (Guard)theEObject;
				T result = caseGuard(guard);
				if (result == null) result = caseIDBase(guard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatemachinePackage.TRANSITION_ACTION: {
				TransitionAction transitionAction = (TransitionAction)theEObject;
				T result = caseTransitionAction(transitionAction);
				if (result == null) result = caseAction(transitionAction);
				if (result == null) result = caseIDBase(transitionAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatemachinePackage.STATE_VERTEX: {
				StateVertex stateVertex = (StateVertex)theEObject;
				T result = caseStateVertex(stateVertex);
				if (result == null) result = caseIDBase(stateVertex);
				if (result == null) result = caseNameBase(stateVertex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatemachinePackage.STATE_ACTION: {
				StateAction stateAction = (StateAction)theEObject;
				T result = caseStateAction(stateAction);
				if (result == null) result = caseAction(stateAction);
				if (result == null) result = caseIDBase(stateAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatemachinePackage.DO: {
				DO do_ = (DO)theEObject;
				T result = caseDO(do_);
				if (result == null) result = caseStateAction(do_);
				if (result == null) result = caseAction(do_);
				if (result == null) result = caseIDBase(do_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatemachinePackage.ENTRY: {
				ENTRY entry = (ENTRY)theEObject;
				T result = caseENTRY(entry);
				if (result == null) result = caseStateAction(entry);
				if (result == null) result = caseAction(entry);
				if (result == null) result = caseIDBase(entry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatemachinePackage.EXIT: {
				EXIT exit = (EXIT)theEObject;
				T result = caseEXIT(exit);
				if (result == null) result = caseStateAction(exit);
				if (result == null) result = caseAction(exit);
				if (result == null) result = caseIDBase(exit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatemachinePackage.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = caseIDBase(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Machine Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Machine Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateMachineRoot(StateMachineRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateMachine(StateMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeState(CompositeState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuard(Guard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionAction(TransitionAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Vertex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Vertex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateVertex(StateVertex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateAction(StateAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDO(DO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ENTRY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ENTRY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseENTRY(ENTRY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EXIT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EXIT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXIT(EXIT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Name Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameBase(NameBase object) {
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

} //StatemachineSwitch
