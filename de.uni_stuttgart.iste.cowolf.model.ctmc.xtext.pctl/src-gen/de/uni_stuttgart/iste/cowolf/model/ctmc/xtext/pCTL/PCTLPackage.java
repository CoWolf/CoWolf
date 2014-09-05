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
   * The feature id for the '<em><b>LEFT</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START__LEFT = 1;

  /**
   * The feature id for the '<em><b>RIGHT</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START__RIGHT = 2;

  /**
   * The number of structural features of the '<em>Start</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.SImpl <em>S</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.SImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getS()
   * @generated
   */
  int S = 4;

  /**
   * The number of structural features of the '<em>S</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int S_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StateOrLabelImpl <em>State Or Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StateOrLabelImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getStateOrLabel()
   * @generated
   */
  int STATE_OR_LABEL = 3;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_OR_LABEL__START = S_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>LEFT</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_OR_LABEL__LEFT = S_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>RIGHT</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_OR_LABEL__RIGHT = S_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_OR_LABEL__NAME = S_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>State Or Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_OR_LABEL_FEATURE_COUNT = S_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StateImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getState()
   * @generated
   */
  int STATE = 1;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__START = STATE_OR_LABEL__START;

  /**
   * The feature id for the '<em><b>LEFT</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__LEFT = STATE_OR_LABEL__LEFT;

  /**
   * The feature id for the '<em><b>RIGHT</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__RIGHT = STATE_OR_LABEL__RIGHT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = STATE_OR_LABEL__NAME;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = STATE_OR_LABEL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.LabelImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getLabel()
   * @generated
   */
  int LABEL = 2;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__START = STATE_OR_LABEL__START;

  /**
   * The feature id for the '<em><b>LEFT</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__LEFT = STATE_OR_LABEL__LEFT;

  /**
   * The feature id for the '<em><b>RIGHT</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__RIGHT = STATE_OR_LABEL__RIGHT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__NAME = STATE_OR_LABEL__NAME;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = STATE_OR_LABEL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PImpl <em>P</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getP()
   * @generated
   */
  int P = 5;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int P__START = START__START;

  /**
   * The feature id for the '<em><b>LEFT</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int P__LEFT = START__LEFT;

  /**
   * The feature id for the '<em><b>RIGHT</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int P__RIGHT = START__RIGHT;

  /**
   * The number of structural features of the '<em>P</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int P_FEATURE_COUNT = START_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PGImpl <em>PG</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PGImpl
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getPG()
   * @generated
   */
  int PG = 6;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PG__START = START__START;

  /**
   * The feature id for the '<em><b>LEFT</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PG__LEFT = START__LEFT;

  /**
   * The feature id for the '<em><b>RIGHT</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PG__RIGHT = START__RIGHT;

  /**
   * The number of structural features of the '<em>PG</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PG_FEATURE_COUNT = START_FEATURE_COUNT + 0;


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
   * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Start#getLEFT <em>LEFT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>LEFT</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Start#getLEFT()
   * @see #getStart()
   * @generated
   */
  EReference getStart_LEFT();

  /**
   * Returns the meta object for the containment reference '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Start#getRIGHT <em>RIGHT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>RIGHT</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Start#getRIGHT()
   * @see #getStart()
   * @generated
   */
  EReference getStart_RIGHT();

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
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.StateOrLabel <em>State Or Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Or Label</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.StateOrLabel
   * @generated
   */
  EClass getStateOrLabel();

  /**
   * Returns the meta object for the attribute '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.StateOrLabel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.StateOrLabel#getName()
   * @see #getStateOrLabel()
   * @generated
   */
  EAttribute getStateOrLabel_Name();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.S <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>S</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.S
   * @generated
   */
  EClass getS();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.P <em>P</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>P</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.P
   * @generated
   */
  EClass getP();

  /**
   * Returns the meta object for class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PG <em>PG</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PG</em>'.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PG
   * @generated
   */
  EClass getPG();

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
     * The meta object literal for the '<em><b>LEFT</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference START__LEFT = eINSTANCE.getStart_LEFT();

    /**
     * The meta object literal for the '<em><b>RIGHT</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference START__RIGHT = eINSTANCE.getStart_RIGHT();

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
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StateOrLabelImpl <em>State Or Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StateOrLabelImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getStateOrLabel()
     * @generated
     */
    EClass STATE_OR_LABEL = eINSTANCE.getStateOrLabel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_OR_LABEL__NAME = eINSTANCE.getStateOrLabel_Name();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.SImpl <em>S</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.SImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getS()
     * @generated
     */
    EClass S = eINSTANCE.getS();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PImpl <em>P</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getP()
     * @generated
     */
    EClass P = eINSTANCE.getP();

    /**
     * The meta object literal for the '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PGImpl <em>PG</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PGImpl
     * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.PCTLPackageImpl#getPG()
     * @generated
     */
    EClass PG = eINSTANCE.getPG();

  }

} //PCTLPackage
