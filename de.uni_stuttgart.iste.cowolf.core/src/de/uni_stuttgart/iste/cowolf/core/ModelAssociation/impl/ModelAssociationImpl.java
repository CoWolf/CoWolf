/**
 */
package de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Association;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.Model;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociation;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationFactory;
import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.ModelAssociationPackage;
import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

import java.util.Collection;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.ModelAssociationImpl#getModels <em>Models</em>}</li>
 *   <li>{@link de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl.ModelAssociationImpl#getAssociations <em>Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelAssociationImpl extends MinimalEObjectImpl.Container implements ModelAssociation {
	/**
	 * The cached value of the '{@link #getModels() <em>Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModels()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> models;

	/**
	 * The cached value of the '{@link #getAssociations() <em>Associations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> associations;
	
	/**
	 * The project, the model association manager is for.
	 */
	protected IProject project;

	@Override
	public IProject getProject() {
		return project;
	}

	@Override
	public void setProject(IProject project) {
		this.project = project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelAssociationPackage.eINSTANCE.getModelAssociation();
	}
	
	@Override
	public Model registerModel(Resource res) {
		
		if (getModel(res) == null) {
			Model model = ModelAssociationFactory.eINSTANCE.createModel();
			model.setModel(getModelFile(res));
			if (res.getContents().get(0) instanceof IDBase) {
				model.setModelID(((IDBase)res.getContents().get(0)).getId());
			}
			model.setParent(this);
			
			return model;
		}
		
		return null;
	}
	
	@Override
	public void removeModel(Model model) {
		if (this.getModels().contains(model)) {
			model.prepareRemove();
			this.getModels().remove(model);
		}
	}
	
	/**
	 * 	
	 * @param res
	 * @return
	 * @generated NOT
	 */
	@Override
	public Model getModel(Resource res) {
		
		String file = getModelFile(res);
		
		return this.getModelByPath(file);
	}
	
	@Override
	public Model getModelByPath(String file) {
		for (Model model : getModels()) {
			if (model.getModel().equals(file)) {
				return model;
			}
		}
		
		return null;
		
	}

	private String getModelFile(Resource res) {
		return res.getURI().toFileString().substring(this.getProject().getLocation().toString().length()+1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getModels() {
		if (models == null) {
			models = new EObjectContainmentWithInverseEList<Model>(Model.class, this, ModelAssociationPackage.MODEL_ASSOCIATION__MODELS, ModelAssociationPackage.MODEL__PARENT);
		}
		return models;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getAssociations() {
		if (associations == null) {
			associations = new EObjectWithInverseResolvingEList<Association>(Association.class, this, ModelAssociationPackage.MODEL_ASSOCIATION__ASSOCIATIONS, ModelAssociationPackage.ASSOCIATION__PARENT);
		}
		return associations;
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
			case ModelAssociationPackage.MODEL_ASSOCIATION__MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModels()).basicAdd(otherEnd, msgs);
			case ModelAssociationPackage.MODEL_ASSOCIATION__ASSOCIATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssociations()).basicAdd(otherEnd, msgs);
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
			case ModelAssociationPackage.MODEL_ASSOCIATION__MODELS:
				return ((InternalEList<?>)getModels()).basicRemove(otherEnd, msgs);
			case ModelAssociationPackage.MODEL_ASSOCIATION__ASSOCIATIONS:
				return ((InternalEList<?>)getAssociations()).basicRemove(otherEnd, msgs);
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
			case ModelAssociationPackage.MODEL_ASSOCIATION__MODELS:
				return getModels();
			case ModelAssociationPackage.MODEL_ASSOCIATION__ASSOCIATIONS:
				return getAssociations();
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
			case ModelAssociationPackage.MODEL_ASSOCIATION__MODELS:
				getModels().clear();
				getModels().addAll((Collection<? extends Model>)newValue);
				return;
			case ModelAssociationPackage.MODEL_ASSOCIATION__ASSOCIATIONS:
				getAssociations().clear();
				getAssociations().addAll((Collection<? extends Association>)newValue);
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
			case ModelAssociationPackage.MODEL_ASSOCIATION__MODELS:
				getModels().clear();
				return;
			case ModelAssociationPackage.MODEL_ASSOCIATION__ASSOCIATIONS:
				getAssociations().clear();
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
			case ModelAssociationPackage.MODEL_ASSOCIATION__MODELS:
				return models != null && !models.isEmpty();
			case ModelAssociationPackage.MODEL_ASSOCIATION__ASSOCIATIONS:
				return associations != null && !associations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelAssociationImpl
