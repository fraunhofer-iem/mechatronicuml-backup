/**
 */
package org.muml.emm.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.muml.emm.Mapping;
import org.muml.emm.MigrationPackage;

/**
 * This is the item provider adapter for a {@link org.muml.emm.Mapping} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingItemProvider extends CreateClassItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingItemProvider(AdapterFactory adapterFactory) {
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

			addSourceClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Source Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSourceClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Mapping_sourceClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Mapping_sourceClass_feature", "_UI_Mapping_type"),
				 MigrationPackage.Literals.MAPPING__SOURCE_CLASS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null)
			{
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					Collection<EClass> sourceClasses = new ArrayList<EClass>();
					Mapping mapping = (Mapping) object;
					if (mapping.getMigrator() != null) {
						for (EPackage sourcePackage : mapping.getMigrator().getSourcePackages()) {
							for (EClassifier classifier : sourcePackage.getEClassifiers()) {
								if (classifier instanceof EClass) {
									sourceClasses.add((EClass) classifier);
								}
							}
						}
					}
					return sourceClasses;
				}
			});
	}

	/**
	 * This returns Mapping.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Mapping"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		Mapping mapping = (Mapping) object;
		StringBuffer buf = new StringBuffer();
		buf.append(getString("_UI_Mapping_type"));
		buf.append(' ');
		if (mapping.getSourceClass() != null && mapping.getSourceClass().getName() != null) {
			buf.append(mapping.getSourceClass().getName());
		}
		buf.append(" := new ");
		if (mapping.getTargetClass() != null && mapping.getTargetClass().getName() != null) {
			buf.append(mapping.getTargetClass().getName());
		}
		
		return buf.toString();
		
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
