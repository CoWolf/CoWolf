/**
 */
package de.uni_stuttgart.iste.cowolf.model.statechart.provider;

import de.uni_stuttgart.iste.cowolf.model.commonBase.emf.provider.IDBaseItemProvider;
import de.uni_stuttgart.iste.cowolf.model.statechart.StateMachine;
import de.uni_stuttgart.iste.cowolf.model.statechart.StatemachineFactory;
import de.uni_stuttgart.iste.cowolf.model.statechart.StatemachinePackage;
import de.uni_stuttgart.iste.cowolf.model.statechart.Transition;
import de.uni_stuttgart.iste.cowolf.model.statechart.State;
import de.uni_stuttgart.iste.cowolf.model.statechart.emf.provider.StatemachineEditPlugin;
import de.uni_stuttgart.iste.cowolf.model.statechart.impl.StateMachineImpl;
import de.uni_stuttgart.iste.cowolf.model.statechart.impl.StateVertexImpl;
import de.uni_stuttgart.iste.cowolf.model.statechart.impl.TransitionImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a
 * {@link de.uni_stuttgart.iste.cowolf.model.statechart.Transition} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class TransitionItemProvider extends IDBaseItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TransitionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSourcePropertyDescriptor(object);
			addTargetPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	// /**
	// * This adds a property descriptor for the Source feature.
	// * <!-- begin-user-doc -->
	// * <!-- end-user-doc -->
	// * @generated
	// */
	// protected void addSourcePropertyDescriptor(Object object) {
	// itemPropertyDescriptors.add
	// (createItemPropertyDescriptor
	// (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
	// getResourceLocator(),
	// getString("_UI_Transition_source_feature"),
	// getString("_UI_PropertyDescriptor_description",
	// "_UI_Transition_source_feature", "_UI_Transition_type"),
	// StatemachinePackage.Literals.TRANSITION__SOURCE,
	// true,
	// false,
	// true,
	// null,
	// null,
	// null));
	// }

	// /**
	// * This adds a property descriptor for the Source feature.
	// * <!-- begin-user-doc -->
	// * <!-- end-user-doc -->
	// * @generated
	// */
	// protected void addSourcePropertyDescriptor(Object object) {
	// itemPropertyDescriptors.add (
	// new ItemPropertyDescriptor(
	// ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
	// getRootAdapterFactory(),
	// getString("_UI_Transition_source_feature"),
	// getString("_UI_PropertyDescriptor_description",
	// "_UI_Transition_source_feature", "_UI_Transition_type"),
	// StatemachinePackage.eINSTANCE.getTransition_TransSM_container()){
	//
	// });
	// }

	/**
	 * @generated NOT
	 */
	protected void addSourcePropertyDescriptor(Object object) {
	  itemPropertyDescriptors.add(
	    new ItemPropertyDescriptor(
	    		((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
	    		getString("_UI_Transition_source_feature"),
	    		getString("_UI_PropertyDescriptor_description", "_UI_Transition_source_feature", "_UI_Transition_type"),
	    		StatemachinePackage.eINSTANCE.getTransition_Source(),
	      true)
	    {
		  protected Collection getComboBoxObjects(Object object) {
		  
			TransitionImpl transition = (TransitionImpl)object;
			StateMachine sMachine = transition.getTransSM_container(); 	  
			ArrayList result = new ArrayList();
			result.addAll(sMachine.getTop());
			result.remove(transition);
	        return result;

	    }});
	}

	/**
	 * This adds a property descriptor for the Target feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		  itemPropertyDescriptors.add(
		    new ItemPropertyDescriptor(
		    		((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
		    		getString("_UI_Transition_target_feature"),
		    		getString("_UI_PropertyDescriptor_description",
							"_UI_Transition_target_feature",
							"_UI_Transition_type"),
					StatemachinePackage.eINSTANCE.getTransition_Target(),
		      true)
		    {
			  protected Collection getComboBoxObjects(Object object) {
			  
				TransitionImpl transition = (TransitionImpl)object;
				StateMachine sMachine = transition.getTransSM_container(); 	  
				ArrayList result = new ArrayList();
				result.addAll(sMachine.getTop());
				result.remove(transition);
		        return result;

		    }});
		}

	/**
	 * This adds a property descriptor for the Description feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Transition_description_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Transition_description_feature",
						"_UI_Transition_type"),
				StatemachinePackage.Literals.TRANSITION__DESCRIPTION, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to
	 * deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand},
	 * {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in
	 * {@link #createCommand}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
					.add(StatemachinePackage.Literals.TRANSITION__TRIGGER);
			childrenFeatures
					.add(StatemachinePackage.Literals.TRANSITION__GUARD);
			childrenFeatures
					.add(StatemachinePackage.Literals.TRANSITION__ACTION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper
		// feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Transition.gif. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/Transition"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Transition) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_Transition_type")
				: getString("_UI_Transition_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Transition.class)) {
		case StatemachinePackage.TRANSITION__DESCRIPTION:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		case StatemachinePackage.TRANSITION__TRIGGER:
		case StatemachinePackage.TRANSITION__GUARD:
		case StatemachinePackage.TRANSITION__ACTION:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(
				StatemachinePackage.Literals.TRANSITION__TRIGGER,
				StatemachineFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add(createChildParameter(
				StatemachinePackage.Literals.TRANSITION__GUARD,
				StatemachineFactory.eINSTANCE.createGuard()));

		newChildDescriptors.add(createChildParameter(
				StatemachinePackage.Literals.TRANSITION__ACTION,
				StatemachineFactory.eINSTANCE.createTransitionAction()));
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return StatemachineEditPlugin.INSTANCE;
	}

}
