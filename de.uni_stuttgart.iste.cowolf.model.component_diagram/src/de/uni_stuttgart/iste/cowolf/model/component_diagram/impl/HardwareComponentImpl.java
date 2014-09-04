/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram.impl;

import de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.HardwareComponent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.HardwareComponentImpl#getPowerSupply <em>Power Supply</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HardwareComponentImpl extends ComponentTypeImpl implements HardwareComponent {
	/**
	 * The default value of the '{@link #getPowerSupply() <em>Power Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSupply()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_SUPPLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPowerSupply() <em>Power Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSupply()
	 * @generated
	 * @ordered
	 */
	protected String powerSupply = POWER_SUPPLY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_diagramPackage.Literals.HARDWARE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPowerSupply() {
		return powerSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerSupply(String newPowerSupply) {
		String oldPowerSupply = powerSupply;
		powerSupply = newPowerSupply;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_diagramPackage.HARDWARE_COMPONENT__POWER_SUPPLY, oldPowerSupply, powerSupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Component_diagramPackage.HARDWARE_COMPONENT__POWER_SUPPLY:
				return getPowerSupply();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Component_diagramPackage.HARDWARE_COMPONENT__POWER_SUPPLY:
				setPowerSupply((String)newValue);
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
			case Component_diagramPackage.HARDWARE_COMPONENT__POWER_SUPPLY:
				setPowerSupply(POWER_SUPPLY_EDEFAULT);
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
			case Component_diagramPackage.HARDWARE_COMPONENT__POWER_SUPPLY:
				return POWER_SUPPLY_EDEFAULT == null ? powerSupply != null : !POWER_SUPPLY_EDEFAULT.equals(powerSupply);
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
		result.append(" (powerSupply: ");
		result.append(powerSupply);
		result.append(')');
		return result.toString();
	}

} //HardwareComponentImpl
