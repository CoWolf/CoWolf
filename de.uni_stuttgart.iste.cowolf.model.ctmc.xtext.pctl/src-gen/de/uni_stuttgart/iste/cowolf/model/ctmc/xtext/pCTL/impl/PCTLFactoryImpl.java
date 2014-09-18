/**
 */
package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl;

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
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PCTLFactory;
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
      case PCTLPackage.FRAGMENT: return createFragment();
      case PCTLPackage.COMMENT: return createComment();
      case PCTLPackage.RULE: return createRule();
      case PCTLPackage.STEADY_STATE: return createSteadyState();
      case PCTLPackage.QUANTIFIED_PROBABILITY: return createQuantifiedProbability();
      case PCTLPackage.BOOLEAN_RULE: return createBooleanRule();
      case PCTLPackage.STATE_FORMULA: return createStateFormula();
      case PCTLPackage.STATE_EXPRESSION: return createStateExpression();
      case PCTLPackage.RIGHT_STATE_EXPRESSION: return createRightStateExpression();
      case PCTLPackage.STATE: return createState();
      case PCTLPackage.LABEL: return createLabel();
      case PCTLPackage.BOOLEAN: return createBoolean();
      case PCTLPackage.PATH_FORMULA: return createPathFormula();
      case PCTLPackage.UNTIL: return createUntil();
      case PCTLPackage.NEXT: return createNext();
      case PCTLPackage.FUTURE: return createFuture();
      case PCTLPackage.GLOBALLY: return createGlobally();
      case PCTLPackage.COMPARE_PROBABILITY: return createCompareProbability();
      case PCTLPackage.TIME_BOUND: return createTimeBound();
      case PCTLPackage.CONJUNCTION: return createConjunction();
      case PCTLPackage.DISJUNCTION: return createDisjunction();
      case PCTLPackage.PROBABILITY: return createProbability();
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
  public Fragment createFragment()
  {
    FragmentImpl fragment = new FragmentImpl();
    return fragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comment createComment()
  {
    CommentImpl comment = new CommentImpl();
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
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
  public BooleanRule createBooleanRule()
  {
    BooleanRuleImpl booleanRule = new BooleanRuleImpl();
    return booleanRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateFormula createStateFormula()
  {
    StateFormulaImpl stateFormula = new StateFormulaImpl();
    return stateFormula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateExpression createStateExpression()
  {
    StateExpressionImpl stateExpression = new StateExpressionImpl();
    return stateExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RightStateExpression createRightStateExpression()
  {
    RightStateExpressionImpl rightStateExpression = new RightStateExpressionImpl();
    return rightStateExpression;
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
  public de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Boolean createBoolean()
  {
    BooleanImpl boolean_ = new BooleanImpl();
    return boolean_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathFormula createPathFormula()
  {
    PathFormulaImpl pathFormula = new PathFormulaImpl();
    return pathFormula;
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
  public CompareProbability createCompareProbability()
  {
    CompareProbabilityImpl compareProbability = new CompareProbabilityImpl();
    return compareProbability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeBound createTimeBound()
  {
    TimeBoundImpl timeBound = new TimeBoundImpl();
    return timeBound;
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
