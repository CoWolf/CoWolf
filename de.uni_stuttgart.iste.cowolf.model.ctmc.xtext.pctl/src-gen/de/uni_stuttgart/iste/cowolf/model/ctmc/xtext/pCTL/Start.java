/**
 */
package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Start#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PCTLPackage#getStart()
 * @model
 * @generated
 */
public interface Start extends EObject
{
  /**
   * Returns the value of the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' containment reference.
   * @see #setStart(Rules)
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PCTLPackage#getStart_Start()
   * @model containment="true"
   * @generated
   */
  Rules getStart();

  /**
   * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Start#getStart <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' containment reference.
   * @see #getStart()
   * @generated
   */
  void setStart(Rules value);

} // Start
