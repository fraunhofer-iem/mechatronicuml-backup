/**
 */
package de.uni_paderborn.fujaba.muml.testlanguage.specification.provider;

import de.uni_paderborn.fujaba.muml.testlanguage.specification.PortSpecification;
import de.uni_paderborn.fujaba.muml.testlanguage.specification.SpecificationPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a
 * {@link de.uni_paderborn.fujaba.muml.testlanguage.specification.PortSpecification}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class PortSpecificationItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PortSpecificationItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addOptionalPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addDataTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_PortSpecification_name_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PortSpecification_name_feature",
						"_UI_PortSpecification_type"),
				SpecificationPackage.Literals.PORT_SPECIFICATION__NAME, false,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				getString("_UI_InternalPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Optional feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addOptionalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_PortSpecification_optional_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PortSpecification_optional_feature",
						"_UI_PortSpecification_type"),
				SpecificationPackage.Literals.PORT_SPECIFICATION__OPTIONAL,
				false, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				getString("_UI_InternalPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Type feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_PortSpecification_type_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PortSpecification_type_feature",
						"_UI_PortSpecification_type"),
				SpecificationPackage.Literals.PORT_SPECIFICATION__TYPE, false,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				getString("_UI_InternalPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Data Type feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDataTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_PortSpecification_dataType_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_PortSpecification_dataType_feature",
						"_UI_PortSpecification_type"),
				SpecificationPackage.Literals.PORT_SPECIFICATION__DATA_TYPE,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null, null));
	}

	/**
	 * This returns PortSpecification.gif. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/PortSpecification"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PortSpecification) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_PortSpecification_type")
				: getString("_UI_PortSpecification_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PortSpecification.class)) {
		case SpecificationPackage.PORT_SPECIFICATION__NAME:
		case SpecificationPackage.PORT_SPECIFICATION__OPTIONAL:
		case SpecificationPackage.PORT_SPECIFICATION__TYPE:
		case SpecificationPackage.PORT_SPECIFICATION__DATA_TYPE:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
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
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SpecificationEditPlugin.INSTANCE;
	}

}
