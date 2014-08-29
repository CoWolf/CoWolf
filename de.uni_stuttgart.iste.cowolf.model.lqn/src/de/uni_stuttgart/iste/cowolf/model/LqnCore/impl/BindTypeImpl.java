/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.impl;

import de.uni_stuttgart.iste.cowolf.model.LqnCore.BindType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.ParameterType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.PortBindingType;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.ProcessorBindingType;

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
 * An implementation of the model object '<em><b>Bind Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.BindTypeImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.BindTypeImpl#getProcessorBinding <em>Processor Binding</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.LqnCore.impl.BindTypeImpl#getPortBinding <em>Port Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindTypeImpl extends IDBaseImpl implements BindType {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterType> parameter;

	/**
	 * The cached value of the '{@link #getProcessorBinding() <em>Processor Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessorBindingType> processorBinding;

	/**
	 * The cached value of the '{@link #getPortBinding() <em>Port Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<PortBindingType> portBinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LQNPackage.Literals.BIND_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterType> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<ParameterType>(ParameterType.class, this, LQNPackage.BIND_TYPE__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessorBindingType> getProcessorBinding() {
		if (processorBinding == null) {
			processorBinding = new EObjectContainmentEList<ProcessorBindingType>(ProcessorBindingType.class, this, LQNPackage.BIND_TYPE__PROCESSOR_BINDING);
		}
		return processorBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortBindingType> getPortBinding() {
		if (portBinding == null) {
			portBinding = new EObjectContainmentEList<PortBindingType>(PortBindingType.class, this, LQNPackage.BIND_TYPE__PORT_BINDING);
		}
		return portBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LQNPackage.BIND_TYPE__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case LQNPackage.BIND_TYPE__PROCESSOR_BINDING:
				return ((InternalEList<?>)getProcessorBinding()).basicRemove(otherEnd, msgs);
			case LQNPackage.BIND_TYPE__PORT_BINDING:
				return ((InternalEList<?>)getPortBinding()).basicRemove(otherEnd, msgs);
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
			case LQNPackage.BIND_TYPE__PARAMETER:
				return getParameter();
			case LQNPackage.BIND_TYPE__PROCESSOR_BINDING:
				return getProcessorBinding();
			case LQNPackage.BIND_TYPE__PORT_BINDING:
				return getPortBinding();
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
			case LQNPackage.BIND_TYPE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends ParameterType>)newValue);
				return;
			case LQNPackage.BIND_TYPE__PROCESSOR_BINDING:
				getProcessorBinding().clear();
				getProcessorBinding().addAll((Collection<? extends ProcessorBindingType>)newValue);
				return;
			case LQNPackage.BIND_TYPE__PORT_BINDING:
				getPortBinding().clear();
				getPortBinding().addAll((Collection<? extends PortBindingType>)newValue);
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
			case LQNPackage.BIND_TYPE__PARAMETER:
				getParameter().clear();
				return;
			case LQNPackage.BIND_TYPE__PROCESSOR_BINDING:
				getProcessorBinding().clear();
				return;
			case LQNPackage.BIND_TYPE__PORT_BINDING:
				getPortBinding().clear();
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
			case LQNPackage.BIND_TYPE__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case LQNPackage.BIND_TYPE__PROCESSOR_BINDING:
				return processorBinding != null && !processorBinding.isEmpty();
			case LQNPackage.BIND_TYPE__PORT_BINDING:
				return portBinding != null && !portBinding.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BindTypeImpl
