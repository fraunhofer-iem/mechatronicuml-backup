/**
 */
package org.muml.reconfiguration.instance.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.muml.core.CorePackage;
import org.muml.pim.instance.provider.StructuredComponentInstanceItemProvider;
import org.muml.reconfiguration.instance.InstanceFactory;
import org.muml.reconfiguration.instance.InstancePackage;
import org.muml.reconfiguration.instance.ReconfigurableStructuredComponentInstance;
import org.muml.reconfiguration.provider.MumlReconfigurationEditPlugin;
import org.muml.storydiagram.activities.ActivitiesFactory;
import org.muml.storydiagram.calls.CallsFactory;

/**
 * This is the item provider adapter for a {@link org.muml.reconfiguration.instance.ReconfigurableStructuredComponentInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReconfigurableStructuredComponentInstanceItemProvider extends StructuredComponentInstanceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurableStructuredComponentInstanceItemProvider(AdapterFactory adapterFactory) {
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

			addControllerInstancePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Controller Instance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControllerInstancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ReconfigurableStructuredComponentInstance_controllerInstance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReconfigurableStructuredComponentInstance_controllerInstance_feature", "_UI_ReconfigurableStructuredComponentInstance_type"),
				 InstancePackage.Literals.RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE__CONTROLLER_INSTANCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns ReconfigurableStructuredComponentInstance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ReconfigurableStructuredComponentInstance"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ReconfigurableStructuredComponentInstance)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ReconfigurableStructuredComponentInstance_type") :
			getString("_UI_ReconfigurableStructuredComponentInstance_type") + " " + label;
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
				(CorePackage.Literals.EXTENDABLE_ELEMENT__EXTENSION,
				 ActivitiesFactory.eINSTANCE.createOperationExtension()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EXTENDABLE_ELEMENT__EXTENSION,
				 CallsFactory.eINSTANCE.createParameterExtension()));

		newChildDescriptors.add
			(createChildParameter
				(org.muml.pim.instance.InstancePackage.Literals.COMPONENT_INSTANCE__PORT_INSTANCES,
				 InstanceFactory.eINSTANCE.createReconfigurationPortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(org.muml.pim.instance.InstancePackage.Literals.COMPONENT_INSTANCE__PORT_INSTANCES,
				 InstanceFactory.eINSTANCE.createReconfigurationMessagePortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(org.muml.pim.instance.InstancePackage.Literals.COMPONENT_INSTANCE__PORT_INSTANCES,
				 InstanceFactory.eINSTANCE.createReconfigurationExecutionPortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(org.muml.pim.instance.InstancePackage.Literals.COMPONENT_INSTANCE__PORT_INSTANCES,
				 InstanceFactory.eINSTANCE.createInternalReconfigurationCommunicationPortInstance()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MumlReconfigurationEditPlugin.INSTANCE;
	}

}
