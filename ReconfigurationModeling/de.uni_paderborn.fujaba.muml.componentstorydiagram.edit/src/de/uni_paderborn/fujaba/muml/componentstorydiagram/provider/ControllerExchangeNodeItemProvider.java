/**
 */
package de.uni_paderborn.fujaba.muml.componentstorydiagram.provider;


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
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.storydriven.storydiagrams.activities.provider.ActivityNodeItemProvider;

import de.uni_paderborn.fujaba.common.descriptor.DefaultChainedPropertyDescriptor;
import de.uni_paderborn.fujaba.common.descriptor.IChainedPropertyDescriptor;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.ComponentstorydiagramPackage;
import de.uni_paderborn.fujaba.muml.componentstorydiagram.ControllerExchangeNode;
import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternFactory;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.realtimestatechart.descriptor.EnumerationPropertyDescriptor;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.componentstorydiagram.ControllerExchangeNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ControllerExchangeNodeItemProvider
	extends ActivityNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerExchangeNodeItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}
	
	/**
	 * This adds a property descriptor for the Deadline feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addDeadlinePropertyDescriptor(Object object) {
		IChainedPropertyDescriptor rootPropertyDescriptor = new DefaultChainedPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControllerExchangeNode_deadline_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControllerExchangeNode_deadline_feature", "_UI_ControllerExchangeNode_type"),
				 ComponentstorydiagramPackage.Literals.CONTROLLER_EXCHANGE_NODE__DEADLINE,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null);
		
		IChainedPropertyDescriptor lowerBoundPropertyDescriptor = new DefaultChainedPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Deadline_lowerBound_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Deadline_lowerBound_feature",
						"_UI_Deadline_type"),
				RealtimestatechartPackage.Literals.DEADLINE__LOWER_BOUND,
				true, false, true, null,
				getString("_UI_RelativeDeadlinePropertyCategory"),
				null, rootPropertyDescriptor);
		
		itemPropertyDescriptors.add(new DefaultChainedPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeValue_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeValue_value_feature", "_UI_TimeValue_type"),
				 ValuetypePackage.Literals.TIME_VALUE__VALUE,
				 true,
				 false,
				 false,
				 null,
				 "Relative Deadline - Lower Bound",
				 null,
				 lowerBoundPropertyDescriptor));
		
		itemPropertyDescriptors.add
			(new EnumerationPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeValue_unit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeValue_unit_feature", "_UI_TimeValue_type"),
				 de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.Literals.TIME_VALUE__UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 "Relative Deadline - Lower Bound",
				 null,
				 lowerBoundPropertyDescriptor));
		
		IChainedPropertyDescriptor upperBoundPropertyDescriptor = new DefaultChainedPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Deadline_upperBound_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_Deadline_upperBound_feature",
								"_UI_Deadline_type"),
						RealtimestatechartPackage.Literals.DEADLINE__UPPER_BOUND,
						true, false, true, null,
						getString("_UI_RelativeDeadlinePropertyCategory"),
						null, rootPropertyDescriptor);
		
		itemPropertyDescriptors.add(new DefaultChainedPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeValue_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeValue_value_feature", "_UI_TimeValue_type"),
				 ValuetypePackage.Literals.TIME_VALUE__VALUE,
				 true,
				 false,
				 false,
				 null,
				 "Relative Deadline - Upper Bound",
				 null,
				 upperBoundPropertyDescriptor));
		
		itemPropertyDescriptors.add
			(new EnumerationPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeValue_unit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeValue_unit_feature", "_UI_TimeValue_type"),
				 de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage.Literals.TIME_VALUE__UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 "Relative Deadline - Upper Bound",
				 null,
				 upperBoundPropertyDescriptor));
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
			childrenFeatures.add(ComponentstorydiagramPackage.Literals.CONTROLLER_EXCHANGE_NODE__DEADLINE);
			childrenFeatures.add(ComponentstorydiagramPackage.Literals.CONTROLLER_EXCHANGE_NODE__COMPONENT_STORY_PATTERN);
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
	 * This returns ControllerExchangeNode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ControllerExchangeNode"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ControllerExchangeNode)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ControllerExchangeNode_type") :
			getString("_UI_ControllerExchangeNode_type") + " " + label;
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

		switch (notification.getFeatureID(ControllerExchangeNode.class)) {
			case ComponentstorydiagramPackage.CONTROLLER_EXCHANGE_NODE__DEADLINE:
			case ComponentstorydiagramPackage.CONTROLLER_EXCHANGE_NODE__COMPONENT_STORY_PATTERN:
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
				(ComponentstorydiagramPackage.Literals.CONTROLLER_EXCHANGE_NODE__DEADLINE,
				 RealtimestatechartFactory.eINSTANCE.createRelativeDeadline()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentstorydiagramPackage.Literals.CONTROLLER_EXCHANGE_NODE__COMPONENT_STORY_PATTERN,
				 ComponentstorypatternFactory.eINSTANCE.createComponentStoryPattern()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ComponentStoryDiagramEditPlugin.INSTANCE;
	}

}
