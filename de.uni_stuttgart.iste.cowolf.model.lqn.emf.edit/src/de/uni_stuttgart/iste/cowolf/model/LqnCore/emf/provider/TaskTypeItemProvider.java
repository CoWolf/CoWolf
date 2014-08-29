/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.emf.provider;


import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNFactory;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType;

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
 * This is the item provider adapter for a {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.TaskType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskTypeItemProvider extends IDBaseItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskTypeItemProvider(AdapterFactory adapterFactory) {
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

			addActivityGraphPropertyDescriptor(object);
			addMultiplicityPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addPriorityPropertyDescriptor(object);
			addQueueLengthPropertyDescriptor(object);
			addReplicationPropertyDescriptor(object);
			addSchedulingPropertyDescriptor(object);
			addThinkTimePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Activity Graph feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivityGraphPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_activityGraph_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_activityGraph_feature", "_UI_TaskType_type"),
				 LQNPackage.Literals.TASK_TYPE__ACTIVITY_GRAPH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Multiplicity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultiplicityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_multiplicity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_multiplicity_feature", "_UI_TaskType_type"),
				 LQNPackage.Literals.TASK_TYPE__MULTIPLICITY,
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
				 getString("_UI_TaskType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_name_feature", "_UI_TaskType_type"),
				 LQNPackage.Literals.TASK_TYPE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_priority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_priority_feature", "_UI_TaskType_type"),
				 LQNPackage.Literals.TASK_TYPE__PRIORITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Queue Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQueueLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_queueLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_queueLength_feature", "_UI_TaskType_type"),
				 LQNPackage.Literals.TASK_TYPE__QUEUE_LENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Replication feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReplicationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_replication_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_replication_feature", "_UI_TaskType_type"),
				 LQNPackage.Literals.TASK_TYPE__REPLICATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scheduling feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchedulingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_scheduling_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_scheduling_feature", "_UI_TaskType_type"),
				 LQNPackage.Literals.TASK_TYPE__SCHEDULING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Think Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThinkTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskType_thinkTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskType_thinkTime_feature", "_UI_TaskType_type"),
				 LQNPackage.Literals.TASK_TYPE__THINK_TIME,
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
			childrenFeatures.add(LQNPackage.Literals.TASK_TYPE__RESULT_TASK);
			childrenFeatures.add(LQNPackage.Literals.TASK_TYPE__ENTRY);
			childrenFeatures.add(LQNPackage.Literals.TASK_TYPE__SERVICE);
			childrenFeatures.add(LQNPackage.Literals.TASK_TYPE__TASK_ACTIVITIES);
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
	 * This returns TaskType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TaskType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TaskType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TaskType_type") :
			getString("_UI_TaskType_type") + " " + label;
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

		switch (notification.getFeatureID(TaskType.class)) {
			case LQNPackage.TASK_TYPE__ACTIVITY_GRAPH:
			case LQNPackage.TASK_TYPE__MULTIPLICITY:
			case LQNPackage.TASK_TYPE__NAME:
			case LQNPackage.TASK_TYPE__PRIORITY:
			case LQNPackage.TASK_TYPE__QUEUE_LENGTH:
			case LQNPackage.TASK_TYPE__REPLICATION:
			case LQNPackage.TASK_TYPE__SCHEDULING:
			case LQNPackage.TASK_TYPE__THINK_TIME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LQNPackage.TASK_TYPE__RESULT_TASK:
			case LQNPackage.TASK_TYPE__ENTRY:
			case LQNPackage.TASK_TYPE__SERVICE:
			case LQNPackage.TASK_TYPE__TASK_ACTIVITIES:
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
				(LQNPackage.Literals.TASK_TYPE__RESULT_TASK,
				 LQNFactory.eINSTANCE.createOutputResultType()));

		newChildDescriptors.add
			(createChildParameter
				(LQNPackage.Literals.TASK_TYPE__ENTRY,
				 LQNFactory.eINSTANCE.createEntryType()));

		newChildDescriptors.add
			(createChildParameter
				(LQNPackage.Literals.TASK_TYPE__SERVICE,
				 LQNFactory.eINSTANCE.createServiceType()));

		newChildDescriptors.add
			(createChildParameter
				(LQNPackage.Literals.TASK_TYPE__TASK_ACTIVITIES,
				 LQNFactory.eINSTANCE.createTaskActivityGraph()));
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
