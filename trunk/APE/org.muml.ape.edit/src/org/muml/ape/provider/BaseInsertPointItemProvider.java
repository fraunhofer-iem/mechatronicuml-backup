/**
 */
package org.muml.ape.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.muml.ape.BaseInsertPoint;
import org.muml.ape.PropertiesPackage;

/**
 * This is the item provider adapter for a {@link org.muml.ape.BaseInsertPoint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BaseInsertPointItemProvider extends OrderedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseInsertPointItemProvider(AdapterFactory adapterFactory) {
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

			addBaseClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Base Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addBaseClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BaseInsertPoint_baseClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BaseInsertPoint_baseClass_feature", "_UI_BaseInsertPoint_type"),
				 PropertiesPackage.Literals.BASE_INSERT_POINT__BASE_CLASS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null) {
				
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					BaseInsertPoint baseInsertPoint = (BaseInsertPoint) object;
					org.muml.ape.Class clazz = baseInsertPoint.getClazz();
					return clazz.getAllSuperClasses();
				}
				
		});
	}

	/**
	 * This returns BaseInsertPoint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BaseInsertPoint"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		BaseInsertPoint baseInsertPoint = (BaseInsertPoint) object;
		
		// Get name of base class
		String name = "null";
		if (baseInsertPoint.getBaseClass() != null) {
			org.muml.ape.Class baseClass = baseInsertPoint.getBaseClass();
			if (baseClass.getGenClass() != null) {
				GenClass genClass = (GenClass) baseClass.getGenClass();
				if (genClass.getName() != null) {
					name = genClass.getName();
				}
			}
		}
		
		return getString("_UI_BaseInsertPoint_type") + " " + name;
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

}
