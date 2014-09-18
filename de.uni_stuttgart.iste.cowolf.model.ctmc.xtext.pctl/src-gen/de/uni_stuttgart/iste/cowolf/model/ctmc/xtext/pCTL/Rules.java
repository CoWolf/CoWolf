/**
 */
package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Rules#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PCTLPackage#getRules()
 * @model
 * @generated
 */
public interface Rules extends EObject
{
  /**
   * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' containment reference list.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PCTLPackage#getRules_Rule()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getRule();

} // Rules
