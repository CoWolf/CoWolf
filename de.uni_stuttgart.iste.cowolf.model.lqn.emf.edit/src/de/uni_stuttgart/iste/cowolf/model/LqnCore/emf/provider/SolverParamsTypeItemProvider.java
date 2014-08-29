/**
 */
package de.uni_stuttgart.iste.cowolf.model.LqnCore.emf.provider;


import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNFactory;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.LQNPackage;
import de.uni_stuttgart.iste.cowolf.model.LqnCore.SolverParamsType;

import de.uni_stuttgart.iste.cowolf.model.commonBase.emf.provider.IDBaseItemProvider;

import de.uni_stuttgart.iste.cowolf.model.lqn.emf.provider.LQNEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.uni_stuttgart.iste.cowolf.model.LqnCore.SolverParamsType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SolverParamsTypeItemProvider extends IDBaseItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolverParamsTypeItemProvider(AdapterFactory adapterFactory) {
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

			addCommentPropertyDescriptor(object);
			addConvValPropertyDescriptor(object);
			addItLimitPropertyDescriptor(object);
			addPrintIntPropertyDescriptor(object);
			addUnderrelaxCoeffPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverParamsType_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverParamsType_comment_feature", "_UI_SolverParamsType_type"),
				 LQNPackage.Literals.SOLVER_PARAMS_TYPE__COMMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conv Val feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConvValPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverParamsType_convVal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverParamsType_convVal_feature", "_UI_SolverParamsType_type"),
				 LQNPackage.Literals.SOLVER_PARAMS_TYPE__CONV_VAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the It Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addItLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverParamsType_itLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverParamsType_itLimit_feature", "_UI_SolverParamsType_type"),
				 LQNPackage.Literals.SOLVER_PARAMS_TYPE__IT_LIMIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Print Int feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrintIntPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverParamsType_printInt_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverParamsType_printInt_feature", "_UI_SolverParamsType_type"),
				 LQNPackage.Literals.SOLVER_PARAMS_TYPE__PRINT_INT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Underrelax Coeff feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnderrelaxCoeffPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolverParamsType_underrelaxCoeff_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolverParamsType_underrelaxCoeff_feature", "_UI_SolverParamsType_type"),
				 LQNPackage.Literals.SOLVER_PARAMS_TYPE__UNDERRELAX_COEFF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(LQNPackage.Literals.SOLVER_PARAMS_TYPE__RESULT_GENERAL);
			childrenFeatures.add(LQNPackage.Literals.SOLVER_PARAMS_TYPE__PRAGMA);
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
	 * This returns SolverParamsType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SolverParamsType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SolverParamsType)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_SolverParamsType_type") :
			getString("_UI_SolverParamsType_type") + " " + label;
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

		switch (notification.getFeatureID(SolverParamsType.class)) {
			case LQNPackage.SOLVER_PARAMS_TYPE__COMMENT:
			case LQNPackage.SOLVER_PARAMS_TYPE__CONV_VAL:
			case LQNPackage.SOLVER_PARAMS_TYPE__IT_LIMIT:
			case LQNPackage.SOLVER_PARAMS_TYPE__PRINT_INT:
			case LQNPackage.SOLVER_PARAMS_TYPE__UNDERRELAX_COEFF:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LQNPackage.SOLVER_PARAMS_TYPE__RESULT_GENERAL:
			case LQNPackage.SOLVER_PARAMS_TYPE__PRAGMA:
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
				(LQNPackage.Literals.SOLVER_PARAMS_TYPE__RESULT_GENERAL,
				 LQNFactory.eINSTANCE.createResultGeneralType()));

		newChildDescriptors.add
			(createChildParameter
				(LQNPackage.Literals.SOLVER_PARAMS_TYPE__PRAGMA,
				 LQNFactory.eINSTANCE.createPragmaType()));
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
