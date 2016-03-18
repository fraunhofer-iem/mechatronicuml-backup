/**
 */
package de.uni_paderborn.fujaba.muml.testlanguage.specification.provider;

import de.uni_paderborn.fujaba.muml.testlanguage.specification.SpecificationPackage;
import de.uni_paderborn.fujaba.muml.testlanguage.specification.Transformation;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a
 * {@link de.uni_paderborn.fujaba.muml.testlanguage.specification.Transformation}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class TransformationItemProvider extends NodeSpecificationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TransformationItemProvider(AdapterFactory adapterFactory) {
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

			addUriPropertyDescriptor(object);
			addParameterOrderPropertyDescriptor(object);
			addConfigPropertiesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Uri feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addUriPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Transformation_uri_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Transformation_uri_feature",
						"_UI_Transformation_type"),
				SpecificationPackage.Literals.TRANSFORMATION__URI, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Parameter Order feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addParameterOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Transformation_parameterOrder_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Transformation_parameterOrder_feature",
						"_UI_Transformation_type"),
				SpecificationPackage.Literals.TRANSFORMATION__PARAMETER_ORDER,
				false, false, true, null,
				getString("_UI_InternalPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Config Properties feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addConfigPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Transformation_configProperties_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_Transformation_configProperties_feature",
								"_UI_Transformation_type"),
						SpecificationPackage.Literals.TRANSFORMATION__CONFIG_PROPERTIES,
						false, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						getString("_UI_InternalPropertyCategory"), null));
	}

	/**
	 * This returns Transformation.gif. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/Transformation"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Transformation) object).getLabel();
		return label == null || label.length() == 0 ? getString("_UI_Transformation_type")
				: getString("_UI_Transformation_type") + " " + label;
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

		switch (notification.getFeatureID(Transformation.class)) {
		case SpecificationPackage.TRANSFORMATION__URI:
		case SpecificationPackage.TRANSFORMATION__CONFIG_PROPERTIES:
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

}
