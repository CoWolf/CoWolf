/**
 */
package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.util;

import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.BooleanRule;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Comment;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.CompareProbability;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Conjunction;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Disjunction;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Fragment;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Future;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Globally;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Label;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Next;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PCTLPackage;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PathFormula;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Probability;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.QuantifiedProbability;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.RightStateExpression;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Rule;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Start;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.State;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.StateExpression;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.StateFormula;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.SteadyState;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.TimeBound;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Until;

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
      case PCTLPackage.FRAGMENT:
      {
        Fragment fragment = (Fragment)theEObject;
        T result = caseFragment(fragment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.COMMENT:
      {
        Comment comment = (Comment)theEObject;
        T result = caseComment(comment);
        if (result == null) result = caseFragment(comment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.RULE:
      {
        Rule rule = (Rule)theEObject;
        T result = caseRule(rule);
        if (result == null) result = caseFragment(rule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.STEADY_STATE:
      {
        SteadyState steadyState = (SteadyState)theEObject;
        T result = caseSteadyState(steadyState);
        if (result == null) result = caseRule(steadyState);
        if (result == null) result = caseFragment(steadyState);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.QUANTIFIED_PROBABILITY:
      {
        QuantifiedProbability quantifiedProbability = (QuantifiedProbability)theEObject;
        T result = caseQuantifiedProbability(quantifiedProbability);
        if (result == null) result = caseRule(quantifiedProbability);
        if (result == null) result = caseFragment(quantifiedProbability);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.BOOLEAN_RULE:
      {
        BooleanRule booleanRule = (BooleanRule)theEObject;
        T result = caseBooleanRule(booleanRule);
        if (result == null) result = caseRule(booleanRule);
        if (result == null) result = caseFragment(booleanRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.STATE_FORMULA:
      {
        StateFormula stateFormula = (StateFormula)theEObject;
        T result = caseStateFormula(stateFormula);
        if (result == null) result = caseStateExpression(stateFormula);
        if (result == null) result = caseRightStateExpression(stateFormula);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.STATE_EXPRESSION:
      {
        StateExpression stateExpression = (StateExpression)theEObject;
        T result = caseStateExpression(stateExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.RIGHT_STATE_EXPRESSION:
      {
        RightStateExpression rightStateExpression = (RightStateExpression)theEObject;
        T result = caseRightStateExpression(rightStateExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.STATE:
      {
        State state = (State)theEObject;
        T result = caseState(state);
        if (result == null) result = caseStateExpression(state);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.LABEL:
      {
        Label label = (Label)theEObject;
        T result = caseLabel(label);
        if (result == null) result = caseStateExpression(label);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.BOOLEAN:
      {
        de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Boolean boolean_ = (de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Boolean)theEObject;
        T result = caseBoolean(boolean_);
        if (result == null) result = caseStateExpression(boolean_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.PATH_FORMULA:
      {
        PathFormula pathFormula = (PathFormula)theEObject;
        T result = casePathFormula(pathFormula);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.UNTIL:
      {
        Until until = (Until)theEObject;
        T result = caseUntil(until);
        if (result == null) result = casePathFormula(until);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.NEXT:
      {
        Next next = (Next)theEObject;
        T result = caseNext(next);
        if (result == null) result = casePathFormula(next);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.FUTURE:
      {
        Future future = (Future)theEObject;
        T result = caseFuture(future);
        if (result == null) result = casePathFormula(future);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.GLOBALLY:
      {
        Globally globally = (Globally)theEObject;
        T result = caseGlobally(globally);
        if (result == null) result = casePathFormula(globally);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.COMPARE_PROBABILITY:
      {
        CompareProbability compareProbability = (CompareProbability)theEObject;
        T result = caseCompareProbability(compareProbability);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.TIME_BOUND:
      {
        TimeBound timeBound = (TimeBound)theEObject;
        T result = caseTimeBound(timeBound);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.CONJUNCTION:
      {
        Conjunction conjunction = (Conjunction)theEObject;
        T result = caseConjunction(conjunction);
        if (result == null) result = caseRightStateExpression(conjunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.DISJUNCTION:
      {
        Disjunction disjunction = (Disjunction)theEObject;
        T result = caseDisjunction(disjunction);
        if (result == null) result = caseRightStateExpression(disjunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PCTLPackage.PROBABILITY:
      {
        Probability probability = (Probability)theEObject;
        T result = caseProbability(probability);
        if (result == null) result = caseStateExpression(probability);
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
   * Returns the result of interpreting the object as an instance of '<em>Fragment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fragment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFragment(Fragment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComment(Comment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule(Rule object)
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
   * Returns the result of interpreting the object as an instance of '<em>Boolean Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanRule(BooleanRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Formula</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Formula</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateFormula(StateFormula object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateExpression(StateExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Right State Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Right State Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRightStateExpression(RightStateExpression object)
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
   * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolean(de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Boolean object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path Formula</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path Formula</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePathFormula(PathFormula object)
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
   * Returns the result of interpreting the object as an instance of '<em>Compare Probability</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compare Probability</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompareProbability(CompareProbability object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time Bound</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time Bound</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimeBound(TimeBound object)
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
