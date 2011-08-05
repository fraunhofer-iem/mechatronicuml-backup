/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance.provider;


import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.model.instance.FujabaRealtimeStatechartInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FujabaRealtimeStatechartInstanceItemProvider
	extends BehaviorInstanceItemProvider
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
	public FujabaRealtimeStatechartInstanceItemProvider(AdapterFactory adapterFactory) {
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

			addStatechartPropertyDescriptor(object);
			addEmbeddedSubStatechartsPropertyDescriptor(object);
			addReferencedSubStatechartsPropertyDescriptor(object);
			addAllSubStatechartsPropertyDescriptor(object);
			addParentStatechartPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_FujabaRealtimeStatechartInstance_statechart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FujabaRealtimeStatechartInstance_statechart_feature", "_UI_FujabaRealtimeStatechartInstance_type"),
				 InstancePackage.Literals.FUJABA_REALTIME_STATECHART_INSTANCE__STATECHART,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Embedded Sub Statecharts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmbeddedSubStatechartsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FujabaRealtimeStatechartInstance_embeddedSubStatecharts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FujabaRealtimeStatechartInstance_embeddedSubStatecharts_feature", "_UI_FujabaRealtimeStatechartInstance_type"),
				 InstancePackage.Literals.FUJABA_REALTIME_STATECHART_INSTANCE__EMBEDDED_SUB_STATECHARTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Referenced Sub Statecharts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferencedSubStatechartsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FujabaRealtimeStatechartInstance_referencedSubStatecharts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FujabaRealtimeStatechartInstance_referencedSubStatecharts_feature", "_UI_FujabaRealtimeStatechartInstance_type"),
				 InstancePackage.Literals.FUJABA_REALTIME_STATECHART_INSTANCE__REFERENCED_SUB_STATECHARTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the All Sub Statecharts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllSubStatechartsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FujabaRealtimeStatechartInstance_allSubStatecharts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FujabaRealtimeStatechartInstance_allSubStatecharts_feature", "_UI_FujabaRealtimeStatechartInstance_type"),
				 InstancePackage.Literals.FUJABA_REALTIME_STATECHART_INSTANCE__ALL_SUB_STATECHARTS,
				 true,
				 false,
				 true,
				 null,
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
				 getString("_UI_FujabaRealtimeStatechartInstance_parentStatechart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FujabaRealtimeStatechartInstance_parentStatechart_feature", "_UI_FujabaRealtimeStatechartInstance_type"),
				 InstancePackage.Literals.FUJABA_REALTIME_STATECHART_INSTANCE__PARENT_STATECHART,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns FujabaRealtimeStatechartInstance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FujabaRealtimeStatechartInstance"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_FujabaRealtimeStatechartInstance_type");
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

}
