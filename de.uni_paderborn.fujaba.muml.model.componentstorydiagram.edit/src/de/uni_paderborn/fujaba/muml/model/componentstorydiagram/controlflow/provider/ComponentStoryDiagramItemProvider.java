/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.provider;


import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryDiagram;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowFactory;
import de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ControlflowPackage;

import de.uni_paderborn.fujaba.muml.model.core.CoreFactory;

import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage;

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
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.storydriven.storydiagrams.activities.ActivitiesPackage;

import org.storydriven.storydiagrams.activities.provider.ActivityItemProvider;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.model.componentstorydiagram.controlflow.ComponentStoryDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentStoryDiagramItemProvider
	extends ActivityItemProvider
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
	public ComponentStoryDiagramItemProvider(AdapterFactory adapterFactory) {
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

			addReturnParametersPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Return Parameters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReturnParametersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ReconfigurationRule_returnParameters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReconfigurationRule_returnParameters_feature", "_UI_ReconfigurationRule_type"),
				 ReconfigurationPackage.Literals.RECONFIGURATION_RULE__RETURN_PARAMETERS,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(ReconfigurationPackage.Literals.RECONFIGURATION_RULE__PARAMETERS);
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
	 * This returns ComponentStoryDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentStoryDiagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ComponentStoryDiagram)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ComponentStoryDiagram_type") :
			getString("_UI_ComponentStoryDiagram_type") + " " + label;
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

		switch (notification.getFeatureID(ComponentStoryDiagram.class)) {
			case ControlflowPackage.COMPONENT_STORY_DIAGRAM__PARAMETERS:
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
				(ActivitiesPackage.Literals.ACTIVITY__OWNED_ACTIVITY_NODE,
				 ControlflowFactory.eINSTANCE.createComponentStoryNode()));

		newChildDescriptors.add
			(createChildParameter
				(ActivitiesPackage.Literals.ACTIVITY__OWNED_ACTIVITY_NODE,
				 ControlflowFactory.eINSTANCE.createComponentStopNode()));

		newChildDescriptors.add
			(createChildParameter
				(ReconfigurationPackage.Literals.RECONFIGURATION_RULE__PARAMETERS,
				 CoreFactory.eINSTANCE.createParameter()));
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
