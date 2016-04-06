/**
 */
package org.muml.cbs.dependencylanguage.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.cbs.dependencylanguage.AuxiliaryClockCondition;
import org.muml.cbs.dependencylanguage.DependencylanguageFactory;
import org.muml.cbs.dependencylanguage.DependencylanguagePackage;
import org.muml.core.expressions.common.ComparingOperator;
import org.muml.pim.valuetype.ValuetypeFactory;

/**
 * This is the item provider adapter for a {@link org.muml.cbs.dependencylanguage.AuxiliaryClockCondition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AuxiliaryClockConditionItemProvider
	extends ClockConditionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryClockConditionItemProvider(AdapterFactory adapterFactory) {
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

			addOperatorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AuxiliaryClockCondition_operator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AuxiliaryClockCondition_operator_feature", "_UI_AuxiliaryClockCondition_type"),
				 DependencylanguagePackage.Literals.AUXILIARY_CLOCK_CONDITION__OPERATOR,
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
			childrenFeatures.add(DependencylanguagePackage.Literals.AUXILIARY_CLOCK_CONDITION__EVENT);
			childrenFeatures.add(DependencylanguagePackage.Literals.AUXILIARY_CLOCK_CONDITION__BOUND);
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
	 * This returns AuxiliaryClockCondition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AuxiliaryClockCondition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ComparingOperator labelValue = ((AuxiliaryClockCondition)object).getOperator();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_AuxiliaryClockCondition_type") :
			getString("_UI_AuxiliaryClockCondition_type") + " " + label;
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

		switch (notification.getFeatureID(AuxiliaryClockCondition.class)) {
			case DependencylanguagePackage.AUXILIARY_CLOCK_CONDITION__OPERATOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DependencylanguagePackage.AUXILIARY_CLOCK_CONDITION__EVENT:
			case DependencylanguagePackage.AUXILIARY_CLOCK_CONDITION__BOUND:
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
				(DependencylanguagePackage.Literals.AUXILIARY_CLOCK_CONDITION__EVENT,
				 DependencylanguageFactory.eINSTANCE.createCompositionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.AUXILIARY_CLOCK_CONDITION__EVENT,
				 DependencylanguageFactory.eINSTANCE.createCountedEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.AUXILIARY_CLOCK_CONDITION__EVENT,
				 DependencylanguageFactory.eINSTANCE.createDelayedEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.AUXILIARY_CLOCK_CONDITION__EVENT,
				 DependencylanguageFactory.eINSTANCE.createSynchronizationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.AUXILIARY_CLOCK_CONDITION__EVENT,
				 DependencylanguageFactory.eINSTANCE.createTransitionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.AUXILIARY_CLOCK_CONDITION__EVENT,
				 DependencylanguageFactory.eINSTANCE.createStateEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.AUXILIARY_CLOCK_CONDITION__EVENT,
				 DependencylanguageFactory.eINSTANCE.createStateCombinationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.AUXILIARY_CLOCK_CONDITION__EVENT,
				 DependencylanguageFactory.eINSTANCE.createMessageEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.AUXILIARY_CLOCK_CONDITION__BOUND,
				 ValuetypeFactory.eINSTANCE.createTimeValue()));
	}

}
