/**
 */
package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.util;

import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.*;

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
 * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PCTLPackage
 * @generated
 */
public class PCTLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PCTLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PCTLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PCTLPackage.eINSTANCE;
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
  protected boolean isSwitchFor(EPackage ePackage)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PCTLPackage.START:
      {
        Start start = (Start)theEObject;
        T result = caseStart(start);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.COMMENTED_RULE:
      {
        CommentedRule commentedRule = (CommentedRule)theEObject;
        T result = caseCommentedRule(commentedRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.PCTL:
      {
        Pctl pctl = (Pctl)theEObject;
        T result = casePctl(pctl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.STATE:
      {
        State state = (State)theEObject;
        T result = caseState(state);
        if (result == null) result = caseAtomic(state);
        if (result == null) result = caseExpression(state);
        if (result == null) result = caseSteadyState(state);
        if (result == null) result = caseQuantifiedProbability(state);
        if (result == null) result = caseProbability(state);
        if (result == null) result = casePctl(state);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.LABEL:
      {
        Label label = (Label)theEObject;
        T result = caseLabel(label);
        if (result == null) result = caseAtomic(label);
        if (result == null) result = caseExpression(label);
        if (result == null) result = caseSteadyState(label);
        if (result == null) result = caseQuantifiedProbability(label);
        if (result == null) result = caseProbability(label);
        if (result == null) result = casePctl(label);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.ATOMIC:
      {
        Atomic atomic = (Atomic)theEObject;
        T result = caseAtomic(atomic);
        if (result == null) result = caseExpression(atomic);
        if (result == null) result = caseSteadyState(atomic);
        if (result == null) result = caseQuantifiedProbability(atomic);
        if (result == null) result = caseProbability(atomic);
        if (result == null) result = casePctl(atomic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = caseSteadyState(expression);
        if (result == null) result = caseQuantifiedProbability(expression);
        if (result == null) result = caseProbability(expression);
        if (result == null) result = casePctl(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.STEADY_STATE:
      {
        SteadyState steadyState = (SteadyState)theEObject;
        T result = caseSteadyState(steadyState);
        if (result == null) result = casePctl(steadyState);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.QUANTIFIED_PROBABILITY:
      {
        QuantifiedProbability quantifiedProbability = (QuantifiedProbability)theEObject;
        T result = caseQuantifiedProbability(quantifiedProbability);
        if (result == null) result = casePctl(quantifiedProbability);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.PROBABILITY:
      {
        Probability probability = (Probability)theEObject;
        T result = caseProbability(probability);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.UNTIL:
      {
        Until until = (Until)theEObject;
        T result = caseUntil(until);
        if (result == null) result = caseExpression(until);
        if (result == null) result = caseSteadyState(until);
        if (result == null) result = caseQuantifiedProbability(until);
        if (result == null) result = caseProbability(until);
        if (result == null) result = casePctl(until);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.NEXT:
      {
        Next next = (Next)theEObject;
        T result = caseNext(next);
        if (result == null) result = caseExpression(next);
        if (result == null) result = caseSteadyState(next);
        if (result == null) result = caseQuantifiedProbability(next);
        if (result == null) result = caseProbability(next);
        if (result == null) result = casePctl(next);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.FUTURE:
      {
        Future future = (Future)theEObject;
        T result = caseFuture(future);
        if (result == null) result = caseExpression(future);
        if (result == null) result = caseSteadyState(future);
        if (result == null) result = caseQuantifiedProbability(future);
        if (result == null) result = caseProbability(future);
        if (result == null) result = casePctl(future);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.GLOBALLY:
      {
        Globally globally = (Globally)theEObject;
        T result = caseGlobally(globally);
        if (result == null) result = caseExpression(globally);
        if (result == null) result = caseSteadyState(globally);
        if (result == null) result = caseQuantifiedProbability(globally);
        if (result == null) result = caseProbability(globally);
        if (result == null) result = casePctl(globally);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.IMPLICATION:
      {
        Implication implication = (Implication)theEObject;
        T result = caseImplication(implication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.CONJUNCTION:
      {
        Conjunction conjunction = (Conjunction)theEObject;
        T result = caseConjunction(conjunction);
        if (result == null) result = caseExpression(conjunction);
        if (result == null) result = caseSteadyState(conjunction);
        if (result == null) result = caseQuantifiedProbability(conjunction);
        if (result == null) result = caseProbability(conjunction);
        if (result == null) result = casePctl(conjunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.DISJUNCTION:
      {
        Disjunction disjunction = (Disjunction)theEObject;
        T result = caseDisjunction(disjunction);
        if (result == null) result = caseExpression(disjunction);
        if (result == null) result = caseSteadyState(disjunction);
        if (result == null) result = caseQuantifiedProbability(disjunction);
        if (result == null) result = caseProbability(disjunction);
        if (result == null) result = casePctl(disjunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
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
  public T caseStart(Start object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Commented Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Commented Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommentedRule(CommentedRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pctl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pctl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePctl(Pctl object)
  {
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
  public T caseState(State object)
  {
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
  public T caseLabel(Label object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomic(Atomic object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Steady State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Steady State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSteadyState(SteadyState object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quantified Probability</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quantified Probability</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuantifiedProbability(QuantifiedProbability object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Probability</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Probability</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProbability(Probability object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Until</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Until</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUntil(Until object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Next</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Next</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNext(Next object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Future</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Future</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFuture(Future object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Globally</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Globally</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlobally(Globally object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Implication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Implication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImplication(Implication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conjunction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conjunction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConjunction(Conjunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Disjunction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Disjunction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisjunction(Disjunction object)
  {
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PCTLSwitch
