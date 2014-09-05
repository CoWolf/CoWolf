/**
 */
package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl;

import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PCTLPackage;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.S;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Start;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.StateOrLabel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StartImpl#getStart <em>Start</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StartImpl#getLEFT <em>LEFT</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StartImpl#getRIGHT <em>RIGHT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StartImpl extends MinimalEObjectImpl.Container implements Start
{
  /**
   * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected S start;

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
  protected StateOrLabel right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StartImpl()
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
    return PCTLPackage.Literals.START;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public S getStart()
  {
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStart(S newStart, NotificationChain msgs)
  {
    S oldStart = start;
    start = newStart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PCTLPackage.START__START, oldStart, newStart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStart(S newStart)
  {
    if (newStart != start)
    {
      NotificationChain msgs = null;
      if (start != null)
        msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PCTLPackage.START__START, null, msgs);
      if (newStart != null)
        msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PCTLPackage.START__START, null, msgs);
      msgs = basicSetStart(newStart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PCTLPackage.START__START, newStart, newStart));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PCTLPackage.START__LEFT, oldLEFT, newLEFT);
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
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PCTLPackage.START__LEFT, null, msgs);
      if (newLEFT != null)
        msgs = ((InternalEObject)newLEFT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PCTLPackage.START__LEFT, null, msgs);
      msgs = basicSetLEFT(newLEFT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PCTLPackage.START__LEFT, newLEFT, newLEFT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateOrLabel getRIGHT()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRIGHT(StateOrLabel newRIGHT, NotificationChain msgs)
  {
    StateOrLabel oldRIGHT = right;
    right = newRIGHT;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PCTLPackage.START__RIGHT, oldRIGHT, newRIGHT);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRIGHT(StateOrLabel newRIGHT)
  {
    if (newRIGHT != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PCTLPackage.START__RIGHT, null, msgs);
      if (newRIGHT != null)
        msgs = ((InternalEObject)newRIGHT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PCTLPackage.START__RIGHT, null, msgs);
      msgs = basicSetRIGHT(newRIGHT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PCTLPackage.START__RIGHT, newRIGHT, newRIGHT));
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
      case PCTLPackage.START__START:
        return basicSetStart(null, msgs);
      case PCTLPackage.START__LEFT:
        return basicSetLEFT(null, msgs);
      case PCTLPackage.START__RIGHT:
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
      case PCTLPackage.START__START:
        return getStart();
      case PCTLPackage.START__LEFT:
        return getLEFT();
      case PCTLPackage.START__RIGHT:
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
      case PCTLPackage.START__START:
        setStart((S)newValue);
        return;
      case PCTLPackage.START__LEFT:
        setLEFT((StateOrLabel)newValue);
        return;
      case PCTLPackage.START__RIGHT:
        setRIGHT((StateOrLabel)newValue);
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
      case PCTLPackage.START__START:
        setStart((S)null);
        return;
      case PCTLPackage.START__LEFT:
        setLEFT((StateOrLabel)null);
        return;
      case PCTLPackage.START__RIGHT:
        setRIGHT((StateOrLabel)null);
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
      case PCTLPackage.START__START:
        return start != null;
      case PCTLPackage.START__LEFT:
        return left != null;
      case PCTLPackage.START__RIGHT:
        return right != null;
    }
    return super.eIsSet(featureID);
  }

} //StartImpl
