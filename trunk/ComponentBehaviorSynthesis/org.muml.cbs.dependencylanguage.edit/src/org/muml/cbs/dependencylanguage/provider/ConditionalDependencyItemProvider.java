/**
 */
package org.muml.cbs.dependencylanguage.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.cbs.dependencylanguage.ConditionalDependency;
import org.muml.cbs.dependencylanguage.DependencylanguageFactory;
import org.muml.cbs.dependencylanguage.DependencylanguagePackage;

/**
 * This is the item provider adapter for a {@link org.muml.cbs.dependencylanguage.ConditionalDependency} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionalDependencyItemProvider
	extends DependencyItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalDependencyItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(DependencylanguagePackage.Literals.CONDITIONAL_DEPENDENCY__EVENT);
			childrenFeatures.add(DependencylanguagePackage.Literals.CONDITIONAL_DEPENDENCY__CONDITION);
			childrenFeatures.add(DependencylanguagePackage.Literals.CONDITIONAL_DEPENDENCY__EFFECTS);
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
	 * This returns ConditionalDependency.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConditionalDependency"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ConditionalDependency)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_ConditionalDependency_type") :
			getString("_UI_ConditionalDependency_type") + " " + label;
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

		switch (notification.getFeatureID(ConditionalDependency.class)) {
			case DependencylanguagePackage.CONDITIONAL_DEPENDENCY__EVENT:
			case DependencylanguagePackage.CONDITIONAL_DEPENDENCY__CONDITION:
			case DependencylanguagePackage.CONDITIONAL_DEPENDENCY__EFFECTS:
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
				(DependencylanguagePackage.Literals.CONDITIONAL_DEPENDENCY__EVENT,
				 DependencylanguageFactory.eINSTANCE.createCompositionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.CONDITIONAL_DEPENDENCY__EVENT,
				 DependencylanguageFactory.eINSTANCE.createCountedEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.CONDITIONAL_DEPENDENCY__EVENT,
				 DependencylanguageFactory.eINSTANCE.createDelayedEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.CONDITIONAL_DEPENDENCY__EVENT,
				 DependencylanguageFactory.eINSTANCE.createSynchronizationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.CONDITIONAL_DEPENDENCY__EVENT,
				 DependencylanguageFactory.eINSTANCE.createTransitionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.CONDITIONAL_DEPENDENCY__EVENT,
				 DependencylanguageFactory.eINSTANCE.createStateEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.CONDITIONAL_DEPENDENCY__EVENT,
				 DependencylanguageFactory.eINSTANCE.createStateCombinationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.CONDITIONAL_DEPENDENCY__EVENT,
				 DependencylanguageFactory.eINSTANCE.createMessageEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.CONDITIONAL_DEPENDENCY__CONDITION,
				 DependencylanguageFactory.eINSTANCE.createStateStatusCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.CONDITIONAL_DEPENDENCY__CONDITION,
				 DependencylanguageFactory.eINSTANCE.createEventConstrainedIntervalCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.CONDITIONAL_DEPENDENCY__CONDITION,
				 DependencylanguageFactory.eINSTANCE.createClockCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.CONDITIONAL_DEPENDENCY__CONDITION,
				 DependencylanguageFactory.eINSTANCE.createAuxiliaryClockCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.CONDITIONAL_DEPENDENCY__CONDITION,
				 DependencylanguageFactory.eINSTANCE.createHybridClockCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.CONDITIONAL_DEPENDENCY__CONDITION,
				 DependencylanguageFactory.eINSTANCE.createBasicClockCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.CONDITIONAL_DEPENDENCY__CONDITION,
				 DependencylanguageFactory.eINSTANCE.createDataCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.CONDITIONAL_DEPENDENCY__CONDITION,
				 DependencylanguageFactory.eINSTANCE.createCompositionCondition()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.CONDITIONAL_DEPENDENCY__EFFECTS,
				 DependencylanguageFactory.eINSTANCE.createEnableDisableEffect()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.CONDITIONAL_DEPENDENCY__EFFECTS,
				 DependencylanguageFactory.eINSTANCE.createClockResetEffect()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.CONDITIONAL_DEPENDENCY__EFFECTS,
				 DependencylanguageFactory.eINSTANCE.createDataAssignmentEffect()));
	}

}
