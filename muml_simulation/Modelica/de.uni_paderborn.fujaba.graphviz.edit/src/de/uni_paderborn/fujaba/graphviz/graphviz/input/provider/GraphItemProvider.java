/**
 */
package de.uni_paderborn.fujaba.graphviz.graphviz.input.provider;


import de.uni_paderborn.fujaba.graphviz.graphviz.input.Graph;
import de.uni_paderborn.fujaba.graphviz.graphviz.input.InputFactory;
import de.uni_paderborn.fujaba.graphviz.graphviz.input.InputPackage;
import java.util.Collection;
import java.util.List;
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
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.graphviz.graphviz.input.Graph} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphItemProvider
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
	public GraphItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_Graph_directedGraph_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Graph_directedGraph_feature", "_UI_Graph_type"),
				 InputPackage.Literals.GRAPH__DIRECTED_GRAPH,
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
				 getString("_UI_Graph_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Graph_id_feature", "_UI_Graph_type"),
				 InputPackage.Literals.GRAPH__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(InputPackage.Literals.GRAPH__NODES);
			childrenFeatures.add(InputPackage.Literals.GRAPH__EDGES);
			childrenFeatures.add(InputPackage.Literals.GRAPH__SUBGRAPHS);
			childrenFeatures.add(InputPackage.Literals.GRAPH__GRAPH_SETTINGS);
			childrenFeatures.add(InputPackage.Literals.GRAPH__NODE_SETTINGS);
			childrenFeatures.add(InputPackage.Literals.GRAPH__EDGE_SETTINGS);
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
	 * This returns Graph.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Graph"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Graph)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_Graph_type") :
			getString("_UI_Graph_type") + " " + label;
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

		switch (notification.getFeatureID(Graph.class)) {
			case InputPackage.GRAPH__DIRECTED_GRAPH:
			case InputPackage.GRAPH__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case InputPackage.GRAPH__NODES:
			case InputPackage.GRAPH__EDGES:
			case InputPackage.GRAPH__SUBGRAPHS:
			case InputPackage.GRAPH__GRAPH_SETTINGS:
			case InputPackage.GRAPH__NODE_SETTINGS:
			case InputPackage.GRAPH__EDGE_SETTINGS:
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
				(InputPackage.Literals.GRAPH__NODES,
				 InputFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(InputPackage.Literals.GRAPH__EDGES,
				 InputFactory.eINSTANCE.createEdge()));

		newChildDescriptors.add
			(createChildParameter
				(InputPackage.Literals.GRAPH__SUBGRAPHS,
				 InputFactory.eINSTANCE.createGraph()));

		newChildDescriptors.add
			(createChildParameter
				(InputPackage.Literals.GRAPH__GRAPH_SETTINGS,
				 InputFactory.eINSTANCE.createSetting()));

		newChildDescriptors.add
			(createChildParameter
				(InputPackage.Literals.GRAPH__NODE_SETTINGS,
				 InputFactory.eINSTANCE.createSetting()));

		newChildDescriptors.add
			(createChildParameter
				(InputPackage.Literals.GRAPH__EDGE_SETTINGS,
				 InputFactory.eINSTANCE.createSetting()));
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
			childFeature == InputPackage.Literals.GRAPH__GRAPH_SETTINGS ||
			childFeature == InputPackage.Literals.GRAPH__NODE_SETTINGS ||
			childFeature == InputPackage.Literals.GRAPH__EDGE_SETTINGS;

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
