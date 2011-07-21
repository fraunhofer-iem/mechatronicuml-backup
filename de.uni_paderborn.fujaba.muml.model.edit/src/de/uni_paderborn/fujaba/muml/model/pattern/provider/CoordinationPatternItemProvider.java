/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.pattern.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.provider.NamedElementItemProvider;

import de.uni_paderborn.fujaba.common.descriptor.DefaultChainedPropertyDescriptor;
import de.uni_paderborn.fujaba.common.descriptor.IChainedPropertyDescriptor;
import de.uni_paderborn.fujaba.muml.model.component.provider.MumlEditPlugin;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.core.descriptor.NaturalNumberPropertyDescriptor;
import de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternFactory;
import de.uni_paderborn.fujaba.muml.model.pattern.PatternPackage;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CoordinationPatternItemProvider
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
	public CoordinationPatternItemProvider(AdapterFactory adapterFactory) {
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

			addConstraintPropertyDescriptor(object);
			addConnectorsPropertyDescriptor(object);
			addRole1PropertyDescriptor(object);
			addRole2PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Constraint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConstrainableElement_constraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConstrainableElement_constraint_feature", "_UI_ConstrainableElement_type"),
				 CorePackage.Literals.CONSTRAINABLE_ELEMENT__CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connectors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoordinationPattern_connectors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoordinationPattern_connectors_feature", "_UI_CoordinationPattern_type"),
				 PatternPackage.Literals.COORDINATION_PATTERN__CONNECTORS,
				 true,
				 false,
				 false,
				 null,
				 getString("_UI_RoleConnectorPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Role1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addRole1PropertyDescriptor(Object object) {
		addRolePropertyDescriptor(PatternPackage.Literals.COORDINATION_PATTERN__ROLE1, getString("_UI_Role1PropertyCategory"));		
	}
	

	/**
	 * This adds a property descriptor for the Role2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addRole2PropertyDescriptor(Object object) {
		addRolePropertyDescriptor(PatternPackage.Literals.COORDINATION_PATTERN__ROLE2, getString("_UI_Role2PropertyCategory"));
	}


	private void addRolePropertyDescriptor(EReference reference, String category) {
		IChainedPropertyDescriptor rootPropertyDescriptor = new DefaultChainedPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CoordinationPattern_role1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CoordinationPattern_role1_feature", "_UI_CoordinationPattern_type"),
				 reference,
				 true,
				 false,
				 true,
				 null,
				 category,
				 null);
		
		itemPropertyDescriptors.add(new DefaultChainedPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_NamedElement_name_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature", "_UI_NamedElement_type"),
				SDMPackage.Literals.NAMED_ELEMENT__NAME,
				true,
				false,
				false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				category,
				null,
				rootPropertyDescriptor));

		itemPropertyDescriptors.add(new DefaultChainedPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_ConstrainableElement_constraint_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_ConstrainableElement_constraint_feature", "_UI_ConstrainableElement_type"),
			 CorePackage.Literals.CONSTRAINABLE_ELEMENT__CONSTRAINT,
			 true,
			 false,
			 true,
			 null,
			 category,
			 null,
			 rootPropertyDescriptor));
		
		itemPropertyDescriptors.add(new DefaultChainedPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_BehavioralElement_behavior_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_BehavioralElement_behavior_feature", "_UI_BehavioralElement_type"),
			 CorePackage.Literals.BEHAVIORAL_ELEMENT__BEHAVIOR,
			 true,
			 false,
			 true,
			 null,
			 category,
			 null,
			 rootPropertyDescriptor));
		
		IChainedPropertyDescriptor eClassPropertyDescriptor = new DefaultChainedPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_Role_eClass_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_Role_eClass_feature", "_UI_Role_type"),
			 PatternPackage.Literals.ROLE__ECLASS,
			 true,
			 false,
			 true,
			 null,
			 category,
			 null,
			 rootPropertyDescriptor);

		itemPropertyDescriptors.add(new DefaultChainedPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_EClass_eAttributes_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_EClass_eAttributes_feature", "_UI_EClass_type"),
			 EcorePackage.Literals.ECLASS__EATTRIBUTES,
			 EcorePackage.Literals.ECLASS__ESTRUCTURAL_FEATURES,
			 true,
			 false,
			 false,
			 null,
			 category,
			 null,
			 eClassPropertyDescriptor));
		
		itemPropertyDescriptors.add(new DefaultChainedPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_Role_senderMessageInterface_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_Role_senderMessageInterface_feature", "_UI_Role_type"),
			 PatternPackage.Literals.ROLE__SENDER_MESSAGE_INTERFACE,
			 true,
			 false,
			 true,
			 null,
			 category,
			 null,
			 rootPropertyDescriptor));
		
		itemPropertyDescriptors.add(new DefaultChainedPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_Role_receiverMessageInterface_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_Role_receiverMessageInterface_feature", "_UI_Role_type"),
			 PatternPackage.Literals.ROLE__RECEIVER_MESSAGE_INTERFACE,
			 true,
			 false,
			 true,
			 null,
			 category,
			 null,
			 rootPropertyDescriptor));
		
		IChainedPropertyDescriptor cardinalityPropertyDescriptor = new DefaultChainedPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Role_cardinality_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Role_cardinality_feature", "_UI_Role_type"),
				PatternPackage.Literals.ROLE__CARDINALITY,
				true,
				false,
				false,
				null,
				category,
				null,
				rootPropertyDescriptor);

		itemPropertyDescriptors.add(new NaturalNumberPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Cardinality_lowerBound_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Cardinality_lowerBound_feature", "_UI_Cardinality_type"),
				CorePackage.Literals.CARDINALITY__LOWER_BOUND,
				true,
				false,
				false,
				null,
				category,
				null, 
				cardinalityPropertyDescriptor));

		itemPropertyDescriptors.add(new NaturalNumberPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Cardinality_upperBound_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Cardinality_upperBound_feature", "_UI_Cardinality_type"),
				CorePackage.Literals.CARDINALITY__UPPER_BOUND,
				true,
				false,
				false,
				null,
				category,
				null,
				cardinalityPropertyDescriptor));
		
		itemPropertyDescriptors.add(new DefaultChainedPropertyDescriptor(
			((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			 getResourceLocator(),
			 getString("_UI_Role_port_feature"),
			 getString("_UI_PropertyDescriptor_description", "_UI_Role_port_feature", "_UI_Role_type"),
			 PatternPackage.Literals.ROLE__PORT,
			 true,
			 false,
			 true,
			 null,
			 category,
			 null,
			 rootPropertyDescriptor));
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
			childrenFeatures.add(PatternPackage.Literals.COORDINATION_PATTERN__CONNECTORS);
			childrenFeatures.add(PatternPackage.Literals.COORDINATION_PATTERN__ROLE2);
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
	 * This returns CoordinationPattern.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CoordinationPattern"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CoordinationPattern)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CoordinationPattern_type") :
			getString("_UI_CoordinationPattern_type") + " " + label;
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

		switch (notification.getFeatureID(CoordinationPattern.class)) {
			case PatternPackage.COORDINATION_PATTERN__CONNECTORS:
			case PatternPackage.COORDINATION_PATTERN__ROLE2:
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
				(PatternPackage.Literals.COORDINATION_PATTERN__CONNECTORS,
				 PatternFactory.eINSTANCE.createRoleConnector()));

		newChildDescriptors.add
			(createChildParameter
				(PatternPackage.Literals.COORDINATION_PATTERN__ROLE2,
				 PatternFactory.eINSTANCE.createRole()));
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
