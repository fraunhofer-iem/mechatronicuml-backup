/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component.provider;


import java.util.Arrays;
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
import org.storydriven.core.CorePackage;
import org.storydriven.core.provider.NamedElementItemProvider;

import de.uni_paderborn.fujaba.muml.component.Component;
import de.uni_paderborn.fujaba.muml.component.ComponentFactory;
import de.uni_paderborn.fujaba.muml.component.ComponentKind;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.component.Component} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentItemProvider
	extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentItemProvider(AdapterFactory adapterFactory) {
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

			addCommentPropertyDescriptor(object);
			addPortsPropertyDescriptor(object);
			addComponentKindPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommentableElement_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommentableElement_comment_feature", "_UI_CommentableElement_type"),
				 CorePackage.Literals.COMMENTABLE_ELEMENT__COMMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ports feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_ports_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_ports_feature", "_UI_Component_type"),
				 ComponentPackage.Literals.COMPONENT__PORTS,
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Component Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_componentKind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_componentKind_feature", "_UI_Component_type"),
				 ComponentPackage.Literals.COMPONENT__COMPONENT_KIND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_Component_componentType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_componentType_feature", "_UI_Component_type"),
				 ComponentPackage.Literals.COMPONENT__COMPONENT_KIND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_GeneralPropertyCategory"),
				 null) {

					@Override
					public Collection<?> getChoiceOfValues(Object object) {
						// MUML Bugs #233, #373
						if (object instanceof EObject) {
							EClass eClass = ((EObject) object).eClass();
							
							// TODO: Instead of subtracting invalid choices, I explicitly add valid choices.
							// This is done analogously to the OCL-Constraint implementation "ValidComponentType".
							// We should find out, which way is more extensible if new enum constants are added (substractive blacklist, additive whitelist).
							if (ComponentPackage.Literals.ATOMIC_COMPONENT.isSuperTypeOf(eClass)) {
								return Arrays.asList(new ComponentKind[] {
										ComponentKind.SOFTWARE_COMPONENT,
										ComponentKind.CONTINUOUS_COMPONENT,
										null /* lower bound of zero */});
							} else if (ComponentPackage.Literals.STRUCTURED_COMPONENT.isSuperTypeOf(eClass)) {
								return Arrays.asList(new ComponentKind[] {
										ComponentKind.SOFTWARE_COMPONENT,
										ComponentKind.HYBRID_COMPONENT,
										null /* lower bound of zero */});
							}
						}
						return super.getChoiceOfValues(object);
					}
			});
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
			childrenFeatures.add(ComponentPackage.Literals.COMPONENT__PORTS);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Component)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Component_type") :
			getString("_UI_Component_type") + " " + label;
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

		switch (notification.getFeatureID(Component.class)) {
			case ComponentPackage.COMPONENT__COMMENT:
			case ComponentPackage.COMPONENT__COMPONENT_KIND:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ComponentPackage.COMPONENT__PORTS:
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
				(ComponentPackage.Literals.COMPONENT__PORTS,
				 ComponentFactory.eINSTANCE.createContinuousPort()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentPackage.Literals.COMPONENT__PORTS,
				 ComponentFactory.eINSTANCE.createDiscretePort()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentPackage.Literals.COMPONENT__PORTS,
				 ComponentFactory.eINSTANCE.createHybridPort()));
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
