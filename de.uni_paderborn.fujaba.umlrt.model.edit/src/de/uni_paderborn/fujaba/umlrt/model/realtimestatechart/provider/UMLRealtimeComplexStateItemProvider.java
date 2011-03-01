/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.provider;


import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.reconf.ReconfFactory;

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
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UMLRealtimeComplexStateItemProvider
	extends UMLRealtimeStateItemProvider
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
	public UMLRealtimeComplexStateItemProvider(AdapterFactory adapterFactory) {
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

			addUMLRealtimeStatechartsPropertyDescriptor(object);
			addInterfacedStatesPropertyDescriptor(object);
			addInterfaceStatePropertyDescriptor(object);
			addCommittedPropertyDescriptor(object);
			addChannelsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the UML Realtime Statecharts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUMLRealtimeStatechartsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UMLRealtimeComplexState_uMLRealtimeStatecharts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeComplexState_uMLRealtimeStatecharts_feature", "_UI_UMLRealtimeComplexState_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_COMPLEX_STATE__UML_REALTIME_STATECHARTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interfaced States feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfacedStatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UMLRealtimeComplexState_interfacedStates_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeComplexState_interfacedStates_feature", "_UI_UMLRealtimeComplexState_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_COMPLEX_STATE__INTERFACED_STATES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interface State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfaceStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UMLRealtimeComplexState_interfaceState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeComplexState_interfaceState_feature", "_UI_UMLRealtimeComplexState_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_COMPLEX_STATE__INTERFACE_STATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
				 getString("_UI_UMLRealtimeComplexState_committed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeComplexState_committed_feature", "_UI_UMLRealtimeComplexState_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_COMPLEX_STATE__COMMITTED,
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
				 getString("_UI_UMLRealtimeComplexState_channels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeComplexState_channels_feature", "_UI_UMLRealtimeComplexState_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_COMPLEX_STATE__CHANNELS,
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
			childrenFeatures.add(RealtimestatechartPackage.Literals.UML_REALTIME_COMPLEX_STATE__DO_ACTION);
			childrenFeatures.add(RealtimestatechartPackage.Literals.UML_REALTIME_COMPLEX_STATE__EXIT_ACTION);
			childrenFeatures.add(RealtimestatechartPackage.Literals.UML_REALTIME_COMPLEX_STATE__ENTRY_ACTION);
			childrenFeatures.add(RealtimestatechartPackage.Literals.UML_REALTIME_COMPLEX_STATE__RECONF_DIAGRAM);
			childrenFeatures.add(RealtimestatechartPackage.Literals.UML_REALTIME_COMPLEX_STATE__INVARIANTS);
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
	 * This returns UMLRealtimeComplexState.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UMLRealtimeComplexState"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UMLRealtimeComplexState)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UMLRealtimeComplexState_type") :
			getString("_UI_UMLRealtimeComplexState_type") + " " + label;
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

		switch (notification.getFeatureID(UMLRealtimeComplexState.class)) {
			case RealtimestatechartPackage.UML_REALTIME_COMPLEX_STATE__COMMITTED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RealtimestatechartPackage.UML_REALTIME_COMPLEX_STATE__DO_ACTION:
			case RealtimestatechartPackage.UML_REALTIME_COMPLEX_STATE__EXIT_ACTION:
			case RealtimestatechartPackage.UML_REALTIME_COMPLEX_STATE__ENTRY_ACTION:
			case RealtimestatechartPackage.UML_REALTIME_COMPLEX_STATE__RECONF_DIAGRAM:
			case RealtimestatechartPackage.UML_REALTIME_COMPLEX_STATE__INVARIANTS:
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
				(RealtimestatechartPackage.Literals.UML_REALTIME_COMPLEX_STATE__DO_ACTION,
				 RealtimestatechartFactory.eINSTANCE.createDoEvent()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.UML_REALTIME_COMPLEX_STATE__EXIT_ACTION,
				 RealtimestatechartFactory.eINSTANCE.createEntryOrExitEvent()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.UML_REALTIME_COMPLEX_STATE__ENTRY_ACTION,
				 RealtimestatechartFactory.eINSTANCE.createEntryOrExitEvent()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.UML_REALTIME_COMPLEX_STATE__RECONF_DIAGRAM,
				 ReconfFactory.eINSTANCE.createReconfDiagram()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.UML_REALTIME_COMPLEX_STATE__INVARIANTS,
				 RealtimestatechartFactory.eINSTANCE.createUMLInvariantAtom()));
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
			childFeature == RealtimestatechartPackage.Literals.UML_REALTIME_COMPLEX_STATE__EXIT_ACTION ||
			childFeature == RealtimestatechartPackage.Literals.UML_REALTIME_COMPLEX_STATE__ENTRY_ACTION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
