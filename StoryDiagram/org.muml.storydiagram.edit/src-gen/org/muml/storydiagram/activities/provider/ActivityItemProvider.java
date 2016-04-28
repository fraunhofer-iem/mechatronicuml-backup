/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.storydiagram.activities.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.mumlcore.CorePackage;
import org.muml.storydiagram.activities.ActivitiesFactory;
import org.muml.storydiagram.activities.ActivitiesPackage;
import org.muml.storydiagram.activities.Activity;
import org.muml.storydiagram.calls.provider.CallableItemProvider;
import org.muml.storydiagram.provider.StorydiagramsEditPlugin;

/**
 * This is the item provider adapter for a {@link org.muml.storydiagram.activities.Activity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityItemProvider extends CallableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addPreconditionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_NamedElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature", "_UI_NamedElement_type"),
				 CorePackage.Literals.NAMED_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Precondition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreconditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Activity_precondition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Activity_precondition_feature", "_UI_Activity_type"),
				 ActivitiesPackage.Literals.ACTIVITY__PRECONDITION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns Activity.png.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(
				object,
				getResourceLocator().getImage(
						"elements/activities/Activity.png"));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return StorydiagramsEditPlugin.INSTANCE;
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ActivitiesPackage.Literals.ACTIVITY__OWNED_ACTIVITY_EDGES);
			childrenFeatures.add(ActivitiesPackage.Literals.ACTIVITY__OWNED_ACTIVITY_NODES);
			childrenFeatures.add(ActivitiesPackage.Literals.ACTIVITY__ANNOTATIONS);
		}
		return childrenFeatures;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Activity)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Activity_type") :
			getString("_UI_Activity_type") + " " + label;
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

		switch (notification.getFeatureID(Activity.class)) {
			case ActivitiesPackage.ACTIVITY__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_EDGES:
			case ActivitiesPackage.ACTIVITY__OWNED_ACTIVITY_NODES:
			case ActivitiesPackage.ACTIVITY__ANNOTATIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
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
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ActivitiesPackage.Literals.ACTIVITY__OWNED_ACTIVITY_EDGES,
				 ActivitiesFactory.eINSTANCE.createActivityEdge()));

		newChildDescriptors.add
			(createChildParameter
				(ActivitiesPackage.Literals.ACTIVITY__OWNED_ACTIVITY_NODES,
				 ActivitiesFactory.eINSTANCE.createMatchingStoryNode()));

		newChildDescriptors.add
			(createChildParameter
				(ActivitiesPackage.Literals.ACTIVITY__OWNED_ACTIVITY_NODES,
				 ActivitiesFactory.eINSTANCE.createStructuredNode()));

		newChildDescriptors.add
			(createChildParameter
				(ActivitiesPackage.Literals.ACTIVITY__OWNED_ACTIVITY_NODES,
				 ActivitiesFactory.eINSTANCE.createJunctionNode()));

		newChildDescriptors.add
			(createChildParameter
				(ActivitiesPackage.Literals.ACTIVITY__OWNED_ACTIVITY_NODES,
				 ActivitiesFactory.eINSTANCE.createInitialNode()));

		newChildDescriptors.add
			(createChildParameter
				(ActivitiesPackage.Literals.ACTIVITY__OWNED_ACTIVITY_NODES,
				 ActivitiesFactory.eINSTANCE.createStatementNode()));

		newChildDescriptors.add
			(createChildParameter
				(ActivitiesPackage.Literals.ACTIVITY__OWNED_ACTIVITY_NODES,
				 ActivitiesFactory.eINSTANCE.createActivityFinalNode()));

		newChildDescriptors.add
			(createChildParameter
				(ActivitiesPackage.Literals.ACTIVITY__OWNED_ACTIVITY_NODES,
				 ActivitiesFactory.eINSTANCE.createActivityCallNode()));

		newChildDescriptors.add
			(createChildParameter
				(ActivitiesPackage.Literals.ACTIVITY__OWNED_ACTIVITY_NODES,
				 ActivitiesFactory.eINSTANCE.createModifyingStoryNode()));

		newChildDescriptors.add
			(createChildParameter
				(ActivitiesPackage.Literals.ACTIVITY__OWNED_ACTIVITY_NODES,
				 ActivitiesFactory.eINSTANCE.createFlowFinalNode()));

		newChildDescriptors.add
			(createChildParameter
				(ActivitiesPackage.Literals.ACTIVITY__ANNOTATIONS,
				 EcoreFactory.eINSTANCE.createEAnnotation()));
	}

}
