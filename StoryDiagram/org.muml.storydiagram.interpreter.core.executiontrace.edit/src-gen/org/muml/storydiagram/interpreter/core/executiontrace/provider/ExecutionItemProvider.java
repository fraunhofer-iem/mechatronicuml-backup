/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.storydiagram.interpreter.core.executiontrace.Execution;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontraceFactory;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage;

/**
 * This is the item provider adapter for a {@link org.muml.storydiagram.interpreter.core.executiontrace.Execution} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutionItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionItemProvider(AdapterFactory adapterFactory) {
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

			addExecutionStartedTimeStampPropertyDescriptor(object);
			addExecutionFinishedTimeStampPropertyDescriptor(object);
			addExecutionTimePropertyDescriptor(object);
			addExecutionTimeMsecPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Execution Started Time Stamp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExecutionStartedTimeStampPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Execution_executionStartedTimeStamp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Execution_executionStartedTimeStamp_feature", "_UI_Execution_type"),
				 ExecutiontracePackage.Literals.EXECUTION__EXECUTION_STARTED_TIME_STAMP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Execution Finished Time Stamp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExecutionFinishedTimeStampPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Execution_executionFinishedTimeStamp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Execution_executionFinishedTimeStamp_feature", "_UI_Execution_type"),
				 ExecutiontracePackage.Literals.EXECUTION__EXECUTION_FINISHED_TIME_STAMP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Execution Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExecutionTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Execution_executionTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Execution_executionTime_feature", "_UI_Execution_type"),
				 ExecutiontracePackage.Literals.EXECUTION__EXECUTION_TIME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Execution Time Msec feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExecutionTimeMsecPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Execution_executionTimeMsec_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Execution_executionTimeMsec_feature", "_UI_Execution_type"),
				 ExecutiontracePackage.Literals.EXECUTION__EXECUTION_TIME_MSEC,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(ExecutiontracePackage.Literals.EXECUTION__ELEMENTS);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Execution execution = (Execution)object;
		return getString("_UI_Execution_type") + " " + execution.getExecutionStartedTimeStamp();
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

		switch (notification.getFeatureID(Execution.class)) {
			case ExecutiontracePackage.EXECUTION__EXECUTION_STARTED_TIME_STAMP:
			case ExecutiontracePackage.EXECUTION__EXECUTION_FINISHED_TIME_STAMP:
			case ExecutiontracePackage.EXECUTION__EXECUTION_TIME:
			case ExecutiontracePackage.EXECUTION__EXECUTION_TIME_MSEC:
			case ExecutiontracePackage.EXECUTION__CONTAINER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ExecutiontracePackage.EXECUTION__ELEMENTS:
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
				(ExecutiontracePackage.Literals.EXECUTION__ELEMENTS,
				 ExecutiontraceFactory.eINSTANCE.createActivityExecution()));

		newChildDescriptors.add
			(createChildParameter
				(ExecutiontracePackage.Literals.EXECUTION__ELEMENTS,
				 ExecutiontraceFactory.eINSTANCE.createActivityNodeExecution()));

		newChildDescriptors.add
			(createChildParameter
				(ExecutiontracePackage.Literals.EXECUTION__ELEMENTS,
				 ExecutiontraceFactory.eINSTANCE.createActivityEdgeTraversal()));

		newChildDescriptors.add
			(createChildParameter
				(ExecutiontracePackage.Literals.EXECUTION__ELEMENTS,
				 ExecutiontraceFactory.eINSTANCE.createStoryPatternInitialization()));

		newChildDescriptors.add
			(createChildParameter
				(ExecutiontracePackage.Literals.EXECUTION__ELEMENTS,
				 ExecutiontraceFactory.eINSTANCE.createStoryPatternMatching()));

		newChildDescriptors.add
			(createChildParameter
				(ExecutiontracePackage.Literals.EXECUTION__ELEMENTS,
				 ExecutiontraceFactory.eINSTANCE.createStoryPatternApplication()));

		newChildDescriptors.add
			(createChildParameter
				(ExecutiontracePackage.Literals.EXECUTION__ELEMENTS,
				 ExecutiontraceFactory.eINSTANCE.createStoryPatternObjectBound()));

		newChildDescriptors.add
			(createChildParameter
				(ExecutiontracePackage.Literals.EXECUTION__ELEMENTS,
				 ExecutiontraceFactory.eINSTANCE.createStoryPatternObjectNotBound()));

		newChildDescriptors.add
			(createChildParameter
				(ExecutiontracePackage.Literals.EXECUTION__ELEMENTS,
				 ExecutiontraceFactory.eINSTANCE.createStoryPatternObjectBindingRevoked()));

		newChildDescriptors.add
			(createChildParameter
				(ExecutiontracePackage.Literals.EXECUTION__ELEMENTS,
				 ExecutiontraceFactory.eINSTANCE.createTraversingLink()));

		newChildDescriptors.add
			(createChildParameter
				(ExecutiontracePackage.Literals.EXECUTION__ELEMENTS,
				 ExecutiontraceFactory.eINSTANCE.createLinkCheckSuccessful()));

		newChildDescriptors.add
			(createChildParameter
				(ExecutiontracePackage.Literals.EXECUTION__ELEMENTS,
				 ExecutiontraceFactory.eINSTANCE.createLinkCheckFailed()));

		newChildDescriptors.add
			(createChildParameter
				(ExecutiontracePackage.Literals.EXECUTION__ELEMENTS,
				 ExecutiontraceFactory.eINSTANCE.createExpressionEvaluation()));

		newChildDescriptors.add
			(createChildParameter
				(ExecutiontracePackage.Literals.EXECUTION__ELEMENTS,
				 ExecutiontraceFactory.eINSTANCE.createInstanceObjectCreation()));

		newChildDescriptors.add
			(createChildParameter
				(ExecutiontracePackage.Literals.EXECUTION__ELEMENTS,
				 ExecutiontraceFactory.eINSTANCE.createInstanceObjectDeletion()));

		newChildDescriptors.add
			(createChildParameter
				(ExecutiontracePackage.Literals.EXECUTION__ELEMENTS,
				 ExecutiontraceFactory.eINSTANCE.createInstanceLinkCreation()));

		newChildDescriptors.add
			(createChildParameter
				(ExecutiontracePackage.Literals.EXECUTION__ELEMENTS,
				 ExecutiontraceFactory.eINSTANCE.createInstanceLinkDeletion()));

		newChildDescriptors.add
			(createChildParameter
				(ExecutiontracePackage.Literals.EXECUTION__ELEMENTS,
				 ExecutiontraceFactory.eINSTANCE.createAttributeValueSet()));

		newChildDescriptors.add
			(createChildParameter
				(ExecutiontracePackage.Literals.EXECUTION__ELEMENTS,
				 ExecutiontraceFactory.eINSTANCE.createVariableCreated()));

		newChildDescriptors.add
			(createChildParameter
				(ExecutiontracePackage.Literals.EXECUTION__ELEMENTS,
				 ExecutiontraceFactory.eINSTANCE.createVariableDeleted()));

		newChildDescriptors.add
			(createChildParameter
				(ExecutiontracePackage.Literals.EXECUTION__ELEMENTS,
				 ExecutiontraceFactory.eINSTANCE.createVariableChanged()));

		newChildDescriptors.add
			(createChildParameter
				(ExecutiontracePackage.Literals.EXECUTION__ELEMENTS,
				 ExecutiontraceFactory.eINSTANCE.createStoryPatternObjectConstraintHolds()));

		newChildDescriptors.add
			(createChildParameter
				(ExecutiontracePackage.Literals.EXECUTION__ELEMENTS,
				 ExecutiontraceFactory.eINSTANCE.createStoryPatternObjectConstraintViolated()));

		newChildDescriptors.add
			(createChildParameter
				(ExecutiontracePackage.Literals.EXECUTION__ELEMENTS,
				 ExecutiontraceFactory.eINSTANCE.createStoryPatternConstraintHolds()));

		newChildDescriptors.add
			(createChildParameter
				(ExecutiontracePackage.Literals.EXECUTION__ELEMENTS,
				 ExecutiontraceFactory.eINSTANCE.createStoryPatternConstraintViolated()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ExecutionTraceEditPlugin.INSTANCE;
	}

}
