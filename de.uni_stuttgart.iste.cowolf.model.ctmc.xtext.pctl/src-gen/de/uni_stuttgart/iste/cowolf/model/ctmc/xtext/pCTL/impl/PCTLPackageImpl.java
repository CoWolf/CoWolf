/**
 */
package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl;

import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Atomic;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.CommentedRule;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Conjunction;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Disjunction;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Expression;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Future;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Globally;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Label;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Next;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PCTLFactory;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PCTLPackage;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Pctl;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Probability;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.QuantifiedProbability;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Start;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.State;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.SteadyState;
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
  private EClass commentedRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pctlEClass = null;

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
  private EClass atomicEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

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
  private EClass probabilityEClass = null;

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
  private EClass conjunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass disjunctionEClass = null;

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
  public EReference getStart_Start()
  {
    return (EReference)startEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommentedRule()
  {
    return commentedRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommentedRule_Comment()
  {
    return (EAttribute)commentedRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommentedRule_Rule()
  {
    return (EReference)commentedRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPctl()
  {
    return pctlEClass;
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
  public EClass getLabel()
  {
    return labelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtomic()
  {
    return atomicEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtomic_Name()
  {
    return (EAttribute)atomicEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Left()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Right()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(1);
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
  public EClass getQuantifiedProbability()
  {
    return quantifiedProbabilityEClass;
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
  public EClass getUntil()
  {
    return untilEClass;
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
  public EClass getFuture()
  {
    return futureEClass;
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
  public EClass getConjunction()
  {
    return conjunctionEClass;
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
    createEReference(startEClass, START__START);

    commentedRuleEClass = createEClass(COMMENTED_RULE);
    createEAttribute(commentedRuleEClass, COMMENTED_RULE__COMMENT);
    createEReference(commentedRuleEClass, COMMENTED_RULE__RULE);

    pctlEClass = createEClass(PCTL);

    stateEClass = createEClass(STATE);

    labelEClass = createEClass(LABEL);

    atomicEClass = createEClass(ATOMIC);
    createEAttribute(atomicEClass, ATOMIC__NAME);

    expressionEClass = createEClass(EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__LEFT);
    createEReference(expressionEClass, EXPRESSION__RIGHT);

    steadyStateEClass = createEClass(STEADY_STATE);

    quantifiedProbabilityEClass = createEClass(QUANTIFIED_PROBABILITY);

    probabilityEClass = createEClass(PROBABILITY);

    untilEClass = createEClass(UNTIL);

    nextEClass = createEClass(NEXT);

    futureEClass = createEClass(FUTURE);

    globallyEClass = createEClass(GLOBALLY);

    conjunctionEClass = createEClass(CONJUNCTION);

    disjunctionEClass = createEClass(DISJUNCTION);
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
    stateEClass.getESuperTypes().add(this.getAtomic());
    labelEClass.getESuperTypes().add(this.getAtomic());
    atomicEClass.getESuperTypes().add(this.getExpression());
    expressionEClass.getESuperTypes().add(this.getPctl());
    expressionEClass.getESuperTypes().add(this.getSteadyState());
    expressionEClass.getESuperTypes().add(this.getQuantifiedProbability());
    expressionEClass.getESuperTypes().add(this.getProbability());
    steadyStateEClass.getESuperTypes().add(this.getPctl());
    quantifiedProbabilityEClass.getESuperTypes().add(this.getPctl());
    untilEClass.getESuperTypes().add(this.getExpression());
    nextEClass.getESuperTypes().add(this.getExpression());
    futureEClass.getESuperTypes().add(this.getExpression());
    globallyEClass.getESuperTypes().add(this.getExpression());
    conjunctionEClass.getESuperTypes().add(this.getExpression());
    disjunctionEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(startEClass, Start.class, "Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStart_Start(), ecorePackage.getEObject(), null, "start", null, 0, 1, Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commentedRuleEClass, CommentedRule.class, "CommentedRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCommentedRule_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, CommentedRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommentedRule_Rule(), this.getPctl(), null, "rule", null, 0, 1, CommentedRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pctlEClass, Pctl.class, "Pctl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(atomicEClass, Atomic.class, "Atomic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAtomic_Name(), ecorePackage.getEString(), "name", null, 0, 1, Atomic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_Left(), this.getProbability(), null, "left", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_Right(), this.getExpression(), null, "right", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(steadyStateEClass, SteadyState.class, "SteadyState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(quantifiedProbabilityEClass, QuantifiedProbability.class, "QuantifiedProbability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(probabilityEClass, Probability.class, "Probability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(untilEClass, Until.class, "Until", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nextEClass, Next.class, "Next", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(futureEClass, Future.class, "Future", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(globallyEClass, Globally.class, "Globally", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(conjunctionEClass, Conjunction.class, "Conjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(disjunctionEClass, Disjunction.class, "Disjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //PCTLPackageImpl
