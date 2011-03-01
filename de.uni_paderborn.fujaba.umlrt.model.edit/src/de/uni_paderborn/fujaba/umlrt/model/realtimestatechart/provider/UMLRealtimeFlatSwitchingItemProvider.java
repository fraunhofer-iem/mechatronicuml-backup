/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.provider;


import de.uni_paderborn.fujaba.umlrt.model.behavior.provider.UmlrtEditPlugin;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFlatSwitching;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeFlatSwitching} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UMLRealtimeFlatSwitchingItemProvider
	extends ItemProviderAdapter
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
	public UMLRealtimeFlatSwitchingItemProvider(AdapterFactory adapterFactory) {
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

			addUMLRealtimeTransitionsPropertyDescriptor(object);
			addMinDurationPropertyDescriptor(object);
			addMaxDurationPropertyDescriptor(object);
			addSpline1PropertyDescriptor(object);
			addSpline2PropertyDescriptor(object);
			addPolynomDegreePropertyDescriptor(object);
			addPortInstToPortInstMapEntryPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the UML Realtime Transitions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUMLRealtimeTransitionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UMLRealtimeFlatSwitching_uMLRealtimeTransitions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeFlatSwitching_uMLRealtimeTransitions_feature", "_UI_UMLRealtimeFlatSwitching_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_FLAT_SWITCHING__UML_REALTIME_TRANSITIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UMLRealtimeFlatSwitching_minDuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeFlatSwitching_minDuration_feature", "_UI_UMLRealtimeFlatSwitching_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_FLAT_SWITCHING__MIN_DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UMLRealtimeFlatSwitching_maxDuration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeFlatSwitching_maxDuration_feature", "_UI_UMLRealtimeFlatSwitching_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_FLAT_SWITCHING__MAX_DURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Spline1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpline1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UMLRealtimeFlatSwitching_spline1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeFlatSwitching_spline1_feature", "_UI_UMLRealtimeFlatSwitching_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_FLAT_SWITCHING__SPLINE1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Spline2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpline2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UMLRealtimeFlatSwitching_spline2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeFlatSwitching_spline2_feature", "_UI_UMLRealtimeFlatSwitching_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_FLAT_SWITCHING__SPLINE2,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Polynom Degree feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPolynomDegreePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UMLRealtimeFlatSwitching_polynomDegree_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeFlatSwitching_polynomDegree_feature", "_UI_UMLRealtimeFlatSwitching_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_FLAT_SWITCHING__POLYNOM_DEGREE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Port Inst To Port Inst Map Entry feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortInstToPortInstMapEntryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UMLRealtimeFlatSwitching_portInstToPortInstMapEntry_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeFlatSwitching_portInstToPortInstMapEntry_feature", "_UI_UMLRealtimeFlatSwitching_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_FLAT_SWITCHING__PORT_INST_TO_PORT_INST_MAP_ENTRY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns UMLRealtimeFlatSwitching.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UMLRealtimeFlatSwitching"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		UMLRealtimeFlatSwitching umlRealtimeFlatSwitching = (UMLRealtimeFlatSwitching)object;
		return getString("_UI_UMLRealtimeFlatSwitching_type") + " " + umlRealtimeFlatSwitching.getMinDuration();
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

		switch (notification.getFeatureID(UMLRealtimeFlatSwitching.class)) {
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__MIN_DURATION:
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__MAX_DURATION:
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__SPLINE1:
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__SPLINE2:
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__POLYNOM_DEGREE:
			case RealtimestatechartPackage.UML_REALTIME_FLAT_SWITCHING__PORT_INST_TO_PORT_INST_MAP_ENTRY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return UmlrtEditPlugin.INSTANCE;
	}

}
