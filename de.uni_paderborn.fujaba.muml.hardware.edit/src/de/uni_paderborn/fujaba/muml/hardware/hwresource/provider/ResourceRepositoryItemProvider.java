/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresource.provider;


import de.uni_paderborn.fujaba.muml.hardware.hwplatform.provider.HardwareEditPlugin;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourceFactory;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.ResourceRepository;
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstanceFactory;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.storydriven.core.provider.CommentableElementItemProvider;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.hardware.hwresource.ResourceRepository} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceRepositoryItemProvider
	extends CommentableElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
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
			childrenFeatures.add(HwresourcePackage.Literals.RESOURCE_REPOSITORY__RESOURCES);
			childrenFeatures.add(HwresourcePackage.Literals.RESOURCE_REPOSITORY__PROTOCOLS);
			childrenFeatures.add(HwresourcePackage.Literals.RESOURCE_REPOSITORY__COMMUNICATION_MEDIA);
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
			case HwresourcePackage.RESOURCE_REPOSITORY__COMMUNICATION_MEDIA:
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
				(HwresourcePackage.Literals.RESOURCE_REPOSITORY__RESOURCES,
				 HwresourceinstanceFactory.eINSTANCE.createStorageMemoryInstance()));

		newChildDescriptors.add
			(createChildParameter
				(HwresourcePackage.Literals.RESOURCE_REPOSITORY__RESOURCES,
				 HwresourceinstanceFactory.eINSTANCE.createProcessingMemoryInstance()));

		newChildDescriptors.add
			(createChildParameter
				(HwresourcePackage.Literals.RESOURCE_REPOSITORY__RESOURCES,
				 HwresourceinstanceFactory.eINSTANCE.createCacheInstance()));

		newChildDescriptors.add
			(createChildParameter
				(HwresourcePackage.Literals.RESOURCE_REPOSITORY__RESOURCES,
				 HwresourceinstanceFactory.eINSTANCE.createProgrammableLogicDeviceInstance()));

		newChildDescriptors.add
			(createChildParameter
				(HwresourcePackage.Literals.RESOURCE_REPOSITORY__RESOURCES,
				 HwresourceinstanceFactory.eINSTANCE.createProcessorInstance()));

		newChildDescriptors.add
			(createChildParameter
				(HwresourcePackage.Literals.RESOURCE_REPOSITORY__RESOURCES,
				 HwresourceinstanceFactory.eINSTANCE.createStructuredResourceInstance()));

		newChildDescriptors.add
			(createChildParameter
				(HwresourcePackage.Literals.RESOURCE_REPOSITORY__RESOURCES,
				 HwresourceinstanceFactory.eINSTANCE.createSensorInstance()));

		newChildDescriptors.add
			(createChildParameter
				(HwresourcePackage.Literals.RESOURCE_REPOSITORY__RESOURCES,
				 HwresourceinstanceFactory.eINSTANCE.createActuatorInstance()));

		newChildDescriptors.add
			(createChildParameter
				(HwresourcePackage.Literals.RESOURCE_REPOSITORY__PROTOCOLS,
				 HwresourceFactory.eINSTANCE.createBusProtocol()));

		newChildDescriptors.add
			(createChildParameter
				(HwresourcePackage.Literals.RESOURCE_REPOSITORY__PROTOCOLS,
				 HwresourceFactory.eINSTANCE.createLinkProtocol()));

		newChildDescriptors.add
			(createChildParameter
				(HwresourcePackage.Literals.RESOURCE_REPOSITORY__COMMUNICATION_MEDIA,
				 HwresourceFactory.eINSTANCE.createBus()));

		newChildDescriptors.add
			(createChildParameter
				(HwresourcePackage.Literals.RESOURCE_REPOSITORY__COMMUNICATION_MEDIA,
				 HwresourceFactory.eINSTANCE.createLink()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return HardwareEditPlugin.INSTANCE;
	}

}
