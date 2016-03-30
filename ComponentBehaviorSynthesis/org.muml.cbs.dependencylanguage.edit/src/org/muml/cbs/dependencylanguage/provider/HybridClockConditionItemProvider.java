/**
 */
package org.muml.cbs.dependencylanguage.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.cbs.dependencylanguage.DependencylanguageFactory;
import org.muml.cbs.dependencylanguage.DependencylanguagePackage;
import org.muml.cbs.dependencylanguage.HybridClockCondition;
import org.muml.core.expressions.common.ComparingOperator;
import org.muml.pim.valuetype.ValuetypeFactory;

/**
 * This is the item provider adapter for a {@link org.muml.cbs.dependencylanguage.HybridClockCondition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HybridClockConditionItemProvider
	extends ClockConditionItemProvider
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
	public HybridClockConditionItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_HybridClockCondition_operator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HybridClockCondition_operator_feature", "_UI_HybridClockCondition_type"),
				 DependencylanguagePackage.Literals.HYBRID_CLOCK_CONDITION__OPERATOR,
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
			childrenFeatures.add(DependencylanguagePackage.Literals.HYBRID_CLOCK_CONDITION__CONDITION);
			childrenFeatures.add(DependencylanguagePackage.Literals.HYBRID_CLOCK_CONDITION__BOUND);
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
	 * This returns HybridClockCondition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HybridClockCondition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ComparingOperator labelValue = ((HybridClockCondition)object).getOperator();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_HybridClockCondition_type") :
			getString("_UI_HybridClockCondition_type") + " " + label;
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

		switch (notification.getFeatureID(HybridClockCondition.class)) {
			case DependencylanguagePackage.HYBRID_CLOCK_CONDITION__OPERATOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DependencylanguagePackage.HYBRID_CLOCK_CONDITION__CONDITION:
			case DependencylanguagePackage.HYBRID_CLOCK_CONDITION__BOUND:
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
				(DependencylanguagePackage.Literals.HYBRID_CLOCK_CONDITION__CONDITION,
				 DependencylanguageFactory.eINSTANCE.createStateStatusCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.HYBRID_CLOCK_CONDITION__CONDITION,
				 DependencylanguageFactory.eINSTANCE.createEventConstrainedIntervalCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.HYBRID_CLOCK_CONDITION__CONDITION,
				 DependencylanguageFactory.eINSTANCE.createClockCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.HYBRID_CLOCK_CONDITION__CONDITION,
				 DependencylanguageFactory.eINSTANCE.createAuxiliaryClockCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.HYBRID_CLOCK_CONDITION__CONDITION,
				 DependencylanguageFactory.eINSTANCE.createHybridClockCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.HYBRID_CLOCK_CONDITION__CONDITION,
				 DependencylanguageFactory.eINSTANCE.createBasicClockCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.HYBRID_CLOCK_CONDITION__CONDITION,
				 DependencylanguageFactory.eINSTANCE.createDataCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.HYBRID_CLOCK_CONDITION__CONDITION,
				 DependencylanguageFactory.eINSTANCE.createCompositionCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.HYBRID_CLOCK_CONDITION__BOUND,
				 ValuetypeFactory.eINSTANCE.createTimeValue()));
	}

}
