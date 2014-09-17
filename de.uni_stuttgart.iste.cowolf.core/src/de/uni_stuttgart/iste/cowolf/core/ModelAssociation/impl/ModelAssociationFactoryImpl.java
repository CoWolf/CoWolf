/**
 */
package de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl;

import java.io.File;
import java.io.IOException;
import java.rmi.UnexpectedException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.*;
import de.uni_stuttgart.iste.cowolf.core.natures.ProjectNature;
import de.uni_stuttgart.iste.cowolf.model.commonBase.IDBase;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class ModelAssociationFactoryImpl extends EFactoryImpl implements ModelAssociationFactory {
	
	private final static Logger LOGGER = LoggerFactory
			.getLogger(ModelAssociationFactoryImpl.class);
	
	private Map<IProject, Resource> resources;
	
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelAssociationFactory init() {
		try {
			ModelAssociationFactory theModelAssociationFactory = (ModelAssociationFactory)EPackage.Registry.INSTANCE.getEFactory(ModelAssociationPackage.eNS_URI);
			if (theModelAssociationFactory != null) {
				return theModelAssociationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelAssociationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAssociationFactoryImpl() {
		super();
		this.resources = new HashMap<>();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelAssociationPackage.MODEL_ASSOCIATION: return createModelAssociation();
			case ModelAssociationPackage.MODEL: return createModel();
			case ModelAssociationPackage.ASSOCIATION: return createAssociation();
			case ModelAssociationPackage.MODEL_VERSION: return createModelVersion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	@Override
	public void removeModelAssociation(IProject project) {
		if (!this.resources.containsKey(project)) {
			if (getModelAssociation(project) == null) {
				return;
			}
		}
		
		this.resources.get(project).unload();
		this.resources.remove(project);
		
		if (project.getFile(ModelAssociationPackage.PROJECT_FILENAME).exists()) {
			try {
				project.getFile(ModelAssociationPackage.PROJECT_FILENAME).delete(true, null);
			} catch (CoreException e) {
				LOGGER.warn("Could not delete .modelassociation file", e);
			}
		}
	}
	
	@Override
	public ModelAssociation getModelAssociation(IProject project) {
		
		if (project == null) {
			throw new IllegalArgumentException("No project given.");
		}
		
		try {
			if (!project.hasNature(ProjectNature.NATURE_ID)) {
				return null;
			}
		} catch (CoreException e) {
		}
		
		Resource res = this.getResource(project);
		if (res == null || res.getContents() == null || !(res.getContents().get(0) instanceof ModelAssociation)) {
			return null;
		}
		
		return (ModelAssociation) res.getContents().get(0);
	}
	
	private Resource getResource(IProject project) {
		if (!this.resources.containsKey(project)) {
			this.loadOrCreateResource(project);
		}
		return this.resources.get(project);
	}

	private void loadOrCreateResource(IProject project) {
		
		ResourceSet resSet = new ResourceSetImpl();
		
		URI uri = URI.createURI(project.getLocationURI().toString() + "/" + ModelAssociationPackage.PROJECT_FILENAME);
		Resource res = resSet.createResource(uri);
		if (new File(project.getFile(ModelAssociationPackage.PROJECT_FILENAME).getLocation().makeAbsolute().toOSString()).exists()) {
			try {
				res.load(Collections.EMPTY_MAP);
			} catch (IOException e1) {
				LOGGER.error("Loading resource failed.", e1);
			}
		}
		
		if (res.getContents().isEmpty()) {
			res.getContents().add(createModelAssociation());
		} else if (!(res.getContents().get(0) instanceof ModelAssociation)) {
			res.getContents().set(0, createModelAssociation());
		}
		
		res.setTrackingModification(true);
		res.eAdapters().add(new AdapterImpl() {

			@Override
			public void notifyChanged(Notification notification) {
				if (notification.getEventType() == Notification.SET
						&& notification.getFeatureID(Resource.class) == Resource.RESOURCE__IS_MODIFIED
						&& ((Resource) notification.getNotifier()).isModified()) {
					
					Resource res = ((Resource) notification.getNotifier());
					if (res.getContents().size() == 0 || !(res.getContents().get(0) instanceof ModelAssociation)
							|| ((ModelAssociation) res.getContents().get(0)).isClustered()) {
						return;
					}
					
					try {
						res.save(Collections.EMPTY_MAP);
					} catch (IOException e) {
						LOGGER.error("Saving resource failed.", e);
					}
				}
			}
			
		});
		
		((ModelAssociation)res.getContents().get(0)).setProject(project);
		
		this.resources.put(project, res);
		
	}

	@Override
	public ModelAssociation createModelAssociation() {
		return new ModelAssociationImpl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		Model model = new ModelImpl();
		return model;
	}
	
	@Override
	public Model copyModel(final Model source, final IFile target, final Runnable onFinish) throws UnexpectedException {
		
		if (source == null || target == null || target.getProject() == null || !target.getProject().isOpen()) {
			LOGGER.error("There is something null.");
			return null;
		}
		
		try {
			if (!target.getProject().hasNature(ProjectNature.NATURE_ID)) {
				LOGGER.error("Target project does not have cowolf nature.");
				return null;
			}
		} catch (CoreException e) {
			LOGGER.error("",e);
		}
		
		LOGGER.debug("Copy {} to {}", source.getModel(), target.getLocation().toString());
		
		final ModelAssociation tma = ModelAssociationFactory.eINSTANCE.getModelAssociation(target.getProject());
		
		if (tma.getModelByPath(target.getProjectRelativePath().toString()) != null) {
			LOGGER.error("There is already a model {} in project {}.", target.getProjectRelativePath().toString(), target.getProject().getName());
			return tma.getModelByPath(target.getProjectRelativePath().toString());
		}
		
		if (!target.exists()) {
			if (!source.getFile().exists()) {
				throw new UnexpectedException("There is neither source nor target model file.");
			}
//			WorkspaceJob job = new WorkspaceJob("Copy model versions...") {
//
//				@Override
//				public IStatus runInWorkspace(IProgressMonitor monitor) {
					try {
						source.getFile().copy(target.getFullPath(), true, null);
					} catch (CoreException e) {
						LOGGER.error("Copying resource failed.", e);
					}
//				}
//			};
//			job.schedule();
//			job.join();
		}
		
		final Model model = ModelAssociationFactory.eINSTANCE.createModel();
		
		tma.runCluster(new Runnable() {
			
			@Override
			public void run() {

				model.setModel(target.getProjectRelativePath().toString());
				model.setParent(tma);
				
				
				Resource modelRes = model.getResource();
				if (modelRes == null) {
					return;
				}
				
				if (modelRes.getContents().size() > 0 && modelRes.getContents().get(0) instanceof IDBase) {
					model.setModelID(((IDBase) modelRes.getContents().get(0)).getId());
				}
			}
		});
		
		
		
		if (source.getVersions().size() > 0) {
		
			final IFolder versionSource = source.getParent().getProject().getFolder(ModelAssociationPackage.VERSIONBASEDIR + source.getModel());
			
			if (!versionSource.exists()) {
				throw new UnexpectedException("Source versions directory do not exist.");
			}
		
			final IFolder versionTarget = model.getParent().getProject()
					.getFolder(ModelAssociationPackage.VERSIONBASEDIR + target.getProjectRelativePath());
			
			tma.runCluster(new Runnable() {
				
				@Override
				public void run() {
					source.getParent().runCluster(new Runnable() {
						
						@Override
						public void run() {
							model.getVersions().addAll(EcoreUtil.copyAll(source.getVersions()));
						}
					});
				}
			});
		
			new WorkspaceJob("Copy model versions...") {
	
				@Override
				public IStatus runInWorkspace(IProgressMonitor monitor) {
					try {
						prepare((IFolder) versionTarget.getParent());
						versionSource.copy(versionTarget.getFullPath(), true, monitor);
						
						if (onFinish != null) {
							onFinish.run();
						}
					} catch (CoreException e) {
						LOGGER.error("",e);
					}
					
					return Status.OK_STATUS;
				}
			}.schedule();
		}
	
		return model;
	}
	
	private static void prepare(IFolder folder) {
	    if (!folder.exists()) {
	    	if (folder.getParent() instanceof IFolder) {
	    		prepare((IFolder) folder.getParent());
	    	}
	        try {
				folder.create(true, true, null);
			} catch (CoreException e) {
				LOGGER.error("",e);
			}
	    }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelVersion createModelVersion() {
		ModelVersion modelVersion = new ModelVersionImpl();
		return modelVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAssociationPackage getModelAssociationPackage() {
		return (ModelAssociationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelAssociationPackage getPackage() {
		return ModelAssociationPackage.eINSTANCE;
	}

	@Override
	public void saveAll() {
		for (Resource res : resources.values()) {
			try {
				res.save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				LOGGER.error("",e);
			}
		}
		
	}

} //ModelAssociationFactoryImpl
