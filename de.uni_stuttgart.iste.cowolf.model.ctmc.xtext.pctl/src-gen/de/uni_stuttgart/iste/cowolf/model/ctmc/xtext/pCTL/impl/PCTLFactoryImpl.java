/**
 */
package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl;

import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCTLFactoryImpl extends EFactoryImpl implements PCTLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PCTLFactory init()
  {
    try
    {
      PCTLFactory thePCTLFactory = (PCTLFactory)EPackage.Registry.INSTANCE.getEFactory(PCTLPackage.eNS_URI);
      if (thePCTLFactory != null)
      {
        return thePCTLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PCTLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PCTLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PCTLPackage.START: return createStart();
      case PCTLPackage.COMMENTED_RULE: return createCommentedRule();
      case PCTLPackage.PCTL: return createPctl();
      case PCTLPackage.STATE: return createState();
      case PCTLPackage.LABEL: return createLabel();
      case PCTLPackage.ATOMIC: return createAtomic();
      case PCTLPackage.EXPRESSION: return createExpression();
      case PCTLPackage.STEADY_STATE: return createSteadyState();
      case PCTLPackage.QUANTIFIED_PROBABILITY: return createQuantifiedProbability();
      case PCTLPackage.PROBABILITY: return createProbability();
      case PCTLPackage.UNTIL: return createUntil();
      case PCTLPackage.NEXT: return createNext();
      case PCTLPackage.FUTURE: return createFuture();
      case PCTLPackage.GLOBALLY: return createGlobally();
      case PCTLPackage.CONJUNCTION: return createConjunction();
      case PCTLPackage.DISJUNCTION: return createDisjunction();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Start createStart()
  {
    StartImpl start = new StartImpl();
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommentedRule createCommentedRule()
  {
    CommentedRuleImpl commentedRule = new CommentedRuleImpl();
    return commentedRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pctl createPctl()
  {
    PctlImpl pctl = new PctlImpl();
    return pctl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Label createLabel()
  {
    LabelImpl label = new LabelImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atomic createAtomic()
  {
    AtomicImpl atomic = new AtomicImpl();
    return atomic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SteadyState createSteadyState()
  {
    SteadyStateImpl steadyState = new SteadyStateImpl();
    return steadyState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantifiedProbability createQuantifiedProbability()
  {
    QuantifiedProbabilityImpl quantifiedProbability = new QuantifiedProbabilityImpl();
    return quantifiedProbability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Probability createProbability()
  {
    ProbabilityImpl probability = new ProbabilityImpl();
    return probability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Until createUntil()
  {
    UntilImpl until = new UntilImpl();
    return until;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Next createNext()
  {
    NextImpl next = new NextImpl();
    return next;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Future createFuture()
  {
    FutureImpl future = new FutureImpl();
    return future;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Globally createGlobally()
  {
    GloballyImpl globally = new GloballyImpl();
    return globally;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Conjunction createConjunction()
  {
    ConjunctionImpl conjunction = new ConjunctionImpl();
    return conjunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Disjunction createDisjunction()
  {
    DisjunctionImpl disjunction = new DisjunctionImpl();
    return disjunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PCTLPackage getPCTLPackage()
  {
    return (PCTLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PCTLPackage getPackage()
  {
    return PCTLPackage.eINSTANCE;
  }

} //PCTLFactoryImpl
