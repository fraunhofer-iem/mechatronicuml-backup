/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.provider;


import de.uni_paderborn.fujaba.umlrt.model.behavior.provider.UmlrtEditPlugin;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition;

import java.util.Collection;
import java.util.List;
import java.util.Vector;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UMLRealtimeTransitionItemProvider
	extends PrioritizableItemProvider
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
	public UMLRealtimeTransitionItemProvider(AdapterFactory adapterFactory) {
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

			addUMLRealtimeTransitionMappingVectorPropertyDescriptor(object);
			addSendSynchronizationPropertyDescriptor(object);
			addReceiveSynchronizationPropertyDescriptor(object);
			addTargetUMLRealtimeStatePropertyDescriptor(object);
			addSourceUMLRealtimeStatePropertyDescriptor(object);
			addUMLRealtimeStatechartPropertyDescriptor(object);
			addRelativeDeadlinePropertyDescriptor(object);
			addUrgentPropertyDescriptor(object);
			addGuardPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the UML Realtime Transition Mapping Vector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUMLRealtimeTransitionMappingVectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UMLRealtimeTransition_uMLRealtimeTransitionMappingVector_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeTransition_uMLRealtimeTransitionMappingVector_feature", "_UI_UMLRealtimeTransition_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_TRANSITION__UML_REALTIME_TRANSITION_MAPPING_VECTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Send Synchronization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSendSynchronizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UMLRealtimeTransition_sendSynchronization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeTransition_sendSynchronization_feature", "_UI_UMLRealtimeTransition_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_TRANSITION__SEND_SYNCHRONIZATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Receive Synchronization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReceiveSynchronizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UMLRealtimeTransition_receiveSynchronization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeTransition_receiveSynchronization_feature", "_UI_UMLRealtimeTransition_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_TRANSITION__RECEIVE_SYNCHRONIZATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target UML Realtime State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetUMLRealtimeStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UMLRealtimeTransition_targetUMLRealtimeState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeTransition_targetUMLRealtimeState_feature", "_UI_UMLRealtimeTransition_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_TRANSITION__TARGET_UML_REALTIME_STATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source UML Realtime State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceUMLRealtimeStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UMLRealtimeTransition_sourceUMLRealtimeState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeTransition_sourceUMLRealtimeState_feature", "_UI_UMLRealtimeTransition_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_TRANSITION__SOURCE_UML_REALTIME_STATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the UML Realtime Statechart feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUMLRealtimeStatechartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UMLRealtimeTransition_uMLRealtimeStatechart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeTransition_uMLRealtimeStatechart_feature", "_UI_UMLRealtimeTransition_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_TRANSITION__UML_REALTIME_STATECHART,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Relative Deadline feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelativeDeadlinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UMLRealtimeTransition_relativeDeadline_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeTransition_relativeDeadline_feature", "_UI_UMLRealtimeTransition_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_TRANSITION__RELATIVE_DEADLINE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Urgent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUrgentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UMLRealtimeTransition_urgent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeTransition_urgent_feature", "_UI_UMLRealtimeTransition_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_TRANSITION__URGENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Guard feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGuardPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UMLRealtimeTransition_guard_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeTransition_guard_feature", "_UI_UMLRealtimeTransition_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_TRANSITION__GUARD,
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
			childrenFeatures.add(RealtimestatechartPackage.Literals.UML_REALTIME_TRANSITION__SIDE_EFFECT);
			childrenFeatures.add(RealtimestatechartPackage.Literals.UML_REALTIME_TRANSITION__RESETS);
			childrenFeatures.add(RealtimestatechartPackage.Literals.UML_REALTIME_TRANSITION__UML_REALTIME_FLAT_SWITCHING);
			childrenFeatures.add(RealtimestatechartPackage.Literals.UML_REALTIME_TRANSITION__UML_REALTIME_FADING_FUNCTION);
			childrenFeatures.add(RealtimestatechartPackage.Literals.UML_REALTIME_TRANSITION__TRIGGER_EVENTS);
			childrenFeatures.add(RealtimestatechartPackage.Literals.UML_REALTIME_TRANSITION__RAISED_EVENTS);
			childrenFeatures.add(RealtimestatechartPackage.Literals.UML_REALTIME_TRANSITION__TIMEGUARD);
			childrenFeatures.add(RealtimestatechartPackage.Literals.UML_REALTIME_TRANSITION__ABSOLUTE_DEADLINES);
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
	 * This returns UMLRealtimeTransition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UMLRealtimeTransition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		UMLRealtimeTransition umlRealtimeTransition = (UMLRealtimeTransition)object;
		return getString("_UI_UMLRealtimeTransition_type") + " " + umlRealtimeTransition.getPriority();
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

		switch (notification.getFeatureID(UMLRealtimeTransition.class)) {
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_TRANSITION_MAPPING_VECTOR:
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__URGENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__SIDE_EFFECT:
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__RESETS:
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_FLAT_SWITCHING:
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__UML_REALTIME_FADING_FUNCTION:
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__TRIGGER_EVENTS:
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__RAISED_EVENTS:
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__TIMEGUARD:
			case RealtimestatechartPackage.UML_REALTIME_TRANSITION__ABSOLUTE_DEADLINES:
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
				(RealtimestatechartPackage.Literals.UML_REALTIME_TRANSITION__SIDE_EFFECT,
				 RealtimestatechartFactory.eINSTANCE.createUMLRealtimeAction()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.UML_REALTIME_TRANSITION__RESETS,
				 RealtimestatechartFactory.eINSTANCE.createUMLClock()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.UML_REALTIME_TRANSITION__UML_REALTIME_FLAT_SWITCHING,
				 RealtimestatechartFactory.eINSTANCE.createUMLRealtimeFlatSwitching()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.UML_REALTIME_TRANSITION__UML_REALTIME_FADING_FUNCTION,
				 RealtimestatechartFactory.eINSTANCE.createUMLRealtimeFadingFunction()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.UML_REALTIME_TRANSITION__TRIGGER_EVENTS,
				 RealtimestatechartFactory.eINSTANCE.createUMLRealtimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.UML_REALTIME_TRANSITION__RAISED_EVENTS,
				 RealtimestatechartFactory.eINSTANCE.createUMLRealtimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.UML_REALTIME_TRANSITION__TIMEGUARD,
				 RealtimestatechartFactory.eINSTANCE.createUMLTimeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.UML_REALTIME_TRANSITION__ABSOLUTE_DEADLINES,
				 RealtimestatechartFactory.eINSTANCE.createAbsoluteDeadline()));
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
			childFeature == RealtimestatechartPackage.Literals.UML_REALTIME_TRANSITION__TRIGGER_EVENTS ||
			childFeature == RealtimestatechartPackage.Literals.UML_REALTIME_TRANSITION__RAISED_EVENTS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
