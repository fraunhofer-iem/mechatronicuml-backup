/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwresource.provider;


import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourceFactory;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.HwresourcePackage;
import de.uni_paderborn.fujaba.muml.hardware.hwresource.StructuredResource;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.hardware.hwresource.StructuredResource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructuredResourceItemProvider
	extends ResourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredResourceItemProvider(AdapterFactory adapterFactory) {
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

			addEmbeddedAtomicResourcesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Embedded Atomic Resources feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmbeddedAtomicResourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StructuredResource_embeddedAtomicResources_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StructuredResource_embeddedAtomicResources_feature", "_UI_StructuredResource_type"),
				 HwresourcePackage.Literals.STRUCTURED_RESOURCE__EMBEDDED_ATOMIC_RESOURCES,
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
			childrenFeatures.add(HwresourcePackage.Literals.STRUCTURED_RESOURCE__EMBEDDED_ATOMIC_RESOURCES);
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
	 * This returns StructuredResource.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StructuredResource"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((StructuredResource)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_StructuredResource_type") :
			getString("_UI_StructuredResource_type") + " " + label;
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

		switch (notification.getFeatureID(StructuredResource.class)) {
			case HwresourcePackage.STRUCTURED_RESOURCE__EMBEDDED_ATOMIC_RESOURCES:
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
				(HwresourcePackage.Literals.STRUCTURED_RESOURCE__EMBEDDED_ATOMIC_RESOURCES,
				 HwresourceFactory.eINSTANCE.createMemoryResource()));

		newChildDescriptors.add
			(createChildParameter
				(HwresourcePackage.Literals.STRUCTURED_RESOURCE__EMBEDDED_ATOMIC_RESOURCES,
				 HwresourceFactory.eINSTANCE.createCache()));

		newChildDescriptors.add
			(createChildParameter
				(HwresourcePackage.Literals.STRUCTURED_RESOURCE__EMBEDDED_ATOMIC_RESOURCES,
				 HwresourceFactory.eINSTANCE.createProgrammableLogicDevice()));

		newChildDescriptors.add
			(createChildParameter
				(HwresourcePackage.Literals.STRUCTURED_RESOURCE__EMBEDDED_ATOMIC_RESOURCES,
				 HwresourceFactory.eINSTANCE.createProcessor()));
	}

}
