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
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.uni_paderborn.fujaba.muml.model.component.provider.MumlEditPlugin;
import de.uni_paderborn.fujaba.muml.model.core.provider.AbstractRealtimeStatechartItemProvider;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.FujabaRealtimeStatechart} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FujabaRealtimeStatechartItemProvider
	extends AbstractRealtimeStatechartItemProvider
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
	public FujabaRealtimeStatechartItemProvider(AdapterFactory adapterFactory) {
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

			addEmbeddingRegionPropertyDescriptor(object);
			addAvailableClocksPropertyDescriptor(object);
			addHistoryPropertyDescriptor(object);
			addEventQueueSizePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Embedding Region feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmbeddingRegionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FujabaRealtimeStatechart_embeddingRegion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FujabaRealtimeStatechart_embeddingRegion_feature", "_UI_FujabaRealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.FUJABA_REALTIME_STATECHART__EMBEDDING_REGION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Available Clocks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAvailableClocksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FujabaRealtimeStatechart_availableClocks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FujabaRealtimeStatechart_availableClocks_feature", "_UI_FujabaRealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.FUJABA_REALTIME_STATECHART__AVAILABLE_CLOCKS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_FujabaRealtimeStatechart_history_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FujabaRealtimeStatechart_history_feature", "_UI_FujabaRealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.FUJABA_REALTIME_STATECHART__HISTORY,
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
				 getString("_UI_FujabaRealtimeStatechart_eventQueueSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FujabaRealtimeStatechart_eventQueueSize_feature", "_UI_FujabaRealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.FUJABA_REALTIME_STATECHART__EVENT_QUEUE_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(RealtimestatechartPackage.Literals.FUJABA_REALTIME_STATECHART__TRANSITIONS);
			childrenFeatures.add(RealtimestatechartPackage.Literals.FUJABA_REALTIME_STATECHART__VERTICES);
			childrenFeatures.add(RealtimestatechartPackage.Literals.FUJABA_REALTIME_STATECHART__ECLASS);
			childrenFeatures.add(RealtimestatechartPackage.Literals.FUJABA_REALTIME_STATECHART__CLOCKS);
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
	 * This returns FujabaRealtimeStatechart.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FujabaRealtimeStatechart"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FujabaRealtimeStatechart)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FujabaRealtimeStatechart_type") :
			getString("_UI_FujabaRealtimeStatechart_type") + " " + label;
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

		switch (notification.getFeatureID(FujabaRealtimeStatechart.class)) {
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__AVAILABLE_CLOCKS:
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__HISTORY:
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__EVENT_QUEUE_SIZE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__TRANSITIONS:
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__VERTICES:
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__ECLASS:
			case RealtimestatechartPackage.FUJABA_REALTIME_STATECHART__CLOCKS:
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
				(RealtimestatechartPackage.Literals.FUJABA_REALTIME_STATECHART__TRANSITIONS,
				 RealtimestatechartFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.FUJABA_REALTIME_STATECHART__VERTICES,
				 RealtimestatechartFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.FUJABA_REALTIME_STATECHART__VERTICES,
				 RealtimestatechartFactory.eINSTANCE.createEntryOrExitPoint()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.FUJABA_REALTIME_STATECHART__VERTICES,
				 RealtimestatechartFactory.eINSTANCE.createStateEntryOrExitPoint()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.FUJABA_REALTIME_STATECHART__ECLASS,
				 EcoreFactory.eINSTANCE.createEClass()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.FUJABA_REALTIME_STATECHART__CLOCKS,
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
