/**
 */
package org.muml.core.reachanalysis.reachabilitygraph.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.muml.core.provider.ExtendableElementItemProvider;

import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphPackage;
import org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState;

/**
 * This is the item provider adapter for a {@link org.muml.core.reachanalysis.reachabilitygraph.ReachabilityGraphState} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReachabilityGraphStateItemProvider extends ExtendableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReachabilityGraphStateItemProvider(AdapterFactory adapterFactory) {
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

			addHashPropertyDescriptor(object);
			addIncomingTransitionsPropertyDescriptor(object);
			addOutgoingTransitionsPropertyDescriptor(object);
			addPathDepthPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Hash feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHashPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ReachabilityGraphState_hash_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReachabilityGraphState_hash_feature", "_UI_ReachabilityGraphState_type"),
				 ReachabilityGraphPackage.Literals.REACHABILITY_GRAPH_STATE__HASH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Incoming Transitions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingTransitionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ReachabilityGraphState_incomingTransitions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReachabilityGraphState_incomingTransitions_feature", "_UI_ReachabilityGraphState_type"),
				 ReachabilityGraphPackage.Literals.REACHABILITY_GRAPH_STATE__INCOMING_TRANSITIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outgoing Transitions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutgoingTransitionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ReachabilityGraphState_outgoingTransitions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReachabilityGraphState_outgoingTransitions_feature", "_UI_ReachabilityGraphState_type"),
				 ReachabilityGraphPackage.Literals.REACHABILITY_GRAPH_STATE__OUTGOING_TRANSITIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Path Depth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPathDepthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ReachabilityGraphState_pathDepth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReachabilityGraphState_pathDepth_feature", "_UI_ReachabilityGraphState_type"),
				 ReachabilityGraphPackage.Literals.REACHABILITY_GRAPH_STATE__PATH_DEPTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ReachabilityGraphState reachabilityGraphState = (ReachabilityGraphState)object;
		return getString("_UI_ReachabilityGraphState_type") + " " + reachabilityGraphState.getHash();
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

		switch (notification.getFeatureID(ReachabilityGraphState.class)) {
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__HASH:
			case ReachabilityGraphPackage.REACHABILITY_GRAPH_STATE__PATH_DEPTH:
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
		return ReachabilityAnalysisCoreEditPlugin.INSTANCE;
	}

}
