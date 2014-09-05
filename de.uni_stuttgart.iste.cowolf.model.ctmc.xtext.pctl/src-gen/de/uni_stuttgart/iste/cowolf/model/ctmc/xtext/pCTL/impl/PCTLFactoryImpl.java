/**
 */
package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl;

import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCTLFactoryImpl extends EFactoryImpl implements PCTLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PCTLFactory init()
  {
    try
    {
      PCTLFactory thePCTLFactory = (PCTLFactory)EPackage.Registry.INSTANCE.getEFactory(PCTLPackage.eNS_URI);
      if (thePCTLFactory != null)
      {
        return thePCTLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PCTLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PCTLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PCTLPackage.START: return createStart();
      case PCTLPackage.STATE: return createState();
      case PCTLPackage.LABEL: return createLabel();
      case PCTLPackage.STATE_OR_LABEL: return createStateOrLabel();
      case PCTLPackage.S: return createS();
      case PCTLPackage.P1: return createP1();
      case PCTLPackage.P: return createP();
      case PCTLPackage.F: return createF();
      case PCTLPackage.G: return createG();
      case PCTLPackage.U: return createU();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Start createStart()
  {
    StartImpl start = new StartImpl();
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Label createLabel()
  {
    LabelImpl label = new LabelImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateOrLabel createStateOrLabel()
  {
    StateOrLabelImpl stateOrLabel = new StateOrLabelImpl();
    return stateOrLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public S createS()
  {
    SImpl s = new SImpl();
    return s;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public P1 createP1()
  {
    P1Impl p1 = new P1Impl();
    return p1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public P createP()
  {
    PImpl p = new PImpl();
    return p;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public F createF()
  {
    FImpl f = new FImpl();
    return f;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public G createG()
  {
    GImpl g = new GImpl();
    return g;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public U createU()
  {
    UImpl u = new UImpl();
    return u;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PCTLPackage getPCTLPackage()
  {
    return (PCTLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PCTLPackage getPackage()
  {
    return PCTLPackage.eINSTANCE;
  }

} //PCTLFactoryImpl
