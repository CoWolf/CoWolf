/**
 */
package de.uni_stuttgart.iste.cowolf.model.component_diagram.emf.provider;


import de.uni_stuttgart.iste.cowolf.model.component_diagram.Architecture;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramFactory;
import de.uni_stuttgart.iste.cowolf.model.component_diagram.Component_diagramPackage;

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
 * This is the item provider adapter for a {@link de.uni_stuttgart.iste.cowolf.model.component_diagram.Architecture} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchitectureItemProvider 
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
	public ArchitectureItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Component_diagramPackage.Literals.ARCHITECTURE__COMPONENT);
			childrenFeatures.add(Component_diagramPackage.Literals.ARCHITECTURE__CONNECTORS);
			childrenFeatures.add(Component_diagramPackage.Literals.ARCHITECTURE__PORTS);
			childrenFeatures.add(Component_diagramPackage.Literals.ARCHITECTURE__INSTANCES);
			childrenFeatures.add(Component_diagramPackage.Literals.ARCHITECTURE__PORT_TYPE);
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
	 * This returns Architecture.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Architecture"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Architecture_type");
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

		switch (notification.getFeatureID(Architecture.class)) {
			case Component_diagramPackage.ARCHITECTURE__COMPONENT:
			case Component_diagramPackage.ARCHITECTURE__CONNECTORS:
			case Component_diagramPackage.ARCHITECTURE__PORTS:
			case Component_diagramPackage.ARCHITECTURE__INSTANCES:
			case Component_diagramPackage.ARCHITECTURE__PORT_TYPE:
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
				(Component_diagramPackage.Literals.ARCHITECTURE__COMPONENT,
				 Component_diagramFactory.eINSTANCE.createHardwareComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Component_diagramPackage.Literals.ARCHITECTURE__COMPONENT,
				 Component_diagramFactory.eINSTANCE.createSoftwareComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Component_diagramPackage.Literals.ARCHITECTURE__COMPONENT,
				 Component_diagramFactory.eINSTANCE.createElectronicDevice()));

		newChildDescriptors.add
			(createChildParameter
				(Component_diagramPackage.Literals.ARCHITECTURE__COMPONENT,
				 Component_diagramFactory.eINSTANCE.createMechanicalDevice()));

		newChildDescriptors.add
			(createChildParameter
				(Component_diagramPackage.Literals.ARCHITECTURE__COMPONENT,
				 Component_diagramFactory.eINSTANCE.createActuator()));

		newChildDescriptors.add
			(createChildParameter
				(Component_diagramPackage.Literals.ARCHITECTURE__COMPONENT,
				 Component_diagramFactory.eINSTANCE.createSensor()));

		newChildDescriptors.add
			(createChildParameter
				(Component_diagramPackage.Literals.ARCHITECTURE__CONNECTORS,
				 Component_diagramFactory.eINSTANCE.createConnector()));

		newChildDescriptors.add
			(createChildParameter
				(Component_diagramPackage.Literals.ARCHITECTURE__PORTS,
				 Component_diagramFactory.eINSTANCE.createPortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Component_diagramPackage.Literals.ARCHITECTURE__INSTANCES,
				 Component_diagramFactory.eINSTANCE.createComponentInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Component_diagramPackage.Literals.ARCHITECTURE__PORT_TYPE,
				 Component_diagramFactory.eINSTANCE.createPortType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Component_diagramEditPlugin.INSTANCE;
	}

}
