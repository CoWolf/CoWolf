/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.impl;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.BindType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.InterfaceType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.SlotType;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.SlotTypeImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.SlotTypeImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.SlotTypeImpl#getBindTarget <em>Bind Target</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.SlotTypeImpl#getReplicNum <em>Replic Num</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlotTypeImpl extends IDBaseImpl implements SlotType {
	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected InterfaceType interface_;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<BindType> binding;

	/**
	 * The default value of the '{@link #getBindTarget() <em>Bind Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String BIND_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBindTarget() <em>Bind Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindTarget()
	 * @generated
	 * @ordered
	 */
	protected String bindTarget = BIND_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplicNum() <em>Replic Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicNum()
	 * @generated
	 * @ordered
	 */
	protected static final int REPLIC_NUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReplicNum() <em>Replic Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicNum()
	 * @generated
	 * @ordered
	 */
	protected int replicNum = REPLIC_NUM_EDEFAULT;

	/**
	 * This is true if the Replic Num attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean replicNumESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlotTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LQNPackage.Literals.SLOT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceType getInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(InterfaceType newInterface, NotificationChain msgs) {
		InterfaceType oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LQNPackage.SLOT_TYPE__INTERFACE, oldInterface, newInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(InterfaceType newInterface) {
		if (newInterface != interface_) {
			NotificationChain msgs = null;
			if (interface_ != null)
				msgs = ((InternalEObject)interface_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LQNPackage.SLOT_TYPE__INTERFACE, null, msgs);
			if (newInterface != null)
				msgs = ((InternalEObject)newInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LQNPackage.SLOT_TYPE__INTERFACE, null, msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.SLOT_TYPE__INTERFACE, newInterface, newInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BindType> getBinding() {
		if (binding == null) {
			binding = new EObjectContainmentEList<BindType>(BindType.class, this, LQNPackage.SLOT_TYPE__BINDING);
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBindTarget() {
		return bindTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindTarget(String newBindTarget) {
		String oldBindTarget = bindTarget;
		bindTarget = newBindTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.SLOT_TYPE__BIND_TARGET, oldBindTarget, bindTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReplicNum() {
		return replicNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplicNum(int newReplicNum) {
		int oldReplicNum = replicNum;
		replicNum = newReplicNum;
		boolean oldReplicNumESet = replicNumESet;
		replicNumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LQNPackage.SLOT_TYPE__REPLIC_NUM, oldReplicNum, replicNum, !oldReplicNumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReplicNum() {
		int oldReplicNum = replicNum;
		boolean oldReplicNumESet = replicNumESet;
		replicNum = REPLIC_NUM_EDEFAULT;
		replicNumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LQNPackage.SLOT_TYPE__REPLIC_NUM, oldReplicNum, REPLIC_NUM_EDEFAULT, oldReplicNumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReplicNum() {
		return replicNumESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LQNPackage.SLOT_TYPE__INTERFACE:
				return basicSetInterface(null, msgs);
			case LQNPackage.SLOT_TYPE__BINDING:
				return ((InternalEList<?>)getBinding()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LQNPackage.SLOT_TYPE__INTERFACE:
				return getInterface();
			case LQNPackage.SLOT_TYPE__BINDING:
				return getBinding();
			case LQNPackage.SLOT_TYPE__BIND_TARGET:
				return getBindTarget();
			case LQNPackage.SLOT_TYPE__REPLIC_NUM:
				return getReplicNum();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LQNPackage.SLOT_TYPE__INTERFACE:
				setInterface((InterfaceType)newValue);
				return;
			case LQNPackage.SLOT_TYPE__BINDING:
				getBinding().clear();
				getBinding().addAll((Collection<? extends BindType>)newValue);
				return;
			case LQNPackage.SLOT_TYPE__BIND_TARGET:
				setBindTarget((String)newValue);
				return;
			case LQNPackage.SLOT_TYPE__REPLIC_NUM:
				setReplicNum((Integer)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case LQNPackage.SLOT_TYPE__INTERFACE:
				setInterface((InterfaceType)null);
				return;
			case LQNPackage.SLOT_TYPE__BINDING:
				getBinding().clear();
				return;
			case LQNPackage.SLOT_TYPE__BIND_TARGET:
				setBindTarget(BIND_TARGET_EDEFAULT);
				return;
			case LQNPackage.SLOT_TYPE__REPLIC_NUM:
				unsetReplicNum();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LQNPackage.SLOT_TYPE__INTERFACE:
				return interface_ != null;
			case LQNPackage.SLOT_TYPE__BINDING:
				return binding != null && !binding.isEmpty();
			case LQNPackage.SLOT_TYPE__BIND_TARGET:
				return BIND_TARGET_EDEFAULT == null ? bindTarget != null : !BIND_TARGET_EDEFAULT.equals(bindTarget);
			case LQNPackage.SLOT_TYPE__REPLIC_NUM:
				return isSetReplicNum();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (bindTarget: ");
		result.append(bindTarget);
		result.append(", replicNum: ");
		if (replicNumESet) result.append(replicNum); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SlotTypeImpl
