/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.realtimeStatechart.provider;


import de.uni_paderborn.fujaba.umlrt.model.behavior.BehaviorFactory;
import de.uni_paderborn.fujaba.umlrt.model.component.ComponentFactory;
import de.uni_paderborn.fujaba.umlrt.model.core.CorePackage;

import de.uni_paderborn.fujaba.umlrt.model.instance.InstanceFactory;
import de.uni_paderborn.fujaba.umlrt.model.msgiface.MsgifaceFactory;
import de.uni_paderborn.fujaba.umlrt.model.pattern.PatternFactory;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartFactory;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.provider.FujabaRealtimeStatechartItemProvider;
import de.uni_paderborn.fujaba.umlrt.model.core.provider.AbstractStatechartItemProvider;

import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechart;

import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechartFactory;
import de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechartPackage;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.storydriven.modeling.SDMPackage;
import org.storydriven.modeling.activities.ActivitiesFactory;
import org.storydriven.modeling.activities.expressions.ExpressionsFactory;
import org.storydriven.modeling.calls.CallsFactory;
import org.storydriven.modeling.patterns.PatternsFactory;
import org.storydriven.modeling.templates.TemplatesFactory;

/**
 * This is the item provider adapter for a {@link de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechart} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RealtimeStatechartItemProvider
	extends FujabaRealtimeStatechartItemProvider
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
	public RealtimeStatechartItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER);
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
	 * This returns RealtimeStatechart.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RealtimeStatechart"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RealtimeStatechart)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_RealtimeStatechart_type") :
			getString("_UI_RealtimeStatechart_type") + " " + label;
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

		switch (notification.getFeatureID(RealtimeStatechart.class)) {
			case RealtimeStatechartPackage.REALTIME_STATECHART__TMP_CONTAINER:
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
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 RealtimeStatechartFactory.eINSTANCE.createRealtimeStatechart()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 EcoreFactory.eINSTANCE.createEObject()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 ActivitiesFactory.eINSTANCE.createExceptionVariable()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 ActivitiesFactory.eINSTANCE.createActivityEdge()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 ActivitiesFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 ActivitiesFactory.eINSTANCE.createOperationExtension()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 ActivitiesFactory.eINSTANCE.createMatchingStoryNode()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 ActivitiesFactory.eINSTANCE.createStructuredNode()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 ActivitiesFactory.eINSTANCE.createJunctionNode()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 ActivitiesFactory.eINSTANCE.createStartNode()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 ActivitiesFactory.eINSTANCE.createStatementNode()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 ActivitiesFactory.eINSTANCE.createStopNode()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 ActivitiesFactory.eINSTANCE.createActivityCallNode()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 ActivitiesFactory.eINSTANCE.createModifyingStoryNode()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 ExpressionsFactory.eINSTANCE.createExceptionVariableExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE.createTextualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE.createNotExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE.createComparisonExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 org.storydriven.modeling.expressions.ExpressionsFactory.eINSTANCE.createBinaryLogicExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 CallsFactory.eINSTANCE.createParameterBinding()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 CallsFactory.eINSTANCE.createOpaqueCallable()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 CallsFactory.eINSTANCE.createParameterExtension()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 org.storydriven.modeling.calls.expressions.ExpressionsFactory.eINSTANCE.createMethodCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 org.storydriven.modeling.calls.expressions.ExpressionsFactory.eINSTANCE.createParameterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 PatternsFactory.eINSTANCE.createObjectVariable()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 PatternsFactory.eINSTANCE.createLinkConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 PatternsFactory.eINSTANCE.createObjectSetVariable()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 PatternsFactory.eINSTANCE.createPath()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 PatternsFactory.eINSTANCE.createLinkVariable()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 PatternsFactory.eINSTANCE.createContainmentRelation()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 PatternsFactory.eINSTANCE.createStoryPattern()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 PatternsFactory.eINSTANCE.createMatchingPattern()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 org.storydriven.modeling.patterns.expressions.ExpressionsFactory.eINSTANCE.createAttributeValueExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 org.storydriven.modeling.patterns.expressions.ExpressionsFactory.eINSTANCE.createObjectVariableExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 org.storydriven.modeling.patterns.expressions.ExpressionsFactory.eINSTANCE.createObjectSetSizeExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 TemplatesFactory.eINSTANCE.createTemplateBinding()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 TemplatesFactory.eINSTANCE.createPropertyBinding()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 BehaviorFactory.eINSTANCE.createProtocolStatechart()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 ComponentFactory.eINSTANCE.createContinuousComponent()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 ComponentFactory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 ComponentFactory.eINSTANCE.createComponentPart()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 ComponentFactory.eINSTANCE.createStructuredComponent()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 ComponentFactory.eINSTANCE.createAtomicComponent()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 InstanceFactory.eINSTANCE.createComponentInstance()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 InstanceFactory.eINSTANCE.createPortInstance()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 PatternFactory.eINSTANCE.createCoordinationPattern()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 PatternFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 RealtimestatechartFactory.eINSTANCE.createClock()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 RealtimestatechartFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 RealtimestatechartFactory.eINSTANCE.createInitialState()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 RealtimestatechartFactory.eINSTANCE.createFinalState()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 RealtimestatechartFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 RealtimestatechartFactory.eINSTANCE.createHistoryState()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 RealtimestatechartFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 RealtimestatechartFactory.eINSTANCE.createRealtimeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 RealtimestatechartFactory.eINSTANCE.createSynchronizationChannel()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 RealtimestatechartFactory.eINSTANCE.createSynchronization()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 RealtimestatechartFactory.eINSTANCE.createFujabaRealtimeStatechart()));

		newChildDescriptors.add
			(createChildParameter
				(RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER,
				 MsgifaceFactory.eINSTANCE.createMessageType()));
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
			childFeature == SDMPackage.Literals.EXTENDABLE_ELEMENT__EXTENSION ||
			childFeature == RealtimeStatechartPackage.Literals.REALTIME_STATECHART__TMP_CONTAINER ||
			childFeature == CorePackage.Literals.ABSTRACT_STATECHART__UML_REALTIME_START_STATE ||
			childFeature == CorePackage.Literals.ABSTRACT_STATECHART__VERTICES ||
			childFeature == CorePackage.Literals.ABSTRACT_STATECHART__UML_COMPLEX_REALTIME_STATE ||
			childFeature == CorePackage.Literals.ABSTRACT_STATECHART__TRANSITIONS ||
			childFeature == CorePackage.Literals.ABSTRACT_STATECHART__PROVIDED_MSG_IFACE ||
			childFeature == CorePackage.Literals.ABSTRACT_STATECHART__REQUIRED_MSG_IFACE ||
			childFeature == CorePackage.Literals.ABSTRACT_STATECHART__CLOCKS;

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
		return RealtimeStatechartEditPlugin.INSTANCE;
	}

}
