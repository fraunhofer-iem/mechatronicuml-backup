/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.provider;


import de.uni_paderborn.fujaba.umlrt.model.behavior.provider.UmlrtEditPlugin;

import de.uni_paderborn.fujaba.umlrt.model.msgiface.MsgifaceFactory;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.HelperFactory;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.helper.HelperPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.storydriven.modeling.SDMPackage;

import org.storydriven.modeling.provider.NamedElementItemProvider;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UMLRealtimeStatechartItemProvider
	extends NamedElementItemProvider
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
	public UMLRealtimeStatechartItemProvider(AdapterFactory adapterFactory) {
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

			addCommentPropertyDescriptor(object);
			addEventQueueSizePropertyDescriptor(object);
			addWcetDocumentPropertyDescriptor(object);
			addSecurityLevelPropertyDescriptor(object);
			addSystemWcetMapPropertyDescriptor(object);
			addUtilisationPropertyDescriptor(object);
			addScheduleDocumentPropertyDescriptor(object);
			addBehavioralElementPropertyDescriptor(object);
			addIsEmbeddedPropertyDescriptor(object);
			addUMLClocksPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommentableElement_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommentableElement_comment_feature", "_UI_CommentableElement_type"),
				 SDMPackage.Literals.COMMENTABLE_ELEMENT__COMMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Event Queue Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventQueueSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UMLRealtimeStatechart_eventQueueSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeStatechart_eventQueueSize_feature", "_UI_UMLRealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__EVENT_QUEUE_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wcet Document feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWcetDocumentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UMLRealtimeStatechart_wcetDocument_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeStatechart_wcetDocument_feature", "_UI_UMLRealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__WCET_DOCUMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Security Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UMLRealtimeStatechart_securityLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeStatechart_securityLevel_feature", "_UI_UMLRealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__SECURITY_LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the System Wcet Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSystemWcetMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UMLRealtimeStatechart_systemWcetMap_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeStatechart_systemWcetMap_feature", "_UI_UMLRealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__SYSTEM_WCET_MAP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Utilisation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUtilisationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UMLRealtimeStatechart_utilisation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeStatechart_utilisation_feature", "_UI_UMLRealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__UTILISATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schedule Document feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScheduleDocumentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UMLRealtimeStatechart_scheduleDocument_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeStatechart_scheduleDocument_feature", "_UI_UMLRealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__SCHEDULE_DOCUMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Behavioral Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBehavioralElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UMLRealtimeStatechart_behavioralElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeStatechart_behavioralElement_feature", "_UI_UMLRealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__BEHAVIORAL_ELEMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Embedded feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsEmbeddedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UMLRealtimeStatechart_isEmbedded_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeStatechart_isEmbedded_feature", "_UI_UMLRealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__IS_EMBEDDED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the UML Clocks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUMLClocksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UMLRealtimeStatechart_uMLClocks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UMLRealtimeStatechart_uMLClocks_feature", "_UI_UMLRealtimeStatechart_type"),
				 RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__UML_CLOCKS,
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
			childrenFeatures.add(RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__UML_REALTIME_START_STATE);
			childrenFeatures.add(RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__UML_COMPLEX_REALTIME_STATE);
			childrenFeatures.add(RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__UML_REALTIME_TRANSITIONS);
			childrenFeatures.add(RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__UML_REALTIME_STATES);
			childrenFeatures.add(RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__ECLASS);
			childrenFeatures.add(RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__UML_INTERFACE_STATECHART);
			childrenFeatures.add(RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__PROVIDED_MSG_IFACE);
			childrenFeatures.add(RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__REQUIRED_MSG_IFACE);
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
	 * This returns UMLRealtimeStatechart.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UMLRealtimeStatechart"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UMLRealtimeStatechart)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UMLRealtimeStatechart_type") :
			getString("_UI_UMLRealtimeStatechart_type") + " " + label;
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

		switch (notification.getFeatureID(UMLRealtimeStatechart.class)) {
			case RealtimestatechartPackage.UML_REALTIME_STATECHART__COMMENT:
			case RealtimestatechartPackage.UML_REALTIME_STATECHART__EVENT_QUEUE_SIZE:
			case RealtimestatechartPackage.UML_REALTIME_STATECHART__WCET_DOCUMENT:
			case RealtimestatechartPackage.UML_REALTIME_STATECHART__SECURITY_LEVEL:
			case RealtimestatechartPackage.UML_REALTIME_STATECHART__SYSTEM_WCET_MAP:
			case RealtimestatechartPackage.UML_REALTIME_STATECHART__UTILISATION:
			case RealtimestatechartPackage.UML_REALTIME_STATECHART__SCHEDULE_DOCUMENT:
			case RealtimestatechartPackage.UML_REALTIME_STATECHART__IS_EMBEDDED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RealtimestatechartPackage.UML_REALTIME_STATECHART__UML_REALTIME_START_STATE:
			case RealtimestatechartPackage.UML_REALTIME_STATECHART__UML_COMPLEX_REALTIME_STATE:
			case RealtimestatechartPackage.UML_REALTIME_STATECHART__UML_REALTIME_TRANSITIONS:
			case RealtimestatechartPackage.UML_REALTIME_STATECHART__UML_REALTIME_STATES:
			case RealtimestatechartPackage.UML_REALTIME_STATECHART__ECLASS:
			case RealtimestatechartPackage.UML_REALTIME_STATECHART__UML_INTERFACE_STATECHART:
			case RealtimestatechartPackage.UML_REALTIME_STATECHART__PROVIDED_MSG_IFACE:
			case RealtimestatechartPackage.UML_REALTIME_STATECHART__REQUIRED_MSG_IFACE:
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
				(RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__UML_REALTIME_START_STATE,
				 RealtimestatechartFactory.eINSTANCE.createUMLRealtimeStartState()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__UML_COMPLEX_REALTIME_STATE,
				 RealtimestatechartFactory.eINSTANCE.createUMLRealtimeCompositeState()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__UML_REALTIME_TRANSITIONS,
				 RealtimestatechartFactory.eINSTANCE.createUMLRealtimeTransition()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__UML_REALTIME_STATES,
				 RealtimestatechartFactory.eINSTANCE.createUMLRealtimeCompositeState()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__UML_REALTIME_STATES,
				 RealtimestatechartFactory.eINSTANCE.createUMLRealtimeStartState()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__UML_REALTIME_STATES,
				 RealtimestatechartFactory.eINSTANCE.createUMLRealtimeStopState()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__UML_REALTIME_STATES,
				 RealtimestatechartFactory.eINSTANCE.createHistoryState()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__ECLASS,
				 MsgifaceFactory.eINSTANCE.createMessageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__ECLASS,
				 EcoreFactory.eINSTANCE.createEClass()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__UML_INTERFACE_STATECHART,
				 RealtimestatechartFactory.eINSTANCE.createUMLInterfaceStatechart()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__PROVIDED_MSG_IFACE,
				 HelperFactory.eINSTANCE.create(HelperPackage.Literals.STRING_TO_ECLASS)));

		newChildDescriptors.add
			(createChildParameter
				(RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__REQUIRED_MSG_IFACE,
				 HelperFactory.eINSTANCE.create(HelperPackage.Literals.STRING_TO_ECLASS)));
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
			childFeature == RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__UML_REALTIME_START_STATE ||
			childFeature == RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__UML_REALTIME_STATES ||
			childFeature == RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__UML_COMPLEX_REALTIME_STATE ||
			childFeature == RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__PROVIDED_MSG_IFACE ||
			childFeature == RealtimestatechartPackage.Literals.UML_REALTIME_STATECHART__REQUIRED_MSG_IFACE;

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
		return UmlrtEditPlugin.INSTANCE;
	}

}
