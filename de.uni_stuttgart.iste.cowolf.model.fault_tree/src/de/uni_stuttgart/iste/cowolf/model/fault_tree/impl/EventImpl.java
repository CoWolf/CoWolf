/**
 */
package de.uni_stuttgart.iste.cowolf.model.fault_tree.impl;

import de.uni_stuttgart.iste.cowolf.model.fault_tree.Event;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.Gate;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.Root;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.EventImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.EventImpl#getInputGate <em>Input Gate</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.EventImpl#getOutputGate <em>Output Gate</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.EventImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.EventImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.model.fault_tree.impl.EventImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EventImpl extends EObjectImpl implements Event {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputGate() <em>Input Gate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputGate()
	 * @generated
	 * @ordered
	 */
	protected Gate inputGate;

	/**
	 * The cached value of the '{@link #getOutputGate() <em>Output Gate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputGate()
	 * @generated
	 * @ordered
	 */
	protected Gate outputGate;

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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaultTreePackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaultTreePackage.EVENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate getInputGate() {
		if (inputGate != null && inputGate.eIsProxy()) {
			InternalEObject oldInputGate = (InternalEObject)inputGate;
			inputGate = (Gate)eResolveProxy(oldInputGate);
			if (inputGate != oldInputGate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaultTreePackage.EVENT__INPUT_GATE, oldInputGate, inputGate));
			}
		}
		return inputGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate basicGetInputGate() {
		return inputGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputGate(Gate newInputGate, NotificationChain msgs) {
		Gate oldInputGate = inputGate;
		inputGate = newInputGate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaultTreePackage.EVENT__INPUT_GATE, oldInputGate, newInputGate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputGate(Gate newInputGate) {
		if (newInputGate != inputGate) {
			NotificationChain msgs = null;
			if (inputGate != null)
				msgs = ((InternalEObject)inputGate).eInverseRemove(this, FaultTreePackage.GATE__OUTPUT_EVENT, Gate.class, msgs);
			if (newInputGate != null)
				msgs = ((InternalEObject)newInputGate).eInverseAdd(this, FaultTreePackage.GATE__OUTPUT_EVENT, Gate.class, msgs);
			msgs = basicSetInputGate(newInputGate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaultTreePackage.EVENT__INPUT_GATE, newInputGate, newInputGate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate getOutputGate() {
		if (outputGate != null && outputGate.eIsProxy()) {
			InternalEObject oldOutputGate = (InternalEObject)outputGate;
			outputGate = (Gate)eResolveProxy(oldOutputGate);
			if (outputGate != oldOutputGate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaultTreePackage.EVENT__OUTPUT_GATE, oldOutputGate, outputGate));
			}
		}
		return outputGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate basicGetOutputGate() {
		return outputGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputGate(Gate newOutputGate, NotificationChain msgs) {
		Gate oldOutputGate = outputGate;
		outputGate = newOutputGate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaultTreePackage.EVENT__OUTPUT_GATE, oldOutputGate, newOutputGate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputGate(Gate newOutputGate) {
		if (newOutputGate != outputGate) {
			NotificationChain msgs = null;
			if (outputGate != null)
				msgs = ((InternalEObject)outputGate).eInverseRemove(this, FaultTreePackage.GATE__INPUT_EVENTS, Gate.class, msgs);
			if (newOutputGate != null)
				msgs = ((InternalEObject)newOutputGate).eInverseAdd(this, FaultTreePackage.GATE__INPUT_EVENTS, Gate.class, msgs);
			msgs = basicSetOutputGate(newOutputGate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaultTreePackage.EVENT__OUTPUT_GATE, newOutputGate, newOutputGate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root getRoot() {
		if (eContainerFeatureID() != FaultTreePackage.EVENT__ROOT) return null;
		return (Root)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(Root newRoot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRoot, FaultTreePackage.EVENT__ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(Root newRoot) {
		if (newRoot != eInternalContainer() || (eContainerFeatureID() != FaultTreePackage.EVENT__ROOT && newRoot != null)) {
			if (EcoreUtil.isAncestor(this, newRoot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRoot != null)
				msgs = ((InternalEObject)newRoot).eInverseAdd(this, FaultTreePackage.ROOT__EVENT, Root.class, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaultTreePackage.EVENT__ROOT, newRoot, newRoot));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaultTreePackage.EVENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaultTreePackage.EVENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FaultTreePackage.EVENT__INPUT_GATE:
				if (inputGate != null)
					msgs = ((InternalEObject)inputGate).eInverseRemove(this, FaultTreePackage.GATE__OUTPUT_EVENT, Gate.class, msgs);
				return basicSetInputGate((Gate)otherEnd, msgs);
			case FaultTreePackage.EVENT__OUTPUT_GATE:
				if (outputGate != null)
					msgs = ((InternalEObject)outputGate).eInverseRemove(this, FaultTreePackage.GATE__INPUT_EVENTS, Gate.class, msgs);
				return basicSetOutputGate((Gate)otherEnd, msgs);
			case FaultTreePackage.EVENT__ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRoot((Root)otherEnd, msgs);
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
			case FaultTreePackage.EVENT__INPUT_GATE:
				return basicSetInputGate(null, msgs);
			case FaultTreePackage.EVENT__OUTPUT_GATE:
				return basicSetOutputGate(null, msgs);
			case FaultTreePackage.EVENT__ROOT:
				return basicSetRoot(null, msgs);
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
			case FaultTreePackage.EVENT__ROOT:
				return eInternalContainer().eInverseRemove(this, FaultTreePackage.ROOT__EVENT, Root.class, msgs);
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
			case FaultTreePackage.EVENT__DESCRIPTION:
				return getDescription();
			case FaultTreePackage.EVENT__INPUT_GATE:
				if (resolve) return getInputGate();
				return basicGetInputGate();
			case FaultTreePackage.EVENT__OUTPUT_GATE:
				if (resolve) return getOutputGate();
				return basicGetOutputGate();
			case FaultTreePackage.EVENT__ROOT:
				return getRoot();
			case FaultTreePackage.EVENT__NAME:
				return getName();
			case FaultTreePackage.EVENT__ID:
				return getId();
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
			case FaultTreePackage.EVENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FaultTreePackage.EVENT__INPUT_GATE:
				setInputGate((Gate)newValue);
				return;
			case FaultTreePackage.EVENT__OUTPUT_GATE:
				setOutputGate((Gate)newValue);
				return;
			case FaultTreePackage.EVENT__ROOT:
				setRoot((Root)newValue);
				return;
			case FaultTreePackage.EVENT__NAME:
				setName((String)newValue);
				return;
			case FaultTreePackage.EVENT__ID:
				setId((Integer)newValue);
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
			case FaultTreePackage.EVENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FaultTreePackage.EVENT__INPUT_GATE:
				setInputGate((Gate)null);
				return;
			case FaultTreePackage.EVENT__OUTPUT_GATE:
				setOutputGate((Gate)null);
				return;
			case FaultTreePackage.EVENT__ROOT:
				setRoot((Root)null);
				return;
			case FaultTreePackage.EVENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FaultTreePackage.EVENT__ID:
				setId(ID_EDEFAULT);
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
			case FaultTreePackage.EVENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FaultTreePackage.EVENT__INPUT_GATE:
				return inputGate != null;
			case FaultTreePackage.EVENT__OUTPUT_GATE:
				return outputGate != null;
			case FaultTreePackage.EVENT__ROOT:
				return getRoot() != null;
			case FaultTreePackage.EVENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FaultTreePackage.EVENT__ID:
				return id != ID_EDEFAULT;
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
		result.append(" (description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //EventImpl
