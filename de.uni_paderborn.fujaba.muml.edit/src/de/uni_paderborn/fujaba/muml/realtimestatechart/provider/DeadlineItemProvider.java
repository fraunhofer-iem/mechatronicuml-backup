/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.realtimestatechart.provider;


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

import de.uni_paderborn.fujaba.common.descriptor.DefaultChainedPropertyDescriptor;
import de.uni_paderborn.fujaba.common.descriptor.IChainedPropertyDescriptor;
import de.uni_paderborn.fujaba.muml.component.provider.MumlEditPlugin;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Deadline;
import de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.muml.realtimestatechart.descriptor.EnumerationPropertyDescriptor;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypeFactory;
import de.uni_paderborn.fujaba.muml.valuetype.ValuetypePackage;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.realtimestatechart.Deadline} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DeadlineItemProvider
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
	public DeadlineItemProvider(AdapterFactory adapterFactory) {
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

			addUpperBoundPropertyDescriptor(object);
			addLowerBoundPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Upper Bound feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addUpperBoundPropertyDescriptor(Object object) {
		IChainedPropertyDescriptor rootPropertyDescriptor = new DefaultChainedPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Deadline_upperBound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Deadline_upperBound_feature", "_UI_Deadline_type"),
				 RealtimestatechartPackage.Literals.DEADLINE__UPPER_BOUND,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null);
		
		itemPropertyDescriptors.add
			(new DefaultChainedPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeValue_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeValue_value_feature", "_UI_TimeValue_type"),
				 ValuetypePackage.Literals.TIME_VALUE__VALUE,
				 true,
				 false,
				 false,
				 null,
				 "Upper Bound",
				 null,
				 rootPropertyDescriptor));
	
		itemPropertyDescriptors.add
			(new EnumerationPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeValue_unit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeValue_unit_feature", "_UI_TimeValue_type"),
				 ValuetypePackage.Literals.TIME_VALUE__UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 "Upper Bound",
				 null,
				 rootPropertyDescriptor));
	}

	/**
	 * This adds a property descriptor for the Lower Bound feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addLowerBoundPropertyDescriptor(Object object) {
		IChainedPropertyDescriptor rootPropertyDescriptor = new DefaultChainedPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Deadline_lowerBound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Deadline_lowerBound_feature", "_UI_Deadline_type"),
				 RealtimestatechartPackage.Literals.DEADLINE__LOWER_BOUND,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null);
	
		itemPropertyDescriptors.add
			(new DefaultChainedPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeValue_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeValue_value_feature", "_UI_TimeValue_type"),
				 ValuetypePackage.Literals.TIME_VALUE__VALUE,
				 true,
				 false,
				 false,
				 null,
				 "Lower Bound",
				 null,
				 rootPropertyDescriptor));
	
		itemPropertyDescriptors.add
			(new EnumerationPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeValue_unit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeValue_unit_feature", "_UI_TimeValue_type"),
				 ValuetypePackage.Literals.TIME_VALUE__UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 "Lower Bound",
				 null,
				 rootPropertyDescriptor));
		
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
			childrenFeatures.add(RealtimestatechartPackage.Literals.DEADLINE__UPPER_BOUND);
			childrenFeatures.add(RealtimestatechartPackage.Literals.DEADLINE__LOWER_BOUND);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Deadline_type");
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

		switch (notification.getFeatureID(Deadline.class)) {
			case RealtimestatechartPackage.DEADLINE__UPPER_BOUND:
			case RealtimestatechartPackage.DEADLINE__LOWER_BOUND:
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
				(RealtimestatechartPackage.Literals.DEADLINE__UPPER_BOUND,
				 ValuetypeFactory.eINSTANCE.createTimeValue()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.DEADLINE__LOWER_BOUND,
				 ValuetypeFactory.eINSTANCE.createTimeValue()));
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
			childFeature == RealtimestatechartPackage.Literals.DEADLINE__UPPER_BOUND ||
			childFeature == RealtimestatechartPackage.Literals.DEADLINE__LOWER_BOUND;

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
		return MumlEditPlugin.INSTANCE;
	}

}
