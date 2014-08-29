/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.emf.provider;


import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNFactory;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnModelType;

import de.uni_stuttgart.iste.cowolf.model.commonBase.emf.provider.IDBaseItemProvider;

import de.uni_stuttgart.iste.cowolf.model.lqn.emf.provider.LQNEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.LqnModelType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LqnModelTypeItemProvider extends IDBaseItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LqnModelTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addDescriptionPropertyDescriptor(object);
			addLqncoreSchemaVersionPropertyDescriptor(object);
			addLqnSchemaVersionPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addXmlDebugPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LqnModelType_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LqnModelType_description_feature", "_UI_LqnModelType_type"),
				 LQNPackage.Literals.LQN_MODEL_TYPE__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lqncore Schema Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLqncoreSchemaVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LqnModelType_lqncoreSchemaVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LqnModelType_lqncoreSchemaVersion_feature", "_UI_LqnModelType_type"),
				 LQNPackage.Literals.LQN_MODEL_TYPE__LQNCORE_SCHEMA_VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lqn Schema Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLqnSchemaVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LqnModelType_lqnSchemaVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LqnModelType_lqnSchemaVersion_feature", "_UI_LqnModelType_type"),
				 LQNPackage.Literals.LQN_MODEL_TYPE__LQN_SCHEMA_VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LqnModelType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LqnModelType_name_feature", "_UI_LqnModelType_type"),
				 LQNPackage.Literals.LQN_MODEL_TYPE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Xml Debug feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXmlDebugPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LqnModelType_xmlDebug_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LqnModelType_xmlDebug_feature", "_UI_LqnModelType_type"),
				 LQNPackage.Literals.LQN_MODEL_TYPE__XML_DEBUG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(LQNPackage.Literals.LQN_MODEL_TYPE__RUN_CONTROL);
			childrenFeatures.add(LQNPackage.Literals.LQN_MODEL_TYPE__PLOT_CONTROL);
			childrenFeatures.add(LQNPackage.Literals.LQN_MODEL_TYPE__SOLVER_PARAMS);
			childrenFeatures.add(LQNPackage.Literals.LQN_MODEL_TYPE__PROCESSOR);
			childrenFeatures.add(LQNPackage.Literals.LQN_MODEL_TYPE__SLOT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns LqnModelType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LqnModelType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LqnModelType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_LqnModelType_type") :
			getString("_UI_LqnModelType_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(LqnModelType.class)) {
			case LQNPackage.LQN_MODEL_TYPE__DESCRIPTION:
			case LQNPackage.LQN_MODEL_TYPE__LQNCORE_SCHEMA_VERSION:
			case LQNPackage.LQN_MODEL_TYPE__LQN_SCHEMA_VERSION:
			case LQNPackage.LQN_MODEL_TYPE__NAME:
			case LQNPackage.LQN_MODEL_TYPE__XML_DEBUG:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LQNPackage.LQN_MODEL_TYPE__RUN_CONTROL:
			case LQNPackage.LQN_MODEL_TYPE__PLOT_CONTROL:
			case LQNPackage.LQN_MODEL_TYPE__SOLVER_PARAMS:
			case LQNPackage.LQN_MODEL_TYPE__PROCESSOR:
			case LQNPackage.LQN_MODEL_TYPE__SLOT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(LQNPackage.Literals.LQN_MODEL_TYPE__RUN_CONTROL,
				 LQNFactory.eINSTANCE.createRunControlType()));

		newChildDescriptors.add
			(createChildParameter
				(LQNPackage.Literals.LQN_MODEL_TYPE__PLOT_CONTROL,
				 LQNFactory.eINSTANCE.createPlotControlType()));

		newChildDescriptors.add
			(createChildParameter
				(LQNPackage.Literals.LQN_MODEL_TYPE__SOLVER_PARAMS,
				 LQNFactory.eINSTANCE.createSolverParamsType()));

		newChildDescriptors.add
			(createChildParameter
				(LQNPackage.Literals.LQN_MODEL_TYPE__PROCESSOR,
				 LQNFactory.eINSTANCE.createProcessorType()));

		newChildDescriptors.add
			(createChildParameter
				(LQNPackage.Literals.LQN_MODEL_TYPE__SLOT,
				 LQNFactory.eINSTANCE.createSlotType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return LQNEditPlugin.INSTANCE;
	}

}
