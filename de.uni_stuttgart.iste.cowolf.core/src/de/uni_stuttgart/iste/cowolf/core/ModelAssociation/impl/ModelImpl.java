/**
 */
package de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociation;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationFactory;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationPackage;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelVersion;
import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.ModelImpl#getParent <em>Parent</em>}</li>
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
	
	@Override
	public ModelVersion createVersion(Resource res) {
		
		// Check for identical model ID
		if (this.getModelID() != null) {
			if (res.getContents().size() < 1 || !(res.getContents().get(0) instanceof IDBase) || !((IDBase)res.getContents().get(0)).getId().equals(this.getModelID())) {
				throw new IllegalArgumentException("Given model version is no instance of this model (model id violation)");
			}
		}
		
		long timestamp = new Date().getTime();
		
		String filename = ModelAssociationPackage.VERSIONBASEDIR + this.getModel() + "/" + timestamp + ".version";
		URI uri = URI.createURI(this.getParent().getProject().getLocationURI().toString() + "/" + filename);
		
		Resource newRes = new ResourceSetImpl().createResource(uri);
		newRes.getContents().clear();
		newRes.getContents().addAll(EcoreUtil.copyAll(res.getContents()));
		
		try {
			newRes.save(Collections.EMPTY_MAP);
			
			ModelVersion version = ModelAssociationFactory.eINSTANCE.createModelVersion();
			version.setManual(false);
			version.setTimestamp(timestamp);
			version.setModel(this);
			
			return version;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	public ModelVersion createVersion() {
		ResourceSetImpl resSet = new ResourceSetImpl();
		URI uri = URI.createURI(this.getParent().getProject().getLocationURI().toString() + "/" + this.getModel());
		Resource res = resSet.createResource(uri);
		try {
			res.load(Collections.EMPTY_MAP);
			
			return this.createVersion(res);
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
	public EList<ModelVersion> getVersions() {
		if (versions == null) {
			versions = new EObjectContainmentWithInverseEList<ModelVersion>(ModelVersion.class, this, ModelAssociationPackage.MODEL__VERSIONS, ModelAssociationPackage.MODEL_VERSION__MODEL);
		}
		return versions;
	}
	
	@Override
	public void prepareRemove() {
		
		List<Association> invalidAssocs = new LinkedList<Association>();
		for (Association assoc :  this.getSourceAssociations()) {
			if (assoc.getSource().size() <= 1) {
				invalidAssocs.add(assoc);
			}
		}
		
		for (Association assoc :  this.getTargetAssociations()) {
			if (assoc.getTarget().size() <= 1) {
				invalidAssocs.add(assoc);
			}
		}
		
		this.getParent().getAssociations().removeAll(invalidAssocs);
		
		final IFolder versionfolder = this.getParent().getProject().getFolder(ModelAssociationPackage.VERSIONBASEDIR + this.getModel());
		new WorkspaceJob("Update model versioning...") {

			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor)
					throws CoreException {
				try {
					versionfolder.delete(true, monitor);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return Status.OK_STATUS;
			}
			
		}.schedule();
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
	 * 
	 * @param newPath new path to model file, relative to project root.
	 * @return
	 */
	@Override
	public boolean rename(final String newPath) {
		if (newPath.equals(this.getModel())) {
			return true;
		}
		
		if (!this.getParent().getProject().getFile(newPath).exists()) {
			return false;
		}
		
		final IFolder versionfolder = this.getParent().getProject().getFolder(ModelAssociationPackage.VERSIONBASEDIR + this.getModel());
		
		if (!versionfolder.exists()) {
			return false;
		}
		
		final IPath moveto = this.getParent().getProject().getFolder(ModelAssociationPackage.VERSIONBASEDIR + newPath).getFullPath();
		
		new WorkspaceJob("Update model versioning...") {

			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) {
				try {
					versionfolder.move(moveto, true, monitor);
					setModel(newPath);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return Status.OK_STATUS;
			}
		}.schedule();
		
		return true;
	}
	
	@Override
	public Resource getResource() {
		ResourceSet resSet = new ResourceSetImpl();
		URI uri = URI.createURI(this.getParent().getProject().getLocationURI().toString() + "/" + this.getModel());
		Resource res = resSet.createResource(uri);
		try {
			res.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAssociation getParent() {
		if (eContainerFeatureID() != ModelAssociationPackage.MODEL__PARENT) return null;
		return (ModelAssociation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ModelAssociation newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ModelAssociationPackage.MODEL__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ModelAssociation newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ModelAssociationPackage.MODEL__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ModelAssociationPackage.MODEL_ASSOCIATION__MODELS, ModelAssociation.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelAssociationPackage.MODEL__PARENT, newParent, newParent));
	}

	@Override
	public List<Association> getSourceAssociations() {
		LinkedList<Association> list = new LinkedList<Association>();
		
		for (ModelVersion version : this.getVersions()) {
			list.addAll(version.getSourceAssociations());
		}
		
		return list;
	}
	
	@Override
	public List<Association> getTargetAssociations() {
		LinkedList<Association> list = new LinkedList<Association>();
		
		for (ModelVersion version : this.getVersions()) {
			list.addAll(version.getTargetAssociations());
		}
		
		return list;
	}
	
	@Override
	public List<Association> getAllAssociations() {
		LinkedList<Association> list = new LinkedList<Association>();
		
		for (ModelVersion version : this.getVersions()) {
			list.addAll(version.getTargetAssociations());
			list.addAll(version.getSourceAssociations());
		}
		
		return list;
	}

	@Override
	public Association getLatestAssociationTo(Model target) {
		ListIterator<ModelVersion> versionIt = this.getVersions().listIterator(this.getVersions().size());
		
		List<Association> targetAssocs = target.getTargetAssociations();
		
		while (versionIt.hasPrevious()) {
			ModelVersion version = versionIt.previous();
			for (Association assoc : version.getSourceAssociations()) {
				if (targetAssocs.contains(assoc)) {
					return assoc;
				}
			}
		}
		
		return null;
	}

	@Override
	public boolean hasChanges() {
		// TODO check for changes between working copy and newest version
		return true;
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
			case ModelAssociationPackage.MODEL__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((ModelAssociation)otherEnd, msgs);
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
			case ModelAssociationPackage.MODEL__PARENT:
				return basicSetParent(null, msgs);
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
			case ModelAssociationPackage.MODEL__PARENT:
				return eInternalContainer().eInverseRemove(this, ModelAssociationPackage.MODEL_ASSOCIATION__MODELS, ModelAssociation.class, msgs);
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
			case ModelAssociationPackage.MODEL__VERSIONS:
				return getVersions();
			case ModelAssociationPackage.MODEL__MODEL:
				return getModel();
			case ModelAssociationPackage.MODEL__MODEL_ID:
				return getModelID();
			case ModelAssociationPackage.MODEL__PARENT:
				return getParent();
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
			case ModelAssociationPackage.MODEL__PARENT:
				setParent((ModelAssociation)newValue);
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
			case ModelAssociationPackage.MODEL__PARENT:
				setParent((ModelAssociation)null);
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
			case ModelAssociationPackage.MODEL__PARENT:
				return getParent() != null;
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
