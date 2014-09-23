/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.emf.provider;


import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNFactory;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.PrecedenceType;

import de.uni_stuttgart.iste.cowolf.model.commonBase.emf.provider.IDBaseItemProvider;

import de.uni_stuttgart.iste.cowolf.model.lqn.emf.provider.LQNEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.PrecedenceType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PrecedenceTypeItemProvider extends IDBaseItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrecedenceTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(LQNPackage.Literals.PRECEDENCE_TYPE__PRE);
			childrenFeatures.add(LQNPackage.Literals.PRECEDENCE_TYPE__PRE_OR);
			childrenFeatures.add(LQNPackage.Literals.PRECEDENCE_TYPE__PRE_AND);
			childrenFeatures.add(LQNPackage.Literals.PRECEDENCE_TYPE__POST);
			childrenFeatures.add(LQNPackage.Literals.PRECEDENCE_TYPE__POST_OR);
			childrenFeatures.add(LQNPackage.Literals.PRECEDENCE_TYPE__POST_AND);
			childrenFeatures.add(LQNPackage.Literals.PRECEDENCE_TYPE__POST_LOOP);
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
	 * This returns PrecedenceType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PrecedenceType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_PrecedenceType_type");
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

		switch (notification.getFeatureID(PrecedenceType.class)) {
			case LQNPackage.PRECEDENCE_TYPE__PRE:
			case LQNPackage.PRECEDENCE_TYPE__PRE_OR:
			case LQNPackage.PRECEDENCE_TYPE__PRE_AND:
			case LQNPackage.PRECEDENCE_TYPE__POST:
			case LQNPackage.PRECEDENCE_TYPE__POST_OR:
			case LQNPackage.PRECEDENCE_TYPE__POST_AND:
			case LQNPackage.PRECEDENCE_TYPE__POST_LOOP:
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
				(LQNPackage.Literals.PRECEDENCE_TYPE__PRE,
				 LQNFactory.eINSTANCE.createSingleActivityListType()));

		newChildDescriptors.add
			(createChildParameter
				(LQNPackage.Literals.PRECEDENCE_TYPE__PRE_OR,
				 LQNFactory.eINSTANCE.createActivityListType()));

		newChildDescriptors.add
			(createChildParameter
				(LQNPackage.Literals.PRECEDENCE_TYPE__PRE_AND,
				 LQNFactory.eINSTANCE.createAndJoinListType()));

		newChildDescriptors.add
			(createChildParameter
				(LQNPackage.Literals.PRECEDENCE_TYPE__POST,
				 LQNFactory.eINSTANCE.createSingleActivityListType()));

		newChildDescriptors.add
			(createChildParameter
				(LQNPackage.Literals.PRECEDENCE_TYPE__POST_OR,
				 LQNFactory.eINSTANCE.createOrListType()));

		newChildDescriptors.add
			(createChildParameter
				(LQNPackage.Literals.PRECEDENCE_TYPE__POST_AND,
				 LQNFactory.eINSTANCE.createActivityListType()));

		newChildDescriptors.add
			(createChildParameter
				(LQNPackage.Literals.PRECEDENCE_TYPE__POST_LOOP,
				 LQNFactory.eINSTANCE.createActivityLoopListType()));
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
			childFeature == LQNPackage.Literals.PRECEDENCE_TYPE__PRE ||
			childFeature == LQNPackage.Literals.PRECEDENCE_TYPE__POST ||
			childFeature == LQNPackage.Literals.PRECEDENCE_TYPE__PRE_OR ||
			childFeature == LQNPackage.Literals.PRECEDENCE_TYPE__POST_AND;

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
