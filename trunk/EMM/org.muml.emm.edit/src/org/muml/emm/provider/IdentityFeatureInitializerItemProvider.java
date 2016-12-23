/**
 */
package org.muml.emm.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.muml.emm.CreateClass;
import org.muml.emm.FeatureInitializer;
import org.muml.emm.IdentityFeatureInitializer;
import org.muml.emm.MigrationPackage;

/**
 * This is the item provider adapter for a {@link org.muml.emm.IdentityFeatureInitializer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IdentityFeatureInitializerItemProvider extends FeatureInitializerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityFeatureInitializerItemProvider(AdapterFactory adapterFactory) {
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

			addSourceFeaturePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Source Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSourceFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IdentityFeatureInitializer_sourceFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IdentityFeatureInitializer_sourceFeature_feature", "_UI_IdentityFeatureInitializer_type"),
				 MigrationPackage.Literals.IDENTITY_FEATURE_INITIALIZER__SOURCE_FEATURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null) {
				
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				FeatureInitializer attributeInitializer = (FeatureInitializer) object;
				if (attributeInitializer.getEmbeddingCreateClass() != null) {
					CreateClass createClass = attributeInitializer.getEmbeddingCreateClass();
					if (createClass.getTargetClass() != null) {
						EClass sourceClass = createClass.getSourceClass();
						List<EStructuralFeature> features = new ArrayList<EStructuralFeature>(sourceClass.getEAllStructuralFeatures());
						features.add(0, null);
						return features;
					}
				}
				return Collections.emptyList();
			}	
				
			});
	}

	/**
	 * This returns IdentityFeatureInitializer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IdentityFeatureInitializer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		StringBuffer buf = new StringBuffer();
		buf.append(getString("_UI_IdentityFeatureInitializer_type"));
		buf.append(' ');
		IdentityFeatureInitializer attributeInitializer = (IdentityFeatureInitializer) object;
		if (attributeInitializer.getTargetFeature() != null && attributeInitializer.getTargetFeature().getName() != null) {
			buf.append(attributeInitializer.getTargetFeature().getName());
		}
		buf.append(" := ");
		if (attributeInitializer.getSourceFeature() != null && attributeInitializer.getSourceFeature().getName() != null) {
			buf.append(attributeInitializer.getSourceFeature().getName());
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
