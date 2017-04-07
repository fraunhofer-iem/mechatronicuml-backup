/**
 */
package org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage;

import org.muml.core.reachanalysis.reachabilitygraph.provider.ReachabilityGraphItemProvider;

import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.RtscFactory;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.RtscPackage;

/**
 * This is the item provider adapter for a {@link org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.ZoneGraph} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ZoneGraphItemProvider extends ReachabilityGraphItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoneGraphItemProvider(AdapterFactory adapterFactory) {
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

			addClocksPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_ZoneGraph_clocks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ZoneGraph_clocks_feature", "_UI_ZoneGraph_type"),
				 RtscPackage.Literals.ZONE_GRAPH__CLOCKS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns ZoneGraph.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ZoneGraph"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ZoneGraph_type");
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

		newChildDescriptors.add
			(createChildParameter
				(ReachabilityGraphPackage.Literals.REACHABILITY_GRAPH__STATES,
				 RtscFactory.eINSTANCE.createZoneGraphState()));

		newChildDescriptors.add
			(createChildParameter
				(ReachabilityGraphPackage.Literals.REACHABILITY_GRAPH__TRANSITIONS,
				 RtscFactory.eINSTANCE.createZoneGraphTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ReachabilityGraphPackage.Literals.REACHABILITY_GRAPH__TRANSITIONS,
				 RtscFactory.eINSTANCE.createDelayTransition()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RTSCReachabilityGraphEditPlugin.INSTANCE;
	}

}
