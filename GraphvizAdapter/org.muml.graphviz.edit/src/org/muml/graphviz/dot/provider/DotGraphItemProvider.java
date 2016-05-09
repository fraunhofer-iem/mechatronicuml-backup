/**
 */
package org.muml.graphviz.dot.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.graphviz.common.provider.GraphItemProvider;
import org.muml.graphviz.dot.DotFactory;
import org.muml.graphviz.dot.DotGraph;
import org.muml.graphviz.dot.DotPackage;
import org.muml.graphviz.provider.GraphvizEditPlugin;

/**
 * This is the item provider adapter for a {@link org.muml.graphviz.dot.DotGraph} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DotGraphItemProvider
	extends GraphItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DotGraphItemProvider(AdapterFactory adapterFactory) {
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

			addDirectedGraphPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addClusterPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Directed Graph feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectedGraphPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DotGraph_directedGraph_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DotGraph_directedGraph_feature", "_UI_DotGraph_type"),
				 DotPackage.Literals.DOT_GRAPH__DIRECTED_GRAPH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DotGraph_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DotGraph_id_feature", "_UI_DotGraph_type"),
				 DotPackage.Literals.DOT_GRAPH__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cluster feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClusterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DotGraph_cluster_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DotGraph_cluster_feature", "_UI_DotGraph_type"),
				 DotPackage.Literals.DOT_GRAPH__CLUSTER,
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
			childrenFeatures.add(DotPackage.Literals.DOT_GRAPH__SUBGRAPHS);
			childrenFeatures.add(DotPackage.Literals.DOT_GRAPH__GRAPH_SETTINGS);
			childrenFeatures.add(DotPackage.Literals.DOT_GRAPH__NODE_SETTINGS);
			childrenFeatures.add(DotPackage.Literals.DOT_GRAPH__EDGE_SETTINGS);
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
	 * This returns DotGraph.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DotGraph"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DotGraph)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_DotGraph_type") :
			getString("_UI_DotGraph_type") + " " + label;
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

		switch (notification.getFeatureID(DotGraph.class)) {
			case DotPackage.DOT_GRAPH__DIRECTED_GRAPH:
			case DotPackage.DOT_GRAPH__ID:
			case DotPackage.DOT_GRAPH__CLUSTER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DotPackage.DOT_GRAPH__SUBGRAPHS:
			case DotPackage.DOT_GRAPH__GRAPH_SETTINGS:
			case DotPackage.DOT_GRAPH__NODE_SETTINGS:
			case DotPackage.DOT_GRAPH__EDGE_SETTINGS:
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
				(DotPackage.Literals.DOT_GRAPH__SUBGRAPHS,
				 DotFactory.eINSTANCE.createDotGraph()));

		newChildDescriptors.add
			(createChildParameter
				(DotPackage.Literals.DOT_GRAPH__GRAPH_SETTINGS,
				 DotFactory.eINSTANCE.createSetting()));

		newChildDescriptors.add
			(createChildParameter
				(DotPackage.Literals.DOT_GRAPH__NODE_SETTINGS,
				 DotFactory.eINSTANCE.createSetting()));

		newChildDescriptors.add
			(createChildParameter
				(DotPackage.Literals.DOT_GRAPH__EDGE_SETTINGS,
				 DotFactory.eINSTANCE.createSetting()));
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
			childFeature == DotPackage.Literals.DOT_GRAPH__GRAPH_SETTINGS ||
			childFeature == DotPackage.Literals.DOT_GRAPH__NODE_SETTINGS ||
			childFeature == DotPackage.Literals.DOT_GRAPH__EDGE_SETTINGS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GraphvizEditPlugin.INSTANCE;
	}

}
