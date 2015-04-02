/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types.provider;


import de.fraunhofer.iem.m4a.IEC61131.core.literals.LiteralsFactory;

import de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementInit;
import de.fraunhofer.iem.m4a.IEC61131.core.types.TypesFactory;
import de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage;

import de.fraunhofer.iem.m4a.IEC61131.provider.Iec61131EditPlugin;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementInit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureElementInitItemProvider 
	extends ItemProviderAdapter
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
	public StructureElementInitItemProvider(AdapterFactory adapterFactory) {
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

			addElementPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StructureElementInit_element_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StructureElementInit_element_feature", "_UI_StructureElementInit_type"),
				 TypesPackage.Literals.STRUCTURE_ELEMENT_INIT__ELEMENT,
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TypesPackage.Literals.STRUCTURE_ELEMENT_INIT__VALUE);
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
	 * This returns StructureElementInit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StructureElementInit"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_StructureElementInit_type");
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

		switch (notification.getFeatureID(StructureElementInit.class)) {
			case TypesPackage.STRUCTURE_ELEMENT_INIT__VALUE:
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
				(TypesPackage.Literals.STRUCTURE_ELEMENT_INIT__VALUE,
				 TypesFactory.eINSTANCE.createEnumeratedValue()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.STRUCTURE_ELEMENT_INIT__VALUE,
				 TypesFactory.eINSTANCE.createArrayInit()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.STRUCTURE_ELEMENT_INIT__VALUE,
				 TypesFactory.eINSTANCE.createStructureInit()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.STRUCTURE_ELEMENT_INIT__VALUE,
				 LiteralsFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.STRUCTURE_ELEMENT_INIT__VALUE,
				 LiteralsFactory.eINSTANCE.createNumericLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.STRUCTURE_ELEMENT_INIT__VALUE,
				 LiteralsFactory.eINSTANCE.createCharacterLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.STRUCTURE_ELEMENT_INIT__VALUE,
				 LiteralsFactory.eINSTANCE.createBitStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.STRUCTURE_ELEMENT_INIT__VALUE,
				 LiteralsFactory.eINSTANCE.createBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.STRUCTURE_ELEMENT_INIT__VALUE,
				 LiteralsFactory.eINSTANCE.createRealLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.STRUCTURE_ELEMENT_INIT__VALUE,
				 LiteralsFactory.eINSTANCE.createSignedInteger()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.STRUCTURE_ELEMENT_INIT__VALUE,
				 LiteralsFactory.eINSTANCE.createBinaryInteger()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.STRUCTURE_ELEMENT_INIT__VALUE,
				 LiteralsFactory.eINSTANCE.createOctalInteger()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.STRUCTURE_ELEMENT_INIT__VALUE,
				 LiteralsFactory.eINSTANCE.createHexInteger()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.STRUCTURE_ELEMENT_INIT__VALUE,
				 LiteralsFactory.eINSTANCE.createUnsignedInteger()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.STRUCTURE_ELEMENT_INIT__VALUE,
				 LiteralsFactory.eINSTANCE.createTimeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.STRUCTURE_ELEMENT_INIT__VALUE,
				 LiteralsFactory.eINSTANCE.createDuration()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.STRUCTURE_ELEMENT_INIT__VALUE,
				 LiteralsFactory.eINSTANCE.createTimeOfDay()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.STRUCTURE_ELEMENT_INIT__VALUE,
				 LiteralsFactory.eINSTANCE.createDate()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.STRUCTURE_ELEMENT_INIT__VALUE,
				 LiteralsFactory.eINSTANCE.createDateAndTime()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Iec61131EditPlugin.INSTANCE;
	}

}
