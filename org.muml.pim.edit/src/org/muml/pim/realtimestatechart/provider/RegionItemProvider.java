/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.realtimestatechart.provider;


import java.util.ArrayList;
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
import org.muml.core.provider.CommentableElementItemProvider;
import org.muml.pim.provider.MumlEditPlugin;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.RealtimestatechartFactory;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.Region;
import org.muml.pim.realtimestatechart.State;

/**
 * This is the item provider adapter for a {@link org.muml.pim.realtimestatechart.Region} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RegionItemProvider
	extends CommentableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionItemProvider(AdapterFactory adapterFactory) {
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

			addEmbeddedStatechartPropertyDescriptor(object);
			addParentStatePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Embedded Statechart feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmbeddedStatechartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Region_embeddedStatechart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Region_embeddedStatechart_feature", "_UI_Region_type"),
				 RealtimestatechartPackage.Literals.REGION__EMBEDDED_STATECHART,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Statechart feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addStatechartPropertyDescriptor(Object object) {
		ItemPropertyDescriptor statechartPropertyDescriptor = new ItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Region_statechart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Region_statechart_feature", "_UI_Region_type"),
				 RealtimestatechartPackage.Literals.REGION__EMBEDDED_STATECHART,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null) {

			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				Collection<?> choices = super.getChoiceOfValues(object);
				
				Region region = (Region) object;

				if (region != null && region.getParentState() != null
						&& region.getParentState().getParentStatechart() != null) {

					State parentState = region.getParentState();

					RealtimeStatechart parentStatechart = parentState
							.getParentStatechart();

					List<Object> invalidChoices = new ArrayList<Object>();
					for (Object choice : choices) {
						if (choice == null) {
							continue;
						}
						RealtimeStatechart rtsc = (RealtimeStatechart) choice;
						if (rtsc.isSuperStatechartOf(parentStatechart)) {
							invalidChoices.add(choice);
						}
					}
					choices.removeAll(invalidChoices);
				}
				return choices;
			}

		};
		
		itemPropertyDescriptors.add(statechartPropertyDescriptor);
	}

	/**
	 * This adds a property descriptor for the Parent State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Region_parentState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Region_parentState_feature", "_UI_Region_type"),
				 RealtimestatechartPackage.Literals.REGION__PARENT_STATE,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Region_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Region_name_feature", "_UI_Region_type"),
				 RealtimestatechartPackage.Literals.REGION__NAME,
				 false,
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
			childrenFeatures.add(RealtimestatechartPackage.Literals.REGION__EMBEDDED_STATECHART);
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
	 * This returns Region.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Region"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Region)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Region_type") :
			getString("_UI_Region_type") + " " + label;
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

		switch (notification.getFeatureID(Region.class)) {
			case RealtimestatechartPackage.REGION__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RealtimestatechartPackage.REGION__EMBEDDED_STATECHART:
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
				(RealtimestatechartPackage.Literals.REGION__EMBEDDED_STATECHART,
				 RealtimestatechartFactory.eINSTANCE.createRealtimeStatechart()));
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
