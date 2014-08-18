/**
 */
package de.uni_stuttgart.iste.cowolf.model.activity.util;

import de.uni_stuttgart.iste.cowolf.model.activity.*;

import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

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
 * @see de.uni_stuttgart.iste.cowolf.model.activity.ActivityPackage
 * @generated
 */
public class ActivitySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActivityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitySwitch() {
		if (modelPackage == null) {
			modelPackage = ActivityPackage.eINSTANCE;
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
			case ActivityPackage.ROOT: {
				Root root = (Root)theEObject;
				T result = caseRoot(root);
				if (result == null) result = caseIDBase(root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.START: {
				Start start = (Start)theEObject;
				T result = caseStart(start);
				if (result == null) result = caseIDBase(start);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseNodesWithoutJoin(action);
				if (result == null) result = caseNodes(action);
				if (result == null) result = caseIDBase(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.DECISION: {
				Decision decision = (Decision)theEObject;
				T result = caseDecision(decision);
				if (result == null) result = caseNodesWithoutJoin(decision);
				if (result == null) result = caseNodes(decision);
				if (result == null) result = caseIDBase(decision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.SPLIT: {
				Split split = (Split)theEObject;
				T result = caseSplit(split);
				if (result == null) result = caseNodesWithoutJoin(split);
				if (result == null) result = caseNodes(split);
				if (result == null) result = caseIDBase(split);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.JOIN: {
				Join join = (Join)theEObject;
				T result = caseJoin(join);
				if (result == null) result = caseNodes(join);
				if (result == null) result = caseIDBase(join);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.END: {
				End end = (End)theEObject;
				T result = caseEnd(end);
				if (result == null) result = caseNodesWithoutJoin(end);
				if (result == null) result = caseNodes(end);
				if (result == null) result = caseIDBase(end);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.NODES_WITHOUT_JOIN: {
				NodesWithoutJoin nodesWithoutJoin = (NodesWithoutJoin)theEObject;
				T result = caseNodesWithoutJoin(nodesWithoutJoin);
				if (result == null) result = caseNodes(nodesWithoutJoin);
				if (result == null) result = caseIDBase(nodesWithoutJoin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.ARROW_AFTER_START: {
				ArrowAfterStart arrowAfterStart = (ArrowAfterStart)theEObject;
				T result = caseArrowAfterStart(arrowAfterStart);
				if (result == null) result = caseIDBase(arrowAfterStart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.DECISION_ARROW: {
				DecisionArrow decisionArrow = (DecisionArrow)theEObject;
				T result = caseDecisionArrow(decisionArrow);
				if (result == null) result = caseIDBase(decisionArrow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.AFTER_ACTION_ARROW: {
				AfterActionArrow afterActionArrow = (AfterActionArrow)theEObject;
				T result = caseAfterActionArrow(afterActionArrow);
				if (result == null) result = caseIDBase(afterActionArrow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.SPLIT_ARROW: {
				SplitArrow splitArrow = (SplitArrow)theEObject;
				T result = caseSplitArrow(splitArrow);
				if (result == null) result = caseIDBase(splitArrow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.JOIN_ARROW: {
				JoinArrow joinArrow = (JoinArrow)theEObject;
				T result = caseJoinArrow(joinArrow);
				if (result == null) result = caseIDBase(joinArrow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.NODES: {
				Nodes nodes = (Nodes)theEObject;
				T result = caseNodes(nodes);
				if (result == null) result = caseIDBase(nodes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ActivityPackage.ARROW_AFTER_JOIN: {
				ArrowAfterJoin arrowAfterJoin = (ArrowAfterJoin)theEObject;
				T result = caseArrowAfterJoin(arrowAfterJoin);
				if (result == null) result = caseIDBase(arrowAfterJoin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoot(Root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStart(Start object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Decision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecision(Decision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplit(Split object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoin(Join object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnd(End object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nodes Without Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nodes Without Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodesWithoutJoin(NodesWithoutJoin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arrow After Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arrow After Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrowAfterStart(ArrowAfterStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Arrow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Arrow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionArrow(DecisionArrow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>After Action Arrow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>After Action Arrow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAfterActionArrow(AfterActionArrow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split Arrow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split Arrow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplitArrow(SplitArrow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Arrow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Arrow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinArrow(JoinArrow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nodes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nodes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodes(Nodes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arrow After Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arrow After Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrowAfterJoin(ArrowAfterJoin object) {
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

} //ActivitySwitch
