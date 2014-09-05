/**
 */
package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl;

import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.P;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.PCTLPackage;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.S;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.Start;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.StateOrLabel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Or Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StateOrLabelImpl#getStart <em>Start</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StateOrLabelImpl#getLEFT <em>LEFT</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StateOrLabelImpl#getRIGHT <em>RIGHT</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pCTL.impl.StateOrLabelImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateOrLabelImpl extends SImpl implements StateOrLabel
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
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateOrLabelImpl()
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
    return PCTLPackage.Literals.STATE_OR_LABEL;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PCTLPackage.STATE_OR_LABEL__START, oldStart, newStart);
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
        msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PCTLPackage.STATE_OR_LABEL__START, null, msgs);
      if (newStart != null)
        msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PCTLPackage.STATE_OR_LABEL__START, null, msgs);
      msgs = basicSetStart(newStart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PCTLPackage.STATE_OR_LABEL__START, newStart, newStart));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PCTLPackage.STATE_OR_LABEL__LEFT, oldLEFT, newLEFT);
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
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PCTLPackage.STATE_OR_LABEL__LEFT, null, msgs);
      if (newLEFT != null)
        msgs = ((InternalEObject)newLEFT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PCTLPackage.STATE_OR_LABEL__LEFT, null, msgs);
      msgs = basicSetLEFT(newLEFT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PCTLPackage.STATE_OR_LABEL__LEFT, newLEFT, newLEFT));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PCTLPackage.STATE_OR_LABEL__RIGHT, oldRIGHT, newRIGHT);
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
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PCTLPackage.STATE_OR_LABEL__RIGHT, null, msgs);
      if (newRIGHT != null)
        msgs = ((InternalEObject)newRIGHT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PCTLPackage.STATE_OR_LABEL__RIGHT, null, msgs);
      msgs = basicSetRIGHT(newRIGHT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PCTLPackage.STATE_OR_LABEL__RIGHT, newRIGHT, newRIGHT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PCTLPackage.STATE_OR_LABEL__NAME, oldName, name));
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
      case PCTLPackage.STATE_OR_LABEL__START:
        return basicSetStart(null, msgs);
      case PCTLPackage.STATE_OR_LABEL__LEFT:
        return basicSetLEFT(null, msgs);
      case PCTLPackage.STATE_OR_LABEL__RIGHT:
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
      case PCTLPackage.STATE_OR_LABEL__START:
        return getStart();
      case PCTLPackage.STATE_OR_LABEL__LEFT:
        return getLEFT();
      case PCTLPackage.STATE_OR_LABEL__RIGHT:
        return getRIGHT();
      case PCTLPackage.STATE_OR_LABEL__NAME:
        return getName();
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
      case PCTLPackage.STATE_OR_LABEL__START:
        setStart((S)newValue);
        return;
      case PCTLPackage.STATE_OR_LABEL__LEFT:
        setLEFT((StateOrLabel)newValue);
        return;
      case PCTLPackage.STATE_OR_LABEL__RIGHT:
        setRIGHT((StateOrLabel)newValue);
        return;
      case PCTLPackage.STATE_OR_LABEL__NAME:
        setName((String)newValue);
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
      case PCTLPackage.STATE_OR_LABEL__START:
        setStart((S)null);
        return;
      case PCTLPackage.STATE_OR_LABEL__LEFT:
        setLEFT((StateOrLabel)null);
        return;
      case PCTLPackage.STATE_OR_LABEL__RIGHT:
        setRIGHT((StateOrLabel)null);
        return;
      case PCTLPackage.STATE_OR_LABEL__NAME:
        setName(NAME_EDEFAULT);
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
      case PCTLPackage.STATE_OR_LABEL__START:
        return start != null;
      case PCTLPackage.STATE_OR_LABEL__LEFT:
        return left != null;
      case PCTLPackage.STATE_OR_LABEL__RIGHT:
        return right != null;
      case PCTLPackage.STATE_OR_LABEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Start.class)
    {
      switch (derivedFeatureID)
      {
        case PCTLPackage.STATE_OR_LABEL__START: return PCTLPackage.START__START;
        case PCTLPackage.STATE_OR_LABEL__LEFT: return PCTLPackage.START__LEFT;
        case PCTLPackage.STATE_OR_LABEL__RIGHT: return PCTLPackage.START__RIGHT;
        default: return -1;
      }
    }
    if (baseClass == P.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Start.class)
    {
      switch (baseFeatureID)
      {
        case PCTLPackage.START__START: return PCTLPackage.STATE_OR_LABEL__START;
        case PCTLPackage.START__LEFT: return PCTLPackage.STATE_OR_LABEL__LEFT;
        case PCTLPackage.START__RIGHT: return PCTLPackage.STATE_OR_LABEL__RIGHT;
        default: return -1;
      }
    }
    if (baseClass == P.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //StateOrLabelImpl
