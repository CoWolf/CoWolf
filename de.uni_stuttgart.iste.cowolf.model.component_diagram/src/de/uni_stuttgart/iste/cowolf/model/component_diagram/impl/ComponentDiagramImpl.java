/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram.impl;

import de.uni_stuttgart.iste.cowolf.model.commonBase.CommonBasePackage;
import de.uni_stuttgart.iste.cowolf.model.commonBase.NameBase;

import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.IDBaseImpl;

import de.uni_stuttgart.iste.cowolf.model.component_diagram.Component;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentDiagram;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramemfPackage;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.Dependency;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.Interface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ComponentDiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ComponentDiagramImpl#getComponetContainer <em>Componet Container</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ComponentDiagramImpl#getInterfaceContainer <em>Interface Container</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ComponentDiagramImpl#getDependencyContainer <em>Dependency Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentDiagramImpl extends IDBaseImpl implements ComponentDiagram {
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
	 * The cached value of the '{@link #getComponetContainer() <em>Componet Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponetContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> componetContainer;

	/**
	 * The cached value of the '{@link #getInterfaceContainer() <em>Interface Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interfaceContainer;

	/**
	 * The cached value of the '{@link #getDependencyContainer() <em>Dependency Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> dependencyContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_diagramemfPackage.Literals.COMPONENT_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_diagramemfPackage.COMPONENT_DIAGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponetContainer() {
		if (componetContainer == null) {
			componetContainer = new EObjectContainmentWithInverseEList<Component>(Component.class, this, Component_diagramemfPackage.COMPONENT_DIAGRAM__COMPONET_CONTAINER, Component_diagramemfPackage.COMPONENT__DIAGRAM);
		}
		return componetContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getInterfaceContainer() {
		if (interfaceContainer == null) {
			interfaceContainer = new EObjectContainmentEList<Interface>(Interface.class, this, Component_diagramemfPackage.COMPONENT_DIAGRAM__INTERFACE_CONTAINER);
		}
		return interfaceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getDependencyContainer() {
		if (dependencyContainer == null) {
			dependencyContainer = new EObjectContainmentEList<Dependency>(Dependency.class, this, Component_diagramemfPackage.COMPONENT_DIAGRAM__DEPENDENCY_CONTAINER);
		}
		return dependencyContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Component_diagramemfPackage.COMPONENT_DIAGRAM__COMPONET_CONTAINER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponetContainer()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Component_diagramemfPackage.COMPONENT_DIAGRAM__COMPONET_CONTAINER:
				return ((InternalEList<?>)getComponetContainer()).basicRemove(otherEnd, msgs);
			case Component_diagramemfPackage.COMPONENT_DIAGRAM__INTERFACE_CONTAINER:
				return ((InternalEList<?>)getInterfaceContainer()).basicRemove(otherEnd, msgs);
			case Component_diagramemfPackage.COMPONENT_DIAGRAM__DEPENDENCY_CONTAINER:
				return ((InternalEList<?>)getDependencyContainer()).basicRemove(otherEnd, msgs);
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
			case Component_diagramemfPackage.COMPONENT_DIAGRAM__NAME:
				return getName();
			case Component_diagramemfPackage.COMPONENT_DIAGRAM__COMPONET_CONTAINER:
				return getComponetContainer();
			case Component_diagramemfPackage.COMPONENT_DIAGRAM__INTERFACE_CONTAINER:
				return getInterfaceContainer();
			case Component_diagramemfPackage.COMPONENT_DIAGRAM__DEPENDENCY_CONTAINER:
				return getDependencyContainer();
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
			case Component_diagramemfPackage.COMPONENT_DIAGRAM__NAME:
				setName((String)newValue);
				return;
			case Component_diagramemfPackage.COMPONENT_DIAGRAM__COMPONET_CONTAINER:
				getComponetContainer().clear();
				getComponetContainer().addAll((Collection<? extends Component>)newValue);
				return;
			case Component_diagramemfPackage.COMPONENT_DIAGRAM__INTERFACE_CONTAINER:
				getInterfaceContainer().clear();
				getInterfaceContainer().addAll((Collection<? extends Interface>)newValue);
				return;
			case Component_diagramemfPackage.COMPONENT_DIAGRAM__DEPENDENCY_CONTAINER:
				getDependencyContainer().clear();
				getDependencyContainer().addAll((Collection<? extends Dependency>)newValue);
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
			case Component_diagramemfPackage.COMPONENT_DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Component_diagramemfPackage.COMPONENT_DIAGRAM__COMPONET_CONTAINER:
				getComponetContainer().clear();
				return;
			case Component_diagramemfPackage.COMPONENT_DIAGRAM__INTERFACE_CONTAINER:
				getInterfaceContainer().clear();
				return;
			case Component_diagramemfPackage.COMPONENT_DIAGRAM__DEPENDENCY_CONTAINER:
				getDependencyContainer().clear();
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
			case Component_diagramemfPackage.COMPONENT_DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Component_diagramemfPackage.COMPONENT_DIAGRAM__COMPONET_CONTAINER:
				return componetContainer != null && !componetContainer.isEmpty();
			case Component_diagramemfPackage.COMPONENT_DIAGRAM__INTERFACE_CONTAINER:
				return interfaceContainer != null && !interfaceContainer.isEmpty();
			case Component_diagramemfPackage.COMPONENT_DIAGRAM__DEPENDENCY_CONTAINER:
				return dependencyContainer != null && !dependencyContainer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NameBase.class) {
			switch (derivedFeatureID) {
				case Component_diagramemfPackage.COMPONENT_DIAGRAM__NAME: return CommonBasePackage.NAME_BASE__NAME;
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
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NameBase.class) {
			switch (baseFeatureID) {
				case CommonBasePackage.NAME_BASE__NAME: return Component_diagramemfPackage.COMPONENT_DIAGRAM__NAME;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ComponentDiagramImpl
