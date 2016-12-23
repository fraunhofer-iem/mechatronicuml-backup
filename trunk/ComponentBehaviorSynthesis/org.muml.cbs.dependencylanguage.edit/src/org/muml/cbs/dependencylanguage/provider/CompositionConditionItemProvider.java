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
import org.muml.cbs.dependencylanguage.CompositionCondition;
import org.muml.cbs.dependencylanguage.DependencylanguageFactory;
import org.muml.cbs.dependencylanguage.DependencylanguagePackage;
import org.muml.core.expressions.common.LogicOperator;

/**
 * This is the item provider adapter for a {@link org.muml.cbs.dependencylanguage.CompositionCondition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositionConditionItemProvider
	extends ConditionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionConditionItemProvider(AdapterFactory adapterFactory) {
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

			addKindPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompositionCondition_kind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompositionCondition_kind_feature", "_UI_CompositionCondition_type"),
				 DependencylanguagePackage.Literals.COMPOSITION_CONDITION__KIND,
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
			childrenFeatures.add(DependencylanguagePackage.Literals.COMPOSITION_CONDITION__LEFT_CONDITION);
			childrenFeatures.add(DependencylanguagePackage.Literals.COMPOSITION_CONDITION__RIGHT_CONDITION);
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
	 * This returns CompositionCondition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CompositionCondition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		LogicOperator labelValue = ((CompositionCondition)object).getKind();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_CompositionCondition_type") :
			getString("_UI_CompositionCondition_type") + " " + label;
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

		switch (notification.getFeatureID(CompositionCondition.class)) {
			case DependencylanguagePackage.COMPOSITION_CONDITION__KIND:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DependencylanguagePackage.COMPOSITION_CONDITION__LEFT_CONDITION:
			case DependencylanguagePackage.COMPOSITION_CONDITION__RIGHT_CONDITION:
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
				(DependencylanguagePackage.Literals.COMPOSITION_CONDITION__LEFT_CONDITION,
				 DependencylanguageFactory.eINSTANCE.createStateStatusCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.COMPOSITION_CONDITION__LEFT_CONDITION,
				 DependencylanguageFactory.eINSTANCE.createEventConstrainedIntervalCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.COMPOSITION_CONDITION__LEFT_CONDITION,
				 DependencylanguageFactory.eINSTANCE.createClockCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.COMPOSITION_CONDITION__LEFT_CONDITION,
				 DependencylanguageFactory.eINSTANCE.createAuxiliaryClockCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.COMPOSITION_CONDITION__LEFT_CONDITION,
				 DependencylanguageFactory.eINSTANCE.createHybridClockCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.COMPOSITION_CONDITION__LEFT_CONDITION,
				 DependencylanguageFactory.eINSTANCE.createBasicClockCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.COMPOSITION_CONDITION__LEFT_CONDITION,
				 DependencylanguageFactory.eINSTANCE.createDataCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.COMPOSITION_CONDITION__LEFT_CONDITION,
				 DependencylanguageFactory.eINSTANCE.createCompositionCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.COMPOSITION_CONDITION__RIGHT_CONDITION,
				 DependencylanguageFactory.eINSTANCE.createStateStatusCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.COMPOSITION_CONDITION__RIGHT_CONDITION,
				 DependencylanguageFactory.eINSTANCE.createEventConstrainedIntervalCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.COMPOSITION_CONDITION__RIGHT_CONDITION,
				 DependencylanguageFactory.eINSTANCE.createClockCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.COMPOSITION_CONDITION__RIGHT_CONDITION,
				 DependencylanguageFactory.eINSTANCE.createAuxiliaryClockCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.COMPOSITION_CONDITION__RIGHT_CONDITION,
				 DependencylanguageFactory.eINSTANCE.createHybridClockCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.COMPOSITION_CONDITION__RIGHT_CONDITION,
				 DependencylanguageFactory.eINSTANCE.createBasicClockCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.COMPOSITION_CONDITION__RIGHT_CONDITION,
				 DependencylanguageFactory.eINSTANCE.createDataCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.COMPOSITION_CONDITION__RIGHT_CONDITION,
				 DependencylanguageFactory.eINSTANCE.createCompositionCondition()));
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
			childFeature == DependencylanguagePackage.Literals.COMPOSITION_CONDITION__LEFT_CONDITION ||
			childFeature == DependencylanguagePackage.Literals.COMPOSITION_CONDITION__RIGHT_CONDITION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
