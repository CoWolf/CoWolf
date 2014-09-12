/**
 */
package de.uni_stuttgart.iste.cowolf.model.sequence_diagram.emf.provider;


import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Lifeline;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.providers.NamedElementItemProvider;

/**
 * This is the item provider adapter for a {@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Lifeline} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LifelineItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifelineItemProvider(AdapterFactory adapterFactory) {
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

			addDecomposedAsPropertyDescriptor(object);
			addInteractionPropertyDescriptor(object);
			addRepresentsPropertyDescriptor(object);
			addCoveredByPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Decomposed As feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecomposedAsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lifeline_decomposedAs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lifeline_decomposedAs_feature", "_UI_Lifeline_type"),
				 Sequence_diagramPackage.Literals.LIFELINE__DECOMPOSED_AS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interaction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInteractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lifeline_interaction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lifeline_interaction_feature", "_UI_Lifeline_type"),
				 Sequence_diagramPackage.Literals.LIFELINE__INTERACTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Represents feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepresentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lifeline_represents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lifeline_represents_feature", "_UI_Lifeline_type"),
				 Sequence_diagramPackage.Literals.LIFELINE__REPRESENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Covered By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoveredByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lifeline_coveredBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lifeline_coveredBy_feature", "_UI_Lifeline_type"),
				 Sequence_diagramPackage.Literals.LIFELINE__COVERED_BY,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(Sequence_diagramPackage.Literals.LIFELINE__SELECTOR);
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
	 * This returns Lifeline.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Lifeline"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Lifeline)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Lifeline_type") :
			getString("_UI_Lifeline_type") + " " + label;
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

		switch (notification.getFeatureID(Lifeline.class)) {
			case Sequence_diagramPackage.LIFELINE__SELECTOR:
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
				(Sequence_diagramPackage.Literals.LIFELINE__SELECTOR,
				 UMLFactory.eINSTANCE.createOpaqueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.LIFELINE__SELECTOR,
				 UMLFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.LIFELINE__SELECTOR,
				 UMLFactory.eINSTANCE.createStringExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.LIFELINE__SELECTOR,
				 UMLFactory.eINSTANCE.createInstanceValue()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.LIFELINE__SELECTOR,
				 UMLFactory.eINSTANCE.createTimeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.LIFELINE__SELECTOR,
				 UMLFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.LIFELINE__SELECTOR,
				 UMLFactory.eINSTANCE.createInterval()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.LIFELINE__SELECTOR,
				 UMLFactory.eINSTANCE.createDurationInterval()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.LIFELINE__SELECTOR,
				 UMLFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.LIFELINE__SELECTOR,
				 UMLFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.LIFELINE__SELECTOR,
				 UMLFactory.eINSTANCE.createLiteralNull()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.LIFELINE__SELECTOR,
				 UMLFactory.eINSTANCE.createLiteralReal()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.LIFELINE__SELECTOR,
				 UMLFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.LIFELINE__SELECTOR,
				 UMLFactory.eINSTANCE.createLiteralUnlimitedNatural()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.LIFELINE__SELECTOR,
				 UMLFactory.eINSTANCE.createTimeInterval()));
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
			childFeature == UMLPackage.Literals.NAMED_ELEMENT__NAME_EXPRESSION ||
			childFeature == Sequence_diagramPackage.Literals.LIFELINE__SELECTOR;

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
		return Sequence_diagramEditPlugin.INSTANCE;
	}

}
