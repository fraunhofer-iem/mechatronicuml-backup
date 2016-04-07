/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.EMFEditPlugin;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.storydiagram.interpreter.core.executiontrace.ActivityExecution;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontraceFactory;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage;

/**
 * This is the item provider adapter for a {@link org.muml.storydiagram.interpreter.core.executiontrace.ActivityExecution} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class ActivityExecutionItemProvider extends ExecutionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ActivityExecutionItemProvider(AdapterFactory adapterFactory) {
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

			addActivityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Activity feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addActivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityExecution_activity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityExecution_activity_feature", "_UI_ActivityExecution_type"),
				 ExecutiontracePackage.Literals.ACTIVITY_EXECUTION__ACTIVITY,
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ExecutiontracePackage.Literals.ACTIVITY_EXECUTION__IN_PARAMETER_VALUES);
			childrenFeatures.add(ExecutiontracePackage.Literals.ACTIVITY_EXECUTION__OUT_PARAMETER_VALUES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ActivityExecution.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ActivityExecution"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	@Override
	public String getText(final Object object) {
		final ActivityExecution<?> activityExecution = (ActivityExecution<?>) object;
		String label = this.getString("_UI_ActivityExecution_type");

		label += " " + activityExecution.getExecutionTimeMsec() + " msec - ";

		final ComposedAdapterFactory factory = new ComposedAdapterFactory(
				EMFEditPlugin.getComposedAdapterFactoryDescriptorRegistry());

		if (activityExecution.getActivity() instanceof EObject) {
			label += ((IItemLabelProvider) factory.adapt(activityExecution.getActivity(), IItemLabelProvider.class))
					.getText(activityExecution.getActivity());
		} else {
			label += activityExecution.getActivity().toString();
		}

		return label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ActivityExecution.class)) {
			case ExecutiontracePackage.ACTIVITY_EXECUTION__ACTIVITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ExecutiontracePackage.ACTIVITY_EXECUTION__IN_PARAMETER_VALUES:
			case ExecutiontracePackage.ACTIVITY_EXECUTION__OUT_PARAMETER_VALUES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ExecutiontracePackage.Literals.ACTIVITY_EXECUTION__IN_PARAMETER_VALUES,
				 ExecutiontraceFactory.eINSTANCE.create(ExecutiontracePackage.Literals.MAP_ENTRY)));

		newChildDescriptors.add
			(createChildParameter
				(ExecutiontracePackage.Literals.ACTIVITY_EXECUTION__OUT_PARAMETER_VALUES,
				 ExecutiontraceFactory.eINSTANCE.create(ExecutiontracePackage.Literals.MAP_ENTRY)));
	}

	/**
	 * This returns the label text for
	 * {@link org.eclipse.emf.edit.command.CreateChildCommand}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ExecutiontracePackage.Literals.ACTIVITY_EXECUTION__IN_PARAMETER_VALUES ||
			childFeature == ExecutiontracePackage.Literals.ACTIVITY_EXECUTION__OUT_PARAMETER_VALUES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}
}
