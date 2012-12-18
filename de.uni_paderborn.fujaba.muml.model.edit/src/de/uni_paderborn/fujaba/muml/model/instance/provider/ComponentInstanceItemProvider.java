/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
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
import org.storydriven.core.provider.NamedElementItemProvider;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.provider.MumlEditPlugin;
import de.uni_paderborn.fujaba.muml.model.instance.AtomicComponentInstance;
import de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstanceFactory;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.instance.StructuredComponentInstance;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.model.instance.ComponentInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentInstanceItemProvider
	extends NamedElementItemProvider
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
	public ComponentInstanceItemProvider(AdapterFactory adapterFactory) {
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

			addComponentTypePropertyDescriptor(object);
			addPortInstancesPropertyDescriptor(object);
			addComponentPartPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Component Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addComponentTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentInstance_componentType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInstance_componentType_feature", "_UI_ComponentInstance_type"),
				 InstancePackage.Literals.COMPONENT_INSTANCE__COMPONENT_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null) {

					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						Collection<?> choices = super.getChoiceOfValues(object);
						
						// Restrict allowed type based on the kind of ComponentInstance
						EClass allowedType = null;
						if (object instanceof StructuredComponentInstance) {
							allowedType = ComponentPackage.Literals.STRUCTURED_COMPONENT;
						} else if (object instanceof AtomicComponentInstance){
							allowedType = ComponentPackage.Literals.ATOMIC_COMPONENT;
						}
						
						// Filter the choices
						if (allowedType != null) {
							Collection<?> filteredChoices = new ArrayList<Object>(choices);
							for (Object choice : choices) {
								if (choice != null && !allowedType.isSuperTypeOf(((EObject) choice).eClass())) {
									filteredChoices.remove(choice);
								}
							}
							choices = filteredChoices;
						}
						
						
						return choices;
					}
				
			});
	}

	/**
	 * This adds a property descriptor for the Port Instances feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortInstancesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentInstance_portInstances_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInstance_portInstances_feature", "_UI_ComponentInstance_type"),
				 InstancePackage.Literals.COMPONENT_INSTANCE__PORT_INSTANCES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Component Part feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentPartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentInstance_componentPart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentInstance_componentPart_feature", "_UI_ComponentInstance_type"),
				 InstancePackage.Literals.COMPONENT_INSTANCE__COMPONENT_PART,
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
			childrenFeatures.add(InstancePackage.Literals.COMPONENT_INSTANCE__PORT_INSTANCES);
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
	 * This returns ComponentInstance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentInstance"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ComponentInstance)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ComponentInstance_type") :
			getString("_UI_ComponentInstance_type") + " " + label;
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

		switch (notification.getFeatureID(ComponentInstance.class)) {
			case InstancePackage.COMPONENT_INSTANCE__PORT_INSTANCES:
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
				(InstancePackage.Literals.COMPONENT_INSTANCE__PORT_INSTANCES,
				 InstanceFactory.eINSTANCE.createContinuousPortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(InstancePackage.Literals.COMPONENT_INSTANCE__PORT_INSTANCES,
				 InstanceFactory.eINSTANCE.createHybridPortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(InstancePackage.Literals.COMPONENT_INSTANCE__PORT_INSTANCES,
				 InstanceFactory.eINSTANCE.createDiscreteSinglePortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(InstancePackage.Literals.COMPONENT_INSTANCE__PORT_INSTANCES,
				 InstanceFactory.eINSTANCE.createDiscreteMultiPortInstance()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MumlEditPlugin.INSTANCE;
	}

}
