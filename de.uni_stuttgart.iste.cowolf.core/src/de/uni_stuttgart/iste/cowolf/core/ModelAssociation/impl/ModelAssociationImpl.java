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
import java.util.Date;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
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
	 * The cached value of the '{@link #getAssociations() <em>Associations</em>}' containment reference list.
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
			if (model.getModel().trim().equals(file.trim())) {
				return model;
			}
		}
		
		return null;
	}

	private String getModelFile(Resource res) {
		
		String filePath = getFilePath(res);
		

		if (filePath.startsWith(this.getProject().getFullPath().toString())) {
			filePath = filePath.substring(this.getProject().getFullPath().toString().length() + 1);
		}

		return filePath;
		
		//URI uri = res.getURI().resolve(URI.createURI(this.getProject().getLocation().makeAbsolute().toString()));
		//return uri.toString().substring(this.getProject().getLocationURI().toString().length() + 1);//replace('\\', '/');
	}
	
	/**
	* Returns file path for resource or empty string if not found
	* @param Resource
	* @return String file path
	*/
	private static String getFilePath(Resource resource) {
		if (resource == null) {
			return "";
		}
		IFile file = getWorkspaceFile(resource.getURI());
		String filePath = null;
		if (file == null) {
			URI uri = resource.getURI();
			filePath = uri != null ? uri.toFileString() : ""; // $NON-NLS-1$
		} else {
			filePath = file.getFullPath().toString();
		}
		if (filePath == null) {
			return "";
		}
		return filePath;
	}
	
	private static IFile getWorkspaceFile(URI uri) {
		if (uri == null)
			return null;
		String filePath = getWorkspaceFilePath(uri.trimFragment());
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		if (filePath == null) {
			String localPath = uri.toFileString();
			if (localPath == null) {
				// Try to extract a workspace path
				IPath path = new Path(uri.path());
				IResource res = workspaceRoot.findMember(path);
				if (res != null && res.getType() == IResource.FILE) {
					return (IFile) res;
				}
				return null;
			} else {
				IPath location = Path.fromOSString(localPath);
				IFile[] files = workspaceRoot.findFilesForLocation(location);
				if (files == null || files.length == 0)
					return null;
				return files[0];
			}
		} else {
			IResource workspaceResource = workspaceRoot.findMember(filePath);
			if ((workspaceResource == null)
					|| (workspaceResource.getType() != IResource.FILE)) {
				return null;
			}
			return (IFile) workspaceResource;
		}
	}
	
	
	/**
	* <p>Resolves the workspace file path from a platform
	* resource {@link URI}.</p>
	*
	* <p>This method returns <code>null</code> if the {@link URI} is
	* <code>null</code> or does not represent a platform resource.</p>
	*
	* @param uri A platform resource {@link URI}.
	* @return The decoded workspace file path, otherwise <code>null</code>.
	*/
	private static String getWorkspaceFilePath(URI uri) {
		if (uri != null) {
			String resourceURI = uri.toString();
			if (resourceURI.startsWith("platform:/resource")) { //$NON-NLS-1$
				return (resourceURI.substring(18));
			}
		}
		return null;
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

	@Override
	public Association registerAssociation() {
		
		Association assoc = ModelAssociationFactory.eINSTANCE.createAssociation();
		assoc.setTimestamp(new Date().getTime());
		assoc.setParent(this);
		
		return assoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getAssociations() {
		if (associations == null) {
			associations = new EObjectContainmentWithInverseEList<Association>(Association.class, this, ModelAssociationPackage.MODEL_ASSOCIATION__ASSOCIATIONS, ModelAssociationPackage.ASSOCIATION__PARENT);
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
