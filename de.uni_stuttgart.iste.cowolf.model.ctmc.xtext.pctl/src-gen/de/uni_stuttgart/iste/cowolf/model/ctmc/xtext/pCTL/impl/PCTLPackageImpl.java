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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCTLPackageImpl extends EPackageImpl implements PCTLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass startEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fragmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass steadyStateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quantifiedProbabilityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateFormulaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rightStateExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathFormulaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass untilEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass futureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass globallyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compareProbabilityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timeBoundEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conjunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass disjunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass probabilityEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PCTLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PCTLPackageImpl()
  {
    super(eNS_URI, PCTLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PCTLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PCTLPackage init()
  {
    if (isInited) return (PCTLPackage)EPackage.Registry.INSTANCE.getEPackage(PCTLPackage.eNS_URI);

    // Obtain or create and register package
    PCTLPackageImpl thePCTLPackage = (PCTLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PCTLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PCTLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePCTLPackage.createPackageContents();

    // Initialize created meta-data
    thePCTLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePCTLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PCTLPackage.eNS_URI, thePCTLPackage);
    return thePCTLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStart()
  {
    return startEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStart_Rule()
  {
    return (EReference)startEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFragment()
  {
    return fragmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComment()
  {
    return commentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComment_Comment()
  {
    return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRule()
  {
    return ruleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSteadyState()
  {
    return steadyStateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSteadyState_Bound()
  {
    return (EReference)steadyStateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSteadyState_Value()
  {
    return (EReference)steadyStateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuantifiedProbability()
  {
    return quantifiedProbabilityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuantifiedProbability_Value()
  {
    return (EReference)quantifiedProbabilityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanRule()
  {
    return booleanRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanRule_Value()
  {
    return (EReference)booleanRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateFormula()
  {
    return stateFormulaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateFormula_Left()
  {
    return (EReference)stateFormulaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateExpression()
  {
    return stateExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRightStateExpression()
  {
    return rightStateExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRightStateExpression_Right()
  {
    return (EReference)rightStateExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getState()
  {
    return stateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getState_Value()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabel()
  {
    return labelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabel_Value()
  {
    return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoolean()
  {
    return booleanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBoolean_Value()
  {
    return (EAttribute)booleanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathFormula()
  {
    return pathFormulaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathFormula_Bound()
  {
    return (EReference)pathFormulaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUntil()
  {
    return untilEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUntil_Left()
  {
    return (EReference)untilEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUntil_Type()
  {
    return (EAttribute)untilEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUntil_Right()
  {
    return (EReference)untilEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNext()
  {
    return nextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNext_Value()
  {
    return (EReference)nextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFuture()
  {
    return futureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFuture_Value()
  {
    return (EReference)futureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGlobally()
  {
    return globallyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGlobally_Value()
  {
    return (EReference)globallyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompareProbability()
  {
    return compareProbabilityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCompareProbability_Operator()
  {
    return (EAttribute)compareProbabilityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCompareProbability_Value()
  {
    return (EAttribute)compareProbabilityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimeBound()
  {
    return timeBoundEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeBound_Operator()
  {
    return (EAttribute)timeBoundEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeBound_Value()
  {
    return (EAttribute)timeBoundEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeBound_From()
  {
    return (EAttribute)timeBoundEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeBound_To()
  {
    return (EAttribute)timeBoundEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConjunction()
  {
    return conjunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConjunction_Left()
  {
    return (EReference)conjunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDisjunction()
  {
    return disjunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisjunction_Left()
  {
    return (EReference)disjunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProbability()
  {
    return probabilityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProbability_Comparator()
  {
    return (EReference)probabilityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProbability_Path()
  {
    return (EReference)probabilityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PCTLFactory getPCTLFactory()
  {
    return (PCTLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    startEClass = createEClass(START);
    createEReference(startEClass, START__RULE);

    fragmentEClass = createEClass(FRAGMENT);

    commentEClass = createEClass(COMMENT);
    createEAttribute(commentEClass, COMMENT__COMMENT);

    ruleEClass = createEClass(RULE);

    steadyStateEClass = createEClass(STEADY_STATE);
    createEReference(steadyStateEClass, STEADY_STATE__BOUND);
    createEReference(steadyStateEClass, STEADY_STATE__VALUE);

    quantifiedProbabilityEClass = createEClass(QUANTIFIED_PROBABILITY);
    createEReference(quantifiedProbabilityEClass, QUANTIFIED_PROBABILITY__VALUE);

    booleanRuleEClass = createEClass(BOOLEAN_RULE);
    createEReference(booleanRuleEClass, BOOLEAN_RULE__VALUE);

    stateFormulaEClass = createEClass(STATE_FORMULA);
    createEReference(stateFormulaEClass, STATE_FORMULA__LEFT);

    stateExpressionEClass = createEClass(STATE_EXPRESSION);

    rightStateExpressionEClass = createEClass(RIGHT_STATE_EXPRESSION);
    createEReference(rightStateExpressionEClass, RIGHT_STATE_EXPRESSION__RIGHT);

    stateEClass = createEClass(STATE);
    createEAttribute(stateEClass, STATE__VALUE);

    labelEClass = createEClass(LABEL);
    createEAttribute(labelEClass, LABEL__VALUE);

    booleanEClass = createEClass(BOOLEAN);
    createEAttribute(booleanEClass, BOOLEAN__VALUE);

    pathFormulaEClass = createEClass(PATH_FORMULA);
    createEReference(pathFormulaEClass, PATH_FORMULA__BOUND);

    untilEClass = createEClass(UNTIL);
    createEReference(untilEClass, UNTIL__LEFT);
    createEAttribute(untilEClass, UNTIL__TYPE);
    createEReference(untilEClass, UNTIL__RIGHT);

    nextEClass = createEClass(NEXT);
    createEReference(nextEClass, NEXT__VALUE);

    futureEClass = createEClass(FUTURE);
    createEReference(futureEClass, FUTURE__VALUE);

    globallyEClass = createEClass(GLOBALLY);
    createEReference(globallyEClass, GLOBALLY__VALUE);

    compareProbabilityEClass = createEClass(COMPARE_PROBABILITY);
    createEAttribute(compareProbabilityEClass, COMPARE_PROBABILITY__OPERATOR);
    createEAttribute(compareProbabilityEClass, COMPARE_PROBABILITY__VALUE);

    timeBoundEClass = createEClass(TIME_BOUND);
    createEAttribute(timeBoundEClass, TIME_BOUND__OPERATOR);
    createEAttribute(timeBoundEClass, TIME_BOUND__VALUE);
    createEAttribute(timeBoundEClass, TIME_BOUND__FROM);
    createEAttribute(timeBoundEClass, TIME_BOUND__TO);

    conjunctionEClass = createEClass(CONJUNCTION);
    createEReference(conjunctionEClass, CONJUNCTION__LEFT);

    disjunctionEClass = createEClass(DISJUNCTION);
    createEReference(disjunctionEClass, DISJUNCTION__LEFT);

    probabilityEClass = createEClass(PROBABILITY);
    createEReference(probabilityEClass, PROBABILITY__COMPARATOR);
    createEReference(probabilityEClass, PROBABILITY__PATH);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    commentEClass.getESuperTypes().add(this.getFragment());
    ruleEClass.getESuperTypes().add(this.getFragment());
    steadyStateEClass.getESuperTypes().add(this.getRule());
    quantifiedProbabilityEClass.getESuperTypes().add(this.getRule());
    booleanRuleEClass.getESuperTypes().add(this.getRule());
    stateFormulaEClass.getESuperTypes().add(this.getStateExpression());
    stateFormulaEClass.getESuperTypes().add(this.getRightStateExpression());
    stateEClass.getESuperTypes().add(this.getStateExpression());
    labelEClass.getESuperTypes().add(this.getStateExpression());
    booleanEClass.getESuperTypes().add(this.getStateExpression());
    untilEClass.getESuperTypes().add(this.getPathFormula());
    nextEClass.getESuperTypes().add(this.getPathFormula());
    futureEClass.getESuperTypes().add(this.getPathFormula());
    globallyEClass.getESuperTypes().add(this.getPathFormula());
    conjunctionEClass.getESuperTypes().add(this.getRightStateExpression());
    disjunctionEClass.getESuperTypes().add(this.getRightStateExpression());
    probabilityEClass.getESuperTypes().add(this.getStateExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(startEClass, Start.class, "Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStart_Rule(), this.getFragment(), null, "rule", null, 0, -1, Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fragmentEClass, Fragment.class, "Fragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComment_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(steadyStateEClass, SteadyState.class, "SteadyState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSteadyState_Bound(), this.getCompareProbability(), null, "bound", null, 0, 1, SteadyState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSteadyState_Value(), this.getStateFormula(), null, "value", null, 0, 1, SteadyState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(quantifiedProbabilityEClass, QuantifiedProbability.class, "QuantifiedProbability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQuantifiedProbability_Value(), this.getPathFormula(), null, "value", null, 0, 1, QuantifiedProbability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanRuleEClass, BooleanRule.class, "BooleanRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBooleanRule_Value(), this.getStateFormula(), null, "value", null, 0, 1, BooleanRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateFormulaEClass, StateFormula.class, "StateFormula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStateFormula_Left(), this.getStateExpression(), null, "left", null, 0, 1, StateFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateExpressionEClass, StateExpression.class, "StateExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rightStateExpressionEClass, RightStateExpression.class, "RightStateExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRightStateExpression_Right(), this.getRightStateExpression(), null, "right", null, 0, 1, RightStateExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getState_Value(), ecorePackage.getEString(), "value", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLabel_Value(), ecorePackage.getEString(), "value", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanEClass, de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Boolean.class, "Boolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBoolean_Value(), ecorePackage.getEString(), "value", null, 0, 1, de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Boolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pathFormulaEClass, PathFormula.class, "PathFormula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPathFormula_Bound(), this.getTimeBound(), null, "bound", null, 0, 1, PathFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(untilEClass, Until.class, "Until", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUntil_Left(), this.getStateFormula(), null, "left", null, 0, 1, Until.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUntil_Type(), ecorePackage.getEString(), "type", null, 0, 1, Until.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUntil_Right(), this.getStateFormula(), null, "right", null, 0, 1, Until.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nextEClass, Next.class, "Next", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNext_Value(), this.getStateFormula(), null, "value", null, 0, 1, Next.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(futureEClass, Future.class, "Future", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFuture_Value(), this.getStateFormula(), null, "value", null, 0, 1, Future.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(globallyEClass, Globally.class, "Globally", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGlobally_Value(), this.getStateFormula(), null, "value", null, 0, 1, Globally.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compareProbabilityEClass, CompareProbability.class, "CompareProbability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCompareProbability_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, CompareProbability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCompareProbability_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, CompareProbability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(timeBoundEClass, TimeBound.class, "TimeBound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTimeBound_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, TimeBound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeBound_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, TimeBound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeBound_From(), ecorePackage.getEDouble(), "from", null, 0, 1, TimeBound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeBound_To(), ecorePackage.getEDouble(), "to", null, 0, 1, TimeBound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conjunctionEClass, Conjunction.class, "Conjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConjunction_Left(), this.getRightStateExpression(), null, "left", null, 0, 1, Conjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(disjunctionEClass, Disjunction.class, "Disjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDisjunction_Left(), this.getRightStateExpression(), null, "left", null, 0, 1, Disjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(probabilityEClass, Probability.class, "Probability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProbability_Comparator(), this.getCompareProbability(), null, "comparator", null, 0, 1, Probability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProbability_Path(), this.getPathFormula(), null, "path", null, 0, 1, Probability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //PCTLPackageImpl
