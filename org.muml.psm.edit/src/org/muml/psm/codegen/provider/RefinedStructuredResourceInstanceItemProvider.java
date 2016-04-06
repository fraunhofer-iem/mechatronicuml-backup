/**
 */
package org.muml.psm.codegen.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.muml.core.CorePackage;
import org.muml.pm.hardware.hwresourceinstance.provider.StructuredResourceInstanceItemProvider;
import org.muml.psm.codegen.CodegenPackage;
import org.muml.psm.codegen.RefinedStructuredResourceInstance;
import org.muml.psm.properties.PropertiesFactory;
import org.muml.psm.provider.PsmEditPlugin;

/**
 * This is the item provider adapter for a {@link org.muml.psm.codegen.RefinedStructuredResourceInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RefinedStructuredResourceInstanceItemProvider extends StructuredResourceInstanceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinedStructuredResourceInstanceItemProvider(AdapterFactory adapterFactory) {
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

			addAllocatedAtomicComponentInstancesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Allocated Atomic Component Instances feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllocatedAtomicComponentInstancesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RefinedStructuredResourceInstance_allocatedAtomicComponentInstances_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RefinedStructuredResourceInstance_allocatedAtomicComponentInstances_feature", "_UI_RefinedStructuredResourceInstance_type"),
				 CodegenPackage.Literals.REFINED_STRUCTURED_RESOURCE_INSTANCE__ALLOCATED_ATOMIC_COMPONENT_INSTANCES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns RefinedStructuredResourceInstance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RefinedStructuredResourceInstance"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RefinedStructuredResourceInstance)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_RefinedStructuredResourceInstance_type") :
			getString("_UI_RefinedStructuredResourceInstance_type") + " " + label;
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
				(CorePackage.Literals.EXTENDABLE_ELEMENT__EXTENSIONS,
				 PropertiesFactory.eINSTANCE.createWCET()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EXTENDABLE_ELEMENT__EXTENSIONS,
				 PropertiesFactory.eINSTANCE.createRequiredMemory()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EXTENDABLE_ELEMENT__EXTENSIONS,
				 PropertiesFactory.eINSTANCE.createScheduling()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EXTENDABLE_ELEMENT__EXTENSIONS,
				 PropertiesFactory.eINSTANCE.createMessageFrame()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EXTENDABLE_ELEMENT__EXTENSIONS,
				 PropertiesFactory.eINSTANCE.createCANMessageFrame()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PsmEditPlugin.INSTANCE;
	}

}
