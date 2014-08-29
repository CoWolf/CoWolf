/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.emf.provider;


import de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNFactory;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;

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
 * This is the item provider adapter for a {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.ActivityDefBase} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityDefBaseItemProvider extends IDBaseItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDefBaseItemProvider(AdapterFactory adapterFactory) {
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

			addCallOrderPropertyDescriptor(object);
			addHostDemandCvsqPropertyDescriptor(object);
			addHostDemandMeanPropertyDescriptor(object);
			addMaxServiceTimePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addThinkTimePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Call Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCallOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityDefBase_callOrder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityDefBase_callOrder_feature", "_UI_ActivityDefBase_type"),
				 LQNPackage.Literals.ACTIVITY_DEF_BASE__CALL_ORDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Demand Cvsq feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostDemandCvsqPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityDefBase_hostDemandCvsq_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityDefBase_hostDemandCvsq_feature", "_UI_ActivityDefBase_type"),
				 LQNPackage.Literals.ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host Demand Mean feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostDemandMeanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityDefBase_hostDemandMean_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityDefBase_hostDemandMean_feature", "_UI_ActivityDefBase_type"),
				 LQNPackage.Literals.ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Service Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxServiceTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityDefBase_maxServiceTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityDefBase_maxServiceTime_feature", "_UI_ActivityDefBase_type"),
				 LQNPackage.Literals.ACTIVITY_DEF_BASE__MAX_SERVICE_TIME,
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
				 getString("_UI_ActivityDefBase_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityDefBase_name_feature", "_UI_ActivityDefBase_type"),
				 LQNPackage.Literals.ACTIVITY_DEF_BASE__NAME,
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
				 getString("_UI_ActivityDefBase_thinkTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityDefBase_thinkTime_feature", "_UI_ActivityDefBase_type"),
				 LQNPackage.Literals.ACTIVITY_DEF_BASE__THINK_TIME,
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
			childrenFeatures.add(LQNPackage.Literals.ACTIVITY_DEF_BASE__RESULT_JOIN_DELAY);
			childrenFeatures.add(LQNPackage.Literals.ACTIVITY_DEF_BASE__RESULT_FORWARDING);
			childrenFeatures.add(LQNPackage.Literals.ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION);
			childrenFeatures.add(LQNPackage.Literals.ACTIVITY_DEF_BASE__RESULT_ACTIVITY);
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
	 * This returns ActivityDefBase.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ActivityDefBase"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ActivityDefBase)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ActivityDefBase_type") :
			getString("_UI_ActivityDefBase_type") + " " + label;
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

		switch (notification.getFeatureID(ActivityDefBase.class)) {
			case LQNPackage.ACTIVITY_DEF_BASE__CALL_ORDER:
			case LQNPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_CVSQ:
			case LQNPackage.ACTIVITY_DEF_BASE__HOST_DEMAND_MEAN:
			case LQNPackage.ACTIVITY_DEF_BASE__MAX_SERVICE_TIME:
			case LQNPackage.ACTIVITY_DEF_BASE__NAME:
			case LQNPackage.ACTIVITY_DEF_BASE__THINK_TIME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LQNPackage.ACTIVITY_DEF_BASE__RESULT_JOIN_DELAY:
			case LQNPackage.ACTIVITY_DEF_BASE__RESULT_FORWARDING:
			case LQNPackage.ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION:
			case LQNPackage.ACTIVITY_DEF_BASE__RESULT_ACTIVITY:
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
				(LQNPackage.Literals.ACTIVITY_DEF_BASE__RESULT_JOIN_DELAY,
				 LQNFactory.eINSTANCE.createOutputResultForwardingANDJoinDelay()));

		newChildDescriptors.add
			(createChildParameter
				(LQNPackage.Literals.ACTIVITY_DEF_BASE__RESULT_FORWARDING,
				 LQNFactory.eINSTANCE.createOutputResultForwardingANDJoinDelay()));

		newChildDescriptors.add
			(createChildParameter
				(LQNPackage.Literals.ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION,
				 LQNFactory.eINSTANCE.createOutputDistributionType()));

		newChildDescriptors.add
			(createChildParameter
				(LQNPackage.Literals.ACTIVITY_DEF_BASE__SERVICE_TIME_DISTRIBUTION,
				 LQNFactory.eINSTANCE.createOutputEntryDistributionType()));

		newChildDescriptors.add
			(createChildParameter
				(LQNPackage.Literals.ACTIVITY_DEF_BASE__RESULT_ACTIVITY,
				 LQNFactory.eINSTANCE.createOutputResultType()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == LQNPackage.Literals.ACTIVITY_DEF_BASE__RESULT_JOIN_DELAY ||
			childFeature == LQNPackage.Literals.ACTIVITY_DEF_BASE__RESULT_FORWARDING;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
