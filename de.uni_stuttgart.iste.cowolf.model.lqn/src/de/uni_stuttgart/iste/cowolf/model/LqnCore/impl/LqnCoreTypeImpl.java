/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.impl;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnCoreType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.SlotType;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lqn Core Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LqnCoreTypeImpl#getProcessor <em>Processor</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.LqnCoreTypeImpl#getSlot <em>Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LqnCoreTypeImpl extends IDBaseImpl implements LqnCoreType {
	/**
	 * The cached value of the '{@link #getProcessor() <em>Processor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessorType> processor;

	/**
	 * The cached value of the '{@link #getSlot() <em>Slot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlot()
	 * @generated
	 * @ordered
	 */
	protected EList<SlotType> slot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LqnCoreTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LQNPackage.Literals.LQN_CORE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessorType> getProcessor() {
		if (processor == null) {
			processor = new EObjectContainmentEList<ProcessorType>(ProcessorType.class, this, LQNPackage.LQN_CORE_TYPE__PROCESSOR);
		}
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SlotType> getSlot() {
		if (slot == null) {
			slot = new EObjectContainmentEList<SlotType>(SlotType.class, this, LQNPackage.LQN_CORE_TYPE__SLOT);
		}
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LQNPackage.LQN_CORE_TYPE__PROCESSOR:
				return ((InternalEList<?>)getProcessor()).basicRemove(otherEnd, msgs);
			case LQNPackage.LQN_CORE_TYPE__SLOT:
				return ((InternalEList<?>)getSlot()).basicRemove(otherEnd, msgs);
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
			case LQNPackage.LQN_CORE_TYPE__PROCESSOR:
				return getProcessor();
			case LQNPackage.LQN_CORE_TYPE__SLOT:
				return getSlot();
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
			case LQNPackage.LQN_CORE_TYPE__PROCESSOR:
				getProcessor().clear();
				getProcessor().addAll((Collection<? extends ProcessorType>)newValue);
				return;
			case LQNPackage.LQN_CORE_TYPE__SLOT:
				getSlot().clear();
				getSlot().addAll((Collection<? extends SlotType>)newValue);
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
			case LQNPackage.LQN_CORE_TYPE__PROCESSOR:
				getProcessor().clear();
				return;
			case LQNPackage.LQN_CORE_TYPE__SLOT:
				getSlot().clear();
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
			case LQNPackage.LQN_CORE_TYPE__PROCESSOR:
				return processor != null && !processor.isEmpty();
			case LQNPackage.LQN_CORE_TYPE__SLOT:
				return slot != null && !slot.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LqnCoreTypeImpl
