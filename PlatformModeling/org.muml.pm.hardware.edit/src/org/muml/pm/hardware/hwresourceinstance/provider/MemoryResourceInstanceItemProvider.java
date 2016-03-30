/**
 */
package org.muml.pm.hardware.hwresourceinstance.provider;


import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage;
import org.muml.pm.hardware.hwresourceinstance.MemoryResourceInstance;
import org.muml.pm.hardware.hwvaluetype.HwvaluetypeFactory;

/**
 * This is the item provider adapter for a {@link org.muml.pm.hardware.hwresourceinstance.MemoryResourceInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MemoryResourceInstanceItemProvider
	extends AtomicResourceInstanceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryResourceInstanceItemProvider(AdapterFactory adapterFactory) {
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

			addMemorySizePropertyDescriptor(object);
			addThroughputPropertyDescriptor(object);
			addMemoryTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Memory Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemorySizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MemoryResourceInstance_memorySize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MemoryResourceInstance_memorySize_feature", "_UI_MemoryResourceInstance_type"),
				 HwresourceinstancePackage.Literals.MEMORY_RESOURCE_INSTANCE__MEMORY_SIZE,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Throughput feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThroughputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MemoryResourceInstance_throughput_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MemoryResourceInstance_throughput_feature", "_UI_MemoryResourceInstance_type"),
				 HwresourceinstancePackage.Literals.MEMORY_RESOURCE_INSTANCE__THROUGHPUT,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Memory Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemoryTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MemoryResourceInstance_memoryType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MemoryResourceInstance_memoryType_feature", "_UI_MemoryResourceInstance_type"),
				 HwresourceinstancePackage.Literals.MEMORY_RESOURCE_INSTANCE__MEMORY_TYPE,
				 false,
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
			childrenFeatures.add(HwresourceinstancePackage.Literals.MEMORY_RESOURCE_INSTANCE__MEMORY_SIZE);
			childrenFeatures.add(HwresourceinstancePackage.Literals.MEMORY_RESOURCE_INSTANCE__THROUGHPUT);
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
		String label = ((MemoryResourceInstance)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MemoryResourceInstance_type") :
			getString("_UI_MemoryResourceInstance_type") + " " + label;
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

		switch (notification.getFeatureID(MemoryResourceInstance.class)) {
			case HwresourceinstancePackage.MEMORY_RESOURCE_INSTANCE__MEMORY_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case HwresourceinstancePackage.MEMORY_RESOURCE_INSTANCE__MEMORY_SIZE:
			case HwresourceinstancePackage.MEMORY_RESOURCE_INSTANCE__THROUGHPUT:
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
				(HwresourceinstancePackage.Literals.MEMORY_RESOURCE_INSTANCE__MEMORY_SIZE,
				 HwvaluetypeFactory.eINSTANCE.createDataSize()));

		newChildDescriptors.add
			(createChildParameter
				(HwresourceinstancePackage.Literals.MEMORY_RESOURCE_INSTANCE__THROUGHPUT,
				 HwvaluetypeFactory.eINSTANCE.createDataRate()));
	}

}
