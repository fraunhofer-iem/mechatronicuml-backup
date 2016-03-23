/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.ape.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
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
import org.muml.ape.PropertiesFactory;
import org.muml.ape.PropertiesPackage;

/**
 * This is the item provider adapter for a {@link org.muml.ape.Class} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassItemProvider
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
	public ClassItemProvider(AdapterFactory adapterFactory) {
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

			addGenClassPropertyDescriptor(object);
			addSuperClassesPropertyDescriptor(object);
			addAllSuperClassesPropertyDescriptor(object);
			addPropertiesPropertyDescriptor(object);
			addBaseInsertPointsPropertyDescriptor(object);
			addPropertyCategoriesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Gen Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addGenClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_genClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_genClass_feature", "_UI_Class_type"),
				 PropertiesPackage.Literals.CLASS__GEN_CLASS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null) {

			public java.util.Collection<?> getChoiceOfValues(Object object) {
				Collection<GenClass> valid = new ArrayList<GenClass>();
				valid.add(null);

				org.muml.ape.Package _package = ((org.muml.ape.Class) object)
						.getPackage();
				if (_package != null) {
					for (Object choice : super.getChoiceOfValues(object)) {
						if (choice instanceof GenClass) {
							GenClass genClass = (GenClass) choice;
							if (_package.getGenPackage() == genClass
									.getGenPackage()) {
								valid.add(genClass);
							}
						}
					}
				}
				return valid;
			}
			
			});
	}

	/**
	 * This adds a property descriptor for the Super Classes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuperClassesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_superClasses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_superClasses_feature", "_UI_Class_type"),
				 PropertiesPackage.Literals.CLASS__SUPER_CLASSES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the All Super Classes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllSuperClassesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_allSuperClasses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_allSuperClasses_feature", "_UI_Class_type"),
				 PropertiesPackage.Literals.CLASS__ALL_SUPER_CLASSES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_properties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_properties_feature", "_UI_Class_type"),
				 PropertiesPackage.Literals.CLASS__PROPERTIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Insert Points feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseInsertPointsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_baseInsertPoints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_baseInsertPoints_feature", "_UI_Class_type"),
				 PropertiesPackage.Literals.CLASS__BASE_INSERT_POINTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Property Categories feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyCategoriesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Class_propertyCategories_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Class_propertyCategories_feature", "_UI_Class_type"),
				 PropertiesPackage.Literals.CLASS__PROPERTY_CATEGORIES,
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
			childrenFeatures.add(PropertiesPackage.Literals.CLASS__ORDERED_ELEMENTS);
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
	 * This returns Class.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Class"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		org.muml.ape.Class _class = (org.muml.ape.Class) object;
		String name = getString("_UI_Class_type");
		if (_class != null && _class.getGenClass() != null && _class.getGenClass().getEcoreClassifier() != null
				&& _class.getGenClass().getEcoreClassifier().getName() != null) {
			name = _class.getGenClass().getEcoreClassifier().getName();
		}
		
		if (!_class.getSuperClasses().isEmpty()) {
			String superClassesNames = null;
			for (org.muml.ape.Class superClass : _class.getSuperClasses()) {
				String superClassName = "null";
				if (superClass.getGenClass() != null && superClass.getGenClass().getName() != null) {
					superClassName = superClass.getGenClass().getName();
				}

				// First?
				if (superClassesNames == null) {
					superClassesNames = superClassName;
				} else {
					superClassesNames += ", " + superClassName;
				}
			}
			if (superClassesNames != null) {
				name += " -> " + superClassesNames;
			}
		}
		return name;
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

		switch (notification.getFeatureID(org.muml.ape.Class.class)) {
			case PropertiesPackage.CLASS__ORDERED_ELEMENTS:
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
				(PropertiesPackage.Literals.CLASS__ORDERED_ELEMENTS,
				 PropertiesFactory.eINSTANCE.createBaseInsertPoint()));

		newChildDescriptors.add
			(createChildParameter
				(PropertiesPackage.Literals.CLASS__ORDERED_ELEMENTS,
				 PropertiesFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(PropertiesPackage.Literals.CLASS__ORDERED_ELEMENTS,
				 PropertiesFactory.eINSTANCE.createPropertyCategory()));
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
