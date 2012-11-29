/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.component.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.storydriven.core.CorePackage;
import org.storydriven.core.provider.ExtendableElementItemProvider;
import org.storydriven.storydiagrams.activities.ActivitiesFactory;
import org.storydriven.storydiagrams.calls.CallsFactory;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.component.ConnectorType;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.muml.model.component.ConnectorType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectorTypeItemProvider
	extends ExtendableElementItemProvider
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
	public ConnectorTypeItemProvider(AdapterFactory adapterFactory) {
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

			addFromPortPropertyDescriptor(object);
			addToPortPropertyDescriptor(object);
			addParentComponentPropertyDescriptor(object);
			addToDiscretePortPropertyDescriptor(object);
			addFromDiscretePortPropertyDescriptor(object);
			addToContinuousPortPropertyDescriptor(object);
			addFromContinuousPortPropertyDescriptor(object);
			addToHybridPortPropertyDescriptor(object);
			addFromHybridPortPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the From Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectorType_fromPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorType_fromPort_feature", "_UI_ConnectorType_type"),
				 ComponentPackage.Literals.CONNECTOR_TYPE__FROM_PORT,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_ConnectedPortsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the To Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectorType_toPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorType_toPort_feature", "_UI_ConnectorType_type"),
				 ComponentPackage.Literals.CONNECTOR_TYPE__TO_PORT,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_ConnectedPortsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectorType_parentComponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorType_parentComponent_feature", "_UI_ConnectorType_type"),
				 ComponentPackage.Literals.CONNECTOR_TYPE__PARENT_COMPONENT,
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_ParentPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the To Discrete Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToDiscretePortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectorType_toDiscretePort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorType_toDiscretePort_feature", "_UI_ConnectorType_type"),
				 ComponentPackage.Literals.CONNECTOR_TYPE__TO_DISCRETE_PORT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the From Discrete Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromDiscretePortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectorType_fromDiscretePort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorType_fromDiscretePort_feature", "_UI_ConnectorType_type"),
				 ComponentPackage.Literals.CONNECTOR_TYPE__FROM_DISCRETE_PORT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the To Continuous Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToContinuousPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectorType_toContinuousPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorType_toContinuousPort_feature", "_UI_ConnectorType_type"),
				 ComponentPackage.Literals.CONNECTOR_TYPE__TO_CONTINUOUS_PORT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the From Continuous Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromContinuousPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectorType_fromContinuousPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorType_fromContinuousPort_feature", "_UI_ConnectorType_type"),
				 ComponentPackage.Literals.CONNECTOR_TYPE__FROM_CONTINUOUS_PORT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the To Hybrid Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToHybridPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectorType_toHybridPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorType_toHybridPort_feature", "_UI_ConnectorType_type"),
				 ComponentPackage.Literals.CONNECTOR_TYPE__TO_HYBRID_PORT,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the From Hybrid Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromHybridPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConnectorType_fromHybridPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConnectorType_fromHybridPort_feature", "_UI_ConnectorType_type"),
				 ComponentPackage.Literals.CONNECTOR_TYPE__FROM_HYBRID_PORT,
				 false,
				 false,
				 false,
				 null,
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
		return getString("_UI_ConnectorType_type");
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

		switch (notification.getFeatureID(ConnectorType.class)) {
			case ComponentPackage.CONNECTOR_TYPE__TO_DISCRETE_PORT:
			case ComponentPackage.CONNECTOR_TYPE__FROM_DISCRETE_PORT:
			case ComponentPackage.CONNECTOR_TYPE__TO_CONTINUOUS_PORT:
			case ComponentPackage.CONNECTOR_TYPE__FROM_CONTINUOUS_PORT:
			case ComponentPackage.CONNECTOR_TYPE__TO_HYBRID_PORT:
			case ComponentPackage.CONNECTOR_TYPE__FROM_HYBRID_PORT:
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

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EXTENDABLE_ELEMENT__EXTENSION,
				 ActivitiesFactory.eINSTANCE.createOperationExtension()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.EXTENDABLE_ELEMENT__EXTENSION,
				 CallsFactory.eINSTANCE.createParameterExtension()));
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
