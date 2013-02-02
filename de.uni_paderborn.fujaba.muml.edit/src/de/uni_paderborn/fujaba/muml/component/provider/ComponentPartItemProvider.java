/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component.provider;


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
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.storydriven.core.CorePackage;
import org.storydriven.core.provider.NamedElementItemProvider;
import org.storydriven.core.provider.CommentableElementItemProvider;

import de.uni_paderborn.fujaba.common.descriptor.DefaultChainedPropertyDescriptor;
import de.uni_paderborn.fujaba.common.descriptor.IChainedPropertyDescriptor;
import de.uni_paderborn.fujaba.muml.component.Component;
import de.uni_paderborn.fujaba.muml.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.component.ComponentPart;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;
import de.uni_paderborn.fujaba.muml.valuetype.descriptor.NaturalNumberPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.component.ComponentPart} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentPartItemProvider
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
	public ComponentPartItemProvider(AdapterFactory adapterFactory) {
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
			addComponentTypePropertyDescriptor(object);
			addParentComponentPropertyDescriptor(object);
			addAssemblyConnectorsPropertyDescriptor(object);
			addDelegationConnectorsPropertyDescriptor(object);
			addCardinalityPropertyDescriptor(object);
			addMultiPartPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Component Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentPart_componentType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentPart_componentType_feature", "_UI_ComponentPart_type"),
				 ComponentPackage.Literals.COMPONENT_PART__COMPONENT_TYPE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentPart_parentComponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentPart_parentComponent_feature", "_UI_ComponentPart_type"),
				 ComponentPackage.Literals.COMPONENT_PART__PARENT_COMPONENT,
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Assembly Connectors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssemblyConnectorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentPart_assemblyConnectors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentPart_assemblyConnectors_feature", "_UI_ComponentPart_type"),
				 ComponentPackage.Literals.COMPONENT_PART__ASSEMBLY_CONNECTORS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Delegation Connectors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDelegationConnectorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentPart_delegationConnectors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentPart_delegationConnectors_feature", "_UI_ComponentPart_type"),
				 ComponentPackage.Literals.COMPONENT_PART__DELEGATION_CONNECTORS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cardinality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addCardinalityPropertyDescriptor(Object object) {
		IChainedPropertyDescriptor rootPropertyDescriptor = new DefaultChainedPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ComponentPart_cardinality_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_ComponentPart_cardinality_feature",
						"_UI_ComponentPart_type"),
				ComponentPackage.Literals.COMPONENT_PART__CARDINALITY, true,
				false, false, null,
				getString("_UI_CardinalityPropertyCategory"), null);

		itemPropertyDescriptors.add(new NaturalNumberPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_Range_lowerBound_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_Range_lowerBound_feature", "_UI_Range_type"),
			 ValuetypePackage.Literals.RANGE__LOWER_BOUND,
			 true,
			 false,
			 false,
			 null,
			 getString("_UI_CardinalityPropertyCategory"),
			 null,
			 rootPropertyDescriptor));

		itemPropertyDescriptors.add(new NaturalNumberPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_Range_upperBound_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_Range_upperBound_feature", "_UI_Range_type"),
			 ValuetypePackage.Literals.RANGE__UPPER_BOUND,
			 true,
			 false,
			 false,
			 null,
			 getString("_UI_CardinalityPropertyCategory"),
			 null,
			 rootPropertyDescriptor));
	}


	/**
	 * This adds a property descriptor for the Multi Part feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultiPartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComponentPart_multiPart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentPart_multiPart_feature", "_UI_ComponentPart_type"),
				 ComponentPackage.Literals.COMPONENT_PART__MULTI_PART,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(ComponentPackage.Literals.COMPONENT_PART__CARDINALITY);
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
	 * This returns ComponentPart.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentPart"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		//String label = ((ComponentPart)object).getComment();
		Component componentType = ((ComponentPart) object).getComponentType();
		String label = componentType == null ? "null" : componentType.getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ComponentPart_type") :
			getString("_UI_ComponentPart_type") + " " + label;
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

		switch (notification.getFeatureID(ComponentPart.class)) {
			case ComponentPackage.COMPONENT_PART__COMMENT:
			case ComponentPackage.COMPONENT_PART__ASSEMBLY_CONNECTORS:
			case ComponentPackage.COMPONENT_PART__DELEGATION_CONNECTORS:
			case ComponentPackage.COMPONENT_PART__PORTS:
			case ComponentPackage.COMPONENT_PART__MULTI_PART:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ComponentPackage.COMPONENT_PART__CARDINALITY:
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
				(ComponentPackage.Literals.COMPONENT_PART__CARDINALITY,
				 ValuetypeFactory.eINSTANCE.createRange()));
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
