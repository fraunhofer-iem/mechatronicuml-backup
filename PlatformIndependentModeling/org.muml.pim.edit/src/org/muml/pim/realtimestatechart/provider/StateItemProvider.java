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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.pim.ItemProviderUtilities;
import org.muml.pim.realtimestatechart.RealtimestatechartFactory;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.State;
import org.muml.pim.realtimestatechart.descriptor.PrioritizedElementContainmentItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link org.muml.pim.realtimestatechart.State} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StateItemProvider
	extends VertexItemProvider {
	

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateItemProvider(AdapterFactory adapterFactory) {
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

			addEmbeddedRegionsPropertyDescriptor(object);
			addDoEventPropertyDescriptor(object);
			addExitEventPropertyDescriptor(object);
			addEntryEventPropertyDescriptor(object);
			addInvariantsPropertyDescriptor(object);
			addInitialPropertyDescriptor(object);
			addFinalPropertyDescriptor(object);
			addUrgentPropertyDescriptor(object);
			addChannelsPropertyDescriptor(object);
			addConnectionPointsPropertyDescriptor(object);
			addSimplePropertyDescriptor(object);
			addParentStatechartPropertyDescriptor(object);
			addAllAvailableChannelsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Embedded Regions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addEmbeddedRegionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(
			new PrioritizedElementContainmentItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_State_embeddedRegions_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_State_embeddedRegions_feature", "_UI_State_type"),
				RealtimestatechartPackage.Literals.STATE__EMBEDDED_REGIONS,
				true,
				false,
				false,
				null,
				null,
				null));
	}

	/**
	 * This adds a property descriptor for the Do Event feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDoEventPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_State_doEvent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_State_doEvent_feature", "_UI_State_type"),
				 RealtimestatechartPackage.Literals.STATE__DO_EVENT,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exit Event feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExitEventPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_State_exitEvent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_State_exitEvent_feature", "_UI_State_type"),
				 RealtimestatechartPackage.Literals.STATE__EXIT_EVENT,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Entry Event feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEntryEventPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_State_entryEvent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_State_entryEvent_feature", "_UI_State_type"),
				 RealtimestatechartPackage.Literals.STATE__ENTRY_EVENT,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Invariants feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInvariantsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_State_invariants_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_State_invariants_feature", "_UI_State_type"),
				 RealtimestatechartPackage.Literals.STATE__INVARIANTS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initial feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_State_initial_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_State_initial_feature", "_UI_State_type"),
				 RealtimestatechartPackage.Literals.STATE__INITIAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_GeneralPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Final feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_State_final_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_State_final_feature", "_UI_State_type"),
				 RealtimestatechartPackage.Literals.STATE__FINAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_GeneralPropertyCategory"),
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
				 getString("_UI_State_urgent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_State_urgent_feature", "_UI_State_type"),
				 RealtimestatechartPackage.Literals.STATE__URGENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Channels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChannelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_State_channels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_State_channels_feature", "_UI_State_type"),
				 RealtimestatechartPackage.Literals.STATE__CHANNELS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connection Points feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectionPointsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_State_connectionPoints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_State_connectionPoints_feature", "_UI_State_type"),
				 RealtimestatechartPackage.Literals.STATE__CONNECTION_POINTS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Simple feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSimplePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_State_simple_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_State_simple_feature", "_UI_State_type"),
				 RealtimestatechartPackage.Literals.STATE__SIMPLE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Statechart feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentStatechartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_State_parentStatechart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_State_parentStatechart_feature", "_UI_State_type"),
				 RealtimestatechartPackage.Literals.STATE__PARENT_STATECHART,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the All Available Channels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllAvailableChannelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_State_allAvailableChannels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_State_allAvailableChannels_feature", "_UI_State_type"),
				 RealtimestatechartPackage.Literals.STATE__ALL_AVAILABLE_CHANNELS,
				 false,
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
			childrenFeatures.add(RealtimestatechartPackage.Literals.STATE__EMBEDDED_REGIONS);
			childrenFeatures.add(RealtimestatechartPackage.Literals.STATE__DO_EVENT);
			childrenFeatures.add(RealtimestatechartPackage.Literals.STATE__EXIT_EVENT);
			childrenFeatures.add(RealtimestatechartPackage.Literals.STATE__ENTRY_EVENT);
			childrenFeatures.add(RealtimestatechartPackage.Literals.STATE__INVARIANTS);
			childrenFeatures.add(RealtimestatechartPackage.Literals.STATE__CHANNELS);
			childrenFeatures.add(RealtimestatechartPackage.Literals.STATE__CONNECTION_POINTS);
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
	 * This returns State.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/State"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((State)object).getName();
		String qualifiedName = " (" + ItemProviderUtilities.getFullyQualifiedName(object) + ")";
		return label == null || label.length() == 0 ?
			getString("_UI_State_type") + qualifiedName :
			getString("_UI_State_type") + " " + label + qualifiedName;
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

		switch (notification.getFeatureID(State.class)) {
			case RealtimestatechartPackage.STATE__INITIAL:
			case RealtimestatechartPackage.STATE__FINAL:
			case RealtimestatechartPackage.STATE__URGENT:
			case RealtimestatechartPackage.STATE__EVENTS:
			case RealtimestatechartPackage.STATE__SIMPLE:
			case RealtimestatechartPackage.STATE__ALL_AVAILABLE_CHANNELS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RealtimestatechartPackage.STATE__EMBEDDED_REGIONS:
			case RealtimestatechartPackage.STATE__DO_EVENT:
			case RealtimestatechartPackage.STATE__EXIT_EVENT:
			case RealtimestatechartPackage.STATE__ENTRY_EVENT:
			case RealtimestatechartPackage.STATE__INVARIANTS:
			case RealtimestatechartPackage.STATE__CHANNELS:
			case RealtimestatechartPackage.STATE__CONNECTION_POINTS:
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
				(RealtimestatechartPackage.Literals.STATE__EMBEDDED_REGIONS,
				 RealtimestatechartFactory.eINSTANCE.createRegion()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.STATE__DO_EVENT,
				 RealtimestatechartFactory.eINSTANCE.createDoEvent()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.STATE__EXIT_EVENT,
				 RealtimestatechartFactory.eINSTANCE.createExitEvent()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.STATE__ENTRY_EVENT,
				 RealtimestatechartFactory.eINSTANCE.createEntryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.STATE__INVARIANTS,
				 RealtimestatechartFactory.eINSTANCE.createClockConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.STATE__CHANNELS,
				 RealtimestatechartFactory.eINSTANCE.createSynchronizationChannel()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.STATE__CONNECTION_POINTS,
				 RealtimestatechartFactory.eINSTANCE.createEntryPoint()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.STATE__CONNECTION_POINTS,
				 RealtimestatechartFactory.eINSTANCE.createExitPoint()));
	}

}
