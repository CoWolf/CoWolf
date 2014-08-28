/**
 */
package de.uni_stuttgart.iste.cowolf.core.ModelAssociation.impl;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import de.uni_stuttgart.iste.cowolf.core.ModelAssociation.*;

import org.eclipse.core.resources.IProject;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class ModelAssociationFactoryImpl extends EFactoryImpl implements ModelAssociationFactory {
	
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

	
	public ModelAssociation getModelAssociation(IProject project) {
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
		return null;
	}

	private void loadOrCreateResource(IProject project) {
		
		ResourceSet resSet = new ResourceSetImpl();
		
		URI uri = URI.createURI(project.getFile(ModelAssociationPackage.PROJECT_FILENAME).getLocation().toString());
		Resource res = resSet.getResource(uri, false);
		
		if (res == null) {
			res = resSet.createResource(uri);
		}
		
		if (!(res.getContents().get(0) instanceof ModelAssociation)) {
			res.getContents().set(0, createModelAssociation());
		}
		
		res.setTrackingModification(true);
		res.eAdapters().add(new AdapterImpl() {

			@Override
			public void notifyChanged(Notification notification) {
				if (notification.getEventType() == Notification.SET
						&& notification.getFeatureID(Resource.class) == Resource.RESOURCE__IS_MODIFIED) {
					try {
						((Resource) notification.getNotifier()).save(Collections.EMPTY_MAP);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

} //ModelAssociationFactoryImpl
