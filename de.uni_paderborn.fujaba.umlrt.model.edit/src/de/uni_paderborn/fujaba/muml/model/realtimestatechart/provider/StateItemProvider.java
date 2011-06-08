/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart.provider;


import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.State;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

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

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.State} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StateItemProvider
	extends VertexItemProvider
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

			addCommittedPropertyDescriptor(object);
			addInitialPropertyDescriptor(object);
			addFinalPropertyDescriptor(object);
			addExitPointsPropertyDescriptor(object);
			addEntryPointsPropertyDescriptor(object);
			addUrgentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Committed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommittedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_State_committed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_State_committed_feature", "_UI_State_type"),
				 RealtimestatechartPackage.Literals.STATE__COMMITTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 null,
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
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exit Points feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExitPointsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_State_exitPoints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_State_exitPoints_feature", "_UI_State_type"),
				 RealtimestatechartPackage.Literals.STATE__EXIT_POINTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Entry Points feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEntryPointsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_State_entryPoints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_State_entryPoints_feature", "_UI_State_type"),
				 RealtimestatechartPackage.Literals.STATE__ENTRY_POINTS,
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
			childrenFeatures.add(RealtimestatechartPackage.Literals.STATE__REGIONS);
			childrenFeatures.add(RealtimestatechartPackage.Literals.STATE__DO_EVENT);
			childrenFeatures.add(RealtimestatechartPackage.Literals.STATE__EXIT_EVENT);
			childrenFeatures.add(RealtimestatechartPackage.Literals.STATE__ENTRY_EVENT);
			childrenFeatures.add(RealtimestatechartPackage.Literals.STATE__INVARIANTS);
			childrenFeatures.add(RealtimestatechartPackage.Literals.STATE__CHANNELS);
			childrenFeatures.add(RealtimestatechartPackage.Literals.STATE__EVENTS);
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
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((State)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_State_type") :
			getString("_UI_State_type") + " " + label;
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
			case RealtimestatechartPackage.STATE__COMMITTED:
			case RealtimestatechartPackage.STATE__INITIAL:
			case RealtimestatechartPackage.STATE__FINAL:
			case RealtimestatechartPackage.STATE__URGENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RealtimestatechartPackage.STATE__REGIONS:
			case RealtimestatechartPackage.STATE__DO_EVENT:
			case RealtimestatechartPackage.STATE__EXIT_EVENT:
			case RealtimestatechartPackage.STATE__ENTRY_EVENT:
			case RealtimestatechartPackage.STATE__INVARIANTS:
			case RealtimestatechartPackage.STATE__CHANNELS:
			case RealtimestatechartPackage.STATE__EVENTS:
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
				(RealtimestatechartPackage.Literals.STATE__REGIONS,
				 RealtimestatechartFactory.eINSTANCE.createRegion()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.STATE__DO_EVENT,
				 RealtimestatechartFactory.eINSTANCE.createDoEvent()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.STATE__EXIT_EVENT,
				 RealtimestatechartFactory.eINSTANCE.createEntryOrExitEvent()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.STATE__ENTRY_EVENT,
				 RealtimestatechartFactory.eINSTANCE.createEntryOrExitEvent()));

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
				(RealtimestatechartPackage.Literals.STATE__EVENTS,
				 RealtimestatechartFactory.eINSTANCE.createActionExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.STATE__EVENTS,
				 RealtimestatechartFactory.eINSTANCE.createDoEvent()));
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
			childFeature == RealtimestatechartPackage.Literals.STATE__DO_EVENT ||
			childFeature == RealtimestatechartPackage.Literals.STATE__EVENTS ||
			childFeature == RealtimestatechartPackage.Literals.STATE__EXIT_EVENT ||
			childFeature == RealtimestatechartPackage.Literals.STATE__ENTRY_EVENT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
