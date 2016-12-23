/**
 */
package org.muml.emm.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.muml.emm.CreateClass;
import org.muml.emm.CreateInitializer;
import org.muml.emm.FeatureInitializer;
import org.muml.emm.MigrationPackage;

/**
 * This is the item provider adapter for a {@link org.muml.emm.CreateInitializer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CreateInitializerItemProvider extends CreateClassItemProvider {
	/**
	 * @generated NOT
	 */
	protected Collection<EClass> getPossibleTargetClasses(Object object) {
		CreateInitializer referenceInitializer = (CreateInitializer) object;
		if (referenceInitializer.getTargetFeature() != null && referenceInitializer.getTargetFeature().getEType() != null) {
			EClassifier type = referenceInitializer.getTargetFeature().getEType();
			if (type instanceof EClass) {
				EClass referenceType = (EClass) type;
				Collection<EClass> targetClasses = super.getPossibleTargetClasses(object);
				Iterator<EClass> iterator = targetClasses.iterator();
				while (iterator.hasNext()) {
					EClass targetClass = iterator.next();
					if (targetClass == null || !referenceType.isSuperTypeOf(targetClass)) {
						iterator.remove();
					}
				}
				return targetClasses;
			}
		}
		return Collections.emptyList();
	}
	
	
	
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateInitializerItemProvider(AdapterFactory adapterFactory) {
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

			addTargetFeaturePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Target Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addTargetFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FeatureInitializer_targetFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FeatureInitializer_targetFeature_feature", "_UI_FeatureInitializer_type"),
				 MigrationPackage.Literals.FEATURE_INITIALIZER__TARGET_FEATURE,
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
						EClass targetClass = createClass.getTargetClass();
						List<EReference> containmentReferences = new ArrayList<EReference>();
						for (EReference reference : targetClass.getEAllReferences()) {
							if (reference.isContainment()) {
								containmentReferences.add(reference);
							}
						}
						return containmentReferences;
					}
				}
				return Collections.emptyList();
			}
			
		
		});
	}

	/**
	 * This returns CreateInitializer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CreateInitializer"));
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
		buf.append(getString("_UI_CreateInitializer_type"));
		buf.append(' ');
		CreateInitializer referenceInitializer = (CreateInitializer) object;
		if (referenceInitializer.getTargetFeature() != null && referenceInitializer.getTargetFeature().getName() != null) {
			buf.append(referenceInitializer.getTargetFeature().getName());
		}
		buf.append(" := ");
		if (referenceInitializer.getTargetClass() != null && referenceInitializer.getTargetClass().getName() != null) {
			buf.append("new ");
			buf.append(referenceInitializer.getTargetClass().getName());
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
