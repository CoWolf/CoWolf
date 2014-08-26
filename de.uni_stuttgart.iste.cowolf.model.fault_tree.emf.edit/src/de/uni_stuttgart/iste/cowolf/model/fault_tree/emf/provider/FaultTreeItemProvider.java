/**
 */
package de.uni_stuttgart.iste.cowolf.model.fault_tree.emf.provider;


import de.uni_stuttgart.iste.cowolf.model.commonBase.emf.provider.IDBaseItemProvider;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreeFactory;
import de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTreePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.uni_stuttgart.iste.cowolf.model.fault_tree.FaultTree} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FaultTreeItemProvider 
	extends IDBaseItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaultTreeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(FaultTreePackage.Literals.FAULT_TREE__HAZARD);
			childrenFeatures.add(FaultTreePackage.Literals.FAULT_TREE__GATE);
			childrenFeatures.add(FaultTreePackage.Literals.FAULT_TREE__EVENT);
			childrenFeatures.add(FaultTreePackage.Literals.FAULT_TREE__FAILURE_INSTANCE);
			childrenFeatures.add(FaultTreePackage.Literals.FAULT_TREE__FAILURE_TYPE);
			childrenFeatures.add(FaultTreePackage.Literals.FAULT_TREE__ERROR_INSTANCE);
			childrenFeatures.add(FaultTreePackage.Literals.FAULT_TREE__ERROR_TYPE);
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
	 * This returns FaultTree.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FaultTree"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FaultTree)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_FaultTree_type") :
			getString("_UI_FaultTree_type") + " " + label;
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

		switch (notification.getFeatureID(FaultTree.class)) {
			case FaultTreePackage.FAULT_TREE__HAZARD:
			case FaultTreePackage.FAULT_TREE__GATE:
			case FaultTreePackage.FAULT_TREE__EVENT:
			case FaultTreePackage.FAULT_TREE__FAILURE_INSTANCE:
			case FaultTreePackage.FAULT_TREE__FAILURE_TYPE:
			case FaultTreePackage.FAULT_TREE__ERROR_INSTANCE:
			case FaultTreePackage.FAULT_TREE__ERROR_TYPE:
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
				(FaultTreePackage.Literals.FAULT_TREE__HAZARD,
				 FaultTreeFactory.eINSTANCE.createHazard()));

		newChildDescriptors.add
			(createChildParameter
				(FaultTreePackage.Literals.FAULT_TREE__GATE,
				 FaultTreeFactory.eINSTANCE.createOR()));

		newChildDescriptors.add
			(createChildParameter
				(FaultTreePackage.Literals.FAULT_TREE__GATE,
				 FaultTreeFactory.eINSTANCE.createAND()));

		newChildDescriptors.add
			(createChildParameter
				(FaultTreePackage.Literals.FAULT_TREE__GATE,
				 FaultTreeFactory.eINSTANCE.createXOR()));

		newChildDescriptors.add
			(createChildParameter
				(FaultTreePackage.Literals.FAULT_TREE__GATE,
				 FaultTreeFactory.eINSTANCE.createPriorAND()));

		newChildDescriptors.add
			(createChildParameter
				(FaultTreePackage.Literals.FAULT_TREE__GATE,
				 FaultTreeFactory.eINSTANCE.createInhibit()));

		newChildDescriptors.add
			(createChildParameter
				(FaultTreePackage.Literals.FAULT_TREE__EVENT,
				 FaultTreeFactory.eINSTANCE.createHazard()));

		newChildDescriptors.add
			(createChildParameter
				(FaultTreePackage.Literals.FAULT_TREE__EVENT,
				 FaultTreeFactory.eINSTANCE.createIntermediateEvent()));

		newChildDescriptors.add
			(createChildParameter
				(FaultTreePackage.Literals.FAULT_TREE__EVENT,
				 FaultTreeFactory.eINSTANCE.createBasicEvent()));

		newChildDescriptors.add
			(createChildParameter
				(FaultTreePackage.Literals.FAULT_TREE__EVENT,
				 FaultTreeFactory.eINSTANCE.createUndevelopedEvent()));

		newChildDescriptors.add
			(createChildParameter
				(FaultTreePackage.Literals.FAULT_TREE__FAILURE_INSTANCE,
				 FaultTreeFactory.eINSTANCE.createFailureInstance()));

		newChildDescriptors.add
			(createChildParameter
				(FaultTreePackage.Literals.FAULT_TREE__FAILURE_TYPE,
				 FaultTreeFactory.eINSTANCE.createFailureType()));

		newChildDescriptors.add
			(createChildParameter
				(FaultTreePackage.Literals.FAULT_TREE__ERROR_INSTANCE,
				 FaultTreeFactory.eINSTANCE.createErrorInstance()));

		newChildDescriptors.add
			(createChildParameter
				(FaultTreePackage.Literals.FAULT_TREE__ERROR_TYPE,
				 FaultTreeFactory.eINSTANCE.createErrorType()));
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
			childFeature == FaultTreePackage.Literals.FAULT_TREE__HAZARD ||
			childFeature == FaultTreePackage.Literals.FAULT_TREE__EVENT;

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
		return FaultTreeEditPlugin.INSTANCE;
	}

}
