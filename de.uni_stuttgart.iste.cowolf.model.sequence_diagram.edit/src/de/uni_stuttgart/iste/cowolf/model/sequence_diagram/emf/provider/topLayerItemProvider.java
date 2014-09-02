/**
 */
package de.uni_stuttgart.iste.cowolf.model.sequence_diagram.emf.provider;


import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramFactory;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramPackage;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.topLayer;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.topLayer} object.
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
			childrenFeatures.add(Sequence_diagramPackage.Literals.TOP_LAYER__LIFELINES);
			childrenFeatures.add(Sequence_diagramPackage.Literals.TOP_LAYER__LOOP_BLOCKS);
			childrenFeatures.add(Sequence_diagramPackage.Literals.TOP_LAYER__ALT_BLOCKS);
			childrenFeatures.add(Sequence_diagramPackage.Literals.TOP_LAYER__OPT_BLOCKS);
			childrenFeatures.add(Sequence_diagramPackage.Literals.TOP_LAYER__ACTORS);
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
			case Sequence_diagramPackage.TOP_LAYER__LIFELINES:
			case Sequence_diagramPackage.TOP_LAYER__LOOP_BLOCKS:
			case Sequence_diagramPackage.TOP_LAYER__ALT_BLOCKS:
			case Sequence_diagramPackage.TOP_LAYER__OPT_BLOCKS:
			case Sequence_diagramPackage.TOP_LAYER__ACTORS:
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
				(Sequence_diagramPackage.Literals.TOP_LAYER__LIFELINES,
				 Sequence_diagramFactory.eINSTANCE.createLifeline()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.TOP_LAYER__LOOP_BLOCKS,
				 Sequence_diagramFactory.eINSTANCE.createLoopBlock()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.TOP_LAYER__ALT_BLOCKS,
				 Sequence_diagramFactory.eINSTANCE.createAltBlock()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.TOP_LAYER__OPT_BLOCKS,
				 Sequence_diagramFactory.eINSTANCE.createoptBlock()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.TOP_LAYER__ACTORS,
				 Sequence_diagramFactory.eINSTANCE.createActor()));
	}

}
