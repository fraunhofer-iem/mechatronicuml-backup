/**
 */
package de.uni_paderborn.fujaba.properties.provider;


import java.util.ArrayList;
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

import de.uni_paderborn.fujaba.properties.PropertiesPackage;
import de.uni_paderborn.fujaba.properties.Property;
import de.uni_paderborn.fujaba.properties.PropertyCategory;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.properties.PropertyCategory} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyCategoryItemProvider
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
	public PropertyCategoryItemProvider(AdapterFactory adapterFactory) {
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

			addTitlePropertyDescriptor(object);
			addVerticalPropertyDescriptor(object);
			addOpenPropertyDescriptor(object);
			addPropertiesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropertyCategory_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropertyCategory_title_feature", "_UI_PropertyCategory_type"),
				 PropertiesPackage.Literals.PROPERTY_CATEGORY__TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vertical feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerticalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropertyCategory_vertical_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropertyCategory_vertical_feature", "_UI_PropertyCategory_type"),
				 PropertiesPackage.Literals.PROPERTY_CATEGORY__VERTICAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Open feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOpenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropertyCategory_open_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropertyCategory_open_feature", "_UI_PropertyCategory_type"),
				 PropertiesPackage.Literals.PROPERTY_CATEGORY__OPEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropertyCategory_properties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropertyCategory_properties_feature", "_UI_PropertyCategory_type"),
				 PropertiesPackage.Literals.PROPERTY_CATEGORY__PROPERTIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				PropertyCategory category = (PropertyCategory) object;
				
				List<Property> properties = new ArrayList<Property>();
				for (Property property: category.getClazz().getProperties()) {
					if (property.getCategory() == null || property.getCategory() == category) {
						properties.add(property);
					}
				}
				
				return properties;
			}		
		});
	}

//	/**
//	 * This adds a property descriptor for the Overridden Properties feature.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated NOT
//	 */
//	protected void addOverriddenPropertiesPropertyDescriptor(Object object) {
//		itemPropertyDescriptors.add
//		(new ItemPropertyDescriptor
//			(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_PropertyCategory_overriddenProperties_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_PropertyCategory_overriddenProperties_feature", "_UI_PropertyCategory_type"),
//				 PropertiesPackage.Literals.PROPERTY_CATEGORY__OVERRIDDEN_PROPERTIES,
//				 true,
//				 false,
//				 true,
//				 null,
//				 null,
//				 null) { 
//		@Override
//		public Collection<?> getChoiceOfValues(Object object) {
//			List<Property> choices = new ArrayList<Property>();
//			PropertyCategory category = (PropertyCategory) object;
//			for (de.uni_paderborn.fujaba.properties.Class clazz : category.getClazz().getAllSuperClasses()) {
//				choices.addAll(clazz.getProperties());
//			}
//			return choices;
//		}	
//			
//	});
//	}

//	/**
//	 * This adds a property descriptor for the Local Properties feature.
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated NOT
//	 */
//	protected void addLocalPropertiesPropertyDescriptor(Object object) {
//		itemPropertyDescriptors.add
//			(new ItemPropertyDescriptor
//				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_PropertyCategory_localProperties_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_PropertyCategory_localProperties_feature", "_UI_PropertyCategory_type"),
//				 PropertiesPackage.Literals.PROPERTY_CATEGORY__LOCAL_PROPERTIES,
//				 true,
//				 false,
//				 true,
//				 null,
//				 null,
//				 null) {
//			@Override
//			public Collection<?> getChoiceOfValues(Object object) {
//				PropertyCategory category = (PropertyCategory) object;
//				
//				List<Property> properties = new ArrayList<Property>();
//				for (Property property: category.getClazz().getProperties()) {
//					if (property.getCategory() == null || property.getCategory() == category) {
//						properties.add(property);
//					}
//				}
//				
//				return properties;
//			}		
//		});
//	}

	/**
	 * This returns PropertyCategory.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PropertyCategory"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PropertyCategory)object).getTitle();
		return label == null || label.length() == 0 ?
			getString("_UI_PropertyCategory_type") :
			getString("_UI_PropertyCategory_type") + " " + label;
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

		switch (notification.getFeatureID(PropertyCategory.class)) {
			case PropertiesPackage.PROPERTY_CATEGORY__TITLE:
			case PropertiesPackage.PROPERTY_CATEGORY__VERTICAL:
			case PropertiesPackage.PROPERTY_CATEGORY__OPEN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PropertiesEditPlugin.INSTANCE;
	}

}
