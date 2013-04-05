/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fujaba.properties.provider;


import de.fujaba.properties.PropertiesFactory;
import de.fujaba.properties.PropertiesPackage;
import de.fujaba.properties.PropertyGenerator;

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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.fujaba.properties.PropertyGenerator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyGeneratorItemProvider
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
	public PropertyGeneratorItemProvider(AdapterFactory adapterFactory) {
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

			addGenModelPropertyDescriptor(object);
			addPluginPropertyDescriptor(object);
			addDefaultTabPropertyDescriptor(object);
			addContributorIdPropertyDescriptor(object);
			addSourceFolderPropertyDescriptor(object);
			addPrereconcileQvtoTransformationPropertyDescriptor(object);
			addPostreconcileQvtoTransformationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Gen Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropertyGenerator_genModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropertyGenerator_genModel_feature", "_UI_PropertyGenerator_type"),
				 PropertiesPackage.Literals.PROPERTY_GENERATOR__GEN_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plugin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPluginPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropertyGenerator_plugin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropertyGenerator_plugin_feature", "_UI_PropertyGenerator_type"),
				 PropertiesPackage.Literals.PROPERTY_GENERATOR__PLUGIN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Tab feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultTabPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropertyGenerator_defaultTab_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropertyGenerator_defaultTab_feature", "_UI_PropertyGenerator_type"),
				 PropertiesPackage.Literals.PROPERTY_GENERATOR__DEFAULT_TAB,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Contributor Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContributorIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropertyGenerator_contributorId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropertyGenerator_contributorId_feature", "_UI_PropertyGenerator_type"),
				 PropertiesPackage.Literals.PROPERTY_GENERATOR__CONTRIBUTOR_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Folder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceFolderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropertyGenerator_sourceFolder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropertyGenerator_sourceFolder_feature", "_UI_PropertyGenerator_type"),
				 PropertiesPackage.Literals.PROPERTY_GENERATOR__SOURCE_FOLDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Prereconcile Qvto Transformation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrereconcileQvtoTransformationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropertyGenerator_prereconcileQvtoTransformation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropertyGenerator_prereconcileQvtoTransformation_feature", "_UI_PropertyGenerator_type"),
				 PropertiesPackage.Literals.PROPERTY_GENERATOR__PRERECONCILE_QVTO_TRANSFORMATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Postreconcile Qvto Transformation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPostreconcileQvtoTransformationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PropertyGenerator_postreconcileQvtoTransformation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PropertyGenerator_postreconcileQvtoTransformation_feature", "_UI_PropertyGenerator_type"),
				 PropertiesPackage.Literals.PROPERTY_GENERATOR__POSTRECONCILE_QVTO_TRANSFORMATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(PropertiesPackage.Literals.PROPERTY_GENERATOR__PLUGIN);
			childrenFeatures.add(PropertiesPackage.Literals.PROPERTY_GENERATOR__TABS);
			childrenFeatures.add(PropertiesPackage.Literals.PROPERTY_GENERATOR__PACKAGES);
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
	 * This returns PropertyGenerator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PropertyGenerator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PropertyGenerator)object).getContributorId();
		return label == null || label.length() == 0 ?
			getString("_UI_PropertyGenerator_type") :
			getString("_UI_PropertyGenerator_type") + " " + label;
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

		switch (notification.getFeatureID(PropertyGenerator.class)) {
			case PropertiesPackage.PROPERTY_GENERATOR__CONTRIBUTOR_ID:
			case PropertiesPackage.PROPERTY_GENERATOR__SOURCE_FOLDER:
			case PropertiesPackage.PROPERTY_GENERATOR__PRERECONCILE_QVTO_TRANSFORMATION:
			case PropertiesPackage.PROPERTY_GENERATOR__POSTRECONCILE_QVTO_TRANSFORMATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PropertiesPackage.PROPERTY_GENERATOR__TABS:
			case PropertiesPackage.PROPERTY_GENERATOR__PACKAGES:
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
				(PropertiesPackage.Literals.PROPERTY_GENERATOR__PLUGIN,
				 PropertiesFactory.eINSTANCE.createPlugin()));

		newChildDescriptors.add
			(createChildParameter
				(PropertiesPackage.Literals.PROPERTY_GENERATOR__TABS,
				 PropertiesFactory.eINSTANCE.createPropertyTab()));

		newChildDescriptors.add
			(createChildParameter
				(PropertiesPackage.Literals.PROPERTY_GENERATOR__PACKAGES,
				 PropertiesFactory.eINSTANCE.createPackage()));
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
