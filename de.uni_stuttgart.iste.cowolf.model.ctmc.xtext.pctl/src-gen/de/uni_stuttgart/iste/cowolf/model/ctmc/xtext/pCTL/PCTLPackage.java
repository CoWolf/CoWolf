/**
 */
package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PCTLFactory
 * @model kind="package"
 * @generated
 */
public interface PCTLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pCTL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.uni_stuttgart.de/iste/cowolf/model/ctmc/xtext/PCTL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pCTL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PCTLPackage eINSTANCE = de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl.init();

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StartImpl <em>Start</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StartImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getStart()
   * @generated
   */
  int START = 0;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START__START = 0;

  /**
   * The number of structural features of the '<em>Start</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.CommentedRuleImpl <em>Commented Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.CommentedRuleImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getCommentedRule()
   * @generated
   */
  int COMMENTED_RULE = 1;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENTED_RULE__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENTED_RULE__RULE = 1;

  /**
   * The number of structural features of the '<em>Commented Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENTED_RULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PctlImpl <em>Pctl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PctlImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getPctl()
   * @generated
   */
  int PCTL = 2;

  /**
   * The number of structural features of the '<em>Pctl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PCTL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.ExpressionImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 6;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LEFT = PCTL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RIGHT = PCTL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = PCTL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.AtomicImpl <em>Atomic</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.AtomicImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getAtomic()
   * @generated
   */
  int ATOMIC = 5;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC__NAME = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Atomic</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StateImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getState()
   * @generated
   */
  int STATE = 3;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__LEFT = ATOMIC__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__RIGHT = ATOMIC__RIGHT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = ATOMIC__NAME;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = ATOMIC_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.LabelImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getLabel()
   * @generated
   */
  int LABEL = 4;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__LEFT = ATOMIC__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__RIGHT = ATOMIC__RIGHT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__NAME = ATOMIC__NAME;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = ATOMIC_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.SteadyStateImpl <em>Steady State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.SteadyStateImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getSteadyState()
   * @generated
   */
  int STEADY_STATE = 7;

  /**
   * The number of structural features of the '<em>Steady State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEADY_STATE_FEATURE_COUNT = PCTL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.QuantifiedProbabilityImpl <em>Quantified Probability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.QuantifiedProbabilityImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getQuantifiedProbability()
   * @generated
   */
  int QUANTIFIED_PROBABILITY = 8;

  /**
   * The number of structural features of the '<em>Quantified Probability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_PROBABILITY_FEATURE_COUNT = PCTL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.ProbabilityImpl <em>Probability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.ProbabilityImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getProbability()
   * @generated
   */
  int PROBABILITY = 9;

  /**
   * The number of structural features of the '<em>Probability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.UntilImpl <em>Until</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.UntilImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getUntil()
   * @generated
   */
  int UNTIL = 10;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNTIL__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNTIL__RIGHT = EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Until</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNTIL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.NextImpl <em>Next</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.NextImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getNext()
   * @generated
   */
  int NEXT = 11;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEXT__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEXT__RIGHT = EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Next</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEXT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.FutureImpl <em>Future</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.FutureImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getFuture()
   * @generated
   */
  int FUTURE = 12;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUTURE__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUTURE__RIGHT = EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Future</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUTURE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.GloballyImpl <em>Globally</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.GloballyImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getGlobally()
   * @generated
   */
  int GLOBALLY = 13;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBALLY__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBALLY__RIGHT = EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Globally</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBALLY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.ImplicationImpl <em>Implication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.ImplicationImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getImplication()
   * @generated
   */
  int IMPLICATION = 14;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLICATION__RIGHT = 0;

  /**
   * The number of structural features of the '<em>Implication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLICATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.ConjunctionImpl <em>Conjunction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.ConjunctionImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getConjunction()
   * @generated
   */
  int CONJUNCTION = 15;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONJUNCTION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONJUNCTION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Conjunction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONJUNCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.DisjunctionImpl <em>Disjunction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.DisjunctionImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getDisjunction()
   * @generated
   */
  int DISJUNCTION = 16;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJUNCTION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJUNCTION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The number of structural features of the '<em>Disjunction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJUNCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Start <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Start</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Start
   * @generated
   */
  EClass getStart();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Start#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Start#getStart()
   * @see #getStart()
   * @generated
   */
  EReference getStart_Start();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.CommentedRule <em>Commented Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Commented Rule</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.CommentedRule
   * @generated
   */
  EClass getCommentedRule();

  /**
   * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.CommentedRule#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.CommentedRule#getComment()
   * @see #getCommentedRule()
   * @generated
   */
  EAttribute getCommentedRule_Comment();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.CommentedRule#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rule</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.CommentedRule#getRule()
   * @see #getCommentedRule()
   * @generated
   */
  EReference getCommentedRule_Rule();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Pctl <em>Pctl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pctl</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Pctl
   * @generated
   */
  EClass getPctl();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Label
   * @generated
   */
  EClass getLabel();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Atomic <em>Atomic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atomic</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Atomic
   * @generated
   */
  EClass getAtomic();

  /**
   * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Atomic#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Atomic#getName()
   * @see #getAtomic()
   * @generated
   */
  EAttribute getAtomic_Name();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Expression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Expression#getLeft()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Expression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Expression#getRight()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Right();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.SteadyState <em>Steady State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Steady State</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.SteadyState
   * @generated
   */
  EClass getSteadyState();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.QuantifiedProbability <em>Quantified Probability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quantified Probability</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.QuantifiedProbability
   * @generated
   */
  EClass getQuantifiedProbability();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Probability <em>Probability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Probability</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Probability
   * @generated
   */
  EClass getProbability();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Until <em>Until</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Until</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Until
   * @generated
   */
  EClass getUntil();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Next <em>Next</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Next</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Next
   * @generated
   */
  EClass getNext();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Future <em>Future</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Future</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Future
   * @generated
   */
  EClass getFuture();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Globally <em>Globally</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Globally</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Globally
   * @generated
   */
  EClass getGlobally();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Implication <em>Implication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implication</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Implication
   * @generated
   */
  EClass getImplication();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Implication#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Implication#getRight()
   * @see #getImplication()
   * @generated
   */
  EReference getImplication_Right();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Conjunction <em>Conjunction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conjunction</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Conjunction
   * @generated
   */
  EClass getConjunction();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Disjunction <em>Disjunction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disjunction</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Disjunction
   * @generated
   */
  EClass getDisjunction();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PCTLFactory getPCTLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StartImpl <em>Start</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StartImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getStart()
     * @generated
     */
    EClass START = eINSTANCE.getStart();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference START__START = eINSTANCE.getStart_Start();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.CommentedRuleImpl <em>Commented Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.CommentedRuleImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getCommentedRule()
     * @generated
     */
    EClass COMMENTED_RULE = eINSTANCE.getCommentedRule();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMENTED_RULE__COMMENT = eINSTANCE.getCommentedRule_Comment();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMENTED_RULE__RULE = eINSTANCE.getCommentedRule_Rule();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PctlImpl <em>Pctl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PctlImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getPctl()
     * @generated
     */
    EClass PCTL = eINSTANCE.getPctl();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StateImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.LabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.LabelImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getLabel()
     * @generated
     */
    EClass LABEL = eINSTANCE.getLabel();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.AtomicImpl <em>Atomic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.AtomicImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getAtomic()
     * @generated
     */
    EClass ATOMIC = eINSTANCE.getAtomic();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOMIC__NAME = eINSTANCE.getAtomic_Name();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.ExpressionImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__LEFT = eINSTANCE.getExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__RIGHT = eINSTANCE.getExpression_Right();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.SteadyStateImpl <em>Steady State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.SteadyStateImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getSteadyState()
     * @generated
     */
    EClass STEADY_STATE = eINSTANCE.getSteadyState();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.QuantifiedProbabilityImpl <em>Quantified Probability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.QuantifiedProbabilityImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getQuantifiedProbability()
     * @generated
     */
    EClass QUANTIFIED_PROBABILITY = eINSTANCE.getQuantifiedProbability();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.ProbabilityImpl <em>Probability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.ProbabilityImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getProbability()
     * @generated
     */
    EClass PROBABILITY = eINSTANCE.getProbability();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.UntilImpl <em>Until</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.UntilImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getUntil()
     * @generated
     */
    EClass UNTIL = eINSTANCE.getUntil();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.NextImpl <em>Next</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.NextImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getNext()
     * @generated
     */
    EClass NEXT = eINSTANCE.getNext();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.FutureImpl <em>Future</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.FutureImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getFuture()
     * @generated
     */
    EClass FUTURE = eINSTANCE.getFuture();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.GloballyImpl <em>Globally</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.GloballyImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getGlobally()
     * @generated
     */
    EClass GLOBALLY = eINSTANCE.getGlobally();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.ImplicationImpl <em>Implication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.ImplicationImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getImplication()
     * @generated
     */
    EClass IMPLICATION = eINSTANCE.getImplication();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLICATION__RIGHT = eINSTANCE.getImplication_Right();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.ConjunctionImpl <em>Conjunction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.ConjunctionImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getConjunction()
     * @generated
     */
    EClass CONJUNCTION = eINSTANCE.getConjunction();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.DisjunctionImpl <em>Disjunction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.DisjunctionImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getDisjunction()
     * @generated
     */
    EClass DISJUNCTION = eINSTANCE.getDisjunction();

  }

} //PCTLPackage
