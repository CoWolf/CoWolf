/**
 */
package de.uni_stuttgart.iste.cowolf.model.activity_diagram.emf.provider;


import de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.Activity_diagramFactory;
import de.uni_stuttgart.iste.cowolf.model.activity_diagram.Activity_diagramPackage;

import de.uni_stuttgart.iste.cowolf.model.commonBase.emf.provider.IDBaseItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.uni_stuttgart.iste.cowolf.model.activity_diagram.ActivityDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityDiagramItemProvider extends IDBaseItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDiagramItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Activity_diagramPackage.Literals.ACTIVITY_DIAGRAM__START);
			childrenFeatures.add(Activity_diagramPackage.Literals.ACTIVITY_DIAGRAM__ACTION);
			childrenFeatures.add(Activity_diagramPackage.Literals.ACTIVITY_DIAGRAM__DECISION);
			childrenFeatures.add(Activity_diagramPackage.Literals.ACTIVITY_DIAGRAM__END);
			childrenFeatures.add(Activity_diagramPackage.Literals.ACTIVITY_DIAGRAM__SPLIT);
			childrenFeatures.add(Activity_diagramPackage.Literals.ACTIVITY_DIAGRAM__JOIN);
			childrenFeatures.add(Activity_diagramPackage.Literals.ACTIVITY_DIAGRAM__START_ARROW);
			childrenFeatures.add(Activity_diagramPackage.Literals.ACTIVITY_DIAGRAM__AFTER_ACTION_ARROW);
			childrenFeatures.add(Activity_diagramPackage.Literals.ACTIVITY_DIAGRAM__DECISION_ARROW);
			childrenFeatures.add(Activity_diagramPackage.Literals.ACTIVITY_DIAGRAM__SPLIT_ARROW);
			childrenFeatures.add(Activity_diagramPackage.Literals.ACTIVITY_DIAGRAM__JOIN_ARROW);
			childrenFeatures.add(Activity_diagramPackage.Literals.ACTIVITY_DIAGRAM__ARROW_AFTER_JOIN);
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
	 * This returns ActivityDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ActivityDiagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ActivityDiagram)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_ActivityDiagram_type") :
			getString("_UI_ActivityDiagram_type") + " " + label;
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

		switch (notification.getFeatureID(ActivityDiagram.class)) {
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__START:
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__ACTION:
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__DECISION:
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__END:
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__SPLIT:
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__JOIN:
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__START_ARROW:
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__AFTER_ACTION_ARROW:
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__DECISION_ARROW:
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__SPLIT_ARROW:
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__JOIN_ARROW:
			case Activity_diagramPackage.ACTIVITY_DIAGRAM__ARROW_AFTER_JOIN:
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
				(Activity_diagramPackage.Literals.ACTIVITY_DIAGRAM__START,
				 Activity_diagramFactory.eINSTANCE.createStart()));

		newChildDescriptors.add
			(createChildParameter
				(Activity_diagramPackage.Literals.ACTIVITY_DIAGRAM__ACTION,
				 Activity_diagramFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(Activity_diagramPackage.Literals.ACTIVITY_DIAGRAM__DECISION,
				 Activity_diagramFactory.eINSTANCE.createDecision()));

		newChildDescriptors.add
			(createChildParameter
				(Activity_diagramPackage.Literals.ACTIVITY_DIAGRAM__END,
				 Activity_diagramFactory.eINSTANCE.createEnd()));

		newChildDescriptors.add
			(createChildParameter
				(Activity_diagramPackage.Literals.ACTIVITY_DIAGRAM__SPLIT,
				 Activity_diagramFactory.eINSTANCE.createSplit()));

		newChildDescriptors.add
			(createChildParameter
				(Activity_diagramPackage.Literals.ACTIVITY_DIAGRAM__JOIN,
				 Activity_diagramFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add
			(createChildParameter
				(Activity_diagramPackage.Literals.ACTIVITY_DIAGRAM__START_ARROW,
				 Activity_diagramFactory.eINSTANCE.createArrowAfterStart()));

		newChildDescriptors.add
			(createChildParameter
				(Activity_diagramPackage.Literals.ACTIVITY_DIAGRAM__AFTER_ACTION_ARROW,
				 Activity_diagramFactory.eINSTANCE.createAfterActionArrow()));

		newChildDescriptors.add
			(createChildParameter
				(Activity_diagramPackage.Literals.ACTIVITY_DIAGRAM__DECISION_ARROW,
				 Activity_diagramFactory.eINSTANCE.createDecisionArrow()));

		newChildDescriptors.add
			(createChildParameter
				(Activity_diagramPackage.Literals.ACTIVITY_DIAGRAM__SPLIT_ARROW,
				 Activity_diagramFactory.eINSTANCE.createSplitArrow()));

		newChildDescriptors.add
			(createChildParameter
				(Activity_diagramPackage.Literals.ACTIVITY_DIAGRAM__JOIN_ARROW,
				 Activity_diagramFactory.eINSTANCE.createJoinArrow()));

		newChildDescriptors.add
			(createChildParameter
				(Activity_diagramPackage.Literals.ACTIVITY_DIAGRAM__ARROW_AFTER_JOIN,
				 Activity_diagramFactory.eINSTANCE.createArrowAfterJoin()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Activity_diagramEditPlugin.INSTANCE;
	}

}
