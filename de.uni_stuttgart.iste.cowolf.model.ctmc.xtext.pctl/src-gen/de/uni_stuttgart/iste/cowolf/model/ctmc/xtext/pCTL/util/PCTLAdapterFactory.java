/**
 */
package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.util;

import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PCTLPackage
 * @generated
 */
public class PCTLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PCTLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PCTLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PCTLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PCTLSwitch<Adapter> modelSwitch =
    new PCTLSwitch<Adapter>()
    {
      @Override
      public Adapter caseStart(Start object)
      {
        return createStartAdapter();
      }
      @Override
      public Adapter caseRules(Rules object)
      {
        return createRulesAdapter();
      }
      @Override
      public Adapter caseCommentedRule(CommentedRule object)
      {
        return createCommentedRuleAdapter();
      }
      @Override
      public Adapter casePctl(Pctl object)
      {
        return createPctlAdapter();
      }
      @Override
      public Adapter caseState(State object)
      {
        return createStateAdapter();
      }
      @Override
      public Adapter caseLabel(Label object)
      {
        return createLabelAdapter();
      }
      @Override
      public Adapter caseAtomic(Atomic object)
      {
        return createAtomicAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseSteadyState(SteadyState object)
      {
        return createSteadyStateAdapter();
      }
      @Override
      public Adapter caseQuantifiedProbability(QuantifiedProbability object)
      {
        return createQuantifiedProbabilityAdapter();
      }
      @Override
      public Adapter caseProbability(Probability object)
      {
        return createProbabilityAdapter();
      }
      @Override
      public Adapter caseUntil(Until object)
      {
        return createUntilAdapter();
      }
      @Override
      public Adapter caseNext(Next object)
      {
        return createNextAdapter();
      }
      @Override
      public Adapter caseFuture(Future object)
      {
        return createFutureAdapter();
      }
      @Override
      public Adapter caseGlobally(Globally object)
      {
        return createGloballyAdapter();
      }
      @Override
      public Adapter caseImplication(Implication object)
      {
        return createImplicationAdapter();
      }
      @Override
      public Adapter caseConjunction(Conjunction object)
      {
        return createConjunctionAdapter();
      }
      @Override
      public Adapter caseDisjunction(Disjunction object)
      {
        return createDisjunctionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Start <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Start
   * @generated
   */
  public Adapter createStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Rules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Rules
   * @generated
   */
  public Adapter createRulesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.CommentedRule <em>Commented Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.CommentedRule
   * @generated
   */
  public Adapter createCommentedRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Pctl <em>Pctl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Pctl
   * @generated
   */
  public Adapter createPctlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.State
   * @generated
   */
  public Adapter createStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Label
   * @generated
   */
  public Adapter createLabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Atomic <em>Atomic</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Atomic
   * @generated
   */
  public Adapter createAtomicAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.SteadyState <em>Steady State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.SteadyState
   * @generated
   */
  public Adapter createSteadyStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.QuantifiedProbability <em>Quantified Probability</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.QuantifiedProbability
   * @generated
   */
  public Adapter createQuantifiedProbabilityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Probability <em>Probability</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Probability
   * @generated
   */
  public Adapter createProbabilityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Until <em>Until</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Until
   * @generated
   */
  public Adapter createUntilAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Next <em>Next</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Next
   * @generated
   */
  public Adapter createNextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Future <em>Future</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Future
   * @generated
   */
  public Adapter createFutureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Globally <em>Globally</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Globally
   * @generated
   */
  public Adapter createGloballyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Implication <em>Implication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Implication
   * @generated
   */
  public Adapter createImplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Conjunction <em>Conjunction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Conjunction
   * @generated
   */
  public Adapter createConjunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Disjunction <em>Disjunction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Disjunction
   * @generated
   */
  public Adapter createDisjunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PCTLAdapterFactory
