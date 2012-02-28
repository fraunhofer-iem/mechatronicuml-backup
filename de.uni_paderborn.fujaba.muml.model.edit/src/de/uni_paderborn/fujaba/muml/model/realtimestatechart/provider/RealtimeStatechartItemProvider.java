/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.provider;


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
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.provider.NamedElementItemProvider;

import de.uni_paderborn.fujaba.muml.model.component.provider.MumlEditPlugin;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimeStatechart} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RealtimeStatechartItemProvider
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
			addAttributesPropertyDescriptor(object);
			addClocksPropertyDescriptor(object);
			addHistoryPropertyDescriptor(object);
			addEventQueueSizePropertyDescriptor(object);
			addFlatPropertyDescriptor(object);
			addSecurityLevelPropertyDescriptor(object);
			addUtilisationPropertyDescriptor(object);
			addScheduleDocumentPropertyDescriptor(object);
			addEmbeddedPropertyDescriptor(object);
			addAllAvailableAttributesPropertyDescriptor(object);
			addAllAvailableOperationsPropertyDescriptor(object);
			addStatechartPropertyDescriptor(object);
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
				 SDMPackage.Literals.COMMENTABLE_ELEMENT__COMMENT,
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
				 CorePackage.Literals.BEHAVIOR__BEHAVIORAL_ELEMENT,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_GeneralPropertyCategory"),
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
				 CorePackage.Literals.BEHAVIOR__OPERATIONS,
				 true,
				 false,
				 false,
				 null,
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Attributes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Behavior_attributes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Behavior_attributes_feature", "_UI_Behavior_type"),
				 CorePackage.Literals.BEHAVIOR__ATTRIBUTES,
				 true,
				 false,
				 false,
				 null,
				 getString("_UI_GeneralPropertyCategory"),
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
	 * This adds a property descriptor for the History feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHistoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RealtimeStatechart_history_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RealtimeStatechart_history_feature", "_UI_RealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.REALTIME_STATECHART__HISTORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Event Queue Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventQueueSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RealtimeStatechart_eventQueueSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RealtimeStatechart_eventQueueSize_feature", "_UI_RealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.REALTIME_STATECHART__EVENT_QUEUE_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
	 * This adds a property descriptor for the Security Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RealtimeStatechart_securityLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RealtimeStatechart_securityLevel_feature", "_UI_RealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.REALTIME_STATECHART__SECURITY_LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Utilisation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUtilisationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RealtimeStatechart_utilisation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RealtimeStatechart_utilisation_feature", "_UI_RealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.REALTIME_STATECHART__UTILISATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schedule Document feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScheduleDocumentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RealtimeStatechart_scheduleDocument_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RealtimeStatechart_scheduleDocument_feature", "_UI_RealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.REALTIME_STATECHART__SCHEDULE_DOCUMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
	 * This adds a property descriptor for the All Available Attributes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllAvailableAttributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RealtimeStatechart_allAvailableAttributes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RealtimeStatechart_allAvailableAttributes_feature", "_UI_RealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.REALTIME_STATECHART__ALL_AVAILABLE_ATTRIBUTES,
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
	 * This adds a property descriptor for the Statechart feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatechartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RealtimeStatechart_statechart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RealtimeStatechart_statechart_feature", "_UI_RealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.REALTIME_STATECHART__STATECHART,
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
			childrenFeatures.add(CorePackage.Literals.BEHAVIOR__OPERATIONS);
			childrenFeatures.add(CorePackage.Literals.BEHAVIOR__ATTRIBUTES);
			childrenFeatures.add(RealtimestatechartPackage.Literals.REALTIME_STATECHART__TRANSITIONS);
			childrenFeatures.add(RealtimestatechartPackage.Literals.REALTIME_STATECHART__VERTICES);
			childrenFeatures.add(RealtimestatechartPackage.Literals.REALTIME_STATECHART__CLOCKS);
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
			case RealtimestatechartPackage.REALTIME_STATECHART__HISTORY:
			case RealtimestatechartPackage.REALTIME_STATECHART__EVENT_QUEUE_SIZE:
			case RealtimestatechartPackage.REALTIME_STATECHART__FLAT:
			case RealtimestatechartPackage.REALTIME_STATECHART__SECURITY_LEVEL:
			case RealtimestatechartPackage.REALTIME_STATECHART__UTILISATION:
			case RealtimestatechartPackage.REALTIME_STATECHART__SCHEDULE_DOCUMENT:
			case RealtimestatechartPackage.REALTIME_STATECHART__EMBEDDED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RealtimestatechartPackage.REALTIME_STATECHART__OPERATIONS:
			case RealtimestatechartPackage.REALTIME_STATECHART__ATTRIBUTES:
			case RealtimestatechartPackage.REALTIME_STATECHART__TRANSITIONS:
			case RealtimestatechartPackage.REALTIME_STATECHART__VERTICES:
			case RealtimestatechartPackage.REALTIME_STATECHART__CLOCKS:
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
				(RealtimestatechartPackage.Literals.REALTIME_STATECHART__TRANSITIONS,
				 RealtimestatechartFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.REALTIME_STATECHART__VERTICES,
				 RealtimestatechartFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.REALTIME_STATECHART__VERTICES,
				 RealtimestatechartFactory.eINSTANCE.createEntryPoint()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.REALTIME_STATECHART__VERTICES,
				 RealtimestatechartFactory.eINSTANCE.createExitPoint()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.REALTIME_STATECHART__VERTICES,
				 RealtimestatechartFactory.eINSTANCE.createStateEntryPoint()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.REALTIME_STATECHART__VERTICES,
				 RealtimestatechartFactory.eINSTANCE.createStateExitPoint()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.REALTIME_STATECHART__CLOCKS,
				 RealtimestatechartFactory.eINSTANCE.createClock()));
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
