/**
 */
package org.muml.storydiagram.interpreter.core.executiontrace.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.EMFEditPlugin;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.storydiagram.interpreter.core.executiontrace.ActivityNodeExecution;
import org.muml.storydiagram.interpreter.core.executiontrace.ExecutiontracePackage;

/**
 * This is the item provider adapter for a {@link org.muml.storydiagram.interpreter.core.executiontrace.ActivityNodeExecution} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class ActivityNodeExecutionItemProvider extends ExecutionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ActivityNodeExecutionItemProvider(AdapterFactory adapterFactory) {
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

			addActivityNodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Activity Node feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addActivityNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActivityNodeExecution_activityNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActivityNodeExecution_activityNode_feature", "_UI_ActivityNodeExecution_type"),
				 ExecutiontracePackage.Literals.ACTIVITY_NODE_EXECUTION__ACTIVITY_NODE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns ActivityNodeExecution.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ActivityNodeExecution"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	@Override
	public String getText(final Object object) {
		final ActivityNodeExecution<?> activityNodeExecution = (ActivityNodeExecution<?>) object;
		String label = this.getString("_UI_ActivityNodeExecution_type");

		label += " " + activityNodeExecution.getExecutionTimeMsec() + " msec - ";

		final ComposedAdapterFactory factory = new ComposedAdapterFactory(
				EMFEditPlugin.getComposedAdapterFactoryDescriptorRegistry());

		if (activityNodeExecution.getActivityNode() instanceof EObject) {
			label += ((IItemLabelProvider) factory.adapt(activityNodeExecution.getActivityNode(),
					IItemLabelProvider.class)).getText(activityNodeExecution.getActivityNode());
		} else {
			label += activityNodeExecution.getActivityNode().toString();
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

		switch (notification.getFeatureID(ActivityNodeExecution.class)) {
			case ExecutiontracePackage.ACTIVITY_NODE_EXECUTION__ACTIVITY_NODE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
