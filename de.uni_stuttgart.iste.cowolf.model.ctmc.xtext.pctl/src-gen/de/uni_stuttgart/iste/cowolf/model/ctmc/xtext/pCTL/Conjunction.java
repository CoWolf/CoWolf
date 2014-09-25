/**
 */
package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conjunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Conjunction#getLeft <em>Left</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PCTLPackage#getConjunction()
 * @model
 * @generated
 */
public interface Conjunction extends RightStateExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(RightStateExpression)
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PCTLPackage#getConjunction_Left()
   * @model containment="true"
   * @generated
   */
  RightStateExpression getLeft();

  /**
   * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Conjunction#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(RightStateExpression value);

} // Conjunction
