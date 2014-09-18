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
   * The feature id for the '<em><b>Rule</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START__RULE = 0;

  /**
   * The number of structural features of the '<em>Start</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.FragmentImpl <em>Fragment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.FragmentImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getFragment()
   * @generated
   */
  int FRAGMENT = 1;

  /**
   * The number of structural features of the '<em>Fragment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAGMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.CommentImpl <em>Comment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.CommentImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getComment()
   * @generated
   */
  int COMMENT = 2;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__COMMENT = FRAGMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Comment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT_FEATURE_COUNT = FRAGMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.RuleImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getRule()
   * @generated
   */
  int RULE = 3;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = FRAGMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.SteadyStateImpl <em>Steady State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.SteadyStateImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getSteadyState()
   * @generated
   */
  int STEADY_STATE = 4;

  /**
   * The feature id for the '<em><b>Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEADY_STATE__BOUND = RULE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEADY_STATE__VALUE = RULE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Steady State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEADY_STATE_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.QuantifiedProbabilityImpl <em>Quantified Probability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.QuantifiedProbabilityImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getQuantifiedProbability()
   * @generated
   */
  int QUANTIFIED_PROBABILITY = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_PROBABILITY__VALUE = RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Quantified Probability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIED_PROBABILITY_FEATURE_COUNT = RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.BooleanRuleImpl <em>Boolean Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.BooleanRuleImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getBooleanRule()
   * @generated
   */
  int BOOLEAN_RULE = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_RULE__VALUE = RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StateExpressionImpl <em>State Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StateExpressionImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getStateExpression()
   * @generated
   */
  int STATE_EXPRESSION = 8;

  /**
   * The number of structural features of the '<em>State Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StateFormulaImpl <em>State Formula</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StateFormulaImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getStateFormula()
   * @generated
   */
  int STATE_FORMULA = 7;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FORMULA__RIGHT = STATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FORMULA__LEFT = STATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>State Formula</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FORMULA_FEATURE_COUNT = STATE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.RightStateExpressionImpl <em>Right State Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.RightStateExpressionImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getRightStateExpression()
   * @generated
   */
  int RIGHT_STATE_EXPRESSION = 9;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_STATE_EXPRESSION__RIGHT = 0;

  /**
   * The number of structural features of the '<em>Right State Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_STATE_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StateImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getState()
   * @generated
   */
  int STATE = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__VALUE = STATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = STATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.LabelImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getLabel()
   * @generated
   */
  int LABEL = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__VALUE = STATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = STATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.BooleanImpl <em>Boolean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.BooleanImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getBoolean()
   * @generated
   */
  int BOOLEAN = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN__VALUE = STATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_FEATURE_COUNT = STATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PathFormulaImpl <em>Path Formula</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PathFormulaImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getPathFormula()
   * @generated
   */
  int PATH_FORMULA = 13;

  /**
   * The feature id for the '<em><b>Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_FORMULA__BOUND = 0;

  /**
   * The number of structural features of the '<em>Path Formula</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_FORMULA_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.UntilImpl <em>Until</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.UntilImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getUntil()
   * @generated
   */
  int UNTIL = 14;

  /**
   * The feature id for the '<em><b>Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNTIL__BOUND = PATH_FORMULA__BOUND;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNTIL__LEFT = PATH_FORMULA_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNTIL__TYPE = PATH_FORMULA_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNTIL__RIGHT = PATH_FORMULA_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Until</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNTIL_FEATURE_COUNT = PATH_FORMULA_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.NextImpl <em>Next</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.NextImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getNext()
   * @generated
   */
  int NEXT = 15;

  /**
   * The feature id for the '<em><b>Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEXT__BOUND = PATH_FORMULA__BOUND;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEXT__VALUE = PATH_FORMULA_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Next</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEXT_FEATURE_COUNT = PATH_FORMULA_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.FutureImpl <em>Future</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.FutureImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getFuture()
   * @generated
   */
  int FUTURE = 16;

  /**
   * The feature id for the '<em><b>Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUTURE__BOUND = PATH_FORMULA__BOUND;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUTURE__VALUE = PATH_FORMULA_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Future</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUTURE_FEATURE_COUNT = PATH_FORMULA_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.GloballyImpl <em>Globally</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.GloballyImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getGlobally()
   * @generated
   */
  int GLOBALLY = 17;

  /**
   * The feature id for the '<em><b>Bound</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBALLY__BOUND = PATH_FORMULA__BOUND;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBALLY__VALUE = PATH_FORMULA_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Globally</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBALLY_FEATURE_COUNT = PATH_FORMULA_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.CompareProbabilityImpl <em>Compare Probability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.CompareProbabilityImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getCompareProbability()
   * @generated
   */
  int COMPARE_PROBABILITY = 18;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_PROBABILITY__OPERATOR = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_PROBABILITY__VALUE = 1;

  /**
   * The number of structural features of the '<em>Compare Probability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_PROBABILITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.TimeBoundImpl <em>Time Bound</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.TimeBoundImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getTimeBound()
   * @generated
   */
  int TIME_BOUND = 19;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_BOUND__OPERATOR = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_BOUND__VALUE = 1;

  /**
   * The feature id for the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_BOUND__FROM = 2;

  /**
   * The feature id for the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_BOUND__TO = 3;

  /**
   * The number of structural features of the '<em>Time Bound</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_BOUND_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.ConjunctionImpl <em>Conjunction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.ConjunctionImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getConjunction()
   * @generated
   */
  int CONJUNCTION = 20;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONJUNCTION__RIGHT = RIGHT_STATE_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONJUNCTION__LEFT = RIGHT_STATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Conjunction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONJUNCTION_FEATURE_COUNT = RIGHT_STATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.DisjunctionImpl <em>Disjunction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.DisjunctionImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getDisjunction()
   * @generated
   */
  int DISJUNCTION = 21;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJUNCTION__RIGHT = RIGHT_STATE_EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJUNCTION__LEFT = RIGHT_STATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Disjunction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJUNCTION_FEATURE_COUNT = RIGHT_STATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.ProbabilityImpl <em>Probability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.ProbabilityImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getProbability()
   * @generated
   */
  int PROBABILITY = 22;

  /**
   * The feature id for the '<em><b>Comparator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY__COMPARATOR = STATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY__PATH = STATE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Probability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROBABILITY_FEATURE_COUNT = STATE_EXPRESSION_FEATURE_COUNT + 2;


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
   * Returns the meta object for the containment reference list '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Start#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rule</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Start#getRule()
   * @see #getStart()
   * @generated
   */
  EReference getStart_Rule();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Fragment <em>Fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fragment</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Fragment
   * @generated
   */
  EClass getFragment();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comment</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Comment
   * @generated
   */
  EClass getComment();

  /**
   * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Comment#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Comment#getComment()
   * @see #getComment()
   * @generated
   */
  EAttribute getComment_Comment();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Rule
   * @generated
   */
  EClass getRule();

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
   * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.SteadyState#getBound <em>Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bound</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.SteadyState#getBound()
   * @see #getSteadyState()
   * @generated
   */
  EReference getSteadyState_Bound();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.SteadyState#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.SteadyState#getValue()
   * @see #getSteadyState()
   * @generated
   */
  EReference getSteadyState_Value();

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
   * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.QuantifiedProbability#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.QuantifiedProbability#getValue()
   * @see #getQuantifiedProbability()
   * @generated
   */
  EReference getQuantifiedProbability_Value();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.BooleanRule <em>Boolean Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Rule</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.BooleanRule
   * @generated
   */
  EClass getBooleanRule();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.BooleanRule#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.BooleanRule#getValue()
   * @see #getBooleanRule()
   * @generated
   */
  EReference getBooleanRule_Value();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.StateFormula <em>State Formula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Formula</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.StateFormula
   * @generated
   */
  EClass getStateFormula();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.StateFormula#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.StateFormula#getLeft()
   * @see #getStateFormula()
   * @generated
   */
  EReference getStateFormula_Left();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.StateExpression <em>State Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Expression</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.StateExpression
   * @generated
   */
  EClass getStateExpression();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.RightStateExpression <em>Right State Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Right State Expression</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.RightStateExpression
   * @generated
   */
  EClass getRightStateExpression();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.RightStateExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.RightStateExpression#getRight()
   * @see #getRightStateExpression()
   * @generated
   */
  EReference getRightStateExpression_Right();

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
   * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.State#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.State#getValue()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Value();

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
   * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Label#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Label#getValue()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Value();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Boolean <em>Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Boolean
   * @generated
   */
  EClass getBoolean();

  /**
   * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Boolean#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Boolean#getValue()
   * @see #getBoolean()
   * @generated
   */
  EAttribute getBoolean_Value();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PathFormula <em>Path Formula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path Formula</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PathFormula
   * @generated
   */
  EClass getPathFormula();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PathFormula#getBound <em>Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bound</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PathFormula#getBound()
   * @see #getPathFormula()
   * @generated
   */
  EReference getPathFormula_Bound();

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
   * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Until#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Until#getLeft()
   * @see #getUntil()
   * @generated
   */
  EReference getUntil_Left();

  /**
   * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Until#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Until#getType()
   * @see #getUntil()
   * @generated
   */
  EAttribute getUntil_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Until#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Until#getRight()
   * @see #getUntil()
   * @generated
   */
  EReference getUntil_Right();

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
   * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Next#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Next#getValue()
   * @see #getNext()
   * @generated
   */
  EReference getNext_Value();

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
   * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Future#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Future#getValue()
   * @see #getFuture()
   * @generated
   */
  EReference getFuture_Value();

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
   * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Globally#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Globally#getValue()
   * @see #getGlobally()
   * @generated
   */
  EReference getGlobally_Value();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.CompareProbability <em>Compare Probability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compare Probability</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.CompareProbability
   * @generated
   */
  EClass getCompareProbability();

  /**
   * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.CompareProbability#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.CompareProbability#getOperator()
   * @see #getCompareProbability()
   * @generated
   */
  EAttribute getCompareProbability_Operator();

  /**
   * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.CompareProbability#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.CompareProbability#getValue()
   * @see #getCompareProbability()
   * @generated
   */
  EAttribute getCompareProbability_Value();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.TimeBound <em>Time Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time Bound</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.TimeBound
   * @generated
   */
  EClass getTimeBound();

  /**
   * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.TimeBound#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.TimeBound#getOperator()
   * @see #getTimeBound()
   * @generated
   */
  EAttribute getTimeBound_Operator();

  /**
   * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.TimeBound#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.TimeBound#getValue()
   * @see #getTimeBound()
   * @generated
   */
  EAttribute getTimeBound_Value();

  /**
   * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.TimeBound#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>From</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.TimeBound#getFrom()
   * @see #getTimeBound()
   * @generated
   */
  EAttribute getTimeBound_From();

  /**
   * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.TimeBound#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>To</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.TimeBound#getTo()
   * @see #getTimeBound()
   * @generated
   */
  EAttribute getTimeBound_To();

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
   * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Conjunction#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Conjunction#getLeft()
   * @see #getConjunction()
   * @generated
   */
  EReference getConjunction_Left();

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
   * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Disjunction#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Disjunction#getLeft()
   * @see #getDisjunction()
   * @generated
   */
  EReference getDisjunction_Left();

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
   * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Probability#getComparator <em>Comparator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Comparator</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Probability#getComparator()
   * @see #getProbability()
   * @generated
   */
  EReference getProbability_Comparator();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Probability#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Probability#getPath()
   * @see #getProbability()
   * @generated
   */
  EReference getProbability_Path();

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
     * The meta object literal for the '<em><b>Rule</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference START__RULE = eINSTANCE.getStart_Rule();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.FragmentImpl <em>Fragment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.FragmentImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getFragment()
     * @generated
     */
    EClass FRAGMENT = eINSTANCE.getFragment();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.CommentImpl <em>Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.CommentImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getComment()
     * @generated
     */
    EClass COMMENT = eINSTANCE.getComment();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMENT__COMMENT = eINSTANCE.getComment_Comment();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.RuleImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

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
     * The meta object literal for the '<em><b>Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STEADY_STATE__BOUND = eINSTANCE.getSteadyState_Bound();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STEADY_STATE__VALUE = eINSTANCE.getSteadyState_Value();

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
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUANTIFIED_PROBABILITY__VALUE = eINSTANCE.getQuantifiedProbability_Value();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.BooleanRuleImpl <em>Boolean Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.BooleanRuleImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getBooleanRule()
     * @generated
     */
    EClass BOOLEAN_RULE = eINSTANCE.getBooleanRule();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_RULE__VALUE = eINSTANCE.getBooleanRule_Value();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StateFormulaImpl <em>State Formula</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StateFormulaImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getStateFormula()
     * @generated
     */
    EClass STATE_FORMULA = eINSTANCE.getStateFormula();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_FORMULA__LEFT = eINSTANCE.getStateFormula_Left();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StateExpressionImpl <em>State Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StateExpressionImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getStateExpression()
     * @generated
     */
    EClass STATE_EXPRESSION = eINSTANCE.getStateExpression();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.RightStateExpressionImpl <em>Right State Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.RightStateExpressionImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getRightStateExpression()
     * @generated
     */
    EClass RIGHT_STATE_EXPRESSION = eINSTANCE.getRightStateExpression();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RIGHT_STATE_EXPRESSION__RIGHT = eINSTANCE.getRightStateExpression_Right();

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
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__VALUE = eINSTANCE.getState_Value();

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
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__VALUE = eINSTANCE.getLabel_Value();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.BooleanImpl <em>Boolean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.BooleanImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getBoolean()
     * @generated
     */
    EClass BOOLEAN = eINSTANCE.getBoolean();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN__VALUE = eINSTANCE.getBoolean_Value();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PathFormulaImpl <em>Path Formula</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PathFormulaImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getPathFormula()
     * @generated
     */
    EClass PATH_FORMULA = eINSTANCE.getPathFormula();

    /**
     * The meta object literal for the '<em><b>Bound</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATH_FORMULA__BOUND = eINSTANCE.getPathFormula_Bound();

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
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNTIL__LEFT = eINSTANCE.getUntil_Left();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNTIL__TYPE = eINSTANCE.getUntil_Type();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNTIL__RIGHT = eINSTANCE.getUntil_Right();

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
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEXT__VALUE = eINSTANCE.getNext_Value();

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
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUTURE__VALUE = eINSTANCE.getFuture_Value();

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
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBALLY__VALUE = eINSTANCE.getGlobally_Value();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.CompareProbabilityImpl <em>Compare Probability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.CompareProbabilityImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getCompareProbability()
     * @generated
     */
    EClass COMPARE_PROBABILITY = eINSTANCE.getCompareProbability();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARE_PROBABILITY__OPERATOR = eINSTANCE.getCompareProbability_Operator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARE_PROBABILITY__VALUE = eINSTANCE.getCompareProbability_Value();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.TimeBoundImpl <em>Time Bound</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.TimeBoundImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getTimeBound()
     * @generated
     */
    EClass TIME_BOUND = eINSTANCE.getTimeBound();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_BOUND__OPERATOR = eINSTANCE.getTimeBound_Operator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_BOUND__VALUE = eINSTANCE.getTimeBound_Value();

    /**
     * The meta object literal for the '<em><b>From</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_BOUND__FROM = eINSTANCE.getTimeBound_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIME_BOUND__TO = eINSTANCE.getTimeBound_To();

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
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONJUNCTION__LEFT = eINSTANCE.getConjunction_Left();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.DisjunctionImpl <em>Disjunction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.DisjunctionImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getDisjunction()
     * @generated
     */
    EClass DISJUNCTION = eINSTANCE.getDisjunction();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISJUNCTION__LEFT = eINSTANCE.getDisjunction_Left();

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
     * The meta object literal for the '<em><b>Comparator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROBABILITY__COMPARATOR = eINSTANCE.getProbability_Comparator();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROBABILITY__PATH = eINSTANCE.getProbability_Path();

  }

} //PCTLPackage
