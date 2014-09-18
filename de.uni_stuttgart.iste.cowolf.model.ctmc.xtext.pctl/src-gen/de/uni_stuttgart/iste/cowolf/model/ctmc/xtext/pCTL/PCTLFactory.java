/**
 */
package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PCTLPackage
 * @generated
 */
public interface PCTLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PCTLFactory eINSTANCE = de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Start</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Start</em>'.
   * @generated
   */
  Start createStart();

  /**
   * Returns a new object of class '<em>Rules</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rules</em>'.
   * @generated
   */
  Rules createRules();

  /**
   * Returns a new object of class '<em>Commented Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Commented Rule</em>'.
   * @generated
   */
  CommentedRule createCommentedRule();

  /**
   * Returns a new object of class '<em>Pctl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pctl</em>'.
   * @generated
   */
  Pctl createPctl();

  /**
   * Returns a new object of class '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State</em>'.
   * @generated
   */
  State createState();

  /**
   * Returns a new object of class '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label</em>'.
   * @generated
   */
  Label createLabel();

  /**
   * Returns a new object of class '<em>Atomic</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atomic</em>'.
   * @generated
   */
  Atomic createAtomic();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Steady State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Steady State</em>'.
   * @generated
   */
  SteadyState createSteadyState();

  /**
   * Returns a new object of class '<em>Quantified Probability</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quantified Probability</em>'.
   * @generated
   */
  QuantifiedProbability createQuantifiedProbability();

  /**
   * Returns a new object of class '<em>Probability</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Probability</em>'.
   * @generated
   */
  Probability createProbability();

  /**
   * Returns a new object of class '<em>Until</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Until</em>'.
   * @generated
   */
  Until createUntil();

  /**
   * Returns a new object of class '<em>Next</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Next</em>'.
   * @generated
   */
  Next createNext();

  /**
   * Returns a new object of class '<em>Future</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Future</em>'.
   * @generated
   */
  Future createFuture();

  /**
   * Returns a new object of class '<em>Globally</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Globally</em>'.
   * @generated
   */
  Globally createGlobally();

  /**
   * Returns a new object of class '<em>Implication</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Implication</em>'.
   * @generated
   */
  Implication createImplication();

  /**
   * Returns a new object of class '<em>Conjunction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conjunction</em>'.
   * @generated
   */
  Conjunction createConjunction();

  /**
   * Returns a new object of class '<em>Disjunction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Disjunction</em>'.
   * @generated
   */
  Disjunction createDisjunction();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PCTLPackage getPCTLPackage();

} //PCTLFactory
