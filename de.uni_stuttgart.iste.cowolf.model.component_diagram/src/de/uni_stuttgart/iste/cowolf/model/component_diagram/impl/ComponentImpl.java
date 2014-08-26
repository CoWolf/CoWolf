/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram.impl;

import de.uni_stuttgart.iste.cowolf.model.commonBase.CommonBasePackage;
import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;
import de.uni_stuttgart.iste.cowolf.model.commonBase.impl.NameBaseImpl;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.Component;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentDiagram;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.ComponentStereotype;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.Dependency;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.Port;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ComponentImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ComponentImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ComponentImpl#isIsIndirectlyInstantiated <em>Is Indirectly Instantiated</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ComponentImpl#getComponentContainer <em>Component Container</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ComponentImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ComponentImpl#getRealization <em>Realization</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ComponentImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.component_diagram.impl.ComponentImpl#getOnDepend <em>On Depend</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends NameBaseImpl implements Component {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected static final ComponentStereotype STEREOTYPE_EDEFAULT = ComponentStereotype.COMPONENT;

	/**
	 * The cached value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected ComponentStereotype stereotype = STEREOTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsIndirectlyInstantiated() <em>Is Indirectly Instantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIndirectlyInstantiated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INDIRECTLY_INSTANTIATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsIndirectlyInstantiated() <em>Is Indirectly Instantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIndirectlyInstantiated()
	 * @generated
	 * @ordered
	 */
	protected boolean isIndirectlyInstantiated = IS_INDIRECTLY_INSTANTIATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponentContainer() <em>Component Container</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> componentContainer;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * The cached value of the '{@link #getRealization() <em>Realization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealization()
	 * @generated
	 * @ordered
	 */
	protected Component realization;

	/**
	 * The cached value of the '{@link #getOnDepend() <em>On Depend</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDepend()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> onDepend;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_diagramPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_diagramPackage.COMPONENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentStereotype getStereotype() {
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStereotype(ComponentStereotype newStereotype) {
		ComponentStereotype oldStereotype = stereotype;
		stereotype = newStereotype == null ? STEREOTYPE_EDEFAULT : newStereotype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_diagramPackage.COMPONENT__STEREOTYPE, oldStereotype, stereotype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsIndirectlyInstantiated() {
		return isIndirectlyInstantiated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIndirectlyInstantiated(boolean newIsIndirectlyInstantiated) {
		boolean oldIsIndirectlyInstantiated = isIndirectlyInstantiated;
		isIndirectlyInstantiated = newIsIndirectlyInstantiated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_diagramPackage.COMPONENT__IS_INDIRECTLY_INSTANTIATED, oldIsIndirectlyInstantiated, isIndirectlyInstantiated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponentContainer() {
		if (componentContainer == null) {
			componentContainer = new EObjectResolvingEList<Component>(Component.class, this, Component_diagramPackage.COMPONENT__COMPONENT_CONTAINER);
		}
		return componentContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentWithInverseEList<Port>(Port.class, this, Component_diagramPackage.COMPONENT__PORTS, Component_diagramPackage.PORT__PORT_HOST);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getRealization() {
		if (realization != null && realization.eIsProxy()) {
			InternalEObject oldRealization = (InternalEObject)realization;
			realization = (Component)eResolveProxy(oldRealization);
			if (realization != oldRealization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Component_diagramPackage.COMPONENT__REALIZATION, oldRealization, realization));
			}
		}
		return realization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetRealization() {
		return realization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealization(Component newRealization) {
		Component oldRealization = realization;
		realization = newRealization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_diagramPackage.COMPONENT__REALIZATION, oldRealization, realization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDiagram getDiagram() {
		if (eContainerFeatureID() != Component_diagramPackage.COMPONENT__DIAGRAM) return null;
		return (ComponentDiagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagram(ComponentDiagram newDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDiagram, Component_diagramPackage.COMPONENT__DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram(ComponentDiagram newDiagram) {
		if (newDiagram != eInternalContainer() || (eContainerFeatureID() != Component_diagramPackage.COMPONENT__DIAGRAM && newDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDiagram != null)
				msgs = ((InternalEObject)newDiagram).eInverseAdd(this, Component_diagramPackage.COMPONENT_DIAGRAM__COMPONET_CONTAINER, ComponentDiagram.class, msgs);
			msgs = basicSetDiagram(newDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_diagramPackage.COMPONENT__DIAGRAM, newDiagram, newDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getOnDepend() {
		if (onDepend == null) {
			onDepend = new EObjectWithInverseResolvingEList<Dependency>(Dependency.class, this, Component_diagramPackage.COMPONENT__ON_DEPEND, Component_diagramPackage.DEPENDENCY__SUPPLIER);
		}
		return onDepend;
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
			case Component_diagramPackage.COMPONENT__PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPorts()).basicAdd(otherEnd, msgs);
			case Component_diagramPackage.COMPONENT__DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDiagram((ComponentDiagram)otherEnd, msgs);
			case Component_diagramPackage.COMPONENT__ON_DEPEND:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOnDepend()).basicAdd(otherEnd, msgs);
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
			case Component_diagramPackage.COMPONENT__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case Component_diagramPackage.COMPONENT__DIAGRAM:
				return basicSetDiagram(null, msgs);
			case Component_diagramPackage.COMPONENT__ON_DEPEND:
				return ((InternalEList<?>)getOnDepend()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Component_diagramPackage.COMPONENT__DIAGRAM:
				return eInternalContainer().eInverseRemove(this, Component_diagramPackage.COMPONENT_DIAGRAM__COMPONET_CONTAINER, ComponentDiagram.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Component_diagramPackage.COMPONENT__ID:
				return getId();
			case Component_diagramPackage.COMPONENT__STEREOTYPE:
				return getStereotype();
			case Component_diagramPackage.COMPONENT__IS_INDIRECTLY_INSTANTIATED:
				return isIsIndirectlyInstantiated();
			case Component_diagramPackage.COMPONENT__COMPONENT_CONTAINER:
				return getComponentContainer();
			case Component_diagramPackage.COMPONENT__PORTS:
				return getPorts();
			case Component_diagramPackage.COMPONENT__REALIZATION:
				if (resolve) return getRealization();
				return basicGetRealization();
			case Component_diagramPackage.COMPONENT__DIAGRAM:
				return getDiagram();
			case Component_diagramPackage.COMPONENT__ON_DEPEND:
				return getOnDepend();
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
			case Component_diagramPackage.COMPONENT__ID:
				setId((String)newValue);
				return;
			case Component_diagramPackage.COMPONENT__STEREOTYPE:
				setStereotype((ComponentStereotype)newValue);
				return;
			case Component_diagramPackage.COMPONENT__IS_INDIRECTLY_INSTANTIATED:
				setIsIndirectlyInstantiated((Boolean)newValue);
				return;
			case Component_diagramPackage.COMPONENT__COMPONENT_CONTAINER:
				getComponentContainer().clear();
				getComponentContainer().addAll((Collection<? extends Component>)newValue);
				return;
			case Component_diagramPackage.COMPONENT__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case Component_diagramPackage.COMPONENT__REALIZATION:
				setRealization((Component)newValue);
				return;
			case Component_diagramPackage.COMPONENT__DIAGRAM:
				setDiagram((ComponentDiagram)newValue);
				return;
			case Component_diagramPackage.COMPONENT__ON_DEPEND:
				getOnDepend().clear();
				getOnDepend().addAll((Collection<? extends Dependency>)newValue);
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
			case Component_diagramPackage.COMPONENT__ID:
				setId(ID_EDEFAULT);
				return;
			case Component_diagramPackage.COMPONENT__STEREOTYPE:
				setStereotype(STEREOTYPE_EDEFAULT);
				return;
			case Component_diagramPackage.COMPONENT__IS_INDIRECTLY_INSTANTIATED:
				setIsIndirectlyInstantiated(IS_INDIRECTLY_INSTANTIATED_EDEFAULT);
				return;
			case Component_diagramPackage.COMPONENT__COMPONENT_CONTAINER:
				getComponentContainer().clear();
				return;
			case Component_diagramPackage.COMPONENT__PORTS:
				getPorts().clear();
				return;
			case Component_diagramPackage.COMPONENT__REALIZATION:
				setRealization((Component)null);
				return;
			case Component_diagramPackage.COMPONENT__DIAGRAM:
				setDiagram((ComponentDiagram)null);
				return;
			case Component_diagramPackage.COMPONENT__ON_DEPEND:
				getOnDepend().clear();
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
			case Component_diagramPackage.COMPONENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Component_diagramPackage.COMPONENT__STEREOTYPE:
				return stereotype != STEREOTYPE_EDEFAULT;
			case Component_diagramPackage.COMPONENT__IS_INDIRECTLY_INSTANTIATED:
				return isIndirectlyInstantiated != IS_INDIRECTLY_INSTANTIATED_EDEFAULT;
			case Component_diagramPackage.COMPONENT__COMPONENT_CONTAINER:
				return componentContainer != null && !componentContainer.isEmpty();
			case Component_diagramPackage.COMPONENT__PORTS:
				return ports != null && !ports.isEmpty();
			case Component_diagramPackage.COMPONENT__REALIZATION:
				return realization != null;
			case Component_diagramPackage.COMPONENT__DIAGRAM:
				return getDiagram() != null;
			case Component_diagramPackage.COMPONENT__ON_DEPEND:
				return onDepend != null && !onDepend.isEmpty();
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
		if (baseClass == IDBase.class) {
			switch (derivedFeatureID) {
				case Component_diagramPackage.COMPONENT__ID: return CommonBasePackage.ID_BASE__ID;
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
		if (baseClass == IDBase.class) {
			switch (baseFeatureID) {
				case CommonBasePackage.ID_BASE__ID: return Component_diagramPackage.COMPONENT__ID;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", stereotype: ");
		result.append(stereotype);
		result.append(", isIndirectlyInstantiated: ");
		result.append(isIndirectlyInstantiated);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
