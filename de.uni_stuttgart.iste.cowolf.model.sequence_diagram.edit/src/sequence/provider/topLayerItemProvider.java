/**
 */
package sequence.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import sequence.SequenceFactory;
import sequence.SequencePackage;
import sequence.topLayer;

/**
 * This is the item provider adapter for a {@link sequence.topLayer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class topLayerItemProvider extends ContainerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public topLayerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(SequencePackage.Literals.TOP_LAYER__LIFELINES);
			childrenFeatures.add(SequencePackage.Literals.TOP_LAYER__LOOP_BLOCKS);
			childrenFeatures.add(SequencePackage.Literals.TOP_LAYER__ALT_BLOCKS);
			childrenFeatures.add(SequencePackage.Literals.TOP_LAYER__OPT_BLOCKS);
			childrenFeatures.add(SequencePackage.Literals.TOP_LAYER__ACTORS);
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
	 * This returns topLayer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/topLayer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((topLayer)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_topLayer_type") :
			getString("_UI_topLayer_type") + " " + label;
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

		switch (notification.getFeatureID(topLayer.class)) {
			case SequencePackage.TOP_LAYER__LIFELINES:
			case SequencePackage.TOP_LAYER__LOOP_BLOCKS:
			case SequencePackage.TOP_LAYER__ALT_BLOCKS:
			case SequencePackage.TOP_LAYER__OPT_BLOCKS:
			case SequencePackage.TOP_LAYER__ACTORS:
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
				(SequencePackage.Literals.TOP_LAYER__LIFELINES,
				 SequenceFactory.eINSTANCE.createLifeline()));

		newChildDescriptors.add
			(createChildParameter
				(SequencePackage.Literals.TOP_LAYER__LOOP_BLOCKS,
				 SequenceFactory.eINSTANCE.createLoopBlock()));

		newChildDescriptors.add
			(createChildParameter
				(SequencePackage.Literals.TOP_LAYER__ALT_BLOCKS,
				 SequenceFactory.eINSTANCE.createAltBlock()));

		newChildDescriptors.add
			(createChildParameter
				(SequencePackage.Literals.TOP_LAYER__OPT_BLOCKS,
				 SequenceFactory.eINSTANCE.createoptBlock()));

		newChildDescriptors.add
			(createChildParameter
				(SequencePackage.Literals.TOP_LAYER__ACTORS,
				 SequenceFactory.eINSTANCE.createActor()));
	}

}
