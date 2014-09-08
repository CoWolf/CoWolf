/**
 */
package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>U</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.U#getLEFT <em>LEFT</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.U#getRIGHT <em>RIGHT</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PCTLPackage#getU()
 * @model
 * @generated
 */
public interface U extends P1, P
{
  /**
   * Returns the value of the '<em><b>LEFT</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>LEFT</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>LEFT</em>' containment reference.
   * @see #setLEFT(StateOrLabel)
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PCTLPackage#getU_LEFT()
   * @model containment="true"
   * @generated
   */
  StateOrLabel getLEFT();

  /**
   * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.U#getLEFT <em>LEFT</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>LEFT</em>' containment reference.
   * @see #getLEFT()
   * @generated
   */
  void setLEFT(StateOrLabel value);

  /**
   * Returns the value of the '<em><b>RIGHT</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>RIGHT</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>RIGHT</em>' containment reference.
   * @see #setRIGHT(StateOrLabel)
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PCTLPackage#getU_RIGHT()
   * @model containment="true"
   * @generated
   */
  StateOrLabel getRIGHT();

  /**
   * Sets the value of the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.U#getRIGHT <em>RIGHT</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>RIGHT</em>' containment reference.
   * @see #getRIGHT()
   * @generated
   */
  void setRIGHT(StateOrLabel value);

} // U
