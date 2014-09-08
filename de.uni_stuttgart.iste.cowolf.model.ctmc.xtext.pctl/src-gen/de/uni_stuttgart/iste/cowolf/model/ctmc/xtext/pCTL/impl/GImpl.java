/**
 */
package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl;

import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.G;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.P;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PCTLPackage;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.StateOrLabel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>G</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.GImpl#getLEFT <em>LEFT</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.GImpl#getRIGHT <em>RIGHT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GImpl extends P1Impl implements G
{
  /**
   * The cached value of the '{@link #getLEFT() <em>LEFT</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLEFT()
   * @generated
   * @ordered
   */
  protected StateOrLabel left;

  /**
   * The cached value of the '{@link #getRIGHT() <em>RIGHT</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRIGHT()
   * @generated
   * @ordered
   */
  protected P right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PCTLPackage.Literals.G;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateOrLabel getLEFT()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLEFT(StateOrLabel newLEFT, NotificationChain msgs)
  {
    StateOrLabel oldLEFT = left;
    left = newLEFT;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PCTLPackage.G__LEFT, oldLEFT, newLEFT);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLEFT(StateOrLabel newLEFT)
  {
    if (newLEFT != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PCTLPackage.G__LEFT, null, msgs);
      if (newLEFT != null)
        msgs = ((InternalEObject)newLEFT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PCTLPackage.G__LEFT, null, msgs);
      msgs = basicSetLEFT(newLEFT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PCTLPackage.G__LEFT, newLEFT, newLEFT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public P getRIGHT()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRIGHT(P newRIGHT, NotificationChain msgs)
  {
    P oldRIGHT = right;
    right = newRIGHT;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PCTLPackage.G__RIGHT, oldRIGHT, newRIGHT);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRIGHT(P newRIGHT)
  {
    if (newRIGHT != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PCTLPackage.G__RIGHT, null, msgs);
      if (newRIGHT != null)
        msgs = ((InternalEObject)newRIGHT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PCTLPackage.G__RIGHT, null, msgs);
      msgs = basicSetRIGHT(newRIGHT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PCTLPackage.G__RIGHT, newRIGHT, newRIGHT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PCTLPackage.G__LEFT:
        return basicSetLEFT(null, msgs);
      case PCTLPackage.G__RIGHT:
        return basicSetRIGHT(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PCTLPackage.G__LEFT:
        return getLEFT();
      case PCTLPackage.G__RIGHT:
        return getRIGHT();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PCTLPackage.G__LEFT:
        setLEFT((StateOrLabel)newValue);
        return;
      case PCTLPackage.G__RIGHT:
        setRIGHT((P)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PCTLPackage.G__LEFT:
        setLEFT((StateOrLabel)null);
        return;
      case PCTLPackage.G__RIGHT:
        setRIGHT((P)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PCTLPackage.G__LEFT:
        return left != null;
      case PCTLPackage.G__RIGHT:
        return right != null;
    }
    return super.eIsSet(featureID);
  }

} //GImpl
