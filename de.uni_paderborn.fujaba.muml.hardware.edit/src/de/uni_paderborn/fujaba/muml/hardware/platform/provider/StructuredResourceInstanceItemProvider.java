/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformFactory;
import de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage;
import de.uni_paderborn.fujaba.muml.hardware.platform.StructuredResourceInstance;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.hardware.platform.StructuredResourceInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructuredResourceInstanceItemProvider
	extends ResourceInstanceItemProvider
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
	public StructuredResourceInstanceItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(PlatformPackage.Literals.STRUCTURED_RESOURCE_INSTANCE__EMBEDDED_ATOMIC_RESOURCE_INSTANCES);
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
	 * This returns StructuredResourceInstance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StructuredResourceInstance"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((StructuredResourceInstance)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_StructuredResourceInstance_type") :
			getString("_UI_StructuredResourceInstance_type") + " " + label;
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

		switch (notification.getFeatureID(StructuredResourceInstance.class)) {
			case PlatformPackage.STRUCTURED_RESOURCE_INSTANCE__EMBEDDED_ATOMIC_RESOURCE_INSTANCES:
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
				(PlatformPackage.Literals.STRUCTURED_RESOURCE_INSTANCE__EMBEDDED_ATOMIC_RESOURCE_INSTANCES,
				 PlatformFactory.eINSTANCE.createStorageMemoryInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PlatformPackage.Literals.STRUCTURED_RESOURCE_INSTANCE__EMBEDDED_ATOMIC_RESOURCE_INSTANCES,
				 PlatformFactory.eINSTANCE.createProcessingMemoryInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PlatformPackage.Literals.STRUCTURED_RESOURCE_INSTANCE__EMBEDDED_ATOMIC_RESOURCE_INSTANCES,
				 PlatformFactory.eINSTANCE.createCacheInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PlatformPackage.Literals.STRUCTURED_RESOURCE_INSTANCE__EMBEDDED_ATOMIC_RESOURCE_INSTANCES,
				 PlatformFactory.eINSTANCE.createProgrammableLogicDeviceInstance()));

		newChildDescriptors.add
			(createChildParameter
				(PlatformPackage.Literals.STRUCTURED_RESOURCE_INSTANCE__EMBEDDED_ATOMIC_RESOURCE_INSTANCES,
				 PlatformFactory.eINSTANCE.createProcessorInstance()));
	}
	
	@Override
	/**
	 * This adds a property descriptor for the Resource Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addResourceTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
		(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
		 getResourceLocator(),
		 getString("_UI_ResourceInstance_resourceType_feature"),
		 getString("_UI_PropertyDescriptor_description", "_UI_ResourceInstance_resourceType_feature", "_UI_ResourceInstance_type"),
		 PlatformPackage.Literals.RESOURCE_INSTANCE__RESOURCE_TYPE,
		 true,
		 false,
		 true,
		 null,
		 null,
		 null){
		
		@Override
		public Collection<?> getChoiceOfValues(Object object){
			Collection<?> choices=super.getChoiceOfValues(object);
			
			Collection<?> filteredChoices = new ArrayList<Object>(choices);
			// This Code filters the choice of the type for a StructuredResourcesInstance to StructuredResources
			for(Object choice : choices){
				if(choice != null && !ResourcetypePackage.Literals.STRUCTURED_RESOURCE.isSuperTypeOf(((EObject) choice).eClass())){
					filteredChoices.remove(choice);
				}
			}
			choices=filteredChoices;
			return choices;
		}
	});
	}

}
