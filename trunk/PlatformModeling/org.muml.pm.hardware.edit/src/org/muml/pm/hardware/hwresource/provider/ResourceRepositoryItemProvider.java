/**
 */
package org.muml.pm.hardware.hwresource.provider;


import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.core.provider.CommentableElementItemProvider;
import org.muml.pm.hardware.hwresource.HwresourceFactory;
import org.muml.pm.hardware.hwresource.HwresourcePackage;
import org.muml.pm.hardware.hwresource.ResourceRepository;

/**
 * This is the item provider adapter for a {@link org.muml.pm.hardware.hwresource.ResourceRepository} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceRepositoryItemProvider
	extends CommentableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRepositoryItemProvider(AdapterFactory adapterFactory) {
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

			addResourcesPropertyDescriptor(object);
			addProtocolsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Resources feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceRepository_resources_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceRepository_resources_feature", "_UI_ResourceRepository_type"),
				 HwresourcePackage.Literals.RESOURCE_REPOSITORY__RESOURCES,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Protocols feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProtocolsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceRepository_protocols_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceRepository_protocols_feature", "_UI_ResourceRepository_type"),
				 HwresourcePackage.Literals.RESOURCE_REPOSITORY__PROTOCOLS,
				 true,
				 false,
				 false,
				 null,
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
			childrenFeatures.add(HwresourcePackage.Literals.RESOURCE_REPOSITORY__RESOURCES);
			childrenFeatures.add(HwresourcePackage.Literals.RESOURCE_REPOSITORY__PROTOCOLS);
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
	 * This returns ResourceRepository.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ResourceRepository"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ResourceRepository)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_ResourceRepository_type") :
			getString("_UI_ResourceRepository_type") + " " + label;
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

		switch (notification.getFeatureID(ResourceRepository.class)) {
			case HwresourcePackage.RESOURCE_REPOSITORY__RESOURCES:
			case HwresourcePackage.RESOURCE_REPOSITORY__PROTOCOLS:
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
				(HwresourcePackage.Literals.RESOURCE_REPOSITORY__RESOURCES,
				 HwresourceFactory.eINSTANCE.createMemoryResource()));

		newChildDescriptors.add
			(createChildParameter
				(HwresourcePackage.Literals.RESOURCE_REPOSITORY__RESOURCES,
				 HwresourceFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(HwresourcePackage.Literals.RESOURCE_REPOSITORY__RESOURCES,
				 HwresourceFactory.eINSTANCE.createCache()));

		newChildDescriptors.add
			(createChildParameter
				(HwresourcePackage.Literals.RESOURCE_REPOSITORY__RESOURCES,
				 HwresourceFactory.eINSTANCE.createProgrammableLogicDevice()));

		newChildDescriptors.add
			(createChildParameter
				(HwresourcePackage.Literals.RESOURCE_REPOSITORY__RESOURCES,
				 HwresourceFactory.eINSTANCE.createProcessor()));

		newChildDescriptors.add
			(createChildParameter
				(HwresourcePackage.Literals.RESOURCE_REPOSITORY__RESOURCES,
				 HwresourceFactory.eINSTANCE.createStructuredResource()));

		newChildDescriptors.add
			(createChildParameter
				(HwresourcePackage.Literals.RESOURCE_REPOSITORY__PROTOCOLS,
				 HwresourceFactory.eINSTANCE.createCommunicationProtocolRepository()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return org.muml.pm.hardware.provider.HardwareEditPlugin.INSTANCE;
	}

}
