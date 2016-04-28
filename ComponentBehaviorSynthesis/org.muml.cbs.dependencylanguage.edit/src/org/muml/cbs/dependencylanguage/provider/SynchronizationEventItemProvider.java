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
import org.muml.cbs.dependencylanguage.DependencylanguageFactory;
import org.muml.cbs.dependencylanguage.DependencylanguagePackage;
import org.muml.cbs.dependencylanguage.SynchronizationEvent;
import org.muml.mumlcore.expressions.ExpressionsFactory;
import org.muml.mumlcore.expressions.common.CommonExpressionsFactory;
import org.muml.pim.actionlanguage.ActionlanguageFactory;

/**
 * This is the item provider adapter for a {@link org.muml.cbs.dependencylanguage.SynchronizationEvent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SynchronizationEventItemProvider
	extends EventItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationEventItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION);
			childrenFeatures.add(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__EVENT);
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
	 * This returns SynchronizationEvent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SynchronizationEvent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_SynchronizationEvent_type");
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

		switch (notification.getFeatureID(SynchronizationEvent.class)) {
			case DependencylanguagePackage.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION:
			case DependencylanguagePackage.SYNCHRONIZATION_EVENT__EVENT:
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
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION,
				 DependencylanguageFactory.eINSTANCE.createDataAssignmentEffect()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createDoWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createForLoop()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createOperationCall()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createReturnStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createTriggerMessageExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createDiscreteInteractionEndpointReference()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createPositionSelector()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createLocalVariableDeclarationStatement()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createTypedNamedElementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createArrayInitializeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createNondeterministicChoiceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createTimeValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createTypeCastExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createArrayIndexExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION,
				 ActionlanguageFactory.eINSTANCE.createAttributeAccessorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createComparisonExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__SELECTOR_EXPRESSION,
				 CommonExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__EVENT,
				 DependencylanguageFactory.eINSTANCE.createCompositionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__EVENT,
				 DependencylanguageFactory.eINSTANCE.createCountedEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__EVENT,
				 DependencylanguageFactory.eINSTANCE.createDelayedEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__EVENT,
				 DependencylanguageFactory.eINSTANCE.createSynchronizationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__EVENT,
				 DependencylanguageFactory.eINSTANCE.createTransitionEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__EVENT,
				 DependencylanguageFactory.eINSTANCE.createStateEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__EVENT,
				 DependencylanguageFactory.eINSTANCE.createStateCombinationEvent()));

		newChildDescriptors.add
			(createChildParameter
				(DependencylanguagePackage.Literals.SYNCHRONIZATION_EVENT__EVENT,
				 DependencylanguageFactory.eINSTANCE.createMessageEvent()));
	}

}
