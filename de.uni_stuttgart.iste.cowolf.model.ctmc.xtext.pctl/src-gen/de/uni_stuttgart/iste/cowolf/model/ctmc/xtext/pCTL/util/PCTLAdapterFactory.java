/**
 */
package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.util;

import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PCTLPackage
 * @generated
 */
public class PCTLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PCTLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PCTLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PCTLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PCTLSwitch<Adapter> modelSwitch =
    new PCTLSwitch<Adapter>()
    {
      @Override
      public Adapter caseStart(Start object)
      {
        return createStartAdapter();
      }
      @Override
      public Adapter caseState(State object)
      {
        return createStateAdapter();
      }
      @Override
      public Adapter caseLabel(Label object)
      {
        return createLabelAdapter();
      }
      @Override
      public Adapter caseStateOrLabel(StateOrLabel object)
      {
        return createStateOrLabelAdapter();
      }
      @Override
      public Adapter caseS(S object)
      {
        return createSAdapter();
      }
      @Override
      public Adapter caseP1(P1 object)
      {
        return createP1Adapter();
      }
      @Override
      public Adapter caseP(P object)
      {
        return createPAdapter();
      }
      @Override
      public Adapter caseF(F object)
      {
        return createFAdapter();
      }
      @Override
      public Adapter caseG(G object)
      {
        return createGAdapter();
      }
      @Override
      public Adapter caseU(U object)
      {
        return createUAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Start <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Start
   * @generated
   */
  public Adapter createStartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.State
   * @generated
   */
  public Adapter createStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Label
   * @generated
   */
  public Adapter createLabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.StateOrLabel <em>State Or Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.StateOrLabel
   * @generated
   */
  public Adapter createStateOrLabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.S <em>S</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.S
   * @generated
   */
  public Adapter createSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.P1 <em>P1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.P1
   * @generated
   */
  public Adapter createP1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.P <em>P</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.P
   * @generated
   */
  public Adapter createPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.F <em>F</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.F
   * @generated
   */
  public Adapter createFAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.G <em>G</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.G
   * @generated
   */
  public Adapter createGAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.U <em>U</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.U
   * @generated
   */
  public Adapter createUAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PCTLAdapterFactory
