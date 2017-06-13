/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.realtimestatechart.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.core.CorePackage;
import org.muml.core.provider.NamedElementItemProvider;
import org.muml.pim.behavior.BehaviorFactory;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.provider.MumlEditPlugin;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.RealtimestatechartFactory;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;

/**
 * This is the item provider adapter for a {@link org.muml.pim.realtimestatechart.RealtimeStatechart} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RealtimeStatechartItemProvider
	extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechartItemProvider(AdapterFactory adapterFactory) {
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
			addBehavioralElementPropertyDescriptor(object);
			addOperationsPropertyDescriptor(object);
			addVariablesPropertyDescriptor(object);
			addTransitionsPropertyDescriptor(object);
			addStatesPropertyDescriptor(object);
			addClocksPropertyDescriptor(object);
			addFlatPropertyDescriptor(object);
			addEmbeddedPropertyDescriptor(object);
			addAllAvailableVariablesPropertyDescriptor(object);
			addAllAvailableOperationsPropertyDescriptor(object);
			addUsedOperationRepositoriesPropertyDescriptor(object);
			addUsesOneToManyCommunicationSchemataPropertyDescriptor(object);
			addSubRoleSpecificVariablesPropertyDescriptor(object);
			addSubRoleSpecificClocksPropertyDescriptor(object);
			addSubRoleSpecificOperationsPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Behavioral Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBehavioralElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Behavior_behavioralElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Behavior_behavioralElement_feature", "_UI_Behavior_type"),
				 BehaviorPackage.Literals.BEHAVIOR__BEHAVIORAL_ELEMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Behavior_operations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Behavior_operations_feature", "_UI_Behavior_type"),
				 BehaviorPackage.Literals.BEHAVIOR__OPERATIONS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Variables feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariablesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Behavior_variables_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Behavior_variables_feature", "_UI_Behavior_type"),
				 BehaviorPackage.Literals.BEHAVIOR__VARIABLES,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transitions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransitionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RealtimeStatechart_transitions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RealtimeStatechart_transitions_feature", "_UI_RealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.REALTIME_STATECHART__TRANSITIONS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the States feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RealtimeStatechart_states_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RealtimeStatechart_states_feature", "_UI_RealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.REALTIME_STATECHART__STATES,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Clocks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClocksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RealtimeStatechart_clocks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RealtimeStatechart_clocks_feature", "_UI_RealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.REALTIME_STATECHART__CLOCKS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Flat feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RealtimeStatechart_flat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RealtimeStatechart_flat_feature", "_UI_RealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.REALTIME_STATECHART__FLAT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Embedded feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmbeddedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RealtimeStatechart_embedded_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RealtimeStatechart_embedded_feature", "_UI_RealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.REALTIME_STATECHART__EMBEDDED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the All Available Variables feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllAvailableVariablesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RealtimeStatechart_allAvailableVariables_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RealtimeStatechart_allAvailableVariables_feature", "_UI_RealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.REALTIME_STATECHART__ALL_AVAILABLE_VARIABLES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the All Available Operations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllAvailableOperationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RealtimeStatechart_allAvailableOperations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RealtimeStatechart_allAvailableOperations_feature", "_UI_RealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.REALTIME_STATECHART__ALL_AVAILABLE_OPERATIONS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Used Operation Repositories feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsedOperationRepositoriesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RealtimeStatechart_usedOperationRepositories_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RealtimeStatechart_usedOperationRepositories_feature", "_UI_RealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.REALTIME_STATECHART__USED_OPERATION_REPOSITORIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uses One To Many Communication Schemata feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsesOneToManyCommunicationSchemataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RealtimeStatechart_usesOneToManyCommunicationSchemata_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RealtimeStatechart_usesOneToManyCommunicationSchemata_feature", "_UI_RealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.REALTIME_STATECHART__USES_ONE_TO_MANY_COMMUNICATION_SCHEMATA,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sub Role Specific Variables feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubRoleSpecificVariablesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RealtimeStatechart_subRoleSpecificVariables_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RealtimeStatechart_subRoleSpecificVariables_feature", "_UI_RealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_VARIABLES,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sub Role Specific Clocks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubRoleSpecificClocksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RealtimeStatechart_subRoleSpecificClocks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RealtimeStatechart_subRoleSpecificClocks_feature", "_UI_RealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_CLOCKS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sub Role Specific Operations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubRoleSpecificOperationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RealtimeStatechart_subRoleSpecificOperations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RealtimeStatechart_subRoleSpecificOperations_feature", "_UI_RealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_OPERATIONS,
				 true,
				 false,
				 false,
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
			childrenFeatures.add(BehaviorPackage.Literals.BEHAVIOR__OPERATIONS);
			childrenFeatures.add(BehaviorPackage.Literals.BEHAVIOR__VARIABLES);
			childrenFeatures.add(RealtimestatechartPackage.Literals.REALTIME_STATECHART__TRANSITIONS);
			childrenFeatures.add(RealtimestatechartPackage.Literals.REALTIME_STATECHART__STATES);
			childrenFeatures.add(RealtimestatechartPackage.Literals.REALTIME_STATECHART__CLOCKS);
			childrenFeatures.add(RealtimestatechartPackage.Literals.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_VARIABLES);
			childrenFeatures.add(RealtimestatechartPackage.Literals.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_CLOCKS);
			childrenFeatures.add(RealtimestatechartPackage.Literals.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_OPERATIONS);
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
	 * This returns RealtimeStatechart.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RealtimeStatechart"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RealtimeStatechart)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_RealtimeStatechart_type") :
			getString("_UI_RealtimeStatechart_type") + " " + label;
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

		switch (notification.getFeatureID(RealtimeStatechart.class)) {
			case RealtimestatechartPackage.REALTIME_STATECHART__COMMENT:
			case RealtimestatechartPackage.REALTIME_STATECHART__FLAT:
			case RealtimestatechartPackage.REALTIME_STATECHART__AVAILABLE_CLOCKS:
			case RealtimestatechartPackage.REALTIME_STATECHART__EMBEDDED:
			case RealtimestatechartPackage.REALTIME_STATECHART__ALL_AVAILABLE_VARIABLES:
			case RealtimestatechartPackage.REALTIME_STATECHART__ALL_AVAILABLE_OPERATIONS:
			case RealtimestatechartPackage.REALTIME_STATECHART__USES_ONE_TO_MANY_COMMUNICATION_SCHEMATA:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__OPERATIONS:
			case RealtimestatechartPackage.REALTIME_STATECHART__VARIABLES:
			case RealtimestatechartPackage.REALTIME_STATECHART__TRANSITIONS:
			case RealtimestatechartPackage.REALTIME_STATECHART__STATES:
			case RealtimestatechartPackage.REALTIME_STATECHART__CLOCKS:
			case RealtimestatechartPackage.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_VARIABLES:
			case RealtimestatechartPackage.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_CLOCKS:
			case RealtimestatechartPackage.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_OPERATIONS:
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
				(BehaviorPackage.Literals.BEHAVIOR__OPERATIONS,
				 BehaviorFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.BEHAVIOR__VARIABLES,
				 BehaviorFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.REALTIME_STATECHART__TRANSITIONS,
				 RealtimestatechartFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.REALTIME_STATECHART__STATES,
				 RealtimestatechartFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.REALTIME_STATECHART__CLOCKS,
				 RealtimestatechartFactory.eINSTANCE.createClock()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_VARIABLES,
				 BehaviorFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_CLOCKS,
				 RealtimestatechartFactory.eINSTANCE.createClock()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_OPERATIONS,
				 BehaviorFactory.eINSTANCE.createOperation()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == BehaviorPackage.Literals.BEHAVIOR__OPERATIONS ||
			childFeature == RealtimestatechartPackage.Literals.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_OPERATIONS ||
			childFeature == BehaviorPackage.Literals.BEHAVIOR__VARIABLES ||
			childFeature == RealtimestatechartPackage.Literals.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_VARIABLES ||
			childFeature == RealtimestatechartPackage.Literals.REALTIME_STATECHART__CLOCKS ||
			childFeature == RealtimestatechartPackage.Literals.REALTIME_STATECHART__SUB_ROLE_SPECIFIC_CLOCKS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
