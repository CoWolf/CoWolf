/**
 */
package de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationPackage;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.ModelVersionImpl#getModel <em>Model</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.ModelVersionImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.ModelVersionImpl#isCurrent <em>Current</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.ModelVersionImpl#isManual <em>Manual</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.ModelVersionImpl#getTargetAssociations <em>Target Associations</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.ModelVersionImpl#getSourceAssociations <em>Source Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelVersionImpl extends MinimalEObjectImpl.Container implements ModelVersion {
	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final long TIMESTAMP_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected long timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #isCurrent() <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CURRENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCurrent() <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCurrent()
	 * @generated
	 * @ordered
	 */
	protected boolean current = CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isManual() <em>Manual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManual()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANUAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isManual() <em>Manual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManual()
	 * @generated
	 * @ordered
	 */
	protected boolean manual = MANUAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetAssociations() <em>Target Associations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> targetAssociations;

	/**
	 * The cached value of the '{@link #getSourceAssociations() <em>Source Associations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> sourceAssociations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelVersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelAssociationPackage.eINSTANCE.getModelVersion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		if (eContainerFeatureID() != ModelAssociationPackage.MODEL_VERSION__MODEL) return null;
		return (Model)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(Model newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, ModelAssociationPackage.MODEL_VERSION__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		if (newModel != eInternalContainer() || (eContainerFeatureID() != ModelAssociationPackage.MODEL_VERSION__MODEL && newModel != null)) {
			if (EcoreUtil.isAncestor(this, newModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, ModelAssociationPackage.MODEL__VERSIONS, Model.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelAssociationPackage.MODEL_VERSION__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(long newTimestamp) {
		long oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelAssociationPackage.MODEL_VERSION__TIMESTAMP, oldTimestamp, timestamp));
	}
	
	@Override
	public Resource getResource() {
		ResourceSetImpl resSet = new ResourceSetImpl();
		URI uri = URI.createURI(this.getModel().getParent().getProject().getLocationURI().toString()
				+ "/" + this.getModel().getModel() + "/" + this.getTimestamp() + ".version");
		Resource res = resSet.createResource(uri);
		try {
			res.load(Collections.EMPTY_MAP);
			return res;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCurrent() {
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent(boolean newCurrent) {
		boolean oldCurrent = current;
		current = newCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelAssociationPackage.MODEL_VERSION__CURRENT, oldCurrent, current));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isManual() {
		return manual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManual(boolean newManual) {
		boolean oldManual = manual;
		manual = newManual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelAssociationPackage.MODEL_VERSION__MANUAL, oldManual, manual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getTargetAssociations() {
		if (targetAssociations == null) {
			targetAssociations = new EObjectWithInverseResolvingEList.ManyInverse<Association>(Association.class, this, ModelAssociationPackage.MODEL_VERSION__TARGET_ASSOCIATIONS, ModelAssociationPackage.ASSOCIATION__TARGET);
		}
		return targetAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getSourceAssociations() {
		if (sourceAssociations == null) {
			sourceAssociations = new EObjectWithInverseResolvingEList.ManyInverse<Association>(Association.class, this, ModelAssociationPackage.MODEL_VERSION__SOURCE_ASSOCIATIONS, ModelAssociationPackage.ASSOCIATION__SOURCE);
		}
		return sourceAssociations;
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
			case ModelAssociationPackage.MODEL_VERSION__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel((Model)otherEnd, msgs);
			case ModelAssociationPackage.MODEL_VERSION__TARGET_ASSOCIATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargetAssociations()).basicAdd(otherEnd, msgs);
			case ModelAssociationPackage.MODEL_VERSION__SOURCE_ASSOCIATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSourceAssociations()).basicAdd(otherEnd, msgs);
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
			case ModelAssociationPackage.MODEL_VERSION__MODEL:
				return basicSetModel(null, msgs);
			case ModelAssociationPackage.MODEL_VERSION__TARGET_ASSOCIATIONS:
				return ((InternalEList<?>)getTargetAssociations()).basicRemove(otherEnd, msgs);
			case ModelAssociationPackage.MODEL_VERSION__SOURCE_ASSOCIATIONS:
				return ((InternalEList<?>)getSourceAssociations()).basicRemove(otherEnd, msgs);
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
			case ModelAssociationPackage.MODEL_VERSION__MODEL:
				return eInternalContainer().eInverseRemove(this, ModelAssociationPackage.MODEL__VERSIONS, Model.class, msgs);
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
			case ModelAssociationPackage.MODEL_VERSION__MODEL:
				return getModel();
			case ModelAssociationPackage.MODEL_VERSION__TIMESTAMP:
				return getTimestamp();
			case ModelAssociationPackage.MODEL_VERSION__CURRENT:
				return isCurrent();
			case ModelAssociationPackage.MODEL_VERSION__MANUAL:
				return isManual();
			case ModelAssociationPackage.MODEL_VERSION__TARGET_ASSOCIATIONS:
				return getTargetAssociations();
			case ModelAssociationPackage.MODEL_VERSION__SOURCE_ASSOCIATIONS:
				return getSourceAssociations();
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
			case ModelAssociationPackage.MODEL_VERSION__MODEL:
				setModel((Model)newValue);
				return;
			case ModelAssociationPackage.MODEL_VERSION__TIMESTAMP:
				setTimestamp((Long)newValue);
				return;
			case ModelAssociationPackage.MODEL_VERSION__CURRENT:
				setCurrent((Boolean)newValue);
				return;
			case ModelAssociationPackage.MODEL_VERSION__MANUAL:
				setManual((Boolean)newValue);
				return;
			case ModelAssociationPackage.MODEL_VERSION__TARGET_ASSOCIATIONS:
				getTargetAssociations().clear();
				getTargetAssociations().addAll((Collection<? extends Association>)newValue);
				return;
			case ModelAssociationPackage.MODEL_VERSION__SOURCE_ASSOCIATIONS:
				getSourceAssociations().clear();
				getSourceAssociations().addAll((Collection<? extends Association>)newValue);
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
			case ModelAssociationPackage.MODEL_VERSION__MODEL:
				setModel((Model)null);
				return;
			case ModelAssociationPackage.MODEL_VERSION__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case ModelAssociationPackage.MODEL_VERSION__CURRENT:
				setCurrent(CURRENT_EDEFAULT);
				return;
			case ModelAssociationPackage.MODEL_VERSION__MANUAL:
				setManual(MANUAL_EDEFAULT);
				return;
			case ModelAssociationPackage.MODEL_VERSION__TARGET_ASSOCIATIONS:
				getTargetAssociations().clear();
				return;
			case ModelAssociationPackage.MODEL_VERSION__SOURCE_ASSOCIATIONS:
				getSourceAssociations().clear();
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
			case ModelAssociationPackage.MODEL_VERSION__MODEL:
				return getModel() != null;
			case ModelAssociationPackage.MODEL_VERSION__TIMESTAMP:
				return timestamp != TIMESTAMP_EDEFAULT;
			case ModelAssociationPackage.MODEL_VERSION__CURRENT:
				return current != CURRENT_EDEFAULT;
			case ModelAssociationPackage.MODEL_VERSION__MANUAL:
				return manual != MANUAL_EDEFAULT;
			case ModelAssociationPackage.MODEL_VERSION__TARGET_ASSOCIATIONS:
				return targetAssociations != null && !targetAssociations.isEmpty();
			case ModelAssociationPackage.MODEL_VERSION__SOURCE_ASSOCIATIONS:
				return sourceAssociations != null && !sourceAssociations.isEmpty();
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
		result.append(" (timestamp: ");
		result.append(timestamp);
		result.append(", current: ");
		result.append(current);
		result.append(", manual: ");
		result.append(manual);
		result.append(')');
		return result.toString();
	}

} //ModelVersionImpl
