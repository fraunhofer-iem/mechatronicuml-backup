/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform.provider;


import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformFactory;
import de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.storydriven.core.provider.NamedElementItemProvider;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.hardware.hwplatform.HWPlatform} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HWPlatformItemProvider
	extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPlatformItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(HwplatformPackage.Literals.HW_PLATFORM__EMBEDDED_PLATFORM_PARTS);
			childrenFeatures.add(HwplatformPackage.Literals.HW_PLATFORM__NETWORKING_HARDWARE_PARTS);
			childrenFeatures.add(HwplatformPackage.Literals.HW_PLATFORM__DELEGATION_PORTS);
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
	 * This returns HWPlatform.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HWPlatform"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((HWPlatform)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HWPlatform_type") :
			getString("_UI_HWPlatform_type") + " " + label;
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

		switch (notification.getFeatureID(HWPlatform.class)) {
			case HwplatformPackage.HW_PLATFORM__EMBEDDED_PLATFORM_PARTS:
			case HwplatformPackage.HW_PLATFORM__NETWORKING_HARDWARE_PARTS:
			case HwplatformPackage.HW_PLATFORM__DELEGATION_PORTS:
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
				(HwplatformPackage.Literals.HW_PLATFORM__EMBEDDED_PLATFORM_PARTS,
				 HwplatformFactory.eINSTANCE.createHWPlatformPart()));

		newChildDescriptors.add
			(createChildParameter
				(HwplatformPackage.Literals.HW_PLATFORM__EMBEDDED_PLATFORM_PARTS,
				 HwplatformFactory.eINSTANCE.createResourcePart()));

		newChildDescriptors.add
			(createChildParameter
				(HwplatformPackage.Literals.HW_PLATFORM__NETWORKING_HARDWARE_PARTS,
				 HwplatformFactory.eINSTANCE.createDelegation()));

		newChildDescriptors.add
			(createChildParameter
				(HwplatformPackage.Literals.HW_PLATFORM__NETWORKING_HARDWARE_PARTS,
				 HwplatformFactory.eINSTANCE.createBusConnector()));

		newChildDescriptors.add
			(createChildParameter
				(HwplatformPackage.Literals.HW_PLATFORM__NETWORKING_HARDWARE_PARTS,
				 HwplatformFactory.eINSTANCE.createBusPart()));

		newChildDescriptors.add
			(createChildParameter
				(HwplatformPackage.Literals.HW_PLATFORM__NETWORKING_HARDWARE_PARTS,
				 HwplatformFactory.eINSTANCE.createLinkPart()));

		newChildDescriptors.add
			(createChildParameter
				(HwplatformPackage.Literals.HW_PLATFORM__NETWORKING_HARDWARE_PARTS,
				 HwplatformFactory.eINSTANCE.createBridgePart()));

		newChildDescriptors.add
			(createChildParameter
				(HwplatformPackage.Literals.HW_PLATFORM__DELEGATION_PORTS,
				 HwplatformFactory.eINSTANCE.createDelegationHWPort()));
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
