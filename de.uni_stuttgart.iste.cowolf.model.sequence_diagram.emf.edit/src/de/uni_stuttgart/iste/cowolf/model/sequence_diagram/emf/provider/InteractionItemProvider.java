/**
 */
package de.uni_stuttgart.iste.cowolf.model.sequence_diagram.emf.provider;


import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Interaction;
import de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Sequence_diagramFactory;
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

import org.eclipse.uml2.uml.edit.providers.BehaviorItemProvider;

/**
 * This is the item provider adapter for a {@link de.uni_stuttgart.iste.cowolf.model.sequence_diagram.Interaction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InteractionItemProvider extends BehaviorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionItemProvider(AdapterFactory adapterFactory) {
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

			addCoveredPropertyDescriptor(object);
			addEnclosingOperandPropertyDescriptor(object);
			addEnclosingInteractionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Covered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoveredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InteractionFragment_covered_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InteractionFragment_covered_feature", "_UI_InteractionFragment_type"),
				 Sequence_diagramPackage.Literals.INTERACTION_FRAGMENT__COVERED,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enclosing Operand feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnclosingOperandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InteractionFragment_enclosingOperand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InteractionFragment_enclosingOperand_feature", "_UI_InteractionFragment_type"),
				 Sequence_diagramPackage.Literals.INTERACTION_FRAGMENT__ENCLOSING_OPERAND,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enclosing Interaction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnclosingInteractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InteractionFragment_enclosingInteraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InteractionFragment_enclosingInteraction_feature", "_UI_InteractionFragment_type"),
				 Sequence_diagramPackage.Literals.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION,
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
			childrenFeatures.add(Sequence_diagramPackage.Literals.INTERACTION_FRAGMENT__GENERAL_ORDERING);
			childrenFeatures.add(Sequence_diagramPackage.Literals.INTERACTION__LIFELINE);
			childrenFeatures.add(Sequence_diagramPackage.Literals.INTERACTION__FRAGMENT);
			childrenFeatures.add(Sequence_diagramPackage.Literals.INTERACTION__ACTION);
			childrenFeatures.add(Sequence_diagramPackage.Literals.INTERACTION__FORMAL_GATE);
			childrenFeatures.add(Sequence_diagramPackage.Literals.INTERACTION__MESSAGE);
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
	 * This returns Interaction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Interaction"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Interaction)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Interaction_type") :
			getString("_UI_Interaction_type") + " " + label;
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

		switch (notification.getFeatureID(Interaction.class)) {
			case Sequence_diagramPackage.INTERACTION__GENERAL_ORDERING:
			case Sequence_diagramPackage.INTERACTION__LIFELINE:
			case Sequence_diagramPackage.INTERACTION__FRAGMENT:
			case Sequence_diagramPackage.INTERACTION__ACTION:
			case Sequence_diagramPackage.INTERACTION__FORMAL_GATE:
			case Sequence_diagramPackage.INTERACTION__MESSAGE:
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
				(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR,
				 Sequence_diagramFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR,
				 Sequence_diagramFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 Sequence_diagramFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER,
				 Sequence_diagramFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION_FRAGMENT__GENERAL_ORDERING,
				 UMLFactory.eINSTANCE.createGeneralOrdering()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__LIFELINE,
				 Sequence_diagramFactory.eINSTANCE.createLifeline()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__FRAGMENT,
				 Sequence_diagramFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createStructuredActivityNode()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createValueSpecificationAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createAcceptEventAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createAcceptCallAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createAddStructuralFeatureValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createAddVariableValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createBroadcastSignalAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createCallBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createCallOperationAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createClearAssociationAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createClearStructuralFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createClearVariableAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createConditionalNode()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createCreateLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createCreateLinkObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createCreateObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createDestroyLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createDestroyObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createExpansionRegion()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createLoopNode()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createOpaqueAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createRaiseExceptionAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createReadExtentAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createReadIsClassifiedObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createReadLinkAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createReadLinkObjectEndAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createReadLinkObjectEndQualifierAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createReadSelfAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createReadStructuralFeatureAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createReadVariableAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createReclassifyObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createReduceAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createRemoveStructuralFeatureValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createRemoveVariableValueAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createReplyAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createSendObjectAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createSendSignalAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createSequenceNode()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createStartClassifierBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createStartObjectBehaviorAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createTestIdentityAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__ACTION,
				 UMLFactory.eINSTANCE.createUnmarshallAction()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__FORMAL_GATE,
				 Sequence_diagramFactory.eINSTANCE.createGate()));

		newChildDescriptors.add
			(createChildParameter
				(Sequence_diagramPackage.Literals.INTERACTION__MESSAGE,
				 Sequence_diagramFactory.eINSTANCE.createMessage()));
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
			childFeature == UMLPackage.Literals.NAMESPACE__OWNED_RULE ||
			childFeature == UMLPackage.Literals.BEHAVIOR__POSTCONDITION ||
			childFeature == UMLPackage.Literals.BEHAVIOR__PRECONDITION ||
			childFeature == UMLPackage.Literals.CLASSIFIER__COLLABORATION_USE ||
			childFeature == UMLPackage.Literals.CLASSIFIER__REPRESENTATION ||
			childFeature == UMLPackage.Literals.CLASSIFIER__OWNED_USE_CASE ||
			childFeature == UMLPackage.Literals.CLASS__NESTED_CLASSIFIER ||
			childFeature == UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE ||
			childFeature == UMLPackage.Literals.ENCAPSULATED_CLASSIFIER__OWNED_PORT ||
			childFeature == UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR ||
			childFeature == UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR ||
			childFeature == Sequence_diagramPackage.Literals.INTERACTION__FRAGMENT;

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
