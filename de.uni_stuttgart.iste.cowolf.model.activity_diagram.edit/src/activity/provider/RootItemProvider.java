/**
 */
package activity.provider;


import activity.ActivityFactory;
import activity.ActivityPackage;
import activity.Root;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link activity.Root} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RootItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ActivityPackage.Literals.ROOT__START);
			childrenFeatures.add(ActivityPackage.Literals.ROOT__ACTION);
			childrenFeatures.add(ActivityPackage.Literals.ROOT__DECISION);
			childrenFeatures.add(ActivityPackage.Literals.ROOT__BAR);
			childrenFeatures.add(ActivityPackage.Literals.ROOT__TRANSITION);
			childrenFeatures.add(ActivityPackage.Literals.ROOT__END);
			childrenFeatures.add(ActivityPackage.Literals.ROOT__CONDITION_ARROW);
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
	 * This returns Root.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Root"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Root_type");
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

		switch (notification.getFeatureID(Root.class)) {
			case ActivityPackage.ROOT__START:
			case ActivityPackage.ROOT__ACTION:
			case ActivityPackage.ROOT__DECISION:
			case ActivityPackage.ROOT__BAR:
			case ActivityPackage.ROOT__TRANSITION:
			case ActivityPackage.ROOT__END:
			case ActivityPackage.ROOT__CONDITION_ARROW:
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
				(ActivityPackage.Literals.ROOT__START,
				 ActivityFactory.eINSTANCE.createStart()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityPackage.Literals.ROOT__ACTION,
				 ActivityFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityPackage.Literals.ROOT__DECISION,
				 ActivityFactory.eINSTANCE.createDecision()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityPackage.Literals.ROOT__BAR,
				 ActivityFactory.eINSTANCE.createBar()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityPackage.Literals.ROOT__BAR,
				 ActivityFactory.eINSTANCE.createSplit()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityPackage.Literals.ROOT__BAR,
				 ActivityFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityPackage.Literals.ROOT__TRANSITION,
				 ActivityFactory.eINSTANCE.createArrow()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityPackage.Literals.ROOT__END,
				 ActivityFactory.eINSTANCE.createEnd()));

		newChildDescriptors.add
			(createChildParameter
				(ActivityPackage.Literals.ROOT__CONDITION_ARROW,
				 ActivityFactory.eINSTANCE.createConditionArrow()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ActivityEditPlugin.INSTANCE;
	}

}
