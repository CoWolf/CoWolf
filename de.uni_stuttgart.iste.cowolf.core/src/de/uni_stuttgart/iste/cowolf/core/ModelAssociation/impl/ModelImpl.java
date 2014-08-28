/**
 */
package de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationPackage;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.ModelImpl#getVersions <em>Versions</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.ModelImpl#getModel <em>Model</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.ModelImpl#getModelID <em>Model ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getVersions() <em>Versions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelVersion> versions;

	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelID() <em>Model ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelID()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelID() <em>Model ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelID()
	 * @generated
	 * @ordered
	 */
	protected String modelID = MODEL_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelAssociationPackage.eINSTANCE.getModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelVersion> getVersions() {
		if (versions == null) {
			versions = new EObjectContainmentWithInverseEList<ModelVersion>(ModelVersion.class, this, ModelAssociationPackage.MODEL__VERSIONS, ModelAssociationPackage.MODEL_VERSION__MODEL);
		}
		return versions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelAssociationPackage.MODEL__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelID() {
		return modelID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelID(String newModelID) {
		String oldModelID = modelID;
		modelID = newModelID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelAssociationPackage.MODEL__MODEL_ID, oldModelID, modelID));
	}
	
	public List<Association> getSourceAssociations() {
		LinkedList<Association> list = new LinkedList<Association>();
		
		for (ModelVersion version : this.getVersions()) {
			list.addAll(version.getSourceAssociations());
		}
		
		return list;
	}
	
	public List<Association> getTargetAssociations() {
		LinkedList<Association> list = new LinkedList<Association>();
		
		for (ModelVersion version : this.getVersions()) {
			list.addAll(version.getTargetAssociations());
		}
		
		return list;
	}
	
	public List<Association> getAllAssociations() {
		LinkedList<Association> list = new LinkedList<Association>();
		
		for (ModelVersion version : this.getVersions()) {
			list.addAll(version.getTargetAssociations());
			list.addAll(version.getSourceAssociations());
		}
		
		return list;
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
			case ModelAssociationPackage.MODEL__VERSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVersions()).basicAdd(otherEnd, msgs);
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
			case ModelAssociationPackage.MODEL__VERSIONS:
				return ((InternalEList<?>)getVersions()).basicRemove(otherEnd, msgs);
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
			case ModelAssociationPackage.MODEL__VERSIONS:
				return getVersions();
			case ModelAssociationPackage.MODEL__MODEL:
				return getModel();
			case ModelAssociationPackage.MODEL__MODEL_ID:
				return getModelID();
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
			case ModelAssociationPackage.MODEL__VERSIONS:
				getVersions().clear();
				getVersions().addAll((Collection<? extends ModelVersion>)newValue);
				return;
			case ModelAssociationPackage.MODEL__MODEL:
				setModel((String)newValue);
				return;
			case ModelAssociationPackage.MODEL__MODEL_ID:
				setModelID((String)newValue);
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
			case ModelAssociationPackage.MODEL__VERSIONS:
				getVersions().clear();
				return;
			case ModelAssociationPackage.MODEL__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case ModelAssociationPackage.MODEL__MODEL_ID:
				setModelID(MODEL_ID_EDEFAULT);
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
			case ModelAssociationPackage.MODEL__VERSIONS:
				return versions != null && !versions.isEmpty();
			case ModelAssociationPackage.MODEL__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
			case ModelAssociationPackage.MODEL__MODEL_ID:
				return MODEL_ID_EDEFAULT == null ? modelID != null : !MODEL_ID_EDEFAULT.equals(modelID);
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
		result.append(" (model: ");
		result.append(model);
		result.append(", modelID: ");
		result.append(modelID);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
